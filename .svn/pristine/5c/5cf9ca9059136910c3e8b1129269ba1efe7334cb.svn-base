package com.hadoit.game.fsgame.gms.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.engine.core.protocol.json.GsonFactory;
import com.hadoit.game.fsgame.gms.meta.ItemInfo;
import com.hadoit.game.fsgame.gms.meta.PlayBuild;
import com.hadoit.game.fsgame.gms.meta.PlayMessage;
import com.hadoit.game.fsgame.gms.meta.PlayerInfo;
import com.hadoit.game.fsgame.gms.meta.RunScriptResult;
import com.hadoit.game.fsgame.gms.meta.ServerConfig;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.net.GasAdminClientManager;
import com.hadoit.game.fsgame.gms.net.RpcClientData;
import com.hadoit.game.fsgame.gms.utils.FsGameGasRpcConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Component("gasService")
public class GasService {

	@Autowired
	private GasAdminClientManager gasAdminClientManager;

	@Autowired
	private ServerInfoService serverInfoService;

	private Object doInvokeRpc(int srvId, String oprGroup, String op, Object... params) {
		RpcClientData rcd = gasAdminClientManager.getSimpleRpcClient(srvId, oprGroup);
		if (rcd == null) {
			LoggerUtils.warn("Gas server not exists! id=" + srvId + ", op=" + op);
			return null;
		}
		if (!rcd.getSimpleRpcClient().isConnected()) {
			LoggerUtils.warn("Gas server is not connected! id=" + srvId + ", op=" + op);
			return null;
		}
		Future<Object> f = rcd.getSimpleRpcClient().invokeRpc(op, params);
		Object r;
		try {
			r = f.get();
		} catch (Exception e) {
			r = null;
			LoggerUtils.error(e);
		}
		return r;
	}

	private Object invokeRpcWithCheck(int srvId, String oprGroup, String op, Object... params) {
		if (srvId > 0 && StringUtils.isNotBlank(oprGroup)) {
			return doInvokeRpc(srvId, oprGroup, op, params);
		} else {
			List<ServerInfo> sis;
			Object r = null;
			if (StringUtils.isNotBlank(oprGroup)) {
				// 非全渠道
				sis = new ArrayList<ServerInfo>();
				String[] ogs = StringUtils.splitByWholeSeparator(oprGroup, "+");
				for (String og : ogs) {
					og = StringUtils.trim(og);
					sis.addAll(serverInfoService.getServerByOprGroup(og, true));
				}
			} else {
				// 全渠道
				sis = serverInfoService.getAllServer(true);
			}
			for (ServerInfo si : sis) {
				r = doInvokeRpc(si.getServerId(), si.getOprGroup(), op, params);
			}
			return r;
		}
	}

	public void handshake(int srvId, String oprGroup) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_HANDSHAKE);
	}

	/**
	 * 踢除
	 */
	public void kickOut(int srvId, String oprGroup, String avatarId) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_KICK_OUT, avatarId);
	}

	/**
	 * 封号
	 */
	public void forbidAccount(int srvId, String oprGroup, String userId, long dbId, long time) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_FORBID_ACCOUNT, userId, dbId, time);
	}

	/**
	 * 解封帐号
	 */
	public void activeAccount(int srvId, String oprGroup, String userId, long dbId) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_ACTIVE_ACCOUNT, userId, dbId);
	}

	/**
	 * 禁言
	 */
	public void stopChat(int srvId, String oprGroup, String userId, long time) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_STOP_CHAT, userId, time);
	}

	/**
	 * 解除禁言
	 */
	public void openChat(int srvId, String oprGroup, String userId) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_OPEN_CHAT, userId);
	}

	/**
	 * 重置引导
	 */
	public void resetGuide(int srvId, String oprGroup, String userId, long dbId) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_RESET_GUIDE, userId, dbId);
	}

	public ServerConfig getServerConfig(int srvId, String oprGroup) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_SERVER_CONFIG);
		if (r == null) {
			return null;
		}
		return GsonFactory.getDefault().fromJson(((JsonObject) r).get("result"), ServerConfig.class);
	}

	/**
	 * 设置最高在线
	 * 
	 * @param srvId
	 * @param mo
	 */
	public void changeMaxOnline(int srvId, String oprGroup, int mo) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_MAX_ONLINE, mo);
	}

	/**
	 * 开服
	 * 
	 * @param srvId
	 * @param mo
	 */
	public void openSrv(int srvId, String oprGroup) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_OPEN_SERVER);
	}

	/**
	 * 关服
	 * 
	 * @param srvId
	 * @param mo
	 */
	public void closeSrv(int srvId, String oprGroup) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_CLOSE_SERVER);
	}

	/**
	 * 停服
	 * 
	 * @param srvId
	 * @param mo
	 */
	public void stopSrv(int srvId, String oprGroup) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_STOP_SERVER);
	}

	/**
	 * 刷新数据
	 * 
	 * @param srvId
	 * @param mo
	 */
	public void flushData(int srvId, String oprGroup) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_FLUSH_DATA);
	}

	/**
	 * 执行脚本
	 * 
	 * @param srvId
	 * @param script
	 */
	public RunScriptResult runScript(int srvId, String oprGroup, String script) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_RUN_SCRIPT, script);
		if (r == null || !(r instanceof JsonObject)) {
			return null;
		}
		return GsonFactory.getDefault().fromJson(((JsonObject) r).get("result"), RunScriptResult.class);
	}

	/**
	 * 更新转盘次数
	 * 
	 * @param srvId
	 * @param script
	 */
	public void zhuanpanedit(int srvId, String oprGroup, String userId, long dbId, String zhuanPanCZ,
			String zhuanPanXF) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_ZHUANPAN_EDIT, userId, dbId, zhuanPanCZ,
				zhuanPanXF);
	}

	/**
	 * 更新玩家信息
	 * 
	 * @param srvId
	 * @param script
	 */
	public void Mplayinfo(int srvId, String oprGroup, String userId, long dbId, int lv, String roleName, int vipLv,
			long exp, long money, long gold,long freeGold) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_MPLAYINFO, userId, dbId, lv, roleName, vipLv,
				exp, money, gold,freeGold);
	}

	/**
	 * 搜索玩家
	 * 
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public List<PlayerInfo> searchPlayerList(int srvId, String oprGroup, String accountName, String userName) {
		// 搜索不翻页
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_SEARCH_PLAYER_LIST, accountName,
				userName);
		if (r == null) {
			return Collections.emptyList();
		}
		JsonArray ja = (((JsonObject) r).get("result")).getAsJsonArray();
		List<PlayerInfo> rs = GsonFactory.getDefault().fromJson(ja.get(0), new TypeToken<List<PlayerInfo>>() {
		}.getType());
		return rs;
	}

	/**
	 * 搜索玩家物品信息
	 * 
	 * @author liangbo
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public List<ItemInfo> searchItemList(int srvId, String oprGroup, String userId, long dbId) {
		// 搜索不翻页
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_MPLAYITEM, userId, dbId);
		if (r == null) {
			return Collections.emptyList();
		}
		JsonArray ja = (((JsonObject) r).get("result")).getAsJsonArray();
		List<ItemInfo> rs = GsonFactory.getDefault().fromJson(ja.get(0), new TypeToken<List<ItemInfo>>() {
		}.getType());
		return rs;
	}

	/**
	 * 删除玩家物品信息
	 * 
	 * @author liangbo
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public void delItemList(int srvId, String oprGroup, String uid, String itemid, int dbID) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_DPLAYITEM, uid, itemid, dbID);
	}
    
	/**
	 * 搜索玩家邮件信息
	 * 
	 * @author liangbo
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public List<PlayMessage> searchMessageList(int srvId, String oprGroup, String userId, long dbId) {
		// 搜索不翻页
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_MPLAYMESSAGE, userId, dbId);
		if (r == null) {
			return Collections.emptyList();
		}
		JsonArray ja = (((JsonObject) r).get("result")).getAsJsonArray();
		List<PlayMessage> rs = GsonFactory.getDefault().fromJson(ja.get(0), new TypeToken<List<PlayMessage>>() {
		}.getType());
		return rs;
	}

	/**
	 * 删除玩家邮件信息
	 * 
	 * @author liangbo
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public void delMessageList(int srvId, String oprGroup, String uid, long messageid, int dbID) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_DPLAYMESSAGE, uid, messageid, dbID);
	}
	/**
	 * 搜索玩家建筑信息
	 * 
	 * @author liangbo
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public List<PlayBuild> searchBuildList(int srvId, String oprGroup, String userId, long dbId) {
		// 搜索不翻页
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_DPLAYBUILD, userId, dbId);
		if (r == null) {
			return Collections.emptyList();
		}
		JsonArray ja = (((JsonObject) r).get("result")).getAsJsonArray();
		List<PlayBuild> rs = GsonFactory.getDefault().fromJson(ja.get(0), new TypeToken<List<PlayBuild>>() {
		}.getType());
		return rs;
	}

	/**
	 * 删除玩家建筑信息
	 * 
	 * @author liangbo
	 * @param srvId
	 * @param accountName
	 * @param userName
	 * @return
	 */
	public void delBuildList(int srvId, String oprGroup, String uid, String buildid, int dbID) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_DELPLAYBUILD, uid, buildid, dbID);
	}
	/**
	 * 分页取玩家
	 */
	public Pair<Integer, List<PlayerInfo>> getPlayerList(int srvId, String oprGroup, int vipLv, int limit, int offset) {
		Object r = new Object();
		if (vipLv == 99) {
			r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_GET_PLAYER_LIST,limit, offset);
		} else {

			r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_GET_PLAYER_LIST_VIP, vipLv, limit, offset);
		}

		if (r == null) {
			return null;
		}
		JsonArray ja = (((JsonObject) r).get("result")).getAsJsonArray();
		int count = ja.get(0).getAsInt();
		List<PlayerInfo> rs = new ArrayList<PlayerInfo>();
		rs = GsonFactory.getDefault().fromJson(ja.get(1), new TypeToken<List<PlayerInfo>>() {
		}.getType());
		return Pair.newInstance(count, rs);
	}

	/**
	 * 分页取玩家
	 */
	public Pair<Integer, List<PlayerInfo>> getPlayerList(int srvId, String oprGroup, int limit, int offset) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_GET_PLAYER_LIST, limit, offset);
		if (r == null) {
			return null;
		}
		JsonArray ja = (((JsonObject) r).get("result")).getAsJsonArray();
		int count = ja.get(0).getAsInt();
		List<PlayerInfo> rs = GsonFactory.getDefault().fromJson(ja.get(1), new TypeToken<List<PlayerInfo>>() {
		}.getType());
		return Pair.newInstance(count, rs);
	}

	/**
	 * 发邮件
	 * 
	 * @param srvId
	 * @param recvs
	 * @param content
	 */
	public void sendMail(int srvId, String oprGroup, final List<String> recvs, String content) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_SEND_MAIL, recvs, content);
	}

	/**
	 * 发奖励
	 * 
	 * @param srvId
	 * @param recvs
	 * @param content
	 * @param itemIds
	 * @param itemCounts
	 * @param money
	 * @param gold
	 * @param leijiGold
	 */
	public void sendReward(int srvId, String oprGroup, final List<String> recvs, String content, List<Integer> itemIds,
			List<Integer> itemCounts, long money, long gold, long leijiGold) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_SEND_REWARD, recvs, content, itemIds,
				itemCounts, money, gold, leijiGold);
	}

	/**
	 * 通用查询接口
	 * 
	 * @param convertType
	 * @param srvId
	 * @param sql
	 * @param sqlParams
	 * @return
	 */
	public <T> List<T> queryForList(Type convertType, int srvId, String oprGroup, String sql, Object[] sqlParams) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_QUERY_FOR_LIST, sql, sqlParams);
		if (r == null || !(r instanceof JsonObject)) {
			return Collections.emptyList();
		}
		JsonObject rje = (JsonObject) r;
		JsonElement realResult = rje.get("result");
		if (realResult == null) {
			return Collections.emptyList();
		}
		List<T> rs = GsonFactory.getDefault().fromJson(realResult, convertType);
		return rs;
	}

	public int executeUpdate(int srvId, String oprGroup, String sql, Object[] sqlParams) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_EXECUTE_UPDATE, sql, sqlParams);
		if (r == null) {
			return -1;
		}
		JsonObject rje = (JsonObject) r;
		JsonElement realResult = rje.get("result");
		if (realResult == null) {
			return -1;
		}
		return realResult.getAsNumber().intValue();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <T> T queryForColumn(int srvId, String oprGroup, String sql, Object[] sqlParams, T... dv) {
		List<Map> r = queryForList(new TypeToken<List<Map>>() {
		}.getType(), srvId, oprGroup, sql, sqlParams);
		T dfr = ArrayUtils.isEmpty(dv) ? null : dv[0];
		if (CollectionUtils.isEmpty(r)) {
			return dfr;
		}
		return (T) r.get(0).values().iterator().next();
	}

	public void sendRollMsg(int srvId, String oprGroup, String msg) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_SEND_ROLL_MSG, msg);
	}

	public String getAccountNameByGbId(int srvId, String oprGroup, long gbId) {
		return queryForColumn(srvId, oprGroup, "select accountName from AvatarModel where gbId = ?",
				new Object[] { gbId }, "NA");
	}

	public String getAccountRoleByGbId(int srvId, String oprGroup, String uid) {
		return queryForColumn(srvId, oprGroup, "select roleName from AvatarModel where uid = ?", new Object[] { uid },
				"NA");
	}

	public void hotfix(int serverId, String oprGroup) {
		invokeRpcWithCheck(serverId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_HOT_FIX);
	}

	public void refreshVersion(int serverId, String oprGroup) {
		invokeRpcWithCheck(serverId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_REFRESH_VERSION);
	}

	public void forceSyncZstData(int serverId, String oprGroup) {
		invokeRpcWithCheck(serverId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_FORCE_SYNC_ZST_DATA);
	}

	public boolean sendChongzhiProduct(int serverId, String oprGroup, long gbId, String productId, int productCount,
			String operater) {
		String sql = "select uid from AvatarModel where gbId=?";
		String uid = this.queryForColumn(serverId, oprGroup, sql, new Object[] { gbId }, "");
		String orderSn = FsGameGmsUtils.getUUID() + "-GMS";
		String source = "GMS-" + operater;
		String ip = "";

		Object r = invokeRpcWithCheck(serverId, oprGroup, FsGameGasRpcConst.ADMIN_LOGIN_REQ_PAY_ADD_ITEM, uid,
				productId, productCount, oprGroup, orderSn, source, ip);
		if (r == null) {
			return false;
		}
		return ((JsonObject) r).get("result").getAsBoolean();
	}

	public <T> List<T> queryForListToGlobal(Type convertType, int srvId, String oprGroup, String sql,
			Object[] sqlParams) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_QUERY_FOR_LIST_TO_GLOBAL, sql,
				sqlParams);
		if (r == null || !(r instanceof JsonObject)) {
			return Collections.emptyList();
		}
		JsonObject rje = (JsonObject) r;
		JsonElement realResult = rje.get("result");
		if (realResult == null) {
			return Collections.emptyList();
		}
		List<T> rs = GsonFactory.getDefault().fromJson(realResult, convertType);
		return rs;
	}

	public int executeUpdateToGlobal(int srvId, String oprGroup, String sql, Object[] sqlParams) {
		Object r = invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_EXECUTE_UPDATE_TO_GLOBAL, sql,
				sqlParams);
		if (r == null) {
			return -1;
		}
		JsonObject rje = (JsonObject) r;
		JsonElement realResult = rje.get("result");
		if (realResult == null) {
			return -1;
		}
		return realResult.getAsNumber().intValue();
	}

	public void jinyanByType(int srvId, String oprGroup, String userId, long dbId, int type) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_JIN_YAN, userId, dbId, type);
	}

	public void changeName(int srvId, String oprGroup, String userId, long dbId, int type) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_CHANGE_NAME, userId, dbId, type);
	}

	public void changeAvatar(int srvId, String oprGroup, String userId, long dbId, int type) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_CHANGE_AVATAR, userId, dbId, type);
	}

	public void stopJinyan(int srvId, String oprGroup, String userId, long dbId) {
		invokeRpcWithCheck(srvId, oprGroup, FsGameGasRpcConst.ADMIN_REQ_STOP_JIN_YAN, userId, dbId);
	}
}
