#-*- coding:utf-8 -*-
import logging
import os

# 是否只输出sql
ONLY_SQL = False

MYSQL_BOOL_TRUE = '\x01'
MYSQL_BOOL_FALSE = '\x00'

LOG_TYPE_DAY = 1
LOG_TYPE_WEEK = 2
LOG_TYPE_MONTH = 3

OPR_GROUP = 'test'

def initLogger(logFile):
    logger = logging.getLogger('gmsLogger')
    logger.setLevel(logging.DEBUG)
    if not logFile:
        logFile = os.path.join(os.getcwd(), 'logs/gms_log.log')

    logFile = os.path.abspath(logFile)
    filePath = os.path.dirname(logFile)
    fileName = logFile
    
    if not os.path.exists(filePath):
        os.makedirs(filePath)

    if not os.path.exists(fileName):
        file(fileName, 'w')
        
    fh = logging.FileHandler(fileName)
    fh.setLevel(logging.DEBUG)
    ch = logging.StreamHandler()
    ch.setLevel(logging.DEBUG)
    formatter = logging.Formatter('%(asctime)s - %(module)s.%(funcName)s.%(lineno)d - %(levelname)s - %(message)s')
    fh.setFormatter(formatter)
    ch.setFormatter(formatter)
    
    logger.addHandler(fh)
    logger.addHandler(ch)

    global g_logger
    g_logger = logger

def logDebug(msg):
    g_logger.debug(msg)

def logInfo(msg):
    g_logger.info(msg)

def logWarning(msg):
    g_logger.warning(msg)

def logError(msg):
    g_logger.error(msg)

def logCritical(msg):
    g_logger.critical(msg)

def logException(msg):
    g_logger.exception(msg)

