package com.hadoit.game.fsgame.gms.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hadoit.game.common.lang.DataUtils;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.meta.Page;
import com.hadoit.game.fsgame.gms.meta.PlayerInfo;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.meta.opt.game.GoldStats;
import com.hadoit.game.fsgame.gms.meta.opt.game.ItemStats;
import com.hadoit.game.fsgame.gms.meta.opt.game.OtherBehvStats;
import com.hadoit.game.fsgame.gms.meta.opt.game.ResAllStats;
import com.hadoit.game.fsgame.gms.service.GameStatsService;
import com.hadoit.game.fsgame.gms.service.GasService;
import com.hadoit.game.fsgame.gms.service.OptDataService;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Controller
public class GameStatsController extends AbstractController {

	private final static String DEFAULT_DATE_FORMAT = "yyyy/MM/dd";
	
	public static final String DEFAULT_SIZE_STR = "20";

	@Autowired
	private GasService gasService;

	@Autowired
	private OptDataService optDataService;

	@Autowired
	private GameStatsService gameStatsService;
	
	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;

	private ModelAndView renderReport(String reportName, Map<String, Object> param) {
		Map<String, Object> reportParams = new HashMap<String, Object>();
		reportParams.put("reportName", reportName);
		reportParams.put("reportDatas", param.get("datas"));
		return getXlsModelAndView(reportParams);
	}

	private Map<String, Object> doResAllList(int curPage, int limit, String qryVal, String type, String approach,
			int serverId, String oprGroup) {
		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + DateUtils.MILLIS_PER_DAY,
					DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);
		String approach2 = approach;
		if (approach2.equals("")) {
			approach2 = "0";
		}
		Pair<Integer, List<ResAllStats>> pous = gameStatsService.searchResAllStatsData(serverId, oprGroup,
				Integer.valueOf(type), Integer.valueOf(approach2), pd.getFirst().getTime(), pd.getSecond().getTime(),
				limit, getOffset(limit, curPage));
		int total = pous.getFirst();
		List<ResAllStats> all = pous.getSecond();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("type", type);
		param.put("approach", approach);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		param.put("page", new Page(total, limit, curPage));

		return param;
	}

	@RequestMapping(value = "/gs", params = { "module=resall", "action=resalllist" })
	public ModelAndView resAllList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "type", defaultValue = "0") String type,
			@RequestParam(value = "approach", defaultValue = "") String approach,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {

		return getCommonModelAndView("/gs/resalllist",
				doResAllList(curPage, limit, qryVal, type, approach, serverId, oprGroup), request);
	}

	@RequestMapping(value = "/gs", params = { "module=resall", "action=resallexport" })
	public ModelAndView resAllExport(@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "type", defaultValue = "0") String type,
			@RequestParam(value = "approach", defaultValue = "") String approach,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {

		return renderReport(FsGameGmsConst.REPORT_NAME_GS_RESALL,
				doResAllList(0, 0, qryVal, type, approach, serverId, oprGroup));
	}

	private Map<String, Object> doOtherBehvList(int curPage, int limit, String behv, String qryVal, int serverId,
			String oprGroup) {
		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + DateUtils.MILLIS_PER_DAY,
					DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);

		Pair<Integer, List<OtherBehvStats>> pous = gameStatsService.searchOtherBehvStatsData(serverId, oprGroup, behv,
				pd.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = pous.getFirst();
		List<OtherBehvStats> all = pous.getSecond();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("page", new Page(total, limit, curPage));
		param.put("behv", behv);
		param.put("behvOption", FsGameGmsUtils.getOtherBehvOptionMap());
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);

		return param;
	}

	@RequestMapping(value = "/gs", params = { "module=csmbehv", "action=csmbehvlist" })
	public ModelAndView otherBehvList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "behv", defaultValue = "0") String behv,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {

		return getCommonModelAndView("/gs/csmbehvlist",
				doOtherBehvList(curPage, limit, behv, qryVal, serverId, oprGroup), request);
	}

	@RequestMapping(value = "/gs", params = { "module=csmbehv", "action=csmbehvexport" })
	public ModelAndView otherBehvExport(@RequestParam(value = "behv", defaultValue = "0") String behv,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {

		return renderReport(FsGameGmsConst.REPORT_NAME_GS_CSMBEHV,
				doOtherBehvList(0, 0, behv, qryVal, serverId, oprGroup));
	}

	private Map<String, Object> doItemStatsList(int curPage, int limit, int itemId, String qryVal, int serverId,
			String oprGroup) {
		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + DateUtils.MILLIS_PER_DAY,
					DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);

		Pair<Integer, List<ItemStats>> pous = gameStatsService.searchItemStatsData(serverId, oprGroup, itemId, pd
				.getFirst().getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = pous.getFirst();
		List<ItemStats> all = pous.getSecond();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("page", new Page(total, limit, curPage));
		param.put("itemId", itemId);
		param.put("itemIdOption", FsGameGmsUtils.getItemIdOptionList());
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);

		return param;
	}

	@RequestMapping(value = "/gs", params = { "module=itemstats", "action=itemstatslist" })
	public ModelAndView itemStatsList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "itemId", defaultValue = "0") int itemId,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {

		return getCommonModelAndView("/gs/itemstatslist",
				doItemStatsList(curPage, limit, itemId, qryVal, serverId, oprGroup), request);
	}

	private Map<String, Object> doGoldStatsList(int curPage, int limit, String qryVal, int serverId, String oprGroup) {
		if (StringUtils.isEmpty(qryVal)) {
			String dfDate = DataUtils.formatDate(System.currentTimeMillis(), DEFAULT_DATE_FORMAT);
			String dfDate2 = DataUtils.formatDate(System.currentTimeMillis() + DateUtils.MILLIS_PER_DAY,
					DEFAULT_DATE_FORMAT);
			qryVal = dfDate + "-" + dfDate2;
		}
		Pair<Date, Date> pd = FsGameGmsUtils.parseDateRange(qryVal, DEFAULT_DATE_FORMAT);

		Pair<Integer, List<GoldStats>> pous = gameStatsService.searchGoldStatsData(serverId, oprGroup, pd.getFirst()
				.getTime(), pd.getSecond().getTime(), limit, getOffset(limit, curPage));
		int total = pous.getFirst();
		List<GoldStats> all = pous.getSecond();

		Map<String, Object> param = new HashMap<String, Object>();
		param.put("datas", all);
		param.put("qryVal", qryVal);
		param.put("page", new Page(total, limit, curPage));
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);

		return param;
	}

	@RequestMapping(value = "/gs", params = { "module=goldstats", "action=goldstatslist" })
	public ModelAndView goldStatsList(@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "limit", defaultValue = FsGameGmsConst.DEFAULT_LIST_SIZE + "") int limit,
			@RequestParam(value = "qryVal", defaultValue = "") String qryVal,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup, HttpServletRequest request) {

		return getCommonModelAndView("/gs/goldstatslist", doGoldStatsList(curPage, limit, qryVal, serverId, oprGroup),
				request);
	}
}
