package com.hadoit.game.fsgame.gms.meta.opt;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

/**
 * base class
 * 
 * @author apple
 *
 */
public abstract class BaseOpt {
	private long id;

	@Column(index = true)
	private int serverId;

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

	public int getServerId() {
		return serverId;
	}

	public void setServerId(int serverId) {
		this.serverId = serverId;
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
