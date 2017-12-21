package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

public abstract class MainOptData extends BaseYunyingOpt {

	/**
	 * 平均在线
	 */
	private long avgOnlineCount;

	/**
	 * 最高在线
	 */
	private long maxOnlineCount;

	/**
	 * 登录数
	 */
	private long loginCount;
	/**
	 * 新增登录用户
	 */
	private long newLoginCount;
	/**
	 * 新增注册
	 */
	private long newRegCount;

	/**
	 * 充值总额
	 */
	private long chargeAmount;
	
	/**
	 * 充值用户数
	 */
	private long chargeUserCount;
	
	/**
	 * 新增充值总额
	 */
	private long newChargeAmount;
	
	/**
	 * 新增充值用户数
	 */
	private long newChargeUserCount;
	
	/**
	 * 消费总额
	 */
	private long feeAmount;
	/**
	 * 消费用户数
	 */
	private long feeUserCount;

	/**
	 * 免费赠送元宝数
	 */
	private long freeGoldAmount;

	/**
	 * 留存相关
	 */
	private long preNewCount1;
	private long leaveCount1;

	public long getPreNewCount1() {
		return preNewCount1;
	}

	public void setPreNewCount1(long preNewCount1) {
		this.preNewCount1 = preNewCount1;
	}

	public long getAvgOnlineCount() {
		return avgOnlineCount;
	}

	public void setAvgOnlineCount(long avgOnlineCount) {
		this.avgOnlineCount = avgOnlineCount;
	}

	public long getMaxOnlineCount() {
		return maxOnlineCount;
	}

	public void setMaxOnlineCount(long maxOnlineCount) {
		this.maxOnlineCount = maxOnlineCount;
	}

	public long getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(long loginCount) {
		this.loginCount = loginCount;
	}

	public long getNewLoginCount() {
		return newLoginCount;
	}

	public void setNewLoginCount(long newLoginCount) {
		this.newLoginCount = newLoginCount;
	}

	public long getNewRegCount() {
		return newRegCount;
	}

	public void setNewRegCount(long newRegCount) {
		this.newRegCount = newRegCount;
	}

	public long getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(long chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public long getChargeUserCount() {
		return chargeUserCount;
	}

	public void setChargeUserCount(long chargeUserCount) {
		this.chargeUserCount = chargeUserCount;
	}

	public long getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(long feeAmount) {
		this.feeAmount = feeAmount;
	}

	public long getFeeUserCount() {
		return feeUserCount;
	}

	public void setFeeUserCount(long feeUserCount) {
		this.feeUserCount = feeUserCount;
	}

	public long getFreeGoldAmount() {
		return freeGoldAmount;
	}

	public void setFreeGoldAmount(long freeGoldAmount) {
		this.freeGoldAmount = freeGoldAmount;
	}

	public long getLeaveCount1() {
		return leaveCount1;
	}

	public void setLeaveCount1(long leaveCount1) {
		this.leaveCount1 = leaveCount1;
	}

	public long getNewChargeAmount() {
		return newChargeAmount;
	}

	public void setNewChargeAmount(long newChargeAmount) {
		this.newChargeAmount = newChargeAmount;
	}

	public long getNewChargeUserCount() {
		return newChargeUserCount;
	}

	public void setNewChargeUserCount(long newChargeUserCount) {
		this.newChargeUserCount = newChargeUserCount;
	}

	/**
	 * 活跃ARPU
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_ROUND2)
	public float getArpu() {
		if (loginCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) getRmbChargeAmount() / (double) loginCount, 2);
	}
	
	/**
	 * ARPPU
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_ROUND2)
	public float getArppu() {
		if (chargeUserCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) getRmbChargeAmount() / (double) chargeUserCount, 2);
	}

	/**
	 * 付费比
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_PERCENT2)
	public float getChargeRate() {
		if (loginCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) chargeUserCount / (double) loginCount, 4);
	}
	
	/**
	 * 新增活跃ARPU
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_ROUND2)
	public float getNewArpu() {
		if (newLoginCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) getNewRmbChargeAmount() / (double) newLoginCount, 2);
	}
	
	/**
	 * 新增ARPPU
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_ROUND2)
	public float getNewArppu() {
		if (newChargeUserCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) getNewRmbChargeAmount() / (double) newChargeUserCount, 2);
	}

	/**
	 * 新增付费比
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_PERCENT2)
	public float getNewChargeRate() {
		if (newLoginCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) newChargeUserCount / (double) newLoginCount, 4);
	}

	public long getRmbChargeAmount() {
		if (FsGameGmsUtils.inZone("yn")) {
			return chargeAmount * 2000 / (10 * 3500);
		} else if (FsGameGmsUtils.inZone("tw")) {
			return chargeAmount / 10;
		} else {
			return chargeAmount / 10;
		}
	}
	
	public long getNewRmbChargeAmount() {
		if (FsGameGmsUtils.inZone("yn")) {
			return newChargeAmount * 2000 / (10 * 3500);
		} else if (FsGameGmsUtils.inZone("tw")) {
			return newChargeAmount / 10;
		} else {
			return newChargeAmount / 10;
		}
	}

	/**
	 * 次日留存
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_PERCENT2)
	public float getRetentionRatio1() {
		if (preNewCount1 == 0)
			return 0;
		return (float) leaveCount1 / preNewCount1;
	}
}
