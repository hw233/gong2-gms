package com.hadoit.game.fsgame.gms.meta;

import com.hadoit.game.common.framework.dao.annotation.Column;
import com.hadoit.game.common.framework.dao.annotation.Table;

/**
 * 礼包生成记录
 * 
 * @author apple
 *
 */
@Table()
public class CouponGenRecord implements Bean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

	private String batchCode;

	private long count;

	@Column(ignore = true)
	private long useCount;

	@Column(index = true)
	private String giftType;

	private String oprGroup;
	private String opr;
	private int enable;

	private long createTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getUseCount() {
		return useCount;
	}

	public void setUseCount(long useCount) {
		this.useCount = useCount;
	}

	public String getGiftType() {
		return giftType;
	}

	public void setGiftType(String giftType) {
		this.giftType = giftType;
	}

	public String getOprGroup() {
		return oprGroup;
	}

	public void setOprGroup(String oprGroup) {
		this.oprGroup = oprGroup;
	}
	public String getOpr() {
		return opr;
	}

	public void setOpr(String opr) {
		this.opr = opr;
	}

	public int getEnable() {
		return enable;
	}

	public void setEnable(int enable) {
		this.enable = enable;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

}
