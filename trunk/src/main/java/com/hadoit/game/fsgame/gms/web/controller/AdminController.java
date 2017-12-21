package com.hadoit.game.fsgame.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.util.WebUtils;

import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.common.framework.web.security.UserDetails;
import com.hadoit.game.fsgame.gms.meta.SecurityInfo;
import com.hadoit.game.fsgame.gms.meta.UserPrincipal;
import com.hadoit.game.fsgame.gms.net.GasAdminClientManager;
import com.hadoit.game.fsgame.gms.service.AdminService;
import com.hadoit.game.fsgame.gms.service.SecurityInfoService;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Controller
public class AdminController extends AbstractController {

	@Autowired
	private ServerInfoService serverInfoService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private GasAdminClientManager gasAdminClientManager;
	
	@Autowired
	private SecurityInfoService securityInfoService;

	private static String REDIRECT_DASHBOARD_URI = "redirect:dashboard";

	@RequestMapping(value = { "/", "/login" })
	public ModelAndView index(@RequestParam(value = "redirect", required = false) String redirect) {
		redirect = FsGameGmsUtils.decodeParameter(redirect);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("redirect", redirect);
		return getSimpleModelAndView("/index", param);
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ModelAndView doLogin(@RequestParam("username") String username, @RequestParam("passwd") String passwd,
			@RequestParam(value = "redirect", required = false) String redirect, HttpServletRequest request) {
		LoggerUtils.info("doLogin username=" + username);
		if (!adminService.checkAdmin(username, passwd)) {
			throw new RuntimeException("账号或密码错误!");
		}
		
		SecurityInfo si = securityInfoService.getSecurityInfoByAccount(username);
		if (si == null) {
			throw new RuntimeException("没有账户信息!");
		}
		
		String role = si.getRoleType();
		UserDetails userDetails = new UserDetails(username, passwd, new String[] { role, FsGameGmsConst.DWR_PUBLIC_ROLE }, new UserPrincipal(
				username));
		SecurityContextHolder.setSessionAuthInfo(userDetails);

		// 设置session过期时间
		HttpSession ses = request.getSession();
		ses.setMaxInactiveInterval(-1);
		
		// 设置i18n
		WebUtils.setSessionAttribute(request, SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, FsGameGmsUtils.getLocale());
		if (StringUtils.isBlank(redirect)) {
			return new ModelAndView(REDIRECT_DASHBOARD_URI);
		} else {
			return new ModelAndView("redirect:" + redirect);
		}
	}

	@RequestMapping(value = "/logout")
	public ModelAndView logout() {
		SecurityContextHolder.clearSessionAuthInfo();
		return new ModelAndView("redirect:login");
	}

	@RequestMapping(value = "/dashboard", params = {})
	public ModelAndView dashboard(HttpServletRequest request) {
		Map<String, Object> param = new HashMap<String, Object>();
		return getCommonModelAndView("/dashboard", param, request);
	}

}
