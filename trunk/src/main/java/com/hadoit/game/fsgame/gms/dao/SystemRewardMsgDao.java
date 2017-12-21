package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.SystemRewardMsg;

@Component("systemRewardMsgDao")
public class SystemRewardMsgDao extends BaseDomainDao<SystemRewardMsg> {

	@Override
	protected Class<SystemRewardMsg> getDomainClass() {
		return SystemRewardMsg.class;
	}

	public void updateState(long rId, int state) {
		updateColumnValue("state", state, rId);
	}

	public void updateStateAndTime(long rId, int state, long sendTime) {
		updateColumnValue(new String[] { "state", "sendTime" }, new Object[] { state, sendTime }, rId);
	}
}
