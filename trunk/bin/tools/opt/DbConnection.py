#-*- coding:utf-8 -*-
import MySQLdb
import time,datetime

class DbConnection:
    def __init__(self, dbInfo):
        self.host = dbInfo['host']
        self.user = dbInfo['user']
        self.passwd = dbInfo['passwd']
        self.port = dbInfo['port']
        self.db = dbInfo['db']
    
    def connect(self):
        self.__conn = MySQLdb.connect(host=self.host,user=self.user,passwd=self.passwd,port=self.port,db=self.db)
        self.__cursor = self.__conn.cursor(cursorclass=MySQLdb.cursors.DictCursor)

    def getcs(self):
        return self.__cursor

    def fetchall(self, sql):
        self.__cursor.execute(sql)
        return self.__cursor.fetchall()

    def fetchone(self, sql):
        self.__cursor.execute(sql)
        return self.__cursor.fetchone()

    def update(self, sql):
        return self.__cursor.execute(sql)

    def setAutoCommit(self, ac):
        if ac:
            self.__cursor.execute('set autocommit=1')
        else:
            self.__cursor.execute('set autocommit=0')

    def commit(self):
        self.__conn.commit()

    def rollback(self):
        self.__conn.rollback()

    def disconnect(self):
        self.__cursor.close()
        self.__conn.close()