package com.hadoit.game.fsgame.gms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.reflect.TypeToken;
import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.fsgame.gms.dao.SystemRewardMsgDao;
import com.hadoit.game.fsgame.gms.meta.SystemRewardMsg;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Transactional
@Component("systemRewardMsgService")
public class SystemRewardMsgService {

	@Autowired
	private SystemRewardMsgDao systemRewardMsgDao;

	@Autowired
	private GasService gasService;

	@Autowired
	private ServerInfoService serverInfoService;

	public List<SystemRewardMsg> getAllSystemRewardMsg(int limit, int offset) {
		return systemRewardMsgDao.getListByCondition("id > 0 order by createTime desc", limit, offset);
	}

	public int getAllSystemRewardMsgCount() {
		return systemRewardMsgDao.getCount();
	}

	public void deleteSystemRewardMsg(long rId) {
		systemRewardMsgDao.deleteById(rId);
	}

	public SystemRewardMsg getSystemRewardMsgForUpdate(long rId) {
		return systemRewardMsgDao.getForUpdateById(rId);
	}

	public SystemRewardMsg getSystemRewardMsg(long rId) {
		return systemRewardMsgDao.getById(rId);
	}

	public void addSystemRewardMsg(SystemRewardMsg srm) {
		srm.setOwner(SecurityContextHolder.getSessionAuthInfo().getUserName());
		srm.setState(FsGameGmsConst.VERIFY_STATE_PENDING);
		systemRewardMsgDao.addObject(srm);
	}

	public void updateSystemRewardMsg(SystemRewardMsg srm) {
		getSystemRewardMsgForUpdate(srm.getId());
		srm.setOwner(SecurityContextHolder.getSessionAuthInfo().getUserName());
		srm.setState(FsGameGmsConst.VERIFY_STATE_PENDING);
		systemRewardMsgDao.updateObject(srm);
	}

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

	@SuppressWarnings("rawtypes")
	private String doSend(SystemRewardMsg srm) {
		List<String> recvs = new ArrayList<String>(Arrays.asList(StringUtils.splitByWholeSeparator(srm.getToUsers(),
				"|")));
		if (recvs.size() > 0) {
			if (StringUtils.isEmpty(srm.getOprGroup()) || srm.getServerId() <= 0) {
				LoggerUtils.warn("DoSend to user must take oprGroup! size=" + recvs.size());
				return "定向发送必须选择渠道和服务器!";
			}
		}
		if (recvs.size() > 500) {
			LoggerUtils.warn("DoSend to max users! size=" + recvs.size());
			return "定向发送单次最多500人!";
		}
		// 是否全服发送
		boolean broadcast = recvs.size() == 0;
		List<String> realRecvs = new ArrayList<String>();
		if (!broadcast) {
			StringBuilder sql = new StringBuilder("select uid, gbId from AvatarModel");
			if (recvs.size() > 0) {
				sql.append(" where ");
			}
			String s1 = "gbId = ?";
			Object[] sqlParams = new Object[recvs.size()];
			for (int i = 0; i < recvs.size(); i++) {
				if (i != 0) {
					sql.append(" or ");
				}
				sqlParams[i] = recvs.get(i);
				sql.append(s1);
			}

			List<Map> lls = gasService.queryForList(new TypeToken<List<Map>>() {
			}.getType(), srm.getServerId(), srm.getOprGroup(), sql.toString(), sqlParams);

			if (CollectionUtils.isNotEmpty(lls)) {
				for (Map l : lls) {
					realRecvs.add((String) l.get("uid"));
					recvs.remove(String.valueOf(Double.valueOf(l.get("gbId").toString()).longValue()));
				}
			}

			if (recvs.size() > 0) {
				return "账号输入错误, 发送失败! 出错账号: " + recvs;
			}
		}

		if (srm.getMsgType() == FsGameGmsConst.MSG_TYPE_COMMON) {
			gasService.sendMail(srm.getServerId(), srm.getOprGroup(), realRecvs, srm.getContent());
		} else {
			List<Integer> itemIds = Arrays.asList(string2IntArray(StringUtils.splitByWholeSeparator(srm.getItemIds(),
					"|")));
			List<Integer> itemCounts = Arrays.asList(string2IntArray(StringUtils.splitByWholeSeparator(
					srm.getItemCounts(), "|")));
			
			if (itemIds.size() != itemCounts.size()) {
				return "物品ID个数和物品数量个数不一致";
			}
			
			gasService.sendReward(srm.getServerId(), srm.getOprGroup(), realRecvs, srm.getContent(), itemIds,
					itemCounts, srm.getMoney(), srm.getGold(), srm.getLeijiGold());
		}
		return "SUCCESS";
	}

	public String sendSystemRewardMsg(SystemRewardMsg srm) {
		return doSend(srm);
	}

	public String allowSend(long rId) {
		SystemRewardMsg msg = this.getSystemRewardMsg(rId);
		if (msg == null) {
			return "FAILURE";
		}
		if (msg.getState() != FsGameGmsConst.VERIFY_STATE_PENDING) {
			return "FAILURE";
		}
		String ret = sendSystemRewardMsg(msg);
		if (StringUtils.equals(ret, "SUCCESS")) {
			msg = getSystemRewardMsgForUpdate(rId);
			systemRewardMsgDao.updateStateAndTime(rId, FsGameGmsConst.VERIFY_STATE_ALLOW, System.currentTimeMillis());
		}
		return ret;
	}

	public void refuseSend(long rId) {
		SystemRewardMsg msg = this.getSystemRewardMsg(rId);
		if (msg == null) {
			return;
		}
		if (msg.getState() != FsGameGmsConst.VERIFY_STATE_PENDING) {
			return;
		}
		msg = getSystemRewardMsgForUpdate(rId);
		systemRewardMsgDao.updateState(rId, FsGameGmsConst.VERIFY_STATE_REFUSE);
	}
}
