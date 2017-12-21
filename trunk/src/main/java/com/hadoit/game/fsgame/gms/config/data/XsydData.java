package com.hadoit.game.fsgame.gms.config.data;

import com.hadoit.game.fsgame.gms.config.data.base.LData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;

/**
 * 新手引导表.csv
 * 编号 = id
 * 下一引导 = nextId
 * 引导步骤 = ydbz
 * 引导描述 = describe
 * 关键点 = keyStep
 * 建筑id = buildId
 * 建造建筑id = haveBuildId
 * 经验 = exp
 * 开放等级 = openClass
 * 是否是功能引导 = isFunctions
 * 物品id = itemsId
 * 物品数量 = itemsNumber
 * 是否是建造的步骤 = isBuild
 */
public class XsydData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    100, map("id", 100, "nextId", 101, "ydbz", list(1000), "keyStep", 1000, "exp", 0),
    101, map("id", 101, "nextId", 102, "ydbz", list(1001), "keyStep", 1001, "exp", 0),
    102, map("id", 102, "nextId", 103, "ydbz", list(1002, 1003), "keyStep", 1003, "exp", 0),
    103, map("id", 103, "nextId", 104, "ydbz", list(1004, 2001, 2002), "describe", "点击农田采集鲜花", "keyStep", 2002, "exp", 0),
    104, map("id", 104, "nextId", 105, "ydbz", list(1005, 2003, 2004, 2005, 3002, 1028), "describe", "点击农田种植鲜花", "keyStep", 2004, "exp", 0),
    105, map("id", 105, "nextId", 106, "ydbz", list(1006), "keyStep", 1006, "exp", 0),
    106, map("id", 106, "nextId", 107, "ydbz", list(1007), "keyStep", 1007, "exp", 0),
    107, map("id", 107, "nextId", 108, "ydbz", list(1008, 1009), "keyStep", 1008, "exp", 0),
    108, map("id", 108, "nextId", 109, "ydbz", list(1010, 1011), "keyStep", 1010, "exp", 0),
    109, map("id", 109, "nextId", 110, "ydbz", list(2006, 2007, 2008), "keyStep", 2008, "exp", 0),
    110, map("id", 110, "nextId", 111, "ydbz", list(1012, 2009, 2010, 2011, 2012, 2013, 2014), "keyStep", 2013, "exp", 0),
    111, map("id", 111, "nextId", 112, "ydbz", list(1013), "keyStep", 1013, "exp", 0),
    112, map("id", 112, "nextId", 113, "ydbz", list(1014, 2015, 2016, 2017), "keyStep", 2017, "exp", 0),
    113, map("id", 113, "nextId", 114, "ydbz", list(1015, 2094, 2018, 2019, 1016, 2096, 3008, 2095), "keyStep", 2018, "exp", 0),
    114, map("id", 114, "nextId", 115, "ydbz", list(1026, 1017), "keyStep", 1017, "exp", 0),
    115, map("id", 115, "nextId", 117, "ydbz", list(2020, 2021, 2022, 3000, 2023, 3001, 2024, 1018, 2025), "keyStep", 2024, "exp", 0),
    117, map("id", 117, "nextId", 118, "ydbz", list(2035, 2036, 2037, 2038, 2075, 3018, 3006, 2076), "keyStep", 3018, "exp", 0),
    118, map("id", 118, "nextId", 119, "ydbz", list(2040), "keyStep", 2040, "exp", 0),
    119, map("id", 119, "nextId", 120, "ydbz", list(2041, 2042, 2079, 2043), "keyStep", 2079, "exp", 755),
    120, map("id", 120, "nextId", 121, "ydbz", list(3009, 2026, 2027, 2028, 2029, 2030), "keyStep", 2028, "exp", 0),
    121, map("id", 121, "nextId", 122, "ydbz", list(3004, 2031, 2032, 2033, 2034), "keyStep", 2032, "exp", 1000),
    122, map("id", 122, "nextId", 123, "ydbz", list(1019), "keyStep", 1019, "buildId", 1007, "haveBuildId", 1007, "exp", 0),
    123, map("id", 123, "nextId", 125, "ydbz", list(2044, 2045, 2046, 2047, 2048, 2049, 2050, 2051, 2052, 2053, 3003, 2054, 3011, 1020), "keyStep", 2053, "exp", 0),
    125, map("id", 125, "nextId", 126, "ydbz", list(2055, 1021, 2056, 2057, 2058), "describe", "点击农田采集鲜花", "keyStep", 2058, "exp", 0),
    126, map("id", 126, "nextId", 127, "ydbz", list(2059, 2060, 2061, 2062), "keyStep", 2060, "exp", 0),
    127, map("id", 127, "nextId", 132, "ydbz", list(2063, 3019, 2064, 2061, 1115, 3017), "keyStep", 2064, "exp", 0),
    128, map("id", 128, "nextId", 129, "ydbz", list(2065, 2066, 2067, 2068, 2069, 2070, 2071, 2072, 3007), "keyStep", 2071, "exp", 0),
    129, map("id", 129, "nextId", 130, "ydbz", list(2074, 2075, 2038, 2076), "keyStep", 2074, "exp", 0),
    130, map("id", 130, "nextId", 131, "ydbz", list(2077), "keyStep", 2077, "exp", 0),
    131, map("id", 131, "nextId", 132, "ydbz", list(2078, 2079, 2080), "keyStep", 2079, "exp", 0),
    132, map("id", 132, "nextId", 139, "ydbz", list(1027, 3012), "keyStep", 1027, "exp", 0),
    133, map("id", 133, "nextId", 135, "ydbz", list(3013, 3014, 3016, 3015, 2093), "keyStep", 3014, "exp", 0),
    135, map("id", 135, "nextId", 136, "ydbz", list(1022), "keyStep", 1022, "exp", 0),
    136, map("id", 136, "nextId", 137, "ydbz", list(1023), "keyStep", 1023, "exp", 0),
    137, map("id", 137, "nextId", 138, "ydbz", list(3010, 1024), "keyStep", 1024, "exp", 0),
    138, map("id", 138, "ydbz", list(1025), "keyStep", 1025, "buildId", 1007, "haveBuildId", 1007, "exp", 0),
    139, map("id", 139, "ydbz", list(3020, 3021, 3022, 3023), "keyStep", 3022, "exp", 0),
    500, map("id", 500, "ydbz", list(5005, 10000), "keyStep", 5005, "exp", 0, "isFunctions", 1),
    501, map("id", 501, "ydbz", list(20048, 10001), "keyStep", 10001, "exp", 0, "isFunctions", 1),
    502, map("id", 502, "ydbz", list(2030, 2034, 10005, 10002, 10003), "keyStep", 10003, "exp", 0, "isFunctions", 1),
    503, map("id", 503, "ydbz", list(10006, 20042), "keyStep", 20042, "haveBuildId", 1001, "exp", 0, "openClass", 5, "isFunctions", 1),
    504, map("id", 504, "ydbz", list(10014, 5007, 10009, 10012), "keyStep", 10012, "exp", 0, "openClass", 6, "isFunctions", 1),
    505, map("id", 505, "ydbz", list(20049, 10010, 5008, 10011, 10013), "keyStep", 10013, "buildId", 1003, "exp", 0, "isFunctions", 1),
    506, map("id", 506, "ydbz", list(10014, 5009, 20000, 10015, 20001), "keyStep", 20001, "exp", 0, "openClass", 9, "isFunctions", 1),
    507, map("id", 507, "ydbz", list(10016, 20006), "keyStep", 20006, "haveBuildId", 1008, "exp", 0, "openClass", 7, "isFunctions", 1),
    508, map("id", 508, "ydbz", list(20007, 5011, 10017, 20044), "keyStep", 20044, "buildId", 1008, "exp", 0, "openClass", 8, "isFunctions", 1),
    509, map("id", 509, "ydbz", list(10018, 20009), "keyStep", 20009, "haveBuildId", 1012, "exp", 0, "openClass", 10, "isFunctions", 1),
    510, map("id", 510, "ydbz", list(10019, 20012), "keyStep", 20012, "haveBuildId", 1011, "exp", 0, "openClass", 11, "isFunctions", 1),
    511, map("id", 511, "ydbz", list(10020, 20015), "keyStep", 20015, "haveBuildId", 1013, "exp", 0, "openClass", 12, "isFunctions", 1),
    512, map("id", 512, "ydbz", list(10021, 20018), "keyStep", 20018, "haveBuildId", 1014, "exp", 0, "openClass", 12, "isFunctions", 1)
);
    }

    private static void init1() {
data.map(
    513, map("id", 513, "ydbz", list(10022, 20021), "keyStep", 20021, "haveBuildId", 1009, "exp", 0, "openClass", 13, "isFunctions", 1),
    514, map("id", 514, "ydbz", list(10023, 20033), "keyStep", 20033, "haveBuildId", 1002, "exp", 0, "openClass", 14, "isFunctions", 1),
    515, map("id", 515, "ydbz", list(5018, 20025, 20026), "keyStep", 20026, "buildId", 1001, "exp", 0, "openClass", 15, "isFunctions", 1),
    516, map("id", 516, "ydbz", list(10025, 20027), "keyStep", 10025, "haveBuildId", 1016, "exp", 0, "openClass", 18, "isFunctions", 1),
    517, map("id", 517, "ydbz", list(5020, 20030, 20031, 20032), "keyStep", 20032, "buildId", 1009, "exp", 0, "openClass", 20, "isFunctions", 1, "itemsId", list(60000), "itemsNumber", list(1)),
    518, map("id", 518, "ydbz", list(5021, 10027, 20037), "keyStep", 20037, "exp", 0, "openClass", 25, "isFunctions", 1, "itemsId", list(80013), "itemsNumber", list(100)),
    600, map("id", 600, "ydbz", list(20007, 5010, 20002, 20003, 20004, 20005), "keyStep", 20005, "buildId", 1008, "exp", 0, "openClass", 7, "isFunctions", 1, "itemsId", list(90008), "itemsNumber", list(20)),
    601, map("id", 601, "ydbz", list(5012, 20010, 20008, 20011), "keyStep", 20011, "buildId", 1012, "exp", 0, "isFunctions", 1),
    602, map("id", 602, "ydbz", list(5013, 20014, 20045), "keyStep", 20045, "buildId", 1011, "exp", 0, "isFunctions", 1),
    603, map("id", 603, "ydbz", list(5014, 20016, 20017), "keyStep", 20017, "buildId", 1013, "exp", 0, "isFunctions", 1),
    604, map("id", 604, "ydbz", list(5015, 20019, 20020), "keyStep", 20020, "buildId", 1014, "exp", 0, "isFunctions", 1),
    605, map("id", 605, "ydbz", list(5016, 20022, 20023, 20024), "keyStep", 20024, "buildId", 1009, "exp", 0, "isFunctions", 1),
    606, map("id", 606, "ydbz", list(5019, 20029), "keyStep", 20029, "buildId", 1016, "exp", 0, "isFunctions", 1),
    607, map("id", 607, "ydbz", list(5017, 20035, 20036), "keyStep", 20036, "buildId", 1002, "exp", 0, "isFunctions", 1),
    608, map("id", 608, "ydbz", list(5022, 20040, 20038, 20039), "keyStep", 20039, "buildId", 1002, "exp", 0, "openClass", 25, "isFunctions", 1),
    609, map("id", 609, "ydbz", list(5006, 20043, 20041, 10008, 10007), "keyStep", 10007, "buildId", 1001, "exp", 0, "isFunctions", 1),
    610, map("id", 610, "ydbz", list(20046), "keyStep", 20046, "exp", 0, "isFunctions", 1),
    611, map("id", 611, "ydbz", list(20047), "keyStep", 20047, "exp", 0, "isFunctions", 1)
);
    }

}