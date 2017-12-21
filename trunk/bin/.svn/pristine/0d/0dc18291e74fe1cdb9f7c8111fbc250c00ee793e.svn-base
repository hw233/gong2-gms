package com.hadoit.game.fsgame.gms.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.lang.DataUtils;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Transactional
@Component("outterService")
public class OutterService {

	private final static String SIGNATURE_KEY = "05f8f90b1afca6b62edd9e91ad534622";

	@Autowired
	private LogService logService;

	public Object queryPlayerFee(Map<String, Object> requestParams) {
		String startTime = DataUtils.getMapString(requestParams, "startTime", "");
		String endTime = DataUtils.getMapString(requestParams, "endTime", "");
		String serverId = DataUtils.getMapString(requestParams, "serverId", "");
		String oprGroup = DataUtils.getMapString(requestParams, "oprGroup", "");
		String accountName = DataUtils.getMapString(requestParams, "accountName", "");
		String signature = DataUtils.getMapString(requestParams, "signature", "");

		String mySign = FsGameGmsUtils.md5low(startTime + endTime + serverId + oprGroup + accountName + SIGNATURE_KEY);

		int returnCode = -1;
		String returnMsg = "fail";
		Object data = null;
		try {
			if (StringUtils.isNotBlank(startTime) && StringUtils.isNotBlank(endTime)
					&& StringUtils.isNotBlank(serverId) && StringUtils.isNotBlank(oprGroup)
					&& StringUtils.isNotBlank(accountName)) {
				if (signature.equals(mySign)) { // 验签成功
					data = logService.searchPlayerFee(Integer.valueOf(serverId.substring(1)), oprGroup, startTime,
							endTime, accountName + "@" + oprGroup);
				} else {
					returnMsg = "sign error";
				}
			} else {
				returnMsg = "param is blank";
			}
		} catch (Exception e) {
			LoggerUtils.error(e);
		}

		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("returnCode", returnCode + "");
		retMap.put("returnMsg", returnMsg);
		if (data != null) {
			retMap.put("data", data);
		}
		return retMap;
	}

	public Object queryPlayerFeeGroup(Map<String, Object> requestParams) {
		String startTime = DataUtils.getMapString(requestParams, "startTime", "");
		String endTime = DataUtils.getMapString(requestParams, "endTime", "");
		String oprGroup = DataUtils.getMapString(requestParams, "oprGroup", "");
		String signature = DataUtils.getMapString(requestParams, "signature", "");

		String mySign = FsGameGmsUtils.md5low(startTime + endTime + oprGroup + SIGNATURE_KEY);

		int returnCode = -1;
		String returnMsg = "fail";
		Object data = null;
		try {
			if (StringUtils.isNotBlank(startTime) && StringUtils.isNotBlank(endTime)
					&& StringUtils.isNotBlank(oprGroup)) {
				if (signature.equals(mySign)) { // 验签成功
					data = logService.searchPlayerFeeGroup(oprGroup, startTime, endTime);
				} else {
					returnMsg = "sign error";
				}
			} else {
				returnMsg = "param is blank";
			}
		} catch (Exception e) {
			LoggerUtils.error(e);
		}

		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("returnCode", returnCode + "");
		retMap.put("returnMsg", returnMsg);
		if (data != null) {
			retMap.put("data", data);
		}
		return retMap;
	}
}
