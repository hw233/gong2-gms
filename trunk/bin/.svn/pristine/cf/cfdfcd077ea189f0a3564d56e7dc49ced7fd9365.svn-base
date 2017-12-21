package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

//@Reporter({ @ReportInfo(name = FsGameGmsConst.REPORT_NAME_OPT_DAY, sheetName = "单日统计", headNames = { "渠道名称", "服务器",
//		"日期", "日新增帐号", "日活跃帐号", "次日留存率", "日最高在线", "日均在线", "日付费帐号数", "日付费率", "日付费金额", "日ARPU值" }, headProps = {
//		"oprGroup", "serverId", "createTime", "newLoginCount", "loginCount", "retentionRatio1", "maxOnlineCount",
//		"avgOnlineCount", "chargeUserCount", "chargeRate", "rmbChargeAmount", "arpu" }) })
@Reporter({ @ReportInfo(name = FsGameGmsConst.MAIL_REPORT_NAME_OPT_DAY, sheetName = "单服单日统计", headNames = { "平台",
		"服务器", "日期", "日新增帐号", "日活跃帐号", "日最高在线", "日均在线", "日付费帐号数", "日付费率", "日付费金额", "日ARPPU", "日活跃ARPU", "日新增付费帐号数", "日新增付费率",
		"日新增付费金额", "日新增ARPPU", "日新增活跃ARPU" }, headProps = { "oprGroup", "serverId", "createTime", "newLoginCount", "loginCount",
		"maxOnlineCount", "avgOnlineCount", "chargeUserCount", "chargeRate", "rmbChargeAmount", "arppu", "arpu",
		"newChargeUserCount", "newChargeRate", "newRmbChargeAmount", "newArppu", "newArpu" }) })
@Table(recursion = true)
public class OptDayData extends MainOptData implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(index = true)
	private int serverId;

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

}
