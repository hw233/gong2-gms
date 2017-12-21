package com.hadoit.game.fsgame.gms.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hadoit.game.fsgame.gms.service.OutterService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Controller
public class GmsOutterController extends AbstractController {

	@Autowired
	private OutterService outterService;

	@RequestMapping(value = "/outter/queryPlayerFee", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object queryPlayerFee(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> params = FsGameGmsUtils.getRequestParameterMap(request, response);
		Object r = outterService.queryPlayerFee(params);
		return r;
	}

	@RequestMapping(value = "/outter/queryPlayerFeeGroup", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object queryPlayerFeeGroup(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> params = FsGameGmsUtils.getRequestParameterMap(request, response);
		Object r = outterService.queryPlayerFeeGroup(params);
		return r;
	}
}
