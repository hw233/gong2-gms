package com.hadoit.game.fsgame.gms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.dao.CouponGenRecordDao;
import com.hadoit.game.fsgame.gms.dao.GlobalCouponRecordDao;
import com.hadoit.game.fsgame.gms.meta.CouponCategroy;
import com.hadoit.game.fsgame.gms.meta.CouponGenRecord;
import com.hadoit.game.fsgame.gms.meta.CouponRecord;
import com.hadoit.game.fsgame.gms.meta.GlobalCouponRecord;
import com.hadoit.game.fsgame.gms.meta.OprGroup;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;

@Transactional
@Component("couponGenRecordService")
public class CouponGenRecordService {
	@Autowired
	private CouponGenRecordDao couponGenRecordDao;

	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;

	@Autowired
	private CouponCategroyService couponCategroyService;

	@Autowired
	private OprGroupService oprGroupService;

	@Autowired
	private GlobalCouponRecordDao globalCouponRecordDao;

	private String genBatchCode(CouponGenRecord cgr) {
		return cgr.getOprGroup() + "_" + cgr.getGiftType() + "_" + cgr.getId();
	}

	public long addCouponGenRecord(CouponGenRecord cgr) {
		CouponCategroy cct = couponCategroyService.getCouponCategroyByType(cgr.getGiftType());
		OprGroup og = oprGroupService.getOprGroup(cgr.getOprGroup());
		if (!loginXmlRpcClientService.touch(og.getOprGroup(), og.getLoginUrl())) {
			// 判断login是否连通
			return -1;
		}
		couponGenRecordDao.addObject(cgr);
		cgr.setBatchCode(genBatchCode(cgr)); // 需要ID才能生成

		Map<String, Object> cpTmpMap = new HashMap<String, Object>();
		cpTmpMap.put("count", cgr.getCount());
		cpTmpMap.put("batchCode", cgr.getBatchCode());
		cpTmpMap.put("giftType", cgr.getGiftType());
		cpTmpMap.put("enable", cgr.getEnable());
		cpTmpMap.put("oprGroup", cgr.getOprGroup());
		cpTmpMap.put("opr", cgr.getOpr());
		cpTmpMap.put("giftId", cct.getGiftId());
		cpTmpMap.put("createTime", cgr.getCreateTime());
		// 拿到实际生成的数量
		long realCreateCount = loginXmlRpcClientService.addCoupons(og.getOprGroup(), og.getLoginUrl(), cpTmpMap, 8);
		cgr.setCount(realCreateCount);
		couponGenRecordDao.updateObject(cgr);
		return realCreateCount;
	}

	public String enableCoupon(long cgrId) {
		CouponGenRecord cgr = couponGenRecordDao.getById(cgrId);
		OprGroup og = oprGroupService.getOprGroup(cgr.getOprGroup());
		String ret = loginXmlRpcClientService.enableByBatchCode(og.getOprGroup(), og.getLoginUrl(), cgr.getBatchCode());
		cgr.setEnable(1);
		couponGenRecordDao.updateObject(cgr);
		return ret;
	}

	public String disableCoupon(long cgrId) {
		CouponGenRecord cgr = couponGenRecordDao.getById(cgrId);
		OprGroup og = oprGroupService.getOprGroup(cgr.getOprGroup());
		String ret = loginXmlRpcClientService.diableByBatchCode(og.getOprGroup(), og.getLoginUrl(), cgr.getBatchCode());
		cgr.setEnable(0);
		couponGenRecordDao.updateObject(cgr);
		return ret;
	}

	public List<CouponRecord> exportCouponRecord(long cgrId) {
		CouponGenRecord cgr = couponGenRecordDao.getById(cgrId);
		OprGroup og = oprGroupService.getOprGroup(cgr.getOprGroup());
		return loginXmlRpcClientService.exportCoupon(og.getOprGroup(), og.getLoginUrl(), cgr.getBatchCode());
	}

	public int getGenCountByGiftType(String giftType) {
		return couponGenRecordDao.getGenCountByGiftType(giftType);
	}

	public List<CouponGenRecord> getAll() {
		List<CouponGenRecord> cgrs = couponGenRecordDao.getAll("createTime", false);
		for (CouponGenRecord cgr : cgrs) {
			OprGroup og = oprGroupService.getOprGroup(cgr.getOprGroup());
			int usedCount = loginXmlRpcClientService.getUsedCouponsCount(og.getOprGroup(), og.getLoginUrl(),
					cgr.getBatchCode());
			cgr.setUseCount(usedCount);
		}
		return cgrs;
	}

	public CouponGenRecord getCouponGenRecord(long id) {
		return couponGenRecordDao.getById(id);
	}

	public String delCouponGenRecord(long id) {
		CouponGenRecord cgr = getCouponGenRecord(id);
		OprGroup og = oprGroupService.getOprGroup(cgr.getOprGroup());
		if (!loginXmlRpcClientService.touch(og.getOprGroup(), og.getLoginUrl())) {
			// 判断login是否连通
			return "FAILURE";
		}
		couponGenRecordDao.deleteById(id);
		return loginXmlRpcClientService.delCoupons(og.getOprGroup(), og.getLoginUrl(), cgr.getBatchCode());
	}

	public CouponRecord getCouponRecordByCode(String oprGroup, String couponId) {
		OprGroup og = oprGroupService.getOprGroup(oprGroup);
		return loginXmlRpcClientService.geCouponsByCode(og.getOprGroup(), og.getLoginUrl(), couponId);
	}
	
	public List<GlobalCouponRecord> getAllGlobalCoupon() {
		List<GlobalCouponRecord> glCoupons = globalCouponRecordDao.getAll("createTime", false);
		return glCoupons;
	}
	
	public GlobalCouponRecord getGlobalCouponRecord(long id) {
		return globalCouponRecordDao.getById(id);
	}
	
	public void addOrUpGlobalCouponRecord(GlobalCouponRecord glCoupon){
		List<GlobalCouponRecord> glCouponRecords = new ArrayList<GlobalCouponRecord>();
		if("".equals(glCoupon.getOprGroup())){
			List<OprGroup> orpGroups = oprGroupService.getAll();
			for(OprGroup og : orpGroups){
				GlobalCouponRecord gcr = new GlobalCouponRecord();
				gcr.setId(glCoupon.getId());
				gcr.setCouponCode(glCoupon.getCouponCode());
				gcr.setCreateTime(glCoupon.getCreateTime());
				gcr.setGiftId(glCoupon.getGiftId());
				gcr.setEnable(glCoupon.getEnable());
				gcr.setOprGroup(og.getOprGroup());
				gcr.setOpr(glCoupon.getOpr());
				glCouponRecords.add(gcr);
			}
		}else{
			glCouponRecords.add(glCoupon);
		}
		for(GlobalCouponRecord gcr: glCouponRecords){
			OprGroup og = oprGroupService.getOprGroup(gcr.getOprGroup());
			if (!loginXmlRpcClientService.touch(og.getOprGroup(), og.getLoginUrl())) {
				// 判断login是否连通
				continue;
			}
			// 生成序列号
			Map<String, Object> glCouponMap = new HashMap<String, Object>();
			glCouponMap.put("id", gcr.getId());
			glCouponMap.put("couponCode", gcr.getCouponCode());
			glCouponMap.put("giftId", gcr.getGiftId());
			glCouponMap.put("enable", gcr.getEnable());
			glCouponMap.put("createTime", gcr.getCreateTime());
			glCouponMap.put("opr", gcr.getOpr());
			long affectRecordCount = loginXmlRpcClientService.addOrUpGlobalCoupon(og.getOprGroup(), og.getLoginUrl(), glCouponMap);
			if(affectRecordCount > 0){
				if(gcr.getId() > 0 ){
					GlobalCouponRecord glCouponRecord = globalCouponRecordDao.getGlobalCouponByCode(glCoupon.getCouponCode());
					glCouponRecord.setEnable(gcr.getEnable());
					glCouponRecord.setGiftId(gcr.getGiftId());
					globalCouponRecordDao.updateObject(glCouponRecord);
				}else{
					globalCouponRecordDao.addObject(gcr);
				}
				
			}
		}
	}

	public void delGlobalCoupon(long id) {
		GlobalCouponRecord gcr = globalCouponRecordDao.getById(id);
		if(gcr != null){
			OprGroup og = oprGroupService.getOprGroup(gcr.getOprGroup());
			if (!loginXmlRpcClientService.touch(og.getOprGroup(), og.getLoginUrl())) {
				// 判断login是否连通
				return;
			}
			long affectRecordCount = loginXmlRpcClientService.delGlobalCoupon(og.getOprGroup(), og.getLoginUrl(), gcr.getCouponCode());
			if(affectRecordCount > 0){
				globalCouponRecordDao.deleteById(id);
			}
		}
	}
	
	public String enableGlobalCoupon(long gcId, boolean enable) {
		GlobalCouponRecord gcr = globalCouponRecordDao.getById(gcId);
		OprGroup og = oprGroupService.getOprGroup(gcr.getOprGroup());
		String ret = loginXmlRpcClientService.enableGlobalCouponByCode(og.getOprGroup(), og.getLoginUrl(), gcr.getCouponCode(), enable);
		gcr.setEnable(enable ? 1 : 0);
		globalCouponRecordDao.updateObject(gcr);
		return ret;
	}
}
