#-*- coding:utf-8 -*-
import MySQLdb
import time,datetime
import DbConnection as db
from itertools import *
import utils
from BaseStats import BaseStats

# 登录注册相关(除留存都按日周月算)
#     登录数,新增登录用户,新增注册,活跃用户,次日留存,三日留存,七日留存,三十日留存
# 充值消费相关(都按日周月算)
#     充值总额,充值用户数,消费总额,消费用户数,ARPU
class DayStats(BaseStats):

    def __init__(self, logdb, gmsdb):
        BaseStats.__init__(self, logdb, gmsdb)

    def __doGetLoginLogList(self, subQry, startTime, endTime):
        sql = '''select accountName, newAvatar from LoginLog where %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, startTime, endTime)
        loginloglist = self.logdb.fetchall(sql)
        return loginloglist

    def __doCalcRentent(self, baseGroup, lastList):
        if not lastList:
            return 0, 0
        prevNewAccountList =  set(map(lambda x : x['accountName'], filter(lambda x : x['newAvatar'] == utils.MYSQL_BOOL_TRUE, lastList)))
        prevLeaveCountList =  filter(lambda x : x in baseGroup, prevNewAccountList)
        newCount = len(prevNewAccountList)
        levCount = len(prevLeaveCountList)
        return newCount, levCount

    def __doBuildCzData(self, subQry, lastList, startTime, endTime):
    	prevNewAccountList =  set(map(lambda x : x['accountName'], filter(lambda x : x['newAvatar'] == utils.MYSQL_BOOL_TRUE, lastList)))
    	subAcctQry = ""
    	if len(prevNewAccountList) > 0:
    		subAcctQry = " and accountName in ('" + "','".join(prevNewAccountList) + "')"
                
        sql1 = '''select sum(goldDelta) from GoldChangeLog where goldDelta > 0 and sourceType = 1 and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, startTime, endTime)
        sql2 = '''select count(distinct(accountName)) from GoldChangeLog where goldDelta > 0 and sourceType = 1 and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, startTime, endTime)
        sql3 = '''select sum(abs(goldDelta)+abs(freeGoldDelta)) from GoldChangeLog where (goldDelta < 0 or freeGoldDelta < 0) and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, startTime, endTime)
        sql4 = '''select count(distinct(accountName)) from GoldChangeLog where (goldDelta < 0 or freeGoldDelta < 0) and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, startTime, endTime)
        sql5 = '''select sum(freeGoldDelta) from GoldChangeLog where freeGoldDelta > 0 and %s dayCreateTime >= %s and dayCreateTime < %s''' % (subQry, startTime, endTime)
        sql1_new = sql1 + subAcctQry
        sql2_new = sql2 + subAcctQry
        utils.logInfo("sql1_new=%s" % sql1_new)
        
        chargeAmount = self.doOneColumnSql(sql1)
        chargeUserCount = self.doOneColumnSql(sql2)
        newChargeAmount = self.doOneColumnSql(sql1_new)
        newChargeUserCount = self.doOneColumnSql(sql2_new)
        feeAmount = self.doOneColumnSql(sql3)
        feeUserCount = self.doOneColumnSql(sql4)
        freeGoldAmount = self.doOneColumnSql(sql5)

        return dict(chargeAmount=chargeAmount, chargeUserCount=chargeUserCount, newChargeAmount=newChargeAmount, newChargeUserCount=newChargeUserCount, feeAmount=feeAmount, 
            feeUserCount=feeUserCount, freeGoldAmount=freeGoldAmount)

    def __doBuildRegData(self, keyName, keyValue, baseDate):
        subQry = ""
        if cmp(keyName, "serverId") == 0:
            subQry = keyName + " = " + str(keyValue) + " and "
        elif cmp(keyName, "opr") == 0:
            subQry = keyName + " = '" + str(keyValue) + "' and "

        #今天零点
        today0 = long(time.mktime(baseDate.timetuple()) * 1000)
        #昨天零点
        yesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=1)).timetuple()) * 1000)
        #前天零点
        byesterday0 = long(time.mktime((baseDate - datetime.timedelta(days=2)).timetuple()) * 1000)

        #昨天零点作为记录时间
        createTime = long(time.mktime((baseDate - datetime.timedelta(days=1)).timetuple()) * 1000)


        currList = self.__doGetLoginLogList(subQry, yesterday0, today0)
        prevList1 = self.__doGetLoginLogList(subQry, byesterday0, yesterday0)

        currGroupBy = set(map(lambda x: x['accountName'], currList))
        
        # 当期新增
        nowNewAccountList = set(map(lambda x : x['accountName'], filter(lambda x : x['newAvatar'] == utils.MYSQL_BOOL_TRUE, currList)))
        newLoginCount = len(nowNewAccountList)
        
        # 当期登录
        nowLoginAccountList = set(map(lambda x : x['accountName'], currList))
        loginCount = len(nowLoginAccountList)

        # 新增注册, 即新增登录
        newRegCount = newLoginCount

        # 消费相关
        czDict = self.__doBuildCzData(subQry, prevList1, yesterday0, today0)

        # 次日留存
        preNewCount1, leaveCount1 = self.__doCalcRentent(currGroupBy, prevList1)

        currDict = dict(newLoginCount=newLoginCount, loginCount=loginCount, newRegCount=newRegCount, createTime=createTime)
        currDict.update(czDict)

        # 日平均和最高在线, 渠道的没法统计
        avgOnlineCount = 0
        maxOnlineCount = 0
        if subQry:
            avgOnlineCount = BaseStats.doOneColumnSql(self, '''select avg(onlineCount) from OnlineLog where %s dayCreateTime >= %s and dayCreateTime < %s''' 
                % (subQry, yesterday0, today0))
            maxOnlineCount = BaseStats.doOneColumnSql(self, '''select max(onlineCount) from OnlineLog where %s dayCreateTime >= %s and dayCreateTime < %s''' 
                % (subQry, yesterday0, today0))
        else:
            avgOnlineCount = BaseStats.doOneColumnSql(self, '''select sum(oca) from (select serverId, avg(onlineCount) oca from OnlineLog 
                where dayCreateTime >= %s and dayCreateTime < %s group by serverId) t''' 
                % (yesterday0, today0))
            maxOnlineCount = BaseStats.doOneColumnSql(self, '''select sum(oca) from (select serverId, max(onlineCount) oca from OnlineLog 
                where dayCreateTime >= %s and dayCreateTime < %s group by serverId) t''' 
                % (yesterday0, today0))

        currDict["avgOnlineCount"] = avgOnlineCount
        currDict["maxOnlineCount"] = maxOnlineCount

        if keyName:
            currDict[keyName] = keyValue

        dict1 = [dict(preNewCount1=preNewCount1, leaveCount1=leaveCount1), dict(createTime=byesterday0)]
        if keyName:
            dict1[1][keyName] = keyValue

        return currDict, dict1

    def buildRegDataForServer(self, serverId, baseDate):
        return self.__doBuildRegData("serverId", serverId, baseDate)

    def buildRegDataForOpr(self, opr, baseDate):
        return self.__doBuildRegData("opr", opr, baseDate)

    def buildRegDataForAll(self, baseDate):
        return self.__doBuildRegData(None, None, baseDate)
