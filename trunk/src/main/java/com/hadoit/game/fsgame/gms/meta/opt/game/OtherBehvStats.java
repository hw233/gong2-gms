package com.hadoit.game.fsgame.gms.meta.opt.game;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.annotation.ReportColumn;
import com.hadoit.game.fsgame.gms.annotation.ReportInfo;
import com.hadoit.game.fsgame.gms.annotation.Reporter;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.meta.opt.BaseOpt;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

/**
 * 其他行为
 * 
 * @author apple
 *
 */
@Reporter({ @ReportInfo(name = FsGameGmsConst.REPORT_NAME_GS_CSMBEHV, sheetName = "消费行为统计", headNames = { "日期", "行为",
		"数量" }, headProps = { "createTime", "behv", "num" }) })
@Table(recursion = true)
public class OtherBehvStats extends BaseOpt implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ReportColumn(transferScript = FsGameGmsConst.SCRIPT_REPORT_TRANSFER_BEHV)
	private String behv;

	private double num;

	private String ext1;

	private String ext2;

	public String getBehv() {
		return behv;
	}

	public void setBehv(String behv) {
		this.behv = behv;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

}
