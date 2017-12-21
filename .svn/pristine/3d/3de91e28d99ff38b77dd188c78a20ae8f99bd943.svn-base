package com.hadoit.game.fsgame.gms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.dao.opt.OptDayDataDao;
import com.hadoit.game.fsgame.gms.dao.opt.OptDayDataForAllDao;
import com.hadoit.game.fsgame.gms.dao.opt.OptDayDataForOprDao;
import com.hadoit.game.fsgame.gms.dao.opt.OptGlobalDataDao;
import com.hadoit.game.fsgame.gms.dao.opt.OptGlobalDataForAllDao;
import com.hadoit.game.fsgame.gms.dao.opt.OptGlobalDataForOprDao;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayData;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayDataForAll;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayDataForOpr;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalData;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalDataForAll;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalDataForOpr;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Transactional
@Component("optDataService")
public class OptDataService {

	@Autowired
	private OptDayDataDao optDayDataDao;

	@Autowired
	private OptDayDataForOprDao optDayDataForOprDao;

	@Autowired
	private OptDayDataForAllDao optDayDataForAllDao;

	@Autowired
	private OptGlobalDataDao optGlobalDataDao;

	@Autowired
	private OptGlobalDataForOprDao optGlobalDataForOprDao;

	@Autowired
	private OptGlobalDataForAllDao optGlobalDataForAllDao;

	public Pair<Integer, List<OptDayData>> searchOptDayData(int serverId, String oprGroup, long startTime,
			long endTime, int limit, long offset) {
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, oprGroup, startTime, endTime, limit, offset,
				null);
		int total = optDayDataDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<OptDayData> ds = optDayDataDao.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<OptGlobalData>> searchOptGlobalData(int serverId, String oprGroup, long startTime,
			long endTime, int limit, long offset) {
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, oprGroup, startTime, endTime, limit, offset,
				null);
		int total = optGlobalDataDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<OptGlobalData> ds = optGlobalDataDao.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}

	public List<OptGlobalDataForAll> queryOptGlobalDataForAll(long time) {
		return optGlobalDataForAllDao.getListByFullCondition("createTime = ? order by oprGroup", time);
	}

	public List<OptDayDataForAll> queryOptDayDataForAll(long time) {
		return optDayDataForAllDao.getListByFullCondition("createTime = ? order by oprGroup", time);
	}

	public List<OptGlobalDataForOpr> queryOptGlobalDataForOpr(long time) {
		return optGlobalDataForOprDao.getListByFullCondition("createTime = ? order by oprGroup, opr", time);
	}

	public List<OptDayDataForOpr> queryOptDayDataForOpr(long time) {
		return optDayDataForOprDao.getListByFullCondition("createTime = ? order by oprGroup, opr", time);
	}

	public List<OptGlobalData> queryOptGlobalData(long time) {
		return optGlobalDataDao.getListByFullCondition("createTime = ? order by oprGroup, serverId", time);
	}

	public List<OptDayData> queryOptDayData(long time) {
		return optDayDataDao.getListByFullCondition("createTime = ? order by oprGroup, serverId", time);
	}
}
