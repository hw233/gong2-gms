package com.hadoit.game.fsgame.gms.service.rpc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redstone.xmlrpc.XmlRpcClient;

import com.google.gson.reflect.TypeToken;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.engine.core.protocol.json.GsonFactory;
import com.hadoit.game.fsgame.gms.meta.CouponRecord;
import com.hadoit.game.fsgame.gms.meta.GameAccount;
import com.hadoit.game.fsgame.gms.meta.OprGroup;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.service.OprGroupService;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Component("loginXmlRpcClientService")
public class LoginXmlRpcClientService {
	@Autowired
	private OprGroupService oprGroupService;

	private Object doInvoke(String oprGroup, String loginUrl, String method, Object... arguments) {
		try {
			if (!loginUrl.endsWith("/")) {
				loginUrl += "/";
			}
			loginUrl += "loginXmlRpc";
			return new XmlRpcClient(loginUrl, true).invoke(method, arguments);
		} catch (Exception e) {
			throw new RuntimeException("xmlRpc invoke error!", e);
		}
	}

	private Object invoke(String oprGroup, String method, Object... arguments) {
		OprGroup og = oprGroupService.getOprGroup(oprGroup);
		String url = og.getLoginUrl();
		return doInvoke(oprGroup, url, method, arguments);
	}

	public boolean touch(String oprGroup, String method) {
		Boolean ret = false;
		try {
			ret = (Boolean) invoke(oprGroup, "loginXmlRpcService.touch");
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String saveServerInfo(String oprGroup, ServerInfo serverInfo) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.saveServerInfo",
					GsonFactory.getDefault().toJson(serverInfo));
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String updateOprMatchStr(String oprGroup, String oprMatchStr) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.updateOprMatchStr", oprGroup, oprMatchStr);
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String delServerInfo(String oprGroup, int serverId) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.delServerInfo", oprGroup, serverId);
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String addNotice(String oprGroup, String notice) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.addNotice", notice);
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String updateNotice(String oprGroup, int id, String notice) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.updateNotice", id, notice);
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String delNotice(String oprGroup, int id) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.delNotice", id);
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String getNoticeList(String oprGroup) {
		String ret = "";
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.getNoticeList");
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}

		// List<Notice> notices = GsonFactory.getDefault().fromJson(ret, new
		// TypeToken<List<Notice>>() {}.getType());
		return ret;
	}

	public String openRegister(String oprGroup, String loginUrl) {
		String ret = "";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.openRegister");
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String closeRegister(String oprGroup, String loginUrl) {
		String ret = "";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.closeRegister");
		} catch (Exception e) {
			ret = e.getMessage();
			LoggerUtils.error(e);
		}
		return ret;
	}

	public boolean getRegisterState(String oprGroup, String loginUrl) {
		boolean ret = false;
		try {
			ret = (Boolean) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.getRegisterState");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	public boolean getOpenShiming(String oprGroup, String loginUrl) {
		boolean ret = false;
		try {
			ret = (Boolean) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.getOpenShiming");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	public boolean getOpenShimingShow(String oprGroup, String loginUrl) {
		boolean ret = false;
		try {
			ret = (Boolean) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.getOpenShimingShow");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	public String setOpenShiming(String oprGroup, String loginUrl) {
		String ret="";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.openshiming");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	public String setCloseShiming(String oprGroup, String loginUrl) {
		String ret="";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.closeshiming");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	public String setOpenShimingshow(String oprGroup, String loginUrl) {
		String ret="";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.openshimingshow");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	public String setCloseShimingshow(String oprGroup, String loginUrl) {
		String ret="";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.closeshimingshow");
		} catch (Exception e) {
			LoggerUtils.error(e.getMessage());
		}
		return ret;
	}
	/**
	 * db_log.url, db_log.username, db_log.password
	 * 
	 * @param oprGroup
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> getLogDbInfo(String oprGroup, String loginUrl) {
		Map<String, String> m = null;
		try {
			String ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.getLogDbInfo");
			m = GsonFactory.getDefault().fromJson(ret, Map.class);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return m;
	}

	public int addCoupons(String oprGroup, String loginUrl, Map<String, Object> cpTmpMap, int cpLen) {
		int ret = 0;
		try {
			String cpTmpMapStr = GsonFactory.getDefault().toJson(cpTmpMap);
			ret = (Integer) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.addCoupons", cpTmpMapStr, cpLen);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String enableByBatchCode(String oprGroup, String loginUrl, String batchCode) {
		String ret = "";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.enableByBatchCode", batchCode);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String diableByBatchCode(String oprGroup, String loginUrl, String batchCode) {
		String ret = "";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.diableByBatchCode", batchCode);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String delCoupons(String oprGroup, String loginUrl, String batchCode) {
		String ret = "";
		try {
			ret = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.delCoupons", batchCode);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		return ret;
	}

	public List<CouponRecord> exportCoupon(String oprGroup, String loginUrl, String batchCode) {
		List<CouponRecord> cpList = null;
		try {
			String crListStr = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.exportCoupon", batchCode);
			cpList = GsonFactory.getDefault().fromJson(crListStr, new TypeToken<List<CouponRecord>>() {
			}.getType());
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return cpList;
	}

	public int getUsedCouponsCount(String oprGroup, String loginUrl, String batchCode) {
		int ret = -1;
		try {
			ret = (Integer) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.getUsedCouponsCount", batchCode);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public CouponRecord geCouponsByCode(String oprGroup, String loginUrl, String couponCode) {
		CouponRecord coupon = null;
		try {
			String couponStr = (String) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.geCouponsByCode", couponCode);
			coupon = GsonFactory.getDefault().fromJson(couponStr, new TypeToken<CouponRecord>() {
			}.getType());
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return coupon;
	}

	public int addOrUpGlobalCoupon(String oprGroup, String loginUrl, Map<String, Object> glCoupon) {
		int ret = 0;
		try {
			String cpListStr = GsonFactory.getDefault().toJson(glCoupon);
			ret = (Integer) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.addOrUpGlobalCoupon", cpListStr);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public long delGlobalCoupon(String oprGroup, String loginUrl, String couponCode) {
		int ret = 0;
		try {
			ret = (Integer) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.delGlobalCoupon", couponCode);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String enableGlobalCouponByCode(String oprGroup, String loginUrl, String couponCode, boolean enable) {
		String ret = "";
		try {
			int affectNum = (Integer) doInvoke(oprGroup, loginUrl, "loginXmlRpcService.enableGlobalCouponByCode",
					couponCode, enable);
			if (affectNum > 0) {
				ret = "SUCCESS";
			}
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public Pair<Integer, List<Map<String, Object>>> getFeedbackList(String oprGroup, int limit, String offsetStr) {
		Pair<Integer, List<Map<String, Object>>> ret = null;

		try {
			String fbStrs = (String) invoke(oprGroup, "loginXmlRpcService.getFeedbackList", limit, offsetStr);
			Map<String, Object> r = GsonFactory.getDefault().fromJson(fbStrs, new TypeToken<Map<String, Object>>() {
			}.getType());
			int count = Double.valueOf(r.get("count").toString()).intValue();
			List<Map<String, Object>> fbs = (List<Map<String, Object>>) r.get("fbs");
			ret = Pair.newInstance(count, fbs);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String replyFeedback(String oprGroup, String idStr, String replyContent) {
		String ret = null;
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.replyFeedback", idStr, replyContent);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String removeFeedback(String oprGroup, String idStr) {
		String ret = null;
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.removeFeedback", idStr);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String redoOrder(String oprGroup, String orderId, String opName) {
		String ret = null;
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.redoOrder", orderId);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		LoggerUtils.warn("redoOrder ", opName, orderId, ret);
		return ret;
	}

	public List<Map<String, Object>> queryForList(String oprGroup, String sql) {
		List<Map<String, Object>> cpList = null;
		try {
			String crListStr = (String) invoke(oprGroup, "loginXmlRpcService.queryForList", sql);
			cpList = GsonFactory.getDefault().fromJson(crListStr, new TypeToken<List<Map<String, Object>>>() {
			}.getType());
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return cpList;
	}

	public int executeUpdate(String oprGroup, String sql) {
		int ret = -1;
		try {
			ret = (Integer) invoke(oprGroup, "loginXmlRpcService.executeUpdate", sql);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public String resetPassword(String oprGroup, String accountName, String password) {
		String ret = null;
		try {
			ret = (String) invoke(oprGroup, "loginXmlRpcService.resetPassword", accountName, password);
		} catch (Exception e) {
			ret = "FAILURE";
			LoggerUtils.error(e);
		}
		LoggerUtils.warn("resetPassword ", accountName, password);
		if (!"SUCCESS".equals(ret)) {
			LoggerUtils.warn("resetPassword failed! maybe account not exists!", accountName, password);
		}
		return ret;
	}

	public Pair<Integer, List<Map<String, Object>>> getAppstorePurchasedRecordList(String oprGroup, int serverId,
			long gbId, String accountName, String roleName, int limit, long offset) {
		Pair<Integer, List<Map<String, Object>>> ret = null;
		try {
			String fbStrs = (String) invoke(oprGroup, "loginXmlRpcService.getAppstorePurchasedRecordList", serverId,
					String.valueOf(gbId), accountName, roleName, limit, String.valueOf(offset));
			Map<String, Object> r = GsonFactory.getDefault().fromJson(fbStrs, new TypeToken<Map<String, Object>>() {
			}.getType());
			int count = Double.valueOf(r.get("count").toString()).intValue();
			List<Map<String, Object>> aprs = (List<Map<String, Object>>) r.get("aprs");
			ret = Pair.newInstance(count, aprs);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
		return ret;
	}

	public int unbindGameCenter(String oprGroup, String accountName) {
		Integer ret = null;
		try {
			ret = (Integer) invoke(oprGroup, "loginXmlRpcService.unbindGameCenter", accountName);
		} catch (Exception e) {
			ret = -100;
			LoggerUtils.error(e);
		}
		LoggerUtils.info("unbindGameCenter ", accountName, ret);
		return ret;
	}

	public int unbindGamePhone(String oprGroup, String accountName) {
		Integer ret = null;
		try {
			ret = (Integer) invoke(oprGroup, "loginXmlRpcService.unbindGamePhone", accountName);
		} catch (Exception e) {
			ret = -100;
			LoggerUtils.error(e);
		}
		LoggerUtils.info("unbindGamePhone ", accountName, ret);
		return ret;
	}

	public Map<Integer, GameAccount> getGameaccount(String oprGroup, Map<Integer, String> idfa) {
		String m = "";
		String idfastr = GsonFactory.getDefault().toJson(idfa);
		try {
			m = (String) invoke(oprGroup, "loginXmlRpcService.getGameAccount", idfastr);
		} catch (Exception e) {
			m = "";
			LoggerUtils.error(e);
		}
		Map<Integer, GameAccount> game = new HashMap<Integer, GameAccount>();
		if (!m.equals("")) {
			game = GsonFactory.getDefault().fromJson(m, new TypeToken<Map<Integer, GameAccount>>() {
			}.getType());
		}
		return game;

	}

}
