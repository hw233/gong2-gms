package com.hadoit.game.fsgame.gms.dao.opt.game;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.dao.BaseDomainDao;
import com.hadoit.game.fsgame.gms.meta.opt.game.ItemStats;

@Component("itemStatsDao")
public class ItemStatsDao extends BaseDomainDao<ItemStats> {

	@Override
	protected Class<ItemStats> getDomainClass() {
		return ItemStats.class;
	}
}
