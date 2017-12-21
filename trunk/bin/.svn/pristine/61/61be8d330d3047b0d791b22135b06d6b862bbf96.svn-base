package com.hadoit.game.fsgame.gms.config.data;

import com.hadoit.game.fsgame.gms.config.data.base.LData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;

/**
 * 场景表.csv
 * 场景编号 = id
 * 场景名称 = name
 * 场景类型 = kind
 * 前置场景 = preScene
 * 后续场景 = nextScene
 * 战斗背景 = combatBackground
 * 场景位置 = location
 * 通关奖励 = starAward
 * 对话 = Talk
 */
public class SceneData extends LData {
    public static final LMap data = new LMap();

    static {
        init0();
        data.setFrozen(true);
    }

    private static void init0() {
data.map(
    10000, map("id", 10000, "name", "初入王府", "kind", 1, "nextScene", 10001, "combatBackground", 1004, "location", 1, "starAward", list(23000, 23001)),
    10001, map("id", 10001, "name", "深宫浮华", "kind", 1, "preScene", 10000, "nextScene", 10002, "combatBackground", 1003, "location", 2, "starAward", list(23002, 23003)),
    10002, map("id", 10002, "name", "凤头钗", "kind", 1, "preScene", 10001, "nextScene", 10003, "combatBackground", 1002, "location", 3, "starAward", list(23004, 23005)),
    10003, map("id", 10003, "name", "西风恨", "kind", 1, "preScene", 10002, "nextScene", 10004, "combatBackground", 1001, "location", 4, "starAward", list(23006, 23007)),
    10004, map("id", 10004, "name", "盛衰荣宠", "kind", 1, "preScene", 10003, "nextScene", 10005, "combatBackground", 1002, "location", 5, "starAward", list(23008, 23009)),
    10005, map("id", 10005, "name", "流言春情", "kind", 1, "preScene", 10004, "nextScene", 10006, "combatBackground", 1003, "location", 6, "starAward", list(23010, 23011)),
    10006, map("id", 10006, "name", "复生", "kind", 1, "preScene", 10005, "nextScene", 10007, "combatBackground", 1004, "location", 7, "starAward", list(23012, 23013)),
    10007, map("id", 10007, "name", "猫刑", "kind", 1, "preScene", 10006, "combatBackground", 1004, "location", 8, "starAward", list(23014, 23015))
);
    }

}