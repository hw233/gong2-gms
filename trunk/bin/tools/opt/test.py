#-*- coding:utf-8 -*-
import MySQLdb
import sys, time, datetime
from itertools import *
import utils
from dateutil.relativedelta import relativedelta
from optparse import OptionParser

reload(sys)
sys.setdefaultencoding('utf-8')



# 手游指标白皮书 http://wenku.baidu.com/link?url=BtVYxKMt85GMi4qBPXGLPDk5nXkKLRb6wuWLOlvFuWFwZoRqkkQVXl_RZKQpKbRfGVnITchh9KwUUa1RekkdO6u6y1oXLxDumjjjQFi_O2q
# 留存率的两种的算法 http://www.36dsj.com/archives/5757
# 周和月的指标按照自然周期计算(留存率除外)

# 测试日登录的数据
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0802_1','a0802_1','a0802_1',true ,1,1406908803000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0802_2','a0802_2','a0802_2',true ,1,1406908803000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0802_1','a0802_1','a0802_1',false ,1,1409500803000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0825_1','a0825_1','a0825_1',true ,1,1408896003000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0825_2','a0825_2','a0825_2',true ,1,1408896003000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0825_1','a0825_1','a0825_1',false ,1,1409500803000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0829_1','a0829_1','a0829_1',true ,1,1409241603000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0829_2','a0829_2','a0829_2',true ,1,1409241603000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0829_1','a0829_1','a0829_1',false ,1,1409500803000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0831_1','a0831_1','a0831_1',true ,1,1409414403000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0831_2','a0831_2','a0831_2',true ,1,1409414403000);
# insert into LoginLog(accountName, avatarId, roleName, newAvatar, serverId, createTime) values('a0831_1','a0831_1','a0831_1',false ,1,1409500803000);

# 每天2点
# 0 2 * * * /gamejelly/deploy_gong_game_gms/tools_gms_hd/run_opt.sh day -s

# 每周周一4点
# 0 4 * * 1 /gamejelly/deploy_gong_game_gms/tools_gms_hd/run_opt.sh week -s

# 每月1号6点
# 0 6 1 * * /gamejelly/deploy_gong_game_gms/tools_gms_hd/run_opt.sh month -s


def testcount():
    cc =  count(1)
    print type(cc)
    for i in izip(count(1), ['a', 'b', 'c']):
        print i

def testgroupby():
    qs = [{'date' : 1},{'date' : 2}]
    gb = groupby(qs, lambda p:p['date'])
    print type(gb)
    print gb
    ll = [(name, list(group)) for name, group in groupby(qs, lambda p:p['date'])]
    print type(ll)
    print ll
    # [(name, list(group)) for name, group in itertools.groupby(qs, lambda p:p['date'])]

class test1:
    t1 = 2
    t2 = "a"
    def aa(self):
        def f1():
            print self.t1
        f1()
        

if __name__ == "__main__":
    utils.initLogger(None)
    parser = OptionParser()
    parser.add_option("-o", "--opt",
        action="store", type="string", dest="opt", default="hd", help="渠道标示")
    parser.add_option("-b", "--btime",
        action="store", type="string", dest="baseTime", default=str(datetime.date.today()), help="基准时间")
    parser.add_option("-s", "--save", action="store_true", dest="save", default=False, help="是否存储到目标数据库, 否则只打印sql")
    (options, args) = parser.parse_args()
    print options, args

    # testgroupby()
    ds = [{'a':1, 'b':2, 'c':33}, {'a':1, 'b':2, 'c':33}, {'a':1, 'b':2, 'c':33}, {'a':'dd', 'b':2, 'c':33}]
    gb = groupby(ds, lambda p:p['a'])
    gbl = dict((k,list(v)) for k,v in gb)
    print gb
    print gbl

    print datetime.date.today()
    print datetime.date.today().timetuple()
    print time.mktime(datetime.date.today().timetuple())

    if []:
        print 'dsdfdsfd1'
    if None:
        print 'dsdfdsfd2'
    if 0:
        print 'dsdfdsfd3'
    if False:
        print 'dsdfdsfd4'
    if 1:
        print 'dsdfdsfd5'
    if -1:
        print 'dsdfdsfd6'
    if dict():
        print 'dsdfsdfd7'

    dds = dict(a=1, b=2)
    ddf = 100 if 'a' in dds else 0
    print ddf
    print 1/0 if False else 'ss'

    print time.mktime(datetime.datetime.strptime("2014-08-29", "%Y-%m-%d").timetuple())
    print time.mktime(datetime.date.today().timetuple())

    print(dict(a=1,b=2))

    t1 = test1()
    print(test1.__dict__ )
    print(t1.__dict__ )

    print(type([]))
    print(type(()))
    print(type({}))


    utils.logDebug("abc")
    utils.logInfo("abc")
    utils.logWarning("abc")
    utils.logError("abc")
    utils.logCritical("abc")

    utils.logException("abc")

    try:
        raise Exception, 'this is a exception'
    except:
        utils.logException('sss')

    # print("---".join(dict(a=1,b=2).keys()))
    # print(dict(a=1,b=2).values())

    l1 = []
    l2 = []
    l1.append([1,2,3])
    l2.append("a")
    print(l1)
    print(l2)

    # 冻死了分开的是否理科的
    print("苏打绿咖啡就打开了司法局快乐到死")

    dd1 = dict(a=1, b=2, sdf=33)
    for i in range(0, len(dd1.keys())):
        print dd1.keys()[i], dd1.values()[i]

    # print datetime.date(datetime.date.today().year,datetime.date.today().month,1) - datetime.timedelta(days=1)
    
    # print datetime.date(datetime.date.today().year,datetime.date.today().month,1) - relativedelta(months=9)

    # print datetime.date.today().weekday()
    # print datetime.date.today() + datetime.timedelta(days=-datetime.date.today().weekday(), weeks=-1)
    # print datetime.date.today()
    # print time.strftime("%Y-%m-%d", time.gmtime(time.mktime(datetime.date.today().timetuple())))
    print type(datetime.datetime.fromtimestamp(time.mktime(datetime.date.today().timetuple())))

    print type(time.mktime(datetime.date.today().timetuple()))
    print type(datetime.date.today())
    print str(datetime.date.today())

    # print len(None)
    print len("d")

    print "1, 2".split(",")
    print "1,2".split(",")

    print "1, 2, ,   ".split(",")

    print int(" 1")

    dd1 = dict()
    dd1["a"] = 123
    print dd1

    tt1 = test1()
    tt1.aa()

    print "ddddddd"

    currList = [dict(a=1,b=2), dict(a=2,b=3), dict(a=1,b=33)]
    # dd1 = dict((k,list(v)) for k,v in groupby(currList, lambda p:p['a']))
    for k,v in groupby(currList, lambda p:p['a']):
        print k
        print v
    # print dd1
    print "a" in dict(a=1,b=2)
    print 1 in dict(a=1,b=2)

    print 2 in set([1,2,3])
    print 55 in set([1,2,3])

    print "ddddddd1"

    stuff = [[1, 'a'], [1, 'b'], [1, 'c'], [2, 'a'], [2, 'b'], [2, 'c'], [2,'d']]
    gb = groupby(stuff, lambda item: item[0])
    for k,v in gb:
        print k
        print v

    print "ddddddd2"

    def ff1():
        return 1,2,3
    for ff  in ff1():
        print ff

    ss1 = "ssdfl"
    print isinstance(ss1, int)
    print isinstance(ss1, str)

    ss2 = ["ss",'aa', 33, 44.4]
    ss3 = map(lambda x : isinstance(x, str) and "'"+x+"'" or x, ss2)
    print ss3

    ll1 = [1,3,4]
    ll2 = [4,5,6]
    
    print filter(lambda x: x not in ll1, ll2)

    str11 = ""
    if str11:
        print 1
    if not str11:
        print 2

    if str11=="":
        print 3

        