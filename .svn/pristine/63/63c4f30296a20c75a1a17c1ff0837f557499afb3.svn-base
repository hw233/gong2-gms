package com.hadoit.game.fsgame.gms.meta.log;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

public class BaseLog implements Bean {
	private static final long serialVersionUID = 1L;

	private long id;

	@Column(index = true)
	private int serverId;

	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_TIME2)
	private long createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

}
