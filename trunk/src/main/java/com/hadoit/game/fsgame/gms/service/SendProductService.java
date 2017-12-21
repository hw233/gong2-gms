package com.hadoit.game.fsgame.gms.service;

import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.framework.web.security.SecurityContextHolder;
import com.hadoit.game.fsgame.gms.dao.SendProductDao;
import com.hadoit.game.fsgame.gms.meta.SendProduct;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;

@Transactional
@Component("SendProductService")
public class SendProductService {

	@Autowired
	private SendProductDao sendProductDao;

	@Autowired
	private GasService gasService;

	@Autowired
	private ServerInfoService serverInfoService;

	public List<SendProduct> getAllProductMsg(int limit, int offset) {
		return sendProductDao.getListByCondition("id > 0 order by createTime desc", limit, offset);
	}

	public int getAllProductMsgCount() {
		return sendProductDao.getCount();
	}

	public void deleteProductMsg(long rId) {
		sendProductDao.deleteById(rId);
	}

	public SendProduct getProductMsgForUpdate(long rId) {
		return sendProductDao.getForUpdateById(rId);
	}

	public SendProduct getProductMsg(long rId) {
		return sendProductDao.getById(rId);
	}

	public void addProductMsg(SendProduct srm) {

		srm.setOwner(SecurityContextHolder.getSessionAuthInfo().getUserName());
		srm.setState(FsGameGmsConst.VERIFY_STATE_PENDING);
		sendProductDao.addObject(srm);
	}

	public void updateProductMsg(SendProduct srm) {

		srm.setOwner(SecurityContextHolder.getSessionAuthInfo().getUserName());
		srm.setState(FsGameGmsConst.VERIFY_STATE_PENDING);
		sendProductDao.updateObject(srm);
	}

	public String allowSend(long rId) {
		SendProduct msg = this.getProductMsg(rId);
		if (msg == null) {
			return "FAILURE";
		}
		if (msg.getState() != FsGameGmsConst.VERIFY_STATE_PENDING) {
			return "FAILURE";
		}

		// 105916176

		boolean ret = gasService.sendChongzhiProduct(msg.getServerId(), msg.getOprGroup(),
				Long.valueOf(msg.getToUser()), msg.getProductId(), 1, msg.getOwner());

		String res = "Failure";

		if (ret == true) {

			res = "SUCCESS";
		}

		if (StringUtils.equals(res, "SUCCESS")) {
			msg = getProductMsgForUpdate(rId);
			sendProductDao.updateStateAndTime(rId, FsGameGmsConst.VERIFY_STATE_ALLOW, System.currentTimeMillis());
		}

		return res;
	}

	public void refuseSend(long rId) {
		SendProduct msg = this.getProductMsg(rId);
		if (msg == null) {
			return;
		}
		if (msg.getState() != FsGameGmsConst.VERIFY_STATE_PENDING) {
			return;
		}
		msg = getProductMsgForUpdate(rId);
		sendProductDao.updateState(rId, FsGameGmsConst.VERIFY_STATE_REFUSE);
	}
}
