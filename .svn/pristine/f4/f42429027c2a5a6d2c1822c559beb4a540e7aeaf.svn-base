package com.hadoit.game.fsgame.gms.service;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.simpl.PropertySettingJobFactory;
import org.springframework.stereotype.Component;

@Component("scheduleManager")
public class ScheduleManager {

	private Scheduler scheduler;
	private String group;

	private int startDelay;

	public Scheduler getScheduler() {
		return scheduler;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getStartDelay() {
		return startDelay;
	}

	public void setStartDelay(int startDelay) {
		this.startDelay = startDelay;
	}

	public ScheduleManager() {
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		try {
			this.scheduler = schedulerFactory.getScheduler();
			this.scheduler.setJobFactory(new PropertySettingJobFactory());
			this.group = "DEFAULT_GROUP";
		} catch (SchedulerException e) {
			throw new RuntimeException("construct schedule manager exception!", e);
		}

	}

	public void init() {
		try {
			if (startDelay > 0) {
				this.scheduler.startDelayed(startDelay);
			} else {
				this.scheduler.start();
			}
		} catch (SchedulerException e) {
			throw new RuntimeException("init schedule manager exception!", e);
		}
	}

	public void destroy() {
		try {
			scheduler.shutdown();
		} catch (SchedulerException e) {
			throw new RuntimeException("shutdown schedule manager exception!", e);
		}
	}

	public JobDetail createJobDetail(String jobName, Class<? extends Job> jobClass, Map<String, Object> param) {
		JobDetail jobDetail = new JobDetail(jobName, group, jobClass);
		jobDetail.getJobDataMap().putAll(param);
		return jobDetail;
	}

	public void addJob(JobDetail jobDetail) {
		try {
			scheduler.addJob(jobDetail, true);
		} catch (SchedulerException e) {
			throw new RuntimeException("add job exception for " + jobDetail.getFullName(), e);
		}
	}

	public void addTrigger(Trigger trigger) {
		try {
			if (scheduler.getTrigger(trigger.getName(), trigger.getGroup()) != null) {
				scheduler.rescheduleJob(trigger.getName(), trigger.getGroup(), trigger);
			} else {
				scheduler.scheduleJob(trigger);
			}
		} catch (SchedulerException e) {
			throw new RuntimeException("add trigger exception for " + trigger.getFullName(), e);
		}
	}

	public void schedule(String triggerName, long startTime, long endTime, int repeatCount, long repeatInterval,
			JobDetail jobDetail, boolean addJob) {
		if (addJob) {
			addJob(jobDetail);
		}
		SimpleTrigger simpleTrigger = new SimpleTrigger(triggerName, group, jobDetail.getName(), jobDetail.getGroup(),
				new Date(startTime), new Date(endTime), repeatCount, repeatInterval);
		addTrigger(simpleTrigger);
	}

	public void schedule(String triggerName, String cronExpression, JobDetail jobDetail, boolean addJob) {
		if (addJob) {
			addJob(jobDetail);
		}
		CronTrigger cronTrigger;
		try {
			cronTrigger = new CronTrigger(triggerName, group, jobDetail.getName(), jobDetail.getGroup(), cronExpression);
		} catch (ParseException e) {
			throw new RuntimeException("cron expression exception for " + cronExpression, e);
		}
		addTrigger(cronTrigger);
	}

	public void schedule(Trigger trigger, JobDetail jobDetail, boolean addJob) {
		if (addJob) {
			addJob(jobDetail);
		}
		addTrigger(trigger);
	}

	public void unscheduleJob(String triggerName) {
		unscheduleJob(triggerName, group);
	}

	public void unscheduleJob(String triggerName, String groupName) {
		try {
			scheduler.unscheduleJob(triggerName, groupName);
		} catch (SchedulerException e) {
			throw new RuntimeException("unschedule job trigger exception for " + triggerName, e);
		}
	}

	public void deleteJob(String jobName) {
		deleteJob(jobName, group);
	}

	public void deleteJob(String jobName, String groupName) {
		try {
			if (scheduler.getJobDetail(jobName, groupName) != null) {
				scheduler.deleteJob(jobName, groupName);
			}
		} catch (SchedulerException e) {
			throw new RuntimeException("delete job exception for " + jobName, e);
		}
	}

}
