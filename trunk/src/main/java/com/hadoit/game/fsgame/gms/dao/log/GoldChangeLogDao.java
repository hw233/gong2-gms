package com.hadoit.game.fsgame.gms.dao.log;

import com.hadoit.game.fsgame.gms.annotation.ALogDao;
import com.hadoit.game.fsgame.gms.dao.BaseLogDao;
import com.hadoit.game.fsgame.gms.meta.log.GoldChangeLog;

@ALogDao()
public class GoldChangeLogDao extends BaseLogDao<GoldChangeLog> {

	@Override
	protected Class<GoldChangeLog> getDomainClass() {
		return GoldChangeLog.class;
	}

}
