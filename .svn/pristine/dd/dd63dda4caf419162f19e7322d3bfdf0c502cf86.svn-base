package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.CouponCategroy;
import com.hadoit.game.fsgame.gms.meta.GlobalCouponRecord;

/**
 * 
 * @author apple
 * 
 */
@Component("globalCouponRecordDao")
public class GlobalCouponRecordDao extends BaseDomainDao<GlobalCouponRecord> {

	@Override
	protected Class<GlobalCouponRecord> getDomainClass() {
		return GlobalCouponRecord.class;
	}

	public GlobalCouponRecord getGlobalCouponByCode(String couponCode) {
		return getObjectByCondition("couponCode = ?", couponCode);
	}

}
