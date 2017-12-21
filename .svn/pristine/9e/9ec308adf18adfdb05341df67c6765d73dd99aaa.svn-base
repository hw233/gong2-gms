package com.hadoit.game.fsgame.gms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.dao.opt.game.GoldStatsDao;
import com.hadoit.game.fsgame.gms.dao.opt.game.ItemStatsDao;
import com.hadoit.game.fsgame.gms.dao.opt.game.OtherBehvStatsDao;
import com.hadoit.game.fsgame.gms.dao.opt.game.ResAllStatsDao;
import com.hadoit.game.fsgame.gms.meta.opt.game.GoldStats;
import com.hadoit.game.fsgame.gms.meta.opt.game.ItemStats;
import com.hadoit.game.fsgame.gms.meta.opt.game.OtherBehvStats;
import com.hadoit.game.fsgame.gms.meta.opt.game.ResAllStats;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Transactional
@Component("gameStatsService")
public class GameStatsService {

	@Autowired
	private ResAllStatsDao resAllStatsDao;

	@Autowired
	private OtherBehvStatsDao otherBehvStatsDao;

	@Autowired
	private GoldStatsDao goldStatsDao;

	@Autowired
	private ItemStatsDao itemStatsDao;

	public Pair<Integer, List<ResAllStats>> searchResAllStatsData(int serverId, String oprGroup, int type,
			int approach, long startTime, long endTime, int limit, long offset) {
		Map<String, Object> extraQry = new HashMap<String, Object>();
		if (type > 0) {
			extraQry.put("type", type);
		}
		if (approach > 0) {
			extraQry.put("approach", approach);
		}
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, oprGroup, startTime, endTime, limit, offset,
				extraQry);
		int total = resAllStatsDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<ResAllStats> ds = resAllStatsDao.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<OtherBehvStats>> searchOtherBehvStatsData(int serverId, String oprGroup, String behv,
			long startTime, long endTime, int limit, long offset) {
		Map<String, Object> extraQry = new HashMap<String, Object>();
		if (!behv.equals("0")) {
			extraQry.put("behv", behv);
		}
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, oprGroup, startTime, endTime, limit, offset,
				extraQry);
		int total = otherBehvStatsDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<OtherBehvStats> ds = otherBehvStatsDao
				.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<ItemStats>> searchItemStatsData(int serverId, String oprGroup, int itemId,
			long startTime, long endTime, int limit, long offset) {
		Map<String, Object> extraQry = new HashMap<String, Object>();
		if (itemId > 0) {
			extraQry.put("itemId", itemId);
		}
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, oprGroup, startTime, endTime, limit, offset,
				extraQry);
		int total = itemStatsDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<ItemStats> ds = itemStatsDao.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<GoldStats>> searchGoldStatsData(int serverId, String oprGroup, long startTime,
			long endTime, int limit, long offset) {
		Map<String, Object> extraQry = new HashMap<String, Object>();
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, oprGroup, startTime, endTime, limit, offset,
				extraQry);
		int total = goldStatsDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<GoldStats> ds = goldStatsDao.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}
}
