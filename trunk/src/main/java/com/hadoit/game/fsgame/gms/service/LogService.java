package com.hadoit.game.fsgame.gms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.reflect.TypeToken;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.dao.log.CriticalLogDao;
import com.hadoit.game.fsgame.gms.dao.log.CurrencyChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.ExpChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.GoldChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.GoldRechargeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.ItemChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.MoneyChangeLogDao;
import com.hadoit.game.fsgame.gms.dao.log.OnlineLogDao;
import com.hadoit.game.fsgame.gms.meta.log.CriticalLog;
import com.hadoit.game.fsgame.gms.meta.log.CurrencyChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.ExpChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.GoldChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.ItemChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.MoneyChangeLog;
import com.hadoit.game.fsgame.gms.meta.log.OnlineLog;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;

@Component("logService")
public class LogService {

	@Autowired
	private OprGroupService oprGroupService;

	public Pair<Integer, List<CurrencyChangeLog>> searchCurrencyChangeLog(int srvId, String oprGroup, int cId,
			String accountName, String roleName, long startTime, long endTime, int limit, long offset) {
		CurrencyChangeLogDao currencyChangeLogDao = oprGroupService.getCurrencyChangeLogDao(oprGroup);
		if (currencyChangeLogDao == null) {
			return null;
		}
		// 勾玉等
		List<CurrencyChangeLog> ds = new ArrayList<CurrencyChangeLog>();
		int total = 0;
		if (!accountName.isEmpty()) {
			ds = currencyChangeLogDao.getListByCondition(
					"currencyId = ? and serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? order by createTime desc",
					limit, offset, cId, srvId, startTime, endTime, accountName);
			total = currencyChangeLogDao.getCountByCondition(
					"currencyId = ? and serverId = ? and createTime >= ? and createTime < ? and accountName = ?", cId,
					srvId, startTime, endTime, accountName);
		} else if (!roleName.isEmpty()) {
			ds = currencyChangeLogDao.getListByCondition(
					"currencyId = ? and serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ? order by createTime desc",
					limit, offset, cId, srvId, startTime, endTime, roleName);
			total = currencyChangeLogDao.getCountByCondition(
					"currencyId = ? and serverId = ? and createTime >= ? and createTime < ? and roleName = ?", cId,
					srvId, startTime, endTime, roleName);
		}

		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<MoneyChangeLog>> searchMoneyChangeLog(int srvId, String oprGroup, String accountName,
			String roleName, long startTime, long endTime, int limit, long offset) {
		MoneyChangeLogDao moneyChangeLogDao = oprGroupService.getMoneyChangeLogDao(oprGroup);
		if (moneyChangeLogDao == null) {
			return null;
		}
		List<MoneyChangeLog> ds = new ArrayList<MoneyChangeLog>();
		int total = 0;
		if (!accountName.isEmpty()) {
			ds = moneyChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, accountName);
			total = moneyChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ?", srvId, startTime,
					endTime, accountName);
		} else if (!roleName.isEmpty()) {
			ds = moneyChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, roleName);
			total = moneyChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ?", srvId, startTime,
					endTime, roleName);
		}

		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<ItemChangeLog>> searchItemChangeLog(int srvId, String oprGroup, String accountName,
			long gbId, int itemTemplateId, long dateTime, int limit, long offset) {
		ItemChangeLogDao itemChangeLogDao = oprGroupService.getItemChangeLogDao(oprGroup);
		if (itemChangeLogDao == null) {
			return null;
		}
		List<ItemChangeLog> ds = new ArrayList<ItemChangeLog>();
		int total = 0;
		// accountName和gbId一定要有一个
		if (StringUtils.isNotBlank(accountName)) {
			ds = itemChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime = ? and accountName = ? and itemTemplateId = ? order by createTime desc",
					limit, offset, srvId, dateTime, accountName, itemTemplateId);
			total = itemChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime = ? and accountName = ? and itemTemplateId = ?", srvId, dateTime,
					accountName, itemTemplateId);
		} else if (gbId > 0) {
			ds = itemChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime = ? and gbId = ? and itemTemplateId = ? order by createTime desc",
					limit, offset, srvId, dateTime, gbId, itemTemplateId);
			total = itemChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime = ? and gbId = ? and itemTemplateId = ?", srvId, dateTime, gbId,
					itemTemplateId);
		}
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<ItemChangeLog>> searchItemChangeLog(int srvId, String oprGroup, String accountName,
			long gbId, int itemTemplateId, long dateTime, long endTime, int limit, long offset) {
		ItemChangeLogDao itemChangeLogDao = oprGroupService.getItemChangeLogDao(oprGroup);
		if (itemChangeLogDao == null) {
			return null;
		}
		List<ItemChangeLog> ds = new ArrayList<ItemChangeLog>();
		int total = 0;
		// accountName和gbId一定要有一个
		if (StringUtils.isNotBlank(accountName)) {
			if (dateTime == endTime) {
				ds = itemChangeLogDao.getListByCondition(
						"serverId = ? and dayCreateTime = ? and accountName = ? and itemTemplateId = ? order by createTime desc",
						limit, offset, srvId, dateTime, accountName, itemTemplateId);
				total = itemChangeLogDao.getCountByCondition(
						"serverId = ? and dayCreateTime = ? and accountName = ? and itemTemplateId = ?", srvId,
						dateTime, accountName, itemTemplateId);
			} else {

				ds = itemChangeLogDao.getListByCondition(
						"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? and itemTemplateId = ? order by createTime desc",
						limit, offset, srvId, dateTime, endTime, accountName, itemTemplateId);
				total = itemChangeLogDao.getCountByCondition(
						"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? and itemTemplateId = ?",
						srvId, dateTime, endTime, accountName, itemTemplateId);
			}

		} else if (gbId > 0) {
			if (dateTime == endTime) {
				ds = itemChangeLogDao.getListByCondition(
						"serverId = ? and dayCreateTime = ? and gbId = ? and itemTemplateId = ? order by createTime desc",
						limit, offset, srvId, dateTime,gbId, itemTemplateId);
				total = itemChangeLogDao.getCountByCondition(
						"serverId = ? and dayCreateTime = ? and gbId = ? and itemTemplateId = ?",
						srvId, dateTime, gbId, itemTemplateId);

			} else {
				ds = itemChangeLogDao.getListByCondition(
						"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and gbId = ? and itemTemplateId = ? order by createTime desc",
						limit, offset, srvId, dateTime, endTime, gbId, itemTemplateId);
				total = itemChangeLogDao.getCountByCondition(
						"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and gbId = ? and itemTemplateId = ?",
						srvId, dateTime, endTime, gbId, itemTemplateId);
			}

		}
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<GoldChangeLog>> searchGoldChangeLog(int srvId, String oprGroup, String accountName,
			String roleName, long startTime, long endTime, int limit, long offset) {
		GoldChangeLogDao goldChangeLogDao = oprGroupService.getGoldChangeLogDao(oprGroup);
		if (goldChangeLogDao == null) {
			return null;
		}
		List<GoldChangeLog> ds = new ArrayList<GoldChangeLog>();
		int total = 0;

		if (!accountName.isEmpty()) {
			ds = goldChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, accountName);
			total = goldChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ?", srvId, startTime,
					endTime, accountName);
		} else if (!roleName.isEmpty()) {
			ds = goldChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, roleName);
			total = goldChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ?", srvId, startTime,
					endTime, roleName);
		}

		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<CriticalLog>> searchCriticalLog(int srvId, String oprGroup, String accountName,
			String roleName, long startTime, long endTime, int limit, long offset) {
		// TODO 这里的月份需要前台传入
		CriticalLogDao criticalLogDao = oprGroupService.getCriticalLogDao(oprGroup, "201701");
		if (criticalLogDao == null) {
			criticalLogDao = oprGroupService.getCriticalLogDao(oprGroup);
		}
		List<CriticalLog> ds = new ArrayList<CriticalLog>();
		int total = 0;

		if (!accountName.isEmpty()) {
			ds = criticalLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, accountName);
			total = criticalLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ?", srvId, startTime,
					endTime, accountName);
		} else if (!roleName.isEmpty()) {
			ds = criticalLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, roleName);
			total = criticalLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ?", srvId, startTime,
					endTime, roleName);
		} else {
			ds = criticalLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? order by createTime desc", limit, offset,
					srvId, startTime, endTime);
			total = criticalLogDao.getCountByCondition("serverId = ? and createTime >= ? and createTime < ?", srvId,
					startTime, endTime);
		}
		return Pair.newInstance(total, ds);
	}

	public Pair<Integer, List<OnlineLog>> searchOnlineData(int serverId, String oprGroup, long startTime, long endTime,
			int limit, long offset) {
		OnlineLogDao onlineLogDao = oprGroupService.getOnlineLogDao(oprGroup);
		if (onlineLogDao == null) {
			return null;
		}
		// log表没有oprGroup
		Object[] sqlDatas = FsGameGmsUtils.buildCommonSqlData(serverId, null, startTime, endTime, limit, offset, null);
		int total = onlineLogDao.getCountByCondition((String) sqlDatas[0], (Object[]) sqlDatas[1]);
		List<OnlineLog> ds = onlineLogDao.getListByFullCondition((String) sqlDatas[2], (Object[]) sqlDatas[3]);
		return Pair.newInstance(total, ds);
	}

	public Map<String, Object> searchPlayerFee(int serverId, String oprGroup, String startTime, String endTime,
			String accountName) {
		String sql1 = "select COALESCE(sum(-goldDelta), 0) s from GoldChangeLog where serverId=? and dayCreateTime >= unix_timestamp(?) * 1000 "
				+ "and dayCreateTime < unix_timestamp(?) * 1000  and goldDelta < 0 and accountName = ?";
		String sql2 = "select COALESCE(sum(-freeGoldDelta), 0) s from GoldChangeLog where serverId=? and dayCreateTime >= unix_timestamp(?) * 1000 "
				+ "and dayCreateTime < unix_timestamp(?) * 1000  and freeGoldDelta < 0 and accountName = ?";
		GoldChangeLogDao goldChangeLogDao = oprGroupService.getGoldChangeLogDao(oprGroup);
		Long ret1 = goldChangeLogDao.getCommonJdbcTemplate().queryForObject(sql1,
				new Object[] { serverId, startTime, endTime, accountName }, Long.class);
		Long ret2 = goldChangeLogDao.getCommonJdbcTemplate().queryForObject(sql2,
				new Object[] { serverId, startTime, endTime, accountName }, Long.class);
		return FsGameGmsUtils.createHashMap("gold", ret1, "freeGold", ret2);
	}

	public List<Map<String, Object>> searchPlayerFeeGroup(String oprGroup, String startTime, String endTime) {
		String sql1 = "select gbId, max(serverId) serverId, COALESCE(sum(-goldDelta), 0) gold, COALESCE(sum(-freeGoldDelta), 0) freeGold from GoldChangeLog where opr = ? and dayCreateTime >= unix_timestamp(?) * 1000 "
				+ "and dayCreateTime < unix_timestamp(?) * 1000  and (goldDelta < 0 or freeGoldDelta < 0) group by gbId order by gold desc";
		GoldChangeLogDao goldChangeLogDao = oprGroupService.getGoldChangeLogDao(oprGroup);
		List<Map<String, Object>> ret1 = goldChangeLogDao.getCommonJdbcTemplate().queryForList(sql1, oprGroup,
				startTime, endTime);
		return ret1;
	}

	public Pair<Integer, List<ExpChangeLog>> searchExpChangeLog(int srvId, String oprGroup, String accountName,
			String roleName, long startTime, long endTime, int limit, long offset) {
		ExpChangeLogDao expChangeLogDao = oprGroupService.getExpChangeLogDao(oprGroup);
		if (expChangeLogDao == null) {
			return null;
		}
		List<ExpChangeLog> ds = new ArrayList<ExpChangeLog>();
		int total = 0;
		// accountName和gbId一定要有一个
		if (StringUtils.isNotBlank(accountName)) {
			ds = expChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, accountName);
			total = expChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and accountName = ?", srvId, startTime,
					endTime, accountName);
		} else if (StringUtils.isNotBlank(roleName)) {
			ds = expChangeLogDao.getListByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ? order by createTime desc",
					limit, offset, srvId, startTime, endTime, roleName);
			total = expChangeLogDao.getCountByCondition(
					"serverId = ? and dayCreateTime >= ? and dayCreateTime < ? and roleName = ?", srvId, startTime,
					endTime, roleName);
		}
		return Pair.newInstance(total, ds);
	}

	public long getTotalChargeAmountByDate(String oprGroup, int serverId, long dayCreateTime) {
		GoldRechargeLogDao goldRechargeLogDao = oprGroupService.getGoldRechargeLogDao(oprGroup);
		String sql = "select COALESCE(SUM(goldDelta), 0) from GoldRechargeLog where serverId = ? and dayCreateTime = ?";
		Long ret = goldRechargeLogDao.getCommonJdbcTemplate().queryForObject(sql,
				new Object[] { serverId, dayCreateTime }, Long.class);
		return ret == null ? 0 : ret;
	}

	public Pair<Integer, List<Map<String, Object>>> searchPlayerChargeRecordList(int serverId, String oprGroup,
			long startTime, long endTime, long gbId, String roleName, int limit, int offset) {
		GoldRechargeLogDao goldRechargeLogDao = oprGroupService.getGoldRechargeLogDao(oprGroup);
		StringBuilder listSb = new StringBuilder("select * from GoldRechargeLog where 1 = 1");
		StringBuilder countSb = new StringBuilder("select count(*) from GoldRechargeLog where 1 = 1");
		List<Object> listParams = new ArrayList<Object>();
		List<Object> countParams = new ArrayList<Object>();
		if (serverId > 0) {
			listSb.append(" and serverId = ?");
			listParams.add(serverId);

			countSb.append(" and serverId = ?");
			countParams.add(serverId);
		}
		if (gbId > 0) {
			listSb.append(" and gbId = ?");
			listParams.add(gbId);

			countSb.append(" and gbId = ?");
			countParams.add(gbId);
		}
		if (StringUtils.isNotBlank(roleName)) {
			listSb.append(" and roleName = ?");
			listParams.add(roleName);

			countSb.append(" and roleName = ?");
			countParams.add(roleName);
		}
		if (startTime > 0) {
			listSb.append(" and createTime >= ?");
			listParams.add(startTime);

			countSb.append(" and createTime >= ?");
			countParams.add(startTime);
		}
		if (endTime > 0) {
			listSb.append(" and createTime < ?");
			listParams.add(endTime);

			countSb.append(" and createTime < ?");
			countParams.add(endTime);
		}
		listSb.append(" order by createTime desc limit ? offset ?");
		listParams.add(limit);
		listParams.add(offset);

		List<Map<String, Object>> lls = goldRechargeLogDao.getCommonJdbcTemplate().queryForList(listSb.toString(),
				listParams.toArray(new Object[0]));
		Integer count = goldRechargeLogDao.getCommonJdbcTemplate().queryForObject(countSb.toString(),
				countParams.toArray(new Object[0]), Integer.class);
		return Pair.newInstance(count.intValue(), lls);
	}

	public long getTotalChargeAmount(int serverId, String oprGroup) {
		GoldRechargeLogDao goldRechargeLogDao = oprGroupService.getGoldRechargeLogDao(oprGroup);
		String sql = "select COALESCE(SUM(goldDelta), 0) from GoldRechargeLog where serverId = ? ";
		Long ret = goldRechargeLogDao.getCommonJdbcTemplate().queryForObject(sql, new Object[] { serverId },
				Long.class);
		return ret == null ? 0 : ret;
	}
}
