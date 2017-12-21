#-*- coding:utf-8 -*-
import MySQLdb
import time,datetime
import DbConnection as db
from itertools import *
import utils

class BaseStats:

    def __init__(self, logdb, gmsdb):
        self.logdb = logdb
        self.gmsdb = gmsdb

    def doOneColumnSql(self, sql):
        result = self.logdb.fetchone(sql)
        for r in result:
            return result[r] or 0
        return 0