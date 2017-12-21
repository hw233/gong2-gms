package com.hadoit.game.fsgame.gms.meta;

import java.util.List;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.common.framework.dao.convert.impl.CollectionNumberOrStringColumnConvert;

@Table
public class Message implements Bean {

	/**
	 * 短信模板
	 * @梁波
	 */
	private static final long serialVersionUID = 1L;

	private String phone;

	private String message;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getIs_passed() {
		return is_passed;
	}

	public void setIs_passed(String is_passed) {
		this.is_passed = is_passed;
	}

	private String is_passed;

}
