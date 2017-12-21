package com.hadoit.game.fsgame.gms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.UserEvent;

@Component("userEventDao")
public class UserEventDao extends BaseDomainDao<UserEvent> {

	@Override
	protected Class<UserEvent> getDomainClass() {
		return UserEvent.class;
	}

	public int getAllCount() {
		return getCount();
	}

	public List<UserEvent> getAllListByEventType(int eventType, int limit, int offset) {
		return getListByCondition("eventType=?", null, false, limit, offset, new Object[] { eventType });
	}
}
