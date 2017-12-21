package com.hadoit.game.fsgame.gms.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.dao.SecurityInfoDao;
import com.hadoit.game.fsgame.gms.meta.SecurityInfo;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Transactional
@Component("securityInfoService")
public class SecurityInfoService {

	@Autowired
	private SecurityInfoDao securityInfoDao;
	
	@Autowired
	@Value("${config.admin_account}")
	private String adminAccount;

	@Autowired
	@Value("${config.admin_account_pass}")
	private String adminAccountPass;
	
	@PostConstruct
	void init() {
		SecurityInfo si = new SecurityInfo();
		si.setAccount(adminAccount);
		si.setPassword(adminAccountPass);
		si.setRoleType(FsGameGmsConst.SECURITY_TYPE_ADMIN);
		si.setCreateTime(System.currentTimeMillis());
		
		if (addSecurityInfo(si)) {
			LoggerUtils.info("Create " + adminAccount + " success!");
		}
	}

	public int getAllCount() {
		return securityInfoDao.getAllCount();
	}
	
	public List<SecurityInfo> getAllList(int limit, int offset) {
		return securityInfoDao.getAllList(limit, offset);
	}
	
	public List<SecurityInfo> getAllList() {
		return securityInfoDao.getAll();
	}
	
	public boolean addSecurityInfo(SecurityInfo securityInfo) {
		SecurityInfo si = securityInfoDao.getSecurityInfoByAccount(securityInfo.getAccount());
		if (si != null) {
			return false;
		}
		securityInfoDao.addSecurityInfo(securityInfo);
		return true;
	}
	
	public void updateRoleType(String account, int roleType) {
		securityInfoDao.updateRoleType(account, roleType);
	}
	
	public boolean deleteById(long id) {
		SecurityInfo si = securityInfoDao.getById(id);
		if (si == null) {
			return false;
		}
		securityInfoDao.deleteSecurityInfoById(id);
		return true;
	}
	
	public SecurityInfo getSecurityInfoByAccount(String account) {
		return securityInfoDao.getSecurityInfoByAccount(account);
	}
	
	public SecurityInfo getSecurityInfoById(long id) {
		return securityInfoDao.getSecurityInfoById(id);
	}
	
	public void updateSecurityInfo(SecurityInfo securityInfo) {
		securityInfoDao.updateObject(securityInfo);
	}
}
