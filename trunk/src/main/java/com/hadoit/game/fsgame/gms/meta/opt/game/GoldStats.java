package com.hadoit.game.fsgame.gms.meta.opt.game;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.fsgame.gms.meta.Bean;
import com.hadoit.game.fsgame.gms.meta.opt.BaseOpt;

/**
 * 元宝分析
 * 
 * @author PAULWONG(wangdihua@163.com)
 *
 */
@Table(recursion = true)
public class GoldStats extends BaseOpt implements Bean {
	/**
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 元宝消耗
	 */
	private long consumeGold;

	/**
	 * 元宝留存
	 */
	private long remainGold;

	/**
	 * 消费玩家
	 */
	private long consumeCount;

	/**
	 * 活跃玩家
	 */
	private long loginCount;

	public long getConsumeGold() {
		return consumeGold;
	}

	public void setConsumeGold(long consumeGold) {
		this.consumeGold = consumeGold;
	}

	public long getRemainGold() {
		return remainGold;
	}

	public void setRemainGold(long remainGold) {
		this.remainGold = remainGold;
	}

	public long getConsumeCount() {
		return consumeCount;
	}

	public void setConsumeCount(long consumeCount) {
		this.consumeCount = consumeCount;
	}

	public long getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(long loginCount) {
		this.loginCount = loginCount;
	}

	public float getConsumeRatio() {
		if (loginCount == 0)
			return 0;
		return (float) consumeCount / loginCount;
	}

}
