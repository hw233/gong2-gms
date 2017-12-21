package com.hadoit.game.fsgame.gms.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.hadoit.game.common.framework.dao.domain.SimpleDomainJdbcDaoSupport;
import com.hadoit.game.fsgame.gms.meta.Bean;

public abstract class BaseLogDao<T extends Bean> extends SimpleDomainJdbcDaoSupport<T> {

	@Autowired
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	public void init() {
		initTable(getDomainClass());
	}

	protected  Class<T> getDomainClass(){
		return null;
	}
}
