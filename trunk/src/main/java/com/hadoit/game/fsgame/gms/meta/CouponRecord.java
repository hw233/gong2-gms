package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Reporter({ @ReportInfo(name = FsGameGmsConst.REPORT_NAME_COUPON, sheetName = "兑换码", headNames = { "批次", "兑换码", "礼包类型",
		"使用渠道","使用子渠道", "激活帐号", "激活服务器", "激活时间" }, headProps = { "batchCode", "couponCode", "giftType", "oprGroup",
		"opr","claimUser", "claimServerId", "claimTime" }) })
public class CouponRecord {

	private long id;

	/**
	 * 兑换码
	 */
	private String couponCode;

	/**
	 * 礼包类型
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_COUPONGIFTNAME)
	private String giftType;

	/**
	 * 礼包ID
	 */
	private int giftId;

	/**
	 * 批次
	 */
	private String batchCode;

	/**
	 * 是否启用
	 */
	private int enable;

	private long createTime;

	/**
	 * 兑换人
	 */
	private String claimUser;

	/**
	 * 兑换服务器
	 */
	private int claimServerId;

	/**
	 * 兑换时间
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_TIME)
	private long claimTime;

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

	public String getGiftType() {
		return giftType;
	}

	public void setGiftType(String giftType) {
		this.giftType = giftType;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
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

	public String getClaimUser() {
		return claimUser;
	}

	public void setClaimUser(String claimUser) {
		this.claimUser = claimUser;
	}

	public long getClaimTime() {
		return claimTime;
	}

	public void setClaimTime(long claimTime) {
		this.claimTime = claimTime;
	}

	public int getGiftId() {
		return giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}

	public int getClaimServerId() {
		return claimServerId;
	}

	public void setClaimServerId(int claimServerId) {
		this.claimServerId = claimServerId;
	}

}
