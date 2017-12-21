package com.hadoit.game.fsgame.gms.dao;

import org.springframework.stereotype.Component;

import com.hadoit.game.fsgame.gms.meta.OprGroup;

@Component("oprGroupDao")
public class OprGroupDao extends BaseDomainDao<OprGroup> {

	@Override
	protected Class<OprGroup> getDomainClass() {
		return OprGroup.class;
	}

	public OprGroup getOprGroup(String oprGroup) {
		return getObjectByCondition("oprGroup=?", oprGroup);
	}

}
