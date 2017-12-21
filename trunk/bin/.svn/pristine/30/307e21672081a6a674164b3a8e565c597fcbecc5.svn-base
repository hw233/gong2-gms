package com.hadoit.game.fsgame.gms.utils;

import java.util.List;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hadoit.game.fsgame.gms.gfs.FileStorageManager;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.net.GasAdminClientManager;
import com.hadoit.game.fsgame.gms.service.ScheduleManager;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;

public class NPSContextLoaderListener extends ContextLoaderListener {

	@Override
	public void contextInitialized(ServletContextEvent ctxEvent) {
		super.contextInitialized(ctxEvent);
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(ctxEvent
				.getServletContext());
		FsGameGmsUtils.applicationContext = wac;
		ServerInfoService serverInfoService = (ServerInfoService) wac.getBean("serverInfoService");
		GasAdminClientManager gasAdminClientManager = (GasAdminClientManager) wac.getBean("gasAdminClientManager");
		FileStorageManager fileStorageManager = (FileStorageManager) wac.getBean("fileStorageManager");
		List<ServerInfo> allSrv = serverInfoService.getAllServer(false);
		gasAdminClientManager.onServerStart(allSrv);
		fileStorageManager.onServerStart(allSrv);
		ScheduleManager scheduleManager = (ScheduleManager) wac.getBean("scheduleManager");
		scheduleManager.init();
	}

	@Override
	public void contextDestroyed(ServletContextEvent ctxEvent) {
		super.contextDestroyed(ctxEvent);
	}
}
