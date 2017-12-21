package com.hadoit.game.fsgame.gms.dao;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.hadoit.game.common.framework.dao.domain.SimpleDomainConfig;
import com.hadoit.game.common.framework.dao.domain.SimpleDomainJdbcDaoSupport;
import com.hadoit.game.fsgame.gms.meta.Bean;

public abstract class BaseDomainDao<T extends Bean> extends SimpleDomainJdbcDaoSupport<T> {

	@Autowired
	public void setDomainConfig(SimpleDomainConfig domainConfig) {
		super.setDomainConfig(domainConfig);
	}

	@PostConstruct
	public void init() {
		initTable(getDomainClass());
	}

	protected abstract Class<T> getDomainClass();
}
