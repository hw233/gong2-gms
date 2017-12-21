package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.CouponCategroy;

/**
 * 
 * @author apple
 *
 */
@Component("couponCategroyDao")
public class CouponCategroyDao extends BaseDomainDao<CouponCategroy> {

	@Override
	protected Class<CouponCategroy> getDomainClass() {
		return CouponCategroy.class;
	}

	public CouponCategroy getCouponCategroyByType(String giftType) {
		return getObjectByCondition("giftType = ?", giftType);
	}

}
