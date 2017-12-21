package com.hadoit.game.fsgame.gms.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.hadoit.game.fsgame.gms.meta.CouponCategroy;
import com.hadoit.game.fsgame.gms.meta.CouponGenRecord;
import com.hadoit.game.fsgame.gms.meta.CouponRecord;
import com.hadoit.game.fsgame.gms.meta.GlobalCouponRecord;
import com.hadoit.game.fsgame.gms.service.CouponCategroyService;
import com.hadoit.game.fsgame.gms.service.CouponGenRecordService;
import com.hadoit.game.fsgame.gms.service.OprGroupService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Controller
public class CouponManagerController extends AbstractController {

	private static String REDIRECT_LIST_CATE_URI = "redirect:cpm?module=cate&action=catelist";

	private static String REDIRECT_LIST_GLOBAL_COUPON_URI = "redirect:cpm?module=glcoupon&action=glcouponlist";

	@Autowired
	private CouponCategroyService couponCategroyService;

	@Autowired
	private CouponGenRecordService couponGenRecordService;

	@Autowired
	private OprGroupService oprGroupService;

	@RequestMapping(value = "/cpm", params = { "module=cate", "action=catelist" })
	public ModelAndView cateList(HttpServletRequest request) {
		List<?> datas = couponCategroyService.getAll();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", datas);
		return getCommonModelAndView("/cpm/catelist", param, request);
	}

	@RequestMapping(value = "/cpm", params = { "module=cate", "action=catecreate" })
	public ModelAndView catecreate(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		CouponCategroy cc;
		if (id > 0) {
			cc = couponCategroyService.getCouponCategroy(id);
		} else {
			cc = new CouponCategroy();
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("data", cc);
		return getCommonModelAndView("/cpm/catecreate", param, request);
	}

	@RequestMapping(value = "/cpm", params = { "module=cate", "action=docatecreate" }, method = { RequestMethod.POST })
	public ModelAndView docatecreate(HttpServletRequest request) throws IOException {
		CouponCategroy cc = FsGameGmsUtils.parseRequestObject(request, CouponCategroy.class);
		if (cc.getId() > 0) {
			// 更新
			couponCategroyService.updateCouponCategroy(cc);
		} else {
			cc.setCreateTime(System.currentTimeMillis());
			couponCategroyService.addCouponCategroy(cc);
		}
		return new ModelAndView(REDIRECT_LIST_CATE_URI);
	}

	@RequestMapping(value = "/cpm", params = { "module=cate", "action=delcate" }, method = { RequestMethod.POST })
	public ModelAndView delcate(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		couponCategroyService.delCouponCategroy(id);
		return new ModelAndView(REDIRECT_LIST_CATE_URI);
	}

	@RequestMapping(value = "/cpm", params = { "module=batch", "action=batchlist" })
	public ModelAndView batchList(HttpServletRequest request) {
		List<?> datas = couponGenRecordService.getAll();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", datas);
		return getCommonModelAndView("/cpm/batchlist", param, request);
	}

	@RequestMapping(value = "/cpm", params = { "module=batch", "action=batchcreate" })
	public ModelAndView batchcreate(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		CouponGenRecord ccr;
		if (id > 0) {
			ccr = couponGenRecordService.getCouponGenRecord(id);
		} else {
			ccr = new CouponGenRecord();
		}
		List<?> oprGroupList = oprGroupService.getAll();
		List<?> giftTypes = couponCategroyService.getAll();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("data", ccr);
		param.put("giftTypes", giftTypes);
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/cpm/batchcreate", param, request);
	}
	@RequestMapping(value = "/cpm", params = { "module=batch", "action=batchqlist" }, method = { RequestMethod.POST })
	@ResponseBody
	public String batchqlist(@RequestParam(value = "oprid", defaultValue = "") String oprid) {
		String oprString="";
		if (oprid!="") {
			 oprString=oprGroupService.getOprStr(oprid);
		
		}else{
			oprString="";	
	    }
		return oprString;
     }
	@RequestMapping(value = "/cpm", params = { "module=batch", "action=dobatchcreate" }, method = { RequestMethod.POST })
	@ResponseBody
	public String dobatchcreate(HttpServletRequest request) throws IOException {
		CouponGenRecord cgr = FsGameGmsUtils.parseRequestObject(request, CouponGenRecord.class);
		cgr.setCreateTime(System.currentTimeMillis());
		return String.valueOf(couponGenRecordService.addCouponGenRecord(cgr));
	}

	@RequestMapping(value = "/cpm", params = { "module=batch", "action=batchexport" })
	public ModelAndView batchExport(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		List<?> datas = couponGenRecordService.exportCouponRecord(id);
		CouponGenRecord cgr = couponGenRecordService.getCouponGenRecord(id);
		Map<String, Object> reportParams = new HashMap<String, Object>();
		Map<String,String> fixed =new HashMap<String,String>();
		fixed.put("oprGroup", cgr.getOprGroup());
		fixed.put("opr", cgr.getOpr());
		reportParams.put("reportName", FsGameGmsConst.REPORT_NAME_COUPON);
		reportParams.put("reportDatas", datas);
		reportParams.put("fixedColumnVals", fixed);
		return getXlsModelAndView(reportParams);
	}

	@RequestMapping(value = "/cpm", params = { "module=coupon", "action=couponlist" })
	public ModelAndView couponList(@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "couponCode", defaultValue = "") String couponCode, HttpServletRequest request) {
		List<CouponRecord> cpList = new ArrayList<CouponRecord>();
		if (!StringUtils.isEmpty(oprGroup) && !StringUtils.isEmpty(couponCode)) {
			CouponRecord cp = couponGenRecordService.getCouponRecordByCode(oprGroup, couponCode);
			if (cp != null) {
				cpList.add(cp);
			}
		}
		List<?> oprGroupList = oprGroupService.getAll();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", cpList);
		param.put("oprGroup", oprGroup);
		param.put("couponCode", couponCode);
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/cpm/couponlist", param, request);
	}

	@RequestMapping(value = "/cpm", params = { "module=glcoupon", "action=glcouponlist" })
	public ModelAndView glcouponlist(HttpServletRequest request) {
		List<?> datas = couponGenRecordService.getAllGlobalCoupon();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", datas);
		return getCommonModelAndView("/cpm/glcouponlist", param, request);
	}

	@RequestMapping(value = "/cpm", params = { "module=glcoupon", "action=glcouponcreate" })
	public ModelAndView glcouponcreate(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		GlobalCouponRecord gcr;
		if (id > 0) {
			gcr = couponGenRecordService.getGlobalCouponRecord(id);
		} else {
			gcr = new GlobalCouponRecord();
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("data", gcr);
		return getCommonModelAndView("/cpm/glcouponcreate", param, request);
	}

	@RequestMapping(value = "/cpm", params = { "module=glcoupon", "action=doglcouponcreate" }, method = { RequestMethod.POST })
	@ResponseBody
	public ModelAndView doglcouponcreate(HttpServletRequest request) throws IOException {
		GlobalCouponRecord cgr = FsGameGmsUtils.parseRequestObject(request, GlobalCouponRecord.class);
		if(cgr.getId() <= 0){
			cgr.setCreateTime(System.currentTimeMillis());
		}
		couponGenRecordService.addOrUpGlobalCouponRecord(cgr);
		return new ModelAndView(REDIRECT_LIST_GLOBAL_COUPON_URI);
	}
	
	@RequestMapping(value = "/cpm", params = { "module=glcoupon", "action=delglcoupon" }, method = { RequestMethod.POST })
	public ModelAndView delglcoupon(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		couponGenRecordService.delGlobalCoupon(id);
		return new ModelAndView(REDIRECT_LIST_GLOBAL_COUPON_URI);
	}
}
