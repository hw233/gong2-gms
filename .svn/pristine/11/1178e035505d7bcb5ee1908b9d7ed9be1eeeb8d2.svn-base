package com.hadoit.game.fsgame.gms.service;

import java.sql.Time;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.common.framework.web.security.UserDetails;
import com.hadoit.game.fsgame.gms.dao.UserLogsDao;
import com.hadoit.game.fsgame.gms.meta.SecurityInfo;
import com.hadoit.game.fsgame.gms.meta.UserLogs;

@Transactional
@Component("adminService")
public class AdminService {
	@Autowired
	private SecurityInfoService securityInfoService;
	@Autowired
	private UserLogsDao userLogsDao;

	public boolean checkAdmin(String name, String pass) {
		if (StringUtils.isEmpty(name) || StringUtils.isEmpty(pass)) {
			return false;
		}

		SecurityInfo si = securityInfoService.getSecurityInfoByAccount(name);
		if (si == null) {
			return false;
		}

		if (!si.getPassword().equals(pass)) {
			return false;
		}

		return true;
	}

	public void logger(String uid, String content, String describe) {
		UserDetails user = SecurityContextHolder.getSessionAuthInfo();
		if (user != null) {
			UserLogs logs = new UserLogs();
			logs.setRoleName(user.getUserName());
			logs.setCreateTime(System.currentTimeMillis());
			logs.setUid(uid);
			logs.setContent(content);
			logs.setDesb(describe);
			userLogsDao.insertLogs(logs);

		}

	}
}
