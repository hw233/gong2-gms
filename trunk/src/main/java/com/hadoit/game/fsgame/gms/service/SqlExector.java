package com.hadoit.game.fsgame.gms.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.reflect.TypeToken;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.dao.OprGroupDao;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Component("sqlExector")
public class SqlExector {

	@Autowired
	private GasService gasService;
	
	@Autowired
	private OprGroupService oprGroupService;

	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;
	
	@Autowired
	private OprGroupDao oprGroupDao;

	static interface InnerExector {
		public int executeUpdate(int serverId, String oprGroup, String serverType, String sql);

		public Object queryForList(int srvId, String oprGroup, String serverType, String sql);

		public Pair<Boolean, String> checkQry(int serverId, String oprGroup, String serverType, String sql);
	}

	private Map<String, InnerExector> exectorMap = new HashMap<String, InnerExector>();

	@PostConstruct
	void init() {
		exectorMap.put("game", new InnerExector() {
			@Override
			public int executeUpdate(int serverId, String oprGroup, String serverType, String sql) {
				return gasService.executeUpdate(serverId, oprGroup, sql, new Object[0]);
			}

			@Override
			public Object queryForList(int srvId, String oprGroup, String serverType, String sql) {
				return gasService.queryForList(new TypeToken<List<Map<String, Object>>>() {
				}.getType(), srvId, oprGroup, sql, new Object[0]);
			}

			@Override
			public Pair<Boolean, String> checkQry(int serverId, String oprGroup, String serverType, String sql) {
				if (StringUtils.isBlank(oprGroup) || serverId <= 0) {
					return Pair.newInstance(false, "Read command must selected oprGroup and serverId!");
				}
				return Pair.newInstance(true, null);
			}
		});

		exectorMap.put("login", new InnerExector() {
			@Override
			public int executeUpdate(int serverId, String oprGroup, String serverType, String sql) {
				return loginXmlRpcClientService.executeUpdate(oprGroup, sql);
			}

			@Override
			public Object queryForList(int srvId, String oprGroup, String serverType, String sql) {
				return loginXmlRpcClientService.queryForList(oprGroup, sql);
			}

			@Override
			public Pair<Boolean, String> checkQry(int serverId, String oprGroup, String serverType, String sql) {
				if (StringUtils.isBlank(oprGroup)) {
					return Pair.newInstance(false, "Read command must selected oprGroup!");
				}
				return Pair.newInstance(true, null);
			}
		});

		exectorMap.put("global", new InnerExector() {
			@Override
			public int executeUpdate(int serverId, String oprGroup, String serverType, String sql) {
				return gasService.executeUpdateToGlobal(serverId, oprGroup, sql, new Object[0]);
			}

			@Override
			public Object queryForList(int srvId, String oprGroup, String serverType, String sql) {
				return gasService.queryForListToGlobal(new TypeToken<List<Map<String, Object>>>() {
				}.getType(), srvId, oprGroup, sql, new Object[0]);
			}

			@Override
			public Pair<Boolean, String> checkQry(int serverId, String oprGroup, String serverType, String sql) {
				if (StringUtils.isBlank(oprGroup)) {
					return Pair.newInstance(false, "Read command must selected oprGroup!");
				}
				return Pair.newInstance(true, null);
			}
		});
		
		
		exectorMap.put("logdb", new InnerExector() {
			@Override
			public int executeUpdate(int serverId, String oprGroup, String serverType, String sql) {
				return oprGroupService.getOnlineLogDao(oprGroup).update(sql);
			}

			@Override
			public Object queryForList(int srvId, String oprGroup, String serverType, String sql) {
				return oprGroupService.getOnlineLogDao(oprGroup).getCommonJdbcTemplate().queryForList(sql);
			}

			@Override
			public Pair<Boolean, String> checkQry(int serverId, String oprGroup, String serverType, String sql) {
				if (StringUtils.isBlank(oprGroup)) {
					return Pair.newInstance(false, "Read command must selected oprGroup!");
				}
				return Pair.newInstance(true, null);
			}
		});
		
		
		exectorMap.put("gms", new InnerExector() {
			@Override
			public int executeUpdate(int serverId, String oprGroup, String serverType, String sql) {
				return oprGroupDao.update(sql);
			}

			@Override
			public Object queryForList(int srvId, String oprGroup, String serverType, String sql) {
				return oprGroupDao.getCommonJdbcTemplate().queryForList(sql);
			}

			@Override
			public Pair<Boolean, String> checkQry(int serverId, String oprGroup, String serverType, String sql) {
				return Pair.newInstance(true, null);
			}
		});
	}

	public Map<String, Object> executeSql(int serverId, String oprGroup, String serverType, String sql) {
		sql = StringUtils.trimToEmpty(sql);
		Map<String, Object> ret = new HashMap<String, Object>();
		String adminPrefix = "##";
		InnerExector exe = exectorMap.get(serverType);
		if (exe == null) {
			return null;
		}

		if (FsGameGmsUtils.startsWithAny(sql, new String[] { adminPrefix + "update", adminPrefix + "delete",
				adminPrefix + "insert", adminPrefix + "set", adminPrefix + "create", adminPrefix + "drop",
				adminPrefix + "grant", adminPrefix + "alter" })) {
			sql = sql.substring(2);
			int rows = exe.executeUpdate(serverId, oprGroup, serverType, sql);
			ret.put("datas", Arrays.asList(Collections.singletonMap("effect rows", rows)));
		} else if (FsGameGmsUtils.startsWithAny(sql, new String[] { "select", "show", "call" })) {
			Pair<Boolean, String> r = exe.checkQry(serverId, oprGroup, serverType, sql);
			if (!r.getFirst()) {
				ret.put("datas", Arrays.asList(Collections.singletonMap("errors", r.getSecond())));
				return ret;
			}
			Object lls = exe.queryForList(serverId, oprGroup, serverType, sql);
			ret.put("datas", lls);
		} else {
			ret.put("datas", Arrays.asList(Collections.singletonMap("errors", "Sql not support or syntax error!")));
		}
		return ret;
	}
}
