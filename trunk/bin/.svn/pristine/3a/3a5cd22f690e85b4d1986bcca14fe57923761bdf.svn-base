#-*- coding:utf-8 -*-
import sys,os
import re
import time,datetime
from stats.DayStats import DayStats
from stats.GlobalStats import GlobalStats
from stats.GameStats import GameStats
from Properties import Properties
from DbConnection import DbConnection
import utils
from optparse import OptionParser

reload(sys)
sys.setdefaultencoding('utf-8')

def __createDbInfo(dbpre, props):
    host = props[dbpre+".host"] or "localhost"
    user = props[dbpre+".user"] or "dev"
    passwd = props[dbpre+".passwd"] or "dev"
    port = int(props[dbpre+".port"] or 3306)
    db = props[dbpre+".db"] or "gonggame"
    return dict(host=host, user=user, passwd=passwd, port=port, db=db)

def __convertVal(v):
    return isinstance(v, str) and "'"+v+"'" or str(v)

def __genUpdateSubSetSql(columns, values):
    if not columns or not values or len(columns) != len(values):
        return ""
    ret = ""
    for i in range(0, len(columns)):
        ret += ", " + columns[i] + " = " + __convertVal(values[i])
    return ret[1:]

def __genWhereSubSql(columns, values):
    if not columns or not values or len(columns) != len(values):
        return ""
    ret = ""
    for i in range(0, len(columns)):
        ret += " and " + columns[i] + " = " + __convertVal(values[i])
    return ret[4:]

def __genInsertSql(tableName, columns, values):
    return '''insert into %s(%s) values(%s)''' % (tableName, ", ".join(columns), ", ".join(map(__convertVal, values)))

def __genInsertOnDuplicateSql(tableName, columns, values):
    return '''insert into %s(%s) values (%s) on duplicate key update %s''' % (tableName, ", ".join(columns), 
        ", ".join(map(__convertVal, values)), __genUpdateSubSetSql(columns, values))

def __genInsertOnDuplicateSql2(tableName, columns, values, plusColNames):
    subSql = ""
    if not columns or not values or len(columns) != len(values):
        subSql = ""
    for i in range(0, len(columns)):
        col = columns[i]
        if col in plusColNames:
            subSql += ", " + columns[i] + " = " + columns[i] + " + " + __convertVal(values[i])
        else:
            subSql += ", " + columns[i] + " = " + __convertVal(values[i])
    subSql = subSql[1:]

    s1 = '''insert into %s(%s) values (%s) on duplicate key update %s''' % (tableName, ", ".join(columns), 
        ", ".join(map(__convertVal, values)), subSql)
    return s1

def __genUpdateSql(tableName, columns, values, whereCols, wereVals):
    sql = '''update %s set %s ''' % (tableName, __genUpdateSubSetSql(columns, values))
    if not whereCols or not wereVals or len(whereCols) != len(wereVals):
        return sql
    whereSql = "where " + __genWhereSubSql(whereCols, wereVals)
    sql = sql + whereSql
    return sql

def __mergeOprGroup(dataDict):
    dataDict['oprGroup'] = utils.OPR_GROUP


def dayStatsForServer(baseDate, serverId, logdb, gmsdb):
    stat = DayStats(logdb, gmsdb)
    regDict, dictArr1 = stat.buildRegDataForServer(serverId, baseDate)
    __mergeOprGroup(regDict)
    __mergeOprGroup(dictArr1[1])
    outSql1 = __genInsertSql("OptDayData", regDict.keys(), regDict.values())
    outSql3 = __genUpdateSql("OptDayData", dictArr1[0].keys(), dictArr1[0].values(), dictArr1[1].keys(), dictArr1[1].values())
    return [outSql1, outSql3]

def dayStatsForOpr(baseDate, opr, logdb, gmsdb):
    stat = DayStats(logdb, gmsdb)
    regDict, dictArr1 = stat.buildRegDataForOpr(opr, baseDate)
    __mergeOprGroup(regDict)
    __mergeOprGroup(dictArr1[1])
    outSql1 = __genInsertSql("OptDayDataForOpr", regDict.keys(), regDict.values())
    outSql3 = __genUpdateSql("OptDayDataForOpr", dictArr1[0].keys(), dictArr1[0].values(), dictArr1[1].keys(), dictArr1[1].values())
    return [outSql1, outSql3]


def dayStatsForAll(baseDate, logdb, gmsdb):
    stat = DayStats(logdb, gmsdb)
    regDict, dictArr1 = stat.buildRegDataForAll(baseDate)
    __mergeOprGroup(regDict)
    __mergeOprGroup(dictArr1[1])
    outSql1 = __genInsertSql("OptDayDataForAll", regDict.keys(), regDict.values())
    outSql3 = __genUpdateSql("OptDayDataForAll", dictArr1[0].keys(), dictArr1[0].values(), dictArr1[1].keys(), dictArr1[1].values())
    return [outSql1, outSql3]

def globalStatsForServer(baseDate, serverId, logdb, gmsdb):
    gbst = GlobalStats(logdb, gmsdb)
    gbDict = gbst.buildGlobalDataForServer("OptGlobalData", serverId, baseDate)
    __mergeOprGroup(gbDict)
    sql1 = __genInsertSql("OptGlobalData", gbDict.keys(), gbDict.values())
    return [sql1]

def globalStatsForOpr(baseDate, opr, logdb, gmsdb):
    gbst = GlobalStats(logdb, gmsdb)
    gbDict = gbst.buildGlobalDataForOpr("OptGlobalDataForOpr", opr, baseDate)
    __mergeOprGroup(gbDict)
    sql1 = __genInsertSql("OptGlobalDataForOpr", gbDict.keys(), gbDict.values())
    return [sql1]

def globalStatsForAll(baseDate, logdb, gmsdb):
    gbst = GlobalStats(logdb, gmsdb)
    gbDict = gbst.buildGlobalDataForAll("OptGlobalDataForAll", baseDate)
    __mergeOprGroup(gbDict)
    sql1 = __genInsertSql("OptGlobalDataForAll", gbDict.keys(), gbDict.values())
    return [sql1]

def gameStats(baseDate, serverId, logdb, gmsdb):
    sqls = list()
    def __doGenSql(tbname, dlist):
        for d in dlist:
            __mergeOprGroup(d)
            sqls.append(__genInsertSql(tbname, d.keys(), d.values()))

    def __doGenSql2(tbname, dlist):
        for d in dlist:
            __mergeOprGroup(d)
            ##这里要特殊处理
            sqls.append(__genInsertOnDuplicateSql2(tbname, d.keys(), d.values(), ["num"]))
    gs = GameStats(serverId, logdb, gmsdb)
    otbList, resList, itemList, goldList = gs.buildData(baseDate)
    __doGenSql("OtherBehvStats", otbList)
    __doGenSql("ResAllStats", resList)
    __doGenSql("ItemStats", itemList)
    __doGenSql("GoldStats", goldList)
    return sqls

def deleteExpireLogs(baseDate):
    sqls = list()
    def __doGenSql(tableName, deltaDays = 180):
        expireTime = long(time.mktime((baseDate - datetime.timedelta(days=deltaDays)).timetuple()) * 1000)
        sql = '''delete from %s where dayCreateTime < %s limit 10000''' % (tableName, expireTime)
        sqls.append(sql)
    __doGenSql("BehaviorLog")
    __doGenSql("CurrencyChangeLog")
    __doGenSql("ExpChangeLog")
    __doGenSql("ItemChangeLog")
    __doGenSql("LoginLog")
    __doGenSql("LogoutLog")
    __doGenSql("MoneyChangeLog")
    __doGenSql("OnlineLog")
    return sqls


def main(props, baseTime, srvList, oprList):
    logdb = DbConnection(__createDbInfo("logdb", props))
    gmsdb = DbConnection(__createDbInfo("gmsdb", props))
    logdb.connect()
    gmsdb.connect()

    baseDate = datetime.date.today()
    if baseTime :
        baseDate = datetime.datetime.strptime(baseTime, "%Y-%m-%d")

    allSql = []
    #平台
    allSql.extend(globalStatsForAll(baseDate, logdb, gmsdb))
    allSql.extend(dayStatsForAll(baseDate, logdb, gmsdb))

    #渠道
    for opr in oprList:
        # 全局数据
        r = globalStatsForOpr(baseDate, opr, logdb, gmsdb)
        allSql.extend(r)

        # 日数据
        r = dayStatsForOpr(baseDate, opr, logdb, gmsdb)
        allSql.extend(r)

    #服
    for si in srvList:
        # 全局数据
        r = globalStatsForServer(baseDate, si, logdb, gmsdb)
        allSql.extend(r)

        # 日数据
        r = dayStatsForServer(baseDate, si, logdb, gmsdb)
        allSql.extend(r)

        # 游戏数据
        r = gameStats(baseDate, si, logdb, gmsdb)
        allSql.extend(r)

    for sql in allSql:
        utils.logInfo("sql=%s" % sql)

    if not utils.ONLY_SQL:
        try:
            gmsdb.setAutoCommit(False)
            for sql in allSql:
                utils.logInfo("execute sql=%s" % sql)
                gmsdb.update(sql)
            gmsdb.commit()
        except:
            gmsdb.rollback()
            utils.logException('Exception')
        finally:
            gmsdb.setAutoCommit(True)

    utils.logInfo("delete expire data...")
    expireSql = deleteExpireLogs(baseDate)

    for sql in expireSql:
        utils.logInfo("sql=%s" % sql)

    if not utils.ONLY_SQL:
        logdb.setAutoCommit(True)
        for sql in expireSql:
            while True:
                utils.logInfo("execute sql=%s" % sql)
                if logdb.update(sql) == 0:
                    break
    utils.logInfo("all done!")

    # 关闭连接
    logdb.disconnect()
    gmsdb.disconnect()

if __name__ == "__main__":
    props = Properties()
    props.load(open('conf/conf.properties'))
    utils.initLogger(props["log.file.path"])

    parser = OptionParser()
    parser.add_option("-b", "--btime",
        action="store", type="string", dest="baseTime", default=str(datetime.date.today()), help="基准时间")
    parser.add_option("-g", "--srvs",
        action="store", type="string", dest="srvs", default=props["srvs"], help="服务器列表(逗号分隔)")
    parser.add_option("-o", "--oprs",
        action="store", type="string", dest="oprs", default=props["oprs"], help="渠道列表(逗号分隔)")
    parser.add_option("-s", "--save", action="store_true", dest="save", default=False, help="是否存储到目标数据库, 否则只打印sql, 默认不存储")
    (options, args) = parser.parse_args()

    baseTime = options.baseTime
    srvs = options.srvs
    oprs = options.oprs
    utils.ONLY_SQL = not options.save
    utils.OPR_GROUP = props["opr.group"]

    # 服务器列表
    srvList = []
    if srvs:
        srvList = map(lambda x : int(x), srvs.split(","))
    if oprs:
        oprs = oprs.split(",")

    utils.logInfo("baseTime=%s, onlySql=%s, srvs=%s" % (baseTime, utils.ONLY_SQL, srvs))

    if len(baseTime) < 1:
        sys.exit()

    if not srvList:
        sys.exit()

    try:
        main(props, baseTime, srvList, oprs)
    except:
        utils.logException('Exception')