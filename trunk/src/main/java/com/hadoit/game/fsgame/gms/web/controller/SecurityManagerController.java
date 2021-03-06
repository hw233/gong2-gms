package com.hadoit.game.fsgame.gms.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.common.framework.web.security.UserDetails;
import com.hadoit.game.fsgame.gms.dao.SecurityInfoDao;
import com.hadoit.game.fsgame.gms.dao.UserLogsDao;
import com.hadoit.game.fsgame.gms.meta.Page;
import com.hadoit.game.fsgame.gms.meta.SecurityInfo;
import com.hadoit.game.fsgame.gms.meta.SendProduct;
import com.hadoit.game.fsgame.gms.meta.SystemRewardMsg;
import com.hadoit.game.fsgame.gms.meta.UserLogs;
import com.hadoit.game.fsgame.gms.service.OprGroupService;
import com.hadoit.game.fsgame.gms.service.RollMsgService;
import com.hadoit.game.fsgame.gms.service.SecurityInfoService;
import com.hadoit.game.fsgame.gms.service.SendProductService;
import com.hadoit.game.fsgame.gms.service.SystemRewardMsgService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.config.data.ItemData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;

@Controller
public class SecurityManagerController extends AbstractController {

	private static String REDIRECT_LIST_SRV_URI = "redirect:se?module=sec&action=seclist";

	@Autowired
	private SecurityInfoService securityInfoService;

	@Autowired
	private OprGroupService oprGroupService;

	@Autowired
	private SystemRewardMsgService systemRewardMsgService;

	@Autowired
	private SendProductService sendProductService;

	@Autowired
	private RollMsgService rollMsgService;

	@Autowired
	private SecurityInfoDao securityInfoDao;
	
	@Autowired
	private UserLogsDao userLogsDao;

	@RequestMapping(value = "/se", params = { "module=sec", "action=seclist" })
	public ModelAndView seclist(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			HttpServletRequest request) {

		// 超级用户过滤
		List<SecurityInfo> all = null;
		UserDetails userDetails = SecurityContextHolder.getSessionAuthInfo();
		if (userDetails.getRoles()[0].equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)
				|| userDetails.getRoles()[0].equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING)) {
			all = securityInfoService.getAllList();
		} else {
			all = new ArrayList<SecurityInfo>();
			List<SecurityInfo> temps = securityInfoService.getAllList();
			for (SecurityInfo tempsi : temps) {
				String owner = tempsi.getAccount();
				SecurityInfo si = securityInfoDao.getSecurityInfoByAccount(owner);
				if (si != null && (!si.getRoleType().equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)
						&& !si.getRoleType().equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING))) {
					all.add(tempsi);
				}
			}
		}

		int allSize = securityInfoService.getAllCount();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srvs", all);
		param.put("page", new Page(allSize, allSize, curPage));
		return getCommonModelAndView("/se/seclist", param, request);
	}

	@RequestMapping(value = "/se", params = { "module=passreward", "action=passrewardlist" })
	public ModelAndView passrewardlist(
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage, HttpServletRequest request) {

		// 超级用户过滤
		List<SystemRewardMsg> all = null;

		UserDetails userDetails = SecurityContextHolder.getSessionAuthInfo();
		if (userDetails.getRoles()[0].equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)
				|| userDetails.getRoles()[0].equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING)) {
			// all=systemRewardMsgService.getAllSystemRewardMsg(limit,
			// getOffset(limit, curPage));
			all = new ArrayList<SystemRewardMsg>();
			List<SystemRewardMsg> temps = systemRewardMsgService.getAllSystemRewardMsg(limit,
					getOffset(limit, curPage));
			for (SystemRewardMsg systemRewardMsg : temps) {
				String[] itemarray = systemRewardMsg.getItemIds().split("\\|");
				String itemname = "";
				for (int i = 0; i < itemarray.length; i++) {
					LMap itemTmp = new LMap();
					if (itemarray[i] != "") {
						itemTmp = ItemData.data.getMap(Integer.parseInt(itemarray[i]));
					} else {
						itemTmp = ItemData.data.getMap(itemarray[i]);
					}

					if (itemTmp != null) {
						itemarray[i] = itemTmp.getString("name", "");
					} else {
						itemarray[i] = "没有当前物品";
					}

					itemname = itemname + itemarray[i] + "|";
				}
				systemRewardMsg.setItemIds(itemname);
				all.add(systemRewardMsg);
			}

		} else {
			all = new ArrayList<SystemRewardMsg>();
			List<SystemRewardMsg> temps = systemRewardMsgService.getAllSystemRewardMsg(limit,
					getOffset(limit, curPage));
			for (SystemRewardMsg systemRewardMsg : temps) {
				String owner = systemRewardMsg.getOwner();
				String[] itemarray = systemRewardMsg.getItemIds().trim().split("\\|");
				String itemname = "";
				for (int i = 0; i < itemarray.length; i++) {
					LMap itemTmp = new LMap();
					if (itemarray[i] != "") {
						itemTmp = ItemData.data.getMap(Integer.parseInt(itemarray[i]));
					} else {
						itemTmp = ItemData.data.getMap(itemarray[i]);
					}

					if (itemTmp != null) {
						itemarray[i] = itemTmp.getString("name", "");
					} else {
						itemarray[i] = "没有当前物品";
					}

					itemname = itemname + itemarray[i] + "|";
				}
				systemRewardMsg.setItemIds(itemname);
				SecurityInfo si = securityInfoDao.getSecurityInfoByAccount(owner);
				if (si != null && (!si.getRoleType().equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)
						&& !si.getRoleType().equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING))) {
					all.add(systemRewardMsg);
				}
			}
		}
		int total = systemRewardMsgService.getAllSystemRewardMsgCount();
		List<?> oprGroupList = oprGroupService.getAll();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srms", all);
		param.put("page", new Page(total, limit, curPage));
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/se/passrewardlist", param, request);
	}

	@RequestMapping(value = "/se", params = { "module=productnotice", "action=productnoticelist" })
	public ModelAndView productnoticelist(
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage, HttpServletRequest request) {

		List<SendProduct> all = sendProductService.getAllProductMsg(limit, getOffset(limit, curPage));
		int total = sendProductService.getAllProductMsgCount();
		List<?> oprGroupList = oprGroupService.getAll();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srms", all);
		param.put("page", new Page(total, limit, curPage));
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/se/productnoticelist", param, request);
	}

	@RequestMapping(value = "/se", params = { "module=czrz", "action=czrzlist" })
	public ModelAndView czrzlist(HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<UserLogs> all =userLogsDao.getAll(100, 1);
		param.put("datas", all);
		return getCommonModelAndView("/se/czrz", param, request);
	}

	@RequestMapping(value = "/se", params = { "module=sec", "action=seccreate" })
	public ModelAndView seccreate(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		SecurityInfo si = null;
		if (id > 0) {
			si = securityInfoService.getSecurityInfoById(id);
			si.setPassword("");
		} else {
			si = new SecurityInfo();
		}

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("si", si);
		return getCommonModelAndView("/se/seccreate", param, request);
	}

	@RequestMapping(value = "/se", params = { "module=sec", "action=doseccreate" }, method = { RequestMethod.POST })
	public ModelAndView doseccreate(HttpServletRequest request) {
		SecurityInfo si = FsGameGmsUtils.parseRequestObject(request, SecurityInfo.class);
		if (si.getId() <= 0) {
			si.setCreateTime(System.currentTimeMillis());
			si.setPassword(si.getPassword());
			boolean ret = securityInfoService.addSecurityInfo(si);
			if (!ret) {
				throw new RuntimeException("增加用户错误！");
			}
		} else {
			SecurityInfo oldSi = securityInfoService.getSecurityInfoById(si.getId());
			si.setCreateTime(oldSi.getCreateTime());
			si.setPassword(oldSi.getPassword());
			securityInfoService.updateSecurityInfo(si);
		}
		return new ModelAndView(REDIRECT_LIST_SRV_URI);
	}

	@RequestMapping(value = "/se", params = { "module=sec", "action=delsec" }, method = { RequestMethod.POST })
	public ModelAndView secdelete(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		if (!securityInfoService.deleteById(id)) {
			throw new RuntimeException("删除用户错误！");
		}

		return new ModelAndView(REDIRECT_LIST_SRV_URI);
	}

}
