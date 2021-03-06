package com.hadoit.game.fsgame.gms.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hadoit.game.fsgame.gms.meta.OprGroup;
import com.hadoit.game.fsgame.gms.meta.Page;
import com.hadoit.game.fsgame.gms.meta.ScriptRecord;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.net.GasAdminClientManager;
import com.hadoit.game.fsgame.gms.service.GasService;
import com.hadoit.game.fsgame.gms.service.OprGroupService;
import com.hadoit.game.fsgame.gms.service.ScriptRecordService;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Controller
public class ServerManagerController extends AbstractController {

	@Autowired
	private ServerInfoService serverInfoService;

	@Autowired
	private GasAdminClientManager gasAdminClientManager;

	@Autowired
	private GasService gasService;

	@Autowired
	private ScriptRecordService scriptRecordService;

	@Autowired
	private OprGroupService oprGroupService;

	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;

	// private static String REDIRECT_LIST_SRV_URI =
	// "redirect:sm?module=srv&action=srvlist";

	private static String REDIRECT_OPR_GROUP_LIST_SRV_URI = "redirect:sm?module=oprgroup&action=oprgrouplist";

	@RequestMapping(value = "/sm", params = { "module=srv", "action=srvlist" })
	public ModelAndView srvlist(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "oprgroup", defaultValue = "") String oprgroup,
			@RequestParam(value = "limit", defaultValue = 200 + "") int limit, HttpServletRequest request) {
		LoggerUtils.info("srvlist limit=" + limit, "curPage=" + curPage);
		List<ServerInfo> all = new ArrayList<ServerInfo>();
		if (StringUtils.isEmpty(oprgroup)) {
			all = serverInfoService.getAllServer(limit, getOffset(limit, curPage));

		} else {

			all = serverInfoService.getAllServer(oprgroup, limit, getOffset(limit, curPage));
		}

		List<ServerInfo> alls = serverInfoService.getAllServer(false);
		List<String> oprgroups = new ArrayList<String>();
		int total = serverInfoService.getAllServerCount();
		for (ServerInfo allsitem : alls) {
			if (!oprgroups.contains(allsitem.getOprGroup())) {
				oprgroups.add(allsitem.getOprGroup());
			}

		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srvs", all);
		param.put("oprgroups", oprgroups);
		param.put("oprgroup", oprgroup);
		param.put("page", new Page(total, limit, curPage));
		return getCommonModelAndView("/sm/srvlist", param, request);
	}

	@RequestMapping(value = "/sm", params = { "module=srv", "action=srvcreate" })
	public ModelAndView srvcreate(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		ServerInfo si = null;
		if (id > 0) {
			si = serverInfoService.getServerInfo(id);
		} else {
			si = new ServerInfo();
			si.setPort(9101);
			si.setAdminPort(9102);
			si.setNewSrv(true);
		}
		List<?> oprGroupList = oprGroupService.getAll();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("si", si);
		param.put("ogl", oprGroupList);
		return getCommonModelAndView("/sm/srvcreate", param, request);
	}

	private boolean doRpcSaveSrv(ServerInfo si) {
		String ret = loginXmlRpcClientService.saveServerInfo(si.getOprGroup(), si);
		if ("SUCCESS".equalsIgnoreCase(ret)) {
			return true;
		}
		return false;
	}

	private boolean checkServerInfo(ServerInfo si) {
		if (si == null) {
			return false;
		}
		if (si.getServerId() <= 0 || si.getZone() <= 0) {
			return false;
		}
		return true;
	}

	@RequestMapping(value = "/sm", params = { "module=srv", "action=dosrvcreate" }, method = { RequestMethod.POST })
	@ResponseBody
	public String dosrvcreate(HttpServletRequest request) {
		ServerInfo si = FsGameGmsUtils.parseRequestObject(request, ServerInfo.class);
		if (!checkServerInfo(si)) {
			return "FAILURE";
		}
		if (si.getId() <= 0) {
			si.setState(FsGameGmsConst.SERVER_STATE_CLOSE);
			si.setCreateTime(System.currentTimeMillis());
			if (!doRpcSaveSrv(si)) {
				return "FAILURE";
			}
			boolean ret = serverInfoService.addServer(si);
			if (!ret) {
				return "区号和组重复了!";
			}
		} else {
			ServerInfo oldSi = serverInfoService.getServerInfoForUpdate(si.getId());
			si.setState(oldSi.getState());
			si.setCreateTime(oldSi.getCreateTime());
			if (!doRpcSaveSrv(si)) {
				return "FAILURE";
			}
			serverInfoService.updateServer(si);
		}
		gasAdminClientManager.connectGasClient(si);
		return "SUCCESS";
	}

	@RequestMapping(value = "/sm", params = { "module=srv", "action=delsrv" })
	@ResponseBody
	public String delSrv(@RequestParam(value = "id", defaultValue = "0") long id, HttpServletRequest request) {
		if (id > 0) {
			ServerInfo si = serverInfoService.getServerInfo(id);
			String rpcRet = loginXmlRpcClientService.delServerInfo(si.getOprGroup(), si.getServerId());
			if ("SUCCESS".equalsIgnoreCase(rpcRet)) {
				serverInfoService.deleteServer(id);
				gasAdminClientManager.removeConnect(si.getServerId(), si.getOprGroup());
			} else {
				return "FAILURE";
			}
		}
		return "SUCCESS";
	}

	@RequestMapping(value = "/sm", params = { "module=tools", "action=toolslist" })
	public ModelAndView toolslist(HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		return getCommonModelAndView("/sm/toolslist", param, request);
	}

	@RequestMapping(value = "/sm", params = { "module=scripts", "action=scriptslist" })
	public ModelAndView scriptslist(HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		List<ScriptRecord> scripts = scriptRecordService.getScriptRecordList();
		param.put("scripts", scripts);
		return getCommonModelAndView("/sm/scriptslist", param, request);
	}

	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=oprgrouplist" })
	public ModelAndView oprgrouplist(HttpServletRequest request) {
		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			oprGroup.setRegisterState(
					loginXmlRpcClientService.getRegisterState(oprGroup.getOprGroup(), oprGroup.getLoginUrl()));
			oprGroup.setOpenShiming(
					loginXmlRpcClientService.getOpenShiming(oprGroup.getOprGroup(), oprGroup.getLoginUrl()));
			oprGroup.setOpenShingmingshow(
					loginXmlRpcClientService.getOpenShimingShow(oprGroup.getOprGroup(), oprGroup.getLoginUrl()));

		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srvs", all);
		return getCommonModelAndView("/sm/oprgrouplist", param, request);
	}

	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=oprgroupcreate" })
	public ModelAndView oprgroupcreate(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		OprGroup oprGroup = null;
		if (id > 0) {
			oprGroup = oprGroupService.getOprGroupById(id);
		} else {
			oprGroup = new OprGroup();
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("oprg", oprGroup);
		return getCommonModelAndView("/sm/oprgroupcreate", param, request);
	}

	private boolean mergeLogDbInfo(OprGroup og) {
		Map<String, String> m = loginXmlRpcClientService.getLogDbInfo(og.getOprGroup(), og.getLoginUrl());
		if (m == null) {
			return false;
		}
		og.setLogDbUrl(m.get("db_log.url"));
		og.setLogDbUserName(m.get("db_log.username"));
		og.setLogDbPassword(m.get("db_log.password"));
		return true;
	}

	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=dooprgroupcreate" }, method = {
			RequestMethod.POST })
	@ResponseBody
	public String dooprgroupcreate(HttpServletRequest request) throws IOException {
		OprGroup og = FsGameGmsUtils.parseRequestObject(request, OprGroup.class);
		if (og.getId() > 0) {
			// 更新
			OprGroup oldOg = oprGroupService.getOprGroupById(og.getId());
			og.setCreateTime(oldOg.getCreateTime());
			if (!mergeLogDbInfo(og)) {
				return "FAILURE";
			}
			oprGroupService.updateOprGroup(og);
			// 更新serverinfo对应的字段
			if (!StringUtils.equals(oldOg.getOprMatchStr(), og.getOprMatchStr())) {
				serverInfoService.updateOprMatchStr(og.getOprGroup(), og.getOprMatchStr());
			}
		} else {
			og.setCreateTime(System.currentTimeMillis());
			if (!mergeLogDbInfo(og)) {
				return "FAILURE";
			}
			oprGroupService.addOprGroup(og);
		}
		return "SUCCESS";
	}

	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=deloprgroup" }, method = {
			RequestMethod.POST })
	public ModelAndView deloprgroup(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		if (!oprGroupService.deleteOprGroup(id)) {
			throw new RuntimeException("删除渠道错误！");
		}
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}

	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=openregister" })
	public ModelAndView openRegister(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			if (oprGroup.getId() == id) {
				loginXmlRpcClientService.openRegister(oprGroup.getOprGroup(), oprGroup.getLoginUrl());
				break;
			}
		}

		for (OprGroup oprGroup : all) {
			oprGroup.setRegisterState(
					loginXmlRpcClientService.getRegisterState(oprGroup.getOprGroup(), oprGroup.getLoginUrl()));
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srvs", all);
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}
	
	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=openshiming" })
	public ModelAndView openshiming(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			if (oprGroup.getId() == id) {
				loginXmlRpcClientService.setOpenShiming(oprGroup.getOprGroup(), oprGroup.getLoginUrl());
				break;
			}
		}
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}
	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=closeshiming" })
	public ModelAndView closeshiming(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			if (oprGroup.getId() == id) {
				loginXmlRpcClientService.setCloseShiming(oprGroup.getOprGroup(), oprGroup.getLoginUrl());
				break;
			}
		}
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}
	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=openshimingshow" })
	public ModelAndView openshimingshow(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			if (oprGroup.getId() == id) {
				loginXmlRpcClientService.setOpenShimingshow(oprGroup.getOprGroup(), oprGroup.getLoginUrl());
				break;
			}
		}
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}
	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=closeshimingshow" })
	public ModelAndView closeshimingshow(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {
		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			if (oprGroup.getId() == id) {
				loginXmlRpcClientService.setCloseShimingshow(oprGroup.getOprGroup(), oprGroup.getLoginUrl());
				break;
			}
		}
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}


	@RequestMapping(value = "/sm", params = { "module=oprgroup", "action=closeregister" })
	public ModelAndView closeRegister(@RequestParam(value = "id", defaultValue = "0") long id,
			HttpServletRequest request) {

		List<OprGroup> all = oprGroupService.getAll();
		for (OprGroup oprGroup : all) {
			if (oprGroup.getId() == id) {
				loginXmlRpcClientService.closeRegister(oprGroup.getOprGroup(), oprGroup.getLoginUrl());
				break;
			}
		}

		for (OprGroup oprGroup : all) {
			oprGroup.setRegisterState(
					loginXmlRpcClientService.getRegisterState(oprGroup.getOprGroup(), oprGroup.getLoginUrl()));
		}
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("srvs", all);
		return new ModelAndView(REDIRECT_OPR_GROUP_LIST_SRV_URI);
	}

	@RequestMapping(value = "/sm", params = { "module=sql", "action=executesql" })
	public ModelAndView executesql(HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		return getCommonModelAndView("/sm/executesql", param, request);
	}
}
