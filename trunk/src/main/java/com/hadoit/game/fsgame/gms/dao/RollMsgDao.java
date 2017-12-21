package com.hadoit.game.fsgame.gms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.RollMsg;

@Component("rollMsgDao")
public class RollMsgDao extends BaseDomainDao<RollMsg> {

	@Override
	protected Class<RollMsg> getDomainClass() {
		return RollMsg.class;
	}

	public int searchCount() {
		return getCount();
	}

	public List<RollMsg> searchList(int limit, int offset) {
		return getListByCondition(null, limit, offset);
	}

	public List<RollMsg> getNoExpireList() {
		return getListByCondition("endTime > ?", 0, 0, System.currentTimeMillis());
	}

	public void updateState(long rollMsgId, int state) {
		updateColumnValue("state", state, rollMsgId);
	}

}
