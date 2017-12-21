package com.hadoit.game.fsgame.gms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.ServerInfo;

@Component("serverInfoDao")
public class ServerInfoDao extends BaseDomainDao<ServerInfo> {

	@Override
	protected Class<ServerInfo> getDomainClass() {
		return ServerInfo.class;
	}

	public ServerInfo getServerInfo(long id) {
		return getById(id);
	}

	public int getAllServerCount() {
		return getCount();
	}

	public List<ServerInfo> getAllServer(int limit, int offset) {
		return getListByCondition((String) null, "id", false, limit, offset, new Object[0]);
	}
	public List<ServerInfo> getAllServer(String oprgroup,int limit, int offset) {
		return getListByFullCondition("oprGroup=? ORDER BY id DESC limit ? offset ?",oprgroup, limit, offset);
	}

	public void addServer(ServerInfo serverInfo) {
		addObject(serverInfo);
	}

	public ServerInfo getServerBy(int serverId, String oprGroup) {
		return getObjectByCondition("serverId=? and oprGroup=?", serverId, oprGroup);
	}

	public List<ServerInfo> getServerByOprGroup(String oprGroup) {
		return getListByFullCondition("oprGroup=?", oprGroup);
	}

	public void updateServerState(int serverId, String oprGroup, int state) {
		updateColumnValueByCondition("serverId=? and oprGroup=?", "state", state, serverId, oprGroup);
	}

	public void deleteServerBy(int serverId, String oprGroup) {
		this.deleteByCondition("serverId=? and oprGroup=?", serverId, oprGroup);
	}

}
