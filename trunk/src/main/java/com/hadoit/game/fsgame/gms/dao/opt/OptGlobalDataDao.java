package com.hadoit.game.fsgame.gms.dao.opt;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.dao.BaseDomainDao;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalData;

@Component("optGlobalDataDao")
public class OptGlobalDataDao extends BaseDomainDao<OptGlobalData> {

	@Override
	protected Class<OptGlobalData> getDomainClass() {
		return OptGlobalData.class;
	}

}