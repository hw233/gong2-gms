package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

//@Reporter({ @ReportInfo(name = FsGameGmsConst.REPORT_NAME_OPT_GLOBAL, sheetName = "全局统计", headNames = { "渠道名称", "服务器",
//		"累计帐号", "3日活跃帐号", "7日活跃帐号", "累计付费帐号数", "付费率", "累计付费金额", "ARPU值" }, headProps = { "oprGroup", "serverId",
//		"totalRegCount", "loginCount3", "loginCount7", "totalChargeUserCount", "chargeRate", "rmbTotalChargeAmount",
//		"arpu" }) })
@Reporter({ @ReportInfo(name = FsGameGmsConst.MAIL_REPORT_NAME_OPT_GLOBAL, sheetName = "单服全局统计", headNames = { "平台", "服务器", 
		"日期", "累计帐号", "3日活跃帐号", "7日活跃帐号", "累计付费帐号数", "付费率", "累计付费金额", "ARPPU", "活跃ARPU" }, headProps = { "oprGroup", "serverId", 
		"createTime", "totalRegCount", "loginCount3", "loginCount7", "totalChargeUserCount", "chargeRate", "rmbTotalChargeAmount",
		"arppu", "arpu" }) })
@Table(recursion = true)
public class OptGlobalData extends MainGlobalData implements Bean {

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
