package com.hadoit.game.fsgame.gms.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class RollMsgQuartzJobBean implements Job {

	private RollMsgService rollMsgService;
	private long rollMsgId;

	public void setRollMsgService(RollMsgService rollMsgService) {
		this.rollMsgService = rollMsgService;
	}

	public void setRollMsgId(long rollMsgId) {
		this.rollMsgId = rollMsgId;
	}

	public void execute(JobExecutionContext context) throws JobExecutionException {
		rollMsgService.triggerRollMsg(rollMsgId);

	}

}
