package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.CouponGenRecord;

/**
 * 
 * @author apple
 *
 */
@Component("couponGenRecordDao")
public class CouponGenRecordDao extends BaseDomainDao<CouponGenRecord> {

	@Override
	protected Class<CouponGenRecord> getDomainClass() {
		return CouponGenRecord.class;
	}

	public int getGenCountByGiftType(String giftType) {
		return getCountByCondition("giftType = ?", giftType);
	}

}
