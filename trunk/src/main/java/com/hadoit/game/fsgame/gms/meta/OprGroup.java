package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;

@Table()
public class OprGroup implements Bean {
	private static final long serialVersionUID = 1L;

	private long id;

	@Column(unique = true)
	private String oprGroup;

	private String name;

	private String oprMatchStr;

	private String loginUrl;

	private String logDbUrl;

	private String logDbUserName;

	private String logDbPassword;

	private long createTime;

	private boolean registerState;
	
	private boolean openShiming;
	
	private boolean openShingmingshow;

	public boolean isOpenShiming() {
		return openShiming;
	}

	public void setOpenShiming(boolean openShiming) {
		this.openShiming = openShiming;
	}

	public boolean isOpenShingmingshow() {
		return openShingmingshow;
	}

	public void setOpenShingmingshow(boolean openShingmingshow) {
		this.openShingmingshow = openShingmingshow;
	}

	public boolean isRegisterState() {
		return registerState;
	}

	public void setRegisterState(boolean registerState) {
		this.registerState = registerState;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOprGroup() {
		return oprGroup;
	}

	public void setOprGroup(String oprGroup) {
		this.oprGroup = oprGroup;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getLogDbUrl() {
		return logDbUrl;
	}

	public void setLogDbUrl(String logDbUrl) {
		this.logDbUrl = logDbUrl;
	}

	public String getLogDbUserName() {
		return logDbUserName;
	}

	public void setLogDbUserName(String logDbUserName) {
		this.logDbUserName = logDbUserName;
	}

	public String getLogDbPassword() {
		return logDbPassword;
	}

	public void setLogDbPassword(String logDbPassword) {
		this.logDbPassword = logDbPassword;
	}

	public String getOprMatchStr() {
		return oprMatchStr;
	}

	public void setOprMatchStr(String oprMatchStr) {
		this.oprMatchStr = oprMatchStr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
