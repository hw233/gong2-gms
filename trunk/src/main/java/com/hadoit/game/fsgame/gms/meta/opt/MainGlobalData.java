package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

public class MainGlobalData extends BaseYunyingOpt implements Bean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 3日登录
	 */
	private long loginCount3;

	/**
	 * 7日登录
	 */
	private long loginCount7;

	/**
	 * 总注册用户
	 */
	private long totalRegCount;

	/**
	 * 总充值用户
	 */
	private long totalChargeUserCount;

	/**
	 * 总充值数
	 */
	private long totalChargeAmount;

	public long getTotalRegCount() {
		return totalRegCount;
	}

	public void setTotalRegCount(long totalRegCount) {
		this.totalRegCount = totalRegCount;
	}

	public long getTotalChargeUserCount() {
		return totalChargeUserCount;
	}

	public void setTotalChargeUserCount(long totalChargeUserCount) {
		this.totalChargeUserCount = totalChargeUserCount;
	}

	public long getTotalChargeAmount() {
		return totalChargeAmount;
	}

	public void setTotalChargeAmount(long totalChargeAmount) {
		this.totalChargeAmount = totalChargeAmount;
	}

	public long getLoginCount3() {
		return loginCount3;
	}

	public void setLoginCount3(long loginCount3) {
		this.loginCount3 = loginCount3;
	}

	public long getLoginCount7() {
		return loginCount7;
	}

	public void setLoginCount7(long loginCount7) {
		this.loginCount7 = loginCount7;
	}

	/**
	 * ARPPU
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_ROUND2)
	public float getArppu() {
		if (totalChargeUserCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((double) getRmbTotalChargeAmount()
				/ (double) totalChargeUserCount, 2);
	}
	
	/**
	 * 活跃ARPU 
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_ROUND2)
	public float getArpu() {
		if (totalRegCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((double) getRmbTotalChargeAmount()
				/ (double) totalRegCount, 2);
	}

	/**
	 * 付费比
	 * 
	 * @return
	 */
	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_PERCENT2)
	public float getChargeRate() {
		if (totalRegCount <= 0) {
			return 0.0f;
		}
		return (float) FsGameGmsUtils.halfUpScaleToDouble((float) totalChargeUserCount / (double) totalRegCount, 4);
	}

	public long getRmbTotalChargeAmount() {
		if (FsGameGmsUtils.inZone("yn")) {
			return totalChargeAmount * 2000 / (10 * 3500);
		} else if (FsGameGmsUtils.inZone("tw")) {
			return totalChargeAmount / 10;
		} else {
			return totalChargeAmount / 10;
		}
	}

}
