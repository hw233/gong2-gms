package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;

/**
 * 礼包类型
 * 
 * @author apple
 *
 */
@Table()
public class CouponCategroy implements Bean {
	private static final long serialVersionUID = 1L;

	private long id;

	/**
	 * 礼包类型代码
	 */
	@Column(unique = true)
	private String giftType;

	/**
	 * 礼包名称
	 */
	private String giftName;

	/**
	 * 礼包描述
	 */
	private String giftDesc;

	/**
	 * 礼包ID
	 */
	private int giftId;

	/**
	 * 已经生成次数
	 */
	@Column(ignore = true)
	private int genCount;

	private long createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGiftType() {
		return giftType;
	}

	public void setGiftType(String giftType) {
		this.giftType = giftType;
	}

	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public String getGiftDesc() {
		return giftDesc;
	}

	public void setGiftDesc(String giftDesc) {
		this.giftDesc = giftDesc;
	}

	public int getGiftId() {
		return giftId;
	}

	public void setGiftId(int giftId) {
		this.giftId = giftId;
	}

	public int getGenCount() {
		return genCount;
	}

	public void setGenCount(int genCount) {
		this.genCount = genCount;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

}
