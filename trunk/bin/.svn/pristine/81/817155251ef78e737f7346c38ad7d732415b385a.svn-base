package com.hadoit.game.fsgame.gms.service;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.dao.UserEventDao;
import com.hadoit.game.fsgame.gms.meta.UserEvent;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Transactional
@Component("userEventService")
public class UserEventService {

	private final static String CHANGE_PW_CONTENT = "Operater [{0}] change password! Target player [{1}], opr [{2}], serverId [{3}]";

	@Autowired
	private UserEventDao userEventDao;

	private UserEvent createUserEvent(String account, String roleType, String ip, int eventType, String eventContent) {
		UserEvent ue = new UserEvent();
		ue.setAccount(account);
		ue.setRoleType(roleType);
		ue.setEventType(eventType);
		ue.setEventContent(eventContent);
		ue.setIp(ip);
		ue.setCreateTime(System.currentTimeMillis());
		return ue;
	}

	public void addEventFromChangePw(String account, String roleType, String ip, String targetGameAccount, String opr,
			int serverId) {
		String eventContent = MessageFormat.format(CHANGE_PW_CONTENT, account, targetGameAccount, opr, serverId);
		UserEvent ue = createUserEvent(account, roleType, ip, FsGameGmsConst.USER_EVENT_TYPE_CHANGE_PW,
				eventContent);
		userEventDao.addObject(ue);
	}
}
