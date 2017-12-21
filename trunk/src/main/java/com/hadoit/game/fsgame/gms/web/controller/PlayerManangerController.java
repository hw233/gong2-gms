package com.hadoit.game.fsgame.gms.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.metadata.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.common.framework.web.security.UserDetails;
import com.hadoit.game.common.lang.DataUtils;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.engine.core.protocol.json.GsonFactory;
import com.hadoit.game.fsgame.gms.dao.SecurityInfoDao;
import com.hadoit.game.fsgame.gms.gfs.FileStorageManager;
import com.hadoit.game.fsgame.gms.meta.ItemInfo;
import com.hadoit.game.fsgame.gms.meta.Notice;
import com.hadoit.game.fsgame.gms.meta.Page;
import com.hadoit.game.fsgame.gms.meta.PlayBuild;
import com.hadoit.game.fsgame.gms.meta.PlayMessage;
import com.hadoit.game.fsgame.gms.meta.PlayerInfo;
import com.hadoit.game.fsgame.gms.meta.RollMsg;
import com.hadoit.game.fsgame.gms.meta.SecurityInfo;
import com.hadoit.game.fsgame.gms.meta.SendProduct;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.meta.SystemRewardMsg;
import com.hadoit.game.fsgame.gms.meta.log.CriticalLog;
import com.hadoit.game.fsgame.gms.meta.log.CurrencyChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.ExpChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.GoldChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.ItemChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.MoneyChangeLog;
import com.hadoit.game.fsgame.gms.service.AdminService;
import com.hadoit.game.fsgame.gms.service.GasService;
import com.hadoit.game.fsgame.gms.service.LogService;
import com.hadoit.game.fsgame.gms.service.OprGroupService;
import com.hadoit.game.fsgame.gms.service.RollMsgService;
import com.hadoit.game.fsgame.gms.service.SendProductService;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;
import com.hadoit.game.fsgame.gms.service.SystemRewardMsgService;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Controller
public class PlayerManangerController extends AbstractController {
	public static final String DEFAULT_SIZE_STR = "20";

	private final static String DEFAULT_DATE_FORMAT = "yyyy/MM/dd";

	private static String REDIRECT_LIST_SRM_URI = "redirect:pm?module=reward&action=rewardlist";

	private static String REDIRECT_LIST_SENDPRODUCT_URI = "redirect:pm?module=sendProduct&action=sendProductList";

	private static String REDIRECT_LIST_ROLL_URI = "redirect:pm?module=roll&action=rolllist";

	private static long oneDayMillis = 24 * 60 * 60 * 1000;

	@Autowired
	private GasService gasService;

	@Autowired
	private LogService logService;

	@Autowired
	private SystemRewardMsgService systemRewardMsgService;

	@Autowired
	private SendProductService sendProductService;

	@Autowired
	private RollMsgService rollMsgService;

	@Autowired
	private ServerInfoService serverInfoService;

	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;

	@Autowired
	private OprGroupService oprGroupService;

	@Autowired
	private FileStorageManager fileStorageManager;

	@Autowired
	private SecurityInfoDao securityInfoDao;
	
	@Autowired
	private AdminService adminService;

	@RequestMapping(params = { "module=player", "action=playerlist" }, value = "/pm")
	public ModelAndView playerList(@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "vipLv", defaultValue = "99") int vipLv,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayerInfo> ous = new ArrayList<PlayerInfo>();
		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}
		int total = 0;

		if (gbId > 0 || StringUtils.isNotBlank(userName) || StringUtils.isNotBlank(accountName)) {
			String realAccount = "";
			if (gbId > 0) {
				realAccount = gasService.getAccountNameByGbId(serverId, oprGroup, gbId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				realAccount = accountName;
			}
			ous = gasService.searchPlayerList(serverId, oprGroup, realAccount, userName);
			if (ous != null) {
				total = ous.size();
			}
		} else {
			Pair<Integer, List<PlayerInfo>> p = gasService.getPlayerList(serverId, oprGroup, vipLv, limit,
					getOffset(limit, curPage));
			if (p != null) {
				total = p.getFirst();
				ous = p.getSecond();
			}
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("userName", StringUtils.trimToEmpty(userName));
		param.put("accountName", StringUtils.trimToEmpty(accountName));
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("vipLv", vipLv);
		return getCommonModelAndView("/pm/playerlist", param, request);
	}

	/*
	 * 此控制器用于服务器读取玩家身上物品 梁波
	 */
	@RequestMapping(params = { "module=playeritem", "action=playlist" }, value = "/pm")
	public ModelAndView playeritem(@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayerInfo> ous = new ArrayList<PlayerInfo>();
		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}
		int total = 0;

		if (gbId > 0 || StringUtils.isNotBlank(userName) || StringUtils.isNotBlank(accountName)) {
			String realAccount = "";
			if (gbId > 0) {
				realAccount = gasService.getAccountNameByGbId(serverId, oprGroup, gbId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				realAccount = accountName;
			}
			ous = gasService.searchPlayerList(serverId, oprGroup, realAccount, userName);
			if (ous != null) {
				total = ous.size();
			}
		} else {
			Pair<Integer, List<PlayerInfo>> p = gasService.getPlayerList(serverId, oprGroup, limit,
					getOffset(limit, curPage));
			if (p != null) {
				total = p.getFirst();
				ous = p.getSecond();
			}
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("userName", StringUtils.trimToEmpty(userName));
		param.put("accountName", StringUtils.trimToEmpty(accountName));
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		return getCommonModelAndView("/pm/playeritem", param, request);
	}

	@RequestMapping(params = { "module=resource", "action=resourcelist" }, value = "/pm")
	public ModelAndView resourceList(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "roleName", defaultValue = "") String roleName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "rtType", defaultValue = "80001") String rtType, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();

		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}

		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + oneDayMillis, DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);

		int total = 0;
		List<?> ous = new ArrayList<Object>();
		int rtType2 = Integer.valueOf(rtType);

		String accountName = "";
		if (gbId > 0) {
			accountName = gasService.getAccountNameByGbId(serverId, oprGroup, gbId);
		}
		if (rtType2 == FsGameGmsUtils.ITEM_ID_MONEY) {
			Pair<Integer, List<MoneyChangeLog>> p = logService.searchMoneyChangeLog(serverId, oprGroup, accountName,
					roleName, pd.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
			if (p != null) {
				ous = p.getSecond();
				total = p.getFirst();
			}
		} else if (rtType2 == FsGameGmsUtils.ITEM_ID_GOLD) {
			Pair<Integer, List<GoldChangeLog>> p = logService.searchGoldChangeLog(serverId, oprGroup, accountName,
					roleName, pd.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
			if (p != null) {
				ous = p.getSecond();
				total = p.getFirst();
			}
		} else if (rtType2 == FsGameGmsUtils.ITEM_ID_EXP) {
			Pair<Integer, List<ExpChangeLog>> p = logService.searchExpChangeLog(serverId, oprGroup, accountName,
					roleName, pd.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
			if (p != null) {
				ous = p.getSecond();
				total = p.getFirst();
			}
		} else {
			Pair<Integer, List<CurrencyChangeLog>> p = logService.searchCurrencyChangeLog(serverId, oprGroup, rtType2,
					accountName, roleName, pd.getFirst().getTime(), pd.getSecond().getTime(), limit,
					getOffset(limit, curPage));
			if (p != null) {
				ous = p.getSecond();
				total = p.getFirst();
			}
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("roleName", StringUtils.trimToEmpty(roleName));
		param.put("qryVal", qryVal);
		param.put("rtType", rtType);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		return getCommonModelAndView("/pm/resourcelist", param, request);
	}
    //玩家账号管理
	@RequestMapping(params = { "module=playeraccount", "action=accountlist" }, value = "/pm")
	public ModelAndView accountlist(@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "vipLv", defaultValue = "99") int vipLv,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayerInfo> ous = new ArrayList<PlayerInfo>();
		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}
		int total = 0;

		if (gbId > 0 || StringUtils.isNotBlank(userName) || StringUtils.isNotBlank(accountName)) {
			String realAccount = "";
			if (gbId > 0) {
				realAccount = gasService.getAccountNameByGbId(serverId, oprGroup, gbId);
			}
			if (StringUtils.isNotBlank(accountName)) {
				realAccount = accountName;
			}
			ous = gasService.searchPlayerList(serverId, oprGroup, realAccount, userName);
			for(PlayerInfo value:ous)
			{
//				value.setAccountgroup(loginXmlRpcClientService.getGameaccount(oprGroup, value.getAccountName()));
			}
			if (ous != null) {
				total = ous.size();
			}
		} else {
			Pair<Integer, List<PlayerInfo>> p = gasService.getPlayerList(serverId, oprGroup, vipLv, limit,
					getOffset(limit, curPage));
			if (p != null) {
				total = p.getFirst();
				ous = p.getSecond();
			}
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("userName", StringUtils.trimToEmpty(userName));
		param.put("accountName", StringUtils.trimToEmpty(accountName));
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("vipLv", vipLv);
		return getCommonModelAndView("/pm/accountlist", param, request);
	}
	// 转盘次数修改
	@RequestMapping(params = { "module=player", "action=zhuanpanedit" }, value = "/pm")
	public ModelAndView zhuanpanedit(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "id", defaultValue = "") String uid,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "username", defaultValue = "") String userName,
			@RequestParam(value = "zhuanPanXF", defaultValue = "") String zhuanPanXF,
			@RequestParam(value = "zhuanPanCZ", defaultValue = "") String zhuanPanCZ,
			@RequestParam(value = "dbID", defaultValue = "0") int dbID, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayerInfo> ous = new ArrayList<PlayerInfo>();
		String realAccount = accountName;
		userName = gasService.getAccountRoleByGbId(serverId, oprGroup, uid);
		ous = gasService.searchPlayerList(serverId, oprGroup, realAccount, userName);
		zhuanPanXF = zhuanPanXF.replace("{", "");
		zhuanPanXF = zhuanPanXF.replace("}", "");
		zhuanPanXF = zhuanPanXF.replace(".0", "");
		zhuanPanCZ = zhuanPanCZ.replace("}", "");
		zhuanPanCZ = zhuanPanCZ.replace("{", "");
		zhuanPanCZ = zhuanPanCZ.replace(".0", "");
		if (!StringUtils.isEmpty(zhuanPanXF) || !StringUtils.isEmpty(zhuanPanCZ)) {
			gasService.zhuanpanedit(serverId, oprGroup, uid, dbID, zhuanPanCZ, zhuanPanXF);
			ModelAndView view = new ModelAndView();
			view.setViewName("redirect:/gms/pm?module=player&action=playerlist");
			return view;
		}
		for (PlayerInfo item : ous) {
			if (item.getZhuanPanCZ() != null && item.getZhuanPanXF() != null) {
				item.setZhuanPanCZ(item.getZhuanPanCZ().toString());
				item.setZhuanPanXF(item.getZhuanPanXF().toString());
			}

		}
		param.put("datas", ous);
		param.put("oprGroup", oprGroup);
		param.put("serverId", serverId);
		param.put("accountName", accountName);
		param.put("userName", userName);
		param.put("dbID", dbID);
		param.put("id", uid);
		return getCommonModelAndView("/pm/zhuanpanedit", param, request);

	}

	@RequestMapping(value = "/pm", params = { "module=reward", "action=rewardlist" })
	public ModelAndView rewardlist(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			HttpServletRequest request) {

		// 超级用户过滤
		List<SystemRewardMsg> all = null;
		UserDetails userDetails = SecurityContextHolder.getSessionAuthInfo();
		if (userDetails.getRoles()[0].equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)
				|| userDetails.getRoles()[0].equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING)) {
			all = systemRewardMsgService.getAllSystemRewardMsg(limit, getOffset(limit, curPage));
		} else {
			all = new ArrayList<SystemRewardMsg>();
			List<SystemRewardMsg> temps = systemRewardMsgService.getAllSystemRewardMsg(limit,
					getOffset(limit, curPage));
			for (SystemRewardMsg systemRewardMsg : temps) {
				String owner = systemRewardMsg.getOwner();
				SecurityInfo si = securityInfoDao.getSecurityInfoByAccount(owner);
				if (si != null && (!si.getRoleType().equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)
						&& !si.getRoleType().equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING))) {
					all.add(systemRewardMsg);
				}
			}
		}

		int total = systemRewardMsgService.getAllSystemRewardMsgCount();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srms", all);
		param.put("page", new Page(total, limit, curPage));
		return getCommonModelAndView("/pm/rewardlist", param, request);
	}

	@RequestMapping(params = { "module=sendProduct", "action=sendProductList" }, value = "/pm")
	public ModelAndView sendProductList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit, HttpServletRequest request) {

		List<SendProduct> all = sendProductService.getAllProductMsg(limit, getOffset(limit, curPage));
		int total = sendProductService.getAllProductMsgCount();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srms", all);
		param.put("page", new Page(total, limit, curPage));

		return getCommonModelAndView("/pm/sendProductList", param, request);

	}

	@RequestMapping(value = "/pm", params = { "module=reward", "action=rewardcreate" })
	public ModelAndView rewardcreate(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {

		SystemRewardMsg srm = null;
		if (id > 0) {
			srm = systemRewardMsgService.getSystemRewardMsg(id);
		} else {
			srm = new SystemRewardMsg();
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srm", srm);
		return getCommonModelAndView("/pm/rewardcreate", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=sendProduct", "action=createsendproduct" })
	public ModelAndView createsendproduct(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {

		SendProduct srm = null;
		if (id > 0) {
			srm = sendProductService.getProductMsg(id);
		} else {
			srm = new SendProduct();
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srm", srm);
		return getCommonModelAndView("/pm/createsendproduct", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=reward", "action=dorewardcreate" }, method = {
			RequestMethod.POST })
	public ModelAndView dorewardcreate(HttpServletRequest request) {
		SystemRewardMsg srm = FsGameGmsUtils.parseRequestObject(request, SystemRewardMsg.class);
		srm.setCreateTime(System.currentTimeMillis());
		if (srm.getId() <= 0) {
			systemRewardMsgService.addSystemRewardMsg(srm);
		} else {
			systemRewardMsgService.updateSystemRewardMsg(srm);
		}
		return new ModelAndView(REDIRECT_LIST_SRM_URI);
	}

	@RequestMapping(value = "/pm", params = { "module=sendProduct", "action=dosendproduct" }, method = {
			RequestMethod.POST })
	public ModelAndView dosendproduct(HttpServletRequest request) {
		SendProduct srm = FsGameGmsUtils.parseRequestObject(request, SendProduct.class);
		srm.setCreateTime(System.currentTimeMillis());
		if (srm.getId() <= 0) {

			sendProductService.addProductMsg(srm);
		} else {

			sendProductService.updateProductMsg(srm);
		}
		return new ModelAndView(REDIRECT_LIST_SENDPRODUCT_URI);
	}

	@RequestMapping(value = "/pm", params = { "module=reward", "action=delsrm" })
	public ModelAndView delsrm(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		if (id > 0) {
			systemRewardMsgService.deleteSystemRewardMsg(id);
		}
		return new ModelAndView(REDIRECT_LIST_SRM_URI);
	}

	@RequestMapping(value = "/pm", params = { "module=sendProduct", "action=delsendproduct" })
	public ModelAndView delsendproduct(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		if (id > 0) {
			sendProductService.deleteProductMsg(id);
		}
		return new ModelAndView(REDIRECT_LIST_SENDPRODUCT_URI);
	}

	@RequestMapping(value = "/pm", params = { "module=roll", "action=rolllist" })
	public ModelAndView rolllist(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			HttpServletRequest request) {
		List<?> all = rollMsgService.searchRollMsgList(limit, getOffset(limit, curPage));
		int total = rollMsgService.searchRollMsgCount();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("page", new Page(total, limit, curPage));
		return getCommonModelAndView("/pm/rolllist", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=roll", "action=rollcreate" })
	public ModelAndView rollcreate(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		RollMsg rm = null;
		if (id > 0) {
			rm = rollMsgService.getRollMsg(id);
		} else {
			rm = new RollMsg();
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("dt", rm);
		return getCommonModelAndView("/pm/rollcreate", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=roll", "action=dorollcreate" }, method = { RequestMethod.POST })
	public ModelAndView dorollcreate(HttpServletRequest request) {
		RollMsg rm = FsGameGmsUtils.parseRequestObject(request, RollMsg.class);
		Date startTime = FsGameGmsUtils.parseRequestDate(request, "data[startTime]", null);
		Date endTime = FsGameGmsUtils.parseRequestDate(request, "data[endTime]", null);
		rm.setStartTime(startTime.getTime());
		rm.setEndTime(endTime.getTime());
		rm.setCreateTime(System.currentTimeMillis());
		if (rm.getId() <= 0) {
			rollMsgService.addRollMsg(rm);
		} else {
			rollMsgService.updateRollMsg(rm);
		}
		return new ModelAndView(REDIRECT_LIST_ROLL_URI);
	}

	@RequestMapping(value = "/pm", params = { "module=roll", "action=delroll" })
	public ModelAndView delroll(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		if (id > 0) {
			rollMsgService.delRollMsgs(new long[] { id });
		}
		return new ModelAndView(REDIRECT_LIST_ROLL_URI);
	}

	@RequestMapping(value = "/pm", params = { "module=criticallog", "action=criticalloglist" })
	public ModelAndView criticallogalllist(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "roleName", defaultValue = "") String roleName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal, HttpServletRequest request) {

		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}

		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + oneDayMillis, DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		String accountName = "";
		if (gbId > 0) {
			accountName = gasService.getAccountNameByGbId(serverId, oprGroup, gbId);
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);
		Pair<Integer, List<CriticalLog>> criticalLogData = logService.searchCriticalLog(serverId, oprGroup, accountName,
				roleName, pd.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = criticalLogData.getFirst();
		List<CriticalLog> all = criticalLogData.getSecond();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("roleName", StringUtils.trimToEmpty(roleName));
		param.put("qryVal", qryVal);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);

		return getCommonModelAndView("/pm/criticallist", param, request);
	}

	@RequestMapping(params = { "module=chargerecd", "action=chargerecdlist" }, value = "/pm")
	public ModelAndView chargerecd(@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}

		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + oneDayMillis, DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);

		List<?> ous = new ArrayList<Object>();
		int total = 0;
		Pair<Integer, List<Map<String, Object>>> p = logService.searchPlayerChargeRecordList(serverId, oprGroup,
				pd.getFirst().getTime(), pd.getSecond().getTime(), gbId, userName, limit, getOffset(limit, curPage));
		if (p != null) {
			total = p.getFirst();
			ous = p.getSecond();
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("userName", StringUtils.trimToEmpty(userName));
		param.put("qryVal", qryVal);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("totalChargeAmount", logService.getTotalChargeAmount(serverId, oprGroup));
		return getCommonModelAndView("/pm/chargerecdlist", param, request);
	}

	@RequestMapping(params = { "module=feedback", "action=feedbacklist" }, value = "/pm")
	public ModelAndView feedbackList(@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<Map<String, Object>> datas = new ArrayList<Map<String, Object>>();
		if (StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			oprGroup = si.getOprGroup();
		}
		Pair<Integer, List<Map<String, Object>>> fbPair = loginXmlRpcClientService.getFeedbackList(oprGroup, limit,
				getOffset(limit, curPage) + "");
		int total = 0;
		if (fbPair != null) {
			total = fbPair.getFirst();
			datas = fbPair.getSecond();
		}

		List<?> oprGroupList = oprGroupService.getAll();
		param.put("ogl", oprGroupList);
		param.put("datas", datas);
		param.put("page", new Page(total, limit, curPage));
		param.put("oprGroup", oprGroup);
		return getCommonModelAndView("/pm/feedbacklist", param, request);
	}

	@RequestMapping(params = { "module=item", "action=itemlist" }, value = "/pm")
	public ModelAndView resourceList1(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "itemTemplateId", defaultValue = "0") int itemTemplateId,
			@RequestParam(value = "tp_dateTime", defaultValue = "") String tp_dateTime,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		if (StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			oprGroup = si.getOprGroup();
			serverId = si.getServerId();
		}

		boolean notQry = (gbId <= 0 && StringUtils.isBlank(accountName)) || itemTemplateId <= 0;
		if (StringUtils.isEmpty(tp_dateTime)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + oneDayMillis, DEFAULT_DATE_FORMAT);
			tp_dateTime = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(tp_dateTime, DEFAULT_DATE_FORMAT);

		int total = 0;
		List<?> ous = new ArrayList<Object>();
		if (!notQry) {
			Pair<Integer, List<ItemChangeLog>> p = logService.searchItemChangeLog(serverId, oprGroup, accountName, gbId,
					itemTemplateId, pd.getFirst().getTime(),pd.getSecond().getTime(), limit, getOffset(limit, curPage));
			if (p != null) {
				ous = p.getSecond();
				total = p.getFirst();
			}
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId <= 0 ? null : gbId);
		param.put("accountName", StringUtils.trimToEmpty(accountName));
		param.put("itemTemplateId", itemTemplateId <= 0 ? null : itemTemplateId);
		param.put("tp_dateTime", tp_dateTime);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		return getCommonModelAndView("/pm/itemlist", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=passnotice", "action=passnoticelist" })
	public ModelAndView passnoticelist(
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage, HttpServletRequest request) {

		List<?> all = rollMsgService.searchRollMsgList(limit, getOffset(limit, curPage));
		int total = rollMsgService.searchRollMsgCount();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srms", all);
		param.put("page", new Page(total, limit, curPage));
		return getCommonModelAndView("/pm/passnoticelist", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=liaotian",
			"action=monitor" }, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object liaotianMonitor(@RequestParam(value = "oprGroup") String oprGroup,
			@RequestParam(value = "serverId", defaultValue = "1") int serverId,
			@RequestParam(value = "filePos", defaultValue = "0") long filePos, HttpServletRequest request) {
		Pair<Long, String> ret = fileStorageManager
				.readLines(FsGameGmsUtils.getServerAndOprGroupIdentify(serverId, oprGroup), filePos);
		Map<String, Object> retJson = new HashMap<String, Object>();
		if (ret == null) {
			ret = Pair.newInstance(0l, "未知异常!");
		}
		retJson.put("filePos", ret.getFirst());
		retJson.put("fileLines", ret.getSecond());
		return retJson;
	}

	@RequestMapping(value = "/pm", params = { "module=liaotian", "action=index" })
	public ModelAndView liaotianIndex(HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		return getCommonModelAndView("/pm/liaotianmonitor", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=notice", "action=addnotice" })
	public ModelAndView addNotice(@RequestParam(value = "oprGroup", defaultValue = "") String opr,
			HttpServletRequest request) {
		List<Notice> notices = new ArrayList<Notice>();
		Map<String, Object> param = new HashMap<String, Object>();

		List<?> oprGroupList = oprGroupService.getAll();
		param.put("notices", notices);
		param.put("oprGroup", opr);
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/pm/addnotice", param, request);
	}

	@RequestMapping(value = "/pm", params = { "module=newnotice", "action=noticelist" })
	public ModelAndView NoticeList(@RequestParam(value = "oprGroup", defaultValue = "") String opr,
			HttpServletRequest request) {
		List<Notice> notices = new ArrayList<Notice>();
		Map<String, Object> param = new HashMap<String, Object>();

		List<?> oprGroupList = oprGroupService.getAll();
		param.put("notices", notices);
		param.put("oprGroup", opr);
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/pm/noticelist", param, request);
	}

	@RequestMapping(params = { "module=applepurchase", "action=applepurchaselist" }, value = "/pm")
	public ModelAndView applePurchaseList(@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "limit", defaultValue = DEFAULT_SIZE_STR) int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<Map<String, Object>> ous = new ArrayList<Map<String, Object>>();
		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}
		int total = 0;
		Pair<Integer, List<Map<String, Object>>> p = loginXmlRpcClientService.getAppstorePurchasedRecordList(oprGroup,
				serverId, gbId, accountName, userName, limit, getOffset(limit, curPage));
		if (p != null) {
			total = p.getFirst();
			ous = p.getSecond();
		}
		param.put("datas", ous);
		param.put("page", new Page(total, limit, curPage));
		param.put("gbId", gbId);
		param.put("userName", StringUtils.trimToEmpty(userName));
		param.put("accountName", StringUtils.trimToEmpty(accountName));
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		return getCommonModelAndView("/pm/applepurchasedlist", param, request);
	}

	/*
	 * @玩家信息修改 梁波 private int lv; private long exp; private long money; private
	 * long gold; private long freeGold;
	 */
	@RequestMapping(params = { "module=playeritem", "action=playinfo" }, value = "/pm")
	public ModelAndView playinfo(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "id", defaultValue = "") String uid,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "username", defaultValue = "") String userName,
			@RequestParam(value = "roleName", defaultValue = "") String roleName,
			@RequestParam(value = "lv", defaultValue = "0") int lv,
			@RequestParam(value = "vipLv", defaultValue = "0") int vipLv,
			@RequestParam(value = "exp", defaultValue = "0") long exp,
			@RequestParam(value = "money", defaultValue = "0") long money,
			@RequestParam(value = "gold", defaultValue = "0") long gold,
			@RequestParam(value = "freeGold", defaultValue = "0") long freeGold,
			@RequestParam(value = "dbID", defaultValue = "0") int dbID, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayerInfo> ous = new ArrayList<PlayerInfo>();
		String realAccount = accountName;
		userName = gasService.getAccountRoleByGbId(serverId, oprGroup, uid);
		ous = gasService.searchPlayerList(serverId, oprGroup, realAccount, userName);
		if (!roleName.equals("")) {
			adminService.logger(uid,"修改玩家信息","服务器:"+serverId+",渠道为:"+oprGroup+",等级:"+lv+",角色名:"+roleName+",vip等级:"+vipLv+",经验值:"+exp+",银两:"+money+",元宝:"+gold+",闲置元宝:"+freeGold);
			gasService.Mplayinfo(serverId, oprGroup, uid, dbID, lv, roleName, vipLv, exp, money, gold,freeGold);
			ModelAndView view = new ModelAndView();
			view.setViewName("redirect:/gms/pm?module=playeritem&action=playlist");
			return view;
		}
		for (PlayerInfo item : ous) {
			if (item.getZhuanPanCZ() != null && item.getZhuanPanXF() != null) {
				item.setZhuanPanCZ(item.getZhuanPanCZ().toString());
				item.setZhuanPanXF(item.getZhuanPanXF().toString());
			}

		}
		param.put("datas", ous);
		param.put("oprGroup", oprGroup);
		param.put("serverId", serverId);
		param.put("accountName", accountName);
		param.put("userName", userName);
		param.put("dbID", dbID);
		param.put("id", uid);
		return getCommonModelAndView("/pm/playinfo", param, request);

	}

	/*
	 * @玩家背包信息修改 梁波
	 */
	@RequestMapping(params = { "module=playeritem", "action=itemlist" }, value = "/pm")
	public ModelAndView itemlist(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "id", defaultValue = "") String uid,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "username", defaultValue = "") String userName,
			@RequestParam(value = "itemid", defaultValue = "") String itemid,
			@RequestParam(value = "dbID", defaultValue = "0") int dbID, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<ItemInfo> ous = new ArrayList<ItemInfo>();
		ous = gasService.searchItemList(serverId, oprGroup, uid, dbID);
		if (!itemid.equals("")) {
			adminService.logger(uid,"操作玩家背包物品","删除服务器:"+serverId+",物品编号为:"+itemid);
			gasService.delItemList(serverId, oprGroup, uid, itemid, dbID);
			ModelAndView view = new ModelAndView();
			view.setViewName("redirect:/gms/pm?module=playeritem&action=playlist");
			return view;
		}
		param.put("datas", ous);
		param.put("oprGroup", oprGroup);
		param.put("serverId", serverId);
		param.put("accountName", accountName);
		param.put("userName", userName);
		param.put("dbID", dbID);
		param.put("id", uid);
		return getCommonModelAndView("/pm/itemplay", param, request);

	}

	/*
	 * @玩家邮箱信息修改 梁波
	 */
	@RequestMapping(params = { "module=playeritem", "action=playmessage" }, value = "/pm")
	public ModelAndView playmessage(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "id", defaultValue = "") String uid,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "username", defaultValue = "") String userName,
			@RequestParam(value = "messageid", defaultValue = "0") Long messageid,
			@RequestParam(value = "dbID", defaultValue = "0") int dbID, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayMessage> ous = new ArrayList<PlayMessage>();
		ous = gasService.searchMessageList(serverId, oprGroup, uid, dbID);
		if (messageid!=0) {
			adminService.logger(uid,"操作玩家邮件","删除服务器:"+serverId+",邮件编号为:"+messageid);
			gasService.delMessageList(serverId, oprGroup, uid, messageid, dbID);
			ModelAndView view = new ModelAndView();
			view.setViewName("redirect:/gms/pm?module=playeritem&action=playlist");
			return view;
		}
		param.put("datas", ous);
		param.put("oprGroup", oprGroup);
		param.put("serverId", serverId);
		param.put("accountName", accountName);
		param.put("userName", userName);
		param.put("dbID", dbID);
		param.put("id", uid);
		return getCommonModelAndView("/pm/playmessage", param, request);

	}
	/*
	 * @玩家建筑信息修改 梁波
	 */
	@RequestMapping(params = { "module=playeritem", "action=playbuild" }, value = "/pm")
	public ModelAndView playbuild(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "id", defaultValue = "") String uid,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "username", defaultValue = "") String userName,
			@RequestParam(value = "buildid", defaultValue = "") String buildid,
			@RequestParam(value = "dbID", defaultValue = "0") int dbID, HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<PlayBuild> ous = new ArrayList<PlayBuild>();
		ous = gasService.searchBuildList(serverId, oprGroup, uid, dbID);
		if (!buildid.equals("")) {
			adminService.logger(uid,"操作玩家建筑","删除服务器:"+serverId+",建筑编号为:"+buildid);
			gasService.delBuildList(serverId, oprGroup, uid, buildid, dbID);
			ModelAndView view = new ModelAndView();
			view.setViewName("redirect:/gms/pm?module=playeritem&action=playlist");
			return view;
		}
		param.put("datas", ous);
		param.put("oprGroup", oprGroup);
		param.put("serverId", serverId);
		param.put("accountName", accountName);
		param.put("userName", userName);
		param.put("dbID", dbID);
		param.put("id", uid);
		return getCommonModelAndView("/pm/playbuild", param, request);

	}
}
