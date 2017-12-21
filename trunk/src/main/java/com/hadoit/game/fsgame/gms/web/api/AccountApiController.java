package com.hadoit.game.fsgame.gms.web.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.hadoit.game.common.framework.http.SimpleHttpRequest;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.engine.core.protocol.json.GsonFactory;
import com.hadoit.game.fsgame.gms.meta.CouponRecord;
import com.hadoit.game.fsgame.gms.meta.GameAccount;
import com.hadoit.game.fsgame.gms.meta.Message;
import com.hadoit.game.fsgame.gms.meta.PlayerInfo;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.service.GasService;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;
import com.hadoit.game.fsgame.gms.service.rpc.LoginXmlRpcClientService;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;
import com.mysql.fabric.xmlrpc.base.Data;
import com.hadoit.game.fsgame.gms.config.data.ItemData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;
import java.util.UUID;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

@Controller
public class AccountApiController {

	public static final String DEFAULT_SIZE_STR = "20";
	public static final String APPID = "wx7ee193efc1d51e0a";
	public static final String SECRECT = "2d5af156e1a493fcdc7b00efecdb9cf8";
	public static final String INNER_LOGIN = "http://127.0.0.1:9090/gong-login/api/account/postIDFA?idfa=";
	public static final String OUTER_LOGIN = "http://10.160.6.160/gonglogin/api/account/postIDFA?idfa=";
	@Autowired
	private GasService gasService;

	@Autowired
	private ServerInfoService serverInfoService;
	@Autowired
	private LoginXmlRpcClientService loginXmlRpcClientService;

	// 获取用户对应服务器角色的信息
	@RequestMapping(value = "/account/getUserinfo", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object playerList(@RequestParam(value = "gbId", defaultValue = "0") long gbId,
			@RequestParam(value = "userName", defaultValue = "") String userName,
			@RequestParam(value = "accountName", defaultValue = "") String accountName,
			@RequestParam(value = "limit", defaultValue = "20") int limit,
			@RequestParam(value = "curPage", defaultValue = "1") int curPage,
			@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "token", defaultValue = "") String token, HttpServletRequest request) {
		List<PlayerInfo> ous = new ArrayList<PlayerInfo>();
		Map<String, Object> param = new HashMap<String, Object>();
		if (!token.equals(getToken(request)) && !token.equals("gamejelly446688")) {
			return Collections.singletonMap("message", "token auth failed");
		}
		if (StringUtils.isEmpty(accountName) || serverId == 0 || StringUtils.isEmpty(oprGroup)) {
			return Collections.singletonMap("code", "400");

		}
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
		param.put("userinfo", ous);
		param.put("serverId", serverId);
		param.put("oprGroup", oprGroup);
		return param;
	}

	protected int getOffset(int limit, int curPage) {
		if (curPage < 1)
			curPage = 1;
		return (curPage - 1) * limit;
	}

	// 获取服务器物品的信息
	@RequestMapping(value = "/account/getItem", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object getItem(@RequestParam(value = "itemid", defaultValue = "0") int itemid,
			@RequestParam(value = "token", defaultValue = "") String token, HttpServletRequest request) {
		LMap itemTmp = new LMap();
		if (!token.equals(getToken(request)) && !token.equals("gamejelly446688")) {

			return Collections.singletonMap("message", "token auth failed");
		}
		if (itemid == 0) {
			return ItemData.data;
		}
		itemTmp = ItemData.data.getMap(itemid);
		if (itemTmp == null) {
			return Collections.singletonMap("code", "200");
		}
		return ItemData.data.getMap(itemid);

	}

	// token验证
	@RequestMapping(value = "/account/getToken", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public String getToken(@RequestParam(value = "appid", defaultValue = "") String appid,
			@RequestParam(value = "secrect", defaultValue = "") String secrect, HttpServletRequest request) {
		if (appid.equals(APPID) && secrect.equals(SECRECT)) {
			String uuid = UUID.randomUUID().toString();
			request.getSession().setAttribute("token", uuid);
			return request.getSession().getAttribute("token").toString();
		}

		return "";
	}

	// token 获得方法
	protected String getToken(HttpServletRequest request) {
		Object token = request.getSession().getAttribute("token");
		if (token == null) {
			return "no token";
		}
		return token.toString();

	}

	// 发放服务器物品
	@RequestMapping(value = "/account/sendProduct", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object sendProduct(@RequestParam(value = "serverId", defaultValue = "0") int serverId,
			@RequestParam(value = "token", defaultValue = "") String token,
			@RequestParam(value = "oprGroup", defaultValue = "") String oprGroup,
			@RequestParam(value = "itemId", defaultValue = "") String itemId,
			@RequestParam(value = "uid", defaultValue = "") String uid,
			@RequestParam(value = "count", defaultValue = "") String Count,
			@RequestParam(value = "money", defaultValue = "0") int money,
			@RequestParam(value = "gold", defaultValue = "0") int gold,
			@RequestParam(value = "leijigold", defaultValue = "0") int leijigold,
			@RequestParam(value = "content", defaultValue = "微信公众号积分兑换") String content, HttpServletRequest request) {

		if (!token.equals(getToken(request)) && !token.equals("gamejelly446688")) {
			return Collections.singletonMap("message", "token auth failed");
		}
		return doSend(oprGroup, serverId, uid, content, itemId, Count, money, gold, leijigold);
	}

	private Object doSend(String oprGroup, int serverId, String uid, String content, String itemId, String Count,
			int money, int gold, int leijigold) {
		Map<String, Object> param = new HashMap<String, Object>();
		if (StringUtils.isEmpty(uid)) {
			param.put("code", "200");
			param.put("message", "uid不能为空");
			return param;
		}
		if (!StringUtils.isEmpty(uid)) {
			if (StringUtils.isEmpty(oprGroup) || serverId <= 0) {
				LoggerUtils.warn("DoSend to user must take oprGroup! id=" + uid);
				param.put("code", "210");
				param.put("message", "oprgroup或者serverId不能为空");
				return param;
			}
		}
		List<String> realRecvs = new ArrayList<String>();
		realRecvs.add(uid);
		if (!StringUtils.isEmpty(uid)) {
			List<Integer> itemIds = Arrays.asList(string2IntArray(StringUtils.splitByWholeSeparator(itemId, "|")));
			List<Integer> itemCounts = Arrays.asList(string2IntArray(StringUtils.splitByWholeSeparator(Count, "|")));

			if (itemIds.size() != itemCounts.size()) {
				param.put("code", "220");
				param.put("message", "商品数量不对等");
				return param;
			}
			gasService.sendReward(serverId, oprGroup, realRecvs, content, itemIds, itemCounts, money, gold, leijigold);
		}
		param.put("code", "success");
		param.put("message", "微信兑换成功");
		return param;
	}

	// 工具方法
	private Integer[] string2IntArray(String[] sa) {
		if (sa == null) {
			return ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY;
		}
		Integer[] ret = new Integer[sa.length];
		for (int i = 0; i < sa.length; i++) {
			ret[i] = Integer.valueOf(sa[i]);
		}
		return ret;
	}

	// 游戏内的文件上传处理接口
	@RequestMapping(value = "/account/postFile", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object postFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

		Map<String, Object> map = new HashMap<String, Object>();
		if (!file.isEmpty()) {
			// 上传文件路径
			String path = request.getSession().getServletContext().getRealPath("/excel/");
			// 上传文件名
			String time = String.valueOf(System.currentTimeMillis());
			String filename = time + "."
					+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
			File filepath = new File(path, filename);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件当中
			try {
				file.transferTo(filepath);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map = doExcel(path, filename);

		} else {
			map.put("code", 400);
			map.put("message", "文件不能为空");
		}

		return map;
	}

	private Map<String, Object> doExcel(String filepath, String filename) {
		Map<String, Object> m = new HashMap<String, Object>();
		try {
			// 同时支持Excel 2003、2007
			File excelFile = new File(filepath + "/" + filename); // 创建文件对象
			FileInputStream is = new FileInputStream(excelFile); // 文件流
			Workbook workbook = WorkbookFactory.create(is); // 这种方式 Excel
															// 2003/2007/2010
															// 都是可以处理的
			// int sheetCount = workbook.getNumberOfSheets(); //Sheet的数量
			// 遍历每个Sheet
			HSSFWorkbook mybook = new HSSFWorkbook();
			HSSFSheet mysheet = mybook.createSheet("详情表");
			mysheet.setColumnWidth(0, 9200);
			Sheet sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getPhysicalNumberOfRows(); // 获取总行数
			// 遍历每一行
			int i = 1;
			HSSFRow myrow = null;
			HSSFCell mycell = null;
			myrow = mysheet.createRow(0);
			mycell = myrow.createCell(0);
			mycell.setCellValue("IDFA");
			mycell = myrow.createCell(1);
			mycell.setCellValue("account");
			mycell = myrow.createCell(2);
			mycell.setCellValue("lastLoginServerIds");
			mycell = myrow.createCell(3);
			mycell.setCellValue("lastLoginOpr");
			mycell = myrow.createCell(4);
			mycell.setCellValue("lastLoginTime");
			mycell = myrow.createCell(5);
			mycell.setCellValue("createTime");
			mycell = myrow.createCell(6);
			mycell.setCellValue("playGuideId");
			Map<Integer, String> idfa = new HashMap<Integer, String>();
			int key = 0;
			for (int r = 0; r < rowCount; r++) {
				Row row = sheet.getRow(r);
				// 遍历每一列
				Cell cell = row.getCell(0);
				String cellValue = cell.getStringCellValue();
				if (!cellValue.isEmpty()) {
					idfa.put(key, cellValue);
					key++;
				}
			}
			Map<Integer, GameAccount> game = new HashMap<Integer, GameAccount>();
			game = loginXmlRpcClientService.getGameaccount("ios", idfa);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if (game != null) {
				int cell = 1;
				for (GameAccount v : game.values()) {
					try {
						myrow = mysheet.createRow(cell++);
						mycell = myrow.createCell(0);
						mycell.setCellValue(v.getIdfa());
						mycell = myrow.createCell(1);
						mycell.setCellValue(v.getAccount());
						mycell = myrow.createCell(2);
						mycell.setCellValue(String.valueOf(v.getLastLoginServerIds()));
						mycell = myrow.createCell(3);
						mycell.setCellValue(v.getLastLoginOpr());
						mycell = myrow.createCell(4);
						mycell.setCellValue(sdf.format(new Date(v.getLastLoginTime())));
						mycell = myrow.createCell(5);
						mycell.setCellValue(sdf.format(new Date(v.getCreateTime())));
						mycell = myrow.createCell(6);
						mycell.setCellValue(1);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
			FileOutputStream os = null;
			os = new FileOutputStream(filepath + "/" + "rb" + filename);
			mybook.write(os);
			os.flush();
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		m.put("code", 200);
		m.put("file", "rb" + filename);
		m.put("date", String.valueOf(System.currentTimeMillis()));
		m.put("download", "../excel/rb" + filename);
		return m;

	}

	// 游戏内的文件上传处理接口
	@RequestMapping(value = "/account/postExcel", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Object postExcel(@RequestParam("file") MultipartFile file,
			@RequestParam(value = "message", defaultValue = "") String message, HttpServletRequest request) {

		Map<String, Object> map = new HashMap<String, Object>();
		if (!file.isEmpty()) {
			// 上传文件路径
			String path = request.getSession().getServletContext().getRealPath("/excel/");
			// 上传文件名
			String time = String.valueOf(System.currentTimeMillis());
			String filename = time + "."
					+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
			File filepath = new File(path, filename);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件当中
			try {
				file.transferTo(filepath);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map = postMessage(path, filename, message);

		} else {
			map.put("code", 400);
			map.put("message", "文件不能为空");
		}

		return map;
	}

	private Map<String, Object> postMessage(String filepath, String filename, String message) {
		Map<String, Object> m = new HashMap<String, Object>();
		try {
			// 同时支持Excel 2003、2007
			File excelFile = new File(filepath + "/" + filename); // 创建文件对象
			FileInputStream is = new FileInputStream(excelFile); // 文件流
			Workbook workbook = WorkbookFactory.create(excelFile); // 这种方式 Excel
															// 2003/2007/2010
															// 都是可以处理的
			// int sheetCount = workbook.getNumberOfSheets(); //Sheet的数量
			// 遍历每个Sheet
			HSSFWorkbook mybook = new HSSFWorkbook();
			HSSFSheet mysheet = mybook.createSheet("短信发送详情表");
			mysheet.setColumnWidth(0, 9200);
			Sheet sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getPhysicalNumberOfRows(); // 获取总行数
			// 遍历每一行
			int i = 1;
			HSSFRow myrow = null;
			HSSFCell mycell = null;
			myrow = mysheet.createRow(0);
			mycell = myrow.createCell(0);
			mycell.setCellValue("手机号");
			mycell = myrow.createCell(1);
			mycell.setCellValue("发送模板");
			mycell = myrow.createCell(2);
			mycell.setCellValue("发送状态");
			Map<Integer, String> phone = new HashMap<Integer, String>();
			int key = 0;
			for (int r = 0; r < rowCount; r++) {
				Row row = sheet.getRow(r);
				// 遍历每一列
				Cell cell = row.getCell(0);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				String cellValue = cell.getStringCellValue();
				if (!cellValue.isEmpty()) {
					phone.put(key, cellValue);
					key++;
				}
			}
			Map<Integer, Message> game = new HashMap<Integer, Message>();
			game = sendmessage(phone, message);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			if (game != null) {
				int cell = 1;
				for (Message v : game.values()) {
					try {
						myrow = mysheet.createRow(cell++);
						mycell = myrow.createCell(0);
						mycell.setCellValue(String.valueOf(v.getPhone()));
						mycell = myrow.createCell(1);
						mycell.setCellValue(v.getMessage());
						mycell = myrow.createCell(2);
						mycell.setCellValue(v.getIs_passed());
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
			FileOutputStream os = null;
			os = new FileOutputStream(filepath + "/" + "rb" + filename);
			mybook.write(os);
			os.flush();
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		m.put("code", 200);
		m.put("file", "rb" + filename);
		m.put("date", String.valueOf(System.currentTimeMillis()));
		m.put("download", "../excel/rb" + filename);
		return m;

	}

	private Map<Integer, Message> sendmessage(Map<Integer, String> phone, String message) {
		Map<Integer, Message> messages = new HashMap<Integer, Message>();
		if (phone != null) {
			int i = 1;
			for (String num : phone.values()) {
				num=num.trim();
				if(!num.equals("")){
					String res="";
					try {
						String getUrl = "http://wx.gamejelly.cn/index.php?s=/home/api/get_message/phone/"+num+"/message/"+message;
						SimpleHttpRequest shr = SimpleHttpRequest.createPost(getUrl.toString());
						res=shr.sendGetString();
                    } catch (Exception e) {
						LoggerUtils.error("发送短信失败",e);
					}
					Message data = new Message();
					data.setMessage(message);
					data.setPhone(num);
					data.setIs_passed(res);
					messages.put(i, data);
					i++;
					
					
				}
				
			}
		}
		return messages;

	}

}
