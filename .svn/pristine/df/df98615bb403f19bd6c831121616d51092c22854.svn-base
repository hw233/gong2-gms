package com.hadoit.game.fsgame.gms.meta.opt.game;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.meta.opt.BaseOpt;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

/**
 * 资源产入产出
 * 
 * @author apple
 *
 */
@Reporter({
	@ReportInfo(name = FsGameGmsConst.REPORT_NAME_GS_RESALL, sheetName = "资源统计", 
			headNames = {"日期", "类型", "途径", "资源ID", "资源名称", "数量"}, 
			headProps = {"createTime", "type", "approach", "resId", "resId", "num"})
})
@Table(recursion = true)
public class ResAllStats extends BaseOpt implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 产入/产出
	 */
	@ReportColumn(transferScript=FsGameGmsConst.SCRIPT_REPORT_TRANSFER_RES_TYPE)
	private int type;

	/**
	 * 途径
	 */
	@ReportColumn(transferScript=FsGameGmsConst.SCRIPT_REPORT_TRANSFER_RES_APPROACH)
	private int approach;

	@ReportColumn(transferScript=FsGameGmsConst.SCRIPT_REPORT_TRANSFER_RES_NAME)
	private long resId;

	private double num;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getApproach() {
		return approach;
	}

	public void setApproach(int approach) {
		this.approach = approach;
	}

	public long getResId() {
		return resId;
	}

	public void setResId(long resId) {
		this.resId = resId;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

}
