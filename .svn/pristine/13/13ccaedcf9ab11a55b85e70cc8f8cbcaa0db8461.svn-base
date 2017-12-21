package com.hadoit.game.fsgame.gms.meta.log;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Reporter({
	@ReportInfo(name = FsGameGmsConst.REPORT_NAME_OPT_ONLINE, sheetName = "实时在线查询", headNames = { "实时在线账号数", "时间点" }, headProps = { "onlineCount",
	"createTime" })
})
@Table(recursion = true)
public class OnlineLog extends BaseLog {
	private static final long serialVersionUID = 1L;

	private int onlineCount;

	public int getOnlineCount() {
		return onlineCount;
	}

	public void setOnlineCount(int onlineCount) {
		this.onlineCount = onlineCount;
	}

}
