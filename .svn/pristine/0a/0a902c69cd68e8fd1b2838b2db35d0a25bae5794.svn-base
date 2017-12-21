package com.hadoit.game.fsgame.gms.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.hadoit.game.common.lang.DataUtils;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.meta.Page;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.meta.TotalChargeData;
import com.hadoit.game.fsgame.gms.meta.log.OnlineLog;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayData;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalData;
import com.hadoit.game.fsgame.gms.service.ExporterService;
import com.hadoit.game.fsgame.gms.service.GasService;
import com.hadoit.game.fsgame.gms.service.LogService;
import com.hadoit.game.fsgame.gms.service.OptDataService;
import com.hadoit.game.fsgame.gms.service.OptReportMailService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Controller
public class OperationController extends AbstractController {

	private final static String DEFAULT_DATE_FORMAT = "yyyy/MM/dd";

	@Autowired
	private GasService gasService;

	@Autowired
	private OptDataService optDataService;

	@Autowired
	private LogService logService;

	@Autowired
	private ExporterService exporterService;

	@Autowired
	private OptReportMailService optReportMailService;

	private Map<String, Object> doOptDayData(int curPage, int limit, String qryVal, int serverId, String oprGroup) {
		if (StringUtils.isEmpty(qryVal)) {
			long curr = System.currentTimeMillis();
			String dfDate = DataUtils.formatDate(curr, DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + DataUtils.formatDate(curr + DateUtils.MILLIS_PER_DAY, DEFAULT_DATE_FORMAT);
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);
		Pair<Integer, List<OptDayData>> p = optDataService.searchOptDayData(serverId, oprGroup,
				pd.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = p.getFirst();
		List<?> all = p.getSecond();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("page", new Page(total, limit, curPage));
		return param;
	}

	private ModelAndView renderReport(String reportName, Map<String, Object> param) {
		Map<String, Object> reportParams = new HashMap<String, Object>();
		reportParams.put("reportName", reportName);
		reportParams.put("reportDatas", param.get("datas"));
		return getXlsModelAndView(reportParams);
	}

	@RequestMapping(value = "/opt", params = { "module=reg", "action=reglist" })
	public ModelAndView regList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("srvlist limit=" + limit, "curPage=" + curPage);
		Map<String, Object> param = doOptDayData(curPage, limit, qryVal, serverId, oprGroup);
		return getCommonModelAndView("/opt/reglist", param, request);
	}

	@RequestMapping(value = "/opt", params = { "module=reg", "action=regexport" })
	public ModelAndView regExport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("regExport ");
		Map<String, Object> param = doOptDayData(0, 0, qryVal, serverId, oprGroup);
		return renderReport(FsGameGmsConst.REPORT_NAME_OPT_DAY, param);
	}

	@RequestMapping(value = "/opt", params = { "module=charge", "action=chargelist" })
	public ModelAndView chargeList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("srvlist limit=" + limit, "curPage=" + curPage);
		Map<String, Object> param = doOptDayData(curPage, limit, qryVal, serverId, oprGroup);
		return getCommonModelAndView("/opt/chargelist", param, request);
	}

	@RequestMapping(value = "/opt", params = { "module=charge", "action=chargeexport" })
	public ModelAndView chargeexport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("churnexport ");
		Map<String, Object> param = doOptDayData(0, 0, qryVal, serverId, oprGroup);
		return renderReport(FsGameGmsConst.REPORT_NAME_OPT_CHARGE, param);
	}

	private Map<String, Object> doGlobalDayData(int curPage, int limit, String qryVal, int serverId, String oprGroup) {

		if (StringUtils.isEmpty(qryVal)) {
			long curr = System.currentTimeMillis();
			String dfDate = DataUtils.formatDate(curr, DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + DataUtils.formatDate(curr + DateUtils.MILLIS_PER_DAY, DEFAULT_DATE_FORMAT);
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);
		Pair<Integer, List<OptGlobalData>> p = optDataService.searchOptGlobalData(serverId, oprGroup, pd.getFirst()
				.getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = p.getFirst();
		List<?> all = p.getSecond();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("page", new Page(total, limit, curPage));
		return param;
	}

	@RequestMapping(value = "/opt", params = { "module=global", "action=globallist" })
	public ModelAndView globalList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = doGlobalDayData(curPage, limit, qryVal, serverId, oprGroup);
		return getCommonModelAndView("/opt/globallist", param, request);
	}

	@RequestMapping(value = "/opt", params = { "module=global", "action=globalexport" })
	public ModelAndView globalexport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = doGlobalDayData(0, 0, qryVal, serverId, oprGroup);
		return renderReport(FsGameGmsConst.REPORT_NAME_OPT_GLOBAL, param);
	}

	private Map<String, Object> doOnlineData(int curPage, int limit, String qryVal, int serverId, String oprGroup) {
		if (serverId <= 0 || StringUtils.isBlank(oprGroup)) {
			ServerInfo si = serverInfoService.getOneServer();
			serverId = si.getServerId();
			oprGroup = si.getOprGroup();
		}

		if (StringUtils.isEmpty(qryVal)) {
			long curr = System.currentTimeMillis();
			String dfDate = DataUtils.formatDate(curr, DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + DataUtils.formatDate(curr + DateUtils.MILLIS_PER_DAY, DEFAULT_DATE_FORMAT);
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);
		Pair<Integer, List<OnlineLog>> p = logService.searchOnlineData(serverId, oprGroup, pd.getFirst().getTime(), pd
				.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = p.getFirst();
		List<?> all = p.getSecond();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("page", new Page(total, limit, curPage));
		return param;
	}

	@RequestMapping(value = "/opt", params = { "module=online", "action=onlinelist" })
	public ModelAndView onlineList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = doOnlineData(curPage, limit, qryVal, serverId, oprGroup);
		return getCommonModelAndView("/opt/onlinelist", param, request);
	}

	@RequestMapping(value = "/opt", params = { "module=online", "action=onlineexport" })
	public ModelAndView onlineexport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("retentionExport ");
		Map<String, Object> param = doOnlineData(0, 0, qryVal, serverId, oprGroup);
		return renderReport(FsGameGmsConst.REPORT_NAME_OPT_ONLINE, param);
	}

	@RequestMapping(value = "/opt", params = { "module=retention", "action=retentionlist" })
	public ModelAndView retentionList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = doOptDayData(curPage, limit, qryVal, serverId, oprGroup);
		return getCommonModelAndView("/opt/retentionlist", param, request);
	}

	@RequestMapping(value = "/opt", params = { "module=churn", "action=churnlist" })
	public ModelAndView churnList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		Map<String, Object> param = doOptDayData(curPage, limit, qryVal, serverId, oprGroup);
		return getCommonModelAndView("/opt/churnlist", param, request);
	}

	@RequestMapping(value = "/opt", params = { "module=retention", "action=retentionexport" })
	public ModelAndView retentionExport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("retentionExport ");
		Map<String, Object> param = doOptDayData(0, 0, qryVal, serverId, oprGroup);
		return renderReport(FsGameGmsConst.REPORT_NAME_OPT_RETENTION, param);
	}

	@RequestMapping(value = "/opt", params = { "module=churn", "action=churnexport" })
	public ModelAndView churnexport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {
		LoggerUtils.info("churnexport ");
		Map<String, Object> param = doOptDayData(0, 0, qryVal, serverId, oprGroup);
		return renderReport(FsGameGmsConst.REPORT_NAME_OPT_CHURN, param);
	}

	private ModelAndView getAllReportView(final long baseDateTime) {
		AbstractExcelView v = new AbstractExcelView() {
			@Override
			protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook,
					HttpServletRequest request, HttpServletResponse response) throws Exception {
				optReportMailService.createReport(workbook, baseDateTime);
				response.setHeader(
						"Content-Disposition",
						"attachment;filename="
								+ java.net.URLEncoder.encode(FsGameGmsUtils.formatDate(baseDateTime, "yyyy-MM-dd")
										+ "_report", "UTF-8"));
			}
		};
		return new ModelAndView(v, new HashMap<String, Object>());
	}

	@RequestMapping(value = "/downMail", params = {})
	public ModelAndView downMail(HttpServletRequest request,
			@RequestParam(value = "date", defaultValue = "") String date) {
		long baseDateTime;
		if (StringUtils.isNotBlank(date)) {
			baseDateTime = FsGameGmsUtils.parseDate(date, "yyyy-MM-dd").getTime();
		} else {
			// 拿上一天0点
			baseDateTime = FsGameGmsUtils.getTimeInDay00(new Date()) - DateUtils.MILLIS_PER_DAY;
		}

		return getAllReportView(baseDateTime);
	}

	@RequestMapping(value = "/mail", params = {})
	public ModelAndView mail(HttpServletRequest request, @RequestParam(value = "date", defaultValue = "") String date) {
		long baseDateTime;
		if (StringUtils.isNotBlank(date)) {
			baseDateTime = FsGameGmsUtils.parseDate(date, "yyyy-MM-dd").getTime();
		} else {
			// 拿上一天0点
			baseDateTime = FsGameGmsUtils.getTimeInDay00(new Date()) - DateUtils.MILLIS_PER_DAY;
		}
		optReportMailService.sendAllMail(baseDateTime);
		return new ModelAndView("redirect:dashboard");
	}

	@RequestMapping(value = "/opt", params = { "module=realcharge", "action=realcharge" })
	public ModelAndView realcharge(HttpServletRequest request) {
		List<ServerInfo> sis = serverInfoService.getAllOrderedServer(true);
		List<TotalChargeData> tcds = new ArrayList<TotalChargeData>();
		long allCharge = 0l;
		if (CollectionUtils.isNotEmpty(sis)) {
			long startTime = FsGameGmsUtils.getTimeInDay00(new Date());
			for (ServerInfo si : sis) {
				LoggerUtils.info("realcharge oprGroup=" + si.getOprGroup() + ", serverId=" + si.getServerId());
				long v = logService.getTotalChargeAmountByDate(si.getOprGroup(), si.getServerId(), startTime);
				tcds.add(new TotalChargeData(si.getServerId(), si.getOprGroup(), v));
				allCharge += v;
			}
		}

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", tcds);
		param.put("allCharge", allCharge);
		return getCommonModelAndView("/opt/realcharge", param, request);
	}
}
