package com.hadoit.game.fsgame.gms.config.data;

import com.hadoit.game.fsgame.gms.config.data.base.LData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;

/**
 * 商城表.csv
 * 编号 = id
 * 商城类型 = kind
 * 周期ID = cycleId
 * 购买等级需求 = needLv
 * 显示VIP等级 = needVipLv
 * 购买VIP等级 = buyVipLv
 * 单次最大购买次数 = buyMaxNum
 * 周期购买限制次数 = limitNum
 * 周期内可够买的最大个数 = maxCycleNum
 * 购买周期 = getCycle
 * 物品ID = itemId
 * 堆叠数量 = stack
 * 货币类型 = consumeType
 * 原价 = cost
 * 折扣价 = discount
 * 是否显示购买 = show
 */
public class MallData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        init8();
        init9();
        init10();
        init11();
        init12();
        init13();
        init14();
        init15();
        init16();
        init17();
        init18();
        init19();
        init20();
        init21();
        init22();
        init23();
        init24();
        init25();
        init26();
        init27();
        init28();
        init29();
        init30();
        init31();
        init32();
        init33();
        init34();
        init35();
        init36();
        init37();
        init38();
        init39();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    101, map("id", 101, "kind", 1, "cycleId", 10001, "needLv", 1, "buyMaxNum", 99, "itemId", 20300, "stack", 1, "consumeType", 2, "cost", 6),
    102, map("id", 102, "kind", 1, "cycleId", 10002, "needLv", 1, "buyMaxNum", 99, "itemId", 20301, "stack", 1, "consumeType", 2, "cost", 20),
    103, map("id", 103, "kind", 1, "cycleId", 10003, "needLv", 1, "buyMaxNum", 99, "itemId", 20302, "stack", 1, "consumeType", 2, "cost", 40),
    105, map("id", 105, "kind", 1, "cycleId", 10005, "needLv", 1, "buyMaxNum", 99, "itemId", 20501, "stack", 1, "consumeType", 2, "cost", 50),
    106, map("id", 106, "kind", 1, "cycleId", 10006, "needLv", 1, "buyMaxNum", 99, "itemId", 20502, "stack", 1, "consumeType", 2, "cost", 50)
);
    }

    private static void init1() {
data.map(
    107, map("id", 107, "kind", 1, "cycleId", 10007, "needLv", 1, "buyMaxNum", 99, "itemId", 20503, "stack", 1, "consumeType", 2, "cost", 50),
    108, map("id", 108, "kind", 1, "cycleId", 10008, "needLv", 1, "buyMaxNum", 99, "itemId", 20504, "stack", 1, "consumeType", 2, "cost", 50),
    109, map("id", 109, "kind", 1, "cycleId", 10009, "needLv", 1, "buyMaxNum", 99, "itemId", 20400, "stack", 1, "consumeType", 2, "cost", 50),
    110, map("id", 110, "kind", 1, "cycleId", 10010, "needLv", 1, "buyMaxNum", 99, "itemId", 20401, "stack", 1, "consumeType", 2, "cost", 50),
    112, map("id", 112, "kind", 1, "cycleId", 10012, "needLv", 1, "buyMaxNum", 99, "itemId", 20403, "stack", 1, "consumeType", 2, "cost", 50)
);
    }

    private static void init2() {
data.map(
    114, map("id", 114, "kind", 1, "cycleId", 10014, "needLv", 1, "buyMaxNum", 99, "itemId", 20201, "stack", 1, "consumeType", 2, "cost", 80),
    115, map("id", 115, "kind", 1, "cycleId", 10015, "needLv", 1, "buyMaxNum", 99, "itemId", 20202, "stack", 1, "consumeType", 2, "cost", 20),
    116, map("id", 116, "kind", 1, "cycleId", 10016, "needLv", 1, "buyMaxNum", 99, "itemId", 20203, "stack", 1, "consumeType", 2, "cost", 80),
    117, map("id", 117, "kind", 1, "cycleId", 10017, "needLv", 1, "buyMaxNum", 99, "itemId", 20204, "stack", 1, "consumeType", 2, "cost", 20),
    118, map("id", 118, "kind", 1, "cycleId", 10018, "needLv", 1, "buyMaxNum", 99, "itemId", 80009, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init3() {
data.map(
    119, map("id", 119, "kind", 1, "cycleId", 10019, "needLv", 1, "buyMaxNum", 99, "itemId", 80010, "stack", 1, "consumeType", 2, "cost", 50),
    120, map("id", 120, "kind", 1, "cycleId", 10020, "needLv", 1, "buyMaxNum", 99, "itemId", 80011, "stack", 1, "consumeType", 2, "cost", 100),
    121, map("id", 121, "kind", 1, "cycleId", 10021, "needLv", 1, "buyMaxNum", 99, "itemId", 80012, "stack", 1, "consumeType", 2, "cost", 500),
    122, map("id", 122, "kind", 1, "cycleId", 10022, "needLv", 1, "buyMaxNum", 99, "itemId", 21000, "stack", 1, "consumeType", 2, "cost", 9000, "discount", 4500),
    123, map("id", 123, "kind", 1, "cycleId", 10023, "needLv", 1, "buyMaxNum", 99, "itemId", 21001, "stack", 1, "consumeType", 2, "cost", 9000, "discount", 4500)
);
    }

    private static void init4() {
data.map(
    132, map("id", 132, "kind", 1, "cycleId", 11032, "needLv", 1, "buyMaxNum", 99, "itemId", 20205, "stack", 1, "consumeType", 1, "cost", 1000),
    133, map("id", 133, "kind", 1, "cycleId", 10004, "needLv", 1, "buyMaxNum", 99, "itemId", 22022, "stack", 1, "consumeType", 2, "cost", 50),
    134, map("id", 134, "kind", 1, "cycleId", 11034, "needLv", 1, "buyMaxNum", 99, "itemId", 20611, "stack", 1, "consumeType", 2, "cost", 10),
    135, map("id", 135, "kind", 1, "cycleId", 11035, "needLv", 1, "buyMaxNum", 99, "itemId", 20612, "stack", 1, "consumeType", 2, "cost", 10),
    136, map("id", 136, "kind", 1, "cycleId", 11036, "needLv", 1, "buyMaxNum", 99, "itemId", 20613, "stack", 1, "consumeType", 2, "cost", 10)
);
    }

    private static void init5() {
data.map(
    138, map("id", 138, "kind", 1, "cycleId", 11038, "needLv", 1, "buyMaxNum", 99, "itemId", 20614, "stack", 1, "consumeType", 2, "cost", 20),
    139, map("id", 139, "kind", 1, "cycleId", 11039, "needLv", 1, "buyMaxNum", 99, "itemId", 20206, "stack", 1, "consumeType", 2, "cost", 20),
    140, map("id", 140, "kind", 1, "cycleId", 11040, "needLv", 1, "buyMaxNum", 99, "itemId", 20207, "stack", 1, "consumeType", 2, "cost", 1000, "discount", 500),
    142, map("id", 142, "kind", 1, "cycleId", 11042, "needLv", 1, "buyMaxNum", 99, "itemId", 20615, "stack", 1, "consumeType", 2, "cost", 20),
    143, map("id", 143, "kind", 1, "cycleId", 11043, "needLv", 1, "buyMaxNum", 99, "itemId", 20208, "stack", 1, "consumeType", 2, "cost", 10)
);
    }

    private static void init6() {
data.map(
    150, map("id", 150, "kind", 1, "cycleId", 11050, "needLv", 1, "buyMaxNum", 99, "itemId", 20209, "stack", 1, "consumeType", 2, "cost", 30),
    151, map("id", 151, "kind", 1, "cycleId", 11051, "needLv", 1, "buyMaxNum", 99, "itemId", 20210, "stack", 1, "consumeType", 2, "cost", 10),
    162, map("id", 162, "kind", 1, "cycleId", 11063, "needLv", 1, "buyMaxNum", 99, "itemId", 20217, "stack", 1, "consumeType", 2, "cost", 50),
    164, map("id", 164, "kind", 1, "cycleId", 11065, "needLv", 1, "buyMaxNum", 99, "itemId", 97000, "stack", 1, "consumeType", 2, "cost", 1),
    165, map("id", 165, "kind", 1, "cycleId", 11066, "needLv", 1, "buyMaxNum", 99, "itemId", 97001, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init7() {
data.map(
    166, map("id", 166, "kind", 1, "cycleId", 11067, "needLv", 1, "buyMaxNum", 99, "itemId", 97002, "stack", 1, "consumeType", 2, "cost", 40),
    169, map("id", 169, "kind", 1, "cycleId", 11070, "needLv", 1, "buyMaxNum", 99, "itemId", 20621, "stack", 1, "consumeType", 2, "cost", 50),
    170, map("id", 170, "kind", 1, "cycleId", 11071, "needLv", 1, "buyMaxNum", 99, "itemId", 20622, "stack", 1, "consumeType", 2, "cost", 50),
    171, map("id", 171, "kind", 1, "cycleId", 11072, "needLv", 1, "buyMaxNum", 99, "itemId", 20623, "stack", 1, "consumeType", 2, "cost", 50),
    172, map("id", 172, "kind", 1, "cycleId", 11073, "needLv", 1, "buyMaxNum", 99, "itemId", 20624, "stack", 1, "consumeType", 1, "cost", 5000)
);
    }

    private static void init8() {
data.map(
    173, map("id", 173, "kind", 1, "cycleId", 11074, "needLv", 1, "buyMaxNum", 99, "itemId", 20625, "stack", 1, "consumeType", 2, "cost", 100),
    174, map("id", 174, "kind", 1, "cycleId", 11075, "needLv", 1, "buyMaxNum", 99, "itemId", 20631, "stack", 1, "consumeType", 2, "cost", 100),
    176, map("id", 176, "kind", 1, "cycleId", 11076, "needLv", 1, "buyMaxNum", 99, "itemId", 20636, "stack", 1, "consumeType", 2, "cost", 50),
    177, map("id", 177, "kind", 1, "cycleId", 11077, "needLv", 1, "buyMaxNum", 99, "itemId", 20637, "stack", 1, "consumeType", 2, "cost", 50),
    178, map("id", 178, "kind", 1, "cycleId", 11078, "needLv", 1, "buyMaxNum", 99, "itemId", 20303, "stack", 1, "consumeType", 2, "cost", 10)
);
    }

    private static void init9() {
data.map(
    179, map("id", 179, "kind", 1, "cycleId", 11079, "needLv", 1, "buyMaxNum", 99, "itemId", 20304, "stack", 1, "consumeType", 2, "cost", 40),
    180, map("id", 180, "kind", 1, "cycleId", 11080, "needLv", 1, "buyMaxNum", 99, "itemId", 20305, "stack", 1, "consumeType", 2, "cost", 70),
    181, map("id", 181, "kind", 1, "cycleId", 11081, "needLv", 1, "buyMaxNum", 99, "itemId", 20306, "stack", 1, "consumeType", 2, "cost", 30),
    182, map("id", 182, "kind", 1, "cycleId", 11082, "needLv", 1, "buyMaxNum", 99, "itemId", 20307, "stack", 1, "consumeType", 2, "cost", 50),
    183, map("id", 183, "kind", 1, "cycleId", 11083, "needLv", 1, "buyMaxNum", 99, "itemId", 20638, "stack", 1, "consumeType", 2, "cost", 500)
);
    }

    private static void init10() {
data.map(
    184, map("id", 184, "kind", 1, "cycleId", 11084, "needLv", 1, "buyMaxNum", 99, "itemId", 20639, "stack", 1, "consumeType", 2, "cost", 50),
    185, map("id", 185, "kind", 1, "cycleId", 11085, "needLv", 1, "buyMaxNum", 99, "itemId", 20640, "stack", 1, "consumeType", 2, "cost", 5),
    186, map("id", 186, "kind", 1, "cycleId", 11086, "needLv", 1, "buyMaxNum", 99, "itemId", 20404, "stack", 1, "consumeType", 2, "cost", 20),
    187, map("id", 187, "kind", 1, "cycleId", 11087, "needLv", 1, "buyMaxNum", 99, "itemId", 20405, "stack", 1, "consumeType", 2, "cost", 20),
    190, map("id", 190, "kind", 1, "cycleId", 11090, "needLv", 1, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 2, "itemId", 24122, "stack", 1, "consumeType", 1, "cost", 5000, "show", 1)
);
    }

    private static void init11() {
data.map(
    191, map("id", 191, "kind", 1, "cycleId", 11091, "needLv", 1, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 2, "itemId", 24123, "stack", 1, "consumeType", 2, "cost", 50, "show", 1),
    192, map("id", 192, "kind", 1, "cycleId", 11092, "needLv", 1, "buyMaxNum", 99, "itemId", 20641, "stack", 1, "consumeType", 2, "cost", 100),
    193, map("id", 193, "kind", 1, "cycleId", 11093, "needLv", 1, "buyMaxNum", 99, "itemId", 20218, "stack", 1, "consumeType", 2, "cost", 50, "show", 1),
    194, map("id", 194, "kind", 1, "cycleId", 11094, "needLv", 1, "buyMaxNum", 99, "itemId", 20647, "stack", 1, "consumeType", 2, "cost", 10),
    195, map("id", 195, "kind", 1, "cycleId", 11095, "needLv", 1, "buyMaxNum", 99, "itemId", 20648, "stack", 1, "consumeType", 2, "cost", 10)
);
    }

    private static void init12() {
data.map(
    196, map("id", 196, "kind", 1, "cycleId", 11096, "needLv", 1, "buyMaxNum", 99, "itemId", 20650, "stack", 1, "consumeType", 2, "cost", 20),
    1000, map("id", 1000, "kind", 5, "cycleId", 100000, "needLv", 1, "buyMaxNum", 99, "itemId", 90000, "stack", 1, "consumeType", 2, "cost", 20),
    1001, map("id", 1001, "kind", 5, "cycleId", 100100, "needLv", 1, "buyMaxNum", 99, "itemId", 90001, "stack", 1, "consumeType", 2, "cost", 1),
    1002, map("id", 1002, "kind", 5, "cycleId", 100200, "needLv", 1, "buyMaxNum", 99, "itemId", 90002, "stack", 1, "consumeType", 2, "cost", 4),
    1003, map("id", 1003, "kind", 5, "cycleId", 100300, "needLv", 1, "buyMaxNum", 99, "itemId", 90003, "stack", 1, "consumeType", 2, "cost", 5)
);
    }

    private static void init13() {
data.map(
    1004, map("id", 1004, "kind", 5, "cycleId", 100400, "needLv", 1, "buyMaxNum", 99, "itemId", 90004, "stack", 1, "consumeType", 2, "cost", 8),
    1005, map("id", 1005, "kind", 5, "cycleId", 100500, "needLv", 1, "buyMaxNum", 99, "itemId", 90005, "stack", 1, "consumeType", 2, "cost", 9),
    1006, map("id", 1006, "kind", 5, "cycleId", 100600, "needLv", 1, "buyMaxNum", 99, "itemId", 90006, "stack", 1, "consumeType", 2, "cost", 10),
    1007, map("id", 1007, "kind", 5, "cycleId", 100700, "needLv", 1, "buyMaxNum", 99, "itemId", 90007, "stack", 1, "consumeType", 2, "cost", 15),
    1008, map("id", 1008, "kind", 5, "cycleId", 100800, "needLv", 1, "buyMaxNum", 99, "itemId", 90008, "stack", 1, "consumeType", 2, "cost", 1)
);
    }

    private static void init14() {
data.map(
    1027, map("id", 1027, "kind", 5, "cycleId", 102700, "needLv", 1, "buyMaxNum", 99, "itemId", 90300, "stack", 1, "consumeType", 2, "cost", 99, "discount", 50),
    1028, map("id", 1028, "kind", 5, "cycleId", 102800, "needLv", 1, "buyMaxNum", 99, "itemId", 90301, "stack", 1, "consumeType", 2, "cost", 99, "discount", 50),
    1029, map("id", 1029, "kind", 5, "cycleId", 102900, "needLv", 1, "buyMaxNum", 99, "itemId", 90302, "stack", 1, "consumeType", 2, "cost", 99, "discount", 50),
    1030, map("id", 1030, "kind", 5, "cycleId", 103000, "needLv", 1, "buyMaxNum", 99, "itemId", 90303, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1031, map("id", 1031, "kind", 5, "cycleId", 103100, "needLv", 1, "buyMaxNum", 99, "itemId", 90304, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100)
);
    }

    private static void init15() {
data.map(
    1032, map("id", 1032, "kind", 5, "cycleId", 103200, "needLv", 1, "buyMaxNum", 99, "itemId", 90305, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1033, map("id", 1033, "kind", 5, "cycleId", 103300, "needLv", 1, "buyMaxNum", 99, "itemId", 90306, "stack", 1, "consumeType", 2, "cost", 299, "discount", 150),
    1034, map("id", 1034, "kind", 5, "cycleId", 103400, "needLv", 1, "buyMaxNum", 99, "itemId", 90307, "stack", 1, "consumeType", 2, "cost", 299, "discount", 150),
    1035, map("id", 1035, "kind", 5, "cycleId", 103500, "needLv", 1, "buyMaxNum", 99, "itemId", 90308, "stack", 1, "consumeType", 2, "cost", 399, "discount", 200),
    1036, map("id", 1036, "kind", 5, "cycleId", 103600, "needLv", 1, "buyMaxNum", 99, "itemId", 90309, "stack", 1, "consumeType", 2, "cost", 399, "discount", 200)
);
    }

    private static void init16() {
data.map(
    1037, map("id", 1037, "kind", 5, "cycleId", 103700, "needLv", 1, "buyMaxNum", 99, "itemId", 90310, "stack", 1, "consumeType", 2, "cost", 499, "discount", 250),
    1038, map("id", 1038, "kind", 5, "cycleId", 103800, "needLv", 1, "buyMaxNum", 99, "itemId", 90311, "stack", 1, "consumeType", 2, "cost", 499, "discount", 250),
    1039, map("id", 1039, "kind", 5, "cycleId", 103900, "needLv", 1, "buyMaxNum", 99, "itemId", 90400, "stack", 1, "consumeType", 2, "cost", 1),
    1040, map("id", 1040, "kind", 5, "cycleId", 104000, "needLv", 1, "buyMaxNum", 99, "itemId", 90401, "stack", 1, "consumeType", 2, "cost", 1),
    1041, map("id", 1041, "kind", 5, "cycleId", 104100, "needLv", 1, "buyMaxNum", 99, "itemId", 90402, "stack", 1, "consumeType", 2, "cost", 5)
);
    }

    private static void init17() {
data.map(
    1042, map("id", 1042, "kind", 5, "cycleId", 104200, "needLv", 1, "buyMaxNum", 99, "itemId", 90403, "stack", 1, "consumeType", 2, "cost", 5),
    1043, map("id", 1043, "kind", 5, "cycleId", 104300, "needLv", 1, "buyMaxNum", 99, "itemId", 90404, "stack", 1, "consumeType", 2, "cost", 9),
    1044, map("id", 1044, "kind", 5, "cycleId", 104400, "needLv", 1, "buyMaxNum", 99, "itemId", 90405, "stack", 1, "consumeType", 2, "cost", 9),
    1045, map("id", 1045, "kind", 5, "cycleId", 104500, "needLv", 1, "buyMaxNum", 99, "itemId", 90406, "stack", 1, "consumeType", 2, "cost", 19),
    1046, map("id", 1046, "kind", 5, "cycleId", 104600, "needLv", 1, "buyMaxNum", 99, "itemId", 90407, "stack", 1, "consumeType", 2, "cost", 19)
);
    }

    private static void init18() {
data.map(
    1047, map("id", 1047, "kind", 5, "cycleId", 104700, "needLv", 1, "buyMaxNum", 99, "itemId", 90408, "stack", 1, "consumeType", 2, "cost", 25),
    1048, map("id", 1048, "kind", 5, "cycleId", 104800, "needLv", 1, "buyMaxNum", 99, "itemId", 90409, "stack", 1, "consumeType", 2, "cost", 29),
    1049, map("id", 1049, "kind", 5, "cycleId", 104900, "needLv", 1, "buyMaxNum", 99, "itemId", 90312, "stack", 1, "consumeType", 2, "cost", 599, "discount", 300),
    1050, map("id", 1050, "kind", 5, "cycleId", 105000, "needLv", 1, "buyMaxNum", 99, "itemId", 90313, "stack", 1, "consumeType", 2, "cost", 599, "discount", 300),
    1051, map("id", 1051, "kind", 5, "cycleId", 105100, "needLv", 1, "buyMaxNum", 99, "itemId", 90314, "stack", 1, "consumeType", 2, "cost", 799, "discount", 400)
);
    }

    private static void init19() {
data.map(
    1052, map("id", 1052, "kind", 5, "cycleId", 105200, "needLv", 1, "buyMaxNum", 99, "itemId", 90315, "stack", 1, "consumeType", 2, "cost", 799, "discount", 400),
    1053, map("id", 1053, "kind", 5, "cycleId", 105300, "needLv", 1, "buyMaxNum", 99, "itemId", 90316, "stack", 1, "consumeType", 2, "cost", 999, "discount", 500),
    1054, map("id", 1054, "kind", 5, "cycleId", 105400, "needLv", 1, "buyMaxNum", 99, "itemId", 90317, "stack", 1, "consumeType", 2, "cost", 999, "discount", 500),
    1055, map("id", 1055, "kind", 5, "cycleId", 105500, "needLv", 1, "buyMaxNum", 99, "itemId", 90318, "stack", 1, "consumeType", 2, "cost", 1499, "discount", 750),
    1056, map("id", 1056, "kind", 5, "cycleId", 105600, "needLv", 1, "buyMaxNum", 99, "itemId", 90319, "stack", 1, "consumeType", 2, "cost", 1999, "discount", 1000)
);
    }

    private static void init20() {
data.map(
    1057, map("id", 1057, "kind", 5, "cycleId", 105700, "needLv", 1, "buyMaxNum", 99, "itemId", 90320, "stack", 1, "consumeType", 2, "cost", 2499, "discount", 1250),
    1058, map("id", 1058, "kind", 5, "cycleId", 105800, "needLv", 1, "buyMaxNum", 99, "itemId", 90321, "stack", 1, "consumeType", 2, "cost", 2999, "discount", 1500),
    1059, map("id", 1059, "kind", 5, "cycleId", 105900, "needLv", 1, "buyMaxNum", 99, "itemId", 90503, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1060, map("id", 1060, "kind", 5, "cycleId", 106000, "needLv", 1, "buyMaxNum", 99, "itemId", 90504, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1061, map("id", 1061, "kind", 5, "cycleId", 106100, "needLv", 1, "buyMaxNum", 99, "itemId", 90507, "stack", 1, "consumeType", 2, "cost", 599, "discount", 300)
);
    }

    private static void init21() {
data.map(
    1062, map("id", 1062, "kind", 5, "cycleId", 106200, "needLv", 1, "buyMaxNum", 99, "itemId", 90506, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1063, map("id", 1063, "kind", 5, "cycleId", 106300, "needLv", 1, "buyMaxNum", 99, "itemId", 90508, "stack", 1, "consumeType", 2, "cost", 399, "discount", 320),
    1064, map("id", 1064, "kind", 5, "cycleId", 106400, "needLv", 1, "buyMaxNum", 99, "itemId", 90509, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1065, map("id", 1065, "kind", 5, "cycleId", 106500, "needLv", 1, "buyMaxNum", 99, "itemId", 90510, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1067, map("id", 1067, "kind", 5, "cycleId", 106700, "needLv", 1, "buyMaxNum", 99, "itemId", 90511, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100)
);
    }

    private static void init22() {
data.map(
    1068, map("id", 1068, "kind", 5, "cycleId", 106800, "needLv", 1, "buyMaxNum", 99, "itemId", 90512, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1069, map("id", 1069, "kind", 5, "cycleId", 106900, "needLv", 1, "buyMaxNum", 99, "itemId", 90513, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1070, map("id", 1070, "kind", 5, "cycleId", 107000, "needLv", 1, "buyMaxNum", 99, "itemId", 90514, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1071, map("id", 1071, "kind", 5, "cycleId", 107100, "needLv", 1, "buyMaxNum", 99, "itemId", 90521, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1072, map("id", 1072, "kind", 5, "cycleId", 107200, "needLv", 1, "buyMaxNum", 99, "itemId", 90522, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100)
);
    }

    private static void init23() {
data.map(
    1073, map("id", 1073, "kind", 5, "cycleId", 107300, "needLv", 1, "buyMaxNum", 99, "itemId", 90523, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1074, map("id", 1074, "kind", 5, "cycleId", 107400, "needLv", 1, "buyMaxNum", 99, "itemId", 90524, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1075, map("id", 1075, "kind", 5, "cycleId", 107500, "needLv", 1, "buyMaxNum", 99, "itemId", 90525, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1076, map("id", 1076, "kind", 5, "cycleId", 107600, "needLv", 1, "buyMaxNum", 99, "itemId", 90526, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    1077, map("id", 1077, "kind", 5, "cycleId", 107700, "needLv", 1, "buyMaxNum", 99, "itemId", 90527, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100)
);
    }

    private static void init24() {
data.map(
    1078, map("id", 1078, "kind", 5, "cycleId", 107800, "needLv", 1, "buyMaxNum", 99, "itemId", 90528, "stack", 1, "consumeType", 2, "cost", 199, "discount", 100),
    2000, map("id", 2000, "kind", 2, "cycleId", 200000, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 2, "getCycle", 1, "itemId", 20046, "stack", 1, "consumeType", 2, "cost", 25, "discount", 15, "show", 1),
    2001, map("id", 2001, "kind", 2, "cycleId", 200100, "needLv", 1, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 1, "itemId", 80023, "stack", 1, "consumeType", 2, "cost", 100, "discount", 50),
    2002, map("id", 2002, "kind", 2, "cycleId", 200200, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 1, "itemId", 22043, "stack", 1, "consumeType", 2, "cost", 100, "discount", 80),
    2003, map("id", 2003, "kind", 2, "cycleId", 200300, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 1, "itemId", 24113, "stack", 1, "consumeType", 2, "cost", 20, "discount", 10, "show", 1)
);
    }

    private static void init25() {
data.map(
    2004, map("id", 2004, "kind", 2, "cycleId", 200400, "needLv", 1, "buyMaxNum", 2, "maxCycleNum", 2, "getCycle", 1, "itemId", 20632, "stack", 1, "consumeType", 2, "cost", 80, "discount", 40),
    2005, map("id", 2005, "kind", 2, "cycleId", 200500, "needLv", 1, "buyMaxNum", 2, "maxCycleNum", 2, "getCycle", 1, "itemId", 20637, "stack", 1, "consumeType", 2, "cost", 2, "discount", 1),
    2006, map("id", 2006, "kind", 2, "cycleId", 200600, "needLv", 1, "needVipLv", 0, "buyVipLv", 1, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 1, "itemId", 20000, "stack", 1, "consumeType", 2, "cost", 100, "discount", 60),
    2007, map("id", 2007, "kind", 2, "cycleId", 200700, "needLv", 1, "needVipLv", 1, "buyVipLv", 2, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 1, "itemId", 20001, "stack", 1, "consumeType", 2, "cost", 100, "discount", 70),
    2008, map("id", 2008, "kind", 2, "cycleId", 200800, "needLv", 1, "buyMaxNum", 99, "maxCycleNum", 5, "getCycle", 1, "itemId", 26002, "stack", 1, "consumeType", 2, "cost", 30)
);
    }

    private static void init26() {
data.map(
    2009, map("id", 2009, "kind", 2, "cycleId", 200900, "needLv", 1, "buyMaxNum", 99, "maxCycleNum", 1, "getCycle", 1, "itemId", 20626, "stack", 1, "consumeType", 2, "cost", 500),
    2010, map("id", 2010, "kind", 2, "cycleId", 201000, "needLv", 1, "buyMaxNum", 10, "maxCycleNum", 10, "getCycle", 1, "itemId", 94072, "stack", 1, "consumeType", 2, "cost", 10, "discount", 5),
    3006, map("id", 3006, "kind", 3, "cycleId", 300600, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51000, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25),
    3007, map("id", 3007, "kind", 3, "cycleId", 300700, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51001, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25),
    3008, map("id", 3008, "kind", 3, "cycleId", 300800, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51002, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25)
);
    }

    private static void init27() {
data.map(
    3009, map("id", 3009, "kind", 3, "cycleId", 300900, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51003, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25),
    3010, map("id", 3010, "kind", 3, "cycleId", 301000, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51004, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25),
    3011, map("id", 3011, "kind", 3, "cycleId", 301100, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51005, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25),
    3012, map("id", 3012, "kind", 3, "cycleId", 301200, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51006, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25),
    3013, map("id", 3013, "kind", 3, "cycleId", 301300, "needLv", 1, "buyMaxNum", 5, "maxCycleNum", 5, "getCycle", 3, "itemId", 51007, "stack", 1, "consumeType", 2, "cost", 50, "discount", 25)
);
    }

    private static void init28() {
data.map(
    3014, map("id", 3014, "kind", 3, "cycleId", 301400, "needLv", 1, "needVipLv", 2, "buyVipLv", 3, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20002, "stack", 1, "consumeType", 2, "cost", 100, "discount", 70),
    3015, map("id", 3015, "kind", 3, "cycleId", 301500, "needLv", 1, "needVipLv", 3, "buyVipLv", 4, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20003, "stack", 1, "consumeType", 2, "cost", 200, "discount", 160),
    3016, map("id", 3016, "kind", 3, "cycleId", 301600, "needLv", 1, "needVipLv", 4, "buyVipLv", 5, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20004, "stack", 1, "consumeType", 2, "cost", 500, "discount", 400),
    3017, map("id", 3017, "kind", 3, "cycleId", 301700, "needLv", 1, "needVipLv", 5, "buyVipLv", 6, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20005, "stack", 1, "consumeType", 2, "cost", 500, "discount", 400),
    3018, map("id", 3018, "kind", 3, "cycleId", 301800, "needLv", 1, "needVipLv", 6, "buyVipLv", 7, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20006, "stack", 1, "consumeType", 2, "cost", 500, "discount", 400)
);
    }

    private static void init29() {
data.map(
    3019, map("id", 3019, "kind", 3, "cycleId", 301900, "needLv", 1, "needVipLv", 7, "buyVipLv", 8, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20007, "stack", 1, "consumeType", 2, "cost", 500, "discount", 400),
    3020, map("id", 3020, "kind", 3, "cycleId", 302000, "needLv", 1, "needVipLv", 8, "buyVipLv", 9, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20008, "stack", 1, "consumeType", 2, "cost", 500, "discount", 400),
    3021, map("id", 3021, "kind", 3, "cycleId", 302100, "needLv", 1, "needVipLv", 9, "buyVipLv", 10, "buyMaxNum", 1, "maxCycleNum", 1, "getCycle", 3, "itemId", 20009, "stack", 1, "consumeType", 2, "cost", 500, "discount", 400),
    6000, map("id", 6000, "kind", 6, "cycleId", 600000, "needLv", 1, "buyMaxNum", 99, "itemId", 60000, "stack", 1, "consumeType", 2, "cost", 20),
    6001, map("id", 6001, "kind", 6, "cycleId", 600100, "needLv", 1, "buyMaxNum", 99, "itemId", 60100, "stack", 1, "consumeType", 2, "cost", 30)
);
    }

    private static void init30() {
data.map(
    6002, map("id", 6002, "kind", 6, "cycleId", 600200, "needLv", 1, "buyMaxNum", 99, "itemId", 60200, "stack", 1, "consumeType", 2, "cost", 20),
    6003, map("id", 6003, "kind", 6, "cycleId", 600300, "needLv", 1, "buyMaxNum", 99, "itemId", 60300, "stack", 1, "consumeType", 2, "cost", 30),
    6004, map("id", 6004, "kind", 6, "cycleId", 600400, "needLv", 1, "buyMaxNum", 99, "itemId", 60400, "stack", 1, "consumeType", 2, "cost", 20),
    6005, map("id", 6005, "kind", 6, "cycleId", 600500, "needLv", 1, "buyMaxNum", 99, "itemId", 60500, "stack", 1, "consumeType", 2, "cost", 30),
    6006, map("id", 6006, "kind", 6, "cycleId", 600600, "needLv", 1, "buyMaxNum", 99, "itemId", 60600, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init31() {
data.map(
    6007, map("id", 6007, "kind", 6, "cycleId", 600700, "needLv", 1, "buyMaxNum", 99, "itemId", 60700, "stack", 1, "consumeType", 2, "cost", 20),
    6008, map("id", 6008, "kind", 6, "cycleId", 600800, "needLv", 1, "buyMaxNum", 99, "itemId", 94054, "stack", 1, "consumeType", 2, "cost", 20),
    6009, map("id", 6009, "kind", 6, "cycleId", 600900, "needLv", 1, "buyMaxNum", 99, "itemId", 94055, "stack", 1, "consumeType", 2, "cost", 20),
    6010, map("id", 6010, "kind", 6, "cycleId", 601000, "needLv", 1, "buyMaxNum", 99, "itemId", 94056, "stack", 1, "consumeType", 2, "cost", 20),
    6011, map("id", 6011, "kind", 6, "cycleId", 601100, "needLv", 1, "buyMaxNum", 99, "itemId", 94057, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init32() {
data.map(
    6012, map("id", 6012, "kind", 6, "cycleId", 601200, "needLv", 1, "buyMaxNum", 99, "itemId", 94058, "stack", 1, "consumeType", 2, "cost", 20),
    6013, map("id", 6013, "kind", 6, "cycleId", 601300, "needLv", 1, "buyMaxNum", 99, "itemId", 94059, "stack", 1, "consumeType", 2, "cost", 20),
    6014, map("id", 6014, "kind", 6, "cycleId", 601400, "needLv", 1, "buyMaxNum", 99, "itemId", 94060, "stack", 1, "consumeType", 2, "cost", 20),
    6015, map("id", 6015, "kind", 6, "cycleId", 601500, "needLv", 1, "buyMaxNum", 99, "itemId", 94061, "stack", 1, "consumeType", 2, "cost", 20),
    6016, map("id", 6016, "kind", 6, "cycleId", 601600, "needLv", 1, "buyMaxNum", 99, "itemId", 20216, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init33() {
data.map(
    6017, map("id", 6017, "kind", 6, "cycleId", 601700, "needLv", 1, "buyMaxNum", 99, "itemId", 20215, "stack", 1, "consumeType", 2, "cost", 20),
    6018, map("id", 6018, "kind", 6, "cycleId", 601800, "needLv", 1, "buyMaxNum", 99, "itemId", 94062, "stack", 1, "consumeType", 2, "cost", 1),
    6019, map("id", 6019, "kind", 6, "cycleId", 601900, "needLv", 1, "buyMaxNum", 99, "itemId", 94063, "stack", 1, "consumeType", 2, "cost", 20),
    6020, map("id", 6020, "kind", 6, "cycleId", 602000, "needLv", 1, "buyMaxNum", 99, "itemId", 94064, "stack", 1, "consumeType", 2, "cost", 50),
    6021, map("id", 6021, "kind", 6, "cycleId", 602100, "needLv", 1, "buyMaxNum", 99, "itemId", 94065, "stack", 1, "consumeType", 2, "cost", 100)
);
    }

    private static void init34() {
data.map(
    6022, map("id", 6022, "kind", 6, "cycleId", 602200, "needLv", 1, "buyMaxNum", 99, "itemId", 94066, "stack", 1, "consumeType", 2, "cost", 200),
    6023, map("id", 6023, "kind", 6, "cycleId", 602300, "needLv", 1, "buyMaxNum", 99, "itemId", 94067, "stack", 1, "consumeType", 2, "cost", 400),
    6024, map("id", 6024, "kind", 6, "cycleId", 602400, "needLv", 1, "buyMaxNum", 99, "itemId", 94068, "stack", 1, "consumeType", 2, "cost", 800),
    6025, map("id", 6025, "kind", 6, "cycleId", 602500, "needLv", 1, "buyMaxNum", 99, "itemId", 22025, "stack", 1, "consumeType", 2, "cost", 30),
    6026, map("id", 6026, "kind", 6, "cycleId", 602600, "needLv", 1, "buyMaxNum", 99, "maxCycleNum", 20, "getCycle", 1, "itemId", 22025, "stack", 1, "consumeType", 1, "cost", 8000)
);
    }

    private static void init35() {
data.map(
    6027, map("id", 6027, "kind", 6, "cycleId", 602700, "needLv", 1, "buyMaxNum", 99, "maxCycleNum", 20, "getCycle", 1, "itemId", 22016, "stack", 1, "consumeType", 2, "cost", 50),
    6028, map("id", 6028, "kind", 6, "cycleId", 602800, "needLv", 1, "buyMaxNum", 99, "itemId", 22030, "stack", 1, "consumeType", 2, "cost", 20),
    6029, map("id", 6029, "kind", 6, "cycleId", 602900, "needLv", 1, "buyMaxNum", 99, "itemId", 22043, "stack", 1, "consumeType", 2, "cost", 100),
    6030, map("id", 6030, "kind", 6, "cycleId", 603000, "needLv", 1, "buyMaxNum", 99, "itemId", 94072, "stack", 1, "consumeType", 2, "cost", 10),
    6031, map("id", 6031, "kind", 6, "cycleId", 603100, "needLv", 1, "buyMaxNum", 99, "itemId", 94073, "stack", 1, "consumeType", 2, "cost", 10)
);
    }

    private static void init36() {
data.map(
    6032, map("id", 6032, "kind", 6, "cycleId", 603200, "needLv", 1, "buyMaxNum", 99, "itemId", 94074, "stack", 1, "consumeType", 2, "cost", 50),
    6034, map("id", 6034, "kind", 6, "cycleId", 603400, "needLv", 1, "buyMaxNum", 99, "itemId", 94075, "stack", 1, "consumeType", 2, "cost", 200),
    6035, map("id", 6035, "kind", 6, "cycleId", 603500, "needLv", 1, "buyMaxNum", 99, "itemId", 94076, "stack", 1, "consumeType", 2, "cost", 500),
    6036, map("id", 6036, "kind", 6, "cycleId", 603600, "needLv", 1, "buyMaxNum", 99, "itemId", 94077, "stack", 1, "consumeType", 2, "cost", 2800),
    7000, map("id", 7000, "kind", 7, "cycleId", 700000, "needLv", 1, "buyMaxNum", 99, "itemId", 25000, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init37() {
data.map(
    7001, map("id", 7001, "kind", 7, "cycleId", 700100, "needLv", 1, "buyMaxNum", 99, "itemId", 25001, "stack", 1, "consumeType", 2, "cost", 20),
    7002, map("id", 7002, "kind", 7, "cycleId", 700200, "needLv", 1, "buyMaxNum", 99, "itemId", 25002, "stack", 1, "consumeType", 2, "cost", 20),
    7003, map("id", 7003, "kind", 7, "cycleId", 700300, "needLv", 1, "buyMaxNum", 99, "itemId", 25003, "stack", 1, "consumeType", 2, "cost", 20),
    7004, map("id", 7004, "kind", 7, "cycleId", 700400, "needLv", 1, "buyMaxNum", 99, "itemId", 25004, "stack", 1, "consumeType", 2, "cost", 20),
    7005, map("id", 7005, "kind", 7, "cycleId", 700500, "needLv", 1, "buyMaxNum", 99, "itemId", 25005, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init38() {
data.map(
    7006, map("id", 7006, "kind", 7, "cycleId", 700600, "needLv", 1, "buyMaxNum", 99, "itemId", 25006, "stack", 1, "consumeType", 2, "cost", 20),
    7007, map("id", 7007, "kind", 7, "cycleId", 700700, "needLv", 1, "buyMaxNum", 99, "itemId", 25100, "stack", 1, "consumeType", 2, "cost", 50),
    7008, map("id", 7008, "kind", 7, "cycleId", 700800, "needLv", 1, "buyMaxNum", 99, "itemId", 94069, "stack", 1, "consumeType", 2, "cost", 20),
    7009, map("id", 7009, "kind", 7, "cycleId", 700900, "needLv", 1, "buyMaxNum", 99, "itemId", 94070, "stack", 1, "consumeType", 2, "cost", 20),
    7010, map("id", 7010, "kind", 7, "cycleId", 701000, "needLv", 1, "buyMaxNum", 99, "itemId", 94071, "stack", 1, "consumeType", 2, "cost", 20)
);
    }

    private static void init39() {
data.map(
    7011, map("id", 7011, "kind", 7, "cycleId", 701100, "needLv", 1, "buyMaxNum", 99, "itemId", 24114, "stack", 1, "consumeType", 2, "cost", 1),
    7012, map("id", 7012, "kind", 7, "cycleId", 701200, "needLv", 1, "buyMaxNum", 99, "itemId", 20632, "stack", 1, "consumeType", 2, "cost", 80)
);
    }

}