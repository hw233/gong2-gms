package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Reporter({ @ReportInfo(name = FsGameGmsConst.MAIL_REPORT_NAME_OPT_DAY_FOR_ALL, sheetName = "平台单日统计", headNames = {
		"平台", "日期", "日新增帐号", "日活跃帐号", "日最高在线", "日均在线", "日付费帐号数", "日付费率", "日付费金额", "日ARPPU", "日活跃ARPPU", "日新增付费帐号数", "日新增付费率",
		"日新增付费金额", "日新增ARPPU", "日新增活跃ARPU" }, headProps = { "oprGroup", "createTime", "newLoginCount", "loginCount",
		"maxOnlineCount", "avgOnlineCount", "chargeUserCount", "chargeRate", "rmbChargeAmount", "arppu", "arpu",
		"newChargeUserCount", "newChargeRate", "newRmbChargeAmount", "newArppu", "newArpu" }) })
@Table(recursion = true)
public class OptDayDataForAll extends MainOptData implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
