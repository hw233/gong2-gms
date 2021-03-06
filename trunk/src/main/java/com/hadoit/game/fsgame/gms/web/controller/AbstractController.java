package com.hadoit.game.fsgame.gms.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.fsgame.gms.service.AdminService;
import com.hadoit.game.fsgame.gms.service.ExporterService;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

public abstract class AbstractController {

	@Autowired
	private ExporterService exporterService;

	@Autowired
	protected ServerInfoService serverInfoService;
	
	@Autowired
	protected AdminService adminService;

	public ModelAndView getCommonModelAndView(String path, Map<String, Object> param, HttpServletRequest request) {
		if (param == null) {
			param = new HashMap<String, Object>();
		}
		adminService.logger("无","用户系统操作",path);
		FsGameGmsUtils.setStaticModel(FsGameGmsUtils.class, param);
		FsGameGmsUtils.setStaticModel(FsGameGmsConst.class, param);
		param.put("userDetails", SecurityContextHolder.getSessionAuthInfo());
		return new ModelAndView(path, param);
	}

	public ModelAndView getSimpleModelAndView(String path, Map<String, Object> param) {
		return getCommonModelAndView(path, param, null);
	}

	public ModelAndView getXlsModelAndView(Map<String, Object> param) {
		AbstractExcelView v = new AbstractExcelView() {
			@SuppressWarnings("unchecked")
			@Override
			protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook,
					HttpServletRequest request, HttpServletResponse response) throws Exception {
				String reportName = (String) model.get("reportName");
				List<?> reportDatas = (List<?>) model.get("reportDatas");
				Map<String, Object> fixedColumnVals = (Map<String, Object>) model.get("fixedColumnVals");
				String fileName = exporterService.generateXlsWorkbook(workbook, reportName, reportDatas,
						fixedColumnVals);
				response.setHeader("Content-Disposition",
						"attachment;filename=" + java.net.URLEncoder.encode(fileName, "UTF-8"));
			}
		};
		return new ModelAndView(v, param);
	}

	protected int getOffset(int limit, int curPage) {
		if (curPage < 1)
			curPage = 1;
		return (curPage - 1) * limit;
	}

}
