package com.hadoit.game.fsgame.gms.config.data;

import com.hadoit.game.fsgame.gms.config.data.base.LData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;


/**
 * 物品总表.csv
 * 物品编号 = id
 * 名称 = name
 * 等级 = lv
 * 类别 = kind
 * 子类别 = subKind
 * 建筑宠物目标id = targetId
 * 开礼包是否检查背包大小 = checkBagSize
 * 是否算入快速购买 = evenQuick
 * 快速购买价格 = quickMoney
 * 快速购买鲜花的数量 = flowerNum
 * 不足时是否会弹出获取途径 = acquirePathway
 * 渠道 = pathway
 * 渠道类型 = pathwayKind
 * 可否叠加 = stack
 * 使用方式 = useMode
 * 战斗掉落是否公告 = systemNotice
 * 收回银币 = money
 * 影响的属性ID = effectPropId
 */
public class ItemData extends LData {
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
        init40();
        init41();
        init42();
        init43();
        init44();
        init45();
        init46();
        init47();
        init48();
        init49();
        init50();
        init51();
        init52();
        init53();
        init54();
        init55();
        init56();
        init57();
        init58();
        init59();
        init60();
        init61();
        init62();
        init63();
        init64();
        init65();
        init66();
        init67();
        init68();
        init69();
        init70();
        init71();
        init72();
        init73();
        init74();
        init75();
        init76();
        init77();
        init78();
        init79();
        init80();
        init81();
        init82();
        init83();
        init84();
        init85();
        init86();
        init87();
        init88();
        init89();
        init90();
        init91();
        init92();
        init93();
        init94();
        init95();
        init96();
        init97();
        init98();
        init99();
        init100();
        init101();
        init102();
        init103();
        init104();
        init105();
        init106();
        init107();
        init108();
        init109();
        init110();
        init111();
        init112();
        init113();
        init114();
        init115();
        init116();
        init117();
        init118();
        init119();
        init120();
        init121();
        init122();
        init123();
        init124();
        init125();
        init126();
        init127();
        init128();
        init129();
        init130();
        init131();
        init132();
        init133();
        init134();
        init135();
        init136();
        init137();
        init138();
        init139();
        init140();
        init141();
        init142();
        init143();
        init144();
        init145();
        init146();
        init147();
        init148();
        init149();
        init150();
        init151();
        init152();
        init153();
        init154();
        init155();
        init156();
        init157();
        init158();
        init159();
        init160();
        init161();
        init162();
        init163();
        init164();
        init165();
        init166();
        init167();
        init168();
        init169();
        init170();
        init171();
        init172();
        init173();
        init174();
        init175();
        init176();
        init177();
        init178();
        init179();
        init180();
        init181();
        init182();
        init183();
        init184();
        init185();
        init186();
        init187();
        init188();
        init189();
        init190();
        init191();
        init192();
        init193();
        init194();
        init195();
        init196();
        init197();
        init198();
        init199();
        init200();
        init201();
        init202();
        init203();
        init204();
        init205();
        init206();
        init207();
        init208();
        init209();
        init210();
        init211();
        init212();
        init213();
        init214();
        init215();
        init216();
        init217();
        init218();
        init219();
        init220();
        init221();
        init222();
        init223();
        init224();
        init225();
        init226();
        init227();
        init228();
        init229();
        init230();
        init231();
        init232();
        init233();
        init234();
        init235();
        init236();
        init237();
        init238();
        init239();
        init240();
        init241();
        init242();
        init243();
        init244();
        init245();
        init246();
        init247();
        init248();
        init249();
        init250();
        init251();
        init252();
        init253();
        init254();
        init255();
        init256();
        init257();
        init258();
        init259();
        init260();
        init261();
        init262();
        init263();
        init264();
        init265();
        init266();
        init267();
        init268();
        init269();
        init270();
        init271();
        init272();
        init273();
        init274();
        init275();
        init276();
        init277();
        init278();
        init279();
        init280();
        init281();
        init282();
        init283();
        init284();
        init285();
        init286();
        init287();
        init288();
        init289();
        init290();
        init291();
        init292();
        init293();
        init294();
        init295();
        init296();
        init297();
        init298();
        init299();
        init300();
        init301();
        init302();
        init303();
        init304();
        init305();
        init306();
        init307();
        init308();
        init309();
        init310();
        init311();
        init312();
        init313();
        init314();
        init315();
        init316();
        init317();
        init318();
        init319();
        init320();
        init321();
        init322();
        init323();
        init324();
        init325();
        init326();
        init327();
        init328();
        init329();
        init330();
        init331();
        init332();
        init333();
        init334();
        init335();
        init336();
        init337();
        init338();
        init339();
        init340();
        init341();
        init342();
        init343();
        init344();
        init345();
        init346();
        init347();
        init348();
        init349();
        init350();
        init351();
        init352();
        init353();
        init354();
        init355();
        init356();
        init357();
        init358();
        init359();
        init360();
        init361();
        init362();
        init363();
        init364();
        init365();
        init366();
        init367();
        init368();
        init369();
        init370();
        init371();
        init372();
        init373();
        init374();
        init375();
        init376();
        init377();
        init378();
        init379();
        init380();
        init381();
        init382();
        init383();
        init384();
        init385();
        init386();
        init387();
        init388();
        init389();
        init390();
        init391();
        init392();
        init393();
        init394();
        init395();
        init396();
        init397();
        init398();
        init399();
        init400();
        init401();
        init402();
        init403();
        init404();
        init405();
        init406();
        init407();
        init408();
        init409();
        init410();
        init411();
        init412();
        init413();
        init414();
        init415();
        init416();
        init417();
        init418();
        init419();
        init420();
        init421();
        init422();
        init423();
        init424();
        init425();
        init426();
        init427();
        init428();
        init429();
        init430();
        init431();
        init432();
        init433();
        init434();
        init435();
        init436();
        init437();
        init438();
        init439();
        init440();
        init441();
        init442();
        init443();
        init444();
        init445();
        init446();
        init447();
        init448();
        init449();
        init450();
        init451();
        init452();
        init453();
        init454();
        init455();
        init456();
        init457();
        init458();
        init459();
        init460();
        init461();
        init462();
        init463();
        init464();
        init465();
        init466();
        init467();
        init468();
        init469();
        init470();
        init471();
        init472();
        init473();
        init474();
        init475();
        init476();
        init477();
        init478();
        init479();
        init480();
        init481();
        init482();
        init483();
        init484();
        init485();
        init486();
        init487();
        init488();
        init489();
        init490();
        init491();
        init492();
        init493();
        init494();
        init495();
        init496();
        init497();
        init498();
        init499();
        init500();
        init501();
        init502();
        init503();
        init504();
        init505();
        init506();
        init507();
        init508();
        init509();
        init510();
        init511();
        init512();
        init513();
        init514();
        init515();
        init516();
        init517();
        init518();
        init519();
        init520();
        init521();
        init522();
        init523();
        init524();
        init525();
        init526();
        init527();
        init528();
        init529();
        init530();
        init531();
        init532();
        init533();
        init534();
        init535();
        init536();
        init537();
        init538();
        init539();
        init540();
        init541();
        init542();
        init543();
        init544();
        init545();
        init546();
        init547();
        init548();
        init549();
        init550();
        init551();
        init552();
        init553();
        init554();
        init555();
        init556();
        init557();
        init558();
        init559();
        init560();
        init561();
        init562();
        init563();
        init564();
        init565();
        init566();
        init567();
        init568();
        init569();
        init570();
        init571();
        init572();
        init573();
        init574();
        init575();
        init576();
        init577();
        init578();
        init579();
        init580();
        init581();
        init582();
        init583();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "name", "夜月剑", "lv", 1, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", false, "useMode", 0, "money", 1),
    10001, map("id", 10001, "name", "玄铁红英", "lv", 10, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10002, map("id", 10002, "name", "沉虹斩", "lv", 20, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10003, map("id", 10003, "name", "青龙斩", "lv", 30, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10004, map("id", 10004, "name", "暗影双刀", "lv", 40, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init1() {
data.map(
    10005, map("id", 10005, "name", "饮血", "lv", 50, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10006, map("id", 10006, "name", "月牙戟", "lv", 60, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10007, map("id", 10007, "name", "雷火震天戟", "lv", 70, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10008, map("id", 10008, "name", "鬼魄双骄", "lv", 80, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10009, map("id", 10009, "name", "碧云剑", "lv", 90, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init2() {
data.map(
    10010, map("id", 10010, "name", "金碧紫云剑", "lv", 100, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10011, map("id", 10011, "name", "烈焰屠龙斩", "lv", 110, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10012, map("id", 10012, "name", "紫金宝剑", "lv", 120, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10013, map("id", 10013, "name", "青霜剑", "lv", 130, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10014, map("id", 10014, "name", "紫电剑", "lv", 140, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init3() {
data.map(
    10015, map("id", 10015, "name", "干将剑", "lv", 150, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10016, map("id", 10016, "name", "莫邪斩", "lv", 160, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    10100, map("id", 10100, "name", "御赐神龙斩", "lv", 5, "kind", 1, "subKind", 1, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11000, map("id", 11000, "name", "护甲衣", "lv", 1, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", false, "useMode", 0, "money", 1),
    11001, map("id", 11001, "name", "紧身衣", "lv", 10, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init4() {
data.map(
    11002, map("id", 11002, "name", "虎皮轻裘", "lv", 20, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11003, map("id", 11003, "name", "锦缎绸衣", "lv", 30, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11004, map("id", 11004, "name", "环锁软甲", "lv", 40, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11005, map("id", 11005, "name", "黄金鳞甲", "lv", 50, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11006, map("id", 11006, "name", "碧波玉衣", "lv", 60, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init5() {
data.map(
    11007, map("id", 11007, "name", "紫龙软甲", "lv", 70, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11008, map("id", 11008, "name", "三元一体精甲", "lv", 80, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11009, map("id", 11009, "name", "金碧铁甲", "lv", 90, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11010, map("id", 11010, "name", "金碧龙盔甲", "lv", 100, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11011, map("id", 11011, "name", "烈焰龙盔甲", "lv", 110, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init6() {
data.map(
    11012, map("id", 11012, "name", "紫金龙盔甲", "lv", 120, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11013, map("id", 11013, "name", "青霜甲", "lv", 130, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11014, map("id", 11014, "name", "紫电甲", "lv", 140, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11015, map("id", 11015, "name", "干将鳞甲", "lv", 150, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    11016, map("id", 11016, "name", "莫邪鳞甲", "lv", 160, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init7() {
data.map(
    11100, map("id", 11100, "name", "御赐护甲", "lv", 5, "kind", 1, "subKind", 2, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12000, map("id", 12000, "name", "草编履", "lv", 1, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", false, "useMode", 0, "money", 1),
    12001, map("id", 12001, "name", "布鞋", "lv", 10, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12002, map("id", 12002, "name", "金边红锦履", "lv", 20, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12003, map("id", 12003, "name", "玄铁镶玉锦履", "lv", 30, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init8() {
data.map(
    12004, map("id", 12004, "name", "龙甲战靴", "lv", 40, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12005, map("id", 12005, "name", "多宝战靴", "lv", 50, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12006, map("id", 12006, "name", "翡翠靴", "lv", 60, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12007, map("id", 12007, "name", "烈焰追风", "lv", 70, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12008, map("id", 12008, "name", "上古紫金流云", "lv", 80, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init9() {
data.map(
    12009, map("id", 12009, "name", "金碧锦履", "lv", 90, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12010, map("id", 12010, "name", "金碧战靴", "lv", 100, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12011, map("id", 12011, "name", "烈焰战靴", "lv", 110, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12012, map("id", 12012, "name", "紫金战靴", "lv", 120, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12013, map("id", 12013, "name", "青霜战靴", "lv", 130, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init10() {
data.map(
    12014, map("id", 12014, "name", "紫电战靴", "lv", 140, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12015, map("id", 12015, "name", "干将战靴", "lv", 150, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12016, map("id", 12016, "name", "莫邪战靴", "lv", 160, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    12100, map("id", 12100, "name", "御赐皮靴", "lv", 5, "kind", 1, "subKind", 3, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13000, map("id", 13000, "name", "银项圈", "lv", 1, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init11() {
data.map(
    13001, map("id", 13001, "name", "蓝宝石项圈", "lv", 10, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13002, map("id", 13002, "name", "南海明珠珊瑚串", "lv", 20, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13003, map("id", 13003, "name", "七彩赤练项圈", "lv", 30, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13004, map("id", 13004, "name", "玲珑点翠项链", "lv", 40, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13005, map("id", 13005, "name", "玉锁牌项圈璎珞", "lv", 50, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init12() {
data.map(
    13006, map("id", 13006, "name", "翡翠赤金珠盘串", "lv", 60, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13007, map("id", 13007, "name", "赤血碧玺银项圈", "lv", 70, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13008, map("id", 13008, "name", "松石天水滴吊坠", "lv", 80, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13009, map("id", 13009, "name", "天使之泪吊坠", "lv", 90, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13010, map("id", 13010, "name", "金碧吊坠", "lv", 100, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init13() {
data.map(
    13011, map("id", 13011, "name", "凤飞于天项圈", "lv", 110, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13012, map("id", 13012, "name", "天音铃铛锁坠", "lv", 120, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13013, map("id", 13013, "name", "青霜项圈", "lv", 130, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13014, map("id", 13014, "name", "紫电项圈", "lv", 140, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13015, map("id", 13015, "name", "干将项圈", "lv", 150, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init14() {
data.map(
    13016, map("id", 13016, "name", "莫邪项圈", "lv", 160, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    13100, map("id", 13100, "name", "御赐金锁圈", "lv", 5, "kind", 1, "subKind", 4, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14000, map("id", 14000, "name", "斗笠", "lv", 1, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", false, "useMode", 0, "money", 1),
    14001, map("id", 14001, "name", "方巾", "lv", 10, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14002, map("id", 14002, "name", "锦帛冠", "lv", 20, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init15() {
data.map(
    14003, map("id", 14003, "name", "红珊瑚玉带帢", "lv", 30, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14004, map("id", 14004, "name", "野鸡翎狐尾冠", "lv", 40, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14005, map("id", 14005, "name", "兽皮金丝帻", "lv", 50, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14006, map("id", 14006, "name", "玉戴帽", "lv", 60, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14007, map("id", 14007, "name", "红缨金龙盔", "lv", 70, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init16() {
data.map(
    14008, map("id", 14008, "name", "紫金方鼎玉带帽", "lv", 80, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14009, map("id", 14009, "name", "翡翠头盔", "lv", 90, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14010, map("id", 14010, "name", "金碧头盔", "lv", 100, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14011, map("id", 14011, "name", "烈焰头盔", "lv", 110, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14012, map("id", 14012, "name", "紫金头盔", "lv", 120, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init17() {
data.map(
    14013, map("id", 14013, "name", "青霜头盔", "lv", 130, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14014, map("id", 14014, "name", "紫电头盔", "lv", 140, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14015, map("id", 14015, "name", "干将头盔", "lv", 150, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14016, map("id", 14016, "name", "莫邪头盔", "lv", 160, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    14100, map("id", 14100, "name", "御赐铁甲盔", "lv", 5, "kind", 1, "subKind", 5, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init18() {
data.map(
    15000, map("id", 15000, "name", "腰带", "lv", 1, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", false, "useMode", 0, "money", 1),
    15001, map("id", 15001, "name", "缎带", "lv", 10, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15002, map("id", 15002, "name", "镶翡翠银腰带", "lv", 20, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15003, map("id", 15003, "name", "东海水晶腰带", "lv", 30, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15004, map("id", 15004, "name", "凤冠腰带", "lv", 40, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init19() {
data.map(
    15005, map("id", 15005, "name", "金丝八宝腰带", "lv", 50, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15006, map("id", 15006, "name", "青蛇双绞戏珠带", "lv", 60, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15007, map("id", 15007, "name", "烈焰飞凤带", "lv", 70, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15008, map("id", 15008, "name", "紫霞乾坤带", "lv", 80, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15009, map("id", 15009, "name", "翡翠腰带", "lv", 90, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init20() {
data.map(
    15010, map("id", 15010, "name", "金碧腰带", "lv", 100, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15011, map("id", 15011, "name", "烈焰腰带", "lv", 110, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15012, map("id", 15012, "name", "紫金腰带", "lv", 120, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15013, map("id", 15013, "name", "青霜腰带", "lv", 130, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15014, map("id", 15014, "name", "紫电腰带", "lv", 140, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init21() {
data.map(
    15015, map("id", 15015, "name", "干将腰带", "lv", 150, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15016, map("id", 15016, "name", "莫邪腰带", "lv", 160, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    15100, map("id", 15100, "name", "御赐玄铁腰带", "lv", 5, "kind", 1, "subKind", 6, "acquirePathway", true, "pathway", list(104, 112), "pathwayKind", list(0, 0), "stack", false, "useMode", 0, "money", 1),
    20000, map("id", 20000, "name", "VIP1每日限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20001, map("id", 20001, "name", "VIP2每日限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init22() {
data.map(
    20002, map("id", 20002, "name", "VIP3每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20003, map("id", 20003, "name", "VIP4每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20004, map("id", 20004, "name", "VIP5每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20005, map("id", 20005, "name", "VIP6每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20006, map("id", 20006, "name", "VIP7每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init23() {
data.map(
    20007, map("id", 20007, "name", "VIP8每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20008, map("id", 20008, "name", "VIP9每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20009, map("id", 20009, "name", "VIP10每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20010, map("id", 20010, "name", "VIP11每周限购礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20011, map("id", 20011, "name", "VIP12特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init24() {
data.map(
    20012, map("id", 20012, "name", "VIP13特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20013, map("id", 20013, "name", "VIP14特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20014, map("id", 20014, "name", "VIP15特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20015, map("id", 20015, "name", "VIP16特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20016, map("id", 20016, "name", "VIP17特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init25() {
data.map(
    20017, map("id", 20017, "name", "VIP18特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20018, map("id", 20018, "name", "VIP19特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20019, map("id", 20019, "name", "VIP20特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20024, map("id", 20024, "name", "1级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20025, map("id", 20025, "name", "2级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init26() {
data.map(
    20026, map("id", 20026, "name", "3级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20027, map("id", 20027, "name", "4级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20028, map("id", 20028, "name", "5级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20029, map("id", 20029, "name", "6级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20030, map("id", 20030, "name", "7级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init27() {
data.map(
    20031, map("id", 20031, "name", "8级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20032, map("id", 20032, "name", "9级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20033, map("id", 20033, "name", "10级全部宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20034, map("id", 20034, "name", "1级鲜花包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20035, map("id", 20035, "name", "2级鲜花包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init28() {
data.map(
    20036, map("id", 20036, "name", "3级鲜花包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20037, map("id", 20037, "name", "1级装备包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20038, map("id", 20038, "name", "10级装备包", "lv", 10, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20039, map("id", 20039, "name", "20级装备包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20040, map("id", 20040, "name", "30级装备包", "lv", 30, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init29() {
data.map(
    20041, map("id", 20041, "name", "40级装备包", "lv", 40, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20042, map("id", 20042, "name", "50级装备包", "lv", 50, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20043, map("id", 20043, "name", "60级装备包", "lv", 60, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20044, map("id", 20044, "name", "70级装备包", "lv", 70, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20045, map("id", 20045, "name", "80级装备包", "lv", 80, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init30() {
data.map(
    20046, map("id", 20046, "name", "1级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20047, map("id", 20047, "name", "2级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    20048, map("id", 20048, "name", "3级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    20049, map("id", 20049, "name", "4级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    20050, map("id", 20050, "name", "5级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "systemNotice", true, "money", 1)
);
    }

    private static void init31() {
data.map(
    20051, map("id", 20051, "name", "6级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20052, map("id", 20052, "name", "7级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20053, map("id", 20053, "name", "8级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20054, map("id", 20054, "name", "9级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20055, map("id", 20055, "name", "10级宝石包", "lv", 20, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init32() {
data.map(
    20056, map("id", 20056, "name", "20级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20057, map("id", 20057, "name", "30级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20058, map("id", 20058, "name", "40级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20059, map("id", 20059, "name", "50级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20060, map("id", 20060, "name", "60级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init33() {
data.map(
    20061, map("id", 20061, "name", "70级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20062, map("id", 20062, "name", "80级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20063, map("id", 20063, "name", "装备材料包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20064, map("id", 20064, "name", "生产材料包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20065, map("id", 20065, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init34() {
data.map(
    20066, map("id", 20066, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20067, map("id", 20067, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20068, map("id", 20068, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20069, map("id", 20069, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20070, map("id", 20070, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init35() {
data.map(
    20071, map("id", 20071, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20072, map("id", 20072, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20073, map("id", 20073, "name", "礼单礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20074, map("id", 20074, "name", "礼单随机玉牌", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20075, map("id", 20075, "name", "礼单随机玉牌", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init36() {
data.map(
    20076, map("id", 20076, "name", "礼单随机玉牌", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20077, map("id", 20077, "name", "礼单随机玉牌", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20078, map("id", 20078, "name", "礼单随机玉牌", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20100, map("id", 20100, "name", "银两卡", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 1, "money", 1),
    20101, map("id", 20101, "name", "经验包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 1, "money", 1)
);
    }

    private static void init37() {
data.map(
    20102, map("id", 20102, "name", "元宝卡", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 1, "money", 1),
    20200, map("id", 20200, "name", "好友邀请礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20201, map("id", 20201, "name", "铲子", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 80, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1600),
    20202, map("id", 20202, "name", "爆竹", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 400),
    20203, map("id", 20203, "name", "炸药", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 80, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1600)
);
    }

    private static void init38() {
data.map(
    20204, map("id", 20204, "name", "锯子", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 400),
    20205, map("id", 20205, "name", "镰刀", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 5, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 100),
    20206, map("id", 20206, "name", "飘花令", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 134), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 400),
    20207, map("id", 20207, "name", "龙凤喜烛", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 20000),
    20208, map("id", 20208, "name", "剪刀", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(116, 112, 134), "pathwayKind", list(9, 0, 0), "stack", true, "useMode", 0, "money", 200)
);
    }

    private static void init39() {
data.map(
    20209, map("id", 20209, "name", "找对符", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20210, map("id", 20210, "name", "去错符", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20211, map("id", 20211, "name", "科举宝箱", "lv", 1, "kind", 2, "stack", false, "useMode", 2, "money", 1),
    20212, map("id", 20212, "name", "科举宝箱", "lv", 1, "kind", 2, "stack", false, "useMode", 2, "money", 1),
    20213, map("id", 20213, "name", "科举宝箱", "lv", 1, "kind", 2, "stack", false, "useMode", 2, "money", 1)
);
    }

    private static void init40() {
data.map(
    20214, map("id", 20214, "name", "刷宝令", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20215, map("id", 20215, "name", "打孔锥", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 12), "stack", true, "useMode", 0, "money", 400),
    20216, map("id", 20216, "name", "熔炼炉", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 12), "stack", true, "useMode", 0, "money", 400),
    20217, map("id", 20217, "name", "火把", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1000),
    20218, map("id", 20218, "name", "探宝令", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init41() {
data.map(
    20219, map("id", 20219, "name", "整点挂机令", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20220, map("id", 20220, "name", "农场宝箱", "lv", 52, "kind", 2, "stack", false, "useMode", 2, "money", 1),
    20221, map("id", 20221, "name", "科举宝箱（新）", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20300, map("id", 20300, "name", "普通化肥", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20301, map("id", 20301, "name", "高级化肥", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init42() {
data.map(
    20302, map("id", 20302, "name", "复合化肥", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20303, map("id", 20303, "name", "紫檀木", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 200),
    20304, map("id", 20304, "name", "金镶玉", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 40, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 800),
    20305, map("id", 20305, "name", "琉璃", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 70, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1400),
    20306, map("id", 20306, "name", "净化水", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 600)
);
    }

    private static void init43() {
data.map(
    20307, map("id", 20307, "name", "晋升卷轴", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1000),
    20308, map("id", 20308, "name", "连理枝果实", "lv", 1, "kind", 2, "stack", true, "useMode", 7, "money", 1),
    20309, map("id", 20309, "name", "阵旗", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 400),
    20400, map("id", 20400, "name", "观赏", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20401, map("id", 20401, "name", "奏折", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init44() {
data.map(
    20403, map("id", 20403, "name", "告发", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20404, map("id", 20404, "name", "猪头", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20405, map("id", 20405, "name", "单身汪", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20406, map("id", 20406, "name", "增加回归玩家数量", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20407, map("id", 20407, "name", "招亲道具", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 5, "stack", true, "useMode", 0, "money", 100)
);
    }

    private static void init45() {
data.map(
    20408, map("id", 20408, "name", "提亲道具", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400),
    20409, map("id", 20409, "name", "悔亲道具", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400),
    20410, map("id", 20410, "name", "招亲刷新道具", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 5, "stack", true, "useMode", 0, "money", 1),
    20411, map("id", 20411, "name", "补签符", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    20412, map("id", 20412, "name", "转动次数增加", "lv", 1, "kind", 17, "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init46() {
data.map(
    20413, map("id", 20413, "name", "下一次获得奖励双倍", "lv", 1, "kind", 17, "stack", true, "useMode", 0, "money", 1000),
    20501, map("id", 20501, "name", "皮鞭", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20502, map("id", 20502, "name", "细针", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20503, map("id", 20503, "name", "药酒", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000),
    20504, map("id", 20504, "name", "小人", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init47() {
data.map(
    20505, map("id", 20505, "name", "阵法残卷", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 2, "stack", true, "useMode", 0, "money", 40),
    20506, map("id", 20506, "name", "大赦天下礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20507, map("id", 20507, "name", "弹劾奏折", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 100, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(9, 0), "stack", true, "useMode", 0, "money", 2000),
    20600, map("id", 20600, "name", "青玉浮雕荷花如意", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20601, map("id", 20601, "name", "镶宝点翠珠钗", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500)
);
    }

    private static void init48() {
data.map(
    20602, map("id", 20602, "name", "红珊瑚雕花盆景", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20603, map("id", 20603, "name", "珐琅丹凤绘盖碗", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20604, map("id", 20604, "name", "玉质花熏玲珑", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20605, map("id", 20605, "name", "翡翠白菜", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20606, map("id", 20606, "name", "九玲珑宝塔", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500)
);
    }

    private static void init49() {
data.map(
    20607, map("id", 20607, "name", "夜明珠", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20608, map("id", 20608, "name", "红珊瑚如意", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20609, map("id", 20609, "name", "金缕衣", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 150, "acquirePathway", true, "pathway", list(190), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1500),
    20610, map("id", 20610, "name", "竹哨", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400),
    20611, map("id", 20611, "name", "牛奶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400)
);
    }

    private static void init50() {
data.map(
    20612, map("id", 20612, "name", "鲜肉", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400),
    20613, map("id", 20613, "name", "萝卜", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400),
    20614, map("id", 20614, "name", "大喇叭", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "systemNotice", true, "money", 400),
    20615, map("id", 20615, "name", "花瓶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 112, 134), "pathwayKind", list(9, 0, 0), "stack", true, "useMode", 0, "money", 400),
    20616, map("id", 20616, "name", "冰雪冷圆子", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "systemNotice", true, "money", 1)
);
    }

    private static void init51() {
data.map(
    20617, map("id", 20617, "name", "皇上礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20618, map("id", 20618, "name", "强盗随机礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20619, map("id", 20619, "name", "小钥匙", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20620, map("id", 20620, "name", "钓鱼宝箱", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20621, map("id", 20621, "name", "放大镜", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init52() {
data.map(
    20622, map("id", 20622, "name", "女王皮鞭", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20623, map("id", 20623, "name", "缤纷水果", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20624, map("id", 20624, "name", "驱逐令", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20625, map("id", 20625, "name", "六安茶", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20626, map("id", 20626, "name", "中级特技包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init53() {
data.map(
    20627, map("id", 20627, "name", "高级特技包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20628, map("id", 20628, "name", "大力金刚丸", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20629, map("id", 20629, "name", "玫瑰花瓣", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20630, map("id", 20630, "name", "唇唇欲动", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20631, map("id", 20631, "name", "跨服大喇叭", "lv", 20, "kind", 2, "stack", true, "useMode", 0, "systemNotice", true, "money", 1)
);
    }

    private static void init54() {
data.map(
    20632, map("id", 20632, "name", "子孙饽饽", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 80, "stack", true, "useMode", 0, "money", 1600),
    20633, map("id", 20633, "name", "皇子中级特技包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20634, map("id", 20634, "name", "皇子高级特技包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20635, map("id", 20635, "name", "皇子随机制造石", "lv", 12, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20636, map("id", 20636, "name", "照妖镜", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init55() {
data.map(
    20637, map("id", 20637, "name", "夜行眼罩", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20638, map("id", 20638, "name", "休书", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 10000),
    20639, map("id", 20639, "name", "协议书", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1000),
    20640, map("id", 20640, "name", "忍痛割爱", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 5, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 100),
    20641, map("id", 20641, "name", "锤子", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init56() {
data.map(
    20642, map("id", 20642, "name", "砖块", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20643, map("id", 20643, "name", "油漆", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20644, map("id", 20644, "name", "木板", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20645, map("id", 20645, "name", "钉子", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20646, map("id", 20646, "name", "冰块", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init57() {
data.map(
    20647, map("id", 20647, "name", "小虫", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20648, map("id", 20648, "name", "杂草", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 0, "money", 1),
    20649, map("id", 20649, "name", "福", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20650, map("id", 20650, "name", "黑土", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20651, map("id", 20651, "name", "金土", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init58() {
data.map(
    20652, map("id", 20652, "name", "灵谷塔令牌", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(9), "stack", true, "useMode", 2, "money", 1000),
    20653, map("id", 20653, "name", "红包道具", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20654, map("id", 20654, "name", "图鉴礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20655, map("id", 20655, "name", "绿苗", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20656, map("id", 20656, "name", "派系跨服赛胜利", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init59() {
data.map(
    20657, map("id", 20657, "name", "派系跨服赛失败", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20658, map("id", 20658, "name", "中级随机技能书", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20659, map("id", 20659, "name", "高级随机技能书", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20660, map("id", 20660, "name", "樱花", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20661, map("id", 20661, "name", "口谕", "lv", 19, "kind", 2, "acquirePathway", true, "pathway", list(112), "pathwayKind", list(0), "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init60() {
data.map(
    20662, map("id", 20662, "name", "米奇棒棒糖", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20663, map("id", 20663, "name", "江南瓦片", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20664, map("id", 20664, "name", "图腾面具", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1),
    20700, map("id", 20700, "name", "粽子", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    20800, map("id", 20800, "name", "武昌鱼", "lv", 1, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193, 194), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40)
);
    }

    private static void init61() {
data.map(
    20801, map("id", 20801, "name", "黄花鱼", "lv", 2, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193, 194), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 60),
    20802, map("id", 20802, "name", "青鱼", "lv", 1, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193, 194), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 80),
    20803, map("id", 20803, "name", "河蚌", "lv", 1, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193, 194), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20),
    20804, map("id", 20804, "name", "鳕鱼", "lv", 4, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    20805, map("id", 20805, "name", "闪电鳗鱼", "lv", 4, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2000)
);
    }

    private static void init62() {
data.map(
    20806, map("id", 20806, "name", "黑鱼", "lv", 4, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 3000),
    20807, map("id", 20807, "name", "木头", "lv", 1, "kind", 2, "subKind", 5, "acquirePathway", true, "pathway", list(193, 194), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20),
    20808, map("id", 20808, "name", "鲫鱼", "lv", 4, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1),
    20809, map("id", 20809, "name", "鳜鱼", "lv", 4, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1),
    20810, map("id", 20810, "name", "花鲢", "lv", 3, "kind", 2, "subKind", 3, "acquirePathway", true, "pathway", list(193, 194), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init63() {
data.map(
    20824, map("id", 20824, "name", "香菇", "lv", 1, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(194), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    20825, map("id", 20825, "name", "豆腐", "lv", 2, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(194), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    20826, map("id", 20826, "name", "鸡蛋", "lv", 1, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(194), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    20827, map("id", 20827, "name", "猪肉", "lv", 2, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(194, 112), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1),
    20828, map("id", 20828, "name", "鸡肉", "lv", 2, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(194, 112), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init64() {
data.map(
    20829, map("id", 20829, "name", "鹅肉", "lv", 1, "kind", 2, "subKind", 2, "acquirePathway", true, "pathway", list(194, 112), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1),
    20830, map("id", 20830, "name", "鸭肉", "lv", 1, "kind", 2, "subKind", 2, "acquirePathway", true, "pathway", list(194, 112), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1),
    20831, map("id", 20831, "name", "黑木耳", "lv", 3, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(194), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    20832, map("id", 20832, "name", "油", "lv", 1, "kind", 2, "subKind", 4, "acquirePathway", true, "stack", true, "useMode", 0, "money", 1),
    20833, map("id", 20833, "name", "盐", "lv", 1, "kind", 2, "subKind", 4, "acquirePathway", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init65() {
data.map(
    20834, map("id", 20834, "name", "酱", "lv", 1, "kind", 2, "subKind", 4, "acquirePathway", true, "stack", true, "useMode", 0, "money", 1),
    20835, map("id", 20835, "name", "醋", "lv", 1, "kind", 2, "subKind", 4, "acquirePathway", true, "stack", true, "useMode", 0, "money", 1),
    20836, map("id", 20836, "name", "糖", "lv", 1, "kind", 2, "subKind", 4, "acquirePathway", true, "stack", true, "useMode", 0, "money", 1),
    20837, map("id", 20837, "name", "鱼塘淤泥", "lv", 1, "kind", 2, "subKind", 5, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 1),
    20838, map("id", 20838, "name", "面粉", "lv", 4, "kind", 2, "subKind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(194), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init66() {
data.map(
    20839, map("id", 20839, "name", "养殖场粪便", "lv", 52, "kind", 2, "subKind", 5, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 1),
    20900, map("id", 20900, "name", "香菇青菜", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 2000),
    20901, map("id", 20901, "name", "青椒土豆丝", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 500),
    20902, map("id", 20902, "name", "鲫鱼豆腐汤", "lv", 56, "kind", 2, "subKind", 1, "stack", true, "useMode", 9, "money", 8000),
    20903, map("id", 20903, "name", "番茄炒鸡蛋", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 2000)
);
    }

    private static void init67() {
data.map(
    20904, map("id", 20904, "name", "酸辣白菜", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 2000),
    20905, map("id", 20905, "name", "徽州毛豆腐", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 0, "money", 2000),
    20906, map("id", 20906, "name", "黄瓜酿肉", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 4000),
    20907, map("id", 20907, "name", "松鼠鳜鱼", "lv", 56, "kind", 2, "subKind", 1, "stack", true, "useMode", 9, "money", 8000),
    20908, map("id", 20908, "name", "糖醋排骨", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 4000)
);
    }

    private static void init68() {
data.map(
    20909, map("id", 20909, "name", "地三鲜", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 4000),
    20910, map("id", 20910, "name", "麻婆豆腐", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 4000),
    20911, map("id", 20911, "name", "香菇炖鸡", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 4000),
    20912, map("id", 20912, "name", "剁椒鱼头", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 6000),
    20913, map("id", 20913, "name", "宫保鸡丁", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 6000)
);
    }

    private static void init69() {
data.map(
    20914, map("id", 20914, "name", "深井烧鹅", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 0, "money", 6000),
    20915, map("id", 20915, "name", "北京烤鸭", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 0, "money", 6000),
    20916, map("id", 20916, "name", "鱼香肉丝", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 6000),
    20917, map("id", 20917, "name", "清蒸武昌鱼", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 2000),
    20918, map("id", 20918, "name", "碳烤蚌仔", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 2000)
);
    }

    private static void init70() {
data.map(
    20919, map("id", 20919, "name", "红烧黄花鱼", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 4000),
    20920, map("id", 20920, "name", "茄汁青鱼", "lv", 52, "kind", 2, "subKind", 1, "stack", true, "useMode", 8, "money", 6000),
    20921, map("id", 20921, "name", "油炸鳕鱼条", "lv", 56, "kind", 2, "subKind", 1, "stack", true, "useMode", 9, "money", 8000),
    20922, map("id", 20922, "name", "日式鳗鱼", "lv", 56, "kind", 2, "subKind", 1, "stack", true, "useMode", 9, "money", 8000),
    20923, map("id", 20923, "name", "葱油黑鱼片", "lv", 56, "kind", 2, "subKind", 1, "stack", true, "useMode", 9, "money", 8000)
);
    }

    private static void init71() {
data.map(
    21000, map("id", 21000, "name", "男扮女装卡", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    21001, map("id", 21001, "name", "女扮男装卡", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22000, map("id", 22000, "name", "面圣礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22001, map("id", 22001, "name", "赐婚大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22002, map("id", 22002, "name", "赤金檀木宝箱", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init72() {
data.map(
    22003, map("id", 22003, "name", "古阵探宝1", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22004, map("id", 22004, "name", "古阵探宝2", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22005, map("id", 22005, "name", "古阵探宝3", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22006, map("id", 22006, "name", "古阵探宝4", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22007, map("id", 22007, "name", "古阵探宝5", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init73() {
data.map(
    22008, map("id", 22008, "name", "古阵探宝6", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22009, map("id", 22009, "name", "古阵探宝7", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22010, map("id", 22010, "name", "古阵探宝8", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22011, map("id", 22011, "name", "古阵探宝9", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22012, map("id", 22012, "name", "古阵探宝10", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init74() {
data.map(
    22013, map("id", 22013, "name", "古阵探宝11", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22014, map("id", 22014, "name", "清除道具包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22015, map("id", 22015, "name", "首充礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22016, map("id", 22016, "name", "阵法礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22017, map("id", 22017, "name", "鲜花随机礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init75() {
data.map(
    22018, map("id", 22018, "name", "随机进贡物品礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22019, map("id", 22019, "name", "清除工具随机包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22020, map("id", 22020, "name", "官品互动道具包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22021, map("id", 22021, "name", "10级图纸包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22022, map("id", 22022, "name", "10000两银两包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init76() {
data.map(
    22023, map("id", 22023, "name", "20000两银两包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    22024, map("id", 22024, "name", "1000内丹", "lv", 25, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    22025, map("id", 22025, "name", "100内丹", "lv", 25, "kind", 2, "checkBagSize", false, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 2, "money", 1),
    22026, map("id", 22026, "name", "10内丹", "lv", 25, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    22027, map("id", 22027, "name", "1000两银两包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init77() {
data.map(
    22028, map("id", 22028, "name", "3000两银两包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    22029, map("id", 22029, "name", "5000两银两包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    22030, map("id", 22030, "name", "1000金砖", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    22031, map("id", 22031, "name", "100金砖", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    22032, map("id", 22032, "name", "好友邀请", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init78() {
data.map(
    22033, map("id", 22033, "name", "好友邀请", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22034, map("id", 22034, "name", "好友邀请", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22035, map("id", 22035, "name", "好友邀请", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22036, map("id", 22036, "name", "成长之路", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22037, map("id", 22037, "name", "成长之路", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init79() {
data.map(
    22038, map("id", 22038, "name", "成长之路", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22039, map("id", 22039, "name", "10装备碎片", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    22040, map("id", 22040, "name", "雨露均沾", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22041, map("id", 22041, "name", "雨露均沾", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22042, map("id", 22042, "name", "雨露均沾", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init80() {
data.map(
    22043, map("id", 22043, "name", "强化石礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22044, map("id", 22044, "name", "角色改名卡", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22045, map("id", 22045, "name", "派系改名卡", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22046, map("id", 22046, "name", "新手引导员", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22047, map("id", 22047, "name", "30元礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init81() {
data.map(
    22048, map("id", 22048, "name", "随机奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22049, map("id", 22049, "name", "随机奖励1", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22050, map("id", 22050, "name", "随机奖励2", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22051, map("id", 22051, "name", "随机奖励3", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22052, map("id", 22052, "name", "30元精美时装", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init82() {
data.map(
    22053, map("id", 22053, "name", "主题建筑随机包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    22100, map("id", 22100, "name", "我", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22101, map("id", 22101, "name", "的", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22102, map("id", 22102, "name", "宫", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22103, map("id", 22103, "name", "廷", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000)
);
    }

    private static void init83() {
data.map(
    22104, map("id", 22104, "name", "一", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22105, map("id", 22105, "name", "周", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22106, map("id", 22106, "name", "年", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22107, map("id", 22107, "name", "快", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22108, map("id", 22108, "name", "乐", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000)
);
    }

    private static void init84() {
data.map(
    22109, map("id", 22109, "name", "浪", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22110, map("id", 22110, "name", "漫", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22111, map("id", 22111, "name", "七", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22112, map("id", 22112, "name", "夕", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22113, map("id", 22113, "name", "乞", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init85() {
data.map(
    22114, map("id", 22114, "name", "巧", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22115, map("id", 22115, "name", "弄", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 1000),
    22116, map("id", 22116, "name", "月", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22117, map("id", 22117, "name", "教", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22118, map("id", 22118, "name", "师", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000)
);
    }

    private static void init86() {
data.map(
    22119, map("id", 22119, "name", "节", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22120, map("id", 22120, "name", "快", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22121, map("id", 22121, "name", "乐", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22122, map("id", 22122, "name", "我", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22123, map("id", 22123, "name", "的", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000)
);
    }

    private static void init87() {
data.map(
    22124, map("id", 22124, "name", "宫", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22125, map("id", 22125, "name", "廷", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22126, map("id", 22126, "name", "欢", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22127, map("id", 22127, "name", "度", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    22128, map("id", 22128, "name", "国", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000)
);
    }

    private static void init88() {
data.map(
    22129, map("id", 22129, "name", "庆", "lv", 1, "kind", 2, "stack", true, "useMode", 0, "money", 2000),
    23000, map("id", 23000, "name", "第一章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23001, map("id", 23001, "name", "第一章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23002, map("id", 23002, "name", "第二章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23003, map("id", 23003, "name", "第二章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init89() {
data.map(
    23004, map("id", 23004, "name", "第三章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23005, map("id", 23005, "name", "第三章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23006, map("id", 23006, "name", "第四章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23007, map("id", 23007, "name", "第四章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23008, map("id", 23008, "name", "第五章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init90() {
data.map(
    23009, map("id", 23009, "name", "第五章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23010, map("id", 23010, "name", "第六章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23011, map("id", 23011, "name", "第六章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23012, map("id", 23012, "name", "第七章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23013, map("id", 23013, "name", "第七章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init91() {
data.map(
    23014, map("id", 23014, "name", "第八章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23015, map("id", 23015, "name", "第八章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23016, map("id", 23016, "name", "第九章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23017, map("id", 23017, "name", "第九章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23018, map("id", 23018, "name", "第十章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init92() {
data.map(
    23019, map("id", 23019, "name", "第十章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23020, map("id", 23020, "name", "第十一章普通通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    23021, map("id", 23021, "name", "第十一章精英通关奖励", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24000, map("id", 24000, "name", "新手礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24001, map("id", 24001, "name", "豪华礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init93() {
data.map(
    24002, map("id", 24002, "name", "特权礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24003, map("id", 24003, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24004, map("id", 24004, "name", "特权福利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24005, map("id", 24005, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24006, map("id", 24006, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init94() {
data.map(
    24007, map("id", 24007, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24008, map("id", 24008, "name", "微信礼包码", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24009, map("id", 24009, "name", "微信礼包码", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24100, map("id", 24100, "name", "初级随机建筑包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1),
    24101, map("id", 24101, "name", "中级随机建筑包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init95() {
data.map(
    24102, map("id", 24102, "name", "高级随机建筑包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    24103, map("id", 24103, "name", "水上随机建筑包", "lv", 1, "kind", 2, "checkBagSize", false, "stack", true, "useMode", 2, "systemNotice", true, "money", 1),
    24104, map("id", 24104, "name", "微信礼包第一期", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24105, map("id", 24105, "name", "微信礼包第二期", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24106, map("id", 24106, "name", "微信礼包第三期", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init96() {
data.map(
    24107, map("id", 24107, "name", "微信礼包第四期", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24108, map("id", 24108, "name", "微信礼包第五期", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24109, map("id", 24109, "name", "浓情礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24110, map("id", 24110, "name", "评论大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24111, map("id", 24111, "name", "评论大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init97() {
data.map(
    24112, map("id", 24112, "name", "月饼礼盒", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24113, map("id", 24113, "name", "资质丹随机包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24114, map("id", 24114, "name", "皇子技能残卷", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 1, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(11), "stack", true, "useMode", 0, "money", 1),
    24115, map("id", 24115, "name", "结婚互动随机包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24116, map("id", 24116, "name", "国庆礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init98() {
data.map(
    24117, map("id", 24117, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24118, map("id", 24118, "name", "五星评论礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24119, map("id", 24119, "name", "万圣节礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24120, map("id", 24120, "name", "光棍节贴吧礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24121, map("id", 24121, "name", "单身贵族礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init99() {
data.map(
    24122, map("id", 24122, "name", "感恩节银两包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24123, map("id", 24123, "name", "感恩节元宝包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24124, map("id", 24124, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24125, map("id", 24125, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24126, map("id", 24126, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init100() {
data.map(
    24127, map("id", 24127, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24128, map("id", 24128, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24129, map("id", 24129, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24130, map("id", 24130, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24131, map("id", 24131, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init101() {
data.map(
    24132, map("id", 24132, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24133, map("id", 24133, "name", "QQ群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24134, map("id", 24134, "name", "微信群礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24135, map("id", 24135, "name", "微信福利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24136, map("id", 24136, "name", "微信福利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init102() {
data.map(
    24137, map("id", 24137, "name", "微信福利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24138, map("id", 24138, "name", "新年礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24139, map("id", 24139, "name", "QQ礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24140, map("id", 24140, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24141, map("id", 24141, "name", "QQ礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init103() {
data.map(
    24142, map("id", 24142, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24143, map("id", 24143, "name", "QQ礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24144, map("id", 24144, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24145, map("id", 24145, "name", "微信福利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24146, map("id", 24146, "name", "媒体礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init104() {
data.map(
    24147, map("id", 24147, "name", "微信福利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24148, map("id", 24148, "name", "愚你同乐", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24149, map("id", 24149, "name", "QQ礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24150, map("id", 24150, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24151, map("id", 24151, "name", "VIP8尊享大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init105() {
data.map(
    24152, map("id", 24152, "name", "QQ礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24153, map("id", 24153, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24154, map("id", 24154, "name", "入宫大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24155, map("id", 24155, "name", "贵人大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24156, map("id", 24156, "name", "嫔妃大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init106() {
data.map(
    24157, map("id", 24157, "name", "帝皇大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24158, map("id", 24158, "name", "预约礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24159, map("id", 24159, "name", "实名认证礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24160, map("id", 24160, "name", "QQ礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24161, map("id", 24161, "name", "微信礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init107() {
data.map(
    24162, map("id", 24162, "name", "五星评论礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24163, map("id", 24163, "name", "跨服派系战胜利礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24164, map("id", 24164, "name", "跨服派系战失败礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24165, map("id", 24165, "name", "政务礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24166, map("id", 24166, "name", "安卓预约礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init108() {
data.map(
    24167, map("id", 24167, "name", "活跃度大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24168, map("id", 24168, "name", "秀女大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24169, map("id", 24169, "name", "昭训大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24170, map("id", 24170, "name", "美人大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24171, map("id", 24171, "name", "贵妃大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init109() {
data.map(
    24172, map("id", 24172, "name", "王者大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24173, map("id", 24173, "name", "帝后大礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24174, map("id", 24174, "name", "豪气冲天礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24175, map("id", 24175, "name", "天地良心礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24176, map("id", 24176, "name", "指导员绩效福利", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init110() {
data.map(
    24177, map("id", 24177, "name", "七夕集字宝箱", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24178, map("id", 24178, "name", "紫色才能随机包", "lv", 39, "kind", 2, "subKind", 6, "stack", true, "useMode", 2, "money", 1),
    24179, map("id", 24179, "name", "橙色才能随机包", "lv", 39, "kind", 2, "subKind", 6, "stack", true, "useMode", 2, "money", 1),
    24180, map("id", 24180, "name", "教师节集字包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1),
    24181, map("id", 24181, "name", "累计签到5天礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 10000)
);
    }

    private static void init111() {
data.map(
    24182, map("id", 24182, "name", "累计签到10天礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 20000),
    24183, map("id", 24183, "name", "累计签到15天礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 30000),
    24184, map("id", 24184, "name", "累计签到20天礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 40000),
    24185, map("id", 24185, "name", "累计签到25天礼包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 50000),
    24186, map("id", 24186, "name", "欢度国庆集字包", "lv", 1, "kind", 2, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init112() {
data.map(
    25000, map("id", 25000, "name", "精力资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 20017),
    25001, map("id", 25001, "name", "物攻资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 22017),
    25002, map("id", 25002, "name", "法攻资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 23017),
    25003, map("id", 25003, "name", "物防资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 24017),
    25004, map("id", 25004, "name", "法防资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 25017)
);
    }

    private static void init113() {
data.map(
    25005, map("id", 25005, "name", "速度资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 26017),
    25006, map("id", 25006, "name", "气力资质丹", "lv", 1, "kind", 13, "stack", true, "useMode", 0, "money", 1, "effectPropId", 21017),
    25100, map("id", 25100, "name", "资质洗练丹", "lv", 1, "kind", 13, "stack", true, "useMode", 1, "money", 1),
    25200, map("id", 25200, "name", "银铃项圈", "lv", 30, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1),
    25201, map("id", 25201, "name", "长命金锁项圈", "lv", 50, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init114() {
data.map(
    25202, map("id", 25202, "name", "玉牌锁项圈", "lv", 70, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1),
    25203, map("id", 25203, "name", "赤炎项圈", "lv", 90, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1),
    25204, map("id", 25204, "name", "如意项圈", "lv", 110, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1),
    25205, map("id", 25205, "name", "乾坤项圈", "lv", 130, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1),
    25206, map("id", 25206, "name", "月光项圈", "lv", 150, "kind", 1, "subKind", 7, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init115() {
data.map(
    25300, map("id", 25300, "name", "银丝缠花对镯", "lv", 30, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1),
    25301, map("id", 25301, "name", "福珠掐金对镯", "lv", 50, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1),
    25302, map("id", 25302, "name", "蓝田玉对镯", "lv", 70, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1),
    25303, map("id", 25303, "name", "赤炎对镯", "lv", 90, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1),
    25304, map("id", 25304, "name", "如意对镯", "lv", 110, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init116() {
data.map(
    25305, map("id", 25305, "name", "乾坤对镯", "lv", 130, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1),
    25306, map("id", 25306, "name", "月光对镯", "lv", 150, "kind", 1, "subKind", 8, "stack", false, "useMode", 0, "money", 1),
    25400, map("id", 25400, "name", "玛瑙团寿纹腰链", "lv", 30, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1),
    25401, map("id", 25401, "name", "百金环扣腰链", "lv", 50, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1),
    25402, map("id", 25402, "name", "翠玉叠环扣腰链", "lv", 70, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init117() {
data.map(
    25403, map("id", 25403, "name", "赤炎腰链", "lv", 90, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1),
    25404, map("id", 25404, "name", "如意腰链", "lv", 110, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1),
    25405, map("id", 25405, "name", "乾坤腰链", "lv", 130, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1),
    25406, map("id", 25406, "name", "月光腰链", "lv", 150, "kind", 1, "subKind", 9, "stack", false, "useMode", 0, "money", 1),
    26000, map("id", 26000, "name", "皇子1000经验书", "lv", 1, "kind", 13, "stack", true, "useMode", 3, "money", 1, "effectPropId", 1000)
);
    }

    private static void init118() {
data.map(
    26001, map("id", 26001, "name", "皇子10000经验书", "lv", 1, "kind", 13, "stack", true, "useMode", 3, "money", 1, "effectPropId", 10000),
    26002, map("id", 26002, "name", "皇子50000经验书", "lv", 1, "kind", 13, "stack", true, "useMode", 3, "money", 1, "effectPropId", 50000),
    27000, map("id", 27000, "name", "1级连理枝果实", "lv", 18, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27001, map("id", 27001, "name", "2级连理枝果实", "lv", 23, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27002, map("id", 27002, "name", "3级连理枝果实", "lv", 28, "kind", 0, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init119() {
data.map(
    27003, map("id", 27003, "name", "4级连理枝果实", "lv", 33, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27004, map("id", 27004, "name", "5级连理枝果实", "lv", 38, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27005, map("id", 27005, "name", "6级连理枝果实", "lv", 43, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27006, map("id", 27006, "name", "7级连理枝果实", "lv", 48, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27007, map("id", 27007, "name", "8级连理枝果实", "lv", 53, "kind", 0, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init120() {
data.map(
    27008, map("id", 27008, "name", "9级连理枝果实", "lv", 58, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    27009, map("id", 27009, "name", "10级连理枝果实", "lv", 63, "kind", 0, "stack", true, "useMode", 0, "money", 1),
    30000, map("id", 30000, "name", "白玉燕", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 100, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2000),
    30001, map("id", 30001, "name", "玲珑羽佩", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 125, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2500),
    30002, map("id", 30002, "name", "母仪天下", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 450, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 9000)
);
    }

    private static void init121() {
data.map(
    30003, map("id", 30003, "name", "蓝宝石羽扇手链", "lv", 1, "kind", 3, "subKind", 6, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    30004, map("id", 30004, "name", "女皇·冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    30005, map("id", 30005, "name", "女帝", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    30006, map("id", 30006, "name", "凤飞九天", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    30007, map("id", 30007, "name", "魔女犄角", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init122() {
data.map(
    30008, map("id", 30008, "name", "单身汪发带（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30009, map("id", 30009, "name", "新禧发饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30010, map("id", 30010, "name", "南笙发饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30011, map("id", 30011, "name", "桃花灼灼纱（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30012, map("id", 30012, "name", "云巅发饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init123() {
data.map(
    30013, map("id", 30013, "name", "谷雨发饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30014, map("id", 30014, "name", "春晖发饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30015, map("id", 30015, "name", "烟粉头饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30016, map("id", 30016, "name", "绝色倾城头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30017, map("id", 30017, "name", "铄金磐石头饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init124() {
data.map(
    30018, map("id", 30018, "name", "魔灵头饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30019, map("id", 30019, "name", "碧笠青荷头饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30020, map("id", 30020, "name", "湛海墨森头饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30021, map("id", 30021, "name", "炽焰寒冰头饰（女）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30022, map("id", 30022, "name", "魔力嘉年华头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init125() {
data.map(
    30023, map("id", 30023, "name", "海洋之星头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30024, map("id", 30024, "name", "素绾青丝头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30025, map("id", 30025, "name", "楚乔簪花", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30026, map("id", 30026, "name", "小学妹发夹", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30500, map("id", 30500, "name", "温婉", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init126() {
data.map(
    30501, map("id", 30501, "name", "姗姗来迟", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    30502, map("id", 30502, "name", "金叶钗·姗姗来迟", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 75, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1500),
    30503, map("id", 30503, "name", "云髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 125, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2500),
    30504, map("id", 30504, "name", "编发云髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 200, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4000),
    30505, map("id", 30505, "name", "西施浣纱", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 650, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 13000)
);
    }

    private static void init127() {
data.map(
    30506, map("id", 30506, "name", "芸娘髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 125, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2500),
    30507, map("id", 30507, "name", "金步摇", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 250, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 5000),
    30508, map("id", 30508, "name", "日式粉结束发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 75, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1500),
    30509, map("id", 30509, "name", "日式艺伎髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 10000),
    30510, map("id", 30510, "name", "绿雪含芳编发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 125, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2500)
);
    }

    private static void init128() {
data.map(
    30511, map("id", 30511, "name", "玲珑点翠镶珠拉翅", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 250, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 5000),
    30512, map("id", 30512, "name", "景福长绵小旗头", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 125, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2500),
    30513, map("id", 30513, "name", "镶宝石鎏金双簪髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 450, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 9000),
    30514, map("id", 30514, "name", "九凤绕珠赤金缠丝髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 12000),
    30515, map("id", 30515, "name", "簪花倭坠髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 125, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2500)
);
    }

    private static void init129() {
data.map(
    30516, map("id", 30516, "name", "瑛珠垂挂髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 75, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1500),
    30517, map("id", 30517, "name", "情窦初开", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 75, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1500),
    30518, map("id", 30518, "name", "簪花两把头", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 250, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 5000),
    30519, map("id", 30519, "name", "小家碧玉", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 250, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 5000),
    30520, map("id", 30520, "name", "金簪碧螺", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 450, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 9000)
);
    }

    private static void init130() {
data.map(
    30521, map("id", 30521, "name", "芙蓉出水", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 12000),
    30522, map("id", 30522, "name", "人鱼之泪", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 900, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 18000),
    30523, map("id", 30523, "name", "西域舞娘", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 16000),
    30524, map("id", 30524, "name", "梦回大唐", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 540, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 10800),
    30525, map("id", 30525, "name", "梦回大唐·稀有", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 900, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 18000)
);
    }

    private static void init131() {
data.map(
    30526, map("id", 30526, "name", "大金公主", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    30527, map("id", 30527, "name", "女皇·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    30528, map("id", 30528, "name", "织女·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30529, map("id", 30529, "name", "嫦娥·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30530, map("id", 30530, "name", "中国红·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init132() {
data.map(
    30531, map("id", 30531, "name", "魔女发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30532, map("id", 30532, "name", "英姿飒爽·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30533, map("id", 30533, "name", "单身汪发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30534, map("id", 30534, "name", "天使编发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30535, map("id", 30535, "name", "未央发冠", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init133() {
data.map(
    30536, map("id", 30536, "name", "雪女发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30537, map("id", 30537, "name", "新禧发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30538, map("id", 30538, "name", "新春发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30539, map("id", 30539, "name", "小财神发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30540, map("id", 30540, "name", "南笙发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init134() {
data.map(
    30541, map("id", 30541, "name", "桃花灼灼髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30542, map("id", 30542, "name", "白浅发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30543, map("id", 30543, "name", "凤九发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30544, map("id", 30544, "name", "初春发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30545, map("id", 30545, "name", "夜魅白发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init135() {
data.map(
    30546, map("id", 30546, "name", "云巅发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30547, map("id", 30547, "name", "谷雨秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30548, map("id", 30548, "name", "白落秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30549, map("id", 30549, "name", "春晖发髻（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30550, map("id", 30550, "name", "童心未泯秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init136() {
data.map(
    30551, map("id", 30551, "name", "汨罗秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30552, map("id", 30552, "name", "烟粉秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30553, map("id", 30553, "name", "绝色倾城秀发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30554, map("id", 30554, "name", "铄金磐石秀发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30555, map("id", 30555, "name", "魔灵秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init137() {
data.map(
    30556, map("id", 30556, "name", "碧笠青荷秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30557, map("id", 30557, "name", "湛海墨森秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30558, map("id", 30558, "name", "炽焰寒冰秀发（女）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30559, map("id", 30559, "name", "魔力嘉年华秀发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30560, map("id", 30560, "name", "海洋之星秀发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init138() {
data.map(
    30561, map("id", 30561, "name", "素绾青丝秀发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30562, map("id", 30562, "name", "紫霞仙子坠髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30563, map("id", 30563, "name", "楚乔发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30564, map("id", 30564, "name", "小学妹编发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    30565, map("id", 30565, "name", "丽姬发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init139() {
data.map(
    30566, map("id", 30566, "name", "花开月圆发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 0, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1),
    31000, map("id", 31000, "name", "鹅黄锦带轻罗百合裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 130, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2600),
    31001, map("id", 31001, "name", "白锦乳纱抹胸", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 130, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2600),
    31002, map("id", 31002, "name", "珍珠璎珞轻罗百合裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    31003, map("id", 31003, "name", "花开富贵小五福", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init140() {
data.map(
    31004, map("id", 31004, "name", "白无垢和色打褂", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 1000),
    31005, map("id", 31005, "name", "弱水三千", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    31006, map("id", 31006, "name", "阳春白雪", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1290, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 25800),
    31007, map("id", 31007, "name", "夜魅", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    31008, map("id", 31008, "name", "蒙古公主", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200)
);
    }

    private static void init141() {
data.map(
    31009, map("id", 31009, "name", "月白色蜀锦旗袍裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    31010, map("id", 31010, "name", "春桃报喜万福旗袍裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    31011, map("id", 31011, "name", "明黄花锦吉服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    31012, map("id", 31012, "name", "紫霞仙子", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    31013, map("id", 31013, "name", "灿金棉褂吉服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1030, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20600)
);
    }

    private static void init142() {
data.map(
    31014, map("id", 31014, "name", "九天玄女", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1290, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 25800),
    31015, map("id", 31015, "name", "轻纱碧罗裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 16000),
    31016, map("id", 31016, "name", "金丝雀白羽衣", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 16000),
    31017, map("id", 31017, "name", "西域公主", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 16000),
    31018, map("id", 31018, "name", "洒金蝉翼轻纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 16000)
);
    }

    private static void init143() {
data.map(
    31019, map("id", 31019, "name", "女皇·凤袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31020, map("id", 31020, "name", "织女·云纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31021, map("id", 31021, "name", "嫦娥·留仙裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31022, map("id", 31022, "name", "中国红·吉服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31023, map("id", 31023, "name", "魔女裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init144() {
data.map(
    31024, map("id", 31024, "name", "英姿飒爽·战袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31025, map("id", 31025, "name", "单身汪裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31026, map("id", 31026, "name", "天使薄纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31027, map("id", 31027, "name", "未央紫粉罗裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31028, map("id", 31028, "name", "雪女纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init145() {
data.map(
    31029, map("id", 31029, "name", "新禧锦服（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31030, map("id", 31030, "name", "新春纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31031, map("id", 31031, "name", "小财神纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31032, map("id", 31032, "name", "南笙罗裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31033, map("id", 31033, "name", "桃花灼灼裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init146() {
data.map(
    31034, map("id", 31034, "name", "白浅留仙裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31035, map("id", 31035, "name", "凤九纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31036, map("id", 31036, "name", "初春纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31037, map("id", 31037, "name", "夜魅纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31038, map("id", 31038, "name", "云巅纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init147() {
data.map(
    31039, map("id", 31039, "name", "谷雨纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31040, map("id", 31040, "name", "白落纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31041, map("id", 31041, "name", "春晖纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31042, map("id", 31042, "name", "童心未泯纱裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31043, map("id", 31043, "name", "汨罗羽裳（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init148() {
data.map(
    31044, map("id", 31044, "name", "烟粉罗裙（女）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31045, map("id", 31045, "name", "绝色倾城烟纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31046, map("id", 31046, "name", "铄金磐石纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31047, map("id", 31047, "name", "魔灵纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31048, map("id", 31048, "name", "碧笠青荷纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init149() {
data.map(
    31049, map("id", 31049, "name", "湛海墨森纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31050, map("id", 31050, "name", "炽焰寒冰纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31051, map("id", 31051, "name", "魔力嘉年华纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31052, map("id", 31052, "name", "海洋之星纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31053, map("id", 31053, "name", "素绾青丝纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init150() {
data.map(
    31054, map("id", 31054, "name", "紫霞仙子留仙裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31055, map("id", 31055, "name", "楚乔软甲", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31056, map("id", 31056, "name", "小学妹校服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31057, map("id", 31057, "name", "丽姬华服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000),
    31058, map("id", 31058, "name", "花开月圆华服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init151() {
data.map(
    31500, map("id", 31500, "name", "鎏金翡翠珠耳串", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    31501, map("id", 31501, "name", "莹玉金穗耳串", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    31502, map("id", 31502, "name", "金宝耳串", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    31503, map("id", 31503, "name", "南洋珍珠耳串", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    31504, map("id", 31504, "name", "蜜花色镂空耳串", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init152() {
data.map(
    31505, map("id", 31505, "name", "赤金脚链", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 760, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 15200),
    31506, map("id", 31506, "name", "星空", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31507, map("id", 31507, "name", "海洋之心", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31508, map("id", 31508, "name", "太阳之女", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31509, map("id", 31509, "name", "捧花", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init153() {
data.map(
    31510, map("id", 31510, "name", "蝶恋花·手链", "lv", 1, "kind", 3, "subKind", 6, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31511, map("id", 31511, "name", "蝶恋花·项链", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31512, map("id", 31512, "name", "女皇·耳坠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31513, map("id", 31513, "name", "女皇·项链", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31514, map("id", 31514, "name", "女皇·腰封", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init154() {
data.map(
    31515, map("id", 31515, "name", "织女·紫珠耳坠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31516, map("id", 31516, "name", "织女·面纱", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31517, map("id", 31517, "name", "织女·星光项链", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31518, map("id", 31518, "name", "嫦娥·蝶恋花", "lv", 1, "kind", 3, "subKind", 6, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31519, map("id", 31519, "name", "嫦娥·玉宫项圈", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init155() {
data.map(
    31520, map("id", 31520, "name", "嫦娥·流星耳坠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31521, map("id", 31521, "name", "嫦娥·飘纱", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31522, map("id", 31522, "name", "嫦娥·荷花灯", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31523, map("id", 31523, "name", "中国红·耳坠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31524, map("id", 31524, "name", "魔女耳饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init156() {
data.map(
    31525, map("id", 31525, "name", "魔女灯笼", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31526, map("id", 31526, "name", "魔女伞", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31527, map("id", 31527, "name", "英姿飒爽·耳饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31528, map("id", 31528, "name", "英姿飒爽·腰饰", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31529, map("id", 31529, "name", "单身汪耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init157() {
data.map(
    31530, map("id", 31530, "name", "单身汪飘花（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31531, map("id", 31531, "name", "单身汪宠物（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31532, map("id", 31532, "name", "天使饰品（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31533, map("id", 31533, "name", "天使翅膀（女）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31534, map("id", 31534, "name", "天使南瓜灯（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init158() {
data.map(
    31535, map("id", 31535, "name", "未央珊瑚珠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31536, map("id", 31536, "name", "雪女项链", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31537, map("id", 31537, "name", "雪女灯笼", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31538, map("id", 31538, "name", "雪女宠物麋鹿", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31539, map("id", 31539, "name", "雪女雪花背景", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init159() {
data.map(
    31540, map("id", 31540, "name", "雪女皮草大氅", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31541, map("id", 31541, "name", "新禧烟斗（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31542, map("id", 31542, "name", "新禧纸伞（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31543, map("id", 31543, "name", "新禧装饰（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31544, map("id", 31544, "name", "新春耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init160() {
data.map(
    31545, map("id", 31545, "name", "新春金鸡（女）", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31547, map("id", 31547, "name", "小财神飘纱（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31548, map("id", 31548, "name", "小财神手持（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31549, map("id", 31549, "name", "桃花灼灼扇（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31550, map("id", 31550, "name", "白浅耳坠（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init161() {
data.map(
    31551, map("id", 31551, "name", "小黑蛇（女）", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31552, map("id", 31552, "name", "凤九脚链（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 14000),
    31553, map("id", 31553, "name", "九尾狐尾（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31554, map("id", 31554, "name", "初春桃花（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31555, map("id", 31555, "name", "夜魅耳坠（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init162() {
data.map(
    31556, map("id", 31556, "name", "夜魅项链（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31557, map("id", 31557, "name", "夜魅手持（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31558, map("id", 31558, "name", "夜魅腰饰（女）", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31559, map("id", 31559, "name", "云巅耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31560, map("id", 31560, "name", "云巅项链（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init163() {
data.map(
    31561, map("id", 31561, "name", "谷雨耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31562, map("id", 31562, "name", "谷雨项链（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31563, map("id", 31563, "name", "白落项链（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31564, map("id", 31564, "name", "绝色倾城耳饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31565, map("id", 31565, "name", "铄金磐石飘带（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init164() {
data.map(
    31566, map("id", 31566, "name", "魔灵项链（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31567, map("id", 31567, "name", "魔灵背饰（女）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31568, map("id", 31568, "name", "碧笠青荷配饰（女）", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31569, map("id", 31569, "name", "碧笠青荷腿饰（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31570, map("id", 31570, "name", "碧笠青荷手持（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init165() {
data.map(
    31571, map("id", 31571, "name", "湛海墨森面纱（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31572, map("id", 31572, "name", "湛海墨森背饰（女）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31573, map("id", 31573, "name", "炽焰寒冰飘花（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31574, map("id", 31574, "name", "炽焰寒冰耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31575, map("id", 31575, "name", "炽焰寒冰手持（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init166() {
data.map(
    31576, map("id", 31576, "name", "魔力嘉年华翅膀", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31577, map("id", 31577, "name", "魔力嘉年华小猫", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31578, map("id", 31578, "name", "魔力嘉年华飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31579, map("id", 31579, "name", "魔力嘉年华脸饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31580, map("id", 31580, "name", "海洋之星背饰", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init167() {
data.map(
    31581, map("id", 31581, "name", "素绾青丝披风", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31582, map("id", 31582, "name", "素绾青丝飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31583, map("id", 31583, "name", "紫霞仙子背纱", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31584, map("id", 31584, "name", "紫霞仙子玫瑰", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31585, map("id", 31585, "name", "紫霞仙子耳坠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init168() {
data.map(
    31586, map("id", 31586, "name", "楚乔披风", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31587, map("id", 31587, "name", "楚乔背景", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31588, map("id", 31588, "name", "可爱熊背景", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31589, map("id", 31589, "name", "小学妹耳饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31590, map("id", 31590, "name", "小学妹单肩包", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init169() {
data.map(
    31591, map("id", 31591, "name", "丽姬玉佩", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31592, map("id", 31592, "name", "丽姬耳饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31593, map("id", 31593, "name", "花开月圆耳饰", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31594, map("id", 31594, "name", "花开月圆背饰", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31595, map("id", 31595, "name", "花开月圆手持", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init170() {
data.map(
    31596, map("id", 31596, "name", "花开月圆腰饰", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    31597, map("id", 31597, "name", "花开月圆飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    32000, map("id", 32000, "name", "绝色倾城项链", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    32001, map("id", 32001, "name", "铄金磐石手持（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33500, map("id", 33500, "name", "白落纸鹤（女）", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init171() {
data.map(
    33501, map("id", 33501, "name", "春晖花束（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33502, map("id", 33502, "name", "春晖耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33503, map("id", 33503, "name", "童心未泯颈饰（女）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33504, map("id", 33504, "name", "童心未泯手持（女）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33505, map("id", 33505, "name", "汨罗耳饰（女）", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init172() {
data.map(
    33506, map("id", 33506, "name", "汨罗手镯（女）", "lv", 1, "kind", 3, "subKind", 6, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33507, map("id", 33507, "name", "汨罗飘带（女）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33508, map("id", 33508, "name", "绝色倾城飘花", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    33509, map("id", 33509, "name", "紫青宝剑", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    34000, map("id", 34000, "name", "待字闺中", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init173() {
data.map(
    34001, map("id", 34001, "name", "黛玉颦颦", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34002, map("id", 34002, "name", "轻启朱唇", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34003, map("id", 34003, "name", "娥眉粉黛", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34004, map("id", 34004, "name", "单身汪妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34005, map("id", 34005, "name", "未央面若桃花", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init174() {
data.map(
    34006, map("id", 34006, "name", "雪女玉砌玲珑", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34007, map("id", 34007, "name", "新禧娇颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34008, map("id", 34008, "name", "新春红颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34009, map("id", 34009, "name", "小财神（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34010, map("id", 34010, "name", "南笙红颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init175() {
data.map(
    34011, map("id", 34011, "name", "桃花灼灼颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34012, map("id", 34012, "name", "白浅娇颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34013, map("id", 34013, "name", "凤九魅颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34014, map("id", 34014, "name", "初春娇颜（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34015, map("id", 34015, "name", "夜魅妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init176() {
data.map(
    34016, map("id", 34016, "name", "云巅妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34017, map("id", 34017, "name", "谷雨妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34018, map("id", 34018, "name", "白落妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34019, map("id", 34019, "name", "春晖妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34020, map("id", 34020, "name", "童心未泯妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init177() {
data.map(
    34021, map("id", 34021, "name", "汨罗妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34022, map("id", 34022, "name", "烟粉妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34023, map("id", 34023, "name", "绝色倾城妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34024, map("id", 34024, "name", "铄金磐石妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34025, map("id", 34025, "name", "魔灵妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init178() {
data.map(
    34026, map("id", 34026, "name", "碧笠青荷妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34027, map("id", 34027, "name", "湛海墨森妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34028, map("id", 34028, "name", "炽焰寒冰妆容（女）", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34029, map("id", 34029, "name", "魔力嘉年华妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34030, map("id", 34030, "name", "海洋之星妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init179() {
data.map(
    34031, map("id", 34031, "name", "素绾青丝妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34032, map("id", 34032, "name", "紫霞仙子", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34033, map("id", 34033, "name", "楚乔", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34034, map("id", 34034, "name", "小学妹", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34035, map("id", 34035, "name", "丽姬", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init180() {
data.map(
    34036, map("id", 34036, "name", "花开月圆妆容", "lv", 1, "kind", 3, "subKind", 9, "stack", true, "useMode", 0, "money", 1),
    34500, map("id", 34500, "name", "金丝蜀锦绣鞋", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 130, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2600),
    34501, map("id", 34501, "name", "明黄团绒绣鞋", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 130, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2600),
    34502, map("id", 34502, "name", "蕾丝袜", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    34503, map("id", 34503, "name", "玫瑰密语", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init181() {
data.map(
    34504, map("id", 34504, "name", "魔女鞋子", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34505, map("id", 34505, "name", "英姿飒爽·战靴", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34506, map("id", 34506, "name", "单身汪鞋子（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34507, map("id", 34507, "name", "天使脚链（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34508, map("id", 34508, "name", "谷雨脚链（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init182() {
data.map(
    34509, map("id", 34509, "name", "白落脚链（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34510, map("id", 34510, "name", "春晖鞋子（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34511, map("id", 34511, "name", "童心未泯鞋子（女）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34512, map("id", 34512, "name", "魔力嘉年华鞋子", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    34513, map("id", 34513, "name", "海洋之星脚链", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init183() {
data.map(
    34514, map("id", 34514, "name", "小学妹粗跟鞋", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 300, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 6000),
    40000, map("id", 40000, "name", "长生头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40001, map("id", 40001, "name", "汨罗头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40002, map("id", 40002, "name", "云烟头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40003, map("id", 40003, "name", "精灵王头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init184() {
data.map(
    40004, map("id", 40004, "name", "铄金磐石头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40005, map("id", 40005, "name", "魔灵头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40006, map("id", 40006, "name", "碧笠青荷头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40007, map("id", 40007, "name", "湛海墨森头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40008, map("id", 40008, "name", "炽焰寒冰头饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init185() {
data.map(
    40009, map("id", 40009, "name", "魔力嘉年华帽子", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40010, map("id", 40010, "name", "海洋之星头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40011, map("id", 40011, "name", "素绾青丝头饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40012, map("id", 40012, "name", "大圣紧箍咒", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40013, map("id", 40013, "name", "宇文玥发饰", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init186() {
data.map(
    40014, map("id", 40014, "name", "嬴政王冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40015, map("id", 40015, "name", "花开月圆帽子", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    40500, map("id", 40500, "name", "行云流水", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 130, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2600),
    40501, map("id", 40501, "name", "似水年华", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    40502, map("id", 40502, "name", "王者风范", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 760, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 15200)
);
    }

    private static void init187() {
data.map(
    40503, map("id", 40503, "name", "朝鲜王", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 760, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 15200),
    40504, map("id", 40504, "name", "瑛珠玳瑁冠笄", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 380, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 7600),
    40505, map("id", 40505, "name", "风流少年", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1030, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20600),
    40506, map("id", 40506, "name", "黄金冠", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    40507, map("id", 40507, "name", "白玉发簪冠", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1030, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20600)
);
    }

    private static void init188() {
data.map(
    40508, map("id", 40508, "name", "绸缎束发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1030, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20600),
    40509, map("id", 40509, "name", "大金王子", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40510, map("id", 40510, "name", "皇帝·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40511, map("id", 40511, "name", "牛郎·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40512, map("id", 40512, "name", "吴刚·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init189() {
data.map(
    40513, map("id", 40513, "name", "中国红·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40514, map("id", 40514, "name", "恶魔发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40515, map("id", 40515, "name", "英姿飒爽·发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40516, map("id", 40516, "name", "单身汪发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40517, map("id", 40517, "name", "黑天使银发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init190() {
data.map(
    40518, map("id", 40518, "name", "拓跋浚编发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40519, map("id", 40519, "name", "雪域上仙编发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40520, map("id", 40520, "name", "新禧发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40521, map("id", 40521, "name", "新春发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40522, map("id", 40522, "name", "财神发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init191() {
data.map(
    40523, map("id", 40523, "name", "寒阙发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40524, map("id", 40524, "name", "桃花债发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40525, map("id", 40525, "name", "夜华发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40526, map("id", 40526, "name", "东华银发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40527, map("id", 40527, "name", "初春发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init192() {
data.map(
    40528, map("id", 40528, "name", "邪魅白发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40529, map("id", 40529, "name", "云巅发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40530, map("id", 40530, "name", "谷雨发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40531, map("id", 40531, "name", "长生编发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40532, map("id", 40532, "name", "春晖发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init193() {
data.map(
    40533, map("id", 40533, "name", "童心未泯棕发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40534, map("id", 40534, "name", "汨罗编发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40535, map("id", 40535, "name", "云烟编发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40536, map("id", 40536, "name", "精灵王编发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40537, map("id", 40537, "name", "铄金磐石发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init194() {
data.map(
    40538, map("id", 40538, "name", "魔灵金发（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40539, map("id", 40539, "name", "碧笠青荷发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40540, map("id", 40540, "name", "湛海墨森发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40541, map("id", 40541, "name", "炽焰寒冰发髻（男）", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40542, map("id", 40542, "name", "魔力嘉年华发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init195() {
data.map(
    40543, map("id", 40543, "name", "海洋之星发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40544, map("id", 40544, "name", "素绾青丝发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40545, map("id", 40545, "name", "大圣金发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40546, map("id", 40546, "name", "宇文玥飘发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40547, map("id", 40547, "name", "学长短发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init196() {
data.map(
    40548, map("id", 40548, "name", "嬴政发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    40549, map("id", 40549, "name", "花开月圆发髻", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    41000, map("id", 41000, "name", "白锦底衬", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 130, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 2600),
    41001, map("id", 41001, "name", "翠色菖蒲纹杭绸直裰", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 4200),
    41002, map("id", 41002, "name", "天子", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 760, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 15200)
);
    }

    private static void init197() {
data.map(
    41003, map("id", 41003, "name", "朝鲜王", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    41004, map("id", 41004, "name", "逍遥生", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 8200),
    41005, map("id", 41005, "name", "翩翩公子", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 14000),
    41006, map("id", 41006, "name", "暖阳汉白玉锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1030, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20600),
    41007, map("id", 41007, "name", "鲤鱼锦", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 16000)
);
    }

    private static void init198() {
data.map(
    41008, map("id", 41008, "name", "湖蓝金丝镶边锻衫", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41009, map("id", 41009, "name", "金纱绣锦绸直裰", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41010, map("id", 41010, "name", "皇帝·龙袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41011, map("id", 41011, "name", "牛郎·紫纱袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41012, map("id", 41012, "name", "吴刚·上仙袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init199() {
data.map(
    41013, map("id", 41013, "name", "中国红·锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41014, map("id", 41014, "name", "恶魔锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41015, map("id", 41015, "name", "英姿飒爽·战袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41016, map("id", 41016, "name", "单身汪锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41017, map("id", 41017, "name", "黑天使锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init200() {
data.map(
    41018, map("id", 41018, "name", "拓跋浚锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41019, map("id", 41019, "name", "雪域上仙大氅", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41020, map("id", 41020, "name", "新禧锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41021, map("id", 41021, "name", "新春锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41022, map("id", 41022, "name", "财神锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init201() {
data.map(
    41023, map("id", 41023, "name", "寒阙锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41024, map("id", 41024, "name", "桃花债锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41025, map("id", 41025, "name", "夜华黑龙袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41026, map("id", 41026, "name", "东华帝君服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41027, map("id", 41027, "name", "初春锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init202() {
data.map(
    41028, map("id", 41028, "name", "邪魅华服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41029, map("id", 41029, "name", "云巅锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41030, map("id", 41030, "name", "谷雨青衫（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41031, map("id", 41031, "name", "长生锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41032, map("id", 41032, "name", "春晖锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init203() {
data.map(
    41033, map("id", 41033, "name", "童心未泯锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41034, map("id", 41034, "name", "汨罗绸袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41035, map("id", 41035, "name", "云烟缎袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41036, map("id", 41036, "name", "精灵王氅袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41037, map("id", 41037, "name", "铄金磐石锦服（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init204() {
data.map(
    41038, map("id", 41038, "name", "魔灵锦袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41039, map("id", 41039, "name", "碧笠青荷锦袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41040, map("id", 41040, "name", "湛海墨森锦袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41041, map("id", 41041, "name", "炽焰寒冰锦袍（男）", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41042, map("id", 41042, "name", "魔力嘉年华锦袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init205() {
data.map(
    41043, map("id", 41043, "name", "海洋之星锦袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41044, map("id", 41044, "name", "素绾青丝锦袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41045, map("id", 41045, "name", "大圣战袍", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41046, map("id", 41046, "name", "宇文玥薄纱锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41047, map("id", 41047, "name", "学长校服装", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000)
);
    }

    private static void init206() {
data.map(
    41048, map("id", 41048, "name", "嬴政华服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41049, map("id", 41049, "name", "花开月圆锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 700, "acquirePathway", true, "pathway", list(152), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 14000),
    41500, map("id", 41500, "name", "亲王腰封", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    41501, map("id", 41501, "name", "铆钉腰带", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    41502, map("id", 41502, "name", "扣环腰带", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000)
);
    }

    private static void init207() {
data.map(
    41503, map("id", 41503, "name", "皇帝·腰封", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    41504, map("id", 41504, "name", "牛郎·腰间吊坠", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 20000),
    41505, map("id", 41505, "name", "恶魔腰佩", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    41506, map("id", 41506, "name", "单身汪腰坠（男）", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    41507, map("id", 41507, "name", "黑天使腰饰（男）", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init208() {
data.map(
    41508, map("id", 41508, "name", "雪域上仙腰饰", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    41509, map("id", 41509, "name", "谷雨腰饰（男）", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    41510, map("id", 41510, "name", "精灵王腰饰", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42000, map("id", 42000, "name", "烫金面纱", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42001, map("id", 42001, "name", "上仙飘纱", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init209() {
data.map(
    42002, map("id", 42002, "name", "皇帝·冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42003, map("id", 42003, "name", "皇帝·挂珠", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42004, map("id", 42004, "name", "牛郎·紫云冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42005, map("id", 42005, "name", "吴刚·冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42006, map("id", 42006, "name", "吴刚·飘纱", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init210() {
data.map(
    42007, map("id", 42007, "name", "吴刚·玉佩", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42008, map("id", 42008, "name", "吴刚·上仙坠", "lv", 1, "kind", 3, "subKind", 4, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42009, map("id", 42009, "name", "中国红·冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42010, map("id", 42010, "name", "恶魔犄角", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42011, map("id", 42011, "name", "恶魔伞", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init211() {
data.map(
    42012, map("id", 42012, "name", "英姿飒爽·冠", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42013, map("id", 42013, "name", "单身汪飘花（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42014, map("id", 42014, "name", "单身汪发饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42015, map("id", 42015, "name", "黑天使翅膀（男）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42016, map("id", 42016, "name", "黑天使肩带（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init212() {
data.map(
    42017, map("id", 42017, "name", "拓跋浚肩挂", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42018, map("id", 42018, "name", "雪域上仙肩饰", "lv", 1, "kind", 3, "subKind", 6, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42019, map("id", 42019, "name", "雪域上仙吊饰", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42020, map("id", 42020, "name", "雪域上仙麋鹿", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42021, map("id", 42021, "name", "雪域上仙雪花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init213() {
data.map(
    42022, map("id", 42022, "name", "新禧冠（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42023, map("id", 42023, "name", "新禧面具（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42024, map("id", 42024, "name", "新禧酒葫芦（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42025, map("id", 42025, "name", "新春冠（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42027, map("id", 42027, "name", "财神飘纱（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init214() {
data.map(
    42028, map("id", 42028, "name", "寒阙发冠（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42029, map("id", 42029, "name", "桃花债配饰（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42030, map("id", 42030, "name", "夜华挂饰（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42031, map("id", 42031, "name", "小黑蛇（男）", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42032, map("id", 42032, "name", "东华发冠（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init215() {
data.map(
    42033, map("id", 42033, "name", "小九尾狸（男）", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42034, map("id", 42034, "name", "初春项链（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42035, map("id", 42035, "name", "邪魅角（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42036, map("id", 42036, "name", "邪魅项链（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42037, map("id", 42037, "name", "玫瑰咬（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init216() {
data.map(
    42038, map("id", 42038, "name", "云巅发饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42039, map("id", 42039, "name", "云巅挂饰（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42040, map("id", 42040, "name", "谷雨发饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42041, map("id", 42041, "name", "谷雨挂饰（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42042, map("id", 42042, "name", "春晖发饰（男）", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000)
);
    }

    private static void init217() {
data.map(
    42043, map("id", 42043, "name", "春晖配饰（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42044, map("id", 42044, "name", "童心未泯眼镜（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42045, map("id", 42045, "name", "汨罗项链（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 36000),
    42046, map("id", 42046, "name", "汨罗翠啼鸟（男）", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42047, map("id", 42047, "name", "精灵王飘花", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init218() {
data.map(
    42048, map("id", 42048, "name", "铄金磐石挂饰（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42049, map("id", 42049, "name", "魔灵肩饰（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42050, map("id", 42050, "name", "魔灵背饰（男）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42051, map("id", 42051, "name", "碧笠青荷配饰（男）", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42052, map("id", 42052, "name", "碧笠青荷手持（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init219() {
data.map(
    42053, map("id", 42053, "name", "湛海墨森肩饰（男）", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42054, map("id", 42054, "name", "湛海墨森背饰（男）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42055, map("id", 42055, "name", "炽焰寒冰飘花（男）", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42056, map("id", 42056, "name", "炽焰寒冰手持（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42057, map("id", 42057, "name", "魔力嘉年华飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init220() {
data.map(
    42058, map("id", 42058, "name", "魔力嘉年华扑克牌", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42059, map("id", 42059, "name", "魔力嘉年华肩饰", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42060, map("id", 42060, "name", "魔力嘉年华翅膀", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42061, map("id", 42061, "name", "魔力嘉年华小猫", "lv", 1, "kind", 3, "subKind", 13, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42062, map("id", 42062, "name", "海洋之星背饰", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init221() {
data.map(
    42063, map("id", 42063, "name", "素绾青丝披风", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42064, map("id", 42064, "name", "素绾青丝飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42065, map("id", 42065, "name", "大圣霞光", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42066, map("id", 42066, "name", "狗尾巴草", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42067, map("id", 42067, "name", "宇文玥披风", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init222() {
data.map(
    42068, map("id", 42068, "name", "宇文玥飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42069, map("id", 42069, "name", "学长胸章", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42070, map("id", 42070, "name", "学长书卷", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 1600, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42071, map("id", 42071, "name", "可爱熊背景", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42072, map("id", 42072, "name", "嬴政玉佩", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000)
);
    }

    private static void init223() {
data.map(
    42073, map("id", 42073, "name", "花开月圆胸饰", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42074, map("id", 42074, "name", "花开月圆背饰", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42075, map("id", 42075, "name", "花开月圆飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 1800, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 32000),
    42500, map("id", 42500, "name", "宫羽扇", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42501, map("id", 42501, "name", "牛郎·宫灯", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000)
);
    }

    private static void init224() {
data.map(
    42502, map("id", 42502, "name", "吴刚·荷花灯", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42503, map("id", 42503, "name", "恶魔灯笼", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42504, map("id", 42504, "name", "单身汪宠物（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42505, map("id", 42505, "name", "黑天使南瓜灯（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42506, map("id", 42506, "name", "雪域上仙灯笼", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000)
);
    }

    private static void init225() {
data.map(
    42507, map("id", 42507, "name", "新禧御刀（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42508, map("id", 42508, "name", "新春金鸡（男）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42509, map("id", 42509, "name", "财神手持（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42510, map("id", 42510, "name", "桃花债玉笛（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42511, map("id", 42511, "name", "邪魅手持（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000)
);
    }

    private static void init226() {
data.map(
    42512, map("id", 42512, "name", "长生纸鹤（男）", "lv", 1, "kind", 3, "subKind", 8, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42513, map("id", 42513, "name", "春晖扇（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42514, map("id", 42514, "name", "童心未泯气球（男）", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42515, map("id", 42515, "name", "精灵王手持", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42516, map("id", 42516, "name", "大圣金箍棒", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000)
);
    }

    private static void init227() {
data.map(
    42517, map("id", 42517, "name", "学长手提包", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    42518, map("id", 42518, "name", "花开月圆手持", "lv", 1, "kind", 3, "subKind", 11, "evenQuick", true, "quickMoney", 2000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", true, "useMode", 0, "money", 40000),
    44000, map("id", 44000, "name", "风流才子", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44001, map("id", 44001, "name", "极品公子", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44002, map("id", 44002, "name", "逍遥生", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init228() {
data.map(
    44003, map("id", 44003, "name", "英姿飒爽", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44004, map("id", 44004, "name", "单身汪妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44005, map("id", 44005, "name", "拓跋浚俊朗", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44006, map("id", 44006, "name", "新禧妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44007, map("id", 44007, "name", "新春妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init229() {
data.map(
    44008, map("id", 44008, "name", "寒阙妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44009, map("id", 44009, "name", "桃花债妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44010, map("id", 44010, "name", "夜华俊颜（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44011, map("id", 44011, "name", "东华俊颜（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44012, map("id", 44012, "name", "初春俊颜（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init230() {
data.map(
    44013, map("id", 44013, "name", "邪魅俊颜（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44014, map("id", 44014, "name", "云巅妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44015, map("id", 44015, "name", "谷雨妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44016, map("id", 44016, "name", "长生妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44017, map("id", 44017, "name", "春晖妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init231() {
data.map(
    44018, map("id", 44018, "name", "童心未泯妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44019, map("id", 44019, "name", "汨罗妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44020, map("id", 44020, "name", "云烟妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44021, map("id", 44021, "name", "精灵王妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44022, map("id", 44022, "name", "铄金磐石妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init232() {
data.map(
    44023, map("id", 44023, "name", "魔灵妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44024, map("id", 44024, "name", "碧笠青荷妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44025, map("id", 44025, "name", "湛海墨森妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44026, map("id", 44026, "name", "炽焰寒冰妆容（男）", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44027, map("id", 44027, "name", "魔力嘉年华妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init233() {
data.map(
    44028, map("id", 44028, "name", "海洋之星妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44029, map("id", 44029, "name", "素绾青丝妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44030, map("id", 44030, "name", "齐天大圣", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44031, map("id", 44031, "name", "宇文玥", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44032, map("id", 44032, "name", "学长", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000)
);
    }

    private static void init234() {
data.map(
    44033, map("id", 44033, "name", "嬴政", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44034, map("id", 44034, "name", "花开月圆妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 300, "stack", true, "useMode", 0, "money", 6000),
    44500, map("id", 44500, "name", "战靴", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44501, map("id", 44501, "name", "恶魔靴子", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44502, map("id", 44502, "name", "英姿飒爽·战靴", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000)
);
    }

    private static void init235() {
data.map(
    44503, map("id", 44503, "name", "单身汪靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44504, map("id", 44504, "name", "财神靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44505, map("id", 44505, "name", "云巅靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44506, map("id", 44506, "name", "谷雨靴（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44507, map("id", 44507, "name", "长生靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000)
);
    }

    private static void init236() {
data.map(
    44508, map("id", 44508, "name", "春晖靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44509, map("id", 44509, "name", "童心未泯靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44510, map("id", 44510, "name", "铄金磐石靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44511, map("id", 44511, "name", "碧笠青荷靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44512, map("id", 44512, "name", "炽焰寒冰靴子（男）", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000)
);
    }

    private static void init237() {
data.map(
    44513, map("id", 44513, "name", "海洋之星靴子", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    44514, map("id", 44514, "name", "学长皮鞋", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 600, "stack", true, "useMode", 0, "money", 12000),
    50000, map("id", 50000, "name", "北斗七星阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    50001, map("id", 50001, "name", "星火凤舞阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    50002, map("id", 50002, "name", "星芒鸳鸯阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init238() {
data.map(
    50003, map("id", 50003, "name", "五星耀月阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    50004, map("id", 50004, "name", "琥珀龙腾阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    50005, map("id", 50005, "name", "萧寒罘置阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    50006, map("id", 50006, "name", "九天玄女阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    50007, map("id", 50007, "name", "紫薇星宿阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init239() {
data.map(
    50008, map("id", 50008, "name", "普通阵", "lv", 1, "kind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    51000, map("id", 51000, "name", "北斗七星阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    51001, map("id", 51001, "name", "星火凤舞阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    51002, map("id", 51002, "name", "星芒鸳鸯阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    51003, map("id", 51003, "name", "五星耀月阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400)
);
    }

    private static void init240() {
data.map(
    51004, map("id", 51004, "name", "琥珀龙腾阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    51005, map("id", 51005, "name", "萧寒罘置阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    51006, map("id", 51006, "name", "九天玄女阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    51007, map("id", 51007, "name", "紫薇星宿阵阵法书", "lv", 1, "kind", 2, "subKind", 20, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 4, "money", 400),
    60000, map("id", 60000, "name", "1级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init241() {
data.map(
    60001, map("id", 60001, "name", "2级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60002, map("id", 60002, "name", "3级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60003, map("id", 60003, "name", "4级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60004, map("id", 60004, "name", "5级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60005, map("id", 60005, "name", "6级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init242() {
data.map(
    60006, map("id", 60006, "name", "7级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60007, map("id", 60007, "name", "8级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60008, map("id", 60008, "name", "9级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60009, map("id", 60009, "name", "10级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60010, map("id", 60010, "name", "11级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init243() {
data.map(
    60011, map("id", 60011, "name", "12级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60100, map("id", 60100, "name", "1级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60101, map("id", 60101, "name", "2级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60102, map("id", 60102, "name", "3级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60103, map("id", 60103, "name", "4级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init244() {
data.map(
    60104, map("id", 60104, "name", "5级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60105, map("id", 60105, "name", "6级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60106, map("id", 60106, "name", "7级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60107, map("id", 60107, "name", "8级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60108, map("id", 60108, "name", "9级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init245() {
data.map(
    60109, map("id", 60109, "name", "10级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60110, map("id", 60110, "name", "11级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60111, map("id", 60111, "name", "12级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60200, map("id", 60200, "name", "1级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60201, map("id", 60201, "name", "2级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init246() {
data.map(
    60202, map("id", 60202, "name", "3级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60203, map("id", 60203, "name", "4级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60204, map("id", 60204, "name", "5级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60205, map("id", 60205, "name", "6级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60206, map("id", 60206, "name", "7级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init247() {
data.map(
    60207, map("id", 60207, "name", "8级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60208, map("id", 60208, "name", "9级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60209, map("id", 60209, "name", "10级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60210, map("id", 60210, "name", "11级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60211, map("id", 60211, "name", "12级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init248() {
data.map(
    60300, map("id", 60300, "name", "1级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60301, map("id", 60301, "name", "2级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60302, map("id", 60302, "name", "3级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60303, map("id", 60303, "name", "4级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60304, map("id", 60304, "name", "5级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init249() {
data.map(
    60305, map("id", 60305, "name", "6级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60306, map("id", 60306, "name", "7级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60307, map("id", 60307, "name", "8级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60308, map("id", 60308, "name", "9级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60309, map("id", 60309, "name", "10级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init250() {
data.map(
    60310, map("id", 60310, "name", "11级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60311, map("id", 60311, "name", "12级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60400, map("id", 60400, "name", "1级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60401, map("id", 60401, "name", "2级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60402, map("id", 60402, "name", "3级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init251() {
data.map(
    60403, map("id", 60403, "name", "4级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60404, map("id", 60404, "name", "5级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60405, map("id", 60405, "name", "6级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60406, map("id", 60406, "name", "7级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60407, map("id", 60407, "name", "8级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init252() {
data.map(
    60408, map("id", 60408, "name", "9级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60409, map("id", 60409, "name", "10级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60410, map("id", 60410, "name", "11级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60411, map("id", 60411, "name", "12级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60500, map("id", 60500, "name", "1级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init253() {
data.map(
    60501, map("id", 60501, "name", "2级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60502, map("id", 60502, "name", "3级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60503, map("id", 60503, "name", "4级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60504, map("id", 60504, "name", "5级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60505, map("id", 60505, "name", "6级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init254() {
data.map(
    60506, map("id", 60506, "name", "7级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60507, map("id", 60507, "name", "8级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60508, map("id", 60508, "name", "9级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60509, map("id", 60509, "name", "10级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60510, map("id", 60510, "name", "11级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init255() {
data.map(
    60511, map("id", 60511, "name", "12级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60600, map("id", 60600, "name", "1级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60601, map("id", 60601, "name", "2级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60602, map("id", 60602, "name", "3级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60603, map("id", 60603, "name", "4级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init256() {
data.map(
    60604, map("id", 60604, "name", "5级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60605, map("id", 60605, "name", "6级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60606, map("id", 60606, "name", "7级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60607, map("id", 60607, "name", "8级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60608, map("id", 60608, "name", "9级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init257() {
data.map(
    60609, map("id", 60609, "name", "10级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60610, map("id", 60610, "name", "11级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60611, map("id", 60611, "name", "12级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60700, map("id", 60700, "name", "1级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60701, map("id", 60701, "name", "2级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init258() {
data.map(
    60702, map("id", 60702, "name", "3级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60703, map("id", 60703, "name", "4级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60704, map("id", 60704, "name", "5级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60705, map("id", 60705, "name", "6级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60706, map("id", 60706, "name", "7级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init259() {
data.map(
    60707, map("id", 60707, "name", "8级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60708, map("id", 60708, "name", "9级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60709, map("id", 60709, "name", "10级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60710, map("id", 60710, "name", "11级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60711, map("id", 60711, "name", "12级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init260() {
data.map(
    60800, map("id", 60800, "name", "1级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60801, map("id", 60801, "name", "2级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60802, map("id", 60802, "name", "3级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60803, map("id", 60803, "name", "4级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60804, map("id", 60804, "name", "5级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init261() {
data.map(
    60805, map("id", 60805, "name", "6级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60806, map("id", 60806, "name", "7级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60807, map("id", 60807, "name", "8级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60808, map("id", 60808, "name", "9级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    60809, map("id", 60809, "name", "10级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init262() {
data.map(
    61000, map("id", 61000, "name", "1级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61001, map("id", 61001, "name", "2级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61002, map("id", 61002, "name", "3级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61003, map("id", 61003, "name", "4级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61004, map("id", 61004, "name", "5级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init263() {
data.map(
    61005, map("id", 61005, "name", "6级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61006, map("id", 61006, "name", "7级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61007, map("id", 61007, "name", "8级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61008, map("id", 61008, "name", "9级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61009, map("id", 61009, "name", "10级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init264() {
data.map(
    61010, map("id", 61010, "name", "11级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61011, map("id", 61011, "name", "12级精力宝石", "lv", 1, "kind", 5, "subKind", 1, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61100, map("id", 61100, "name", "1级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61101, map("id", 61101, "name", "2级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61102, map("id", 61102, "name", "3级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init265() {
data.map(
    61103, map("id", 61103, "name", "4级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61104, map("id", 61104, "name", "5级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61105, map("id", 61105, "name", "6级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61106, map("id", 61106, "name", "7级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61107, map("id", 61107, "name", "8级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init266() {
data.map(
    61108, map("id", 61108, "name", "9级物攻宝石", "lv", 1, "kind", 5, "subKind", 2, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61109, map("id", 61109, "name", "10级物攻宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61110, map("id", 61110, "name", "11级物攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61111, map("id", 61111, "name", "12级物攻宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61200, map("id", 61200, "name", "1级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init267() {
data.map(
    61201, map("id", 61201, "name", "2级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61202, map("id", 61202, "name", "3级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61203, map("id", 61203, "name", "4级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61204, map("id", 61204, "name", "5级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61205, map("id", 61205, "name", "6级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init268() {
data.map(
    61206, map("id", 61206, "name", "7级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61207, map("id", 61207, "name", "8级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61208, map("id", 61208, "name", "9级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61209, map("id", 61209, "name", "10级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61210, map("id", 61210, "name", "11级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init269() {
data.map(
    61211, map("id", 61211, "name", "12级物防宝石", "lv", 1, "kind", 5, "subKind", 3, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61300, map("id", 61300, "name", "1级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61301, map("id", 61301, "name", "2级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61302, map("id", 61302, "name", "3级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61303, map("id", 61303, "name", "4级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init270() {
data.map(
    61304, map("id", 61304, "name", "5级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61305, map("id", 61305, "name", "6级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61306, map("id", 61306, "name", "7级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61307, map("id", 61307, "name", "8级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61308, map("id", 61308, "name", "9级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init271() {
data.map(
    61309, map("id", 61309, "name", "10级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61310, map("id", 61310, "name", "11级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61311, map("id", 61311, "name", "12级法攻宝石", "lv", 1, "kind", 5, "subKind", 4, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61400, map("id", 61400, "name", "1级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61401, map("id", 61401, "name", "2级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init272() {
data.map(
    61402, map("id", 61402, "name", "3级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61403, map("id", 61403, "name", "4级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61404, map("id", 61404, "name", "5级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61405, map("id", 61405, "name", "6级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61406, map("id", 61406, "name", "7级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init273() {
data.map(
    61407, map("id", 61407, "name", "8级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61408, map("id", 61408, "name", "9级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61409, map("id", 61409, "name", "10级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61410, map("id", 61410, "name", "11级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61411, map("id", 61411, "name", "12级法防宝石", "lv", 1, "kind", 5, "subKind", 5, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init274() {
data.map(
    61500, map("id", 61500, "name", "1级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61501, map("id", 61501, "name", "2级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61502, map("id", 61502, "name", "3级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61503, map("id", 61503, "name", "4级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61504, map("id", 61504, "name", "5级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init275() {
data.map(
    61505, map("id", 61505, "name", "6级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61506, map("id", 61506, "name", "7级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61507, map("id", 61507, "name", "8级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61508, map("id", 61508, "name", "9级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61509, map("id", 61509, "name", "10级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init276() {
data.map(
    61510, map("id", 61510, "name", "11级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61511, map("id", 61511, "name", "12级速度宝石", "lv", 1, "kind", 5, "subKind", 6, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61600, map("id", 61600, "name", "1级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61601, map("id", 61601, "name", "2级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61602, map("id", 61602, "name", "3级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init277() {
data.map(
    61603, map("id", 61603, "name", "4级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61604, map("id", 61604, "name", "5级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61605, map("id", 61605, "name", "6级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61606, map("id", 61606, "name", "7级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61607, map("id", 61607, "name", "8级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init278() {
data.map(
    61608, map("id", 61608, "name", "9级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61609, map("id", 61609, "name", "10级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61610, map("id", 61610, "name", "11级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61611, map("id", 61611, "name", "12级封印宝石", "lv", 1, "kind", 5, "subKind", 7, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61700, map("id", 61700, "name", "1级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init279() {
data.map(
    61701, map("id", 61701, "name", "2级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61702, map("id", 61702, "name", "3级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61703, map("id", 61703, "name", "4级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61704, map("id", 61704, "name", "5级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61705, map("id", 61705, "name", "6级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init280() {
data.map(
    61706, map("id", 61706, "name", "7级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61707, map("id", 61707, "name", "8级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61708, map("id", 61708, "name", "9级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61709, map("id", 61709, "name", "10级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61710, map("id", 61710, "name", "11级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init281() {
data.map(
    61711, map("id", 61711, "name", "12级抗封宝石", "lv", 1, "kind", 5, "subKind", 8, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61800, map("id", 61800, "name", "1级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61801, map("id", 61801, "name", "2级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61802, map("id", 61802, "name", "3级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61803, map("id", 61803, "name", "4级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init282() {
data.map(
    61804, map("id", 61804, "name", "5级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61805, map("id", 61805, "name", "6级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61806, map("id", 61806, "name", "7级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61807, map("id", 61807, "name", "8级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    61808, map("id", 61808, "name", "9级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init283() {
data.map(
    61809, map("id", 61809, "name", "10级治疗宝石", "lv", 1, "kind", 5, "subKind", 9, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    62000, map("id", 62000, "name", "5级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62001, map("id", 62001, "name", "6级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62002, map("id", 62002, "name", "7级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62003, map("id", 62003, "name", "8级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init284() {
data.map(
    62004, map("id", 62004, "name", "9级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62005, map("id", 62005, "name", "10级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62006, map("id", 62006, "name", "11级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62007, map("id", 62007, "name", "12级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62100, map("id", 62100, "name", "5级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init285() {
data.map(
    62101, map("id", 62101, "name", "6级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62102, map("id", 62102, "name", "7级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62103, map("id", 62103, "name", "8级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62104, map("id", 62104, "name", "9级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62105, map("id", 62105, "name", "10级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init286() {
data.map(
    62106, map("id", 62106, "name", "11级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62107, map("id", 62107, "name", "12级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62200, map("id", 62200, "name", "5级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62201, map("id", 62201, "name", "6级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62202, map("id", 62202, "name", "7级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init287() {
data.map(
    62203, map("id", 62203, "name", "8级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62204, map("id", 62204, "name", "9级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62205, map("id", 62205, "name", "10级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62206, map("id", 62206, "name", "11级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62207, map("id", 62207, "name", "12级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init288() {
data.map(
    62300, map("id", 62300, "name", "5级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62301, map("id", 62301, "name", "6级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62302, map("id", 62302, "name", "7级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62303, map("id", 62303, "name", "8级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62304, map("id", 62304, "name", "9级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init289() {
data.map(
    62305, map("id", 62305, "name", "10级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62306, map("id", 62306, "name", "11级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62307, map("id", 62307, "name", "12级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62400, map("id", 62400, "name", "5级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62401, map("id", 62401, "name", "6级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init290() {
data.map(
    62402, map("id", 62402, "name", "7级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62403, map("id", 62403, "name", "8级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62404, map("id", 62404, "name", "9级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62405, map("id", 62405, "name", "10级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62406, map("id", 62406, "name", "11级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init291() {
data.map(
    62407, map("id", 62407, "name", "12级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62500, map("id", 62500, "name", "5级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62501, map("id", 62501, "name", "6级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62502, map("id", 62502, "name", "7级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62503, map("id", 62503, "name", "8级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init292() {
data.map(
    62504, map("id", 62504, "name", "9级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62505, map("id", 62505, "name", "10级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62506, map("id", 62506, "name", "11级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62507, map("id", 62507, "name", "12级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62600, map("id", 62600, "name", "5级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init293() {
data.map(
    62601, map("id", 62601, "name", "6级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62602, map("id", 62602, "name", "7级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62603, map("id", 62603, "name", "8级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62604, map("id", 62604, "name", "9级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62605, map("id", 62605, "name", "10级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init294() {
data.map(
    62606, map("id", 62606, "name", "11级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62607, map("id", 62607, "name", "12级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62700, map("id", 62700, "name", "5级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62701, map("id", 62701, "name", "6级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62702, map("id", 62702, "name", "7级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init295() {
data.map(
    62703, map("id", 62703, "name", "8级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62704, map("id", 62704, "name", "9级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62705, map("id", 62705, "name", "10级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62706, map("id", 62706, "name", "11级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62707, map("id", 62707, "name", "12级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init296() {
data.map(
    62800, map("id", 62800, "name", "5级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62801, map("id", 62801, "name", "6级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62802, map("id", 62802, "name", "7级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62803, map("id", 62803, "name", "8级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62804, map("id", 62804, "name", "9级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init297() {
data.map(
    62805, map("id", 62805, "name", "10级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62806, map("id", 62806, "name", "11级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    62807, map("id", 62807, "name", "12级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    63000, map("id", 63000, "name", "5级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63001, map("id", 63001, "name", "6级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init298() {
data.map(
    63002, map("id", 63002, "name", "7级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63003, map("id", 63003, "name", "8级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63004, map("id", 63004, "name", "9级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63005, map("id", 63005, "name", "10级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63006, map("id", 63006, "name", "11级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init299() {
data.map(
    63007, map("id", 63007, "name", "12级欧泊石", "lv", 1, "kind", 5, "subKind", 10, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63100, map("id", 63100, "name", "5级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63101, map("id", 63101, "name", "6级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63102, map("id", 63102, "name", "7级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63103, map("id", 63103, "name", "8级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init300() {
data.map(
    63104, map("id", 63104, "name", "9级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63105, map("id", 63105, "name", "10级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63106, map("id", 63106, "name", "11级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63107, map("id", 63107, "name", "12级芙蓉石", "lv", 1, "kind", 5, "subKind", 11, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63200, map("id", 63200, "name", "5级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init301() {
data.map(
    63201, map("id", 63201, "name", "6级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63202, map("id", 63202, "name", "7级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63203, map("id", 63203, "name", "8级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63204, map("id", 63204, "name", "9级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63205, map("id", 63205, "name", "10级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init302() {
data.map(
    63206, map("id", 63206, "name", "11级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63207, map("id", 63207, "name", "12级琥珀石", "lv", 1, "kind", 5, "subKind", 12, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63300, map("id", 63300, "name", "5级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63301, map("id", 63301, "name", "6级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63302, map("id", 63302, "name", "7级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init303() {
data.map(
    63303, map("id", 63303, "name", "8级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63304, map("id", 63304, "name", "9级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63305, map("id", 63305, "name", "10级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63306, map("id", 63306, "name", "11级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63307, map("id", 63307, "name", "12级梦魇石", "lv", 1, "kind", 5, "subKind", 13, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init304() {
data.map(
    63400, map("id", 63400, "name", "5级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63401, map("id", 63401, "name", "6级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63402, map("id", 63402, "name", "7级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63403, map("id", 63403, "name", "8级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63404, map("id", 63404, "name", "9级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init305() {
data.map(
    63405, map("id", 63405, "name", "10级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63406, map("id", 63406, "name", "11级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63407, map("id", 63407, "name", "12级日曜石", "lv", 1, "kind", 5, "subKind", 14, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63500, map("id", 63500, "name", "5级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63501, map("id", 63501, "name", "6级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init306() {
data.map(
    63502, map("id", 63502, "name", "7级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63503, map("id", 63503, "name", "8级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63504, map("id", 63504, "name", "9级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63505, map("id", 63505, "name", "10级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63506, map("id", 63506, "name", "11级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init307() {
data.map(
    63507, map("id", 63507, "name", "12级虎睛石", "lv", 1, "kind", 5, "subKind", 15, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63600, map("id", 63600, "name", "5级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63601, map("id", 63601, "name", "6级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63602, map("id", 63602, "name", "7级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63603, map("id", 63603, "name", "8级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init308() {
data.map(
    63604, map("id", 63604, "name", "9级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63605, map("id", 63605, "name", "10级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63606, map("id", 63606, "name", "11级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63607, map("id", 63607, "name", "12级莫桑石", "lv", 1, "kind", 5, "subKind", 16, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63700, map("id", 63700, "name", "5级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init309() {
data.map(
    63701, map("id", 63701, "name", "6级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63702, map("id", 63702, "name", "7级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63703, map("id", 63703, "name", "8级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63704, map("id", 63704, "name", "9级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63705, map("id", 63705, "name", "10级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init310() {
data.map(
    63706, map("id", 63706, "name", "11级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63707, map("id", 63707, "name", "12级菱锌石", "lv", 1, "kind", 5, "subKind", 17, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63800, map("id", 63800, "name", "5级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63801, map("id", 63801, "name", "6级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63802, map("id", 63802, "name", "7级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init311() {
data.map(
    63803, map("id", 63803, "name", "8级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63804, map("id", 63804, "name", "9级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63805, map("id", 63805, "name", "10级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63806, map("id", 63806, "name", "11级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1),
    63807, map("id", 63807, "name", "12级鱼眼石", "lv", 1, "kind", 5, "subKind", 18, "evenQuick", true, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init312() {
data.map(
    70000, map("id", 70000, "name", "一鸣惊人", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70001, map("id", 70001, "name", "河东狮吼", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70002, map("id", 70002, "name", "霓虹飞天", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70003, map("id", 70003, "name", "绵里藏针", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70004, map("id", 70004, "name", "枯木逢春", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init313() {
data.map(
    70005, map("id", 70005, "name", "杨枝甘露", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70006, map("id", 70006, "name", "晴天霹雳", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70007, map("id", 70007, "name", "秉烛达旦", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70008, map("id", 70008, "name", "道山学海", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70009, map("id", 70009, "name", "闭月羞花", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init314() {
data.map(
    70010, map("id", 70010, "name", "沉鱼落雁", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70011, map("id", 70011, "name", "龙凤在天", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70012, map("id", 70012, "name", "佛跳墙", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70013, map("id", 70013, "name", "丁氏猪肉", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70014, map("id", 70014, "name", "满汉全席", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init315() {
data.map(
    70015, map("id", 70015, "name", "钟灵毓秀", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70016, map("id", 70016, "name", "用药", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    70099, map("id", 70099, "name", "霓虹飞天", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    71000, map("id", 71000, "name", "飞针", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    71001, map("id", 71001, "name", "爆炒", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init316() {
data.map(
    71002, map("id", 71002, "name", "流言", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    71003, map("id", 71003, "name", "突击", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    71004, map("id", 71004, "name", "落墨", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    72000, map("id", 72000, "name", "普通攻击", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    72001, map("id", 72001, "name", "普通攻击", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init317() {
data.map(
    73000, map("id", 73000, "name", "强其筋骨", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    73001, map("id", 73001, "name", "凤飞九天", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    73002, map("id", 73002, "name", "华佗再世", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    73003, map("id", 73003, "name", "文思泉涌", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    73004, map("id", 73004, "name", "珍馐美馔", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init318() {
data.map(
    74000, map("id", 74000, "name", "中级·杀气诀", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74001, map("id", 74001, "name", "高级·杀气诀", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74002, map("id", 74002, "name", "中级·横扫千军", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74003, map("id", 74003, "name", "高级·横扫千军", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74100, map("id", 74100, "name", "中级·后发制人", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init319() {
data.map(
    74101, map("id", 74101, "name", "高级·后发制人", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74102, map("id", 74102, "name", "中级·斩龙诀", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74103, map("id", 74103, "name", "高级·斩龙诀", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74200, map("id", 74200, "name", "中级·破斧沉舟", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74201, map("id", 74201, "name", "高级·破斧沉舟", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init320() {
data.map(
    74202, map("id", 74202, "name", "中级·翩鸿一击", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74203, map("id", 74203, "name", "高级·翩鸿一击", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74300, map("id", 74300, "name", "中级·万剑归宗", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74301, map("id", 74301, "name", "高级·万剑归宗", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74302, map("id", 74302, "name", "中级·离魂咒", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init321() {
data.map(
    74303, map("id", 74303, "name", "高级·离魂咒", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74400, map("id", 74400, "name", "中级·五雷咒", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74401, map("id", 74401, "name", "高级·五雷咒", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74402, map("id", 74402, "name", "中级·神兵护法", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74403, map("id", 74403, "name", "高级·神兵护法", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init322() {
data.map(
    74500, map("id", 74500, "name", "中级·黄庭经", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74501, map("id", 74501, "name", "高级·黄庭经", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74502, map("id", 74502, "name", "中级·沐日慈悲", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74503, map("id", 74503, "name", "高级·沐日慈悲", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74600, map("id", 74600, "name", "中级·灵动九天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init323() {
data.map(
    74601, map("id", 74601, "name", "高级·灵动九天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74602, map("id", 74602, "name", "中级·五行咒", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74603, map("id", 74603, "name", "高级·五行咒", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74700, map("id", 74700, "name", "中级·失心符", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74701, map("id", 74701, "name", "高级·失心符", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init324() {
data.map(
    74702, map("id", 74702, "name", "中级·浪滔天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74703, map("id", 74703, "name", "高级·浪滔天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74800, map("id", 74800, "name", "中级·九龙诀", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74801, map("id", 74801, "name", "高级·九龙诀", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74802, map("id", 74802, "name", "中级·龙卷雨击", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init325() {
data.map(
    74803, map("id", 74803, "name", "高级·龙卷雨击", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74900, map("id", 74900, "name", "中级·天龙降", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74901, map("id", 74901, "name", "高级·天龙降", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74902, map("id", 74902, "name", "中级·神龙摆尾", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    74903, map("id", 74903, "name", "高级·神龙摆尾", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init326() {
data.map(
    75000, map("id", 75000, "name", "中级·飞龙在天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75001, map("id", 75001, "name", "高级·飞龙在天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75002, map("id", 75002, "name", "中级·法力无边", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75003, map("id", 75003, "name", "高级·法力无边", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75100, map("id", 75100, "name", "中级·怀中抱月", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init327() {
data.map(
    75101, map("id", 75101, "name", "高级·怀中抱月", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75102, map("id", 75102, "name", "中级·莲花坐山", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75103, map("id", 75103, "name", "高级·莲花坐山", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75200, map("id", 75200, "name", "中级·拨云见日", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75201, map("id", 75201, "name", "高级·拨云见日", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init328() {
data.map(
    75202, map("id", 75202, "name", "中级·云蒸霞蔚", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75203, map("id", 75203, "name", "高级·云蒸霞蔚", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75300, map("id", 75300, "name", "中级·只手遮天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75301, map("id", 75301, "name", "高级·只手遮天", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75302, map("id", 75302, "name", "中级·变道轮回", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init329() {
data.map(
    75303, map("id", 75303, "name", "高级·变道轮回", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75400, map("id", 75400, "name", "中级·无中生有", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75401, map("id", 75401, "name", "高级·无中生有", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75402, map("id", 75402, "name", "中级·仙人指路", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75403, map("id", 75403, "name", "高级·仙人指路", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init330() {
data.map(
    75500, map("id", 75500, "name", "中级·凤凰涅磬", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75501, map("id", 75501, "name", "高级·凤凰涅磬", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75502, map("id", 75502, "name", "中级·魂归涅磬", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75503, map("id", 75503, "name", "高级·魂归涅磬", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75600, map("id", 75600, "name", "中级·毒魂", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init331() {
data.map(
    75601, map("id", 75601, "name", "高级·毒魂", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75602, map("id", 75602, "name", "中级·夺魄", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75603, map("id", 75603, "name", "高级·夺魄", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75700, map("id", 75700, "name", "中级·飞铲", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75701, map("id", 75701, "name", "高级·飞铲", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init332() {
data.map(
    75702, map("id", 75702, "name", "中级·烈焰", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75703, map("id", 75703, "name", "高级·烈焰", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75800, map("id", 75800, "name", "中级·回峰剑", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75801, map("id", 75801, "name", "高级·回峰剑", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    75802, map("id", 75802, "name", "中级·反戈一击", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init333() {
data.map(
    75803, map("id", 75803, "name", "高级·反戈一击", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76000, map("id", 76000, "name", "中级·兵临城下", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76001, map("id", 76001, "name", "高级·兵临城下", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76002, map("id", 76002, "name", "中级·魂散魄飞", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76003, map("id", 76003, "name", "高级·魂散魄飞", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init334() {
data.map(
    76004, map("id", 76004, "name", "中级·凤鸣矢", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76005, map("id", 76005, "name", "高级·凤鸣矢", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76006, map("id", 76006, "name", "中级·魂兮何去", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76007, map("id", 76007, "name", "高级·魂兮何去", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76008, map("id", 76008, "name", "中级·空灵闪", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init335() {
data.map(
    76009, map("id", 76009, "name", "高级·空灵闪", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76010, map("id", 76010, "name", "中级·魂归涅槃", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76011, map("id", 76011, "name", "高级·魂归涅槃", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76012, map("id", 76012, "name", "中级·醉芙蓉", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76013, map("id", 76013, "name", "高级·醉芙蓉", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init336() {
data.map(
    76014, map("id", 76014, "name", "中级·追星赶月", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76015, map("id", 76015, "name", "高级·追星赶月", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76016, map("id", 76016, "name", "中级·双飞火", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76017, map("id", 76017, "name", "高级·双飞火", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76018, map("id", 76018, "name", "中级·云蒸霞蔚", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init337() {
data.map(
    76019, map("id", 76019, "name", "高级·云蒸霞蔚", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76020, map("id", 76020, "name", "中级·百蛊啖魂", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76021, map("id", 76021, "name", "高级·百蛊啖魂", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76022, map("id", 76022, "name", "中级·龙蛇飞动", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76023, map("id", 76023, "name", "高级·龙蛇飞动", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init338() {
data.map(
    76024, map("id", 76024, "name", "中级·出其不意", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76025, map("id", 76025, "name", "高级·出其不意", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76026, map("id", 76026, "name", "中级·勾魂摄魄", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76027, map("id", 76027, "name", "高级·勾魂摄魄", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76028, map("id", 76028, "name", "中级·分花抚柳", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000)
);
    }

    private static void init339() {
data.map(
    76029, map("id", 76029, "name", "高级·分花抚柳", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76030, map("id", 76030, "name", "中级·日月同转", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    76031, map("id", 76031, "name", "高级·日月同转", "lv", 1, "kind", 7, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 0, "systemNotice", true, "money", 10000),
    78000, map("id", 78000, "name", "兵临城下", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    78001, map("id", 78001, "name", "凤鸣矢", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init340() {
data.map(
    78002, map("id", 78002, "name", "空灵闪", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    78003, map("id", 78003, "name", "醉芙蓉", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    78004, map("id", 78004, "name", "双飞火", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    78005, map("id", 78005, "name", "百蛊啖魂", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    78006, map("id", 78006, "name", "出其不意", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init341() {
data.map(
    78007, map("id", 78007, "name", "分花抚柳", "lv", 1, "kind", 7, "evenQuick", true, "stack", true, "useMode", 0, "money", 1),
    80001, map("id", 80001, "name", "银两", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80002, map("id", 80002, "name", "元宝", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80003, map("id", 80003, "name", "经验", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80004, map("id", 80004, "name", "擂台积分", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1)
);
    }

    private static void init342() {
data.map(
    80005, map("id", 80005, "name", "装备碎片", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80006, map("id", 80006, "name", "VIP积分", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80008, map("id", 80008, "name", "武举积分", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80009, map("id", 80009, "name", "晴水玉佩", "lv", 1, "kind", 8, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 1, "money", 400),
    80010, map("id", 80010, "name", "翡翠玉佩", "lv", 1, "kind", 8, "evenQuick", true, "quickMoney", 50, "stack", true, "useMode", 1, "money", 1000)
);
    }

    private static void init343() {
data.map(
    80011, map("id", 80011, "name", "羊脂玉佩", "lv", 1, "kind", 8, "evenQuick", true, "quickMoney", 100, "stack", true, "useMode", 1, "systemNotice", true, "money", 2000),
    80012, map("id", 80012, "name", "金镶玉玉佩", "lv", 1, "kind", 8, "evenQuick", true, "quickMoney", 500, "stack", true, "useMode", 1, "systemNotice", true, "money", 10000),
    80013, map("id", 80013, "name", "内丹", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80014, map("id", 80014, "name", "繁荣度", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80015, map("id", 80015, "name", "魅力", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1)
);
    }

    private static void init344() {
data.map(
    80016, map("id", 80016, "name", "金砖", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80017, map("id", 80017, "name", "派系金砖", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80018, map("id", 80018, "name", "友好度", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80019, map("id", 80019, "name", "友好度", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80020, map("id", 80020, "name", "势力值", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1)
);
    }

    private static void init345() {
data.map(
    80021, map("id", 80021, "name", "声望", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80022, map("id", 80022, "name", "官品临时积分", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80023, map("id", 80023, "name", "装扮碎片", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "systemNotice", true, "money", 1),
    80024, map("id", 80024, "name", "龙凤币", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80025, map("id", 80025, "name", "临时魅力", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1)
);
    }

    private static void init346() {
data.map(
    80026, map("id", 80026, "name", "荣誉", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80027, map("id", 80027, "name", "烹饪经验", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80028, map("id", 80028, "name", "派系贡献", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80029, map("id", 80029, "name", "才能点", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    80030, map("id", 80030, "name", "才能言", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1)
);
    }

    private static void init347() {
data.map(
    80031, map("id", 80031, "name", "水果机积分", "lv", 1, "kind", 8, "stack", true, "useMode", 1, "money", 1),
    90000, map("id", 90000, "name", "铁线莲", "lv", 40, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 20, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 20),
    90001, map("id", 90001, "name", "满天星", "lv", 5, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 1, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 1),
    90002, map("id", 90002, "name", "茉莉花", "lv", 10, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 4, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 4),
    90003, map("id", 90003, "name", "百合花", "lv", 15, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 5, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 5)
);
    }

    private static void init348() {
data.map(
    90004, map("id", 90004, "name", "蒲公英", "lv", 20, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 8, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 8),
    90005, map("id", 90005, "name", "薰衣草", "lv", 25, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 9, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 9),
    90006, map("id", 90006, "name", "虞美人", "lv", 30, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 10, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 10),
    90007, map("id", 90007, "name", "雏菊", "lv", 35, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 15, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 15),
    90008, map("id", 90008, "name", "红玫瑰", "lv", 1, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 1, "flowerNum", 20, "acquirePathway", true, "pathway", list(144, 116), "pathwayKind", list(3, 7), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init349() {
data.map(
    90100, map("id", 90100, "name", "暖阳初雪", "lv", 1, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 11, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 220),
    90101, map("id", 90101, "name", "玫色雏菊", "lv", 5, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 22, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 440),
    90102, map("id", 90102, "name", "思暮情", "lv", 10, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 36, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 720),
    90103, map("id", 90103, "name", "蒲英千瓣莲", "lv", 15, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 48, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 960),
    90104, map("id", 90104, "name", "霜岚合欢", "lv", 20, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 64, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1280)
);
    }

    private static void init350() {
data.map(
    90105, map("id", 90105, "name", "红颜泪", "lv", 25, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 78, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1560),
    90106, map("id", 90106, "name", "转世茉莉", "lv", 30, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 89, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 1780),
    90107, map("id", 90107, "name", "瑰丽佳人", "lv", 35, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 109, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 2180),
    90108, map("id", 90108, "name", "玲珑欢颜", "lv", 40, "kind", 9, "subKind", 2, "evenQuick", true, "quickMoney", 128, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 2560),
    90200, map("id", 90200, "name", "倾世之恋", "lv", 1, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 102, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 2040)
);
    }

    private static void init351() {
data.map(
    90201, map("id", 90201, "name", "仲夏夜之恋", "lv", 5, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 154, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 3080),
    90202, map("id", 90202, "name", "触摸你的心", "lv", 10, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 213, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 4260),
    90203, map("id", 90203, "name", "金风玉露", "lv", 15, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 267, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 5340),
    90204, map("id", 90204, "name", "笑盼君心", "lv", 20, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 329, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 6580),
    90205, map("id", 90205, "name", "伊人如梦", "lv", 25, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 386, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 7720)
);
    }

    private static void init352() {
data.map(
    90206, map("id", 90206, "name", "青青子吟", "lv", 30, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 438, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 8760),
    90207, map("id", 90207, "name", "雪域精灵", "lv", 35, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 508, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 10160),
    90208, map("id", 90208, "name", "花海迤逦", "lv", 40, "kind", 9, "subKind", 3, "evenQuick", true, "quickMoney", 577, "acquirePathway", true, "pathway", list(102), "pathwayKind", list(0), "stack", true, "useMode", 0, "money", 11540),
    90300, map("id", 90300, "name", "情有独钟", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 1980),
    90301, map("id", 90301, "name", "桃之妖妖", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 1980)
);
    }

    private static void init353() {
data.map(
    90302, map("id", 90302, "name", "我心悦你", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 1980),
    90303, map("id", 90303, "name", "白露为霜", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 199, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 3980),
    90304, map("id", 90304, "name", "美人含笑", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 199, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 3980),
    90305, map("id", 90305, "name", "天真之吻", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 199, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 3980),
    90306, map("id", 90306, "name", "热情如火", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 299, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 5980)
);
    }

    private static void init354() {
data.map(
    90307, map("id", 90307, "name", "傍水依人", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 299, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 5980),
    90308, map("id", 90308, "name", "瑰丽多姿", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 399, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 7980),
    90309, map("id", 90309, "name", "一米阳光", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 399, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 7980),
    90310, map("id", 90310, "name", "香水百合", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 499, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 9980),
    90311, map("id", 90311, "name", "我心永恒", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 499, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 9980)
);
    }

    private static void init355() {
data.map(
    90312, map("id", 90312, "name", "暖阳雏菊", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 599, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 11980),
    90313, map("id", 90313, "name", "曼珠沙华", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 599, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 11980),
    90314, map("id", 90314, "name", "蝶恋花", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 799, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 15980),
    90315, map("id", 90315, "name", "紫堇木棉", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 799, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 15980),
    90316, map("id", 90316, "name", "西子娇颜", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 999, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 19980)
);
    }

    private static void init356() {
data.map(
    90317, map("id", 90317, "name", "芙蓉出水", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 999, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 19980),
    90318, map("id", 90318, "name", "永世爱恋", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 1499, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 29980),
    90319, map("id", 90319, "name", "笑靥如花", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 1999, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 39980),
    90320, map("id", 90320, "name", "纯纯的爱", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 2499, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 49980),
    90321, map("id", 90321, "name", "蓝色妖姬", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 2999, "acquirePathway", true, "pathway", list(129, 116), "pathwayKind", list(0, 7), "stack", true, "useMode", 0, "systemNotice", true, "money", 59980)
);
    }

    private static void init357() {
data.map(
    90400, map("id", 90400, "name", "白脂宁玉簪", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 1, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 20),
    90401, map("id", 90401, "name", "翡绿绸穗白脂佩", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 1, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 20),
    90402, map("id", 90402, "name", "虫草雕花扁方", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 5, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 100),
    90403, map("id", 90403, "name", "西瓜碧玺手串", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 5, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 100),
    90404, map("id", 90404, "name", "祖母绿松石扳指", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 9, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 180)
);
    }

    private static void init358() {
data.map(
    90405, map("id", 90405, "name", "翡翠雕龙玉佩", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 9, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 180),
    90406, map("id", 90406, "name", "金银雕花香笼球", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 19, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 380),
    90407, map("id", 90407, "name", "景泰蓝珠花护甲", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 19, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 380),
    90408, map("id", 90408, "name", "铂金攒花发饰", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 25, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 500),
    90409, map("id", 90409, "name", "镂金掐丝护甲", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 29, "acquirePathway", true, "pathway", list(116, 112), "pathwayKind", list(7, 0), "stack", true, "useMode", 0, "money", 580)
);
    }

    private static void init359() {
data.map(
    90500, map("id", 90500, "name", "小粽仙", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90501, map("id", 90501, "name", "雪绒花", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90502, map("id", 90502, "name", "西瓜", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90503, map("id", 90503, "name", "冰淇淋", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90504, map("id", 90504, "name", "缤纷糖果", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init360() {
data.map(
    90505, map("id", 90505, "name", "龙凤呈祥", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90506, map("id", 90506, "name", "花束", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90507, map("id", 90507, "name", "为爱相随", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90508, map("id", 90508, "name", "嫦娥奔月", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90509, map("id", 90509, "name", "玉兔", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init361() {
data.map(
    90510, map("id", 90510, "name", "中秋月饼", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90511, map("id", 90511, "name", "欢庆国庆", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90512, map("id", 90512, "name", "南瓜灯", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90513, map("id", 90513, "name", "单身狗", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90514, map("id", 90514, "name", "感恩节彩蛋", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init362() {
data.map(
    90515, map("id", 90515, "name", "腰缠万贯", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90516, map("id", 90516, "name", "平安果", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90517, map("id", 90517, "name", "七彩琉璃灯", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90518, map("id", 90518, "name", "天降红包", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90519, map("id", 90519, "name", "财源滚滚", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init363() {
data.map(
    90520, map("id", 90520, "name", "赤豆汤圆", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90521, map("id", 90521, "name", "三生三世十里桃花", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90522, map("id", 90522, "name", "小黑龙", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90523, map("id", 90523, "name", "女王驾到", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90524, map("id", 90524, "name", "春意盎然", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init364() {
data.map(
    90525, map("id", 90525, "name", "愚情未了", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90526, map("id", 90526, "name", "杨柳春风飞纸鸢", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90527, map("id", 90527, "name", "长生果", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90528, map("id", 90528, "name", "欢度五一", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90529, map("id", 90529, "name", "感恩母亲节", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init365() {
data.map(
    90530, map("id", 90530, "name", "生日快乐", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90531, map("id", 90531, "name", "飞龙舟裹香粽", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90532, map("id", 90532, "name", "周年庆烟花", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90533, map("id", 90533, "name", "父亲节快乐", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90534, map("id", 90534, "name", "青莲濯夏至", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init366() {
data.map(
    90535, map("id", 90535, "name", "我们毕业啦", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90536, map("id", 90536, "name", "酷热小暑", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90537, map("id", 90537, "name", "夏日狂欢", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90538, map("id", 90538, "name", "炎炎大暑", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90539, map("id", 90539, "name", "宫廷嘉年华", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init367() {
data.map(
    90540, map("id", 90540, "name", "海洋之星", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90541, map("id", 90541, "name", "绿色情人节", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90542, map("id", 90542, "name", "处暑垂钓", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90543, map("id", 90543, "name", "浪漫七夕", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90544, map("id", 90544, "name", "开！开！开学啦", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980)
);
    }

    private static void init368() {
data.map(
    90545, map("id", 90545, "name", "教师节快乐", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90546, map("id", 90546, "name", "宫廷狂欢周", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90547, map("id", 90547, "name", "落叶秋分", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90548, map("id", 90548, "name", "花好月圆庆双节", "lv", 1, "kind", 9, "subKind", 99, "evenQuick", true, "quickMoney", 99, "stack", true, "useMode", 0, "money", 1980),
    90600, map("id", 90600, "name", "青菜", "lv", 1, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init369() {
data.map(
    90601, map("id", 90601, "name", "青椒", "lv", 1, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90602, map("id", 90602, "name", "土豆", "lv", 1, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90603, map("id", 90603, "name", "番茄", "lv", 1, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90604, map("id", 90604, "name", "白菜", "lv", 1, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90605, map("id", 90605, "name", "辣椒", "lv", 1, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init370() {
data.map(
    90606, map("id", 90606, "name", "黄瓜", "lv", 2, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90607, map("id", 90607, "name", "豌豆", "lv", 4, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144, 112), "pathwayKind", list(0, 13, 0), "stack", true, "useMode", 0, "money", 1),
    90608, map("id", 90608, "name", "芝麻", "lv", 2, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90609, map("id", 90609, "name", "茄子", "lv", 2, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90610, map("id", 90610, "name", "花生", "lv", 3, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init371() {
data.map(
    90611, map("id", 90611, "name", "胡萝卜", "lv", 3, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    90612, map("id", 90612, "name", "笋", "lv", 3, "kind", 9, "subKind", 10, "acquirePathway", true, "pathway", list(194, 144), "pathwayKind", list(0, 13), "stack", true, "useMode", 0, "money", 1),
    91000, map("id", 91000, "name", "铁线莲", "lv", 40, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 20, "stack", false, "useMode", 0, "money", 400),
    91001, map("id", 91001, "name", "满天星", "lv", 5, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 1, "stack", false, "useMode", 0, "money", 20),
    91002, map("id", 91002, "name", "茉莉花", "lv", 10, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 4, "stack", false, "useMode", 0, "money", 80)
);
    }

    private static void init372() {
data.map(
    91003, map("id", 91003, "name", "百合花", "lv", 15, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 5, "stack", false, "useMode", 0, "money", 100),
    91004, map("id", 91004, "name", "蒲公英", "lv", 20, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 8, "stack", false, "useMode", 0, "money", 160),
    91005, map("id", 91005, "name", "薰衣草", "lv", 25, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 9, "stack", false, "useMode", 0, "money", 180),
    91006, map("id", 91006, "name", "虞美人", "lv", 30, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 10, "stack", false, "useMode", 0, "money", 200),
    91007, map("id", 91007, "name", "雏菊", "lv", 35, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 15, "stack", false, "useMode", 0, "money", 300)
);
    }

    private static void init373() {
data.map(
    91008, map("id", 91008, "name", "红玫瑰", "lv", 1, "kind", 9, "subKind", 1, "evenQuick", true, "quickMoney", 1, "stack", false, "useMode", 0, "money", 20),
    91600, map("id", 91600, "name", "青菜", "lv", 1, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91601, map("id", 91601, "name", "青椒", "lv", 1, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91602, map("id", 91602, "name", "土豆", "lv", 1, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91603, map("id", 91603, "name", "番茄", "lv", 1, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init374() {
data.map(
    91604, map("id", 91604, "name", "白菜", "lv", 1, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91605, map("id", 91605, "name", "辣椒", "lv", 1, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91606, map("id", 91606, "name", "黄瓜", "lv", 2, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91607, map("id", 91607, "name", "豌豆", "lv", 4, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91608, map("id", 91608, "name", "芝麻", "lv", 2, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init375() {
data.map(
    91609, map("id", 91609, "name", "茄子", "lv", 2, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91610, map("id", 91610, "name", "花生", "lv", 3, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91611, map("id", 91611, "name", "胡萝卜", "lv", 3, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    91612, map("id", 91612, "name", "笋", "lv", 3, "kind", 9, "subKind", 10, "evenQuick", true, "acquirePathway", true, "pathway", list(194), "stack", false, "useMode", 0, "money", 1),
    92000, map("id", 92000, "name", "铜矿", "lv", 8, "kind", 9, "evenQuick", true, "quickMoney", 2, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 40)
);
    }

    private static void init376() {
data.map(
    92001, map("id", 92001, "name", "锡矿", "lv", 15, "kind", 9, "evenQuick", true, "quickMoney", 3, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 60),
    92002, map("id", 92002, "name", "青铜", "lv", 25, "kind", 9, "evenQuick", true, "quickMoney", 6, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 120),
    92003, map("id", 92003, "name", "铁矿", "lv", 35, "kind", 9, "evenQuick", true, "quickMoney", 11, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 220),
    92004, map("id", 92004, "name", "锗石矿", "lv", 45, "kind", 9, "evenQuick", true, "quickMoney", 13, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 260),
    92005, map("id", 92005, "name", "银矿", "lv", 55, "kind", 9, "evenQuick", true, "quickMoney", 15, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 300)
);
    }

    private static void init377() {
data.map(
    92006, map("id", 92006, "name", "金矿", "lv", 65, "kind", 9, "evenQuick", true, "quickMoney", 18, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 360),
    92007, map("id", 92007, "name", "钻石矿", "lv", 75, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92008, map("id", 92008, "name", "棉布", "lv", 8, "kind", 9, "evenQuick", true, "quickMoney", 2, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 40),
    92009, map("id", 92009, "name", "麻布", "lv", 15, "kind", 9, "evenQuick", true, "quickMoney", 3, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 60),
    92010, map("id", 92010, "name", "娟纱", "lv", 25, "kind", 9, "evenQuick", true, "quickMoney", 6, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 120)
);
    }

    private static void init378() {
data.map(
    92011, map("id", 92011, "name", "丝绸", "lv", 35, "kind", 9, "evenQuick", true, "quickMoney", 11, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 220),
    92012, map("id", 92012, "name", "呢绒", "lv", 45, "kind", 9, "evenQuick", true, "quickMoney", 13, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 260),
    92013, map("id", 92013, "name", "皮革", "lv", 55, "kind", 9, "evenQuick", true, "quickMoney", 15, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 300),
    92014, map("id", 92014, "name", "化纤", "lv", 65, "kind", 9, "evenQuick", true, "quickMoney", 18, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 360),
    92015, map("id", 92015, "name", "混纺", "lv", 75, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480)
);
    }

    private static void init379() {
data.map(
    92016, map("id", 92016, "name", "水晶", "lv", 85, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92017, map("id", 92017, "name", "琥珀", "lv", 95, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92018, map("id", 92018, "name", "金刚石", "lv", 105, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92019, map("id", 92019, "name", "陨石", "lv", 115, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92020, map("id", 92020, "name", "羊毛毯", "lv", 85, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480)
);
    }

    private static void init380() {
data.map(
    92021, map("id", 92021, "name", "锦缎", "lv", 95, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480),
    92022, map("id", 92022, "name", "牛皮", "lv", 105, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480),
    92023, map("id", 92023, "name", "织锦", "lv", 115, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480),
    92024, map("id", 92024, "name", "青金石", "lv", 125, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92025, map("id", 92025, "name", "菱锌石", "lv", 135, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480)
);
    }

    private static void init381() {
data.map(
    92026, map("id", 92026, "name", "孔雀石", "lv", 145, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92027, map("id", 92027, "name", "独山玉", "lv", 155, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", true, "useMode", 0, "money", 480),
    92028, map("id", 92028, "name", "金丝茧绸", "lv", 125, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480),
    92029, map("id", 92029, "name", "梅花云纱", "lv", 135, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480),
    92030, map("id", 92030, "name", "暗紫纹云锦", "lv", 145, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480)
);
    }

    private static void init382() {
data.map(
    92031, map("id", 92031, "name", "浮纹杭绸", "lv", 155, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", true, "useMode", 0, "money", 480),
    92100, map("id", 92100, "name", "明黄色", "lv", 8, "kind", 9, "evenQuick", true, "quickMoney", 2, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 40),
    92101, map("id", 92101, "name", "石青色", "lv", 15, "kind", 9, "evenQuick", true, "quickMoney", 3, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 60),
    92102, map("id", 92102, "name", "秋香色", "lv", 25, "kind", 9, "evenQuick", true, "quickMoney", 6, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 120),
    92103, map("id", 92103, "name", "海棠红", "lv", 35, "kind", 9, "evenQuick", true, "quickMoney", 11, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 220)
);
    }

    private static void init383() {
data.map(
    92104, map("id", 92104, "name", "月白色", "lv", 45, "kind", 9, "evenQuick", true, "quickMoney", 13, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 260),
    92105, map("id", 92105, "name", "杏黄色", "lv", 55, "kind", 9, "evenQuick", true, "quickMoney", 15, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 300),
    92106, map("id", 92106, "name", "雪灰色", "lv", 65, "kind", 9, "evenQuick", true, "quickMoney", 18, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 360),
    92107, map("id", 92107, "name", "七彩色", "lv", 75, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    92108, map("id", 92108, "name", "梅香色", "lv", 85, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480)
);
    }

    private static void init384() {
data.map(
    92109, map("id", 92109, "name", "蔚蓝色", "lv", 95, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    92110, map("id", 92110, "name", "金沙色", "lv", 105, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    92111, map("id", 92111, "name", "翡翠色", "lv", 115, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    92112, map("id", 92112, "name", "蓝灵沙", "lv", 125, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    92113, map("id", 92113, "name", "暖橘沙", "lv", 135, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480)
);
    }

    private static void init385() {
data.map(
    92114, map("id", 92114, "name", "青岚沙", "lv", 145, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    92115, map("id", 92115, "name", "幻紫沙", "lv", 155, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", true, "useMode", 0, "money", 480),
    93000, map("id", 93000, "name", "铜矿", "lv", 10, "kind", 9, "evenQuick", true, "quickMoney", 2, "stack", false, "useMode", 0, "money", 40),
    93001, map("id", 93001, "name", "锡矿", "lv", 15, "kind", 9, "evenQuick", true, "quickMoney", 3, "stack", false, "useMode", 0, "money", 60),
    93002, map("id", 93002, "name", "青铜", "lv", 25, "kind", 9, "evenQuick", true, "quickMoney", 6, "stack", false, "useMode", 0, "money", 120)
);
    }

    private static void init386() {
data.map(
    93003, map("id", 93003, "name", "铁矿", "lv", 35, "kind", 9, "evenQuick", true, "quickMoney", 11, "stack", false, "useMode", 0, "money", 220),
    93004, map("id", 93004, "name", "锗石矿", "lv", 45, "kind", 9, "evenQuick", true, "quickMoney", 13, "stack", false, "useMode", 0, "money", 260),
    93005, map("id", 93005, "name", "银矿", "lv", 55, "kind", 9, "evenQuick", true, "quickMoney", 15, "stack", false, "useMode", 0, "money", 300),
    93006, map("id", 93006, "name", "金矿", "lv", 65, "kind", 9, "evenQuick", true, "quickMoney", 18, "stack", false, "useMode", 0, "money", 360),
    93007, map("id", 93007, "name", "钻石矿", "lv", 75, "kind", 9, "evenQuick", true, "quickMoney", 24, "stack", false, "useMode", 0, "money", 480)
);
    }

    private static void init387() {
data.map(
    93008, map("id", 93008, "name", "棉布", "lv", 10, "kind", 9, "evenQuick", true, "quickMoney", 2, "stack", false, "useMode", 0, "money", 40),
    93009, map("id", 93009, "name", "麻布", "lv", 15, "kind", 9, "evenQuick", true, "quickMoney", 3, "stack", false, "useMode", 0, "money", 60),
    93010, map("id", 93010, "name", "娟纱", "lv", 25, "kind", 9, "evenQuick", true, "quickMoney", 6, "stack", false, "useMode", 0, "money", 120),
    93011, map("id", 93011, "name", "丝绸", "lv", 35, "kind", 9, "evenQuick", true, "quickMoney", 11, "stack", false, "useMode", 0, "money", 220),
    93012, map("id", 93012, "name", "呢绒", "lv", 45, "kind", 9, "evenQuick", true, "quickMoney", 13, "stack", false, "useMode", 0, "money", 260)
);
    }

    private static void init388() {
data.map(
    93013, map("id", 93013, "name", "皮革", "lv", 55, "kind", 9, "evenQuick", true, "quickMoney", 15, "stack", false, "useMode", 0, "money", 300),
    93014, map("id", 93014, "name", "化纤", "lv", 65, "kind", 9, "evenQuick", true, "quickMoney", 18, "stack", false, "useMode", 0, "money", 360),
    93015, map("id", 93015, "name", "混纺", "lv", 75, "kind", 9, "evenQuick", true, "quickMoney", 24, "stack", false, "useMode", 0, "money", 480),
    93016, map("id", 93016, "name", "水晶", "lv", 85, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480),
    93017, map("id", 93017, "name", "琥珀", "lv", 95, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480)
);
    }

    private static void init389() {
data.map(
    93018, map("id", 93018, "name", "金刚石", "lv", 105, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480),
    93019, map("id", 93019, "name", "陨石", "lv", 115, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480),
    93020, map("id", 93020, "name", "羊毛毯", "lv", 85, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93021, map("id", 93021, "name", "锦缎", "lv", 95, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93022, map("id", 93022, "name", "牛皮", "lv", 105, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480)
);
    }

    private static void init390() {
data.map(
    93023, map("id", 93023, "name", "织锦", "lv", 115, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93024, map("id", 93024, "name", "青金石", "lv", 125, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480),
    93025, map("id", 93025, "name", "菱锌石", "lv", 135, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480),
    93026, map("id", 93026, "name", "孔雀石", "lv", 145, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480),
    93027, map("id", 93027, "name", "独山玉", "lv", 155, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(142), "pathwayKind", list(1), "stack", false, "useMode", 0, "money", 480)
);
    }

    private static void init391() {
data.map(
    93028, map("id", 93028, "name", "金丝茧绸", "lv", 125, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93029, map("id", 93029, "name", "梅花云纱", "lv", 135, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93030, map("id", 93030, "name", "暗紫纹云锦", "lv", 145, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93031, map("id", 93031, "name", "浮纹杭绸", "lv", 155, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(143), "pathwayKind", list(2), "stack", false, "useMode", 0, "money", 480),
    93100, map("id", 93100, "name", "明黄色", "lv", 10, "kind", 9, "evenQuick", true, "quickMoney", 2, "stack", false, "useMode", 0, "money", 40)
);
    }

    private static void init392() {
data.map(
    93101, map("id", 93101, "name", "石青色", "lv", 15, "kind", 9, "evenQuick", true, "quickMoney", 3, "stack", false, "useMode", 0, "money", 60),
    93102, map("id", 93102, "name", "秋香色", "lv", 25, "kind", 9, "evenQuick", true, "quickMoney", 6, "stack", false, "useMode", 0, "money", 120),
    93103, map("id", 93103, "name", "海棠红", "lv", 35, "kind", 9, "evenQuick", true, "quickMoney", 11, "stack", false, "useMode", 0, "money", 220),
    93104, map("id", 93104, "name", "月白色", "lv", 45, "kind", 9, "evenQuick", true, "quickMoney", 13, "stack", false, "useMode", 0, "money", 260),
    93105, map("id", 93105, "name", "杏黄色", "lv", 55, "kind", 9, "evenQuick", true, "quickMoney", 15, "stack", false, "useMode", 0, "money", 300)
);
    }

    private static void init393() {
data.map(
    93106, map("id", 93106, "name", "雪灰色", "lv", 65, "kind", 9, "evenQuick", true, "quickMoney", 18, "stack", false, "useMode", 0, "money", 360),
    93107, map("id", 93107, "name", "七彩色", "lv", 75, "kind", 9, "evenQuick", true, "quickMoney", 24, "stack", false, "useMode", 0, "money", 480),
    93108, map("id", 93108, "name", "香梅粉", "lv", 85, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480),
    93109, map("id", 93109, "name", "蔚蓝粉", "lv", 95, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480),
    93110, map("id", 93110, "name", "金沙粉", "lv", 105, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480)
);
    }

    private static void init394() {
data.map(
    93111, map("id", 93111, "name", "翠竹粉", "lv", 115, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480),
    93112, map("id", 93112, "name", "蓝灵沙", "lv", 125, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480),
    93113, map("id", 93113, "name", "暖橘沙", "lv", 135, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480),
    93114, map("id", 93114, "name", "青岚沙", "lv", 145, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480),
    93115, map("id", 93115, "name", "幻紫沙", "lv", 155, "kind", 9, "evenQuick", true, "quickMoney", 24, "acquirePathway", true, "pathway", list(147), "pathwayKind", list(6), "stack", false, "useMode", 0, "money", 480)
);
    }

    private static void init395() {
data.map(
    94000, map("id", 94000, "name", "10级武器图纸", "lv", 10, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 200),
    94001, map("id", 94001, "name", "20级武器图纸", "lv", 20, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 600),
    94002, map("id", 94002, "name", "30级武器图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94003, map("id", 94003, "name", "40级武器图纸", "lv", 40, "kind", 2, "evenQuick", true, "quickMoney", 90, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1800),
    94004, map("id", 94004, "name", "50级武器图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400)
);
    }

    private static void init396() {
data.map(
    94005, map("id", 94005, "name", "60级武器图纸", "lv", 60, "kind", 2, "evenQuick", true, "quickMoney", 140, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2800),
    94006, map("id", 94006, "name", "70级武器图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94007, map("id", 94007, "name", "80级武器图纸", "lv", 80, "kind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 4200),
    94008, map("id", 94008, "name", "10级衣服图纸", "lv", 10, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 200),
    94009, map("id", 94009, "name", "20级衣服图纸", "lv", 20, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 600)
);
    }

    private static void init397() {
data.map(
    94010, map("id", 94010, "name", "30级衣服图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94011, map("id", 94011, "name", "40级衣服图纸", "lv", 40, "kind", 2, "evenQuick", true, "quickMoney", 90, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1800),
    94012, map("id", 94012, "name", "50级衣服图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400),
    94013, map("id", 94013, "name", "60级衣服图纸", "lv", 60, "kind", 2, "evenQuick", true, "quickMoney", 140, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2800),
    94014, map("id", 94014, "name", "70级衣服图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400)
);
    }

    private static void init398() {
data.map(
    94015, map("id", 94015, "name", "80级衣服图纸", "lv", 80, "kind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 4200),
    94016, map("id", 94016, "name", "10级帽子图纸", "lv", 10, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 200),
    94017, map("id", 94017, "name", "20级帽子图纸", "lv", 20, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 600),
    94018, map("id", 94018, "name", "30级帽子图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94019, map("id", 94019, "name", "40级帽子图纸", "lv", 40, "kind", 2, "evenQuick", true, "quickMoney", 90, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1800)
);
    }

    private static void init399() {
data.map(
    94020, map("id", 94020, "name", "50级帽子图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400),
    94021, map("id", 94021, "name", "60级帽子图纸", "lv", 60, "kind", 2, "evenQuick", true, "quickMoney", 140, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2800),
    94022, map("id", 94022, "name", "70级帽子图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94023, map("id", 94023, "name", "80级帽子图纸", "lv", 80, "kind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 4200),
    94024, map("id", 94024, "name", "10级腰带图纸", "lv", 10, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 200)
);
    }

    private static void init400() {
data.map(
    94025, map("id", 94025, "name", "20级腰带图纸", "lv", 20, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 600),
    94026, map("id", 94026, "name", "30级腰带图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94027, map("id", 94027, "name", "40级腰带图纸", "lv", 40, "kind", 2, "evenQuick", true, "quickMoney", 90, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1800),
    94028, map("id", 94028, "name", "50级腰带图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400),
    94029, map("id", 94029, "name", "60级腰带图纸", "lv", 60, "kind", 2, "evenQuick", true, "quickMoney", 140, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2800)
);
    }

    private static void init401() {
data.map(
    94030, map("id", 94030, "name", "70级腰带图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94031, map("id", 94031, "name", "80级腰带图纸", "lv", 80, "kind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 4200),
    94032, map("id", 94032, "name", "10级鞋子图纸", "lv", 10, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 200),
    94033, map("id", 94033, "name", "20级鞋子图纸", "lv", 20, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 600),
    94034, map("id", 94034, "name", "30级鞋子图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init402() {
data.map(
    94035, map("id", 94035, "name", "40级鞋子图纸", "lv", 40, "kind", 2, "evenQuick", true, "quickMoney", 90, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1800),
    94036, map("id", 94036, "name", "50级鞋子图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400),
    94037, map("id", 94037, "name", "60级鞋子图纸", "lv", 60, "kind", 2, "evenQuick", true, "quickMoney", 140, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2800),
    94038, map("id", 94038, "name", "70级鞋子图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94039, map("id", 94039, "name", "80级鞋子图纸", "lv", 80, "kind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 4200)
);
    }

    private static void init403() {
data.map(
    94040, map("id", 94040, "name", "10级项链图纸", "lv", 10, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 200),
    94041, map("id", 94041, "name", "20级项链图纸", "lv", 20, "kind", 2, "evenQuick", true, "quickMoney", 30, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 600),
    94042, map("id", 94042, "name", "30级项链图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94043, map("id", 94043, "name", "40级项链图纸", "lv", 40, "kind", 2, "evenQuick", true, "quickMoney", 90, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1800),
    94044, map("id", 94044, "name", "50级项链图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400)
);
    }

    private static void init404() {
data.map(
    94045, map("id", 94045, "name", "60级项链图纸", "lv", 60, "kind", 2, "evenQuick", true, "quickMoney", 140, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2800),
    94046, map("id", 94046, "name", "70级项链图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94047, map("id", 94047, "name", "80级项链图纸", "lv", 80, "kind", 2, "evenQuick", true, "quickMoney", 210, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 4200),
    94048, map("id", 94048, "name", "武器提炼石", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1),
    94049, map("id", 94049, "name", "衣服提炼石", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init405() {
data.map(
    94050, map("id", 94050, "name", "帽子提炼石", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1),
    94051, map("id", 94051, "name", "腰带提炼石", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1),
    94052, map("id", 94052, "name", "鞋子提炼石", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1),
    94053, map("id", 94053, "name", "项链提炼石", "lv", 1, "kind", 2, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1),
    94054, map("id", 94054, "name", "武器制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 400)
);
    }

    private static void init406() {
data.map(
    94055, map("id", 94055, "name", "衣服制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 400),
    94056, map("id", 94056, "name", "帽子制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 400),
    94057, map("id", 94057, "name", "腰带制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 400),
    94058, map("id", 94058, "name", "鞋子制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 400),
    94059, map("id", 94059, "name", "项链制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 400)
);
    }

    private static void init407() {
data.map(
    94060, map("id", 94060, "name", "属性转换石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 12), "stack", true, "useMode", 0, "money", 400),
    94061, map("id", 94061, "name", "摘星石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145, 112), "pathwayKind", list(10, 12, 0), "stack", true, "useMode", 0, "money", 400),
    94062, map("id", 94062, "name", "强化石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 1, "acquirePathway", true, "pathway", list(116, 145, 112), "pathwayKind", list(10, 5, 0), "stack", true, "useMode", 0, "money", 20),
    94063, map("id", 94063, "name", "进阶石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116, 145, 112), "pathwayKind", list(10, 5, 0), "stack", true, "useMode", 0, "money", 400),
    94064, map("id", 94064, "name", "碎裂的宝石结晶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init408() {
data.map(
    94065, map("id", 94065, "name", "普通的宝石结晶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 100, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 2000),
    94066, map("id", 94066, "name", "精致的宝石结晶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 200, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 4000),
    94067, map("id", 94067, "name", "无暇的宝石结晶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 400, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 8000),
    94068, map("id", 94068, "name", "完美的宝石结晶", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 800, "acquirePathway", true, "pathway", list(116, 145), "pathwayKind", list(10, 5), "stack", true, "useMode", 0, "money", 16000),
    94069, map("id", 94069, "name", "皇子项圈制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(11), "stack", true, "useMode", 0, "money", 400)
);
    }

    private static void init409() {
data.map(
    94070, map("id", 94070, "name", "皇子对镯制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(11), "stack", true, "useMode", 0, "money", 400),
    94071, map("id", 94071, "name", "皇子腰链制造石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 20, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(11), "stack", true, "useMode", 0, "money", 400),
    94072, map("id", 94072, "name", "精炼石", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 200),
    94073, map("id", 94073, "name", "初级幸运符", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 10, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 200),
    94074, map("id", 94074, "name", "中级幸运符", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init410() {
data.map(
    94075, map("id", 94075, "name", "高级幸运符", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 200, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 4000),
    94076, map("id", 94076, "name", "特级幸运符", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 10000),
    94077, map("id", 94077, "name", "超级幸运符", "lv", 1, "kind", 2, "evenQuick", true, "quickMoney", 2800, "acquirePathway", true, "pathway", list(116), "pathwayKind", list(10), "stack", true, "useMode", 0, "money", 56000),
    94900, map("id", 94900, "name", "30级项圈图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94901, map("id", 94901, "name", "50级项圈图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400)
);
    }

    private static void init411() {
data.map(
    94902, map("id", 94902, "name", "70级项圈图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94903, map("id", 94903, "name", "30级对镯图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000),
    94904, map("id", 94904, "name", "50级对镯图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400),
    94905, map("id", 94905, "name", "70级对镯图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94906, map("id", 94906, "name", "30级腰链图纸", "lv", 30, "kind", 2, "evenQuick", true, "quickMoney", 50, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 1000)
);
    }

    private static void init412() {
data.map(
    94907, map("id", 94907, "name", "50级腰链图纸", "lv", 50, "kind", 2, "evenQuick", true, "quickMoney", 120, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 2400),
    94908, map("id", 94908, "name", "70级腰链图纸", "lv", 70, "kind", 2, "evenQuick", true, "quickMoney", 170, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 3400),
    94909, map("id", 94909, "name", "90级武器图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94910, map("id", 94910, "name", "100级武器图纸", "lv", 100, "kind", 2, "evenQuick", true, "quickMoney", 310, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 6200),
    94911, map("id", 94911, "name", "110级武器图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200)
);
    }

    private static void init413() {
data.map(
    94912, map("id", 94912, "name", "120级武器图纸", "lv", 120, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94913, map("id", 94913, "name", "90级衣服图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94914, map("id", 94914, "name", "100级衣服图纸", "lv", 100, "kind", 2, "evenQuick", true, "quickMoney", 310, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 6200),
    94915, map("id", 94915, "name", "110级衣服图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94916, map("id", 94916, "name", "120级衣服图纸", "lv", 120, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init414() {
data.map(
    94917, map("id", 94917, "name", "90级帽子图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94918, map("id", 94918, "name", "100级帽子图纸", "lv", 100, "kind", 2, "evenQuick", true, "quickMoney", 310, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 6200),
    94919, map("id", 94919, "name", "110级帽子图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94920, map("id", 94920, "name", "120级帽子图纸", "lv", 120, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94921, map("id", 94921, "name", "90级腰带图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200)
);
    }

    private static void init415() {
data.map(
    94922, map("id", 94922, "name", "100级腰带图纸", "lv", 100, "kind", 2, "evenQuick", true, "quickMoney", 310, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 6200),
    94923, map("id", 94923, "name", "110级腰带图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94924, map("id", 94924, "name", "120级腰带图纸", "lv", 120, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94925, map("id", 94925, "name", "90级鞋子图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94926, map("id", 94926, "name", "100级鞋子图纸", "lv", 100, "kind", 2, "evenQuick", true, "quickMoney", 310, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 6200)
);
    }

    private static void init416() {
data.map(
    94927, map("id", 94927, "name", "110级鞋子图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94928, map("id", 94928, "name", "120级鞋子图纸", "lv", 120, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94929, map("id", 94929, "name", "90级项链图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94930, map("id", 94930, "name", "100级项链图纸", "lv", 100, "kind", 2, "evenQuick", true, "quickMoney", 310, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 6200),
    94931, map("id", 94931, "name", "110级项链图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200)
);
    }

    private static void init417() {
data.map(
    94932, map("id", 94932, "name", "120级项链图纸", "lv", 120, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94933, map("id", 94933, "name", "90级项圈图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94934, map("id", 94934, "name", "110级项圈图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94935, map("id", 94935, "name", "90级对镯图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94936, map("id", 94936, "name", "110级对镯图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200)
);
    }

    private static void init418() {
data.map(
    94937, map("id", 94937, "name", "90级腰链图纸", "lv", 90, "kind", 2, "evenQuick", true, "quickMoney", 260, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 5200),
    94938, map("id", 94938, "name", "110级腰链图纸", "lv", 110, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94939, map("id", 94939, "name", "130级武器图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94940, map("id", 94940, "name", "140级武器图纸", "lv", 140, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94941, map("id", 94941, "name", "150级武器图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init419() {
data.map(
    94942, map("id", 94942, "name", "160级武器图纸", "lv", 160, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94943, map("id", 94943, "name", "130级衣服图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94944, map("id", 94944, "name", "140级衣服图纸", "lv", 140, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94945, map("id", 94945, "name", "150级衣服图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94946, map("id", 94946, "name", "160级衣服图纸", "lv", 160, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init420() {
data.map(
    94947, map("id", 94947, "name", "130级帽子图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94948, map("id", 94948, "name", "140级帽子图纸", "lv", 140, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94949, map("id", 94949, "name", "150级帽子图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94950, map("id", 94950, "name", "160级帽子图纸", "lv", 160, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94951, map("id", 94951, "name", "130级腰带图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init421() {
data.map(
    94952, map("id", 94952, "name", "140级腰带图纸", "lv", 140, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94953, map("id", 94953, "name", "150级腰带图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94954, map("id", 94954, "name", "160级腰带图纸", "lv", 160, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94955, map("id", 94955, "name", "130级鞋子图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94956, map("id", 94956, "name", "140级鞋子图纸", "lv", 140, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init422() {
data.map(
    94957, map("id", 94957, "name", "150级鞋子图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94958, map("id", 94958, "name", "160级鞋子图纸", "lv", 160, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94959, map("id", 94959, "name", "130级项链图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94960, map("id", 94960, "name", "140级项链图纸", "lv", 140, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94961, map("id", 94961, "name", "150级项链图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200)
);
    }

    private static void init423() {
data.map(
    94962, map("id", 94962, "name", "160级项链图纸", "lv", 160, "kind", 2, "evenQuick", true, "quickMoney", 410, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 8200),
    94963, map("id", 94963, "name", "130级项圈图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94964, map("id", 94964, "name", "150级项圈图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94965, map("id", 94965, "name", "130级对镯图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94966, map("id", 94966, "name", "150级对镯图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200)
);
    }

    private static void init424() {
data.map(
    94967, map("id", 94967, "name", "130级腰链图纸", "lv", 130, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    94968, map("id", 94968, "name", "150级腰链图纸", "lv", 150, "kind", 2, "evenQuick", true, "quickMoney", 360, "acquirePathway", true, "pathway", list(145), "pathwayKind", list(4), "stack", true, "useMode", 0, "money", 7200),
    95000, map("id", 95000, "name", "480经验", "lv", 1, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    95001, map("id", 95001, "name", "960经验", "lv", 12, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    95002, map("id", 95002, "name", "1920经验", "lv", 24, "kind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init425() {
data.map(
    95004, map("id", 95004, "name", "3840经验", "lv", 36, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    95005, map("id", 95005, "name", "5760经验", "lv", 48, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    95100, map("id", 95100, "name", "480经验", "lv", 1, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    95101, map("id", 95101, "name", "960经验", "lv", 12, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    95102, map("id", 95102, "name", "1920经验", "lv", 24, "kind", 9, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init426() {
data.map(
    95104, map("id", 95104, "name", "3840经验", "lv", 36, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    95105, map("id", 95105, "name", "5760经验", "lv", 48, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    96000, map("id", 96000, "name", "750银两", "lv", 1, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    96001, map("id", 96001, "name", "1500银两", "lv", 9, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    96002, map("id", 96002, "name", "3000银两", "lv", 18, "kind", 9, "stack", true, "useMode", 0, "money", 1)
);
    }

    private static void init427() {
data.map(
    96004, map("id", 96004, "name", "6000银两", "lv", 27, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    96005, map("id", 96005, "name", "12000银两", "lv", 36, "kind", 9, "stack", true, "useMode", 0, "money", 1),
    96100, map("id", 96100, "name", "750银两", "lv", 1, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    96101, map("id", 96101, "name", "1500银两", "lv", 9, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    96102, map("id", 96102, "name", "3000银两", "lv", 18, "kind", 9, "stack", false, "useMode", 0, "money", 1)
);
    }

    private static void init428() {
data.map(
    96104, map("id", 96104, "name", "6000银两", "lv", 27, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    96105, map("id", 96105, "name", "12000银两", "lv", 36, "kind", 9, "stack", false, "useMode", 0, "money", 1),
    97000, map("id", 97000, "name", "铜鱼钩", "lv", 1, "kind", 9, "evenQuick", true, "quickMoney", 1, "stack", true, "useMode", 0, "money", 20),
    97001, map("id", 97001, "name", "银鱼钩", "lv", 1, "kind", 9, "evenQuick", true, "quickMoney", 20, "stack", true, "useMode", 0, "money", 400),
    97002, map("id", 97002, "name", "金鱼钩", "lv", 1, "kind", 9, "evenQuick", true, "quickMoney", 40, "stack", true, "useMode", 0, "money", 800)
);
    }

    private static void init429() {
data.map(
    97100, map("id", 97100, "name", "铜鱼钩", "lv", 1, "kind", 9, "evenQuick", true, "quickMoney", 1, "stack", false, "useMode", 0, "money", 20),
    97101, map("id", 97101, "name", "银鱼钩", "lv", 1, "kind", 9, "evenQuick", true, "quickMoney", 20, "stack", false, "useMode", 0, "money", 400),
    97102, map("id", 97102, "name", "金鱼钩", "lv", 1, "kind", 9, "evenQuick", true, "quickMoney", 40, "stack", false, "useMode", 0, "money", 800),
    100000, map("id", 100000, "name", "尚未饲养西伯利亚喵", "lv", 1, "kind", 10, "targetId", 100000, "stack", true, "useMode", 5, "money", 1),
    100001, map("id", 100001, "name", "尚未饲养斗牛犬", "lv", 1, "kind", 10, "targetId", 100001, "stack", true, "useMode", 5, "money", 1)
);
    }

    private static void init430() {
data.map(
    100002, map("id", 100002, "name", "尚未饲养汗血马", "lv", 1, "kind", 10, "targetId", 100010, "stack", true, "useMode", 5, "money", 1),
    100003, map("id", 100003, "name", "尚未饲养大狸猫", "lv", 1, "kind", 10, "targetId", 100011, "stack", true, "useMode", 5, "money", 1),
    100004, map("id", 100004, "name", "尚未饲养奶油斗牛", "lv", 1, "kind", 10, "targetId", 100008, "stack", true, "useMode", 5, "money", 1),
    100005, map("id", 100005, "name", "尚未饲养小马驹", "lv", 1, "kind", 10, "targetId", 100002, "stack", true, "useMode", 5, "money", 1),
    100006, map("id", 100006, "name", "尚未饲养白龙马", "lv", 1, "kind", 10, "targetId", 100012, "stack", true, "useMode", 5, "money", 1)
);
    }

    private static void init431() {
data.map(
    100100, map("id", 100100, "name", "猪", "lv", 1, "kind", 14, "subKind", 1, "stack", true, "useMode", 5, "money", 1),
    100101, map("id", 100101, "name", "鸡", "lv", 1, "kind", 14, "subKind", 2, "stack", true, "useMode", 5, "money", 1),
    110000, map("id", 110000, "name", "尚未建造大理石石板", "lv", 1, "kind", 11, "targetId", 2000, "stack", true, "useMode", 6, "money", 1),
    110001, map("id", 110001, "name", "尚未建造鹅卵石石板", "lv", 1, "kind", 11, "targetId", 2001, "stack", true, "useMode", 6, "money", 1),
    110002, map("id", 110002, "name", "尚未建造青石板", "lv", 1, "kind", 11, "targetId", 2002, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init432() {
data.map(
    110003, map("id", 110003, "name", "尚未建造镏金水缸", "lv", 1, "kind", 11, "targetId", 2003, "stack", true, "useMode", 6, "money", 1),
    110004, map("id", 110004, "name", "尚未建造红木栅栏", "lv", 1, "kind", 11, "targetId", 2004, "stack", true, "useMode", 6, "money", 1),
    110005, map("id", 110005, "name", "尚未建造暗香浮动", "lv", 1, "kind", 11, "targetId", 2005, "stack", true, "useMode", 6, "money", 1),
    110006, map("id", 110006, "name", "尚未建造欧式珍珠喷泉", "lv", 1, "kind", 11, "targetId", 2006, "stack", true, "useMode", 6, "money", 1),
    110007, map("id", 110007, "name", "尚未建造心形池塘", "lv", 1, "kind", 11, "targetId", 2007, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init433() {
data.map(
    110008, map("id", 110008, "name", "尚未建造花篱笆", "lv", 1, "kind", 11, "targetId", 2008, "stack", true, "useMode", 6, "money", 1),
    110009, map("id", 110009, "name", "尚未建造草丛墙", "lv", 1, "kind", 11, "targetId", 2009, "stack", true, "useMode", 6, "money", 1),
    110010, map("id", 110010, "name", "尚未建造独立宫灯", "lv", 1, "kind", 11, "targetId", 2010, "stack", true, "useMode", 6, "money", 1),
    110011, map("id", 110011, "name", "尚未建造石塔灯", "lv", 1, "kind", 11, "targetId", 2011, "stack", true, "useMode", 6, "money", 1),
    110012, map("id", 110012, "name", "尚未建造红木塔灯", "lv", 1, "kind", 11, "targetId", 2012, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init434() {
data.map(
    110013, map("id", 110013, "name", "尚未建造百花亭", "lv", 1, "kind", 11, "targetId", 2013, "stack", true, "useMode", 6, "money", 1),
    110014, map("id", 110014, "name", "尚未建造珐琅彩绘鱼缸", "lv", 1, "kind", 11, "targetId", 2014, "stack", true, "useMode", 6, "money", 1),
    110015, map("id", 110015, "name", "尚未建造双耳圆壶花盆", "lv", 1, "kind", 11, "targetId", 2015, "stack", true, "useMode", 6, "money", 1),
    110016, map("id", 110016, "name", "尚未建造相思桥", "lv", 1, "kind", 11, "targetId", 2016, "stack", true, "useMode", 6, "money", 1),
    110017, map("id", 110017, "name", "尚未建造稻草人", "lv", 1, "kind", 11, "targetId", 2017, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init435() {
data.map(
    110018, map("id", 110018, "name", "尚未建造九龙壁", "lv", 1, "kind", 11, "targetId", 2019, "stack", true, "useMode", 6, "money", 1),
    110019, map("id", 110019, "name", "尚未建造圆明园欧式观景台", "lv", 1, "kind", 11, "targetId", 2020, "stack", true, "useMode", 6, "money", 1),
    110020, map("id", 110020, "name", "尚未建造圆明园罗马柱", "lv", 1, "kind", 11, "targetId", 2021, "stack", true, "useMode", 6, "money", 1),
    110021, map("id", 110021, "name", "尚未建造绣球石狮子", "lv", 1, "kind", 11, "targetId", 2022, "stack", true, "useMode", 6, "money", 1),
    110022, map("id", 110022, "name", "尚未建造大雄石狮子", "lv", 1, "kind", 11, "targetId", 2023, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init436() {
data.map(
    110023, map("id", 110023, "name", "尚未建造大宫灯（左）", "lv", 1, "kind", 11, "targetId", 2024, "stack", true, "useMode", 6, "money", 1),
    110024, map("id", 110024, "name", "尚未建造大宫灯（右）", "lv", 1, "kind", 11, "targetId", 2025, "stack", true, "useMode", 6, "money", 1),
    110025, map("id", 110025, "name", "尚未建造皇家马厩", "lv", 1, "kind", 11, "targetId", 2026, "stack", true, "useMode", 6, "money", 1),
    110026, map("id", 110026, "name", "尚未建造水井", "lv", 1, "kind", 11, "targetId", 2027, "stack", true, "useMode", 6, "money", 1),
    110027, map("id", 110027, "name", "尚未建造普通石墙", "lv", 1, "kind", 11, "targetId", 2028, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init437() {
data.map(
    110028, map("id", 110028, "name", "尚未建造金色石墙", "lv", 1, "kind", 11, "targetId", 2029, "stack", true, "useMode", 6, "money", 1),
    110029, map("id", 110029, "name", "尚未建造龙飞凤舞牌坊", "lv", 1, "kind", 11, "targetId", 2030, "stack", true, "useMode", 6, "money", 1),
    110030, map("id", 110030, "name", "尚未建造石桌", "lv", 1, "kind", 11, "targetId", 2031, "stack", true, "useMode", 6, "money", 1),
    110031, map("id", 110031, "name", "尚未建造大水法", "lv", 1, "kind", 11, "targetId", 2032, "stack", true, "useMode", 6, "money", 1),
    110032, map("id", 110032, "name", "尚未建造石凳", "lv", 1, "kind", 11, "targetId", 2033, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init438() {
data.map(
    110033, map("id", 110033, "name", "尚未建造猫窝", "lv", 1, "kind", 11, "targetId", 2034, "stack", true, "useMode", 6, "money", 1),
    110034, map("id", 110034, "name", "尚未建造狗窝", "lv", 1, "kind", 11, "targetId", 2035, "stack", true, "useMode", 6, "money", 1),
    110035, map("id", 110035, "name", "尚未建造浅色地板", "lv", 1, "kind", 11, "targetId", 2036, "stack", true, "useMode", 6, "money", 1),
    110036, map("id", 110036, "name", "尚未建造浅色地板（上）", "lv", 1, "kind", 11, "targetId", 2037, "stack", true, "useMode", 6, "money", 1),
    110037, map("id", 110037, "name", "尚未建造浅色地板（左）", "lv", 1, "kind", 11, "targetId", 2038, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init439() {
data.map(
    110038, map("id", 110038, "name", "尚未建造浅色地板（下）", "lv", 1, "kind", 11, "targetId", 2039, "stack", true, "useMode", 6, "money", 1),
    110039, map("id", 110039, "name", "尚未建造深色地板", "lv", 1, "kind", 11, "targetId", 2040, "stack", true, "useMode", 6, "money", 1),
    110040, map("id", 110040, "name", "尚未建造深色地板（上）", "lv", 1, "kind", 11, "targetId", 2041, "stack", true, "useMode", 6, "money", 1),
    110041, map("id", 110041, "name", "尚未建造深色地板（左）", "lv", 1, "kind", 11, "targetId", 2042, "stack", true, "useMode", 6, "money", 1),
    110042, map("id", 110042, "name", "尚未建造深色地板（下）", "lv", 1, "kind", 11, "targetId", 2043, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init440() {
data.map(
    110043, map("id", 110043, "name", "尚未建造皇家鹅卵石石板", "lv", 1, "kind", 11, "targetId", 2044, "stack", true, "useMode", 6, "money", 1),
    110044, map("id", 110044, "name", "尚未建造皇家地毯（1）", "lv", 1, "kind", 11, "targetId", 2045, "stack", true, "useMode", 6, "money", 1),
    110045, map("id", 110045, "name", "尚未建造皇家地毯（2）", "lv", 1, "kind", 11, "targetId", 2046, "stack", true, "useMode", 6, "money", 1),
    110046, map("id", 110046, "name", "尚未建造皇家地毯（3）", "lv", 1, "kind", 11, "targetId", 2047, "stack", true, "useMode", 6, "money", 1),
    110047, map("id", 110047, "name", "尚未建造人字砖石板", "lv", 1, "kind", 11, "targetId", 2048, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init441() {
data.map(
    110048, map("id", 110048, "name", "尚未建造石砖路石板", "lv", 1, "kind", 11, "targetId", 2049, "stack", true, "useMode", 6, "money", 1),
    110049, map("id", 110049, "name", "尚未建造雕花圆砖", "lv", 1, "kind", 11, "targetId", 2050, "stack", true, "useMode", 6, "money", 1),
    110050, map("id", 110050, "name", "尚未建造雕花方砖", "lv", 1, "kind", 11, "targetId", 2051, "stack", true, "useMode", 6, "money", 1),
    110051, map("id", 110051, "name", "尚未建造碧桃", "lv", 1, "kind", 11, "targetId", 3001, "stack", true, "useMode", 6, "money", 1),
    110052, map("id", 110052, "name", "尚未建造红千层", "lv", 1, "kind", 11, "targetId", 3002, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init442() {
data.map(
    110053, map("id", 110053, "name", "尚未建造洋紫荆", "lv", 1, "kind", 11, "targetId", 3003, "stack", true, "useMode", 6, "money", 1),
    110054, map("id", 110054, "name", "尚未建造孔雀木", "lv", 1, "kind", 11, "targetId", 3004, "stack", true, "useMode", 6, "money", 1),
    110055, map("id", 110055, "name", "尚未建造嫣红蔓", "lv", 1, "kind", 11, "targetId", 3005, "stack", true, "useMode", 6, "money", 1),
    110056, map("id", 110056, "name", "尚未建造花叶垂榕", "lv", 1, "kind", 11, "targetId", 3006, "stack", true, "useMode", 6, "money", 1),
    110057, map("id", 110057, "name", "尚未建造南洋楹", "lv", 1, "kind", 11, "targetId", 3007, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init443() {
data.map(
    110058, map("id", 110058, "name", "尚未建造秋日小圆帽", "lv", 1, "kind", 11, "targetId", 3009, "stack", true, "useMode", 6, "money", 1),
    110059, map("id", 110059, "name", "尚未建造绞股蓝", "lv", 1, "kind", 11, "targetId", 3010, "stack", true, "useMode", 6, "money", 1),
    110060, map("id", 110060, "name", "尚未建造姬玉露", "lv", 1, "kind", 11, "targetId", 3011, "stack", true, "useMode", 6, "money", 1),
    110061, map("id", 110061, "name", "尚未建造胭脂花", "lv", 1, "kind", 11, "targetId", 3012, "stack", true, "useMode", 6, "money", 1),
    110062, map("id", 110062, "name", "尚未建造夕颜", "lv", 1, "kind", 11, "targetId", 3013, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init444() {
data.map(
    110063, map("id", 110063, "name", "尚未建造藜芦", "lv", 1, "kind", 11, "targetId", 3014, "stack", true, "useMode", 6, "money", 1),
    110064, map("id", 110064, "name", "尚未建造绒蒿", "lv", 1, "kind", 11, "targetId", 3015, "stack", true, "useMode", 6, "money", 1),
    110065, map("id", 110065, "name", "尚未建造粉色天使", "lv", 1, "kind", 11, "targetId", 3016, "stack", true, "useMode", 6, "money", 1),
    110066, map("id", 110066, "name", "尚未建造暖色绣球花", "lv", 1, "kind", 11, "targetId", 3033, "stack", true, "useMode", 6, "money", 1),
    110067, map("id", 110067, "name", "尚未建造冷色绣球花", "lv", 1, "kind", 11, "targetId", 3034, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init445() {
data.map(
    110068, map("id", 110068, "name", "尚未建造翠竹", "lv", 1, "kind", 11, "targetId", 3035, "stack", true, "useMode", 6, "money", 1),
    110069, map("id", 110069, "name", "尚未建造皇家银杏树", "lv", 1, "kind", 11, "targetId", 3036, "stack", true, "useMode", 6, "money", 1),
    110070, map("id", 110070, "name", "尚未建造双色牡丹", "lv", 1, "kind", 11, "targetId", 3037, "stack", true, "useMode", 6, "money", 1),
    110071, map("id", 110071, "name", "尚未建造荷塘月色", "lv", 30, "kind", 11, "targetId", 4000, "stack", true, "useMode", 6, "money", 1),
    110072, map("id", 110072, "name", "尚未建造芦苇荡", "lv", 30, "kind", 11, "targetId", 4001, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init446() {
data.map(
    110073, map("id", 110073, "name", "尚未建造折纸船", "lv", 30, "kind", 11, "targetId", 4002, "stack", true, "useMode", 6, "money", 1),
    110074, map("id", 110074, "name", "尚未建造水草", "lv", 30, "kind", 11, "targetId", 4003, "stack", true, "useMode", 6, "money", 1),
    110075, map("id", 110075, "name", "尚未建造一大簇", "lv", 30, "kind", 11, "targetId", 4004, "stack", true, "useMode", 6, "money", 1),
    110076, map("id", 110076, "name", "尚未建造木栅栏", "lv", 30, "kind", 11, "targetId", 4005, "stack", true, "useMode", 6, "money", 1),
    110077, map("id", 110077, "name", "尚未建造竹竿", "lv", 30, "kind", 11, "targetId", 4006, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init447() {
data.map(
    110078, map("id", 110078, "name", "尚未建造一小簇", "lv", 30, "kind", 11, "targetId", 4007, "stack", true, "useMode", 6, "money", 1),
    110079, map("id", 110079, "name", "尚未建造竹", "lv", 30, "kind", 11, "targetId", 4008, "stack", true, "useMode", 6, "money", 1),
    110080, map("id", 110080, "name", "尚未建造浮萍", "lv", 30, "kind", 11, "targetId", 4009, "stack", true, "useMode", 6, "money", 1),
    110081, map("id", 110081, "name", "尚未建造皇家地毯（5）", "lv", 1, "kind", 11, "targetId", 2053, "stack", true, "useMode", 6, "money", 1),
    110082, map("id", 110082, "name", "尚未建造皇家地毯（4）", "lv", 1, "kind", 11, "targetId", 2054, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init448() {
data.map(
    110083, map("id", 110083, "name", "尚未建造天坛", "lv", 1, "kind", 11, "targetId", 2055, "stack", true, "useMode", 6, "money", 1),
    111000, map("id", 111000, "name", "冰冻钓鱼台", "lv", 1, "kind", 11, "targetId", 2100, "stack", true, "useMode", 6, "money", 1),
    111001, map("id", 111001, "name", "冬日温泉浴", "lv", 1, "kind", 11, "targetId", 2101, "stack", true, "useMode", 6, "money", 1),
    111002, map("id", 111002, "name", "冬日雪花灯", "lv", 1, "kind", 11, "targetId", 2102, "stack", true, "useMode", 6, "money", 1),
    111003, map("id", 111003, "name", "冬日冰椅", "lv", 1, "kind", 11, "targetId", 2103, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init449() {
data.map(
    111004, map("id", 111004, "name", "冬日古典屏风", "lv", 1, "kind", 11, "targetId", 2104, "stack", true, "useMode", 6, "money", 1),
    111005, map("id", 111005, "name", "冬日恋歌许愿池", "lv", 1, "kind", 11, "targetId", 2105, "stack", true, "useMode", 6, "money", 1),
    111006, map("id", 111006, "name", "冬日情缘桥", "lv", 1, "kind", 11, "targetId", 2106, "stack", true, "useMode", 6, "money", 1),
    111007, map("id", 111007, "name", "圣诞树雪花毯", "lv", 1, "kind", 11, "targetId", 2107, "stack", true, "useMode", 6, "money", 1),
    111008, map("id", 111008, "name", "梦幻碎雪砖", "lv", 1, "kind", 11, "targetId", 2108, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init450() {
data.map(
    111009, map("id", 111009, "name", "麋鹿圣诞树", "lv", 1, "kind", 11, "targetId", 2109, "stack", true, "useMode", 6, "money", 1),
    111010, map("id", 111010, "name", "冬季缤纷树", "lv", 1, "kind", 11, "targetId", 2110, "stack", true, "useMode", 6, "money", 1),
    111011, map("id", 111011, "name", "星光璀璨栏", "lv", 1, "kind", 11, "targetId", 2111, "stack", true, "useMode", 6, "money", 1),
    111012, map("id", 111012, "name", "白雪玫瑰拱形柱", "lv", 1, "kind", 11, "targetId", 2112, "stack", true, "useMode", 6, "money", 1),
    111013, map("id", 111013, "name", "冰雪琉璃亭", "lv", 1, "kind", 11, "targetId", 2113, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init451() {
data.map(
    111100, map("id", 111100, "name", "小财神", "lv", 1, "kind", 11, "targetId", 2200, "stack", true, "useMode", 6, "money", 1),
    111101, map("id", 111101, "name", "篝火", "lv", 1, "kind", 11, "targetId", 2201, "stack", true, "useMode", 6, "money", 1),
    111102, map("id", 111102, "name", "金鸡贺禧", "lv", 1, "kind", 11, "targetId", 2202, "stack", true, "useMode", 6, "money", 1),
    111103, map("id", 111103, "name", "新春礼花", "lv", 1, "kind", 11, "targetId", 2203, "stack", true, "useMode", 6, "money", 1),
    111104, map("id", 111104, "name", "桃花朵朵开", "lv", 1, "kind", 11, "targetId", 2204, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init452() {
data.map(
    111105, map("id", 111105, "name", "鸡年地毯", "lv", 1, "kind", 11, "targetId", 2205, "stack", true, "useMode", 6, "money", 1),
    111106, map("id", 111106, "name", "新春舞台", "lv", 1, "kind", 11, "targetId", 2206, "stack", true, "useMode", 6, "money", 1),
    111107, map("id", 111107, "name", "年年有余", "lv", 1, "kind", 11, "targetId", 2207, "stack", true, "useMode", 6, "money", 1),
    111108, map("id", 111108, "name", "面人儿摊", "lv", 1, "kind", 11, "targetId", 2208, "stack", true, "useMode", 6, "money", 1),
    111109, map("id", 111109, "name", "财源似水", "lv", 1, "kind", 11, "targetId", 2209, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init453() {
data.map(
    111110, map("id", 111110, "name", "舞狮贺新春", "lv", 1, "kind", 11, "targetId", 2210, "stack", true, "useMode", 6, "money", 1),
    111111, map("id", 111111, "name", "新禧金福屏风", "lv", 1, "kind", 11, "targetId", 2211, "stack", true, "useMode", 6, "money", 1),
    111112, map("id", 111112, "name", "新禧金福围栏", "lv", 1, "kind", 11, "targetId", 2212, "stack", true, "useMode", 6, "money", 1),
    111113, map("id", 111113, "name", "新禧金福地毯", "lv", 1, "kind", 11, "targetId", 2213, "stack", true, "useMode", 6, "money", 1),
    111114, map("id", 111114, "name", "新禧金福龙舟", "lv", 1, "kind", 11, "targetId", 2214, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init454() {
data.map(
    111115, map("id", 111115, "name", "雪花水晶球", "lv", 1, "kind", 11, "targetId", 2215, "stack", true, "useMode", 6, "money", 1),
    111116, map("id", 111116, "name", "发财树", "lv", 1, "kind", 11, "targetId", 2216, "stack", true, "useMode", 6, "money", 1),
    112000, map("id", 112000, "name", "热气球", "lv", 1, "kind", 11, "targetId", 2300, "stack", true, "useMode", 6, "money", 1),
    112001, map("id", 112001, "name", "孔雀灯", "lv", 1, "kind", 11, "targetId", 2301, "stack", true, "useMode", 6, "money", 1),
    112002, map("id", 112002, "name", "钢琴", "lv", 1, "kind", 11, "targetId", 2302, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init455() {
data.map(
    112003, map("id", 112003, "name", "水井", "lv", 1, "kind", 11, "targetId", 2303, "stack", true, "useMode", 6, "money", 1),
    112004, map("id", 112004, "name", "梦境绿光躺椅", "lv", 1, "kind", 11, "targetId", 2304, "stack", true, "useMode", 6, "money", 1),
    112005, map("id", 112005, "name", "风筝", "lv", 1, "kind", 11, "targetId", 2305, "stack", true, "useMode", 6, "money", 1),
    112006, map("id", 112006, "name", "花棚", "lv", 1, "kind", 11, "targetId", 2306, "stack", true, "useMode", 6, "money", 1),
    112007, map("id", 112007, "name", "四叶草许愿瓶", "lv", 1, "kind", 11, "targetId", 2307, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init456() {
data.map(
    112008, map("id", 112008, "name", "稻草人", "lv", 1, "kind", 11, "targetId", 2308, "stack", true, "useMode", 6, "money", 1),
    112009, map("id", 112009, "name", "花海风车", "lv", 1, "kind", 11, "targetId", 2309, "stack", true, "useMode", 6, "money", 1),
    112010, map("id", 112010, "name", "指路牌", "lv", 1, "kind", 11, "targetId", 2310, "stack", true, "useMode", 6, "money", 1),
    112011, map("id", 112011, "name", "翠竹屏风", "lv", 1, "kind", 11, "targetId", 2311, "stack", true, "useMode", 6, "money", 1),
    112012, map("id", 112012, "name", "糖果围栏", "lv", 1, "kind", 11, "targetId", 2312, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init457() {
data.map(
    112013, map("id", 112013, "name", "清新碎花砖", "lv", 1, "kind", 11, "targetId", 2313, "stack", true, "useMode", 6, "money", 1),
    112014, map("id", 112014, "name", "梦幻飞马车", "lv", 1, "kind", 11, "targetId", 2314, "stack", true, "useMode", 6, "money", 1),
    112015, map("id", 112015, "name", "糖果屋", "lv", 1, "kind", 11, "targetId", 2315, "stack", true, "useMode", 6, "money", 1),
    112016, map("id", 112016, "name", "歌剧院", "lv", 1, "kind", 11, "targetId", 2316, "stack", true, "useMode", 6, "money", 1),
    113000, map("id", 113000, "name", "御兔守护像", "lv", 1, "kind", 11, "targetId", 2400, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init458() {
data.map(
    113001, map("id", 113001, "name", "神轿", "lv", 1, "kind", 11, "targetId", 2401, "stack", true, "useMode", 6, "money", 1),
    113002, map("id", 113002, "name", "鲤鱼旗", "lv", 1, "kind", 11, "targetId", 2402, "stack", true, "useMode", 6, "money", 1),
    113003, map("id", 113003, "name", "鹿威", "lv", 1, "kind", 11, "targetId", 2403, "stack", true, "useMode", 6, "money", 1),
    113004, map("id", 113004, "name", "红枫树", "lv", 1, "kind", 11, "targetId", 2404, "stack", true, "useMode", 6, "money", 1),
    113005, map("id", 113005, "name", "哆啦A梦像", "lv", 1, "kind", 11, "targetId", 2405, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init459() {
data.map(
    113006, map("id", 113006, "name", "和善屏风", "lv", 1, "kind", 11, "targetId", 2406, "stack", true, "useMode", 6, "money", 1),
    113007, map("id", 113007, "name", "石灯笼", "lv", 1, "kind", 11, "targetId", 2407, "stack", true, "useMode", 6, "money", 1),
    113008, map("id", 113008, "name", "千本鸟居", "lv", 1, "kind", 11, "targetId", 2408, "stack", true, "useMode", 6, "money", 1),
    113009, map("id", 113009, "name", "熊本赤桥", "lv", 1, "kind", 11, "targetId", 2409, "stack", true, "useMode", 6, "money", 1),
    113010, map("id", 113010, "name", "露天雪温泉", "lv", 1, "kind", 11, "targetId", 2410, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init460() {
data.map(
    113011, map("id", 113011, "name", "樱花树", "lv", 1, "kind", 11, "targetId", 2411, "stack", true, "useMode", 6, "money", 1),
    113012, map("id", 113012, "name", "五重塔", "lv", 1, "kind", 11, "targetId", 2412, "stack", true, "useMode", 6, "money", 1),
    113013, map("id", 113013, "name", "三春泷樱树", "lv", 1, "kind", 11, "targetId", 2413, "stack", true, "useMode", 6, "money", 1),
    113014, map("id", 113014, "name", "薰衣草田", "lv", 1, "kind", 11, "targetId", 2414, "stack", true, "useMode", 6, "money", 1),
    113015, map("id", 113015, "name", "镰仓大佛", "lv", 1, "kind", 11, "targetId", 2415, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init461() {
data.map(
    113016, map("id", 113016, "name", "大阪城", "lv", 1, "kind", 11, "targetId", 2416, "stack", true, "useMode", 6, "money", 1),
    114000, map("id", 114000, "name", "彩色地标", "lv", 1, "kind", 11, "targetId", 2500, "stack", true, "useMode", 6, "money", 1),
    114001, map("id", 114001, "name", "宠物店", "lv", 1, "kind", 11, "targetId", 2501, "stack", true, "useMode", 6, "money", 1),
    114002, map("id", 114002, "name", "灯箱", "lv", 1, "kind", 11, "targetId", 2502, "stack", true, "useMode", 6, "money", 1),
    114003, map("id", 114003, "name", "卡通灯柱", "lv", 1, "kind", 11, "targetId", 2503, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init462() {
data.map(
    114004, map("id", 114004, "name", "瞭望塔", "lv", 1, "kind", 11, "targetId", 2504, "stack", true, "useMode", 6, "money", 1),
    114005, map("id", 114005, "name", "梦幻城堡", "lv", 1, "kind", 11, "targetId", 2505, "stack", true, "useMode", 6, "money", 1),
    114006, map("id", 114006, "name", "米妮", "lv", 1, "kind", 11, "targetId", 2506, "stack", true, "useMode", 6, "money", 1),
    114007, map("id", 114007, "name", "米奇", "lv", 1, "kind", 11, "targetId", 2507, "stack", true, "useMode", 6, "money", 1),
    114008, map("id", 114008, "name", "米奇海盗船", "lv", 1, "kind", 11, "targetId", 2508, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init463() {
data.map(
    114009, map("id", 114009, "name", "米奇花丛", "lv", 1, "kind", 11, "targetId", 2509, "stack", true, "useMode", 6, "money", 1),
    114010, map("id", 114010, "name", "米奇树", "lv", 1, "kind", 11, "targetId", 2510, "stack", true, "useMode", 6, "money", 1),
    114011, map("id", 114011, "name", "魔幻石", "lv", 1, "kind", 11, "targetId", 2511, "stack", true, "useMode", 6, "money", 1),
    114012, map("id", 114012, "name", "幻粉热气球", "lv", 1, "kind", 11, "targetId", 2512, "stack", true, "useMode", 6, "money", 1),
    114013, map("id", 114013, "name", "石板路", "lv", 1, "kind", 11, "targetId", 2513, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init464() {
data.map(
    114014, map("id", 114014, "name", "石台", "lv", 1, "kind", 11, "targetId", 2514, "stack", true, "useMode", 6, "money", 1),
    114015, map("id", 114015, "name", "西部酒吧", "lv", 1, "kind", 11, "targetId", 2515, "stack", true, "useMode", 6, "money", 1),
    114016, map("id", 114016, "name", "夏日池塘", "lv", 1, "kind", 11, "targetId", 2516, "stack", true, "useMode", 6, "money", 1),
    114017, map("id", 114017, "name", "烟花塔楼", "lv", 1, "kind", 11, "targetId", 2517, "stack", true, "useMode", 6, "money", 1),
    115000, map("id", 115000, "name", "烟雨渡长廊", "lv", 1, "kind", 11, "targetId", 2600, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init465() {
data.map(
    115001, map("id", 115001, "name", "浮生绘牌楼", "lv", 1, "kind", 11, "targetId", 2601, "stack", true, "useMode", 6, "money", 1),
    115002, map("id", 115002, "name", "烟波里假山", "lv", 1, "kind", 11, "targetId", 2602, "stack", true, "useMode", 6, "money", 1),
    115003, map("id", 115003, "name", "袖舞社戏台", "lv", 1, "kind", 11, "targetId", 2603, "stack", true, "useMode", 6, "money", 1),
    115004, map("id", 115004, "name", "江南名府", "lv", 1, "kind", 11, "targetId", 2604, "stack", true, "useMode", 6, "money", 1),
    115005, map("id", 115005, "name", "小桥廊庭", "lv", 1, "kind", 11, "targetId", 2605, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init466() {
data.map(
    115006, map("id", 115006, "name", "长相思亭宇", "lv", 1, "kind", 11, "targetId", 2606, "stack", true, "useMode", 6, "money", 1),
    115007, map("id", 115007, "name", "青花瓷荷缸", "lv", 1, "kind", 11, "targetId", 2607, "stack", true, "useMode", 6, "money", 1),
    115008, map("id", 115008, "name", "江南小铺", "lv", 1, "kind", 11, "targetId", 2608, "stack", true, "useMode", 6, "money", 1),
    115009, map("id", 115009, "name", "姑苏乌篷船", "lv", 1, "kind", 11, "targetId", 2609, "stack", true, "useMode", 6, "money", 1),
    115010, map("id", 115010, "name", "古镇圆门", "lv", 1, "kind", 11, "targetId", 2610, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init467() {
data.map(
    115011, map("id", 115011, "name", "庭院水井", "lv", 1, "kind", 11, "targetId", 2611, "stack", true, "useMode", 6, "money", 1),
    115012, map("id", 115012, "name", "龙凤石板", "lv", 1, "kind", 11, "targetId", 2612, "stack", true, "useMode", 6, "money", 1),
    115013, map("id", 115013, "name", "烟雨震铜鼓", "lv", 1, "kind", 11, "targetId", 2613, "stack", true, "useMode", 6, "money", 1),
    115014, map("id", 115014, "name", "青石台盆景", "lv", 1, "kind", 11, "targetId", 2614, "stack", true, "useMode", 6, "money", 1),
    116000, map("id", 116000, "name", "东南亚亭阁", "lv", 1, "kind", 11, "targetId", 2700, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init468() {
data.map(
    116001, map("id", 116001, "name", "图腾柱", "lv", 1, "kind", 11, "targetId", 2701, "stack", true, "useMode", 6, "money", 1),
    116002, map("id", 116002, "name", "大三巴牌坊", "lv", 1, "kind", 11, "targetId", 2702, "stack", true, "useMode", 6, "money", 1),
    116003, map("id", 116003, "name", "妈祖阁", "lv", 1, "kind", 11, "targetId", 2703, "stack", true, "useMode", 6, "money", 1),
    116004, map("id", 116004, "name", "金顶象雕塑", "lv", 1, "kind", 11, "targetId", 2704, "stack", true, "useMode", 6, "money", 1),
    116005, map("id", 116005, "name", "大皇宫雕像（1）", "lv", 1, "kind", 11, "targetId", 2705, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init469() {
data.map(
    116006, map("id", 116006, "name", "大皇宫雕像（2）", "lv", 1, "kind", 11, "targetId", 2706, "stack", true, "useMode", 6, "money", 1),
    116007, map("id", 116007, "name", "水果船", "lv", 1, "kind", 11, "targetId", 2707, "stack", true, "useMode", 6, "money", 1),
    116008, map("id", 116008, "name", "仰光大金塔", "lv", 1, "kind", 11, "targetId", 2708, "stack", true, "useMode", 6, "money", 1),
    116009, map("id", 116009, "name", "鱼尾狮喷泉", "lv", 1, "kind", 11, "targetId", 2709, "stack", true, "useMode", 6, "money", 1),
    116010, map("id", 116010, "name", "榴莲树", "lv", 1, "kind", 11, "targetId", 2710, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init470() {
data.map(
    116011, map("id", 116011, "name", "莲花泰尊", "lv", 1, "kind", 11, "targetId", 2711, "stack", true, "useMode", 6, "money", 1),
    116012, map("id", 116012, "name", "红鸡蛋花树", "lv", 1, "kind", 11, "targetId", 2712, "stack", true, "useMode", 6, "money", 1),
    116013, map("id", 116013, "name", "刺桐", "lv", 1, "kind", 11, "targetId", 2713, "stack", true, "useMode", 6, "money", 1),
    116014, map("id", 116014, "name", "香蕉树", "lv", 1, "kind", 11, "targetId", 2714, "stack", true, "useMode", 6, "money", 1),
    116015, map("id", 116015, "name", "幽幽河道（1）", "lv", 1, "kind", 11, "targetId", 2715, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init471() {
data.map(
    116016, map("id", 116016, "name", "幽幽河道（2）", "lv", 1, "kind", 11, "targetId", 2716, "stack", true, "useMode", 6, "money", 1),
    116017, map("id", 116017, "name", "幽幽河道（3）", "lv", 1, "kind", 11, "targetId", 2717, "stack", true, "useMode", 6, "money", 1),
    116018, map("id", 116018, "name", "幽幽河道（4）", "lv", 1, "kind", 11, "targetId", 2718, "stack", true, "useMode", 6, "money", 1),
    116019, map("id", 116019, "name", "幽幽河道（5）", "lv", 1, "kind", 11, "targetId", 2719, "stack", true, "useMode", 6, "money", 1),
    116020, map("id", 116020, "name", "幽幽河道（6）", "lv", 1, "kind", 11, "targetId", 2720, "stack", true, "useMode", 6, "money", 1)
);
    }

    private static void init472() {
data.map(
    120000, map("id", 120000, "name", "中级·杀气诀", "lv", 1, "kind", 12, "targetId", 74000, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120001, map("id", 120001, "name", "高级·杀气诀", "lv", 1, "kind", 12, "targetId", 74001, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120002, map("id", 120002, "name", "中级·横扫千军", "lv", 1, "kind", 12, "targetId", 74002, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120003, map("id", 120003, "name", "高级·横扫千军", "lv", 1, "kind", 12, "targetId", 74003, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120100, map("id", 120100, "name", "中级·后发制人", "lv", 1, "kind", 12, "targetId", 74100, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init473() {
data.map(
    120101, map("id", 120101, "name", "高级·后发制人", "lv", 1, "kind", 12, "targetId", 74101, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120102, map("id", 120102, "name", "中级·斩龙诀", "lv", 1, "kind", 12, "targetId", 74102, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120103, map("id", 120103, "name", "高级·斩龙诀", "lv", 1, "kind", 12, "targetId", 74103, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120200, map("id", 120200, "name", "中级·破斧沉舟", "lv", 1, "kind", 12, "targetId", 74200, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120201, map("id", 120201, "name", "高级·破斧沉舟", "lv", 1, "kind", 12, "targetId", 74201, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init474() {
data.map(
    120202, map("id", 120202, "name", "中级·翩鸿一击", "lv", 1, "kind", 12, "targetId", 74202, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120203, map("id", 120203, "name", "高级·翩鸿一击", "lv", 1, "kind", 12, "targetId", 74203, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120300, map("id", 120300, "name", "中级·万剑归宗", "lv", 1, "kind", 12, "targetId", 74300, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120301, map("id", 120301, "name", "高级·万剑归宗", "lv", 1, "kind", 12, "targetId", 74301, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120302, map("id", 120302, "name", "中级·离魂咒", "lv", 1, "kind", 12, "targetId", 74302, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init475() {
data.map(
    120303, map("id", 120303, "name", "高级·离魂咒", "lv", 1, "kind", 12, "targetId", 74303, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120400, map("id", 120400, "name", "中级·五雷咒", "lv", 1, "kind", 12, "targetId", 74400, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120401, map("id", 120401, "name", "高级·五雷咒", "lv", 1, "kind", 12, "targetId", 74401, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120402, map("id", 120402, "name", "中级·神兵护法", "lv", 1, "kind", 12, "targetId", 74402, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120403, map("id", 120403, "name", "高级·神兵护法", "lv", 1, "kind", 12, "targetId", 74403, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init476() {
data.map(
    120500, map("id", 120500, "name", "中级·黄庭经", "lv", 1, "kind", 12, "targetId", 74500, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120501, map("id", 120501, "name", "高级·黄庭经", "lv", 1, "kind", 12, "targetId", 74501, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120502, map("id", 120502, "name", "中级·沐日慈悲", "lv", 1, "kind", 12, "targetId", 74502, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120503, map("id", 120503, "name", "高级·沐日慈悲", "lv", 1, "kind", 12, "targetId", 74503, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120600, map("id", 120600, "name", "中级·灵动九天", "lv", 1, "kind", 12, "targetId", 74600, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init477() {
data.map(
    120601, map("id", 120601, "name", "高级·灵动九天", "lv", 1, "kind", 12, "targetId", 74601, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120602, map("id", 120602, "name", "中级·五行咒", "lv", 1, "kind", 12, "targetId", 74602, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120603, map("id", 120603, "name", "高级·五行咒", "lv", 1, "kind", 12, "targetId", 74603, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120700, map("id", 120700, "name", "中级·失心符", "lv", 1, "kind", 12, "targetId", 74700, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120701, map("id", 120701, "name", "高级·失心符", "lv", 1, "kind", 12, "targetId", 74701, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init478() {
data.map(
    120702, map("id", 120702, "name", "中级·浪滔天", "lv", 1, "kind", 12, "targetId", 74702, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120703, map("id", 120703, "name", "高级·浪滔天", "lv", 1, "kind", 12, "targetId", 74703, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120800, map("id", 120800, "name", "中级·九龙诀", "lv", 1, "kind", 12, "targetId", 74800, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120801, map("id", 120801, "name", "高级·九龙诀", "lv", 1, "kind", 12, "targetId", 74801, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120802, map("id", 120802, "name", "中级·龙卷雨击", "lv", 1, "kind", 12, "targetId", 74802, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init479() {
data.map(
    120803, map("id", 120803, "name", "高级·龙卷雨击", "lv", 1, "kind", 12, "targetId", 74803, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120900, map("id", 120900, "name", "中级·天龙降", "lv", 1, "kind", 12, "targetId", 74900, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120901, map("id", 120901, "name", "高级·天龙降", "lv", 1, "kind", 12, "targetId", 74901, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120902, map("id", 120902, "name", "中级·神龙摆尾", "lv", 1, "kind", 12, "targetId", 74902, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    120903, map("id", 120903, "name", "高级·神龙摆尾", "lv", 1, "kind", 12, "targetId", 74903, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init480() {
data.map(
    121000, map("id", 121000, "name", "中级·飞龙在天", "lv", 1, "kind", 12, "targetId", 75000, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121001, map("id", 121001, "name", "高级·飞龙在天", "lv", 1, "kind", 12, "targetId", 75001, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121002, map("id", 121002, "name", "中级·法力无边", "lv", 1, "kind", 12, "targetId", 75002, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121003, map("id", 121003, "name", "高级·法力无边", "lv", 1, "kind", 12, "targetId", 75003, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121100, map("id", 121100, "name", "中级·怀中抱月", "lv", 1, "kind", 12, "targetId", 75100, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init481() {
data.map(
    121101, map("id", 121101, "name", "高级·怀中抱月", "lv", 1, "kind", 12, "targetId", 75101, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121102, map("id", 121102, "name", "中级·莲花坐山", "lv", 1, "kind", 12, "targetId", 75102, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121103, map("id", 121103, "name", "高级·莲花坐山", "lv", 1, "kind", 12, "targetId", 75103, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121200, map("id", 121200, "name", "中级·拨云见日", "lv", 1, "kind", 12, "targetId", 75200, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121201, map("id", 121201, "name", "高级·拨云见日", "lv", 1, "kind", 12, "targetId", 75201, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init482() {
data.map(
    121202, map("id", 121202, "name", "中级·云蒸霞蔚", "lv", 1, "kind", 12, "targetId", 75202, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121203, map("id", 121203, "name", "高级·云蒸霞蔚", "lv", 1, "kind", 12, "targetId", 75203, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121300, map("id", 121300, "name", "中级·只手遮天", "lv", 1, "kind", 12, "targetId", 75300, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121301, map("id", 121301, "name", "高级·只手遮天", "lv", 1, "kind", 12, "targetId", 75301, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121302, map("id", 121302, "name", "中级·变道轮回", "lv", 1, "kind", 12, "targetId", 75302, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init483() {
data.map(
    121303, map("id", 121303, "name", "高级·变道轮回", "lv", 1, "kind", 12, "targetId", 75303, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121400, map("id", 121400, "name", "中级·无中生有", "lv", 1, "kind", 12, "targetId", 75400, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121401, map("id", 121401, "name", "高级·无中生有", "lv", 1, "kind", 12, "targetId", 75401, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121402, map("id", 121402, "name", "中级·仙人指路", "lv", 1, "kind", 12, "targetId", 75402, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121403, map("id", 121403, "name", "高级·仙人指路", "lv", 1, "kind", 12, "targetId", 75403, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init484() {
data.map(
    121500, map("id", 121500, "name", "中级·凤凰涅磬", "lv", 1, "kind", 12, "targetId", 75500, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121501, map("id", 121501, "name", "高级·凤凰涅磬", "lv", 1, "kind", 12, "targetId", 75501, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121502, map("id", 121502, "name", "中级·魂归涅磬", "lv", 1, "kind", 12, "targetId", 75502, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121503, map("id", 121503, "name", "高级·魂归涅磬", "lv", 1, "kind", 12, "targetId", 75503, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121600, map("id", 121600, "name", "中级·毒魂", "lv", 1, "kind", 12, "targetId", 75600, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init485() {
data.map(
    121601, map("id", 121601, "name", "高级·毒魂", "lv", 1, "kind", 12, "targetId", 75601, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121602, map("id", 121602, "name", "中级·夺魄", "lv", 1, "kind", 12, "targetId", 75602, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121603, map("id", 121603, "name", "高级·夺魄", "lv", 1, "kind", 12, "targetId", 75603, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121700, map("id", 121700, "name", "中级·飞铲", "lv", 1, "kind", 12, "targetId", 75700, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121701, map("id", 121701, "name", "高级·飞铲", "lv", 1, "kind", 12, "targetId", 75701, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init486() {
data.map(
    121702, map("id", 121702, "name", "中级·烈焰", "lv", 1, "kind", 12, "targetId", 75702, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121703, map("id", 121703, "name", "高级·烈焰", "lv", 1, "kind", 12, "targetId", 75703, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121800, map("id", 121800, "name", "中级·回峰剑", "lv", 1, "kind", 12, "targetId", 75800, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121801, map("id", 121801, "name", "高级·回峰剑", "lv", 1, "kind", 12, "targetId", 75801, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    121802, map("id", 121802, "name", "中级·反戈一击", "lv", 1, "kind", 12, "targetId", 75802, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init487() {
data.map(
    121803, map("id", 121803, "name", "高级·反戈一击", "lv", 1, "kind", 12, "targetId", 75803, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130000, map("id", 130000, "name", "中级·兵临城下", "lv", 1, "kind", 15, "targetId", 76000, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130001, map("id", 130001, "name", "高级·兵临城下", "lv", 1, "kind", 15, "targetId", 76001, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130002, map("id", 130002, "name", "中级·魂散魄飞", "lv", 1, "kind", 15, "targetId", 76002, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130003, map("id", 130003, "name", "高级·魂散魄飞", "lv", 1, "kind", 15, "targetId", 76003, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init488() {
data.map(
    130004, map("id", 130004, "name", "中级·凤鸣矢", "lv", 1, "kind", 15, "targetId", 76004, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130005, map("id", 130005, "name", "高级·凤鸣矢", "lv", 1, "kind", 15, "targetId", 76005, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130006, map("id", 130006, "name", "中级·魂兮何去", "lv", 1, "kind", 15, "targetId", 76006, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130007, map("id", 130007, "name", "高级·魂兮何去", "lv", 1, "kind", 15, "targetId", 76007, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130008, map("id", 130008, "name", "中级·空灵闪", "lv", 1, "kind", 15, "targetId", 76008, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init489() {
data.map(
    130009, map("id", 130009, "name", "高级·空灵闪", "lv", 1, "kind", 15, "targetId", 76009, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130010, map("id", 130010, "name", "中级·魂归涅槃", "lv", 1, "kind", 15, "targetId", 76010, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130011, map("id", 130011, "name", "高级·魂归涅槃", "lv", 1, "kind", 15, "targetId", 76011, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130012, map("id", 130012, "name", "中级·醉芙蓉", "lv", 1, "kind", 15, "targetId", 76012, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130013, map("id", 130013, "name", "高级·醉芙蓉", "lv", 1, "kind", 15, "targetId", 76013, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init490() {
data.map(
    130014, map("id", 130014, "name", "中级·追星赶月", "lv", 1, "kind", 15, "targetId", 76014, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130015, map("id", 130015, "name", "高级·追星赶月", "lv", 1, "kind", 15, "targetId", 76015, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130016, map("id", 130016, "name", "中级·双飞火", "lv", 1, "kind", 15, "targetId", 76016, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130017, map("id", 130017, "name", "高级·双飞火", "lv", 1, "kind", 15, "targetId", 76017, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130018, map("id", 130018, "name", "中级·云蒸霞蔚", "lv", 1, "kind", 15, "targetId", 76018, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init491() {
data.map(
    130019, map("id", 130019, "name", "高级·云蒸霞蔚", "lv", 1, "kind", 15, "targetId", 76019, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130020, map("id", 130020, "name", "中级·百蛊啖魂", "lv", 1, "kind", 15, "targetId", 76020, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130021, map("id", 130021, "name", "高级·百蛊啖魂", "lv", 1, "kind", 15, "targetId", 76021, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130022, map("id", 130022, "name", "中级·龙蛇飞动", "lv", 1, "kind", 15, "targetId", 76022, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130023, map("id", 130023, "name", "高级·龙蛇飞动", "lv", 1, "kind", 15, "targetId", 76023, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init492() {
data.map(
    130024, map("id", 130024, "name", "中级·出其不意", "lv", 1, "kind", 15, "targetId", 76024, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130025, map("id", 130025, "name", "高级·出其不意", "lv", 1, "kind", 15, "targetId", 76025, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130026, map("id", 130026, "name", "中级·勾魂摄魄", "lv", 1, "kind", 15, "targetId", 76026, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130027, map("id", 130027, "name", "高级·勾魂摄魄", "lv", 1, "kind", 15, "targetId", 76027, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130028, map("id", 130028, "name", "中级·分花抚柳", "lv", 1, "kind", 15, "targetId", 76028, "evenQuick", true, "stack", true, "useMode", 2, "money", 1)
);
    }

    private static void init493() {
data.map(
    130029, map("id", 130029, "name", "高级·分花抚柳", "lv", 1, "kind", 15, "targetId", 76029, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130030, map("id", 130030, "name", "中级·日月同转", "lv", 1, "kind", 15, "targetId", 76030, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    130031, map("id", 130031, "name", "高级·日月同转", "lv", 1, "kind", 15, "targetId", 76031, "evenQuick", true, "stack", true, "useMode", 2, "money", 1),
    140000, map("id", 140000, "name", "白色·礼", "lv", 1, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140001, map("id", 140001, "name", "白色·礼", "lv", 2, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init494() {
data.map(
    140002, map("id", 140002, "name", "白色·礼", "lv", 3, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140003, map("id", 140003, "name", "白色·礼", "lv", 4, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140004, map("id", 140004, "name", "白色·礼", "lv", 5, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140005, map("id", 140005, "name", "白色·礼", "lv", 6, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140006, map("id", 140006, "name", "白色·礼", "lv", 7, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init495() {
data.map(
    140007, map("id", 140007, "name", "白色·礼", "lv", 8, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140008, map("id", 140008, "name", "白色·礼", "lv", 9, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140009, map("id", 140009, "name", "白色·礼", "lv", 10, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 1500),
    140100, map("id", 140100, "name", "白色·乐", "lv", 1, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140101, map("id", 140101, "name", "白色·乐", "lv", 2, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init496() {
data.map(
    140102, map("id", 140102, "name", "白色·乐", "lv", 3, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140103, map("id", 140103, "name", "白色·乐", "lv", 4, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140104, map("id", 140104, "name", "白色·乐", "lv", 5, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140105, map("id", 140105, "name", "白色·乐", "lv", 6, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140106, map("id", 140106, "name", "白色·乐", "lv", 7, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init497() {
data.map(
    140107, map("id", 140107, "name", "白色·乐", "lv", 8, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140108, map("id", 140108, "name", "白色·乐", "lv", 9, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140109, map("id", 140109, "name", "白色·乐", "lv", 10, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 1500),
    140200, map("id", 140200, "name", "白色·射", "lv", 1, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140201, map("id", 140201, "name", "白色·射", "lv", 2, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init498() {
data.map(
    140202, map("id", 140202, "name", "白色·射", "lv", 3, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140203, map("id", 140203, "name", "白色·射", "lv", 4, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140204, map("id", 140204, "name", "白色·射", "lv", 5, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140205, map("id", 140205, "name", "白色·射", "lv", 6, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140206, map("id", 140206, "name", "白色·射", "lv", 7, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init499() {
data.map(
    140207, map("id", 140207, "name", "白色·射", "lv", 8, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140208, map("id", 140208, "name", "白色·射", "lv", 9, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140209, map("id", 140209, "name", "白色·射", "lv", 10, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 1500),
    140300, map("id", 140300, "name", "白色·御", "lv", 1, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140301, map("id", 140301, "name", "白色·御", "lv", 2, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init500() {
data.map(
    140302, map("id", 140302, "name", "白色·御", "lv", 3, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140303, map("id", 140303, "name", "白色·御", "lv", 4, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140304, map("id", 140304, "name", "白色·御", "lv", 5, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140305, map("id", 140305, "name", "白色·御", "lv", 6, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140306, map("id", 140306, "name", "白色·御", "lv", 7, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init501() {
data.map(
    140307, map("id", 140307, "name", "白色·御", "lv", 8, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140308, map("id", 140308, "name", "白色·御", "lv", 9, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140309, map("id", 140309, "name", "白色·御", "lv", 10, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 1500),
    140400, map("id", 140400, "name", "白色·书", "lv", 1, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140401, map("id", 140401, "name", "白色·书", "lv", 2, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init502() {
data.map(
    140402, map("id", 140402, "name", "白色·书", "lv", 3, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140403, map("id", 140403, "name", "白色·书", "lv", 4, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140404, map("id", 140404, "name", "白色·书", "lv", 5, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140405, map("id", 140405, "name", "白色·书", "lv", 6, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140406, map("id", 140406, "name", "白色·书", "lv", 7, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init503() {
data.map(
    140407, map("id", 140407, "name", "白色·书", "lv", 8, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140408, map("id", 140408, "name", "白色·书", "lv", 9, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140409, map("id", 140409, "name", "白色·书", "lv", 10, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 1500),
    140500, map("id", 140500, "name", "白色·数", "lv", 1, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140501, map("id", 140501, "name", "白色·数", "lv", 2, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init504() {
data.map(
    140502, map("id", 140502, "name", "白色·数", "lv", 3, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140503, map("id", 140503, "name", "白色·数", "lv", 4, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140504, map("id", 140504, "name", "白色·数", "lv", 5, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140505, map("id", 140505, "name", "白色·数", "lv", 6, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140506, map("id", 140506, "name", "白色·数", "lv", 7, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init505() {
data.map(
    140507, map("id", 140507, "name", "白色·数", "lv", 8, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140508, map("id", 140508, "name", "白色·数", "lv", 9, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    140509, map("id", 140509, "name", "白色·数", "lv", 10, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 1500),
    141000, map("id", 141000, "name", "绿色·礼", "lv", 1, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141001, map("id", 141001, "name", "绿色·礼", "lv", 2, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init506() {
data.map(
    141002, map("id", 141002, "name", "绿色·礼", "lv", 3, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141003, map("id", 141003, "name", "绿色·礼", "lv", 4, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141004, map("id", 141004, "name", "绿色·礼", "lv", 5, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141005, map("id", 141005, "name", "绿色·礼", "lv", 6, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141006, map("id", 141006, "name", "绿色·礼", "lv", 7, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init507() {
data.map(
    141007, map("id", 141007, "name", "绿色·礼", "lv", 8, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141008, map("id", 141008, "name", "绿色·礼", "lv", 9, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141009, map("id", 141009, "name", "绿色·礼", "lv", 10, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2000),
    141100, map("id", 141100, "name", "绿色·乐", "lv", 1, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141101, map("id", 141101, "name", "绿色·乐", "lv", 2, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init508() {
data.map(
    141102, map("id", 141102, "name", "绿色·乐", "lv", 3, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141103, map("id", 141103, "name", "绿色·乐", "lv", 4, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141104, map("id", 141104, "name", "绿色·乐", "lv", 5, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141105, map("id", 141105, "name", "绿色·乐", "lv", 6, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141106, map("id", 141106, "name", "绿色·乐", "lv", 7, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init509() {
data.map(
    141107, map("id", 141107, "name", "绿色·乐", "lv", 8, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141108, map("id", 141108, "name", "绿色·乐", "lv", 9, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141109, map("id", 141109, "name", "绿色·乐", "lv", 10, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2000),
    141200, map("id", 141200, "name", "绿色·射", "lv", 1, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141201, map("id", 141201, "name", "绿色·射", "lv", 2, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init510() {
data.map(
    141202, map("id", 141202, "name", "绿色·射", "lv", 3, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141203, map("id", 141203, "name", "绿色·射", "lv", 4, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141204, map("id", 141204, "name", "绿色·射", "lv", 5, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141205, map("id", 141205, "name", "绿色·射", "lv", 6, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141206, map("id", 141206, "name", "绿色·射", "lv", 7, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init511() {
data.map(
    141207, map("id", 141207, "name", "绿色·射", "lv", 8, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141208, map("id", 141208, "name", "绿色·射", "lv", 9, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141209, map("id", 141209, "name", "绿色·射", "lv", 10, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2000),
    141300, map("id", 141300, "name", "绿色·御", "lv", 1, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141301, map("id", 141301, "name", "绿色·御", "lv", 2, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init512() {
data.map(
    141302, map("id", 141302, "name", "绿色·御", "lv", 3, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141303, map("id", 141303, "name", "绿色·御", "lv", 4, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141304, map("id", 141304, "name", "绿色·御", "lv", 5, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141305, map("id", 141305, "name", "绿色·御", "lv", 6, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141306, map("id", 141306, "name", "绿色·御", "lv", 7, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init513() {
data.map(
    141307, map("id", 141307, "name", "绿色·御", "lv", 8, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141308, map("id", 141308, "name", "绿色·御", "lv", 9, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141309, map("id", 141309, "name", "绿色·御", "lv", 10, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2000),
    141400, map("id", 141400, "name", "绿色·书", "lv", 1, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141401, map("id", 141401, "name", "绿色·书", "lv", 2, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init514() {
data.map(
    141402, map("id", 141402, "name", "绿色·书", "lv", 3, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141403, map("id", 141403, "name", "绿色·书", "lv", 4, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141404, map("id", 141404, "name", "绿色·书", "lv", 5, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141405, map("id", 141405, "name", "绿色·书", "lv", 6, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141406, map("id", 141406, "name", "绿色·书", "lv", 7, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init515() {
data.map(
    141407, map("id", 141407, "name", "绿色·书", "lv", 8, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141408, map("id", 141408, "name", "绿色·书", "lv", 9, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141409, map("id", 141409, "name", "绿色·书", "lv", 10, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2000),
    141500, map("id", 141500, "name", "绿色·数", "lv", 1, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141501, map("id", 141501, "name", "绿色·数", "lv", 2, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init516() {
data.map(
    141502, map("id", 141502, "name", "绿色·数", "lv", 3, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141503, map("id", 141503, "name", "绿色·数", "lv", 4, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141504, map("id", 141504, "name", "绿色·数", "lv", 5, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141505, map("id", 141505, "name", "绿色·数", "lv", 6, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141506, map("id", 141506, "name", "绿色·数", "lv", 7, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init517() {
data.map(
    141507, map("id", 141507, "name", "绿色·数", "lv", 8, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141508, map("id", 141508, "name", "绿色·数", "lv", 9, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    141509, map("id", 141509, "name", "绿色·数", "lv", 10, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2000),
    142000, map("id", 142000, "name", "蓝色·礼", "lv", 1, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142001, map("id", 142001, "name", "蓝色·礼", "lv", 2, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init518() {
data.map(
    142002, map("id", 142002, "name", "蓝色·礼", "lv", 3, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142003, map("id", 142003, "name", "蓝色·礼", "lv", 4, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142004, map("id", 142004, "name", "蓝色·礼", "lv", 5, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142005, map("id", 142005, "name", "蓝色·礼", "lv", 6, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142006, map("id", 142006, "name", "蓝色·礼", "lv", 7, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init519() {
data.map(
    142007, map("id", 142007, "name", "蓝色·礼", "lv", 8, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142008, map("id", 142008, "name", "蓝色·礼", "lv", 9, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142009, map("id", 142009, "name", "蓝色·礼", "lv", 10, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 2500),
    142100, map("id", 142100, "name", "蓝色·乐", "lv", 1, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142101, map("id", 142101, "name", "蓝色·乐", "lv", 2, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init520() {
data.map(
    142102, map("id", 142102, "name", "蓝色·乐", "lv", 3, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142103, map("id", 142103, "name", "蓝色·乐", "lv", 4, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142104, map("id", 142104, "name", "蓝色·乐", "lv", 5, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142105, map("id", 142105, "name", "蓝色·乐", "lv", 6, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142106, map("id", 142106, "name", "蓝色·乐", "lv", 7, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init521() {
data.map(
    142107, map("id", 142107, "name", "蓝色·乐", "lv", 8, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142108, map("id", 142108, "name", "蓝色·乐", "lv", 9, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142109, map("id", 142109, "name", "蓝色·乐", "lv", 10, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 2500),
    142200, map("id", 142200, "name", "蓝色·射", "lv", 1, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142201, map("id", 142201, "name", "蓝色·射", "lv", 2, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init522() {
data.map(
    142202, map("id", 142202, "name", "蓝色·射", "lv", 3, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142203, map("id", 142203, "name", "蓝色·射", "lv", 4, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142204, map("id", 142204, "name", "蓝色·射", "lv", 5, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142205, map("id", 142205, "name", "蓝色·射", "lv", 6, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142206, map("id", 142206, "name", "蓝色·射", "lv", 7, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init523() {
data.map(
    142207, map("id", 142207, "name", "蓝色·射", "lv", 8, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142208, map("id", 142208, "name", "蓝色·射", "lv", 9, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142209, map("id", 142209, "name", "蓝色·射", "lv", 10, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 2500),
    142300, map("id", 142300, "name", "蓝色·御", "lv", 1, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142301, map("id", 142301, "name", "蓝色·御", "lv", 2, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init524() {
data.map(
    142302, map("id", 142302, "name", "蓝色·御", "lv", 3, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142303, map("id", 142303, "name", "蓝色·御", "lv", 4, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142304, map("id", 142304, "name", "蓝色·御", "lv", 5, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142305, map("id", 142305, "name", "蓝色·御", "lv", 6, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142306, map("id", 142306, "name", "蓝色·御", "lv", 7, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init525() {
data.map(
    142307, map("id", 142307, "name", "蓝色·御", "lv", 8, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142308, map("id", 142308, "name", "蓝色·御", "lv", 9, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142309, map("id", 142309, "name", "蓝色·御", "lv", 10, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 2500),
    142400, map("id", 142400, "name", "蓝色·书", "lv", 1, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142401, map("id", 142401, "name", "蓝色·书", "lv", 2, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init526() {
data.map(
    142402, map("id", 142402, "name", "蓝色·书", "lv", 3, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142403, map("id", 142403, "name", "蓝色·书", "lv", 4, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142404, map("id", 142404, "name", "蓝色·书", "lv", 5, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142405, map("id", 142405, "name", "蓝色·书", "lv", 6, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142406, map("id", 142406, "name", "蓝色·书", "lv", 7, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init527() {
data.map(
    142407, map("id", 142407, "name", "蓝色·书", "lv", 8, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142408, map("id", 142408, "name", "蓝色·书", "lv", 9, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142409, map("id", 142409, "name", "蓝色·书", "lv", 10, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 2500),
    142500, map("id", 142500, "name", "蓝色·数", "lv", 1, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142501, map("id", 142501, "name", "蓝色·数", "lv", 2, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init528() {
data.map(
    142502, map("id", 142502, "name", "蓝色·数", "lv", 3, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142503, map("id", 142503, "name", "蓝色·数", "lv", 4, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142504, map("id", 142504, "name", "蓝色·数", "lv", 5, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142505, map("id", 142505, "name", "蓝色·数", "lv", 6, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142506, map("id", 142506, "name", "蓝色·数", "lv", 7, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init529() {
data.map(
    142507, map("id", 142507, "name", "蓝色·数", "lv", 8, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142508, map("id", 142508, "name", "蓝色·数", "lv", 9, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    142509, map("id", 142509, "name", "蓝色·数", "lv", 10, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 2500),
    143000, map("id", 143000, "name", "紫色·礼", "lv", 1, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143001, map("id", 143001, "name", "紫色·礼", "lv", 2, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init530() {
data.map(
    143002, map("id", 143002, "name", "紫色·礼", "lv", 3, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143003, map("id", 143003, "name", "紫色·礼", "lv", 4, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143004, map("id", 143004, "name", "紫色·礼", "lv", 5, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143005, map("id", 143005, "name", "紫色·礼", "lv", 6, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143006, map("id", 143006, "name", "紫色·礼", "lv", 7, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init531() {
data.map(
    143007, map("id", 143007, "name", "紫色·礼", "lv", 8, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143008, map("id", 143008, "name", "紫色·礼", "lv", 9, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143009, map("id", 143009, "name", "紫色·礼", "lv", 10, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 8000),
    143100, map("id", 143100, "name", "紫色·乐", "lv", 1, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143101, map("id", 143101, "name", "紫色·乐", "lv", 2, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init532() {
data.map(
    143102, map("id", 143102, "name", "紫色·乐", "lv", 3, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143103, map("id", 143103, "name", "紫色·乐", "lv", 4, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143104, map("id", 143104, "name", "紫色·乐", "lv", 5, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143105, map("id", 143105, "name", "紫色·乐", "lv", 6, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143106, map("id", 143106, "name", "紫色·乐", "lv", 7, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init533() {
data.map(
    143107, map("id", 143107, "name", "紫色·乐", "lv", 8, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143108, map("id", 143108, "name", "紫色·乐", "lv", 9, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143109, map("id", 143109, "name", "紫色·乐", "lv", 10, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 8000),
    143200, map("id", 143200, "name", "紫色·射", "lv", 1, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143201, map("id", 143201, "name", "紫色·射", "lv", 2, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init534() {
data.map(
    143202, map("id", 143202, "name", "紫色·射", "lv", 3, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143203, map("id", 143203, "name", "紫色·射", "lv", 4, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143204, map("id", 143204, "name", "紫色·射", "lv", 5, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143205, map("id", 143205, "name", "紫色·射", "lv", 6, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143206, map("id", 143206, "name", "紫色·射", "lv", 7, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init535() {
data.map(
    143207, map("id", 143207, "name", "紫色·射", "lv", 8, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143208, map("id", 143208, "name", "紫色·射", "lv", 9, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143209, map("id", 143209, "name", "紫色·射", "lv", 10, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 8000),
    143300, map("id", 143300, "name", "紫色·御", "lv", 1, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143301, map("id", 143301, "name", "紫色·御", "lv", 2, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init536() {
data.map(
    143302, map("id", 143302, "name", "紫色·御", "lv", 3, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143303, map("id", 143303, "name", "紫色·御", "lv", 4, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143304, map("id", 143304, "name", "紫色·御", "lv", 5, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143305, map("id", 143305, "name", "紫色·御", "lv", 6, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143306, map("id", 143306, "name", "紫色·御", "lv", 7, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init537() {
data.map(
    143307, map("id", 143307, "name", "紫色·御", "lv", 8, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143308, map("id", 143308, "name", "紫色·御", "lv", 9, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143309, map("id", 143309, "name", "紫色·御", "lv", 10, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 8000),
    143400, map("id", 143400, "name", "紫色·书", "lv", 1, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143401, map("id", 143401, "name", "紫色·书", "lv", 2, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init538() {
data.map(
    143402, map("id", 143402, "name", "紫色·书", "lv", 3, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143403, map("id", 143403, "name", "紫色·书", "lv", 4, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143404, map("id", 143404, "name", "紫色·书", "lv", 5, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143405, map("id", 143405, "name", "紫色·书", "lv", 6, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143406, map("id", 143406, "name", "紫色·书", "lv", 7, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init539() {
data.map(
    143407, map("id", 143407, "name", "紫色·书", "lv", 8, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143408, map("id", 143408, "name", "紫色·书", "lv", 9, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143409, map("id", 143409, "name", "紫色·书", "lv", 10, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 8000),
    143500, map("id", 143500, "name", "紫色·数", "lv", 1, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143501, map("id", 143501, "name", "紫色·数", "lv", 2, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init540() {
data.map(
    143502, map("id", 143502, "name", "紫色·数", "lv", 3, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143503, map("id", 143503, "name", "紫色·数", "lv", 4, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143504, map("id", 143504, "name", "紫色·数", "lv", 5, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143505, map("id", 143505, "name", "紫色·数", "lv", 6, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143506, map("id", 143506, "name", "紫色·数", "lv", 7, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init541() {
data.map(
    143507, map("id", 143507, "name", "紫色·数", "lv", 8, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143508, map("id", 143508, "name", "紫色·数", "lv", 9, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    143509, map("id", 143509, "name", "紫色·数", "lv", 10, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 8000),
    144000, map("id", 144000, "name", "橙色·礼", "lv", 1, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144001, map("id", 144001, "name", "橙色·礼", "lv", 2, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init542() {
data.map(
    144002, map("id", 144002, "name", "橙色·礼", "lv", 3, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144003, map("id", 144003, "name", "橙色·礼", "lv", 4, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144004, map("id", 144004, "name", "橙色·礼", "lv", 5, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144005, map("id", 144005, "name", "橙色·礼", "lv", 6, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144006, map("id", 144006, "name", "橙色·礼", "lv", 7, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init543() {
data.map(
    144007, map("id", 144007, "name", "橙色·礼", "lv", 8, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144008, map("id", 144008, "name", "橙色·礼", "lv", 9, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144009, map("id", 144009, "name", "橙色·礼", "lv", 10, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    144100, map("id", 144100, "name", "橙色·乐", "lv", 1, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144101, map("id", 144101, "name", "橙色·乐", "lv", 2, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init544() {
data.map(
    144102, map("id", 144102, "name", "橙色·乐", "lv", 3, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144103, map("id", 144103, "name", "橙色·乐", "lv", 4, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144104, map("id", 144104, "name", "橙色·乐", "lv", 5, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144105, map("id", 144105, "name", "橙色·乐", "lv", 6, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144106, map("id", 144106, "name", "橙色·乐", "lv", 7, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init545() {
data.map(
    144107, map("id", 144107, "name", "橙色·乐", "lv", 8, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144108, map("id", 144108, "name", "橙色·乐", "lv", 9, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144109, map("id", 144109, "name", "橙色·乐", "lv", 10, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    144200, map("id", 144200, "name", "橙色·射", "lv", 1, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144201, map("id", 144201, "name", "橙色·射", "lv", 2, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init546() {
data.map(
    144202, map("id", 144202, "name", "橙色·射", "lv", 3, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144203, map("id", 144203, "name", "橙色·射", "lv", 4, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144204, map("id", 144204, "name", "橙色·射", "lv", 5, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144205, map("id", 144205, "name", "橙色·射", "lv", 6, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144206, map("id", 144206, "name", "橙色·射", "lv", 7, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init547() {
data.map(
    144207, map("id", 144207, "name", "橙色·射", "lv", 8, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144208, map("id", 144208, "name", "橙色·射", "lv", 9, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144209, map("id", 144209, "name", "橙色·射", "lv", 10, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    144300, map("id", 144300, "name", "橙色·御", "lv", 1, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144301, map("id", 144301, "name", "橙色·御", "lv", 2, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init548() {
data.map(
    144302, map("id", 144302, "name", "橙色·御", "lv", 3, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144303, map("id", 144303, "name", "橙色·御", "lv", 4, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144304, map("id", 144304, "name", "橙色·御", "lv", 5, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144305, map("id", 144305, "name", "橙色·御", "lv", 6, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144306, map("id", 144306, "name", "橙色·御", "lv", 7, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init549() {
data.map(
    144307, map("id", 144307, "name", "橙色·御", "lv", 8, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144308, map("id", 144308, "name", "橙色·御", "lv", 9, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144309, map("id", 144309, "name", "橙色·御", "lv", 10, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    144400, map("id", 144400, "name", "橙色·书", "lv", 1, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144401, map("id", 144401, "name", "橙色·书", "lv", 2, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init550() {
data.map(
    144402, map("id", 144402, "name", "橙色·书", "lv", 3, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144403, map("id", 144403, "name", "橙色·书", "lv", 4, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144404, map("id", 144404, "name", "橙色·书", "lv", 5, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144405, map("id", 144405, "name", "橙色·书", "lv", 6, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144406, map("id", 144406, "name", "橙色·书", "lv", 7, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init551() {
data.map(
    144407, map("id", 144407, "name", "橙色·书", "lv", 8, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144408, map("id", 144408, "name", "橙色·书", "lv", 9, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144409, map("id", 144409, "name", "橙色·书", "lv", 10, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    144500, map("id", 144500, "name", "橙色·数", "lv", 1, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144501, map("id", 144501, "name", "橙色·数", "lv", 2, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init552() {
data.map(
    144502, map("id", 144502, "name", "橙色·数", "lv", 3, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144503, map("id", 144503, "name", "橙色·数", "lv", 4, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144504, map("id", 144504, "name", "橙色·数", "lv", 5, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144505, map("id", 144505, "name", "橙色·数", "lv", 6, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144506, map("id", 144506, "name", "橙色·数", "lv", 7, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init553() {
data.map(
    144507, map("id", 144507, "name", "橙色·数", "lv", 8, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144508, map("id", 144508, "name", "橙色·数", "lv", 9, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    144509, map("id", 144509, "name", "橙色·数", "lv", 10, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145000, map("id", 145000, "name", "礼", "lv", 1, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145001, map("id", 145001, "name", "礼", "lv", 2, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init554() {
data.map(
    145002, map("id", 145002, "name", "礼", "lv", 3, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145003, map("id", 145003, "name", "礼", "lv", 4, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145004, map("id", 145004, "name", "礼", "lv", 5, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145005, map("id", 145005, "name", "礼", "lv", 6, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145006, map("id", 145006, "name", "礼", "lv", 7, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init555() {
data.map(
    145007, map("id", 145007, "name", "礼", "lv", 8, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145008, map("id", 145008, "name", "礼", "lv", 9, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145009, map("id", 145009, "name", "礼", "lv", 10, "kind", 16, "subKind", 1, "stack", false, "useMode", 0, "money", 40000),
    145100, map("id", 145100, "name", "乐", "lv", 1, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145101, map("id", 145101, "name", "乐", "lv", 2, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init556() {
data.map(
    145102, map("id", 145102, "name", "乐", "lv", 3, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145103, map("id", 145103, "name", "乐", "lv", 4, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145104, map("id", 145104, "name", "乐", "lv", 5, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145105, map("id", 145105, "name", "乐", "lv", 6, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145106, map("id", 145106, "name", "乐", "lv", 7, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init557() {
data.map(
    145107, map("id", 145107, "name", "乐", "lv", 8, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145108, map("id", 145108, "name", "乐", "lv", 9, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145109, map("id", 145109, "name", "乐", "lv", 10, "kind", 16, "subKind", 2, "stack", false, "useMode", 0, "money", 40000),
    145200, map("id", 145200, "name", "射", "lv", 1, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145201, map("id", 145201, "name", "射", "lv", 2, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init558() {
data.map(
    145202, map("id", 145202, "name", "射", "lv", 3, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145203, map("id", 145203, "name", "射", "lv", 4, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145204, map("id", 145204, "name", "射", "lv", 5, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145205, map("id", 145205, "name", "射", "lv", 6, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145206, map("id", 145206, "name", "射", "lv", 7, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init559() {
data.map(
    145207, map("id", 145207, "name", "射", "lv", 8, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145208, map("id", 145208, "name", "射", "lv", 9, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145209, map("id", 145209, "name", "射", "lv", 10, "kind", 16, "subKind", 3, "stack", false, "useMode", 0, "money", 40000),
    145300, map("id", 145300, "name", "御", "lv", 1, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145301, map("id", 145301, "name", "御", "lv", 2, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init560() {
data.map(
    145302, map("id", 145302, "name", "御", "lv", 3, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145303, map("id", 145303, "name", "御", "lv", 4, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145304, map("id", 145304, "name", "御", "lv", 5, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145305, map("id", 145305, "name", "御", "lv", 6, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145306, map("id", 145306, "name", "御", "lv", 7, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init561() {
data.map(
    145307, map("id", 145307, "name", "御", "lv", 8, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145308, map("id", 145308, "name", "御", "lv", 9, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145309, map("id", 145309, "name", "御", "lv", 10, "kind", 16, "subKind", 4, "stack", false, "useMode", 0, "money", 40000),
    145400, map("id", 145400, "name", "书", "lv", 1, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145401, map("id", 145401, "name", "书", "lv", 2, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init562() {
data.map(
    145402, map("id", 145402, "name", "书", "lv", 3, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145403, map("id", 145403, "name", "书", "lv", 4, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145404, map("id", 145404, "name", "书", "lv", 5, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145405, map("id", 145405, "name", "书", "lv", 6, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145406, map("id", 145406, "name", "书", "lv", 7, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init563() {
data.map(
    145407, map("id", 145407, "name", "书", "lv", 8, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145408, map("id", 145408, "name", "书", "lv", 9, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145409, map("id", 145409, "name", "书", "lv", 10, "kind", 16, "subKind", 5, "stack", false, "useMode", 0, "money", 40000),
    145500, map("id", 145500, "name", "数", "lv", 1, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145501, map("id", 145501, "name", "数", "lv", 2, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init564() {
data.map(
    145502, map("id", 145502, "name", "数", "lv", 3, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145503, map("id", 145503, "name", "数", "lv", 4, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145504, map("id", 145504, "name", "数", "lv", 5, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145505, map("id", 145505, "name", "数", "lv", 6, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145506, map("id", 145506, "name", "数", "lv", 7, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init565() {
data.map(
    145507, map("id", 145507, "name", "数", "lv", 8, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145508, map("id", 145508, "name", "数", "lv", 9, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    145509, map("id", 145509, "name", "数", "lv", 10, "kind", 16, "subKind", 6, "stack", false, "useMode", 0, "money", 40000),
    146000, map("id", 146000, "name", "白色经验", "lv", 1, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146001, map("id", 146001, "name", "白色经验", "lv", 2, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init566() {
data.map(
    146002, map("id", 146002, "name", "白色经验", "lv", 3, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146003, map("id", 146003, "name", "白色经验", "lv", 4, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146004, map("id", 146004, "name", "白色经验", "lv", 5, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146005, map("id", 146005, "name", "白色经验", "lv", 6, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146006, map("id", 146006, "name", "白色经验", "lv", 7, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500)
);
    }

    private static void init567() {
data.map(
    146007, map("id", 146007, "name", "白色经验", "lv", 8, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146008, map("id", 146008, "name", "白色经验", "lv", 9, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146009, map("id", 146009, "name", "白色经验", "lv", 10, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 1500),
    146010, map("id", 146010, "name", "绿色经验", "lv", 1, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146011, map("id", 146011, "name", "绿色经验", "lv", 2, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init568() {
data.map(
    146012, map("id", 146012, "name", "绿色经验", "lv", 3, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146013, map("id", 146013, "name", "绿色经验", "lv", 4, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146014, map("id", 146014, "name", "绿色经验", "lv", 5, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146015, map("id", 146015, "name", "绿色经验", "lv", 6, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146016, map("id", 146016, "name", "绿色经验", "lv", 7, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000)
);
    }

    private static void init569() {
data.map(
    146017, map("id", 146017, "name", "绿色经验", "lv", 8, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146018, map("id", 146018, "name", "绿色经验", "lv", 9, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146019, map("id", 146019, "name", "绿色经验", "lv", 10, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2000),
    146020, map("id", 146020, "name", "蓝色经验", "lv", 1, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146021, map("id", 146021, "name", "蓝色经验", "lv", 2, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init570() {
data.map(
    146022, map("id", 146022, "name", "蓝色经验", "lv", 3, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146023, map("id", 146023, "name", "蓝色经验", "lv", 4, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146024, map("id", 146024, "name", "蓝色经验", "lv", 5, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146025, map("id", 146025, "name", "蓝色经验", "lv", 6, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146026, map("id", 146026, "name", "蓝色经验", "lv", 7, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500)
);
    }

    private static void init571() {
data.map(
    146027, map("id", 146027, "name", "蓝色经验", "lv", 8, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146028, map("id", 146028, "name", "蓝色经验", "lv", 9, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146029, map("id", 146029, "name", "蓝色经验", "lv", 10, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 2500),
    146030, map("id", 146030, "name", "紫色经验", "lv", 1, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146031, map("id", 146031, "name", "紫色经验", "lv", 2, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init572() {
data.map(
    146032, map("id", 146032, "name", "紫色经验", "lv", 3, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146033, map("id", 146033, "name", "紫色经验", "lv", 4, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146034, map("id", 146034, "name", "紫色经验", "lv", 5, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146035, map("id", 146035, "name", "紫色经验", "lv", 6, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146036, map("id", 146036, "name", "紫色经验", "lv", 7, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000)
);
    }

    private static void init573() {
data.map(
    146037, map("id", 146037, "name", "紫色经验", "lv", 8, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146038, map("id", 146038, "name", "紫色经验", "lv", 9, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146039, map("id", 146039, "name", "紫色经验", "lv", 10, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 8000),
    146040, map("id", 146040, "name", "橙色经验", "lv", 1, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146041, map("id", 146041, "name", "橙色经验", "lv", 2, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init574() {
data.map(
    146042, map("id", 146042, "name", "橙色经验", "lv", 3, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146043, map("id", 146043, "name", "橙色经验", "lv", 4, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146044, map("id", 146044, "name", "橙色经验", "lv", 5, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146045, map("id", 146045, "name", "橙色经验", "lv", 6, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146046, map("id", 146046, "name", "橙色经验", "lv", 7, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init575() {
data.map(
    146047, map("id", 146047, "name", "橙色经验", "lv", 8, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146048, map("id", 146048, "name", "橙色经验", "lv", 9, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146049, map("id", 146049, "name", "橙色经验", "lv", 10, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146050, map("id", 146050, "name", "红色经验", "lv", 1, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146051, map("id", 146051, "name", "红色经验", "lv", 2, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init576() {
data.map(
    146052, map("id", 146052, "name", "红色经验", "lv", 3, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146053, map("id", 146053, "name", "红色经验", "lv", 4, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146054, map("id", 146054, "name", "红色经验", "lv", 5, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146055, map("id", 146055, "name", "红色经验", "lv", 6, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146056, map("id", 146056, "name", "红色经验", "lv", 7, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000)
);
    }

    private static void init577() {
data.map(
    146057, map("id", 146057, "name", "红色经验", "lv", 8, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146058, map("id", 146058, "name", "红色经验", "lv", 9, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    146059, map("id", 146059, "name", "红色经验", "lv", 10, "kind", 16, "subKind", 7, "stack", false, "useMode", 0, "money", 40000),
    150500, map("id", 150500, "name", "金锣桃羽头发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    150501, map("id", 150501, "name", "公主头发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

    private static void init578() {
data.map(
    150502, map("id", 150502, "name", "学院风双马尾", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    151000, map("id", 151000, "name", "金锣桃羽纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    151001, map("id", 151001, "name", "公主纱裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    151002, map("id", 151002, "name", "学院风校服裙", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    152000, map("id", 152000, "name", "金锣桃羽项链", "lv", 1, "kind", 3, "subKind", 5, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

    private static void init579() {
data.map(
    152500, map("id", 152500, "name", "学院风蝴蝶结", "lv", 1, "kind", 3, "subKind", 1, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    154500, map("id", 154500, "name", "金锣桃羽妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    154501, map("id", 154501, "name", "公主妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    154502, map("id", 154502, "name", "学院风娃娃脸", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    155500, map("id", 155500, "name", "学院风鞋子", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

    private static void init580() {
data.map(
    156000, map("id", 156000, "name", "金锣桃羽飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    156001, map("id", 156001, "name", "学院风背景", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    160500, map("id", 160500, "name", "金锣桃羽头发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    160501, map("id", 160501, "name", "皇子头发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    160502, map("id", 160502, "name", "学院风短发", "lv", 1, "kind", 3, "subKind", 2, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

    private static void init581() {
data.map(
    161000, map("id", 161000, "name", "金锣桃羽锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    161001, map("id", 161001, "name", "皇子锦服", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    161002, map("id", 161002, "name", "学院风校服装", "lv", 1, "kind", 3, "subKind", 3, "evenQuick", true, "quickMoney", 1000, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    163000, map("id", 163000, "name", "金锣桃羽腰饰", "lv", 1, "kind", 3, "subKind", 7, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    164000, map("id", 164000, "name", "金锣桃羽妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

    private static void init582() {
data.map(
    164001, map("id", 164001, "name", "皇子妆容", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    164002, map("id", 164002, "name", "学院风娃娃脸", "lv", 1, "kind", 3, "subKind", 9, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    164500, map("id", 164500, "name", "学院风鞋子", "lv", 1, "kind", 3, "subKind", 10, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    165500, map("id", 165500, "name", "金锣桃羽飘花", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0),
    165501, map("id", 165501, "name", "学院风背景", "lv", 1, "kind", 3, "subKind", 12, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

    private static void init583() {
data.map(
    166000, map("id", 166000, "name", "学院风镜框", "lv", 1, "kind", 3, "subKind", 14, "evenQuick", true, "quickMoney", 500, "acquirePathway", true, "pathway", list(109, 152), "pathwayKind", list(0, 0), "stack", false, "useMode", 0)
);
    }

}