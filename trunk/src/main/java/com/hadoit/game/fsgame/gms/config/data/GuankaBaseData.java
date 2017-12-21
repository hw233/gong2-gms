package com.hadoit.game.fsgame.gms.config.data;

import com.hadoit.game.fsgame.gms.config.data.base.LData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;

/**
 * 关卡基础表.csv
 * 关卡编号 = id
 * 关卡名称 = name
 * 所属场景 = scene
 * 关卡顺序 = order
 * 普通关卡掉落次数 = limitNum
 * 后续关卡 = nextGuanka
 * 关卡等级 = lv
 * 关卡怪物ID = gkMonsterId
 * 对话 = talk
 * 关卡描述 = des
 * 关卡DS = levelName
 */
public class GuankaBaseData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        init1();
        init2();
        init3();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "name", "守门侍卫", "scene", 10000, "order", 1, "limitNum", 10, "nextGuanka", 10001, "lv", 2, "gkMonsterId", list(10000, 20000), "talk", 10100, "des", "傲娇小侍卫拦截准王妃。", "levelName", "准王妃"),
    10001, map("id", 10001, "name", "侍卫", "scene", 10000, "order", 2, "limitNum", 10, "nextGuanka", 10002, "lv", 3, "gkMonsterId", list(10001, 20001), "talk", 10200, "des", "准王妃教训王府小侍卫。", "levelName", "理应被训"),
    10002, map("id", 10002, "name", "王府丫鬟", "scene", 10000, "order", 3, "limitNum", 10, "nextGuanka", 10003, "lv", 3, "gkMonsterId", list(10002, 20002), "talk", 10300, "des", "如花误认准王妃，惹怒王妃被训斥。", "levelName", "惹怒王妃"),
    10003, map("id", 10003, "name", "如花", "scene", 10000, "order", 4, "limitNum", 10, "nextGuanka", 10004, "lv", 3, "gkMonsterId", list(10003, 20003), "talk", 10400, "des", "如花受辱难咽此气，气急败坏找总管。", "levelName", "如花受辱"),
    10004, map("id", 10004, "name", "王府丫鬟", "scene", 10000, "order", 5, "limitNum", 10, "nextGuanka", 10005, "lv", 3, "gkMonsterId", list(10004, 20004), "talk", 10500, "des", "小小嬷嬷也挡道。", "levelName", "嬷嬷挡道"),
    10005, map("id", 10005, "name", "大总管", "scene", 10000, "order", 6, "limitNum", 10, "nextGuanka", 10006, "lv", 4, "gkMonsterId", list(10005, 20005), "talk", 10600, "des", "引来大总管。", "levelName", "总管来了"),
    10006, map("id", 10006, "name", "王爷", "scene", 10000, "order", 7, "limitNum", 10, "nextGuanka", 10007, "lv", 5, "gkMonsterId", list(10006, 20006), "talk", 10700, "des", "王爷笑逗小青缨。", "levelName", "王爷调情"),
    10007, map("id", 10007, "name", "王府丫鬟", "scene", 10000, "order", 8, "limitNum", 10, "nextGuanka", 10008, "lv", 5, "gkMonsterId", list(10007, 20007), "talk", 10800, "des", "侧福晋训话小丫鬟。", "levelName", "王府训话"),
    10008, map("id", 10008, "name", "王府嬷嬷", "scene", 10000, "order", 9, "limitNum", 10, "nextGuanka", 10009, "lv", 5, "gkMonsterId", list(10008, 20008), "talk", 10900, "des", "侧福晋训话王府嬷嬷。", "levelName", "训话嬷嬷"),
    10009, map("id", 10009, "name", "王府总管", "scene", 10000, "order", 10, "limitNum", 10, "nextGuanka", 10010, "lv", 5, "gkMonsterId", list(10009, 20009), "talk", 11000, "des", "侧福晋训话总管和侍卫。", "levelName", "摆正地位"),
    10010, map("id", 10010, "name", "大福晋", "scene", 10000, "order", 11, "limitNum", 10, "nextGuanka", 10011, "lv", 6, "gkMonsterId", list(10010, 20010), "talk", 11100, "des", "偶遇大福晋。", "levelName", "较量一二"),
    10011, map("id", 10011, "name", "苏绿筠", "scene", 10000, "order", 12, "limitNum", 10, "nextGuanka", 10012, "lv", 6, "gkMonsterId", list(10011, 20011), "talk", 11200, "des", "苏绿筠使绊子。", "levelName", "使绊子"),
    10012, map("id", 10012, "name", "旺财", "scene", 10000, "order", 13, "limitNum", 10, "nextGuanka", 10013, "lv", 6, "gkMonsterId", list(10012, 20012), "talk", 11300, "des", "狗仗人势，恶犬旺财。", "levelName", "恶犬旺财"),
    10013, map("id", 10013, "name", "三阿哥", "scene", 10000, "order", 14, "limitNum", 10, "nextGuanka", 10014, "lv", 7, "gkMonsterId", list(10013, 20013), "talk", 11400, "des", "原来小小恶童是三阿哥。", "levelName", "教育恶童"),
    10014, map("id", 10014, "name", "容嬷嬷", "scene", 10000, "order", 15, "limitNum", 10, "nextGuanka", 10015, "lv", 7, "gkMonsterId", list(10014, 20014), "talk", 11500, "des", "亲信容嬷嬷。", "levelName", "原来是亲信"),
    10015, map("id", 10015, "name", "侧福晋", "scene", 10000, "order", 16, "limitNum", 10, "nextGuanka", 10100, "lv", 7, "gkMonsterId", list(10015, 20015), "talk", 11600, "des", "王爷的后院醋味浓郁。", "levelName", "打翻醋坛"),
    10100, map("id", 10100, "name", "皇宫守卫", "scene", 10001, "order", 1, "limitNum", 10, "nextGuanka", 10101, "lv", 7, "gkMonsterId", list(10100, 20100), "talk", 11700, "des", "执拗的皇宫守卫。", "levelName", "难入宫门"),
    10101, map("id", 10101, "name", "嬷嬷", "scene", 10001, "order", 2, "limitNum", 10, "nextGuanka", 10102, "lv", 8, "gkMonsterId", list(10101, 20101), "talk", 11800, "des", "教习嬷嬷苏碧秋。", "levelName", "皇宫测试"),
    10102, map("id", 10102, "name", "阿箬", "scene", 10001, "order", 3, "limitNum", 10, "nextGuanka", 10103, "lv", 8, "gkMonsterId", list(10102, 20102), "talk", 11900, "des", "路遇刁蛮小宫女。", "levelName", "刁蛮宫女"),
    10103, map("id", 10103, "name", "阿箬", "scene", 10001, "order", 4, "limitNum", 10, "nextGuanka", 10104, "lv", 8, "gkMonsterId", list(10103, 20103), "talk", 12000, "des", "被骗误入禁地。", "levelName", "误入禁地"),
    10104, map("id", 10104, "name", "宫女", "scene", 10001, "order", 5, "limitNum", 10, "nextGuanka", 10105, "lv", 8, "gkMonsterId", list(10104, 20104), "talk", 12100, "des", "追上那骗人的小蹄子。", "levelName", "教训贱婢"),
    10105, map("id", 10105, "name", "皇宫教习嬷嬷", "scene", 10001, "order", 6, "limitNum", 10, "nextGuanka", 10106, "lv", 9, "gkMonsterId", list(10105, 20105), "talk", 12200, "des", "四宝阁嬷嬷。", "levelName", "四宝阁"),
    10106, map("id", 10106, "name", "皇宫教习嬷嬷", "scene", 10001, "order", 7, "limitNum", 10, "nextGuanka", 10107, "lv", 9, "gkMonsterId", list(10106, 20106), "talk", 12300, "des", "教习嬷嬷的礼仪测试。", "levelName", "礼仪测试"),
    10107, map("id", 10107, "name", "皇宫教习嬷嬷", "scene", 10001, "order", 8, "limitNum", 10, "nextGuanka", 10108, "lv", 9, "gkMonsterId", list(10107, 20107), "talk", 12400, "des", "好好答谢教习嬷嬷。", "levelName", "答谢嬷嬷"),
    10108, map("id", 10108, "name", "皇宫侍卫", "scene", 10001, "order", 9, "limitNum", 10, "nextGuanka", 10109, "lv", 9, "gkMonsterId", list(10108, 20108), "talk", 12500, "des", "阿箬耍脾气。", "levelName", "再次被拦"),
    10109, map("id", 10109, "name", "夫子", "scene", 10001, "order", 10, "limitNum", 10, "nextGuanka", 10110, "lv", 10, "gkMonsterId", list(10109, 20109), "talk", 12600, "des", "与夫子对弈。", "levelName", "对弈"),
    10110, map("id", 10110, "name", "夫子", "scene", 10001, "order", 11, "limitNum", 10, "nextGuanka", 10111, "lv", 10, "gkMonsterId", list(10110, 20110), "talk", 12700, "des", "众人相助，答谢夫子。", "levelName", "答谢夫子"),
    10111, map("id", 10111, "name", "皇宫教习嬷嬷", "scene", 10001, "order", 12, "limitNum", 10, "nextGuanka", 10112, "lv", 10, "gkMonsterId", list(10111, 20111), "talk", 12800, "des", "费心费神，参汤提神。", "levelName", "提神"),
    10112, map("id", 10112, "name", "王钦", "scene", 10001, "order", 13, "limitNum", 10, "nextGuanka", 10113, "lv", 11, "gkMonsterId", list(10112, 20112), "talk", 12900, "des", "公公秘密传信儿，替皇上带话。", "levelName", "秘密传信儿"),
    10113, map("id", 10113, "name", "皇上", "scene", 10001, "order", 14, "limitNum", 10, "nextGuanka", 10200, "lv", 11, "gkMonsterId", list(10113, 20113), "talk", 13000, "des", "后花园密见皇上。", "levelName", "私会皇上"),
    10200, map("id", 10200, "name", "高佳晞月", "scene", 10002, "order", 1, "limitNum", 10, "nextGuanka", 10201, "lv", 11, "gkMonsterId", list(10200, 20200), "talk", 13100, "des", "高佳晞月挑衅小王妃。", "levelName", "都是侧福晋"),
    10201, map("id", 10201, "name", "宫女", "scene", 10002, "order", 2, "limitNum", 10, "nextGuanka", 10202, "lv", 11, "gkMonsterId", list(10201, 20201), "talk", 13200, "des", "与高佳晞月彻底反目。", "levelName", "反目"),
    10202, map("id", 10202, "name", "王府丫鬟", "scene", 10002, "order", 3, "limitNum", 10, "nextGuanka", 10203, "lv", 12, "gkMonsterId", list(10202, 20202), "talk", 13300, "des", "阿箬找小姐给撑腰。", "levelName", "小姐撑腰"),
    10203, map("id", 10203, "name", "高佳晞月", "scene", 10002, "order", 4, "limitNum", 10, "nextGuanka", 10204, "lv", 12, "gkMonsterId", list(10203, 20203), "talk", 13400, "des", "主子娘娘晕倒，惊慌众人。", "levelName", "主子娘娘"),
    10204, map("id", 10204, "name", "富察琅嬅", "scene", 10002, "order", 5, "limitNum", 10, "nextGuanka", 10205, "lv", 12, "gkMonsterId", list(10204, 20204), "talk", 13500, "des", "主子娘娘不肯放过青缨。", "levelName", "不肯放过"),
    10205, map("id", 10205, "name", "莲心", "scene", 10002, "order", 6, "limitNum", 10, "nextGuanka", 10206, "lv", 12, "gkMonsterId", list(10205, 20205), "talk", 13600, "des", "青缨因姑母而被为难。", "levelName", "姑母"),
    10206, map("id", 10206, "name", "高佳晞月", "scene", 10002, "order", 7, "limitNum", 10, "nextGuanka", 10207, "lv", 13, "gkMonsterId", list(10206, 20206), "talk", 13700, "des", "高佳晞月赌气怒骂。", "levelName", "怒骂"),
    10207, map("id", 10207, "name", "乌拉那拉皇后", "scene", 10002, "order", 8, "limitNum", 10, "nextGuanka", 10208, "lv", 13, "gkMonsterId", list(10207, 20207), "talk", 13800, "des", "青缨得以见姑母。", "levelName", "见姑母"),
    10208, map("id", 10208, "name", "皇太后甄嬛", "scene", 10002, "order", 9, "limitNum", 10, "nextGuanka", 10209, "lv", 13, "gkMonsterId", list(10208, 20208), "talk", 13900, "des", "青缨向太后请罪得太后赐名。", "levelName", "太后赐名"),
    10209, map("id", 10209, "name", "王钦", "scene", 10002, "order", 10, "limitNum", 10, "nextGuanka", 10210, "lv", 13, "gkMonsterId", list(10209, 20209), "talk", 14000, "des", "青缨被封娴妃。", "levelName", "娴妃"),
    10210, map("id", 10210, "name", "阿箬", "scene", 10002, "order", 11, "limitNum", 10, "nextGuanka", 10211, "lv", 14, "gkMonsterId", list(10210, 20210), "talk", 14100, "des", "高佳晞月得势。", "levelName", "小人得势"),
    10211, map("id", 10211, "name", "宫女", "scene", 10002, "order", 12, "limitNum", 10, "nextGuanka", 10212, "lv", 14, "gkMonsterId", list(10211, 20211), "talk", 14200, "des", "青缨入主延禧宫。", "levelName", "延禧宫"),
    10212, map("id", 10212, "name", "小太监", "scene", 10002, "order", 13, "limitNum", 10, "nextGuanka", 10213, "lv", 14, "gkMonsterId", list(10212, 20212), "talk", 14300, "des", "海兰来请安。", "levelName", "海兰"),
    10213, map("id", 10213, "name", "皇太后甄嬛", "scene", 10002, "order", 14, "limitNum", 10, "nextGuanka", 10214, "lv", 15, "gkMonsterId", list(10213, 20213), "talk", 14400, "des", "太后的花园。", "levelName", "太后"),
    10214, map("id", 10214, "name", "富察琅嬅", "scene", 10002, "order", 15, "limitNum", 10, "nextGuanka", 10215, "lv", 15, "gkMonsterId", list(10214, 20214), "talk", 14500, "des", "皇后帐中的温柔。", "levelName", "皇后"),
    10215, map("id", 10215, "name", "莲心", "scene", 10002, "order", 16, "limitNum", 10, "nextGuanka", 10216, "lv", 15, "gkMonsterId", list(10215, 20215), "talk", 14600, "des", "深夜的耳边旖旎。", "levelName", "耳边旖旎"),
    10216, map("id", 10216, "name", "如花", "scene", 10002, "order", 17, "limitNum", 10, "nextGuanka", 10217, "lv", 15, "gkMonsterId", list(10216, 20216), "talk", 14700, "des", "众妃嫔齐聚。", "levelName", "众妃嫔"),
    10217, map("id", 10217, "name", "苏绿筠", "scene", 10002, "order", 18, "limitNum", 10, "nextGuanka", 10218, "lv", 16, "gkMonsterId", list(10217, 20217), "talk", 14800, "des", "赤金莲花翡翠镯。", "levelName", "翡翠镯"),
    10218, map("id", 10218, "name", "金玉妍", "scene", 10002, "order", 19, "limitNum", 10, "nextGuanka", 10219, "lv", 16, "gkMonsterId", list(10218, 20218), "talk", 14900, "des", "金玉妍私下调侃娴妃。", "levelName", "金玉妍"),
    10219, map("id", 10219, "name", "嬷嬷", "scene", 10002, "order", 20, "limitNum", 10, "nextGuanka", 10220, "lv", 16, "gkMonsterId", list(10219, 20219), "talk", 15000, "des", "训斥金玉妍。", "levelName", "被训斥")
);
    }

    private static void init1() {
data.map(
    10220, map("id", 10220, "name", "弘历", "scene", 10002, "order", 21, "limitNum", 10, "nextGuanka", 10221, "lv", 16, "gkMonsterId", list(10220, 20220), "talk", 15100, "des", "皇上夜访延禧宫，调情娴妃。", "levelName", "调情"),
    10221, map("id", 10221, "name", "李玉", "scene", 10002, "order", 22, "limitNum", 10, "nextGuanka", 10300, "lv", 17, "gkMonsterId", list(10221, 20221), "talk", 15200, "des", "皇上赐字于娴妃。", "levelName", "赐字"),
    10300, map("id", 10300, "name", "莲心", "scene", 10003, "order", 1, "limitNum", 10, "nextGuanka", 10301, "lv", 17, "gkMonsterId", list(10300, 20300), "talk", 15300, "des", "惠贵妃给皇后告密。", "levelName", "告密"),
    10301, map("id", 10301, "name", "富察琅嬅", "scene", 10003, "order", 2, "limitNum", 10, "nextGuanka", 10302, "lv", 17, "gkMonsterId", list(10301, 20301), "talk", 15400, "des", "皇后去阿哥所看望二阿哥。", "levelName", "阿哥所"),
    10302, map("id", 10302, "name", "高佳晞月", "scene", 10003, "order", 3, "limitNum", 10, "nextGuanka", 10303, "lv", 18, "gkMonsterId", list(10302, 20302), "talk", 15500, "des", "贵妃获赏玄狐皮。", "levelName", "玄狐皮"),
    10303, map("id", 10303, "name", "弘历", "scene", 10003, "order", 4, "limitNum", 10, "nextGuanka", 10304, "lv", 18, "gkMonsterId", list(10303, 20303), "talk", 15600, "des", "贵妃撒娇讨赏赐，皇上特为各宫一一赐字。", "levelName", "各宫赐字"),
    10304, map("id", 10304, "name", "弘历", "scene", 10003, "order", 5, "limitNum", 10, "nextGuanka", 10305, "lv", 18, "gkMonsterId", list(10304, 20304), "talk", 15700, "des", "皇上临幸琵琶乐伎蕊姬。", "levelName", "琵琶乐伎"),
    10305, map("id", 10305, "name", "苏绿筠", "scene", 10003, "order", 6, "limitNum", 10, "nextGuanka", 10306, "lv", 18, "gkMonsterId", list(10305, 20305), "talk", 15800, "des", "众妃嫔调侃皇上新宠答应白蕊姬身份。", "levelName", "白蕊姬"),
    10306, map("id", 10306, "name", "富察琅嬅", "scene", 10003, "order", 7, "limitNum", 10, "nextGuanka", 10307, "lv", 19, "gkMonsterId", list(10306, 20306), "talk", 15900, "des", "苏绿筠求皇后允准探望三阿哥。", "levelName", "探望"),
    10307, map("id", 10307, "name", "高佳晞月", "scene", 10003, "order", 8, "limitNum", 10, "nextGuanka", 10308, "lv", 19, "gkMonsterId", list(10307, 20307), "talk", 16000, "des", "贵妃与皇后秘密讨论白蕊姬身份。", "levelName", "蕊姬身份"),
    10308, map("id", 10308, "name", "阿箬", "scene", 10003, "order", 9, "limitNum", 10, "nextGuanka", 10309, "lv", 19, "gkMonsterId", list(10308, 20308), "talk", 16100, "des", "娴妃得知海兰煤炭被克扣，命人偷偷给其送炭。", "levelName", "克扣煤炭"),
    10309, map("id", 10309, "name", "三宝", "scene", 10003, "order", 10, "limitNum", 10, "nextGuanka", 10310, "lv", 19, "gkMonsterId", list(10309, 20309), "talk", 16200, "des", "娴妃命人查明白蕊姬身份。", "levelName", "蕊姬身份"),
    10310, map("id", 10310, "name", "阿箬", "scene", 10003, "order", 11, "limitNum", 10, "nextGuanka", 10311, "lv", 20, "gkMonsterId", list(10310, 20310), "talk", 16300, "des", "炭火烤板栗。", "levelName", "烤板栗"),
    10311, map("id", 10311, "name", "富察琅嬅", "scene", 10003, "order", 12, "limitNum", 10, "nextGuanka", 10312, "lv", 20, "gkMonsterId", list(10311, 20311), "talk", 16400, "des", "众嫔妃初见玫答应。", "levelName", "玫答应"),
    10312, map("id", 10312, "name", "白蕊姬", "scene", 10003, "order", 13, "limitNum", 10, "nextGuanka", 10313, "lv", 20, "gkMonsterId", list(10312, 20312), "talk", 16500, "des", "玫答应主动邀约娴妃。", "levelName", "邀约"),
    10313, map("id", 10313, "name", "小太监", "scene", 10003, "order", 14, "limitNum", 10, "nextGuanka", 10314, "lv", 21, "gkMonsterId", list(10313, 20313), "talk", 16600, "des", "玫答应与娴妃花园赏梅。", "levelName", "赏梅"),
    10314, map("id", 10314, "name", "白蕊姬", "scene", 10003, "order", 15, "limitNum", 10, "nextGuanka", 10315, "lv", 21, "gkMonsterId", list(10314, 20314), "talk", 16700, "des", "贵妃掌嘴玫答应。", "levelName", "掌嘴"),
    10315, map("id", 10315, "name", "高佳晞月", "scene", 10003, "order", 16, "limitNum", 10, "nextGuanka", 10316, "lv", 21, "gkMonsterId", list(10315, 20315), "talk", 16800, "des", "贵妃有意惩罚玫答应。", "levelName", "有意惩罚"),
    10316, map("id", 10316, "name", "富察琅嬅", "scene", 10003, "order", 17, "limitNum", 10, "nextGuanka", 10317, "lv", 21, "gkMonsterId", list(10316, 20316), "talk", 16900, "des", "皇后路过御花园及时制止贵妃对玫答应的责罚。", "levelName", "及时制止"),
    10317, map("id", 10317, "name", "白蕊姬", "scene", 10003, "order", 18, "limitNum", 10, "nextGuanka", 10318, "lv", 22, "gkMonsterId", list(10317, 20317), "talk", 17000, "des", "贵妃送药给玫答应涂脸伤。", "levelName", "送药"),
    10318, map("id", 10318, "name", "莲心", "scene", 10003, "order", 19, "limitNum", 10, "nextGuanka", 10319, "lv", 22, "gkMonsterId", list(10318, 20318), "talk", 17100, "des", "三宝送煤炭被发现。", "levelName", "事情败露"),
    10319, map("id", 10319, "name", "宫女", "scene", 10003, "order", 20, "limitNum", 10, "nextGuanka", 10320, "lv", 22, "gkMonsterId", list(10319, 20319), "talk", 17200, "des", "嘉贵妃发现娴妃命人给海常在送煤炭。", "levelName", "把柄"),
    10320, map("id", 10320, "name", "三宝", "scene", 10003, "order", 21, "limitNum", 10, "nextGuanka", 10400, "lv", 22, "gkMonsterId", list(10320, 20320), "talk", 17300, "des", "嘉贵妃受赏，因得知众嫔妃均受赏故而闷闷不乐。", "levelName", "众妃受赏"),
    10400, map("id", 10400, "name", "三宝", "scene", 10004, "order", 1, "limitNum", 10, "nextGuanka", 10401, "lv", 23, "gkMonsterId", list(10400, 20400), "talk", 17400, "des", "三宝夜报海兰出事。", "levelName", "海兰出事"),
    10401, map("id", 10401, "name", "阿箬", "scene", 10004, "order", 2, "limitNum", 10, "nextGuanka", 10402, "lv", 23, "gkMonsterId", list(10401, 20401), "talk", 17500, "des", "娴妃询问事情原委。", "levelName", "事情原委"),
    10402, map("id", 10402, "name", "高佳晞月", "scene", 10004, "order", 3, "limitNum", 10, "nextGuanka", 10403, "lv", 23, "gkMonsterId", list(10402, 20402), "talk", 17600, "des", "娴妃前去搭救海兰。", "levelName", "搭救海兰"),
    10403, map("id", 10403, "name", "莲心", "scene", 10004, "order", 4, "limitNum", 10, "nextGuanka", 10404, "lv", 23, "gkMonsterId", list(10403, 20403), "talk", 17700, "des", "莲心仗势欺人，寒夜给海常在、娴妃泼冷水。", "levelName", "仗势欺人"),
    10404, map("id", 10404, "name", "高佳晞月", "scene", 10004, "order", 5, "limitNum", 10, "nextGuanka", 10405, "lv", 24, "gkMonsterId", list(10404, 20404), "talk", 17800, "des", "娴妃怒打莲心。", "levelName", "莲心"),
    10405, map("id", 10405, "name", "弘历", "scene", 10004, "order", 6, "limitNum", 10, "nextGuanka", 10406, "lv", 24, "gkMonsterId", list(10405, 20405), "talk", 17900, "des", "皇上皇后闻讯赶来。", "levelName", "惊扰帝后"),
    10406, map("id", 10406, "name", "高佳晞月", "scene", 10004, "order", 7, "limitNum", 10, "nextGuanka", 10407, "lv", 24, "gkMonsterId", list(10406, 20406), "talk", 18000, "des", "嘉贵妃颠倒黑白冤枉海常在。", "levelName", "颠倒黑白"),
    10407, map("id", 10407, "name", "弘历", "scene", 10004, "order", 8, "limitNum", 10, "nextGuanka", 10408, "lv", 25, "gkMonsterId", list(10407, 20407), "talk", 18100, "des", "皇上表面心疼嘉贵妃，暗则保护娴妃。", "levelName", "默默保护"),
    10408, map("id", 10408, "name", "太医", "scene", 10004, "order", 9, "limitNum", 10, "nextGuanka", 10409, "lv", 25, "gkMonsterId", list(10408, 20408), "talk", 18200, "des", "娴妃请太医医治海常在。", "levelName", "医治海兰"),
    10409, map("id", 10409, "name", "阿箬", "scene", 10004, "order", 10, "limitNum", 10, "nextGuanka", 10410, "lv", 25, "gkMonsterId", list(10409, 20409), "talk", 18300, "des", "娴妃训斥小丫鬟。", "levelName", "训斥"),
    10410, map("id", 10410, "name", "小太监", "scene", 10004, "order", 11, "limitNum", 10, "nextGuanka", 10411, "lv", 25, "gkMonsterId", list(10410, 20410), "talk", 18400, "des", "娴妃夸奖惢心。", "levelName", "惢心"),
    10411, map("id", 10411, "name", "蕊心", "scene", 10004, "order", 12, "limitNum", 10, "nextGuanka", 10412, "lv", 26, "gkMonsterId", list(10411, 20411), "talk", 18500, "des", "夜闻海常在惊叫。", "levelName", "惊叫"),
    10412, map("id", 10412, "name", "宫女", "scene", 10004, "order", 13, "limitNum", 10, "nextGuanka", 10413, "lv", 26, "gkMonsterId", list(10412, 20412), "talk", 18600, "des", "安抚海兰。", "levelName", "安抚"),
    10413, map("id", 10413, "name", "海兰", "scene", 10004, "order", 14, "limitNum", 10, "nextGuanka", 10414, "lv", 26, "gkMonsterId", list(10413, 20413), "talk", 18700, "des", "海兰因辱患心病。", "levelName", "心病"),
    10414, map("id", 10414, "name", "苏绿筠", "scene", 10004, "order", 15, "limitNum", 10, "nextGuanka", 10415, "lv", 26, "gkMonsterId", list(10414, 20414), "talk", 18800, "des", "苏绿筠前来询问事情原委。", "levelName", "事情原委"),
    10415, map("id", 10415, "name", "宫女", "scene", 10004, "order", 16, "limitNum", 10, "nextGuanka", 10416, "lv", 27, "gkMonsterId", list(10415, 20415), "talk", 18900, "des", "娴妃的沉水香。", "levelName", "沉水香"),
    10416, map("id", 10416, "name", "苏绿筠", "scene", 10004, "order", 17, "limitNum", 10, "nextGuanka", 10417, "lv", 27, "gkMonsterId", list(10416, 20416), "talk", 19000, "des", "玫答应称病不肯面圣。", "levelName", "玫答应"),
    10417, map("id", 10417, "name", "阿箬", "scene", 10004, "order", 18, "limitNum", 10, "nextGuanka", 10418, "lv", 27, "gkMonsterId", list(10417, 20417), "talk", 19100, "des", "清理不忠之人。", "levelName", "不忠之人"),
    10418, map("id", 10418, "name", "富察琅嬅", "scene", 10004, "order", 19, "limitNum", 10, "nextGuanka", 10419, "lv", 28, "gkMonsterId", list(10418, 20418), "talk", 19200, "des", "皇上皇后召娴妃问话。", "levelName", "召见娴妃"),
    10419, map("id", 10419, "name", "白蕊姬", "scene", 10004, "order", 20, "limitNum", 10, "nextGuanka", 10420, "lv", 28, "gkMonsterId", list(10419, 20419), "talk", 19300, "des", "玫答应向皇上皇后哭诉。", "levelName", "哭诉"),
    10420, map("id", 10420, "name", "富察琅嬅", "scene", 10004, "order", 21, "limitNum", 10, "nextGuanka", 10421, "lv", 28, "gkMonsterId", list(10420, 20420), "talk", 19400, "des", "玫答应遭人陷害玉容毁。", "levelName", "玉容毁"),
    10421, map("id", 10421, "name", "太医", "scene", 10004, "order", 22, "limitNum", 10, "nextGuanka", 10422, "lv", 28, "gkMonsterId", list(10421, 20421), "talk", 19500, "des", "娴妃遭人算计，海兰舍命证清白。", "levelName", "遭人算计"),
    10422, map("id", 10422, "name", "海兰", "scene", 10004, "order", 23, "limitNum", 10, "nextGuanka", 10423, "lv", 29, "gkMonsterId", list(10422, 20422), "talk", 19600, "des", "娴妃、海常在姐妹情深。", "levelName", "姐妹情深"),
    10423, map("id", 10423, "name", "王钦", "scene", 10004, "order", 24, "limitNum", 10, "nextGuanka", 10424, "lv", 29, "gkMonsterId", list(10423, 20423), "talk", 19700, "des", "李玉机灵遭王公公斥责，娴妃施助于李玉。", "levelName", "李玉"),
    10424, map("id", 10424, "name", "蕊心", "scene", 10004, "order", 25, "limitNum", 10, "nextGuanka", 10500, "lv", 29, "gkMonsterId", list(10424, 20424), "talk", 19800, "des", "闻得皇后为拉拢王公公，将贴身宫女赐于做对食。", "levelName", "对食"),
    10500, map("id", 10500, "name", "高佳晞月", "scene", 10005, "order", 1, "limitNum", 10, "nextGuanka", 10501, "lv", 29, "gkMonsterId", list(10500, 20500), "talk", 19900, "des", "白蕊姬喜得龙胎，冲撞贵妃。", "levelName", "喜得龙胎"),
    10501, map("id", 10501, "name", "富察琅嬅", "scene", 10005, "order", 2, "limitNum", 10, "nextGuanka", 10502, "lv", 30, "gkMonsterId", list(10501, 20501), "talk", 20000, "des", "皇后将莲心赐于王公公做对食。", "levelName", "做对食")
);
    }

    private static void init2() {
data.map(
    10502, map("id", 10502, "name", "弘历", "scene", 10005, "order", 3, "limitNum", 10, "nextGuanka", 10503, "lv", 30, "gkMonsterId", list(10502, 20502), "talk", 20100, "des", "晨起窗前，对镜梳妆，耳鬓厮磨。", "levelName", "对镜梳妆"),
    10503, map("id", 10503, "name", "永璜", "scene", 10005, "order", 4, "limitNum", 10, "nextGuanka", 10504, "lv", 30, "gkMonsterId", list(10503, 20503), "talk", 20200, "des", "永璜前来承欢膝下。", "levelName", "承欢膝下"),
    10504, map("id", 10504, "name", "蕊心", "scene", 10005, "order", 5, "limitNum", 10, "nextGuanka", 10505, "lv", 31, "gkMonsterId", list(10504, 20504), "talk", 20300, "des", "深夜的嘶吼声。", "levelName", "嘶吼"),
    10505, map("id", 10505, "name", "富察琅嬅", "scene", 10005, "order", 6, "limitNum", 10, "nextGuanka", 10506, "lv", 31, "gkMonsterId", list(10505, 20505), "talk", 20400, "des", "莲心新婚次日面见皇后。", "levelName", "新婚"),
    10506, map("id", 10506, "name", "金玉妍", "scene", 10005, "order", 7, "limitNum", 10, "nextGuanka", 10507, "lv", 31, "gkMonsterId", list(10506, 20506), "talk", 20500, "des", "众妃嫔私下议论深夜嘶吼声。", "levelName", "深夜嘶吼"),
    10507, map("id", 10507, "name", "黄绮澐", "scene", 10005, "order", 8, "limitNum", 10, "nextGuanka", 10508, "lv", 31, "gkMonsterId", list(10507, 20507), "talk", 20600, "des", "娴妃偶遇跳河寻死的莲心。", "levelName", "莲心寻思"),
    10508, map("id", 10508, "name", "莲心", "scene", 10005, "order", 9, "limitNum", 10, "nextGuanka", 10509, "lv", 32, "gkMonsterId", list(10508, 20508), "talk", 20700, "des", "莲心获救，向娴妃诉说心中的绝望。", "levelName", "莲心获救"),
    10509, map("id", 10509, "name", "王钦", "scene", 10005, "order", 10, "limitNum", 10, "nextGuanka", 10510, "lv", 32, "gkMonsterId", list(10509, 20509), "talk", 20800, "des", "玫贵人顺利产子。", "levelName", "玫贵人"),
    10510, map("id", 10510, "name", "富察琅嬅", "scene", 10005, "order", 11, "limitNum", 10, "nextGuanka", 10511, "lv", 32, "gkMonsterId", list(10510, 20510), "talk", 20900, "des", "玫贵人诞下双性别怪婴。", "levelName", "双性怪婴"),
    10511, map("id", 10511, "name", "太医", "scene", 10005, "order", 12, "limitNum", 10, "nextGuanka", 10512, "lv", 32, "gkMonsterId", list(10511, 20511), "talk", 21000, "des", "皇后力求赐襁褓中的怪婴一死。", "levelName", "赐死"),
    10512, map("id", 10512, "name", "富察琅嬅", "scene", 10005, "order", 13, "limitNum", 10, "nextGuanka", 10513, "lv", 33, "gkMonsterId", list(10512, 20512), "talk", 21100, "des", "娴妃力阻赐死怪婴，被皇后掌嘴。", "levelName", "劝阻护子"),
    10513, map("id", 10513, "name", "蕊心", "scene", 10005, "order", 14, "limitNum", 10, "nextGuanka", 10514, "lv", 33, "gkMonsterId", list(10513, 20513), "talk", 21200, "des", "玫贵人受冷落，阿若收敛性子。", "levelName", "冷落"),
    10514, map("id", 10514, "name", "宫女", "scene", 10005, "order", 15, "limitNum", 10, "nextGuanka", 10515, "lv", 33, "gkMonsterId", list(10514, 20514), "talk", 21300, "des", "玫贵人产下怪婴的流言四起。", "levelName", "流言四起"),
    10515, map("id", 10515, "name", "王钦", "scene", 10005, "order", 16, "limitNum", 10, "nextGuanka", 10516, "lv", 34, "gkMonsterId", list(10515, 20515), "talk", 21400, "des", "皇上传旨让娴妃前往养心殿。", "levelName", "传召"),
    10516, map("id", 10516, "name", "富察琅嬅", "scene", 10005, "order", 17, "limitNum", 10, "nextGuanka", 10517, "lv", 34, "gkMonsterId", list(10516, 20516), "talk", 21500, "des", "皇后质问娴妃是否传出流言。", "levelName", "流言"),
    10517, map("id", 10517, "name", "弘历", "scene", 10005, "order", 18, "limitNum", 10, "nextGuanka", 10518, "lv", 34, "gkMonsterId", list(10517, 20517), "talk", 21600, "des", "王公公作伪证诬陷娴妃，皇上盛怒禁足娴妃。", "levelName", "遭诬陷"),
    10518, map("id", 10518, "name", "海兰", "scene", 10005, "order", 19, "limitNum", 10, "nextGuanka", 10519, "lv", 34, "gkMonsterId", list(10518, 20518), "talk", 21700, "des", "娴妃被诬陷而禁足，无奈之下寻求生路。", "levelName", "禁足"),
    10519, map("id", 10519, "name", "李玉", "scene", 10005, "order", 20, "limitNum", 10, "nextGuanka", 10520, "lv", 35, "gkMonsterId", list(10519, 20519), "talk", 21800, "des", "王公公醉酒戏弄贵妃。", "levelName", "醉酒"),
    10520, map("id", 10520, "name", "富察琅嬅", "scene", 10005, "order", 21, "limitNum", 10, "nextGuanka", 10521, "lv", 35, "gkMonsterId", list(10520, 20520), "talk", 21900, "des", "贵妃受辱，痛哭求皇上做主治罪王公公。", "levelName", "贵妃受辱"),
    10521, map("id", 10521, "name", "高佳晞月", "scene", 10005, "order", 22, "limitNum", 10, "nextGuanka", 10522, "lv", 35, "gkMonsterId", list(10521, 20521), "talk", 22000, "des", "李玉带人查出王钦服用春药，莲心前来作证。", "levelName", "春药"),
    10522, map("id", 10522, "name", "莲心", "scene", 10005, "order", 23, "limitNum", 10, "nextGuanka", 10523, "lv", 35, "gkMonsterId", list(10522, 20522), "talk", 22100, "des", "莲心一吐心中苦水，顺便说出流言原委替娴妃洗白冤屈。", "levelName", "洗白冤情"),
    10523, map("id", 10523, "name", "蕊心", "scene", 10005, "order", 24, "limitNum", 10, "nextGuanka", 10524, "lv", 36, "gkMonsterId", list(10523, 20523), "talk", 22200, "des", "景阳宫探怡贵人。", "levelName", "探望怡贵人"),
    10524, map("id", 10524, "name", "海兰", "scene", 10005, "order", 25, "limitNum", 10, "nextGuanka", 10525, "lv", 36, "gkMonsterId", list(10524, 20524), "talk", 22300, "des", "海兰查出怡贵人处蛇虫四起原是有人陷害。", "levelName", "蛇虫四起"),
    10525, map("id", 10525, "name", "太医", "scene", 10005, "order", 26, "limitNum", 10, "nextGuanka", 10526, "lv", 36, "gkMonsterId", list(10525, 20525), "talk", 22400, "des", "怡贵人早产，胎死腹中。", "levelName", "胎死腹中"),
    10526, map("id", 10526, "name", "莲心", "scene", 10005, "order", 27, "limitNum", 10, "nextGuanka", 10527, "lv", 36, "gkMonsterId", list(10526, 20526), "talk", 22500, "des", "查出怡贵人的死胎有异，似是有人下毒。", "levelName", "下毒"),
    10527, map("id", 10527, "name", "富察琅嬅", "scene", 10005, "order", 28, "limitNum", 10, "nextGuanka", 10600, "lv", 37, "gkMonsterId", list(10527, 20527), "talk", 22600, "des", "皇后负责查破水银下毒案，据证实是娴妃所做。", "levelName", "水银下毒案"),
    10600, map("id", 10600, "name", "苏绿筠", "scene", 10006, "order", 1, "limitNum", 10, "nextGuanka", 10601, "lv", 37, "gkMonsterId", list(10600, 20600), "talk", 22700, "des", "皇后命人在娴妃处查出朱砂。", "levelName", "朱砂"),
    10601, map("id", 10601, "name", "富察琅嬅", "scene", 10006, "order", 2, "limitNum", 10, "nextGuanka", 10602, "lv", 37, "gkMonsterId", list(10601, 20601), "talk", 22800, "des", "阿箬求荣卖主，陷害娴妃。", "levelName", "求荣卖主"),
    10602, map("id", 10602, "name", "阿箬", "scene", 10006, "order", 3, "limitNum", 10, "nextGuanka", 10603, "lv", 38, "gkMonsterId", list(10602, 20602), "talk", 22900, "des", "阿箬供词天衣无缝，对答如流。", "levelName", "对答如流"),
    10603, map("id", 10603, "name", "金玉妍", "scene", 10006, "order", 4, "limitNum", 10, "nextGuanka", 10604, "lv", 38, "gkMonsterId", list(10603, 20603), "talk", 23000, "des", "众人矛头均指向娴妃。", "levelName", "娴妃"),
    10604, map("id", 10604, "name", "海兰", "scene", 10006, "order", 5, "limitNum", 10, "nextGuanka", 10605, "lv", 38, "gkMonsterId", list(10604, 20604), "talk", 23100, "des", "娴妃被身边贴身丫鬟陷害，心中倍感苦涩。", "levelName", "陷害"),
    10605, map("id", 10605, "name", "李玉", "scene", 10006, "order", 6, "limitNum", 10, "nextGuanka", 10606, "lv", 38, "gkMonsterId", list(10605, 20605), "talk", 23200, "des", "阿箬借势上位，倍受荣宠。", "levelName", "借势上位"),
    10606, map("id", 10606, "name", "阿箬", "scene", 10006, "order", 7, "limitNum", 10, "nextGuanka", 10607, "lv", 39, "gkMonsterId", list(10606, 20606), "talk", 23300, "des", "阿箬被封常在。", "levelName", "阿箬"),
    10607, map("id", 10607, "name", "富察琅嬅", "scene", 10006, "order", 8, "limitNum", 10, "nextGuanka", 10608, "lv", 39, "gkMonsterId", list(10607, 20607), "talk", 23400, "des", "嘉贵妃抱怨阿箬一步登天。", "levelName", "一步登天"),
    10608, map("id", 10608, "name", "皇太后甄嬛", "scene", 10006, "order", 9, "limitNum", 10, "nextGuanka", 10609, "lv", 39, "gkMonsterId", list(10608, 20608), "talk", 23500, "des", "皇太后训话皇后。", "levelName", "训话"),
    10609, map("id", 10609, "name", "阿箬", "scene", 10006, "order", 10, "limitNum", 10, "nextGuanka", 10610, "lv", 39, "gkMonsterId", list(10609, 20609), "talk", 23600, "des", "皇上下旨，将娴妃打入冷宫。", "levelName", "打入冷宫"),
    10610, map("id", 10610, "name", "蕊心", "scene", 10006, "order", 11, "limitNum", 10, "nextGuanka", 10611, "lv", 40, "gkMonsterId", list(10610, 20610), "talk", 23700, "des", "蕊心忠心护住，随娴妃入冷宫。", "levelName", "忠心护住"),
    10611, map("id", 10611, "name", "皇太后甄嬛", "scene", 10006, "order", 12, "limitNum", 10, "nextGuanka", 10612, "lv", 40, "gkMonsterId", list(10611, 20611), "talk", 23800, "des", "太后密诏娴妃。", "levelName", "密诏"),
    10612, map("id", 10612, "name", "福伽", "scene", 10006, "order", 13, "limitNum", 10, "nextGuanka", 10613, "lv", 40, "gkMonsterId", list(10612, 20612), "talk", 23900, "des", "原是太后救娴妃一命。", "levelName", "太后"),
    10613, map("id", 10613, "name", "魏嬿婉", "scene", 10006, "order", 14, "limitNum", 10, "nextGuanka", 10614, "lv", 41, "gkMonsterId", list(10613, 20613), "talk", 24000, "des", "魏嬿婉与凌云彻。", "levelName", "魏嬿婉"),
    10614, map("id", 10614, "name", "海兰", "scene", 10006, "order", 15, "limitNum", 10, "nextGuanka", 10615, "lv", 41, "gkMonsterId", list(10614, 20614), "talk", 24100, "des", "海兰深夜去冷宫秘密探望娴妃。", "levelName", "探望娴妃"),
    10615, map("id", 10615, "name", "苏绿筠", "scene", 10006, "order", 16, "limitNum", 10, "nextGuanka", 10616, "lv", 41, "gkMonsterId", list(10615, 20615), "talk", 24200, "des", "海兰重得皇上宠爱，密谋为娴妃复仇。", "levelName", "重得龙宠"),
    10616, map("id", 10616, "name", "海兰", "scene", 10006, "order", 17, "limitNum", 10, "nextGuanka", 10617, "lv", 41, "gkMonsterId", list(10616, 20616), "talk", 24300, "des", "皇上宠幸海兰。", "levelName", "宠幸"),
    10617, map("id", 10617, "name", "李玉", "scene", 10006, "order", 18, "limitNum", 10, "nextGuanka", 10618, "lv", 42, "gkMonsterId", list(10617, 20617), "talk", 24400, "des", "二阿哥薨了。", "levelName", "二阿哥薨"),
    10618, map("id", 10618, "name", "苏绿筠", "scene", 10006, "order", 19, "limitNum", 10, "nextGuanka", 10619, "lv", 42, "gkMonsterId", list(10618, 20618), "talk", 24500, "des", "三阿哥重获父皇宠爱。", "levelName", "父皇宠爱"),
    10619, map("id", 10619, "name", "魏嬿婉", "scene", 10006, "order", 20, "limitNum", 10, "nextGuanka", 10620, "lv", 42, "gkMonsterId", list(10619, 20619), "talk", 24600, "des", "皇上路遇嬿婉，对其倍有好感。", "levelName", "嬿婉"),
    10620, map("id", 10620, "name", "魏嬿婉", "scene", 10006, "order", 21, "limitNum", 10, "nextGuanka", 10621, "lv", 42, "gkMonsterId", list(10620, 20620), "talk", 24700, "des", "海兰察觉一二，劝纯妃不能将魏嬿婉留于宫内。", "levelName", "察觉"),
    10621, map("id", 10621, "name", "海兰", "scene", 10006, "order", 22, "limitNum", 10, "nextGuanka", 10622, "lv", 43, "gkMonsterId", list(10621, 20621), "talk", 24800, "des", "海兰厌恶魏嬿婉。", "levelName", "厌恶"),
    10622, map("id", 10622, "name", "江与彬", "scene", 10006, "order", 23, "limitNum", 10, "nextGuanka", 10623, "lv", 43, "gkMonsterId", list(10622, 20622), "talk", 24900, "des", "太医江与彬。", "levelName", "江与彬"),
    10623, map("id", 10623, "name", "蕊心", "scene", 10006, "order", 24, "limitNum", 10, "nextGuanka", 10700, "lv", 43, "gkMonsterId", list(10623, 20623), "talk", 25000, "des", "江与彬与娴妃相识。", "levelName", "相识")
);
    }

    private static void init3() {
data.map(
    10700, map("id", 10700, "name", "江与彬", "scene", 10007, "order", 1, "limitNum", 10, "nextGuanka", 10701, "lv", 44, "gkMonsterId", list(10700, 20700), "talk", 25100, "des", "娴妃冷宫遭人毒害。", "levelName", "冷宫遭毒害"),
    10701, map("id", 10701, "name", "禁军侍卫", "scene", 10007, "order", 2, "limitNum", 10, "nextGuanka", 10702, "lv", 44, "gkMonsterId", list(10701, 20701), "talk", 25200, "des", "海兰晋升海贵人，亦怀有身孕。", "levelName", "海贵人"),
    10702, map("id", 10702, "name", "叶赫那拉意欢", "scene", 10007, "order", 3, "limitNum", 10, "nextGuanka", 10703, "lv", 44, "gkMonsterId", list(10702, 20702), "talk", 25300, "des", "太后借机引荐叶赫那拉意欢于皇上。", "levelName", "叶赫那拉"),
    10703, map("id", 10703, "name", "高佳晞月", "scene", 10007, "order", 4, "limitNum", 10, "nextGuanka", 10704, "lv", 44, "gkMonsterId", list(10703, 20703), "talk", 25400, "des", "嘉贵人撒娇求观烟花。", "levelName", "烟花"),
    10704, map("id", 10704, "name", "凌云彻", "scene", 10007, "order", 5, "limitNum", 10, "nextGuanka", 10705, "lv", 45, "gkMonsterId", list(10704, 20704), "talk", 25500, "des", "冷宫意外失火。", "levelName", "冷宫失火"),
    10705, map("id", 10705, "name", "李玉", "scene", 10007, "order", 6, "limitNum", 10, "nextGuanka", 10706, "lv", 45, "gkMonsterId", list(10705, 20705), "talk", 25600, "des", "皇上盛怒，摆驾冷宫。", "levelName", "摆驾冷宫"),
    10706, map("id", 10706, "name", "富察琅嬅", "scene", 10007, "order", 7, "limitNum", 10, "nextGuanka", 10707, "lv", 45, "gkMonsterId", list(10706, 20706), "talk", 25700, "des", "皇上又见冷宫旧人。", "levelName", "冷宫旧人"),
    10707, map("id", 10707, "name", "弘历", "scene", 10007, "order", 8, "limitNum", 10, "nextGuanka", 10708, "lv", 45, "gkMonsterId", list(10707, 20707), "talk", 25800, "des", "慧贵妃自请其罪。", "levelName", "请罪"),
    10708, map("id", 10708, "name", "江与彬", "scene", 10007, "order", 9, "limitNum", 10, "nextGuanka", 10709, "lv", 46, "gkMonsterId", list(10708, 20708), "talk", 25900, "des", "皇上仍念旧情。", "levelName", "旧情复燃"),
    10709, map("id", 10709, "name", "弘历", "scene", 10007, "order", 10, "limitNum", 10, "nextGuanka", 10710, "lv", 46, "gkMonsterId", list(10709, 20709), "talk", 26000, "des", "皇上再访冷宫，看望旧人叙旧情。", "levelName", "叙旧情"),
    10710, map("id", 10710, "name", "高佳晞月", "scene", 10007, "order", 11, "limitNum", 10, "nextGuanka", 10711, "lv", 46, "gkMonsterId", list(10710, 20710), "talk", 26100, "des", "嘉贵妃闻得娴妃复位，乱了阵脚。", "levelName", "娴妃复位"),
    10711, map("id", 10711, "name", "海兰", "scene", 10007, "order", 12, "limitNum", 10, "nextGuanka", 10712, "lv", 46, "gkMonsterId", list(10711, 20711), "talk", 26200, "des", "海兰日日想念娴妃。", "levelName", "姐妹情深"),
    10712, map("id", 10712, "name", "弘历", "scene", 10007, "order", 13, "limitNum", 10, "nextGuanka", 10713, "lv", 47, "gkMonsterId", list(10712, 20712), "talk", 26300, "des", "皇上与娴妃耳鬓厮磨。", "levelName", "耳鬓厮磨"),
    10713, map("id", 10713, "name", "皇太后甄嬛", "scene", 10007, "order", 14, "limitNum", 10, "nextGuanka", 10714, "lv", 47, "gkMonsterId", list(10713, 20713), "talk", 26400, "des", "娴妃拜见皇太后，太后追问中毒之事。", "levelName", "事情原委"),
    10714, map("id", 10714, "name", "富察琅嬅", "scene", 10007, "order", 15, "limitNum", 10, "nextGuanka", 10715, "lv", 47, "gkMonsterId", list(10714, 20714), "talk", 26500, "des", "皇室家宴，众妃与皇上其乐融融。", "levelName", "皇室家宴"),
    10715, map("id", 10715, "name", "金玉妍", "scene", 10007, "order", 16, "limitNum", 10, "nextGuanka", 10716, "lv", 48, "gkMonsterId", list(10715, 20715), "talk", 26600, "des", "金玉妍拦路刁难慎嫔。", "levelName", "慎嫔"),
    10716, map("id", 10716, "name", "海兰", "scene", 10007, "order", 17, "limitNum", 10, "nextGuanka", 10717, "lv", 48, "gkMonsterId", list(10716, 20716), "talk", 26700, "des", "海兰被人算计。", "levelName", "算计"),
    10717, map("id", 10717, "name", "阿箬", "scene", 10007, "order", 18, "limitNum", 10, "nextGuanka", 10718, "lv", 48, "gkMonsterId", list(10717, 20717), "talk", 26800, "des", "慎嫔表面荣宠，实则辛酸。", "levelName", "荣宠辛酸"),
    10718, map("id", 10718, "name", "富察琅嬅", "scene", 10007, "order", 19, "limitNum", 10, "nextGuanka", 10719, "lv", 48, "gkMonsterId", list(10718, 20718), "talk", 26900, "des", "再话翡翠珠缠丝赤金莲花镯。", "levelName", "翡翠镯"),
    10719, map("id", 10719, "name", "阿箬", "scene", 10007, "order", 20, "limitNum", 10, "nextGuanka", 10720, "lv", 49, "gkMonsterId", list(10719, 20719), "talk", 27000, "des", "慎嫔质问娴妃。", "levelName", "质问"),
    10720, map("id", 10720, "name", "富察琅嬅", "scene", 10007, "order", 21, "limitNum", 10, "nextGuanka", 10721, "lv", 49, "gkMonsterId", list(10720, 20720), "talk", 27100, "des", "皇上借封赏众嫔妃揭露慎嫔卖主求荣。", "levelName", "揭露旧事"),
    10721, map("id", 10721, "name", "阿箬", "scene", 10007, "order", 22, "limitNum", 10, "nextGuanka", 10722, "lv", 49, "gkMonsterId", list(10721, 20721), "talk", 27200, "des", "当场审讯慎嫔。", "levelName", "审讯慎嫔"),
    10722, map("id", 10722, "name", "高佳晞月", "scene", 10007, "order", 23, "limitNum", 10, "nextGuanka", 10723, "lv", 49, "gkMonsterId", list(10722, 20722), "talk", 27300, "des", "皇后与贵妃极力撇清与慎嫔的关系。", "levelName", "落井下石"),
    10723, map("id", 10723, "name", "三宝", "scene", 10007, "order", 24, "limitNum", 10, "nextGuanka", 10724, "lv", 50, "gkMonsterId", list(10723, 20723), "talk", 27400, "des", "阿箬惨受猫刑。", "levelName", "猫刑"),
    10724, map("id", 10724, "name", "海兰", "scene", 10007, "order", 25, "limitNum", 10, "lv", 50, "gkMonsterId", list(10724, 20724), "talk", 27500, "des", "海兰喜得五阿哥，皇上赐名永琪。", "levelName", "五阿哥永琪")
);
    }

}