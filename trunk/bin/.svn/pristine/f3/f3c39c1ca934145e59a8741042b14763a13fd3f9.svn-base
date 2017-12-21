package com.hadoit.game.fsgame.gms.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.annotation.ALogDao;
import com.hadoit.game.fsgame.gms.dao.BaseLogDao;
import com.hadoit.game.fsgame.gms.dao.OprGroupDao;
import com.hadoit.game.fsgame.gms.dao.log.CriticalLogDao;
import com.hadoit.game.fsgame.gms.dao.log.CurrencyChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.ExpChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.GoldChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.GoldRechargeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.ItemChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.MoneyChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.OnlineLogDao;
import com.hadoit.game.fsgame.gms.meta.OprGroup;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;
import com.hadoit.game.fsgame.gms.utils.PackageUtil;

@Transactional
@Component("oprGroupService")
public class OprGroupService {
	@Autowired
	private OprGroupDao oprGroupDao;

	/**
	 * daoClass->{hd->daoObj, test->daoObj}
	 */
	private ConcurrentHashMap<Class<?>, Map<String, BaseLogDao<?>>> daoMap;

	private List<String> oprGroupList;

	@PostConstruct
	void init() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		List<OprGroup> oglist = oprGroupDao.getAll();
		daoMap = new ConcurrentHashMap<Class<?>, Map<String, BaseLogDao<?>>>();
		oprGroupList = Collections.synchronizedList(new ArrayList<String>());
		for (OprGroup og : oglist) {
			restoreOne(og);
		}
	}

	private void restoreOne(OprGroup og) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(og.getLogDbUrl());
		ds.setUsername(og.getLogDbUserName());
		ds.setPassword(og.getLogDbPassword());
		ds.setInitialSize(5);
		ds.setMaxActive(20);
		ds.setMaxIdle(10);
		ds.setMaxWait(30000);
		ds.setValidationQuery("SELECT 1");
		ds.setTestOnBorrow(true);
		ds.setTestWhileIdle(true);
		ds.setTimeBetweenEvictionRunsMillis(1800000);
		ds.setMinEvictableIdleTimeMillis(1800000);

		List<String> classNames = PackageUtil.getClassName("com.hadoit.game.fsgame.gms.dao.log", true);
		if (classNames != null) {
			for (String className : classNames) {
				Class<?> cl = Class.forName(className);
				ALogDao ald = cl.getAnnotation(ALogDao.class);
				if (ald != null) {
					BaseLogDao<?> bl = (BaseLogDao<?>) cl.newInstance();
					bl.setDataSource(ds);
					bl.init();
					if (!daoMap.containsKey(cl)) {
						Map<String, BaseLogDao<?>> blMap = new ConcurrentHashMap<String, BaseLogDao<?>>();
						daoMap.put(cl, blMap);
					}
					daoMap.get(cl).put(og.getOprGroup(), bl);
				}
			}
		}
		oprGroupList.add(og.getOprGroup());
	}

	private void onUpdate(OprGroup og, boolean delete) {
		for (Map<String, BaseLogDao<?>> subm : daoMap.values()) {
			BaseLogDao<?> bld = subm.remove(og.getOprGroup());
			if (bld != null) {
				((DataSource) bld.getDataSource()).close(true);
			}
		}
		oprGroupList.remove(og.getOprGroup());
		try {
			if (!delete) {
				restoreOne(og);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addOprGroup(OprGroup og) {
		oprGroupDao.addObject(og);
		onUpdate(og, false);
	}

	public void updateOprGroup(OprGroup og) {
		oprGroupDao.updateObject(og);
		onUpdate(og, false);
	}
    public String getOprStr(String oprGroup){
    	
    	OprGroup og = oprGroupDao.getOprGroup(oprGroup);
    	return og.getOprMatchStr();
    	
    }
	public boolean deleteOprGroup(long id) {
		OprGroup og = oprGroupDao.getById(id);
		boolean delSuc = oprGroupDao.deleteById(id);
		onUpdate(og, true);
		return delSuc;
	}

	public OprGroup getOprGroupById(long id) {
		OprGroup og = oprGroupDao.getById(id);
		return og;
	}

	public List<OprGroup> getAll() {
		return oprGroupDao.getListByFullCondition("1=1 order by createTime desc");
	}
	private BaseLogDao<?> getDao(Class<?> cl, String oprGroup) {
		Map<String, BaseLogDao<?>> m = daoMap.get(cl);
		if (m == null) {
			return null;
		}
		return m.get(oprGroup);
	}
	

	private void useDb(BaseLogDao<?> baseLogDao, String oprGroup, String month) {
		org.apache.tomcat.jdbc.pool.DataSource tomcatDs = (org.apache.tomcat.jdbc.pool.DataSource) baseLogDao.getDataSource();
		String dbName = "";
		try {
			URI uri = new URI(tomcatDs.getUrl().substring(5));
			dbName = uri.getPath().substring(1);
		} catch (URISyntaxException e) {
			LoggerUtils.error(e);
		}
		
		if (StringUtils.isBlank(dbName)) {
			dbName = "gonggame_log_" + oprGroup + "_" + oprGroup;
		}
		baseLogDao.getCommonJdbcTemplate().execute("use " + dbName);
	}
	//month = 201701
	public CriticalLogDao getCriticalLogDao(String oprGroup, String month) {
		CriticalLogDao logDao = (CriticalLogDao) getDao(CriticalLogDao.class, oprGroup);
		useDb(logDao, oprGroup, month);
		return logDao;
	}
	public CriticalLogDao getCriticalLogDao(String oprGroup) {
		CriticalLogDao logDao = (CriticalLogDao) getDao(CriticalLogDao.class, oprGroup);
//		useDb(logDao, oprGroup);
		return logDao;
	}

	public CurrencyChangeLogDao getCurrencyChangeLogDao(String oprGroup) {
		return (CurrencyChangeLogDao) getDao(CurrencyChangeLogDao.class, oprGroup);
	}

	public GoldChangeLogDao getGoldChangeLogDao(String oprGroup) {
		return (GoldChangeLogDao) getDao(GoldChangeLogDao.class, oprGroup);
	}

	public MoneyChangeLogDao getMoneyChangeLogDao(String oprGroup) {
		return (MoneyChangeLogDao) getDao(MoneyChangeLogDao.class, oprGroup);
	}

	public ItemChangeLogDao getItemChangeLogDao(String oprGroup) {
		return (ItemChangeLogDao) getDao(ItemChangeLogDao.class, oprGroup);
	}

	public ExpChangeLogDao getExpChangeLogDao(String oprGroup) {
		return (ExpChangeLogDao) getDao(ExpChangeLogDao.class, oprGroup);
	}

	public OnlineLogDao getOnlineLogDao(String oprGroup) {
		return (OnlineLogDao) getDao(OnlineLogDao.class, oprGroup);
	}

	public GoldRechargeLogDao getGoldRechargeLogDao(String oprGroup) {
		return (GoldRechargeLogDao) getDao(GoldRechargeLogDao.class, oprGroup);
	}

	public OprGroup getOprGroup(String oprGroup) {
		return oprGroupDao.getOprGroup(oprGroup);
	}

	public Map<String, List<String>> getOprMap() {
		List<OprGroup> oprGroupList = getAll();
		Map<String, List<String>> ret = new HashMap<String, List<String>>();
		for (OprGroup og : oprGroupList) {
			List<String> l = new ArrayList<String>();
			if (StringUtils.isNotBlank(og.getOprMatchStr())) {
				String[] opmArr = StringUtils.splitByWholeSeparator(og.getOprMatchStr(), ",");
				for (String opm : opmArr) {
					l.add(StringUtils.trimToEmpty(opm));
				}
			}
			ret.put(og.getOprGroup(), l);
		}
		return ret;
	}
}
