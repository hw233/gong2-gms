package com.hadoit.game.fsgame.gms.dao.opt.game;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.dao.BaseDomainDao;
import com.hadoit.game.fsgame.gms.meta.opt.game.OtherBehvStats;

@Component("otherBehvStatsDao")
public class OtherBehvStatsDao extends BaseDomainDao<OtherBehvStats> {

	@Override
	protected Class<OtherBehvStats> getDomainClass() {
		return OtherBehvStats.class;
	}
}
