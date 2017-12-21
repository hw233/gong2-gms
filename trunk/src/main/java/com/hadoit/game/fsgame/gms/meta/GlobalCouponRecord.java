package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Table;

@Table()
public class GlobalCouponRecord implements Bean {

	private static final long serialVersionUID = 1L;
	
	private long id;
	
	/**
	 * 兑换码
	 */
	private String couponCode;

	/**
	 * 礼包ID
	 */
	private int giftId;

	/**
	 * 渠道
	 */
	private String oprGroup;
	
	/**
	 * 子渠道
	 */
	private String opr;

	/**
	 * 是否启用
	 */
	private int enable;

	private long createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public int getGiftId() {
		return giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}

	public String getOprGroup() {
		return oprGroup;
	}

	public void setOprGroup(String oprGroup) {
		this.oprGroup = oprGroup;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getOpr() {
		return opr;
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}
}
