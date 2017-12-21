package com.hadoit.game.fsgame.gms.service;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.fsgame.gms.dao.RollMsgDao;
import com.hadoit.game.fsgame.gms.meta.RollMsg;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Component("rollMsgService")
@Transactional
public class RollMsgService {
	private static Logger logger = Logger.getLogger(RollMsgService.class);

	@Autowired
	private RollMsgDao rollMsgDao;

	@Autowired
	private ScheduleManager scheduleManager;

	@Autowired
	private GasService gasService;

	@Autowired
	private ServerInfoService serverInfoService;

	private static String CRON_EXPRESS = "0 {0} {1} * * ? *";

	@PostConstruct
	void init() {
		List<RollMsg> noExpireList = rollMsgDao.getNoExpireList();
		if (CollectionUtils.isEmpty(noExpireList)) {
			return;
		}
		for (RollMsg sn : noExpireList) {
			scheduleJob(sn);
		}
	}

	public void addRollMsg(RollMsg rollMsg) {
		rollMsg.setOwner(SecurityContextHolder.getSessionAuthInfo().getUserName());
		rollMsg.setState(FsGameGmsConst.VERIFY_STATE_PENDING);
		rollMsgDao.addObject(rollMsg);
		// scheduleJob(rollMsg);
	}

	public void updateRollMsg(RollMsg rollMsg) {
		getRollMsgForUpdate(rollMsg.getId());
		rollMsg.setOwner(SecurityContextHolder.getSessionAuthInfo().getUserName());
		rollMsg.setState(FsGameGmsConst.VERIFY_STATE_PENDING);
		rollMsgDao.updateObject(rollMsg);
		// scheduleJob(rollMsg);
	}

	public RollMsg getRollMsg(long rollId) {
		return rollMsgDao.getById(rollId);
	}

	public RollMsg getRollMsgForUpdate(long rollId) {
		return rollMsgDao.getForUpdateById(rollId);
	}

	public List<RollMsg> searchRollMsgList(int limit, int offset) {
		return rollMsgDao.searchList(limit, offset);
	}

	public int searchRollMsgCount() {
		return rollMsgDao.searchCount();
	}

	private void scheduleJob(RollMsg rollMsg) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("rollMsgService", this);
		param.put("rollMsgId", rollMsg.getId());
		JobDetail jobDetail = scheduleManager.createJobDetail("SN_JOB_" + rollMsg.getId(), RollMsgQuartzJobBean.class,
				param);

		if (rollMsg.getRepeatInterval() > 0) {
			scheduleManager.schedule("SN_TRIGGER_" + rollMsg.getId(), rollMsg.getStartTime(), rollMsg.getEndTime(),
					SimpleTrigger.REPEAT_INDEFINITELY, rollMsg.getRepeatInterval() * 1000, jobDetail, true);
		} else {
			String cronExpression = MessageFormat.format(CRON_EXPRESS, rollMsg.getDayMinute(), rollMsg.getDayHour());
			scheduleManager.schedule("SN_TRIGGER_" + rollMsg.getId(), cronExpression, jobDetail, true);
		}
	}

	public void triggerRollMsg(long rollMsgId) {
		RollMsg rollMsg = rollMsgDao.getById(rollMsgId);
		if (rollMsg == null) {
			logger.warn("Msg not exists! rollMsgId=" + rollMsgId);
			return;
		}
		long currTime = System.currentTimeMillis();
		long subTime = currTime - rollMsg.getEndTime();
		if (subTime > 100) {
			delRollMsgs(new long[] { rollMsg.getId() });
			return;
		}
		String msg = rollMsg.getContent();
		LoggerUtils.info("Trigger fire! rollMsg=" + ReflectionToStringBuilder.toString(rollMsg) + ", time="
				+ System.currentTimeMillis());
		doSendRollMsg(rollMsg.getServerId(), rollMsg.getOprGroup(), msg);
	}

	private void doSendRollMsg(int srvId, String oprGroup, String msg) {
//		if (srvId > 0) {
//			gasService.sendRollMsg(srvId, oprGroup, msg);
//		} else {
//			List<ServerInfo> sis = serverInfoService.getAllServer();
//			if (CollectionUtils.isNotEmpty(sis)) {
//				for (ServerInfo si : sis) {
//					gasService.sendRollMsg(si.getServerId(), si.getOprGroup(), msg);
//				}
//			}
//		}
		gasService.sendRollMsg(srvId, oprGroup, msg);
	}

	public void delRollMsgs(long[] ids) {
		if (ArrayUtils.isNotEmpty(ids)) {
			for (long id : ids) {
				rollMsgDao.deleteById(id);
				scheduleManager.deleteJob("SN_JOB_" + id);
			}
		}
	}

	public void allowRollMsg(long rollMsgId) {
		RollMsg rollMsg = getRollMsg(rollMsgId);
		if (rollMsg == null) {
			return;
		}
		if (rollMsg.getState() != FsGameGmsConst.VERIFY_STATE_PENDING) {
			return;
		}
		rollMsg = getRollMsgForUpdate(rollMsgId);
		rollMsgDao.updateState(rollMsgId, FsGameGmsConst.VERIFY_STATE_ALLOW);
		scheduleJob(rollMsg);
	}

	public void refuseRollMsg(long rollMsgId) {
		RollMsg rollMsg = getRollMsg(rollMsgId);
		if (rollMsg == null) {
			return;
		}
		if (rollMsg.getState() != FsGameGmsConst.VERIFY_STATE_PENDING) {
			return;
		}
		rollMsg = getRollMsgForUpdate(rollMsgId);
		rollMsgDao.updateState(rollMsgId, FsGameGmsConst.VERIFY_STATE_REFUSE);
	}

}
