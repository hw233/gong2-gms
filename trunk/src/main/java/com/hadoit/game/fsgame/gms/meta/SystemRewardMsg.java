package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;

@Table()
public class SystemRewardMsg implements Bean {
	private static final long serialVersionUID = 1L;

	private long id;

	private int msgType;

	private int serverId;

	private String oprGroup;

	@Column(length = 65535)
	private String toUsers;

	@Column(length = 65535)
	private String content;

	@Column(length = 65535)
	private String itemIds;

	@Column(length = 65535)
	private String itemCounts;
	private long money;
	private long gold;
	private long leijiGold;
	private String beiZhu;//补单备注
	/**
	 * 审核中, 不通过, 通过
	 */
	private int state;

	/**
	 * 发送时间
	 */
	private long sendTime;

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

	public String getToUsers() {
		return toUsers;
	}

	public void setToUsers(String toUsers) {
		this.toUsers = toUsers;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getItemIds() {
		return itemIds;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemCounts() {
		return itemCounts;
	}

	public void setItemCounts(String itemCounts) {
		this.itemCounts = itemCounts;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public long getLeijiGold() {
		return leijiGold;
	}

	public void setLeijiGold(long leijiGold) {
		this.leijiGold = leijiGold;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
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

	public long getSendTime() {
		return sendTime;
	}

	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBeiZhu() {
		return beiZhu;
	}

	public void setBeiZhu(String beiZhu) {
		this.beiZhu = beiZhu;
	}
}
