package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;
import java.util.List;
import com.hadoit.game.fsgame.gms.meta.UserLogs;

@Component("UserLogsDao")
public class UserLogsDao extends BaseDomainDao<UserLogs> {

	@Override
	protected Class<UserLogs> getDomainClass() {
		// TODO Auto-generated method stub
		return UserLogs.class;
	}

	public List<UserLogs> getlogByroleName(String roleName, int limit, int offset) {
		Object[] args = new Object[1];
		args[0] = roleName;
		return getListByCondition("roleName=?", limit, offset, args);
	}

	public void insertLogs(UserLogs logs) {
		addObject(logs);
	}

}
