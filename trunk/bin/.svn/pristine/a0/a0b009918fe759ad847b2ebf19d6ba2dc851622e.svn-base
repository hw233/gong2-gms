package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

public abstract class BaseYunyingOpt {
	private long id;

	@Column(index = true)
	private String oprGroup;

	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_TIME)
	private long createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOprGroup() {
		return oprGroup;
	}

	public void setOprGroup(String oprGroup) {
		this.oprGroup = oprGroup;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

}
