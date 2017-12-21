package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Reporter({ @ReportInfo(name = FsGameGmsConst.MAIL_REPORT_NAME_OPT_DAY_FOR_OPR, sheetName = "渠道单日统计", headNames = {
		"平台", "渠道", "日期", "日新增帐号", "日活跃帐号", "日付费帐号数", "日付费率", "日付费金额", "日ARPPU", "日活跃ARPU","日新增付费帐号数", "日新增付费率", "日新增付费金额",
		"日新增ARPPU", "日新增活跃ARPU" }, headProps = { "oprGroup", "opr", "createTime", "newLoginCount", "loginCount", "chargeUserCount",
		"chargeRate", "rmbChargeAmount", "arppu", "arpu","newChargeUserCount", "newChargeRate", "newRmbChargeAmount", "newArppu", "newArpu" }) })
@Table(recursion = true)
public class OptDayDataForOpr extends MainOptData implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(index = true)
	private String opr;

	public String getOpr() {
		return opr;
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}
}
