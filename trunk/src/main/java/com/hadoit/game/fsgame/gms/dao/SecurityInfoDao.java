package com.hadoit.game.fsgame.gms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.SecurityInfo;

@Component("securityInfoDao")
public class SecurityInfoDao extends BaseDomainDao<SecurityInfo> {

	@Override
	protected Class<SecurityInfo> getDomainClass() {
		return SecurityInfo.class;
	}
	
	public int getAllCount() {
		return getCount();
	}

	public List<SecurityInfo> getAllList(int limit, int offset) {
		return getListByCondition((String) null, "roleType", false, limit, offset, new Object[0]);
	}
	
	public void addSecurityInfo(SecurityInfo securityInfo) {
		addObject(securityInfo);
	}
	
	public void updateRoleType(String account, int roleType) {
		updateColumnValueByCondition("account=?", "roleType", account, roleType);
	}
	
	public void deleteSecurityInfoById(long id) {
		deleteById(id);
	}
	
	public SecurityInfo getSecurityInfoByAccount(String account) {
		return getObjectByCondition("account=?", account);
	}
	
	public SecurityInfo getSecurityInfoById(long id) {
		return getObjectByCondition("id=?", id);
	}
}
