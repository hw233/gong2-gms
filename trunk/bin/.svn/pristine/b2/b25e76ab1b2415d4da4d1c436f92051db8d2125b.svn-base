package com.hadoit.game.fsgame.gms.meta.opt.game;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.meta.opt.BaseOpt;

/**
 * 道具分析
 * @author PAULWONG(wangdihua@163.com)
 *
 */
@Table(recursion = true)
public class ItemStats extends BaseOpt implements Bean {
	/**
	 */
	private static final long serialVersionUID = 1L;

	private int itemId;

	/**
	 * 购买数量
	 */
	private long buyCount;

	/**
	 * 购买人数
	 */
	private long buyUserCount;

	/**
	 * 系统赠送数量
	 */
	private long sysCount;

	/**
	 * 系统赠送人数
	 */
	private long sysUserCount;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public long getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(long buyCount) {
		this.buyCount = buyCount;
	}

	public long getBuyUserCount() {
		return buyUserCount;
	}

	public void setBuyUserCount(long buyUserCount) {
		this.buyUserCount = buyUserCount;
	}

	public long getSysCount() {
		return sysCount;
	}

	public void setSysCount(long sysCount) {
		this.sysCount = sysCount;
	}

	public long getSysUserCount() {
		return sysUserCount;
	}

	public void setSysUserCount(long sysUserCount) {
		this.sysUserCount = sysUserCount;
	}

	/**
	 * 总产出总量
	 * 
	 * @return
	 */
	public long getTotalCount() {
		return buyCount + sysCount;
	}

	/**
	 * 获得人数
	 * 
	 * @return
	 */
	public long getTotalUserCount() {
		return buyUserCount + sysUserCount;
	}
}
