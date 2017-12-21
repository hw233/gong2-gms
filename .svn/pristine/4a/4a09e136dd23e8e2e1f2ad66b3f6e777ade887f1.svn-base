package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Reporter({ @ReportInfo(name = FsGameGmsConst.MAIL_REPORT_NAME_OPT_GLOBAL_FOR_OPR, sheetName = "渠道全局统计", headNames = { "平台", "渠道", 
		"日期", "累计帐号", "3日活跃帐号", "7日活跃帐号", "累计付费帐号数", "付费率", "累计付费金额", "ARPPU", "活跃ARPU" }, headProps = { "oprGroup", "opr", 
		"createTime", "totalRegCount", "loginCount3", "loginCount7", "totalChargeUserCount", "chargeRate", "rmbTotalChargeAmount",
		"arppu", "arpu" }) })
@Table(recursion = true)
public class OptGlobalDataForOpr extends MainGlobalData implements Bean {

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
