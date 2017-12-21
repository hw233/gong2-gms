package com.hadoit.game.fsgame.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@ControllerAdvice
public class GmsControllerAdvice {

	public ModelAndView getCommonModelAndView(String path, Map<String, Object> param) {
		if (param == null) {
			param = new HashMap<String, Object>();
		}
		FsGameGmsUtils.setStaticModel(FsGameGmsUtils.class, param);
		FsGameGmsUtils.setStaticModel(FsGameGmsConst.class, param);
		return new ModelAndView(path, param);
	}
	@ExceptionHandler(Throwable.class)
	public ModelAndView handleException(HttpServletRequest request, Exception ex) {
		Map<String, Object> param = new HashMap<String, Object>();
		LoggerUtils.error(ex);
		param.put("exception", ex.getMessage());
		param.put("reqURI", request.getRequestURI());
		return getCommonModelAndView("springError", param);
	}

}
