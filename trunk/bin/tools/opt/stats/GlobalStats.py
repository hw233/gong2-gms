#-*- coding:utf-8 -*-
import MySQLdb
import time,datetime
import DbConnection as db
from itertools import *
import utils
from BaseStats import BaseStats

# 全局统计
#     平均在线用户, 最高在线, 总注册, 总充值, 总消费, 总充值用户数
class GlobalStats(BaseStats):
    def __init__(self, logdb, gmsdb):
        BaseStats.__init__(self, logdb, gmsdb)

    def doGmsOneColumnSql(self, sql):
        result = self.gmsdb.fetchone(sql)
        for r in result:
            return result[r] or 0
        return 0

    def __doBuildGlobalData(self, optTable, keyName, keyValue, baseDate):
        subQry = ""
        if cmp(keyName, "serverId") == 0:
            subQry = keyName + " = " + str(keyValue) + " and "
        elif cmp(keyName, "opr") == 0:
            subQry = keyName + " = '" + str(keyValue) + "' and "

        #今天零点
        today0 = long(time.mktime(baseDate.timetuple()) * 1000)
        yesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=1)).timetuple()) * 1000)
        b0yesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=2)).timetuple()) * 1000)
        b1yesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=3)).timetuple()) * 1000)
        b2yesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=7)).timetuple()) * 1000)
        #昨天零点作为记录时间
        createTime = long(time.mktime((baseDate - datetime.timedelta(days=1)).timetuple()) * 1000)


        #拿gms上昨天的数据
        historyTotalRegCount = self.doGmsOneColumnSql('''select sum(totalRegCount) from %s where %s oprGroup='%s' and createTime=%s ''' % (optTable, subQry, utils.OPR_GROUP, b0yesterday0))
        historyTotalChargeUserCount = self.doGmsOneColumnSql('''select sum(totalChargeUserCount) from %s where %s oprGroup='%s' and createTime=%s ''' % (optTable, subQry, utils.OPR_GROUP, b0yesterday0))
        historyTotalChargeAmount = self.doGmsOneColumnSql('''select sum(totalChargeAmount) from %s where %s oprGroup='%s' and createTime=%s ''' % (optTable, subQry, utils.OPR_GROUP, b0yesterday0))

        sql3 = '''select count(distinct(accountName)) from LoginLog where newAvatar=true and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, yesterday0, today0)
        sql4 = '''select count(distinct(accountName)) from GoldChangeLog where goldDelta > 0 and firstCz=true and sourceType = 1 and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, yesterday0, today0)
        sql5 = '''select sum(goldDelta) from GoldChangeLog where goldDelta > 0 and sourceType = 1 and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, yesterday0, today0)
        sql8 = '''select count(distinct(accountName)) from LoginLog where %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, b1yesterday0, today0)
        sql9 = '''select count(distinct(accountName)) from LoginLog where %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, b2yesterday0, today0)
        totalRegCount = BaseStats.doOneColumnSql(self, sql3) + historyTotalRegCount
        totalChargeUserCount = BaseStats.doOneColumnSql(self, sql4) + historyTotalChargeUserCount
        totalChargeAmount = BaseStats.doOneColumnSql(self, sql5) + historyTotalChargeAmount
        loginCount3 = BaseStats.doOneColumnSql(self, sql8)
        loginCount7 = BaseStats.doOneColumnSql(self, sql9)

        ret = dict(totalRegCount=totalRegCount, totalChargeUserCount=totalChargeUserCount, totalChargeAmount=totalChargeAmount, 
            loginCount3=loginCount3, loginCount7=loginCount7, createTime=createTime)
        if keyName:
            ret[keyName] = keyValue

        return ret

    def buildGlobalDataForServer(self, optTable, serverId, baseDate):
        return self.__doBuildGlobalData(optTable, "serverId", serverId, baseDate)

    def buildGlobalDataForOpr(self, optTable, opr, baseDate):
        return self.__doBuildGlobalData(optTable, "opr", opr, baseDate)

    def buildGlobalDataForAll(self, optTable, baseDate):
        return self.__doBuildGlobalData(optTable, None, None, baseDate)