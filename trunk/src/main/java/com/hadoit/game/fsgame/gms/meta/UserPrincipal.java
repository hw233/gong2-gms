package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.web.security.Principal;

/**
 * 
 * @author apple
 *
 */
public class UserPrincipal implements Principal, Bean {
	private static final long serialVersionUID = 1L;

	private String userName;

	public UserPrincipal(String userName) {
		this.userName = userName;
	}

	public boolean isValidate() {
		return true;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
