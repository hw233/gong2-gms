package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Index;
import com.hadoit.game.common.framework.dao.annotation.Table;

@Table(indexs = { @Index(columns = { "roleName" }) })
public class UserLogs implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String roleName;// 操作角色名

	private long createTime;// 操作时间

	@Column(length = 255)
	private String uid;// 操作玩家id

	@Column(length = 255)
	private String content;// 操作类型

	@Column(length = 255)
	private String desb;// 操作描述

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDesb() {
		return desb;
	}

	public void setDesb(String desb) {
		this.desb = desb;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
