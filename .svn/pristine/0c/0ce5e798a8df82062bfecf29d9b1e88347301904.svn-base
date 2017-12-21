package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;
import com.hadoit.game.fsgame.gms.meta.SendProduct;

@Component("SendProductDao")
public class SendProductDao extends BaseDomainDao<SendProduct> {

	@Override
	protected Class<SendProduct> getDomainClass() {
		return SendProduct.class;
	}

	public void updateState(long rId, int state) {
		updateColumnValue("state", state, rId);
	}

	public void updateStateAndTime(long rId, int state, long sendTime) {
		updateColumnValue(new String[] { "state", "sendTime" }, new Object[] { state, sendTime }, rId);
	}
}
