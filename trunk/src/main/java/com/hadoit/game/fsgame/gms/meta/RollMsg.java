package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;

@Table()
public class RollMsg implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	/**
	 * 0是全服, 大于0是服务器ID
	 */
	private int serverId;

	/**
	 * 空是全渠道
	 */
	private String oprGroup;

	@Column(length = 65535)
	private String content;

	private int dayHour;

	private int dayMinute;

	private long repeatInterval;

	private long startTime;

	private long endTime;

	/**
	 * 审核中, 不通过, 通过
	 */
	private int state;

	/**
	 * 生成记录者
	 */
	private String owner;

	private long createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getDayHour() {
		return dayHour;
	}

	public void setDayHour(int dayHour) {
		this.dayHour = dayHour;
	}

	public int getDayMinute() {
		return dayMinute;
	}

	public void setDayMinute(int dayMinute) {
		this.dayMinute = dayMinute;
	}

	public long getRepeatInterval() {
		return repeatInterval;
	}

	public void setRepeatInterval(long repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getOprGroup() {
		return oprGroup;
	}

	public void setOprGroup(String oprGroup) {
		this.oprGroup = oprGroup;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
