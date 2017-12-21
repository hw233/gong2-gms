package com.hadoit.game.fsgame.gms.dao.opt;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.dao.BaseDomainDao;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalDataForAll;

@Component("optGlobalDataForAllDao")
public class OptGlobalDataForAllDao extends BaseDomainDao<OptGlobalDataForAll> {

	@Override
	protected Class<OptGlobalDataForAll> getDomainClass() {
		return OptGlobalDataForAll.class;
	}

}