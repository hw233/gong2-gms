package com.hadoit.game.fsgame.gms.net;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.engine.core.rpc.base.annotation.Rpc;
import com.hadoit.game.engine.core.rpc.base.annotation.RpcEvent;
import com.hadoit.game.engine.core.rpc.base.constant.RpcEventType;
import com.hadoit.game.engine.core.rpc.base.handler.RpcHandler;
import com.hadoit.game.engine.core.rpc.simple.context.ClientChannelContext;
import com.hadoit.game.fsgame.gms.gfs.FileStorageManager;
import com.hadoit.game.fsgame.gms.service.GasService;
import com.hadoit.game.fsgame.gms.service.ServerInfoService;
import com.hadoit.game.fsgame.gms.utils.FsGameGasRpcConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Scope("prototype")
@Component("gasAdminListener")
public class GasAdminListener implements RpcHandler {

	@Autowired
	private ServerInfoService serverInfoService;

	@Autowired
	private GasAdminClientManager gasAdminClientManager;

	@Autowired
	private FileStorageManager fileStorageManager;

	@Autowired
	private GasService gasService;

	private String host;

	private int port;

	public GasAdminListener() {

	}

	public GasAdminListener(String host, int port) {
		this.host = host;
		this.port = port;
	}

	private void updateServerState(int state) {
		final List<Pair<Integer, String>> pList = gasAdminClientManager.getOprGroupAndServerIdListBy(host, port);
		if (CollectionUtils.isEmpty(pList)) {
			return;
		}
		for (Pair<Integer, String> p : pList) {
			serverInfoService.updateServerState(p.getFirst(), p.getSecond(), state);
		}

		// 注册文件接口
		for (Pair<Integer, String> p : pList) {
			if (state == FsGameGmsConst.SERVER_STATE_OPEN) {
				String keyName = FsGameGmsUtils.getServerAndOprGroupIdentify(p.getFirst(), p.getSecond());
				LoggerUtils.info("registFile on server connected! keyName=" + keyName, p.getFirst(), p.getSecond());
				fileStorageManager.registFile(keyName);
			}
		}

		if (state == FsGameGmsConst.SERVER_STATE_OPEN) {
			// handshake只需一个服务器即可
			gasAdminClientManager.getHandshakeExecutor().execute(new Runnable() {
				@Override
				public void run() {
					gasService.handshake(pList.get(0).getFirst(), pList.get(0).getSecond());
				}
			});
		}
	}

	@RpcEvent(RpcEventType.CHANNEL_CONNECTED)
	public void onConnect(final ClientChannelContext channelContext) throws Exception {
		LoggerUtils.info("gas connected! channel=", channelContext.getChannel(), Thread.currentThread().toString());
		updateServerState(FsGameGmsConst.SERVER_STATE_OPEN);
	}

	@RpcEvent(RpcEventType.CHANNEL_DISCONNECTED)
	public void onDisconnected(final ClientChannelContext channelContext) throws Exception {
		LoggerUtils.warn("gas disconnected! channel=", channelContext.getChannel(), Thread.currentThread().toString());
		updateServerState(FsGameGmsConst.SERVER_STATE_CLOSE);
	}

	@Rpc(fullAlias = FsGameGasRpcConst.ADMIN_GMS_RES_ON_SAY)
	public void onSay(final ClientChannelContext channelContext, int serverId, String oprGroup, String messageJsonData) {
		LoggerUtils.info("On say, serverId=", serverId, ", oprGroup=", oprGroup, ", messageJsonData=", messageJsonData);
		if (StringUtils.isBlank(messageJsonData)) {
			return;
		}
		String keyName = FsGameGmsUtils.getServerAndOprGroupIdentify(serverId, oprGroup);
		fileStorageManager.addLineToFile(keyName, messageJsonData);
	}
}
