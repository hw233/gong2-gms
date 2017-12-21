package com.hadoit.game.fsgame.gms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.dao.CouponCategroyDao;
import com.hadoit.game.fsgame.gms.meta.CouponCategroy;

@Transactional
@Component("couponCategroyService")
public class CouponCategroyService {

	@Autowired
	private CouponCategroyDao couponCategroyDao;

	@Autowired
	private CouponGenRecordService couponGenRecordService;

	public List<CouponCategroy> getAll() {
		List<CouponCategroy> allCcList = couponCategroyDao.getAll("createTime", false);
		for (CouponCategroy cc : allCcList) {
			cc.setGenCount(couponGenRecordService.getGenCountByGiftType(cc.getGiftType()));
		}
		return allCcList;
	}

	public void addCouponCategroy(CouponCategroy cct) {
		couponCategroyDao.addObject(cct);
	}

	public void delCouponCategroy(long id) {
		couponCategroyDao.deleteById(id);
	}

	public void updateCouponCategroy(CouponCategroy cct) {
		couponCategroyDao.updateObject(cct);
	}

	public CouponCategroy getCouponCategroyByType(String giftType) {
		return couponCategroyDao.getCouponCategroyByType(giftType);
	}

	public CouponCategroy getCouponCategroy(long id) {
		return couponCategroyDao.getById(id);
	}

}
