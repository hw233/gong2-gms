package com.hadoit.game.fsgame.gms.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.dao.ServerInfoDao;
import com.hadoit.game.fsgame.gms.meta.OprGroup;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;

@Transactional
@Component("serverInfoService")
public class ServerInfoService {

	@Autowired
	private ServerInfoDao serverInfoDao;

	@Autowired
	private OprGroupService oprGroupService;

	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;

	public ServerInfo getServerInfoByServerId(int serverId, String oprGroup) {
		return serverInfoDao.getObjectByCondition("serverId=? and oprGroup=?", serverId, oprGroup);
	}

	public ServerInfo getServerInfo(long id) {
		return serverInfoDao.getServerInfo(id);
	}

	public ServerInfo getServerInfoForUpdate(long id) {
		return serverInfoDao.getForUpdateById(id);
	}

	public int getAllServerCount() {
		return serverInfoDao.getAllServerCount();
	}

	public List<ServerInfo> getAllServer(int limit, int offset) {
		return serverInfoDao.getAllServer(limit, offset);
	}
	
	public List<ServerInfo> getAllServer(String oprgroup,int limit, int offset) {
		return serverInfoDao.getAllServer(oprgroup,limit, offset);
	}

	public List<ServerInfo> getAllServer(boolean ignoreDup) {
		List<ServerInfo> all = serverInfoDao.getAll();
		if (ignoreDup) {
			all = getDistinctSrvs(all);
		}
		return all;
	}

	public List<ServerInfo> getAllOrderedServer(boolean ignoreDup) {
		List<ServerInfo> all = serverInfoDao.getListByFullCondition("1 = 1 order by oprGroup, serverId");
		if (ignoreDup) {
			all = getDistinctSrvs(all);
		}
		return all;
	}

	public List<ServerInfo> getDistinctSrvs(List<ServerInfo> sis) {
		if (CollectionUtils.isEmpty(sis)) {
			return Collections.emptyList();
		}
		List<ServerInfo> ret = new ArrayList<ServerInfo>();
		for (final ServerInfo s : sis) {
			boolean exist = CollectionUtils.exists(ret, new Predicate() {
				@Override
				public boolean evaluate(Object object) {
					ServerInfo o = (ServerInfo) object;
					return o.getAdminPort() == s.getAdminPort() && o.getAdminIp().equals(s.getAdminIp());
				}
			});
			if (!exist) {
				ret.add(s);
			}
		}
		return ret;
	}

	public ServerInfo getOneServer() {
		ServerInfo si = serverInfoDao.getObjectByCondition("oprGroup=? order by createTime limit 1", "ios");
		if (si != null) {
			return si;
		}
		return serverInfoDao.getObjectByCondition("1=1 order by createTime limit 1");
	}

	public boolean addServer(ServerInfo serverInfo) {
		ServerInfo si = serverInfoDao.getServerBy(serverInfo.getServerId(), serverInfo.getOprGroup());
		if (si != null) {
			return false;
		}
		serverInfoDao.addServer(serverInfo);
		return true;
	}

	public void updateServerState(int serverId, String oprGroup, int state) {
		serverInfoDao.updateServerState(serverId, oprGroup, state);
	}

	public ServerInfo deleteServer(long id) {
		ServerInfo si = getServerInfo(id);
		serverInfoDao.deleteById(id);
		return si;
	}

	public void updateServer(ServerInfo serverInfo) {
		serverInfoDao.updateObject(serverInfo);
	}

	public boolean updateOprMatchStr(String oprGroup, String oprMatchStr) {
		serverInfoDao.updateColumnValueByCondition("oprGroup = ?", "oprMatchStr", oprMatchStr, oprGroup);
		String ret = loginXmlRpcClientService.updateOprMatchStr(oprGroup, oprMatchStr);
		if ("SUCCESS".equalsIgnoreCase(ret)) {
			return true;
		}
		return false;
	}

	public Map<String, List<ServerInfo>> getServerMap() {
		List<ServerInfo> siList = getAllServer(false);
		Map<String, List<ServerInfo>> ret = new HashMap<String, List<ServerInfo>>();
		for (ServerInfo si : siList) {
			OprGroup og = oprGroupService.getOprGroup(si.getOprGroup());
			si.setOprGroupName(og.getName());
			if (!ret.containsKey(si.getOprGroup())) {
				ret.put(si.getOprGroup(), new ArrayList<ServerInfo>());
			}
			ret.get(si.getOprGroup()).add(si);
		}
		return ret;
	}

	public List<ServerInfo> getServerByOprGroup(String oprGroup, boolean ignoreDup) {
		List<ServerInfo> all = serverInfoDao.getServerByOprGroup(oprGroup);
		if (ignoreDup) {
			all = getDistinctSrvs(all);
		}
		return all;
	}
}
