#-*- coding:utf-8 -*-
import MySQLdb
import time,datetime
import DbConnection as db
from itertools import *
import utils

# 元宝消耗
LOG_GOLD_CHANGE_GZTB_SUODING = 2
LOG_GOLD_CHANGE_GZTB_TS = 3
LOG_GOLD_CHANGE_GZTB_REFRESH = 4
LOG_GOLD_CHANGE_CHANGE_NAME = 5
LOG_GOLD_CHANGE_BUY_HONGBAO = 10
LOG_GOLD_CHANGE_BUILDING_CREATE = 12
LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER = 13
LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT = 15
LOG_GOLD_CHANGE_FST_CLEAR_CD = 16
LOG_GOLD_CHANGE_CREATE_GONGHUI = 18
LOG_GOLD_CHANGE_OPEN_HUAPENG = 19
LOG_GOLD_CHANGE_BUY_DRESS = 20
LOG_GOLD_CHANGE_BUY_ITEM = 21
LOG_GOLD_CHANGE_SPEED_UP_FLOWER = 22
LOG_GOLD_CHANGE_SPEED_UP_MATERIAL = 23
LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE = 24
LOG_GOLD_CHANGE_BUY_SAODANG = 25
LOG_GOLD_CHANGE_ZHAOMU_SERVANT = 26
LOG_GOLD_CHANGE_BAG_OPEN_GRID = 27
LOG_GOLD_CHANGE_CHANGE_JOB = 28
LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO = 32
LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU = 33
LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION = 35
LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION = 36
LOG_GOLD_CHANGE_OPEN_BAO_XIANG = 37
LOG_GOLD_CHANGE_BUY_VIP_ITEM = 39
LOG_GOLD_CHANGE_UPGRADE_BUILD = 40
LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST = 41
LOG_GOLD_CHANGE_XSTM_BUY_ITEM = 45
LOG_GOLD_CHANGE_ADD_LYT_TZ = 47
LOG_GOLD_CHANGE_COMPLETE_LYT_SD = 48
LOG_GOLD_CHANGE_LYT_YB_CZ = 49

LOG_GOLD_LIST = [LOG_GOLD_CHANGE_GZTB_SUODING,LOG_GOLD_CHANGE_GZTB_TS,LOG_GOLD_CHANGE_GZTB_REFRESH,
    LOG_GOLD_CHANGE_CHANGE_NAME,LOG_GOLD_CHANGE_BUY_HONGBAO,LOG_GOLD_CHANGE_BUILDING_CREATE,
    LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT,
    LOG_GOLD_CHANGE_FST_CLEAR_CD,LOG_GOLD_CHANGE_CREATE_GONGHUI,LOG_GOLD_CHANGE_OPEN_HUAPENG,
    LOG_GOLD_CHANGE_BUY_DRESS,LOG_GOLD_CHANGE_BUY_ITEM,LOG_GOLD_CHANGE_SPEED_UP_FLOWER,
    LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE,
    LOG_GOLD_CHANGE_BUY_SAODANG,LOG_GOLD_CHANGE_ZHAOMU_SERVANT,LOG_GOLD_CHANGE_BAG_OPEN_GRID,
    LOG_GOLD_CHANGE_CHANGE_JOB,LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU,
    LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION,
    LOG_GOLD_CHANGE_OPEN_BAO_XIANG,LOG_GOLD_CHANGE_BUY_VIP_ITEM,LOG_GOLD_CHANGE_UPGRADE_BUILD,
    LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST,LOG_GOLD_CHANGE_XSTM_BUY_ITEM,LOG_GOLD_CHANGE_ADD_LYT_TZ,
    LOG_GOLD_CHANGE_COMPLETE_LYT_SD,LOG_GOLD_CHANGE_LYT_YB_CZ]

# 资源ID
ITEM_ID_MONEY = 80001
ITEM_ID_GOLD = 80002
ITEM_ID_EXP = 80003
ITEM_ID_LEITAI_POINT = 80004 # 擂台积分
ITEM_ID_ZHUANGBEI_SUIPIAN = 80005 # 装备碎片
ITEM_ID_LEIJI_GOLD = 80006 # vip积分
ITEM_ID_LADDER_XING = 80008 # 武举积分（星）
ITEM_ID_YU_PEI_QING_SHUI = 80009 # 晴水玉佩
ITEM_ID_YU_PEI_FEI_CUI = 80010 # 翡翠玉佩
ITEM_ID_YU_PEI_YANG_ZHI = 80011 # 羊脂玉佩
ITEM_ID_YU_PEI_JIN_XINA_YU = 80012 # 金镶玉玉佩
ITEM_ID_NEI_DAN = 80013 # 内丹
ITEM_ID_FAN_RONG_DU = 80014 # 繁荣度
ITEM_ID_MEI_LI = 80015 # 魅力
ITEM_ID_PAIXI_JIANSHE = 80016 # 派系建设值
ITEM_ID_PAIXI_GONGXIAN = 80017 # 派系贡献值
ITEM_ID_QIN_MI_DU = 80018 # 亲密度
ITEM_ID_EN_AI_ZHI = 80019 # 恩爱值

#商品统计
ITEM_ID_LIST=[20300,20301,20302,20501,20502,20503,20504,20400,20401,20403,20201,20202,20203,20204,80009,
    80010,80011,80012,21000,21001,22016,20205,22022,20611,20612,20613,22025,20614,20206,20207,94061,20615,
    20208,60000,60100,60200,60300,60400,60500,20209,20210,94054,94055,94056,94057,94058,94059,22030,94060,
    20216,20215,90000,90001,90002,90003,90004,90005,90006,90007,90008,90300,90301,90302,90303,90304,90305,
    90306,90307,90308,90309,90310,90311,90400,90401,90402,90403,90404,90405,90406,90407,90408,90409,90312,
    90313,90314,90315,90316,90317,90318,90319,90320,90321,20046,51000,51001,51002,51003,51004,51005,51006,
    51007]

# 游戏统计
class GameStats:

    def __init__(self, serverId, logdb, gmsdb):
        self.serverId = serverId
        self.logdb = logdb
        self.gmsdb = gmsdb

    def doOneColumnSql(self, sql):
        result = self.logdb.fetchone(sql)
        for r in result:
            return result[r] or 0
        return 0

    def __doAllColumnSql(self, sql):
        return self.logdb.fetchall(sql)

    def __mergeBaseData(self, dataList, createTime):
        if not dataList:
            return
        for xs in dataList:
            xs["serverId"] = self.serverId
            if createTime > 0:
                xs["createTime"] = createTime

    def __doOtherBehvData(self, today0, yesterday0):
        ret = list()

        def fa(behv, num):
            ret.append(dict(behv=behv, num=num))

        def f_other(name, sql):
            fa(name, self.doOneColumnSql(sql))

        for lg in LOG_GOLD_LIST:
            f_other("gold_"+str(lg), '''select count(*) from GoldChangeLog where sourceType = %s and serverId = %s 
                and dayCreateTime >= %s and dayCreateTime < %s''' % (lg, self.serverId, yesterday0, today0))

        self.__mergeBaseData(ret, yesterday0)
        return ret
        
    def __doResData(self, today0, yesterday0):
        ret = list()
        def __ff(sql, dtype, did):
            dlist = self.__doAllColumnSql(sql)
            if not dlist:
                return []
            for d in dlist:
                d['type'] = dtype
                d['resId'] = did
            ret.extend(dlist)

        def __f1(did, sql):
            __ff(sql, 1, did)

        def __f2(did, sql):
            __ff(sql, 2, did)

        def __currSql1(currId):
            return '''select sourceType as approach, sum(delta) as num from CurrencyChangeLog where delta > 0 and currencyId = %s and serverId = %s 
                and dayCreateTime >= %s and dayCreateTime < %s group by sourceType''' % (currId, self.serverId, yesterday0, today0)

        def __currSql2(currId):
            return '''select sourceType as approach, sum(-delta) as num from CurrencyChangeLog where delta < 0 and currencyId = %s and serverId = %s 
            and dayCreateTime >= %s and dayCreateTime < %s group by sourceType''' % (currId, self.serverId, yesterday0, today0)


        #产出
        __f1(ITEM_ID_MONEY, '''select sourceType as approach, sum(delta) as num from MoneyChangeLog where delta > 0 and serverId = %s 
            and dayCreateTime >= %s and dayCreateTime < %s group by sourceType''' % (self.serverId, yesterday0, today0))
        __f1(ITEM_ID_GOLD, '''select sourceType as approach, sum(goldDelta+freeGoldDelta) as num from GoldChangeLog where goldDelta >= 0 and freeGoldDelta >= 0 and serverId = %s 
            and dayCreateTime >= %s and dayCreateTime < %s group by sourceType''' % (self.serverId, yesterday0, today0))
        __f1(ITEM_ID_LEITAI_POINT, __currSql1(ITEM_ID_LEITAI_POINT))
        __f1(ITEM_ID_ZHUANGBEI_SUIPIAN, __currSql1(ITEM_ID_ZHUANGBEI_SUIPIAN))
        __f1(ITEM_ID_LEIJI_GOLD, __currSql1(ITEM_ID_LEIJI_GOLD))
        __f1(ITEM_ID_LADDER_XING, __currSql1(ITEM_ID_LADDER_XING))
        __f1(ITEM_ID_YU_PEI_QING_SHUI, __currSql1(ITEM_ID_YU_PEI_QING_SHUI))
        __f1(ITEM_ID_YU_PEI_FEI_CUI, __currSql1(ITEM_ID_YU_PEI_FEI_CUI))
        __f1(ITEM_ID_YU_PEI_YANG_ZHI, __currSql1(ITEM_ID_YU_PEI_YANG_ZHI))
        __f1(ITEM_ID_YU_PEI_JIN_XINA_YU, __currSql1(ITEM_ID_YU_PEI_JIN_XINA_YU))
        __f1(ITEM_ID_NEI_DAN, __currSql1(ITEM_ID_NEI_DAN))
        __f1(ITEM_ID_FAN_RONG_DU, __currSql1(ITEM_ID_FAN_RONG_DU))
        __f1(ITEM_ID_MEI_LI, __currSql1(ITEM_ID_MEI_LI))
        __f1(ITEM_ID_PAIXI_JIANSHE, __currSql1(ITEM_ID_PAIXI_JIANSHE))
        __f1(ITEM_ID_PAIXI_GONGXIAN, __currSql1(ITEM_ID_PAIXI_GONGXIAN))
        __f1(ITEM_ID_QIN_MI_DU, __currSql1(ITEM_ID_QIN_MI_DU))
        __f1(ITEM_ID_EN_AI_ZHI, __currSql1(ITEM_ID_EN_AI_ZHI))


        #消耗
        __f2(ITEM_ID_MONEY, '''select sourceType as approach, sum(-delta) as num from MoneyChangeLog where delta < 0 and serverId = %s 
            and dayCreateTime >= %s and dayCreateTime < %s group by sourceType''' % (self.serverId, yesterday0, today0))
        __f2(ITEM_ID_GOLD, '''select sourceType as approach, sum(-goldDelta-freeGoldDelta) as num from GoldChangeLog where goldDelta <=0 and freeGoldDelta <= 0 and serverId = %s 
            and dayCreateTime >= %s and dayCreateTime < %s group by sourceType''' % (self.serverId, yesterday0, today0))
        __f2(ITEM_ID_LEITAI_POINT, __currSql2(ITEM_ID_LEITAI_POINT))
        __f2(ITEM_ID_ZHUANGBEI_SUIPIAN, __currSql2(ITEM_ID_ZHUANGBEI_SUIPIAN))
        __f2(ITEM_ID_LEIJI_GOLD, __currSql2(ITEM_ID_LEIJI_GOLD))
        __f2(ITEM_ID_LADDER_XING, __currSql2(ITEM_ID_LADDER_XING))
        __f2(ITEM_ID_YU_PEI_QING_SHUI, __currSql2(ITEM_ID_YU_PEI_QING_SHUI))
        __f2(ITEM_ID_YU_PEI_FEI_CUI, __currSql2(ITEM_ID_YU_PEI_FEI_CUI))
        __f2(ITEM_ID_YU_PEI_YANG_ZHI, __currSql2(ITEM_ID_YU_PEI_YANG_ZHI))
        __f2(ITEM_ID_YU_PEI_JIN_XINA_YU, __currSql2(ITEM_ID_YU_PEI_JIN_XINA_YU))
        __f2(ITEM_ID_NEI_DAN, __currSql2(ITEM_ID_NEI_DAN))
        __f2(ITEM_ID_FAN_RONG_DU, __currSql2(ITEM_ID_FAN_RONG_DU))
        __f2(ITEM_ID_MEI_LI, __currSql2(ITEM_ID_MEI_LI))
        __f2(ITEM_ID_PAIXI_JIANSHE, __currSql2(ITEM_ID_PAIXI_JIANSHE))
        __f2(ITEM_ID_PAIXI_GONGXIAN, __currSql2(ITEM_ID_PAIXI_GONGXIAN))
        __f2(ITEM_ID_QIN_MI_DU, __currSql2(ITEM_ID_QIN_MI_DU))
        __f2(ITEM_ID_EN_AI_ZHI, __currSql2(ITEM_ID_EN_AI_ZHI))

        self.__mergeBaseData(ret, yesterday0)
        return ret

    def __doItemStatData(self, today0, yesterday0):
        ret = list()

        for itemId in ITEM_ID_LIST:
            sql_buyCount = '''select sum(delta) from ItemChangeLog where itemTemplateId = %s and serverId = %s 
                and dayCreateTime = %s and sourceType = %s''' % (itemId, self.serverId, yesterday0, 16)
            utils.logInfo("sql_buyCount=%s" % sql_buyCount)
            buyCount = self.doOneColumnSql(sql_buyCount)
            buyUserCount = self.doOneColumnSql('''select count(distinct(accountName)) from ItemChangeLog where itemTemplateId = %s and serverId = %s 
                and dayCreateTime = %s and sourceType = %s''' % (itemId, self.serverId, yesterday0, 16))
            sysCount = self.doOneColumnSql('''select sum(delta) from ItemChangeLog where itemTemplateId = %s and serverId = %s 
                and dayCreateTime = %s and sourceType != %s and delta > 0''' % (itemId, self.serverId, yesterday0, 16))
            sysUserCount = self.doOneColumnSql('''select count(distinct(accountName)) from ItemChangeLog where itemTemplateId = %s and serverId = %s 
                and dayCreateTime = %s and sourceType != %s and delta > 0''' % (itemId, self.serverId, yesterday0, 16))

            ret.append(dict(itemId=itemId, buyCount=buyCount, buyUserCount=buyUserCount, sysCount=sysCount, sysUserCount=sysUserCount))

        self.__mergeBaseData(ret, yesterday0)
        return ret

    def __doGoldStatData(self, today0, yesterday0):
        ret = list()
        # 消耗
        consumeGold = self.doOneColumnSql('''select sum(-goldDelta-freeGoldDelta) from GoldChangeLog where 
            serverId = %s and dayCreateTime = %s and goldDelta <= 0 and freeGoldDelta <= 0''' % (self.serverId, yesterday0))
        # 留存
        remainGold = self.doOneColumnSql('''select sum(totalGold+totalFreeGold) from GoldRemainLog where
            serverId = %s and dayCreateTime = %s''' % (self.serverId, yesterday0))
        # 消费
        consumeCount = self.doOneColumnSql('''select count(distinct(accountName)) from GoldChangeLog where 
            serverId = %s and dayCreateTime = %s and goldDelta <= 0 and freeGoldDelta <= 0''' % (self.serverId, yesterday0))
        # 活跃
        loginCount = self.doOneColumnSql('''select count(distinct(accountName)) from LoginLog where 
            serverId = %s and dayCreateTime = %s''' % (self.serverId, yesterday0))
        
        ret.append(dict(consumeGold=consumeGold, remainGold=remainGold, consumeCount=consumeCount, loginCount=loginCount))

        self.__mergeBaseData(ret, yesterday0)
        return ret
    
    def buildData(self, baseDate):
        #今天零点
        today0 = long(time.mktime(baseDate.timetuple()) * 1000)
        #昨天零点
        yesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=1)).timetuple()) * 1000)

        # 其他行为
        otbList = self.__doOtherBehvData(today0, yesterday0)
        
        # 资源产出和消耗
        resList = self.__doResData(today0, yesterday0)

        # 物品产出消耗统计
        itemList = self.__doItemStatData(today0, yesterday0)

        # 元宝统计
        goldList = self.__doGoldStatData(today0, yesterday0)

        return otbList, resList, itemList, goldList