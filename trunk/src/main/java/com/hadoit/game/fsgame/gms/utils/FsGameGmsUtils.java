package com.hadoit.game.fsgame.gms.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.context.ApplicationContext;

import com.hadoit.game.common.framework.property.PropertyLoader;
import com.hadoit.game.common.lang.DataUtils;
import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.common.lang.ReflectionUtils;
import com.hadoit.game.fsgame.gms.annotation.JsExportMethod;
import com.hadoit.game.fsgame.gms.config.data.GuankaBaseData;
import com.hadoit.game.fsgame.gms.config.data.GuankaMonsterData;
import com.hadoit.game.fsgame.gms.config.data.ItemData;
import com.hadoit.game.fsgame.gms.config.data.XsydData;
import com.hadoit.game.fsgame.gms.config.data.base.LMap;
import com.hadoit.game.fsgame.gms.meta.CouponCategroy;
import com.hadoit.game.fsgame.gms.service.CouponCategroyService;

import freemarker.ext.beans.BeansWrapper;
import freemarker.template.TemplateModelException;

public class FsGameGmsUtils {

	public static ApplicationContext applicationContext;

	private static final char[] symbols;
	static {
		StringBuilder tmp = new StringBuilder();
		for (char ch = '0'; ch <= '9'; ++ch)
			if (ch != '0') {
				tmp.append(ch);
			}
		for (char ch = 'A'; ch <= 'Z'; ++ch)
			if (ch != 'O') {
				tmp.append(ch);
			}
		symbols = tmp.toString().toCharArray();
	}

	public static String randomString(int length) {
		char[] buf = new char[length];
		for (int idx = 0; idx < buf.length; ++idx)
			buf[idx] = symbols[RandomUtils.nextInt(symbols.length)];
		return new String(buf);
	}

	public static Set<String> randomStringSet(int count, int length) {
		Set<String> ret = new HashSet<String>();
		for (int i = 0; i < count; i++) {
			ret.add(randomString(length));
		}
		return ret;
	}

	private static String ZONE = null;
	static {
		Properties srvProps = PropertyLoader.loadProperties("config.properties");
		ZONE = PropertyLoader.getStringProperty(srvProps, "config.zone", "");
	}

	public static boolean inZone(String zone) {
		return ZONE.equalsIgnoreCase(zone);
	}

	public static String getZone() {
		return ZONE;
	}

	public static Map<String, Locale> LOCALE_MAP = new HashMap<String, Locale>();
	static {
		LOCALE_MAP.put("cn", new Locale("zh", "CN"));
		LOCALE_MAP.put("yn", new Locale("vi", "VN"));
	}

	public static Locale getLocale() {
		Locale le = LOCALE_MAP.get(ZONE);
		return le == null ? LOCALE_MAP.get("cn") : le;
	}

	/**
	 * 权限列表
	 */
	public static Map<String, List<String>> aclMap = new HashMap<String, List<String>>();
	static {
		Properties p = PropertyLoader.loadProperties("acl.properties");
		for (Map.Entry<Object, Object> s : p.entrySet()) {
			String res = (String) s.getKey();
			String[] roles = StringUtils.split((String) s.getValue(), ",");
			for (String role : roles) {
				if (!aclMap.containsKey(role)) {
					aclMap.put(role, new ArrayList<String>());
				}
				aclMap.get(role).add(res);
			}
		}
	}

	/**
	 * 用户组
	 */
	public final static int USER_GROUP_FORBIDDEN = -10;// 禁止
	public final static int USER_GROUP_NORMAL = 0;// 没有权限的普通人
	public final static int USER_GROUP_SUPER = 10;// 没有权限的super人
	public final static int USER_GROUP_GM = 100;// 有管理权限的GM
	public final static int USER_GROUP_DEV = 1000;// 有管理权限的开发团队
	public final static int USER_GROUP_GOD = 10000;// 最高权限

	/**
	 * 资源产入产出
	 */
	public final static int RES_OUT = 1;
	public final static int RES_IN = 2;

	/**
	 * 资源(货币)对应的物品ID
	 */
	public final static int ITEM_ID_MONEY = 80001;
	public final static int ITEM_ID_GOLD = 80002;
	public final static int ITEM_ID_EXP = 80003;
	public final static int ITEM_ID_LEITAI_POINT = 80004; // 擂台积分
	public final static int ITEM_ID_ZHUANGBEI_SUIPIAN = 80005; // 装备碎片
	public final static int ITEM_ID_LEIJI_GOLD = 80006; // vip积分
	public final static int ITEM_ID_LADDER_XING = 80008; // 武举积分（星）
	public final static int ITEM_ID_YU_PEI_QING_SHUI = 80009; // 晴水玉佩
	public final static int ITEM_ID_YU_PEI_FEI_CUI = 80010; // 翡翠玉佩
	public final static int ITEM_ID_YU_PEI_YANG_ZHI = 80011; // 羊脂玉佩
	public final static int ITEM_ID_YU_PEI_JIN_XINA_YU = 80012; // 金镶玉玉佩
	public final static int ITEM_ID_NEI_DAN = 80013; // 内丹
	public final static int ITEM_ID_FAN_RONG_DU = 80014; // 繁荣度
	public final static int ITEM_ID_MEI_LI = 80015; // 魅力
	public final static int ITEM_ID_JIN_ZHUAN = 80016; // 金砖
	public final static int ITEM_ID_PAIXI_JINZHUAN = 80017; // 派系金砖
	public final static int ITEM_ID_YOU_HAO_DU = 80018; // 友好度
	public final static int ITEM_ID_EN_AI_ZHI = 80019; // 恩爱值
	public final static int ITEM_ID_SHI_LI_ZHI = 80020; // 势力值
	public final static int ITEM_ID_SW = 80021; // 声望
	public final static int ITEM_ID_ZHUANGBAN_SUIPIAN = 80023;// 装扮碎片
	public final static int ITEM_ID_ZSB = 80024; // 龙凤币（封神是战神币）
	public final static int ITEM_ID_RYZ = 80026; // 荣誉值

	// 元宝
	public final static int LOG_GOLD_CHANGE_CHONGZHI = 1;
	public final static int LOG_GOLD_CHANGE_GZTB_SUODING = 2;
	public final static int LOG_GOLD_CHANGE_GZTB_TS = 3;
	public final static int LOG_GOLD_CHANGE_GZTB_REFRESH = 4;
	public final static int LOG_GOLD_CHANGE_CHANGE_NAME = 5;
	public final static int LOG_GOLD_CHANGE_USERPROP_LIBAO = 6;
	public final static int LOG_GOLD_CHANGE_SCENE_REWARD = 7;
	public final static int LOG_GOLD_CHANGE_SYSTEM_REWARD = 8;
	public final static int LOG_GOLD_CHANGE_MISSION = 9;
	public final static int LOG_GOLD_CHANGE_BUY_HONGBAO = 10;
	public final static int LOG_GOLD_CHANGE_HONGBAO_GOT = 11;
	public final static int LOG_GOLD_CHANGE_BUILDING_CREATE = 12;
	public final static int LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER = 13;
	public final static int LOG_GOLD_CHANGE_FST_PH = 14;
	public final static int LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT = 15;
	public final static int LOG_GOLD_CHANGE_FST_CLEAR_CD = 16;
	public final static int LOG_GOLD_CHANGE_BUILD_GONGHUI = 17;
	public final static int LOG_GOLD_CHANGE_CREATE_GONGHUI = 18;
	public final static int LOG_GOLD_CHANGE_OPEN_HUAPENG = 19;
	public final static int LOG_GOLD_CHANGE_BUY_DRESS = 20;
	public final static int LOG_GOLD_CHANGE_BUY_ITEM = 21;
	public final static int LOG_GOLD_CHANGE_SPEED_UP_FLOWER = 22;
	public final static int LOG_GOLD_CHANGE_SPEED_UP_MATERIAL = 23;
	public final static int LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE = 24;
	public final static int LOG_GOLD_CHANGE_BUY_SAODANG = 25;
	public final static int LOG_GOLD_CHANGE_ZHAOMU_SERVANT = 26;
	public final static int LOG_GOLD_CHANGE_BAG_OPEN_GRID = 27;
	public final static int LOG_GOLD_CHANGE_CHANGE_JOB = 28;
	public final static int LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU = 29;
	public final static int LOG_GOLD_CHANGE_CHONGZHI_PRESENT = 30;
	public final static int LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD = 31;
	public final static int LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO = 32;
	public final static int LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU = 33;
	public final static int LOG_GOLD_CHANGE_SHIJIEBOSS_PH = 34;
	public final static int LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION = 35;
	public final static int LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION = 36;
	public final static int LOG_GOLD_CHANGE_OPEN_BAO_XIANG = 37;
	public final static int LOG_GOLD_CHANGE_BUILDING_UPGRADE = 38;
	public final static int LOG_GOLD_CHANGE_BUY_VIP_ITEM = 39;
	public final static int LOG_GOLD_CHANGE_UPGRADE_BUILD = 40;
	public final static int LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST = 41;
	public final static int LOG_GOLD_CHANGE_KEJU_DATI_REWARD = 42;
	public final static int LOG_GOLD_CHANGE_YUE_KA = 43;
	public final static int LOG_GOLD_CHANGE_JI_KA = 44;
	public final static int LOG_GOLD_CHANGE_XSTM_BUY_ITEM = 45;
	public final static int LOG_GOLD_CHANGE_CLAIM_BIND_REWARD = 46;
	public final static int LOG_GOLD_CHANGE_ADD_LYT_TZ = 47;
	public final static int LOG_GOLD_CHANGE_COMPLETE_LYT_SD = 48;
	public final static int LOG_GOLD_CHANGE_LYT_YB_CZ = 49;
	public final static int LOG_GOLD_CHANGE_LYT_PH = 50;
	public final static int LOG_GOLD_PRESENT_GIFT = 51;
	public final static int LOG_GOLD_CHANGE_OPT_BYU_CZJJ = 52;
	public final static int LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ = 53;
	public final static int LOG_GOLD_CHANGE_QZ_FIGHT = 54;
	public final static int LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI = 55;
	public final static int LOG_GOLD_CHANGE_CHEWEI_SHANGCHA = 56;
	public final static int LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU = 57;
	public final static int LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT = 58;
	public final static int LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH = 59;
	public final static int LOG_GOLD_CHANGE_ZST_CLEAR = 60;
	public final static int LOG_GOLD_CHANGE_ZST_REFRESH = 61;
	public final static int LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP = 62;
	public final static int LOG_GOLD_CHANGE_ZST_BUY_ITEM = 63;
	public final static int LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED = 64;
	public final static int LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED = 65;
	public final static int LOG_GOLD_CHANGE_HZ_CHANG_NAME = 66;
	public final static int LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP = 67;
	public final static int LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT = 68;
	public final static int LOG_GOLD_CHANGE_OPT_CLAIM_XFFL = 69;
	public final static int LOG_GOLD_CHANGE_FQ_HU_CUT_TIME = 70;
	public final static int LOG_GOLD_CHANGE_LI_HUN = 72;// 离婚
	public final static int LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM = 73;// 开服七日活动
	public final static int LOG_GOLD_CHANGE_ON_SHARE = 74;// 分享
	public final static int LOG_RES_CHANGE_ON_SYS_HONGBAO = 75;// 系统红包
	public final static int LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME = 76;// 买红包
	public final static int LOG_RES_CHANGE_ON_BUY_HONGBAO = 77;// 红包
	public final static int LOG_RES_CHANGE_HUI_GUI = 78;// 回归
	public final static int LOG_RES_CHANGE_ON_BIND_PHONE = 79;// 绑定手机号奖励
	// 2017年8月23日加入
	public final static int LOG_GOLD_CHANGE_ZLMT_YB_OPEN_BOX = 80;// 真灵秘塔开宝箱
	public final static int LOG_GOLD_CHANGE_LAND_UP = 81;// 土地升级
	public final static int LOG_GOLD_CHANGE_HEI_SHI = 82; // 黑市购买
	public final static int LOG_GOLD_CHANGE_REFRESH_HEI_SHI = 83; // 刷新黑市
	public final static int LOG_GOLD_CHANGE_REFRESH_ZHUAN_PAN = 84; // 刷新转盘
	public final static int LOG_GOLD_CHANGE_RISING_STAR = 85;// 升星
	public final static int LOG_GOLD_CHANGE_ACTIVE_DUIHUAN = 86; // 活动兑换消耗元宝
	public final static int LOG_GOLD_CHANGE_CHONGZHI_PRESENT_THGM = 87;// 特惠购买
	public final static int LOG_GOLD_CHANGE_SPEED_UP_VEGETABLE = 88; // 黄金加速蔬菜成熟时间
	public final static int LOG_GOLD_CHANGE_AVTIVATE_ACQIEREMENT = 89;// 元宝激活才艺
	public final static int LOG_GOLD_CHANGE_ON_DATAIJIAN = 90;// 打太监
	public final static int LOG_GOLD_CHANGE_UP_HZ = 91;// 皇子换装 升级

	public final static int[] LOG_GOLD_LIST = new int[] { LOG_GOLD_CHANGE_GZTB_SUODING, LOG_GOLD_CHANGE_GZTB_TS,
			LOG_GOLD_CHANGE_GZTB_REFRESH, LOG_GOLD_CHANGE_CHANGE_NAME, LOG_GOLD_CHANGE_BUY_HONGBAO,
			LOG_GOLD_CHANGE_BUILDING_CREATE, LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,
			LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT, LOG_GOLD_CHANGE_FST_CLEAR_CD, LOG_GOLD_CHANGE_CREATE_GONGHUI,
			LOG_GOLD_CHANGE_OPEN_HUAPENG, LOG_GOLD_CHANGE_BUY_DRESS, LOG_GOLD_CHANGE_BUY_ITEM,
			LOG_GOLD_CHANGE_SPEED_UP_FLOWER, LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,
			LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE, LOG_GOLD_CHANGE_BUY_SAODANG, LOG_GOLD_CHANGE_ZHAOMU_SERVANT,
			LOG_GOLD_CHANGE_BAG_OPEN_GRID, LOG_GOLD_CHANGE_CHANGE_JOB, LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,
			LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU, LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,
			LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION, LOG_GOLD_CHANGE_OPEN_BAO_XIANG, LOG_GOLD_CHANGE_BUY_VIP_ITEM,
			LOG_GOLD_CHANGE_UPGRADE_BUILD, LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST, LOG_GOLD_CHANGE_XSTM_BUY_ITEM,
			LOG_GOLD_CHANGE_ADD_LYT_TZ, LOG_GOLD_CHANGE_COMPLETE_LYT_SD, LOG_GOLD_CHANGE_LYT_YB_CZ };

	// 银两
	public final static int LOG_MONEY_CHANGE_CREATE_BUILD = 1;
	public final static int LOG_MONEY_CHANGE_BUY_DRESS = 2;
	public final static int LOG_MONEY_CHANGE_FABAO_UPGRADE = 3;
	public final static int LOG_MONEY_CHANGE_MAKE_EQUIP = 4;
	public final static int LOG_MONEY_CHANGE_ZHAOMU_SERVANT = 5;
	public final static int LOG_MONEY_CHANGE_CHAHUA = 6;
	public final static int LOG_MONEY_CHANGE_GZTB_TS = 7;
	public final static int LOG_MONEY_CHANGE_GZTB_TS_CONSUME = 8;
	public final static int LOG_MONEY_CHANGE_BUILD_GONGHUI = 9;
	public final static int LOG_MONEY_CHANGE_FIGHT_FST = 10;
	public final static int LOG_MONEY_CHANGE_FIGHT_LADDER = 11;
	public final static int LOG_MONEY_CHANGE_EQUIP_SALE = 12;
	public final static int LOG_MONEY_CHANGE_USERPROP_LIBAO = 13;
	public final static int LOG_MONEY_CHANGE_SCENE_REWARD = 14;
	public final static int LOG_MONEY_CHANGE_SUBMIT_PRESENTS_LIST = 15;
	public final static int LOG_MONEY_CHANGE_SYSTEM_REWARD = 16;
	public final static int LOG_MONEY_CHANGE_FIGHT_GK = 17;
	public final static int LOG_MONEY_CHANGE_MISSION = 18;
	public final static int LOG_MONEY_CHANGE_FST_PH = 19;
	public final static int LOG_MONEY_CHANGE_SHOP_BUY_ITEM = 20;
	public final static int LOG_MONEY_CHANGE_QZ = 21;
	public final static int LOG_MONEY_CHANGE_SHIJIEBOSS_PH = 26;
	public final static int LOG_MONEY_CHANGE_SHIJIEBOSS_GUWU = 27;
	public final static int LOG_MONEY_CHANGE_SHIJIEBOSS_FIGHT = 28;
	public final static int LOG_MONEY_CHANGE_FIRST_CHONGZHI = 40;
	public final static int LOG_MONEY_CHANGE_ITEM_USE_MONEY_CARD = 41;
	public final static int LOG_MONEY_CHANGE_OPEN_BAO_XIANG = 42;
	public final static int LOG_MONEY_CHANGE_MARRIAGE = 43;
	public final static int LOG_MONEY_CHANGE_QIANG_DAO = 44;
	public final static int LOG_MONEY_CHANGE_UPGRADE_STONE = 45;
	public final static int LOG_MONEY_CHANGE_GRADE_HUDONG_FENGLU = 46;
	public final static int LOG_MONEY_CHANGE_MAKE_CLOTHES = 47;
	public final static int LOG_MONEY_CHANGE_OPEN_BAG = 48;
	public final static int LOG_MONEY_CHANGE_KEJU_DATI_REWARD = 49;
	public final static int LOG_MONEY_CHANGE_MAKE_MATERIAL = 50;
	public final static int LOG_MONEY_CHANGE_DSTX = 51;
	public final static int LOG_MONEY_CHANGE_SAO_DNAG = 52;
	public final static int LOG_MONEY_CHANGE_FENHONG = 53;
	public final static int LOG_MONEY_CHANGE_STONE_RONGHE = 54;
	public final static int LOG_MONEY_CHANGE_FIGHT_LYT = 55;
	public final static int LOG_MONEY_CHANGE_LYT_LVUP = 56;
	public final static int LOG_MONEY_CHANGE_LYT_PH = 57;
	public final static int LOG_MONEY_CHANGE_ZHENGHUN = 58;
	public final static int LOG_MONEY_CHANGE_QIUHUN = 59;
	public final static int LOG_MONEY_CHANGE_MARRIAGE_TREE = 60;
	public final static int LOG_MONEY_CHANGE_XJZB_BET_CONSUME = 61;
	public final static int LOG_MONEY_CHANGE_CHEWEI_FANGWEN = 62;
	public final static int LOG_MONEY_CHANGE_OPEN_BUILDING_CHEWEI = 63;
	public final static int LOG_MONEY_CHANGE_HARVEST_XQ = 64;
	public final static int LOG_MONEY_CHANGE_XJZB_BET = 65;
	public final static int LOG_MONEY_CHANGE_LLZ_ADD_GY_COUNT = 66;
	public final static int LOG_MONEY_CHANGE_ZST_SCORE = 67;
	public final static int LOG_MONEY_CHANGE_ZST_BUY_ITEM = 68;
	public final static int LOG_MONEY_CHANGE_QIANG_HUA = 69;
	public final static int LOG_MONEY_CHANGE_JING_JIE = 70;
	public final static int LOG_MONEY_CHANGE_STONE_FENJIE = 71;
	public final static int LOG_MONEY_CHANGE_LV_CHANGE = 72;// 升级奖励
	public final static int LOG_MONEY_CHANGE_CHEWEI_REWARD = 73;// 车位访问奖励
	public final static int LOG_MONEY_CHANGE_CHEWEI_BE_REWARD = 74;// 车位被访问奖励
	public final static int LOG_MONEY_CHANGE_NI_MING_HD = 75;// 匿名互动消耗
	public final static int LOG_MONEY_CHANGE_EQUIP_JING_LIAN = 76;// 装备精炼
	public final static int LOG_MONEY_CHANGE_XJZB_BET_CONSUME_GLOBAL = 77; // 跨服战消耗
	public final static int LOG_MONEY_CHANGE_XJZB_BET_GLOBAL = 78;// 跨服押注
	public final static int LOG_MONEY_CHANGE_DA_XIAO_TAI_JIAN = 79;// 打小太监
	// 2017年8月23日加入
	public final static int LOG_MONEY_CHANGE_FIGHT_ZLMT = 80;// 真灵秘塔
	public final static int LOG_MONEY_CHANGE_LAND_UP = 81;// 土地升级
	public final static int LOG_MONEY_CHANGE_HEI_SHI = 82;// 黑市购买
	public final static int LOG_MONEY_CHANGE_LLZ_GS_HC = 83;// 连理枝合成消耗
	public final static int LOG_MONEY_CHANGE_EXP_CONVER_MONEY = 84;// 满级经验 转换银两
	public final static int LOG_MONEY_CHANGE_ACTIVE_DUIHUAN = 85;// 满级经验 转换银两
	public final static int LOG_MONEY_CHANGE_THGM_CHONGZHI = 86;// 特惠购买
	public final static int LOG_MONEY_CHANGE_GTSW = 87;// 宫廷事务
	public final static int LOG_MONEY_CHANGE_SL = 88;// 试炼副本奖励
	public final static int LOG_MONEY_CHANGE_LEARN_ACQIEREMENT = 89;// 六艺 学习艺能
	public final static int LOG_MONEY_CHANGE_SELL_ACQIEREMENT = 12;// 卖才艺

	// 经验
	public final static int LOG_EXP_CHANGE_FIGHT_FST = 1;
	public final static int LOG_EXP_CHANGE_FIGHT_LADDER = 2;
	public final static int LOG_EXP_CHANGE_FIGHT_GK = 3;
	public final static int LOG_EXP_CHANGE_GUIDE_KEY_SETP = 4;
	public final static int LOG_EXP_CHANGE_TAKE_FLOWER = 5;
	public final static int LOG_EXP_CHANGE_TAKE_MATERIAL = 6;
	public final static int LOG_EXP_CHANGE_EXP_ITEM = 7;
	public final static int LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST = 8;
	public final static int LOG_EXP_CHANGE_ANIMAL_REAP = 9;
	public final static int LOG_EXP_CHANGE_HUA_PENG_FLOWER = 10;
	public final static int LOG_EXP_CHANGE_QING_AN = 11;
	public final static int LOG_EXP_CHANGE_MISSION = 12;
	public final static int LOG_EXP_CHANGE_DELETE_BUILD = 13;
	public final static int LOG_EXP_CHANGE_ANSWER_SECURITY_CODE = 14;
	public final static int LOG_EXP_CHANGE_KEJU_DATI = 15;
	public final static int LOG_EXP_CHANGE_SAO_DANG = 16;
	public final static int LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE = 17;
	public final static int LOG_EXP_CHANGE_DIAOYU = 18;
	public final static int LOG_EXP_CHANGE_HARVEST_XQ = 19;
	public final static int LOG_EXP_CHANGE_XQW_RANK_REWARD = 20;
	public final static int LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD = 21;
	public final static int LOG_EXP_CHANGE_CHEWEI = 22;
	public final static int LOG_EXP_CHANGE_LYT_LVUP = 23;
	public final static int LOG_EXP_CHANGE_HA_PENG_YI_JIAN = 25; // 花棚一键收花
	public final static int LOG_EXP_CHANGE_CHU_CHONG = 26; // 除虫
	public final static int LOG_EXP_CHANGE_JIAO_SHUI = 27; // 浇水
	public final static int LOG_EXP_CHANGE_CHU_CAO = 28; // 除草
	// 2017年8月23日
	public final static int LOG_EXP_CHANGE_LI_XIAN = 29; // 离线经验
	public final static int LOG_EXP_CHANGE_GTSW = 30;// 宫廷事务
	public final static int LOG_EXP_CHANGE_SW_FB = 31;// 试炼副本奖励

	public final static int LOG_EXP_CHANGE_GM = 99;

	// 物品
	public final static int LOG_ITEM_CHANGE_AVATAR_CREATE = 1;
	public final static int LOG_ITEM_CHANGE_SEX = 2;
	public final static int LOG_ITEM_CHANGE_GZTB_TS = 3;
	public final static int LOG_ITEM_CHANGE_GZTB_REWARD = 4;
	public final static int LOG_ITEM_CHANGE_USEPROP_LIBAO = 5;
	public final static int LOG_ITEM_CHANGE_SCENE_REWARD = 6;
	public final static int LOG_ITEM_CHANGE_ITEM_CONVERT_ADD = 7;
	public final static int LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT = 8;
	public final static int LOG_ITEM_CHANGE_FST_PH = 9;
	public final static int LOG_ITEM_CHANGE_LVUP = 10;
	public final static int LOG_ITEM_CHANGE_MIANSHENG = 11;
	public final static int LOG_ITEM_CHANGE_FIGHT_GHFUBEN = 12;
	public final static int LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER = 13;
	public final static int LOG_ITEM_CHANGE_STONE_ADD = 14;
	public final static int LOG_ITEM_CHANGE_DRESS_BUY = 15;
	public final static int LOG_ITEM_CHANGE_BUY_RMB_ITEM = 16;
	public final static int LOG_ITEM_CHANGE_DUIHUAN = 17;
	public final static int LOG_ITEM_CHANGE_FLOWER_SEED = 18;
	public final static int LOG_ITEM_CHANGE_MAKE_EQUIP = 19;
	public final static int LOG_ITEM_CHANGE_MAKE_METERIAL = 20;
	public final static int LOG_ITEM_CHANGE_STONE_REMOVE = 21;
	public final static int LOG_ITEM_CHANGE_TAKE_FLOWER = 22;
	public final static int LOG_ITEM_CHANGE_TAKE_MATERIAL = 23;
	public final static int LOG_ITEM_CHANGE_STONE_UPGRADE = 24;
	public final static int LOG_ITEM_CHANGE_USE_PROP_ZHENFA = 25;
	public final static int LOG_ITEM_CHANGE_GET_REWARD_PRESENT = 26;
	public final static int LOG_ITEM_CHANGE_SYSTEM_REWARD = 27;
	public final static int LOG_ITEM_CHANGE_FIGHT_GK = 28;
	public final static int LOG_ITEM_CHANGE_FIGHT_GK_ZD = 29;
	public final static int LOG_ITEM_CHANGE_MISSION = 30;
	public final static int LOG_ITEM_CHANGE_DECOMPOSE_EQUIP = 31;
	public final static int LOG_ITEM_CHANGE_EQUIP_SALE = 32;
	public final static int LOG_ITEM_CHANGE_CUT_TREE = 33;
	public final static int LOG_ITEM_CHANGE_CHAHUA = 34;
	public final static int LOG_ITEM_CHANGE_CHAHUA_SPEEDUP = 35;
	public final static int LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM = 36;
	public final static int LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST = 37;
	public final static int LOG_ITEM_CHANGE_GRADE_HUDONG = 38;
	public final static int LOG_ITEM_CHANGE_FIRST_PAY_GIFT = 39;
	public final static int LOG_ITEM_CHANGE_COUPON = 40;
	public final static int LOG_ITEM_CHANGE_ZHENFA_UP_LV = 41;
	public final static int LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD = 43;
	public final static int LOG_ITEM_CHANGE_CREATE_ANIMAL = 44;
	public final static int LOG_ITEM_CHANGE_FEED_ANIMAL = 45;
	public final static int LOG_ITEM_CHANGE_REAP_ANIMAL = 46;
	public final static int LOG_ITEM_CHANGE_ZENG_SONG_FLOWER = 47;
	public final static int LOG_ITEM_CHANGE_HORN = 48;
	public final static int LOG_ITEM_CHANGE_COMPOSE_FLOWER = 49;
	public final static int LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD = 50;
	public final static int LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA = 51;
	public final static int LOG_ITEM_CHANGE_SHIJIEBOSS_PH = 52;
	public final static int LOG_ITEM_CHANGE_OPEN_BAO_XIANG = 53;
	public final static int LOG_ITEM_CHANGE_BUY_VIP_ITEM = 54;
	public final static int LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD = 55;
	public final static int LOG_ITEM_CHANGE_MRRRIAGE_AGREE = 56;
	public final static int LOG_ITEM_CHANGE_YQM = 57;
	public final static int LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST = 58;
	public final static int LOG_ITEM_CHANGE_OPEN_BUILD_PROP = 59;
	public final static int LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP = 60;
	public final static int LOG_ITEM_CHANGE_MAKE_CLOTHES = 61;
	public final static int LOG_ITEM_CHANGE_USE_ZHAODUIFU = 62;
	public final static int LOG_ITEM_CHANGE_USE_ZHAOCUOFU = 63;
	public final static int LOG_ITEM_CHANGE_KEJU_DATI_REWARD = 64;
	public final static int LOG_ITEM_CHANGE_XSTM_ADD_ITEM = 65;
	public final static int LOG_ITEM_CHANGE_SAO_DANG_LING = 66;
	public final static int LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT = 67;
	public final static int LOG_ITEM_CHANGE_STONE_RONGHE = 68;
	public final static int LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE = 69;
	public final static int LOG_ITEM_CHANGE_USE_RED_TANG_YUAN = 70;
	public final static int LOG_ITEM_CHANGE_LYT_REWARD = 71;
	public final static int LOG_ITEM_CHANGE_MARRIAGE_FANGHUO = 72;
	public final static int LOG_ITEM_CHANGE_XJZB_SHOP = 73;
	public final static int LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS = 74;
	public final static int LOG_ITEM_CHANGE_DIAO_YU = 75;
	public final static int LOG_ITEM_CHANGE_DIAO_YU_SH = 76;
	public final static int LOG_ITEM_CHANGE_XIAO_QI_HUDONG = 77;
	public final static int LOG_ITEM_CHANGE_XIAO_QI_VIEW = 78;
	public final static int LOG_ITEM_CHANGE_SONGKE = 79;
	public final static int LOG_ITEM_CHANGE_SHANG_CHA = 80;
	public final static int LOG_ITEM_CHANGE_XJZB_TTS = 81;
	public final static int LOG_ITEM_CHANGE_XQZ_RANK = 82;
	public final static int LOG_ITEM_CHANGE_CROSS_HORN = 83;
	public final static int LOG_ITEM_CHANGE_ZST_SCORE = 84;
	public final static int LOG_ITEM_CHANGE_ZST_SHOP = 85;
	public final static int LOG_ITEM_CHANGE_HUAI_YUN = 86;
	public final static int LOG_ITEM_CHANGE_QIANG_HUA = 87;
	public final static int LOG_ITEM_CHANGE_JING_JIE = 88;
	public final static int LOG_ITEM_CHANGE_FIGHT_PLAYER = 89;
	public final static int LOG_ITEM_CHANGE_STONE_FENJIE = 90;
	public final static int LOG_ITEM_CHANGE_XFYL = 91;
	public final static int LOG_ITEM_CHANGE_HZ_SKILL_PROP = 92;
	public final static int LOG_ITEM_CHANGE_FIGHT_GUAJI_GK = 93;
	public final static int LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK = 94;
	public final static int LOG_ITEM_CHANGE_FQ_HQ = 95;
	public final static int LOG_ITEM_CHANGE_HZ_SKILL_UP = 96;
	public final static int LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO = 97;
	public final static int LOG_ITEM_CHANGE_ADD_EQUIP_FABAO = 98;
	public final static int LOG_ITEM_CHANGE_NM_MAIL_LOOK = 100;// 匿名邮件查看
	public final static int LOG_ITEM_CHANGE_EQUIP_JING_LIAN = 101;// 装备精炼
	public final static int LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL = 102;// 跨服淘汰赛奖励
	public final static int LOG_ITEM_CHANGE_HUA_PENG_XIU_QI = 103;// 花盆修葺
	public final static int LOG_ITEM_CHANGE_HUA_PENG_LV_UP = 104;// 花盆升级
	public final static int LOG_ITEM_CHANGE_XIE_YI_SHU = 105;// 协议离婚
	public final static int LOG_ITEM_CHANGE_XIU_QI = 106;// 离婚休妻
	public final static int LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE = 107;// 离婚7天不上线道具
	public final static int LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM = 108;// 开服7日活动
	public final static int LOG_ITEM_CHANGE_BUILD_CHOU_JIAN = 109;// 建筑抽奖
	public final static int LOG_ITEM_CHANGE_BUILD_DUI_HUAN = 110;// 建筑兑换
	public final static int LOG_ITEM_CHANGE_CHANGE_NAME = 111;// 改名卡
	public final static int LOG_ITEM_CHANGE_GH_CHANGE_NAME = 112;// 派系改名卡
	public final static int LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI = 113; // 使用连理枝果实
	public final static int LOG_ITEM_CHANGE_GUA_JI_LING = 114; // 使用挂机令
	public final static int LOG_ITEM_CHANGE_TOU_HUA = 115; // 偷花
	public final static int LOG_ITEM_CHANGE_FANG_CAO = 116; // 放草
	public final static int LOG_ITEM_CHANGE_FANG_CHONG = 117; // 放虫
	public final static int LOG_ITEM_CHANGE_HS_TOUHUA = 118; // 皇上家偷花
	// 2017年8月23日加入
	public final static int LOG_ITEM_CHANGE_ZLMT_OPEN_BOX = 119;// 真灵秘塔
	public final static int LOG_ITEM_CHANGE_XING_SHOU_ZHI_DAO = 120; // 新手知道员
	public final static int LOG_ITEM_CHANGE_LAND_BUILDING_UP = 121; // 土地升级
	public final static int LOG_ITEM_CHANGE_HEI_SHI = 122; // 黑市
	public final static int LOG_ITEM_CHANGE_DRESS_TU_JIAN = 123; // 服装图鉴
	public final static int LOG_ITEM_CHANGE_LING_GU_TA_WIN = 124;// 灵谷塔令牌
	public final static int LOG_ITEM_CHANGE_SEND_RED_PACKET = 125;// 发红包
	public final static int LOG_ITEM_CHANGE_LLZ_FRUIT = 126;// 连理枝果实
	public final static int LOG_ITEM_CHANGE_RONG_HE_CUT_LLZ_FRUIT = 127; // 连理枝果实融合减少
	public final static int LOG_ITEM_CHANGE_RONG_HE_ADD_LLZ_FRUIT = 128; // 连理枝果实融合增加
	public final static int LOG_ITME_CHANGE_LLZ_SHOU_HUO_FRUIT = 129; // 收获连理枝果实
	public final static int LOG_ITEM_ZHUANPAN_RECV = 130; // 转盘抽奖
	public final static int LOG_ITEM_CHANGE_BING_ID_CARD = 131;// 身份验证
	public final static int LOG_ITEM_CHANGE_GHW_GLOBAL = 132;// 跨服派系站奖励
	public final static int LOG_ITEM_CHANGE_ZEYE_LV_UP = 133;// 阵眼升级
	public final static int LOG_ITEM_CHANGE_PAY_THGM = 134;// 特惠购买
	public final static int LOG_ITEM_CHANGE_GTSW = 135;// 宫廷事务
	public final static int LOG_ITEM_CHANGE_GTSW_PROP = 136;// 口谕
	public final static int LOG_ITEM_CHANGE_STONE_UPGRADE_QUICILY = 137;// 宝石快速升级

	public final static int LOG_ITEM_CHANGE_VEGETABLE_SEED = 138;// 菜种变更
	public final static int LOG_ITEM_CHANGE_INGREDIENTS = 139;// 食材
	public final static int LOG_ITEM_CHANGE_VARIETY_DISHES = 140;// 菜品
	public final static int LOG_ITEM_CHANGE_TAKE_VEGETABLE = 141;// 收菜，背包变化
	public final static int LOG_ITEM_CHANGE_STEAL_VEGETABLE = 142;
	public final static int LOG_HUOYUEDU_AWARD = 143;// 活跃度 领奖
	public final static int LOG_ITEM_CLAIM_REWARD_BY_VIP = 144;// vip 领取奖励
	public final static int LOG_ITEM_CHANGE_ACQIEREMENT = 145;// 艺能
	public final static int LOG_ITEM_CHANGE_MEAT = 146;// 肉类 鸡肉 或 猪肉
	public final static int LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM = 999;
	public final static int LOG_ITEM_CHANGE_GM_ADD = 998;

	// 暂时不用
	// 行为
	// public final static int LOG_BEHAVIOR_HD_GZTB = 1;
	// public final static int LOG_BEHAVIOR_HD_GZTB_REWARD = 2;
	// public final static int LOG_BEHAVIOR_PLAY_GUIDER = 3;
	// public final static int LOG_BEHAVIOR_BUY_SAODANG = 4;
	// public final static int LOG_BEHAVIOR_USE_SAODANG = 5;
	// public final static int LOG_BEHAVIOR_HD_SHIJIEBOSS = 6;

	// 货币
	public final static int LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST = 1;

	// 擂台积分
	public final static int LOG_CURRENCY_CHANGE_LTJF_RANK = 100;
	public final static int LOG_CURRENCY_CHANGE_LTJF_FIGHT = 101;
	public final static int LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD = 102;
	public final static int LOG_CURRENCY_CHANGE_LTJF_DUIHUAN = 103;

	// 装备碎片
	public final static int LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD = 200;
	public final static int LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE = 201;
	public final static int LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN = 202;

	// 武举积分（星）
	public final static int LOG_CURRENCY_CHANGE_WJJF_FIGHT = 300;
	public final static int LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN = 301;
	public final static int LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH = 302;

	// 内丹
	public final static int LOG_CURRENCY_CHANGE_ND_BAG_OPEN = 400;
	public final static int LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE = 401;
	public final static int LOG_CURRENCY_CHANGE_ND_XIU_LIAN = 402;
	public final static int LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS = 403;
	public final static int LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD = 404;

	// 繁荣度
	public final static int LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD = 500;
	public final static int LOG_CURRENCY_CHANGE_FRD_HS_BUILD = 501;
	public final static int LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD = 503;
	public final static int LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS = 504;
	public final static int LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS = 505;
	public final static int LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL = 506;
	public final static int LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL = 507;
	public final static int LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER = 508;
	public final static int LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER = 509;
	public final static int LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL = 510;
	public final static int LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH = 511;
	public final static int LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD = 512;
	public final static int LOG_CURRENCY_CHANGE_FRD_RAN_LIAO = 513;
	public final static int LOG_CURRENCY_CHANGE_FRD_DIAOYU = 514;
	public final static int LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD = 515;
	public final static int LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL = 516;

	// 魅力值
	public final static int LOG_CURRENCY_CHANGE_MLZ_SH = 600;
	public final static int LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ = 601;
	public final static int LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF = 602;
	public final static int LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS = 603;
	public final static int LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ = 604;
	public final static int LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN = 605;
	public final static int LOG_CURRENCY_CHANGE_MLZ_CHEWEI = 606;
	public final static int LOG_CURRENCY_CHANGE_MLZ_CHEWEI_BE = 607; // 车位被访问
	public final static int LOG_CURRENCY_CHANGE_MLZ_GTSW = 608; // 宫廷事务

	// 亲密度
	public final static int LOG_CURRENCY_CHANGE_QMD_VALUE = 900; // new亲密度
	// 金砖
	public final static int LOG_CURRENCY_CHANGE_JZ = 700;
	public final static int LOG_CURRENCY_CHANGE_UP_KEJI = 701;
	public final static int LOG_CURRENCY_CHANGE_DONATE = 702;

	// 恩爱值
	public final static int LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA = 1000;
	public final static int LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN = 1001;
	public final static int LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD = 1002;
	public final static int LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY = 1003;

	// 势力值
	public final static int LOG_CURRENCY_CHANGE_SLZ_TANGYUAN = 1100;
	public final static int LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG = 1101;
	public final static int LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT = 1102;
	public final static int LOG_CURRENCY_CHANGE_SLZ_ONLOGIN = 1103;
	public final static int LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK = 1104;
	public final static int LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO = 1105;
	public final static int LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT = 1106;
	public final static int LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT = 1107;
	public final static int LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT = 1108;
	public final static int LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT = 1109;
	public final static int LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK = 1110;

	// 声望
	public final static int LOG_CURRENCY_CHANGE_XJZB_SW = 1200;
	public final static int LOG_CURRENCY_CHANGE_SHOP_SW = 1201;
	// 2017-8-23加入
	// 官品临时积分
	public final static int LOG_CURRENCY_CHNAGE_GRADE_INTERIM_POINT_QZ_FIGHT = 1300; // 强制战斗
	// 装扮碎片
	public final static int LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN = 1400; // 装扮碎片商店兑换

	// 龙凤币
	public final static int LOG_CURRENCY_CHANGE_ZSB_DUIHUAN = 1500;
	public final static int LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE = 1501;

	// 荣誉值
	public final static int LOG_CURRENCY_CHANGE_XJZB_KF_RY = 1600; // 跨服获得
	public final static int LOG_CURRENCY_CHANGE_SHOP_RY = 1601; // 兑换
   //2017-8-23日加入
	// 烹饪经验
	public final static int LOG_CURRENCY_CHANGE_COOKING_EXP = 1700;// 烹饪经验

	// 菜地
	public final static int LOG_INGREDIENTS_CHANGE_STEAL_VEGETABLE = 2000;// 偷菜

	// 金砖贡献
	public final static int LOG_ADD_JJGX = 1800; // 贡献金砖增加用户金砖贡献值
	public final static int LOG_CURRENCY_CHANGE_JJGX = 1801; // 金砖贡献值兑换物品

	// 六艺
	public final static int LOG_CHANGE_ACQIEREMENT_EXP = 1900;// 艺能经验
	public final static int LOG_CHANGE_ACQIEREMENT_NUM = 1901;// 才能点数

	public final static Map<Integer, String> realTimeTypeMap = new HashMap<Integer, String>();

	public final static Map<Integer, String> moneyApproachMap = new HashMap<Integer, String>();
	static {
		// add--moneyApproachMap
		moneyApproachMap.put(LOG_MONEY_CHANGE_CREATE_BUILD, "gms.common.jzjz");
		moneyApproachMap.put(LOG_MONEY_CHANGE_BUY_DRESS, "gms.common.gmyf");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FABAO_UPGRADE, "gms.common.jnsj");
		moneyApproachMap.put(LOG_MONEY_CHANGE_MAKE_EQUIP, "gms.common.zzzb");
		moneyApproachMap.put(LOG_MONEY_CHANGE_ZHAOMU_SERVANT, "gms.common.zmpc");
		moneyApproachMap.put(LOG_MONEY_CHANGE_CHAHUA, "gms.common.chahua");
		moneyApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS, "gms.common.gztsfh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS_CONSUME, "gms.common.gztsxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_BUILD_GONGHUI, "gms.common.jzgh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_FST, "gms.common.dltdl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LADDER, "gms.common.dwjdl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_EQUIP_SALE, "gms.common.cszb");
		moneyApproachMap.put(LOG_MONEY_CHANGE_USERPROP_LIBAO, "gms.common.sydjlb");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SCENE_REWARD, "gms.common.gktgjl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SUBMIT_PRESENTS_LIST, "gms.common.tjld");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SYSTEM_REWARD, "gms.common.lqxtjl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_GK, "gms.common.dyctg");
		moneyApproachMap.put(LOG_MONEY_CHANGE_MISSION, "gms.common.wcrwjl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FST_PH, "gms.common.ltphjl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SHOP_BUY_ITEM, "gms.common.xcgmdjxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_PH, "gms.common.sjbossphjlhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_GUWU, "gms.common.sjbossgwxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_FIGHT, "gms.common.sjbosszdhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FIRST_CHONGZHI, "gms.common.scjlhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_ITEM_USE_MONEY_CARD, "gms.common.syylkhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAO_XIANG, "gms.common.kbxhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE, "gms.common.jhylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_QIANG_DAO, "gms.common.dqdhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_UPGRADE_STONE, "gms.common.sjbs");
		moneyApproachMap.put(LOG_MONEY_CHANGE_GRADE_HUDONG_FENGLU, "gms.common.ylgphdfl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_MAKE_CLOTHES, "gms.common.fzhcxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAG, "gms.common.kbb");
		moneyApproachMap.put(LOG_MONEY_CHANGE_KEJU_DATI_REWARD, "gms.common.kjdt");
		moneyApproachMap.put(LOG_MONEY_CHANGE_MAKE_MATERIAL, "gms.common.zzcl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_DSTX, "gms.common.dstx");
		moneyApproachMap.put(LOG_MONEY_CHANGE_SAO_DNAG, "gms.common.sd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FENHONG, "gms.common.ghfh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_STONE_RONGHE, "gms.common.bsrh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LYT, "gms.common.dlyt");
		moneyApproachMap.put(LOG_MONEY_CHANGE_LYT_LVUP, "gms.common.lytuplv");
		moneyApproachMap.put(LOG_MONEY_CHANGE_LYT_PH, "gms.common.lytphhd");
		moneyApproachMap.put(LOG_MONEY_CHANGE_ZHENGHUN, "gms.common.zhenghunylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_QIUHUN, "gms.common.zhenghunqhylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE_TREE, "gms.common.llzgyylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME, "gms.common.pxzyzylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_FANGWEN, "gms.common.cwfwylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_OPEN_BUILDING_CHEWEI, "gms.common.cwkqylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_HARVEST_XQ, "gms.common.shxqyl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_QZ, "gms.common.qzzdylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET, "gms.common.pxzyzyl");
		moneyApproachMap.put(LOG_MONEY_CHANGE_LLZ_ADD_GY_COUNT, "gms.common.llzgyylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_ZST_SCORE, "gms.common.lftfsylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_ZST_BUY_ITEM, "gms.common.lfbgmylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_QIANG_HUA, "gms.common.pcqhylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_JING_JIE, "gms.common.pcjjylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_STONE_FENJIE, "gms.common.bsfjylxh");

		moneyApproachMap.put(LOG_MONEY_CHANGE_LV_CHANGE, "gms.common.sjjlylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_REWARD, "gms.common.cwfwylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_BE_REWARD, "gms.common.cwbfwylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_NI_MING_HD, "gms.common.nmhdylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_EQUIP_JING_LIAN, "gms.common.zbjlylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME_GLOBAL, "gms.common.kfzxhylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_GLOBAL, "gms.common.kfyzylxh");
		moneyApproachMap.put(LOG_MONEY_CHANGE_DA_XIAO_TAI_JIAN, "gms.common.dxtjylxh");
		//2017年8月25日加入
		moneyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_ZLMT, "gms.money.zlmj");// 真灵秘塔
		moneyApproachMap.put(LOG_MONEY_CHANGE_LAND_UP, "gms.money.tdsj");// 土地升级
		moneyApproachMap.put(LOG_MONEY_CHANGE_HEI_SHI, "gms.money.hsgm");// 黑市购买
		moneyApproachMap.put(LOG_MONEY_CHANGE_LLZ_GS_HC, "gms.money.llzhcxh");// 连理枝合成消耗
		moneyApproachMap.put(LOG_MONEY_CHANGE_EXP_CONVER_MONEY, "gms.money.mjjyzh");// 满级经验 转换银两
		moneyApproachMap.put(LOG_MONEY_CHANGE_ACTIVE_DUIHUAN, "gms.money.mjjyzh");// 满级经验 转换银两
		moneyApproachMap.put(LOG_MONEY_CHANGE_THGM_CHONGZHI, "gms.money.thgm");// 特惠购买
		moneyApproachMap.put(LOG_MONEY_CHANGE_GTSW, "gms.money.gtsw");// 宫廷事务
		moneyApproachMap.put(LOG_MONEY_CHANGE_SL, "gms.money.slfbjl");// 试炼副本奖励
		moneyApproachMap.put(LOG_MONEY_CHANGE_LEARN_ACQIEREMENT, "gms.money.lyxxjn");// 六艺 学习艺能
		moneyApproachMap.put(LOG_MONEY_CHANGE_SELL_ACQIEREMENT, "gms.money.mly");// 卖才艺
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI, "gms.common.czsyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GZTB_SUODING,
		// "gms.common.gztbzwsdxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GZTB_TS,
		// "gms.common.gztbybtsxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GZTB_REFRESH,
		// "gms.common.gztbczxh");
		// //add--goldApproachMap
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CHANGE_NAME, "gms.common.gmxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_USERPROP_LIBAO,
		// "gms.common.klbhd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SCENE_REWARD,
		// "gms.common.gkjlhd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SYSTEM_REWARD,
		// "gms.common.xitongjiangli");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_MISSION, "gms.common.wcrwjl");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_HONGBAO,
		// "gms.common.gmhbxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_HONGBAO_GOT,
		// "gms.common.dkhbhd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUILDING_CREATE,
		// "gms.common.jzjzxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,
		// "gms.common.kzzzclgz");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_FST_PH, "gms.common.fstphjlhd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT,
		// "gms.common.fstgmcsxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_FST_CLEAR_CD,
		// "gms.common.fstqcd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzghxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CREATE_GONGHUI,
		// "gms.common.cjghxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPEN_HUAPENG,
		// "gms.common.kqhpxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_DRESS, "gms.common.gmzbxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_ITEM, "gms.common.scmdxxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_FLOWER,
		// "gms.common.jshdxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,
		// "gms.common.jsclxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE,
		// "gms.common.sxdgdlxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_SAODANG,
		// "gms.common.gmsdxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpcxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BAG_OPEN_GRID,
		// "gms.common.bbkgzxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CHANGE_JOB, "gms.common.zzxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.gphdfl");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT,
		// "gms.common.czzsyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD,
		// "gms.common.syybkhd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,
		// "gms.common.sjbossfuhuo");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossguwu");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjl");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,
		// "gms.common.ghsxrw");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION,
		// "gms.common.ghjsrwxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUILDING_UPGRADE,
		// "gms.common.jzxqxh");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_VIP_ITEM,
		// "gms.common.gmvipdj");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_UPGRADE_BUILD,
		// "gms.common.xiuqi");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.ksgmcl");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_YUE_KA, "gms.common.yk");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_JI_KA, "gms.common.jk");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_XSTM_BUY_ITEM,
		// "gms.common.xstm");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CLAIM_BIND_REWARD,
		// "gms.common.bdsl");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ADD_LYT_TZ, "gms.common.lyttz");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_COMPLETE_LYT_SD,
		// "gms.common.lytsd");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_LYT_YB_CZ, "gms.common.lytcz");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_LYT_PH, "gms.common.lytph");
		// moneyApproachMap.put(LOG_GOLD_PRESENT_GIFT, "gms.common.ldrwjjyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPT_BYU_CZJJ,
		// "gms.common.buyczjjyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ,
		// "gms.common.czjjyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_QZ_FIGHT, "gms.common.qzzdyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_CHEWEI_SHANGCHA,
		// "gms.common.cwscyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU,
		// "gms.common.xqwgwyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT,
		// "gms.common.buyxqwcyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH,
		// "gms.common.xqsxcdyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ZST_CLEAR,
		// "gms.common.zstqcdyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ZST_REFRESH,
		// "gms.common.zstsxyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP,
		// "gms.common.zstsxsdyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ZST_BUY_ITEM,
		// "gms.common.zstshopyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED,
		// "gms.common.marriagetreejsyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED,
		// "gms.common.marrigehuaiyunyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_HZ_CHANG_NAME,
		// "gms.common.hzchangenameyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP,
		// "gms.common.ghexitcdyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT,
		// "gms.common.guajibuycountyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_XFFL,
		// "gms.common.xfflyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_FQ_HU_CUT_TIME,
		// "gms.common.fqhdcdyb");
		//
		// moneyApproachMap.put(LOG_GOLD_CHANGE_LI_HUN, "gms.common.lihunyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.kfqrhdyb");
		// moneyApproachMap.put(LOG_GOLD_CHANGE_ON_SHARE,
		// "gms.common.fengxiangyb");
		// moneyApproachMap.put(LOG_RES_CHANGE_ON_SYS_HONGBAO,
		// "gms.common.xthbyb");
		// moneyApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME,
		// "gms.common.mhbyb");
		// moneyApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO,
		// "gms.common.hunbaoyb");
		// moneyApproachMap.put(LOG_RES_CHANGE_HUI_GUI, "gms.common.huiguiyb");
		// moneyApproachMap.put(LOG_RES_CHANGE_ON_BIND_PHONE,
		// "gms.common.bdsjhyb");
		// //add--currencyApproachMap
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhdyp");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_RANK,
		// "gms.common.ltjfpmhq");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_FIGHT,
		// "gms.common.ltjfzdhq");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD,
		// "gms.common.ltjfxtjlhq");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_DUIHUAN,
		// "gms.common.ltjfdhxh");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD,
		// "gms.common.zbspxtjlhq");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE,
		// "gms.common.zbspfjhq");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN,
		// "gms.common.zbspdhxh");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_FIGHT,
		// "gms.common.wjjfzdhq");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN,
		// "gms.common.wjjfshopuse");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH,
		// "gms.common.wjjfdayrank");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ND_BAG_OPEN,
		// "gms.common.ndklb");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE,
		// "gms.common.ndgptj");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ND_XIU_LIAN,
		// "gms.common.ndxlxh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS,
		// "gms.common.ndsjboss");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD,
		// "gms.common.ndxqzjl");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD,
		// "gms.common.frdcjjz");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_HS_BUILD,
		// "gms.common.frdhsjz");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD,
		// "gms.common.frdqcjz");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS,
		// "gms.common.frdgphdgs");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS,
		// "gms.common.frdgphdss");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL,
		// "gms.common.frdcjdw");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL,
		// "gms.common.frdshdw");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER,
		// "gms.common.frdsh1jh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER,
		// "gms.common.frdsh2jh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL,
		// "gms.common.frdshks");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH,
		// "gms.common.frdshh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD,
		// "gms.common.frdxqjz");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_RAN_LIAO,
		// "gms.common.frdshrl");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DIAOYU,
		// "gms.common.frddiaoyu");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD,
		// "gms.common.frdjzupgradejs");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL,
		// "gms.common.frdfsdw");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_SH, "gms.common.mlzsh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ,
		// "gms.common.mlzgphdzj");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF,
		// "gms.common.mlzgphdgf");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS,
		// "gms.common.mlzhyf");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ,
		// "gms.common.mlzhxqhd");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN,
		// "gms.common.mlzonlogin");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHEWEI,
		// "gms.common.mlzonbaifang");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_UP_KEJI,
		// "gms.common.jzsjkj");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_DONATE, "gms.common.jzjx");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_TANGYUAN,
		// "gms.common.slzeatty");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG,
		// "gms.common.slzgphd");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT,
		// "gms.common.slzeopenlb");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_ONLOGIN,
		// "gms.common.slzonlogin");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK,
		// "gms.common.slzonbossrank");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO,
		// "gms.common.slfanghuo");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT,
		// "gms.common.slzqzzd");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT,
		// "gms.common.slzpxzrank");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT,
		// "gms.common.slzxqzrank");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT,
		// "gms.common.slzleitairank");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK,
		// "gms.common.slzkejurank");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_SW,
		// "gms.common.pxzsw");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_SW,
		// "gms.common.shopdhsw");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN,
		// "gms.common.zbspdh");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_DUIHUAN,
		// "gms.common.lfbdh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE,
		// "gms.common.lfbhd");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA,
		// "gms.common.eazsh");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN,
		// "gms.common.eazhy");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD,
		// "gms.common.eazfqhd");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY,
		// "gms.common.eaztreegy");
		//
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_KF_RY,
		// "gms.common.ryzhd");
		// moneyApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_RY,
		// "gms.common.ryzdh");
		// //add--expApproachMap
		// moneyApproachMap.put(LOG_EXP_CHANGE_FIGHT_FST,
		// "gms.common.fstzdhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_FIGHT_LADDER,
		// "gms.common.wjzdhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_FIGHT_GK, "gms.common.gkzdhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_GUIDE_KEY_SETP,
		// "gms.common.xsydgjbhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_TAKE_FLOWER,
		// "gms.common.cjxhhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_TAKE_MATERIAL,
		// "gms.common.cjclhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_EXP_ITEM, "gms.common.sydjhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_ANIMAL_REAP,
		// "gms.common.shdwhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_HUA_PENG_FLOWER,
		// "gms.common.shhpxhhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_QING_AN, "gms.common.qahqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_MISSION, "gms.common.rwhdjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_DELETE_BUILD,
		// "gms.common.qczawhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_ANSWER_SECURITY_CODE,
		// "gms.common.huidayzmhqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_KEJU_DATI,
		// "gms.common.kjdthqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_SAO_DANG,
		// "gms.common.saodanghqjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE,
		// "gms.common.shllzjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_DIAOYU, "gms.common.diaoyujy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_HARVEST_XQ, "gms.common.shxqjy");
		//
		// moneyApproachMap.put(LOG_EXP_CHANGE_XQW_RANK_REWARD,
		// "gms.common.xqzjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_CHEWEI, "gms.common.fangwenjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD,
		// "gms.common.kjpmjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_LYT_LVUP, "gms.common.lltjy");
		//
		// moneyApproachMap.put(LOG_EXP_CHANGE_HA_PENG_YI_JIAN,
		// "gms.common.hpyjshjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_CHU_CHONG,
		// "gms.common.chuchongjy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_JIAO_SHUI,
		// "gms.common.jiaoshuijy");
		// moneyApproachMap.put(LOG_EXP_CHANGE_CHU_CAO, "gms.common.chucaojy");
		//
		// moneyApproachMap.put(LOG_EXP_CHANGE_GM, "gms.common.gmmlhqjy");
		// //add--itemApproachMap
		// moneyApproachMap.put(LOG_ITEM_CHANGE_AVATAR_CREATE,
		// "gms.common.item.jscj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SEX, "gms.common.item.gbxb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GZTB_TS,
		// "gms.common.item.gztbts");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GZTB_REWARD,
		// "gms.common.item.gztbjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USEPROP_LIBAO,
		// "gms.common.item.sylb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SCENE_REWARD,
		// "gms.common.item.fbjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_ADD,
		// "gms.common.item.zhzj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT,
		// "gms.common.item.zhkc");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FST_PH,
		// "gms.common.item.fstph");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_LVUP, "gms.common.item.sjjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MIANSHENG,
		// "gms.common.item.msjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GHFUBEN,
		// "gms.common.item.ghfbdl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER,
		// "gms.common.item.hpcjhd");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_STONE_ADD,
		// "gms.common.item.zjbs");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_DRESS_BUY,
		// "gms.common.item.gmzb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_BUY_RMB_ITEM,
		// "gms.common.item.scgmdj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_DUIHUAN,
		// "gms.common.item.dhwp");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FLOWER_SEED,
		// "gms.common.item.zhonghua");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MAKE_EQUIP,
		// "gms.common.item.zzzb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MAKE_METERIAL,
		// "gms.common.item.zzcl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_STONE_REMOVE,
		// "gms.common.item.ycbs");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER,
		// "gms.common.item.cjhd");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_TAKE_MATERIAL,
		// "gms.common.item.cjcl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE,
		// "gms.common.item.bssj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_PROP_ZHENFA,
		// "gms.common.item.syzf");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GET_REWARD_PRESENT,
		// "gms.common.item.ldjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_REWARD,
		// "gms.common.item.yjhqxtjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK,
		// "gms.common.item.zdgkdl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK_ZD,
		// "gms.common.item.zddl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MISSION,
		// "gms.common.item.rwjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_DECOMPOSE_EQUIP,
		// "gms.common.item.fjzb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SALE,
		// "gms.common.item.mczb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_CUT_TREE, "gms.common.item.ks");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_CHAHUA, "gms.common.item.ch");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_CHAHUA_SPEEDUP,
		// "gms.common.item.chjs");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM,
		// "gms.common.item.sywpkc");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.item.wcldjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GRADE_HUDONG,
		// "gms.common.item.gphddjxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIRST_PAY_GIFT,
		// "gms.common.item.scjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_COUPON,
		// "gms.common.item.dhmlb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ZHENFA_UP_LV,
		// "gms.common.item.zhenfasjxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD,
		// "gms.common.item.gphdjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_CREATE_ANIMAL,
		// "gms.common.item.cjdw");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FEED_ANIMAL,
		// "gms.common.item.wydw");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_REAP_ANIMAL,
		// "gms.common.item.shdwjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ZENG_SONG_FLOWER,
		// "gms.common.item.zsxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HORN, "gms.common.item.dlb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_COMPOSE_FLOWER,
		// "gms.common.item.hcxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD,
		// "gms.common.item.shsjjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA,
		// "gms.common.item.sjbossjs");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.item.sjbossph");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.item.kbxhd");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_BUY_VIP_ITEM,
		// "gms.common.item.gmvipdj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD,
		// "gms.common.item.sgqdjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MRRRIAGE_AGREE,
		// "gms.common.item.jhkdj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_YQM, "gms.common.item.yqhylb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.item.dzhcksgm");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_OPEN_BUILD_PROP,
		// "gms.common.item.kjzb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP,
		// "gms.common.item.kdwb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MAKE_CLOTHES,
		// "gms.common.item.fzhc");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAODUIFU,
		// "gms.common.item.syzdf");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAOCUOFU,
		// "gms.common.item.syzcf");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.item.kjdtjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XSTM_ADD_ITEM,
		// "gms.common.item.xstmgm");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SAO_DANG_LING,
		// "gms.common.item.sysdl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT,
		// "gms.common.item.zbkbsc");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_STONE_RONGHE,
		// "gms.common.item.bsrh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE,
		// "gms.common.item.zbsxzh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_RED_TANG_YUAN,
		// "gms.common.item.syhgty");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_LYT_REWARD,
		// "gms.common.item.lytjl");
		//
		// moneyApproachMap.put(LOG_ITEM_CHANGE_MARRIAGE_FANGHUO,
		// "gms.common.item.fanghuo");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XJZB_SHOP,
		// "gms.common.item.pxsd");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS,
		// "gms.common.item.kbbdjxys");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU,
		// "gms.common.item.dyxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU_SH,
		// "gms.common.item.dysh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_HUDONG,
		// "gms.common.item.xqhd");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_VIEW,
		// "gms.common.item.lookxq");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SONGKE,
		// "gms.common.item.songkxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SHANG_CHA,
		// "gms.common.item.scxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS,
		// "gms.common.item.pxzjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XQZ_RANK,
		// "gms.common.item.xqzmjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_CROSS_HORN,
		// "gms.common.item.kflb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ZST_SCORE,
		// "gms.common.item.lftjf");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ZST_SHOP,
		// "gms.common.item.lftwp");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HUAI_YUN,
		// "gms.common.item.huaiyunxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_QIANG_HUA,
		// "gms.common.item.qianghua");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_JING_JIE,
		// "gms.common.item.jinjie");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_PLAYER,
		// "gms.common.item.ltwugive");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_STONE_FENJIE,
		// "gms.common.item.bsfj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XFYL, "gms.common.item.xfyl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_PROP,
		// "gms.common.item.hzjjxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GUAJI_GK,
		// "gms.common.item.jqgj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK,
		// "gms.common.item.zdgj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FQ_HQ,
		// "gms.common.item.fqhdrandom");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_UP,
		// "gms.common.item.hzjlsjxh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO,
		// "gms.common.item.thzbfb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ADD_EQUIP_FABAO,
		// "gms.common.item.zjzbfb");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM,
		// "gms.common.item.xtxz");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GM_ADD, "gms.common.item.gmff");
		//
		// moneyApproachMap.put(LOG_ITEM_CHANGE_NM_MAIL_LOOK,
		// "gms.common.item.nmyjck");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.item.zbjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL,
		// "gms.common.item.kfttsjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_XIU_QI,
		// "gms.common.item.hpxq");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_LV_UP,
		// "gms.common.item.hpsj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XIE_YI_SHU,
		// "gms.common.item.xylh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_XIU_QI, "gms.common.item.lhxq");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE,
		// "gms.common.item.lhqtbsx");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.item.kfqrhd");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_BUILD_CHOU_JIAN,
		// "gms.common.item.jzcj");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_BUILD_DUI_HUAN,
		// "gms.common.item.jzdh");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_CHANGE_NAME,
		// "gms.common.item.gmk");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GH_CHANGE_NAME,
		// "gms.common.item.pxgmk");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI,
		// "gms.common.item.lzzgs");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_GUA_JI_LING,
		// "gms.common.item.sygjl");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_TOU_HUA,
		// "gms.common.item.touhua");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FANG_CAO,
		// "gms.common.item.fanghua");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_FANG_CHONG,
		// "gms.common.item.fangchong");
		// moneyApproachMap.put(LOG_ITEM_CHANGE_HS_TOUHUA,
		// "gms.common.item.hsjth");

	}

	public final static Map<Integer, String> goldApproachMap = new HashMap<Integer, String>();
	static {
		goldApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI, "gms.common.czsyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_GZTB_SUODING, "gms.common.gztbzwsdxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_GZTB_TS, "gms.common.gztbybtsxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_GZTB_REFRESH, "gms.common.gztbczxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_CHANGE_NAME, "gms.common.gmxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_USERPROP_LIBAO, "gms.common.klbhd");
		goldApproachMap.put(LOG_GOLD_CHANGE_SCENE_REWARD, "gms.common.gkjlhd");
		goldApproachMap.put(LOG_GOLD_CHANGE_SYSTEM_REWARD, "gms.common.xitongjiangli");
		goldApproachMap.put(LOG_GOLD_CHANGE_MISSION, "gms.common.wcrwjl");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_HONGBAO, "gms.common.gmhbxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_HONGBAO_GOT, "gms.common.dkhbhd");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUILDING_CREATE, "gms.common.jzjzxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER, "gms.common.kzzzclgz");
		goldApproachMap.put(LOG_GOLD_CHANGE_FST_PH, "gms.common.fstphjlhd");
		goldApproachMap.put(LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT, "gms.common.fstgmcsxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_FST_CLEAR_CD, "gms.common.fstqcd");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUILD_GONGHUI, "gms.common.jzghxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_CREATE_GONGHUI, "gms.common.cjghxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_HUAPENG, "gms.common.kqhpxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_DRESS, "gms.common.gmzbxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_ITEM, "gms.common.scmdxxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_FLOWER, "gms.common.jshdxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_MATERIAL, "gms.common.jsclxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE, "gms.common.sxdgdlxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_SAODANG, "gms.common.gmsdxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_ZHAOMU_SERVANT, "gms.common.zmpcxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_BAG_OPEN_GRID, "gms.common.bbkgzxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_CHANGE_JOB, "gms.common.zzxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU, "gms.common.gphdfl");
		goldApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT, "gms.common.czzsyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD, "gms.common.syybkhd");
		goldApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO, "gms.common.sjbossfuhuo");
		goldApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU, "gms.common.sjbossguwu");
		goldApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_PH, "gms.common.sjbossphjl");
		goldApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION, "gms.common.ghsxrw");
		goldApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION, "gms.common.ghjsrwxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_BAO_XIANG, "gms.common.kbxxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUILDING_UPGRADE, "gms.common.jzxqxh");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_VIP_ITEM, "gms.common.gmvipdj");
		goldApproachMap.put(LOG_GOLD_CHANGE_UPGRADE_BUILD, "gms.common.xiuqi");
		goldApproachMap.put(LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST, "gms.common.ksgmcl");
		goldApproachMap.put(LOG_GOLD_CHANGE_KEJU_DATI_REWARD, "gms.common.kjdt");
		goldApproachMap.put(LOG_GOLD_CHANGE_YUE_KA, "gms.common.yk");
		goldApproachMap.put(LOG_GOLD_CHANGE_JI_KA, "gms.common.jk");
		goldApproachMap.put(LOG_GOLD_CHANGE_XSTM_BUY_ITEM, "gms.common.xstm");
		goldApproachMap.put(LOG_GOLD_CHANGE_CLAIM_BIND_REWARD, "gms.common.bdsl");
		goldApproachMap.put(LOG_GOLD_CHANGE_ADD_LYT_TZ, "gms.common.lyttz");
		goldApproachMap.put(LOG_GOLD_CHANGE_COMPLETE_LYT_SD, "gms.common.lytsd");
		goldApproachMap.put(LOG_GOLD_CHANGE_LYT_YB_CZ, "gms.common.lytcz");
		goldApproachMap.put(LOG_GOLD_CHANGE_LYT_PH, "gms.common.lytph");
		goldApproachMap.put(LOG_GOLD_PRESENT_GIFT, "gms.common.ldrwjjyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPT_BYU_CZJJ, "gms.common.buyczjjyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ, "gms.common.czjjyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_QZ_FIGHT, "gms.common.qzzdyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI, "gms.common.cwkqyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_CHEWEI_SHANGCHA, "gms.common.cwscyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU, "gms.common.xqwgwyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT, "gms.common.buyxqwcyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH, "gms.common.xqsxcdyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ZST_CLEAR, "gms.common.zstqcdyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ZST_REFRESH, "gms.common.zstsxyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP, "gms.common.zstsxsdyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ZST_BUY_ITEM, "gms.common.zstshopyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED, "gms.common.marriagetreejsyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED, "gms.common.marrigehuaiyunyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_HZ_CHANG_NAME, "gms.common.hzchangenameyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP, "gms.common.ghexitcdyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT, "gms.common.guajibuycountyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_XFFL, "gms.common.xfflyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_FQ_HU_CUT_TIME, "gms.common.fqhdcdyb");
		goldApproachMap.put(LOG_MONEY_CHANGE_STONE_FENJIE, "gms.common.item.remove");
		goldApproachMap.put(LOG_GOLD_CHANGE_LI_HUN, "gms.common.lihunyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM, "gms.common.kfqrhdyb");
		goldApproachMap.put(LOG_GOLD_CHANGE_ON_SHARE, "gms.common.fengxiangyb");
		goldApproachMap.put(LOG_RES_CHANGE_ON_SYS_HONGBAO, "gms.common.xthbyb");
		goldApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME, "gms.common.mhbyb");
		goldApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO, "gms.common.hunbaoyb");
		goldApproachMap.put(LOG_RES_CHANGE_HUI_GUI, "gms.common.huiguiyb");
		goldApproachMap.put(LOG_RES_CHANGE_ON_BIND_PHONE, "gms.common.bdsjhyb");
		//2017年8月25日加入
		goldApproachMap.put(LOG_GOLD_CHANGE_ZLMT_YB_OPEN_BOX, "gms.gold.openbox");// 真灵秘塔开宝箱
		goldApproachMap.put(LOG_GOLD_CHANGE_LAND_UP, "gms.gold.tdsj");// 土地升级
		goldApproachMap.put(LOG_GOLD_CHANGE_HEI_SHI, "gms.gold.hsgm");// 黑市购买
		goldApproachMap.put(LOG_GOLD_CHANGE_REFRESH_HEI_SHI, "gms.gold.sxhs");// 刷新黑市
		goldApproachMap.put(LOG_GOLD_CHANGE_REFRESH_ZHUAN_PAN, "gms.gold.sxzp");// 刷新转盘
		goldApproachMap.put(LOG_GOLD_CHANGE_RISING_STAR, "gms.gold.shengxing");// 升星
		goldApproachMap.put(LOG_GOLD_CHANGE_ACTIVE_DUIHUAN, "gms.gold.xhyb");// 活动兑换消耗元宝
		goldApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT_THGM, "gms.gold.thgm");// 特惠购买
		goldApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_VEGETABLE, "gms.gold.sccs"); // 黄金加速蔬菜成熟时间
		goldApproachMap.put(LOG_GOLD_CHANGE_AVTIVATE_ACQIEREMENT, "gms.gold.jhcy");// 元宝激活才艺
		goldApproachMap.put(LOG_GOLD_CHANGE_ON_DATAIJIAN, "gms.gold.dtj");// 打太监
		goldApproachMap.put(LOG_GOLD_CHANGE_UP_HZ, "gms.gold.hzhz");// 皇子换装 升级
		// //add--goldApproachMap
		// goldApproachMap.put(LOG_MONEY_CHANGE_CREATE_BUILD,
		// "gms.common.jzjz");
		// goldApproachMap.put(LOG_MONEY_CHANGE_BUY_DRESS, "gms.common.gmyf");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FABAO_UPGRADE,
		// "gms.common.jnsj");
		// goldApproachMap.put(LOG_MONEY_CHANGE_MAKE_EQUIP, "gms.common.zzzb");
		// goldApproachMap.put(LOG_MONEY_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpc");
		// goldApproachMap.put(LOG_MONEY_CHANGE_CHAHUA, "gms.common.chahua");
		// goldApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS, "gms.common.gztsfh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS_CONSUME,
		// "gms.common.gztsxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzgh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FIGHT_FST, "gms.common.dltdl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LADDER,
		// "gms.common.dwjdl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_EQUIP_SALE, "gms.common.cszb");
		// goldApproachMap.put(LOG_MONEY_CHANGE_USERPROP_LIBAO,
		// "gms.common.sydjlb");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SCENE_REWARD,
		// "gms.common.gktgjl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjld");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SYSTEM_REWARD,
		// "gms.common.lqxtjl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FIGHT_GK, "gms.common.dyctg");
		// goldApproachMap.put(LOG_MONEY_CHANGE_MISSION, "gms.common.wcrwjl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FST_PH, "gms.common.ltphjl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SHOP_BUY_ITEM,
		// "gms.common.xcgmdjxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjlhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossgwxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_FIGHT,
		// "gms.common.sjbosszdhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FIRST_CHONGZHI,
		// "gms.common.scjlhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_ITEM_USE_MONEY_CARD,
		// "gms.common.syylkhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE, "gms.common.jhylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_QIANG_DAO, "gms.common.dqdhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_UPGRADE_STONE,
		// "gms.common.sjbs");
		// goldApproachMap.put(LOG_MONEY_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.ylgphdfl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_MAKE_CLOTHES,
		// "gms.common.fzhcxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAG, "gms.common.kbb");
		// goldApproachMap.put(LOG_MONEY_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// goldApproachMap.put(LOG_MONEY_CHANGE_MAKE_MATERIAL,
		// "gms.common.zzcl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_DSTX, "gms.common.dstx");
		// goldApproachMap.put(LOG_MONEY_CHANGE_SAO_DNAG, "gms.common.sd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FENHONG, "gms.common.ghfh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_STONE_RONGHE,
		// "gms.common.bsrh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LYT, "gms.common.dlyt");
		// goldApproachMap.put(LOG_MONEY_CHANGE_LYT_LVUP, "gms.common.lytuplv");
		// goldApproachMap.put(LOG_MONEY_CHANGE_LYT_PH, "gms.common.lytphhd");
		// goldApproachMap.put(LOG_MONEY_CHANGE_ZHENGHUN,
		// "gms.common.zhenghunylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_QIUHUN,
		// "gms.common.zhenghunqhylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE_TREE,
		// "gms.common.llzgyylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME,
		// "gms.common.pxzyzylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_FANGWEN,
		// "gms.common.cwfwylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_HARVEST_XQ,
		// "gms.common.shxqyl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_QZ, "gms.common.qzzdylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET, "gms.common.pxzyzyl");
		// goldApproachMap.put(LOG_MONEY_CHANGE_LLZ_ADD_GY_COUNT,
		// "gms.common.llzgyylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_ZST_SCORE,
		// "gms.common.lftfsylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_ZST_BUY_ITEM,
		// "gms.common.lfbgmylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_QIANG_HUA,
		// "gms.common.pcqhylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_JING_JIE,
		// "gms.common.pcjjylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_STONE_FENJIE,
		// "gms.common.bsfjylxh");
		//
		// goldApproachMap.put(LOG_MONEY_CHANGE_LV_CHANGE,
		// "gms.common.sjjlylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_REWARD,
		// "gms.common.cwfwylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_BE_REWARD,
		// "gms.common.cwbfwylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_NI_MING_HD,
		// "gms.common.nmhdylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.zbjlylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME_GLOBAL,
		// "gms.common.kfzxhylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_GLOBAL,
		// "gms.common.kfyzylxh");
		// goldApproachMap.put(LOG_MONEY_CHANGE_DA_XIAO_TAI_JIAN,
		// "gms.common.dxtjylxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI, "gms.common.czsyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GZTB_SUODING,
		// "gms.common.gztbzwsdxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GZTB_TS,
		// "gms.common.gztbybtsxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GZTB_REFRESH,
		// "gms.common.gztbczxh");
		// //add--goldApproachMap
		// goldApproachMap.put(LOG_GOLD_CHANGE_CHANGE_NAME, "gms.common.gmxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_USERPROP_LIBAO,
		// "gms.common.klbhd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SCENE_REWARD,
		// "gms.common.gkjlhd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SYSTEM_REWARD,
		// "gms.common.xitongjiangli");
		// goldApproachMap.put(LOG_GOLD_CHANGE_MISSION, "gms.common.wcrwjl");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_HONGBAO,
		// "gms.common.gmhbxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_HONGBAO_GOT,
		// "gms.common.dkhbhd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUILDING_CREATE,
		// "gms.common.jzjzxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,
		// "gms.common.kzzzclgz");
		// goldApproachMap.put(LOG_GOLD_CHANGE_FST_PH, "gms.common.fstphjlhd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT,
		// "gms.common.fstgmcsxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_FST_CLEAR_CD,
		// "gms.common.fstqcd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzghxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_CREATE_GONGHUI,
		// "gms.common.cjghxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_HUAPENG,
		// "gms.common.kqhpxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_DRESS, "gms.common.gmzbxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_ITEM, "gms.common.scmdxxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_FLOWER,
		// "gms.common.jshdxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,
		// "gms.common.jsclxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE,
		// "gms.common.sxdgdlxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_SAODANG,
		// "gms.common.gmsdxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpcxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BAG_OPEN_GRID,
		// "gms.common.bbkgzxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_CHANGE_JOB, "gms.common.zzxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.gphdfl");
		// goldApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT,
		// "gms.common.czzsyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD,
		// "gms.common.syybkhd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,
		// "gms.common.sjbossfuhuo");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossguwu");
		// goldApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjl");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,
		// "gms.common.ghsxrw");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION,
		// "gms.common.ghjsrwxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUILDING_UPGRADE,
		// "gms.common.jzxqxh");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_VIP_ITEM,
		// "gms.common.gmvipdj");
		// goldApproachMap.put(LOG_GOLD_CHANGE_UPGRADE_BUILD,
		// "gms.common.xiuqi");
		// goldApproachMap.put(LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.ksgmcl");
		// goldApproachMap.put(LOG_GOLD_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// goldApproachMap.put(LOG_GOLD_CHANGE_YUE_KA, "gms.common.yk");
		// goldApproachMap.put(LOG_GOLD_CHANGE_JI_KA, "gms.common.jk");
		// goldApproachMap.put(LOG_GOLD_CHANGE_XSTM_BUY_ITEM,
		// "gms.common.xstm");
		// goldApproachMap.put(LOG_GOLD_CHANGE_CLAIM_BIND_REWARD,
		// "gms.common.bdsl");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ADD_LYT_TZ, "gms.common.lyttz");
		// goldApproachMap.put(LOG_GOLD_CHANGE_COMPLETE_LYT_SD,
		// "gms.common.lytsd");
		// goldApproachMap.put(LOG_GOLD_CHANGE_LYT_YB_CZ, "gms.common.lytcz");
		// goldApproachMap.put(LOG_GOLD_CHANGE_LYT_PH, "gms.common.lytph");
		// goldApproachMap.put(LOG_GOLD_PRESENT_GIFT, "gms.common.ldrwjjyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPT_BYU_CZJJ,
		// "gms.common.buyczjjyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ,
		// "gms.common.czjjyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_QZ_FIGHT, "gms.common.qzzdyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_CHEWEI_SHANGCHA,
		// "gms.common.cwscyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU,
		// "gms.common.xqwgwyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT,
		// "gms.common.buyxqwcyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH,
		// "gms.common.xqsxcdyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ZST_CLEAR,
		// "gms.common.zstqcdyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ZST_REFRESH,
		// "gms.common.zstsxyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP,
		// "gms.common.zstsxsdyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ZST_BUY_ITEM,
		// "gms.common.zstshopyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED,
		// "gms.common.marriagetreejsyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED,
		// "gms.common.marrigehuaiyunyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_HZ_CHANG_NAME,
		// "gms.common.hzchangenameyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP,
		// "gms.common.ghexitcdyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT,
		// "gms.common.guajibuycountyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_XFFL,
		// "gms.common.xfflyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_FQ_HU_CUT_TIME,
		// "gms.common.fqhdcdyb");
		//
		// goldApproachMap.put(LOG_GOLD_CHANGE_LI_HUN, "gms.common.lihunyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.kfqrhdyb");
		// goldApproachMap.put(LOG_GOLD_CHANGE_ON_SHARE,
		// "gms.common.fengxiangyb");
		// goldApproachMap.put(LOG_RES_CHANGE_ON_SYS_HONGBAO,
		// "gms.common.xthbyb");
		// goldApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME,
		// "gms.common.mhbyb");
		// goldApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO,
		// "gms.common.hunbaoyb");
		// goldApproachMap.put(LOG_RES_CHANGE_HUI_GUI, "gms.common.huiguiyb");
		// goldApproachMap.put(LOG_RES_CHANGE_ON_BIND_PHONE,
		// "gms.common.bdsjhyb");
		// //add--currencyApproachMap
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhdyp");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_RANK,
		// "gms.common.ltjfpmhq");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_FIGHT,
		// "gms.common.ltjfzdhq");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD,
		// "gms.common.ltjfxtjlhq");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_DUIHUAN,
		// "gms.common.ltjfdhxh");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD,
		// "gms.common.zbspxtjlhq");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE,
		// "gms.common.zbspfjhq");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN,
		// "gms.common.zbspdhxh");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_FIGHT,
		// "gms.common.wjjfzdhq");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN,
		// "gms.common.wjjfshopuse");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH,
		// "gms.common.wjjfdayrank");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ND_BAG_OPEN,
		// "gms.common.ndklb");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE,
		// "gms.common.ndgptj");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ND_XIU_LIAN,
		// "gms.common.ndxlxh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS,
		// "gms.common.ndsjboss");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD,
		// "gms.common.ndxqzjl");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD,
		// "gms.common.frdcjjz");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_HS_BUILD,
		// "gms.common.frdhsjz");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD,
		// "gms.common.frdqcjz");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS,
		// "gms.common.frdgphdgs");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS,
		// "gms.common.frdgphdss");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL,
		// "gms.common.frdcjdw");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL,
		// "gms.common.frdshdw");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER,
		// "gms.common.frdsh1jh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER,
		// "gms.common.frdsh2jh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL,
		// "gms.common.frdshks");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH,
		// "gms.common.frdshh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD,
		// "gms.common.frdxqjz");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_RAN_LIAO,
		// "gms.common.frdshrl");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DIAOYU,
		// "gms.common.frddiaoyu");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD,
		// "gms.common.frdjzupgradejs");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL,
		// "gms.common.frdfsdw");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_SH, "gms.common.mlzsh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ,
		// "gms.common.mlzgphdzj");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF,
		// "gms.common.mlzgphdgf");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS,
		// "gms.common.mlzhyf");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ,
		// "gms.common.mlzhxqhd");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN,
		// "gms.common.mlzonlogin");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHEWEI,
		// "gms.common.mlzonbaifang");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_UP_KEJI,
		// "gms.common.jzsjkj");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_DONATE, "gms.common.jzjx");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_TANGYUAN,
		// "gms.common.slzeatty");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG,
		// "gms.common.slzgphd");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT,
		// "gms.common.slzeopenlb");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_ONLOGIN,
		// "gms.common.slzonlogin");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK,
		// "gms.common.slzonbossrank");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO,
		// "gms.common.slfanghuo");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT,
		// "gms.common.slzqzzd");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT,
		// "gms.common.slzpxzrank");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT,
		// "gms.common.slzxqzrank");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT,
		// "gms.common.slzleitairank");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK,
		// "gms.common.slzkejurank");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_SW, "gms.common.pxzsw");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_SW,
		// "gms.common.shopdhsw");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN,
		// "gms.common.zbspdh");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_DUIHUAN,
		// "gms.common.lfbdh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE,
		// "gms.common.lfbhd");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA,
		// "gms.common.eazsh");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN,
		// "gms.common.eazhy");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD,
		// "gms.common.eazfqhd");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY,
		// "gms.common.eaztreegy");
		//
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_KF_RY,
		// "gms.common.ryzhd");
		// goldApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_RY, "gms.common.ryzdh");
		// //add--expApproachMap
		// goldApproachMap.put(LOG_EXP_CHANGE_FIGHT_FST,
		// "gms.common.fstzdhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_FIGHT_LADDER,
		// "gms.common.wjzdhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_FIGHT_GK, "gms.common.gkzdhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_GUIDE_KEY_SETP,
		// "gms.common.xsydgjbhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_TAKE_FLOWER,
		// "gms.common.cjxhhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_TAKE_MATERIAL,
		// "gms.common.cjclhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_EXP_ITEM, "gms.common.sydjhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_ANIMAL_REAP,
		// "gms.common.shdwhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_HUA_PENG_FLOWER,
		// "gms.common.shhpxhhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_QING_AN, "gms.common.qahqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_MISSION, "gms.common.rwhdjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_DELETE_BUILD,
		// "gms.common.qczawhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_ANSWER_SECURITY_CODE,
		// "gms.common.huidayzmhqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_KEJU_DATI, "gms.common.kjdthqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_SAO_DANG,
		// "gms.common.saodanghqjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE,
		// "gms.common.shllzjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_DIAOYU, "gms.common.diaoyujy");
		// goldApproachMap.put(LOG_EXP_CHANGE_HARVEST_XQ, "gms.common.shxqjy");
		//
		// goldApproachMap.put(LOG_EXP_CHANGE_XQW_RANK_REWARD,
		// "gms.common.xqzjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_CHEWEI, "gms.common.fangwenjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD,
		// "gms.common.kjpmjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_LYT_LVUP, "gms.common.lltjy");
		//
		// goldApproachMap.put(LOG_EXP_CHANGE_HA_PENG_YI_JIAN,
		// "gms.common.hpyjshjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_CHU_CHONG,
		// "gms.common.chuchongjy");
		// goldApproachMap.put(LOG_EXP_CHANGE_JIAO_SHUI,
		// "gms.common.jiaoshuijy");
		// goldApproachMap.put(LOG_EXP_CHANGE_CHU_CAO, "gms.common.chucaojy");
		//
		// goldApproachMap.put(LOG_EXP_CHANGE_GM, "gms.common.gmmlhqjy");
		// //add--itemApproachMap
		// goldApproachMap.put(LOG_ITEM_CHANGE_AVATAR_CREATE,
		// "gms.common.item.jscj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SEX, "gms.common.item.gbxb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GZTB_TS,
		// "gms.common.item.gztbts");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GZTB_REWARD,
		// "gms.common.item.gztbjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USEPROP_LIBAO,
		// "gms.common.item.sylb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SCENE_REWARD,
		// "gms.common.item.fbjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_ADD,
		// "gms.common.item.zhzj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT,
		// "gms.common.item.zhkc");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FST_PH, "gms.common.item.fstph");
		// goldApproachMap.put(LOG_ITEM_CHANGE_LVUP, "gms.common.item.sjjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_MIANSHENG,
		// "gms.common.item.msjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GHFUBEN,
		// "gms.common.item.ghfbdl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER,
		// "gms.common.item.hpcjhd");
		// goldApproachMap.put(LOG_ITEM_CHANGE_STONE_ADD,
		// "gms.common.item.zjbs");
		// goldApproachMap.put(LOG_ITEM_CHANGE_DRESS_BUY,
		// "gms.common.item.gmzb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_BUY_RMB_ITEM,
		// "gms.common.item.scgmdj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_DUIHUAN, "gms.common.item.dhwp");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FLOWER_SEED,
		// "gms.common.item.zhonghua");
		// goldApproachMap.put(LOG_ITEM_CHANGE_MAKE_EQUIP,
		// "gms.common.item.zzzb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_MAKE_METERIAL,
		// "gms.common.item.zzcl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_STONE_REMOVE,
		// "gms.common.item.ycbs");
		// goldApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER,
		// "gms.common.item.cjhd");
		// goldApproachMap.put(LOG_ITEM_CHANGE_TAKE_MATERIAL,
		// "gms.common.item.cjcl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE,
		// "gms.common.item.bssj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_PROP_ZHENFA,
		// "gms.common.item.syzf");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GET_REWARD_PRESENT,
		// "gms.common.item.ldjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_REWARD,
		// "gms.common.item.yjhqxtjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK,
		// "gms.common.item.zdgkdl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK_ZD,
		// "gms.common.item.zddl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_MISSION, "gms.common.item.rwjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_DECOMPOSE_EQUIP,
		// "gms.common.item.fjzb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SALE,
		// "gms.common.item.mczb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_CUT_TREE, "gms.common.item.ks");
		// goldApproachMap.put(LOG_ITEM_CHANGE_CHAHUA, "gms.common.item.ch");
		// goldApproachMap.put(LOG_ITEM_CHANGE_CHAHUA_SPEEDUP,
		// "gms.common.item.chjs");
		// goldApproachMap.put(LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM,
		// "gms.common.item.sywpkc");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.item.wcldjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GRADE_HUDONG,
		// "gms.common.item.gphddjxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIRST_PAY_GIFT,
		// "gms.common.item.scjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_COUPON, "gms.common.item.dhmlb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ZHENFA_UP_LV,
		// "gms.common.item.zhenfasjxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD,
		// "gms.common.item.gphdjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_CREATE_ANIMAL,
		// "gms.common.item.cjdw");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FEED_ANIMAL,
		// "gms.common.item.wydw");
		// goldApproachMap.put(LOG_ITEM_CHANGE_REAP_ANIMAL,
		// "gms.common.item.shdwjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ZENG_SONG_FLOWER,
		// "gms.common.item.zsxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HORN, "gms.common.item.dlb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_COMPOSE_FLOWER,
		// "gms.common.item.hcxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD,
		// "gms.common.item.shsjjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA,
		// "gms.common.item.sjbossjs");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.item.sjbossph");
		// goldApproachMap.put(LOG_ITEM_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.item.kbxhd");
		// goldApproachMap.put(LOG_ITEM_CHANGE_BUY_VIP_ITEM,
		// "gms.common.item.gmvipdj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD,
		// "gms.common.item.sgqdjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_MRRRIAGE_AGREE,
		// "gms.common.item.jhkdj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_YQM, "gms.common.item.yqhylb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.item.dzhcksgm");
		// goldApproachMap.put(LOG_ITEM_CHANGE_OPEN_BUILD_PROP,
		// "gms.common.item.kjzb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP,
		// "gms.common.item.kdwb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_MAKE_CLOTHES,
		// "gms.common.item.fzhc");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAODUIFU,
		// "gms.common.item.syzdf");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAOCUOFU,
		// "gms.common.item.syzcf");
		// goldApproachMap.put(LOG_ITEM_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.item.kjdtjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XSTM_ADD_ITEM,
		// "gms.common.item.xstmgm");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SAO_DANG_LING,
		// "gms.common.item.sysdl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT,
		// "gms.common.item.zbkbsc");
		// goldApproachMap.put(LOG_ITEM_CHANGE_STONE_RONGHE,
		// "gms.common.item.bsrh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE,
		// "gms.common.item.zbsxzh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_RED_TANG_YUAN,
		// "gms.common.item.syhgty");
		// goldApproachMap.put(LOG_ITEM_CHANGE_LYT_REWARD,
		// "gms.common.item.lytjl");
		//
		// goldApproachMap.put(LOG_ITEM_CHANGE_MARRIAGE_FANGHUO,
		// "gms.common.item.fanghuo");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XJZB_SHOP,
		// "gms.common.item.pxsd");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS,
		// "gms.common.item.kbbdjxys");
		// goldApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU, "gms.common.item.dyxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU_SH,
		// "gms.common.item.dysh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_HUDONG,
		// "gms.common.item.xqhd");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_VIEW,
		// "gms.common.item.lookxq");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SONGKE,
		// "gms.common.item.songkxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SHANG_CHA,
		// "gms.common.item.scxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS,
		// "gms.common.item.pxzjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XQZ_RANK,
		// "gms.common.item.xqzmjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_CROSS_HORN,
		// "gms.common.item.kflb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ZST_SCORE,
		// "gms.common.item.lftjf");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ZST_SHOP,
		// "gms.common.item.lftwp");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HUAI_YUN,
		// "gms.common.item.huaiyunxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_QIANG_HUA,
		// "gms.common.item.qianghua");
		// goldApproachMap.put(LOG_ITEM_CHANGE_JING_JIE,
		// "gms.common.item.jinjie");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIGHT_PLAYER,
		// "gms.common.item.ltwugive");
		// goldApproachMap.put(LOG_ITEM_CHANGE_STONE_FENJIE,
		// "gms.common.item.bsfj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XFYL, "gms.common.item.xfyl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_PROP,
		// "gms.common.item.hzjjxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GUAJI_GK,
		// "gms.common.item.jqgj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK,
		// "gms.common.item.zdgj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FQ_HQ,
		// "gms.common.item.fqhdrandom");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_UP,
		// "gms.common.item.hzjlsjxh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO,
		// "gms.common.item.thzbfb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ADD_EQUIP_FABAO,
		// "gms.common.item.zjzbfb");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM,
		// "gms.common.item.xtxz");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GM_ADD, "gms.common.item.gmff");
		//
		// goldApproachMap.put(LOG_ITEM_CHANGE_NM_MAIL_LOOK,
		// "gms.common.item.nmyjck");
		// goldApproachMap.put(LOG_ITEM_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.item.zbjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL,
		// "gms.common.item.kfttsjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_XIU_QI,
		// "gms.common.item.hpxq");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_LV_UP,
		// "gms.common.item.hpsj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XIE_YI_SHU,
		// "gms.common.item.xylh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_XIU_QI, "gms.common.item.lhxq");
		// goldApproachMap.put(LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE,
		// "gms.common.item.lhqtbsx");
		// goldApproachMap.put(LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.item.kfqrhd");
		// goldApproachMap.put(LOG_ITEM_CHANGE_BUILD_CHOU_JIAN,
		// "gms.common.item.jzcj");
		// goldApproachMap.put(LOG_ITEM_CHANGE_BUILD_DUI_HUAN,
		// "gms.common.item.jzdh");
		// goldApproachMap.put(LOG_ITEM_CHANGE_CHANGE_NAME,
		// "gms.common.item.gmk");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GH_CHANGE_NAME,
		// "gms.common.item.pxgmk");
		// goldApproachMap.put(LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI,
		// "gms.common.item.lzzgs");
		// goldApproachMap.put(LOG_ITEM_CHANGE_GUA_JI_LING,
		// "gms.common.item.sygjl");
		// goldApproachMap.put(LOG_ITEM_CHANGE_TOU_HUA,
		// "gms.common.item.touhua");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FANG_CAO,
		// "gms.common.item.fanghua");
		// goldApproachMap.put(LOG_ITEM_CHANGE_FANG_CHONG,
		// "gms.common.item.fangchong");
		// goldApproachMap.put(LOG_ITEM_CHANGE_HS_TOUHUA,
		// "gms.common.item.hsjth");
	}

	public final static Map<Integer, String> currencyApproachMap = new HashMap<Integer, String>();
	static {
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST, "gms.common.tjldhdyp");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_RANK, "gms.common.ltjfpmhq");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_FIGHT, "gms.common.ltjfzdhq");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD, "gms.common.ltjfxtjlhq");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_DUIHUAN, "gms.common.ltjfdhxh");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD, "gms.common.zbspxtjlhq");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE, "gms.common.zbspfjhq");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN, "gms.common.zbspdhxh");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_FIGHT, "gms.common.wjjfzdhq");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN, "gms.common.wjjfshopuse");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH, "gms.common.wjjfdayrank");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_BAG_OPEN, "gms.common.ndklb");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE, "gms.common.ndgptj");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_XIU_LIAN, "gms.common.ndxlxh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS, "gms.common.ndsjboss");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD, "gms.common.ndxqzjl");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD, "gms.common.frdcjjz");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_HS_BUILD, "gms.common.frdhsjz");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD, "gms.common.frdqcjz");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS, "gms.common.frdgphdgs");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS, "gms.common.frdgphdss");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL, "gms.common.frdcjdw");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL, "gms.common.frdshdw");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER, "gms.common.frdsh1jh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER, "gms.common.frdsh2jh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL, "gms.common.frdshks");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH, "gms.common.frdshh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD, "gms.common.frdxqjz");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_RAN_LIAO, "gms.common.frdshrl");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DIAOYU, "gms.common.frddiaoyu");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD, "gms.common.frdjzupgradejs");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL, "gms.common.frdfsdw");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_SH, "gms.common.mlzsh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ, "gms.common.mlzgphdzj");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF, "gms.common.mlzgphdgf");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS, "gms.common.mlzhyf");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ, "gms.common.mlzhxqhd");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN, "gms.common.mlzonlogin");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHEWEI, "gms.common.mlzonbaifang");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_UP_KEJI, "gms.common.jzsjkj");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_DONATE, "gms.common.jzjx");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_TANGYUAN, "gms.common.slzeatty");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG, "gms.common.slzgphd");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT, "gms.common.slzeopenlb");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_ONLOGIN, "gms.common.slzonlogin");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK, "gms.common.slzonbossrank");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO, "gms.common.slfanghuo");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT, "gms.common.slzqzzd");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT, "gms.common.slzpxzrank");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT, "gms.common.slzxqzrank");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT, "gms.common.slzleitairank");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK, "gms.common.slzkejurank");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_SW, "gms.common.pxzsw");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_SW, "gms.common.shopdhsw");

		currencyApproachMap.put(LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN, "gms.common.zbspdh");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_DUIHUAN, "gms.common.lfbdh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE, "gms.common.lfbhd");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA, "gms.common.eazsh");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN, "gms.common.eazhy");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD, "gms.common.eazfqhd");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY, "gms.common.eaztreegy");

		currencyApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_KF_RY, "gms.common.ryzhd");
		currencyApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_RY, "gms.common.ryzdh");
		// //add--currencyApproachMap
		// currencyApproachMap.put(LOG_MONEY_CHANGE_CREATE_BUILD,
		// "gms.common.jzjz");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_BUY_DRESS,
		// "gms.common.gmyf");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FABAO_UPGRADE,
		// "gms.common.jnsj");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_MAKE_EQUIP,
		// "gms.common.zzzb");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpc");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_CHAHUA,
		// "gms.common.chahua");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS,
		// "gms.common.gztsfh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS_CONSUME,
		// "gms.common.gztsxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzgh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_FST,
		// "gms.common.dltdl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LADDER,
		// "gms.common.dwjdl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_EQUIP_SALE,
		// "gms.common.cszb");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_USERPROP_LIBAO,
		// "gms.common.sydjlb");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SCENE_REWARD,
		// "gms.common.gktgjl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjld");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SYSTEM_REWARD,
		// "gms.common.lqxtjl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_GK,
		// "gms.common.dyctg");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_MISSION,
		// "gms.common.wcrwjl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FST_PH,
		// "gms.common.ltphjl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SHOP_BUY_ITEM,
		// "gms.common.xcgmdjxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjlhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossgwxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_FIGHT,
		// "gms.common.sjbosszdhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FIRST_CHONGZHI,
		// "gms.common.scjlhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_ITEM_USE_MONEY_CARD,
		// "gms.common.syylkhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE,
		// "gms.common.jhylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_QIANG_DAO,
		// "gms.common.dqdhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_UPGRADE_STONE,
		// "gms.common.sjbs");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.ylgphdfl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_MAKE_CLOTHES,
		// "gms.common.fzhcxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAG, "gms.common.kbb");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_MAKE_MATERIAL,
		// "gms.common.zzcl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_DSTX, "gms.common.dstx");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_SAO_DNAG, "gms.common.sd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FENHONG, "gms.common.ghfh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_STONE_RONGHE,
		// "gms.common.bsrh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LYT,
		// "gms.common.dlyt");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_LYT_LVUP,
		// "gms.common.lytuplv");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_LYT_PH,
		// "gms.common.lytphhd");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_ZHENGHUN,
		// "gms.common.zhenghunylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_QIUHUN,
		// "gms.common.zhenghunqhylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE_TREE,
		// "gms.common.llzgyylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME,
		// "gms.common.pxzyzylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_FANGWEN,
		// "gms.common.cwfwylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_HARVEST_XQ,
		// "gms.common.shxqyl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_QZ, "gms.common.qzzdylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET,
		// "gms.common.pxzyzyl");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_LLZ_ADD_GY_COUNT,
		// "gms.common.llzgyylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_ZST_SCORE,
		// "gms.common.lftfsylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_ZST_BUY_ITEM,
		// "gms.common.lfbgmylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_QIANG_HUA,
		// "gms.common.pcqhylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_JING_JIE,
		// "gms.common.pcjjylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_STONE_FENJIE,
		// "gms.common.bsfjylxh");
		//
		// currencyApproachMap.put(LOG_MONEY_CHANGE_LV_CHANGE,
		// "gms.common.sjjlylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_REWARD,
		// "gms.common.cwfwylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_BE_REWARD,
		// "gms.common.cwbfwylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_NI_MING_HD,
		// "gms.common.nmhdylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.zbjlylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME_GLOBAL,
		// "gms.common.kfzxhylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_GLOBAL,
		// "gms.common.kfyzylxh");
		// currencyApproachMap.put(LOG_MONEY_CHANGE_DA_XIAO_TAI_JIAN,
		// "gms.common.dxtjylxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI,
		// "gms.common.czsyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GZTB_SUODING,
		// "gms.common.gztbzwsdxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GZTB_TS,
		// "gms.common.gztbybtsxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GZTB_REFRESH,
		// "gms.common.gztbczxh");
		// //add--currencyApproachMap
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CHANGE_NAME,
		// "gms.common.gmxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_USERPROP_LIBAO,
		// "gms.common.klbhd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SCENE_REWARD,
		// "gms.common.gkjlhd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SYSTEM_REWARD,
		// "gms.common.xitongjiangli");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_MISSION,
		// "gms.common.wcrwjl");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_HONGBAO,
		// "gms.common.gmhbxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_HONGBAO_GOT,
		// "gms.common.dkhbhd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUILDING_CREATE,
		// "gms.common.jzjzxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,
		// "gms.common.kzzzclgz");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_FST_PH,
		// "gms.common.fstphjlhd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT,
		// "gms.common.fstgmcsxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_FST_CLEAR_CD,
		// "gms.common.fstqcd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzghxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CREATE_GONGHUI,
		// "gms.common.cjghxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPEN_HUAPENG,
		// "gms.common.kqhpxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_DRESS,
		// "gms.common.gmzbxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_ITEM,
		// "gms.common.scmdxxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_FLOWER,
		// "gms.common.jshdxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,
		// "gms.common.jsclxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE,
		// "gms.common.sxdgdlxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_SAODANG,
		// "gms.common.gmsdxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpcxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BAG_OPEN_GRID,
		// "gms.common.bbkgzxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CHANGE_JOB,
		// "gms.common.zzxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.gphdfl");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT,
		// "gms.common.czzsyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD,
		// "gms.common.syybkhd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,
		// "gms.common.sjbossfuhuo");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossguwu");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjl");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,
		// "gms.common.ghsxrw");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION,
		// "gms.common.ghjsrwxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUILDING_UPGRADE,
		// "gms.common.jzxqxh");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_VIP_ITEM,
		// "gms.common.gmvipdj");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_UPGRADE_BUILD,
		// "gms.common.xiuqi");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.ksgmcl");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_YUE_KA, "gms.common.yk");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_JI_KA, "gms.common.jk");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_XSTM_BUY_ITEM,
		// "gms.common.xstm");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CLAIM_BIND_REWARD,
		// "gms.common.bdsl");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ADD_LYT_TZ,
		// "gms.common.lyttz");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_COMPLETE_LYT_SD,
		// "gms.common.lytsd");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_LYT_YB_CZ,
		// "gms.common.lytcz");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_LYT_PH, "gms.common.lytph");
		// currencyApproachMap.put(LOG_GOLD_PRESENT_GIFT,
		// "gms.common.ldrwjjyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPT_BYU_CZJJ,
		// "gms.common.buyczjjyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ,
		// "gms.common.czjjyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_QZ_FIGHT,
		// "gms.common.qzzdyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_CHEWEI_SHANGCHA,
		// "gms.common.cwscyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU,
		// "gms.common.xqwgwyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT,
		// "gms.common.buyxqwcyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH,
		// "gms.common.xqsxcdyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ZST_CLEAR,
		// "gms.common.zstqcdyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ZST_REFRESH,
		// "gms.common.zstsxyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP,
		// "gms.common.zstsxsdyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ZST_BUY_ITEM,
		// "gms.common.zstshopyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED,
		// "gms.common.marriagetreejsyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED,
		// "gms.common.marrigehuaiyunyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_HZ_CHANG_NAME,
		// "gms.common.hzchangenameyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP,
		// "gms.common.ghexitcdyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT,
		// "gms.common.guajibuycountyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_XFFL,
		// "gms.common.xfflyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_FQ_HU_CUT_TIME,
		// "gms.common.fqhdcdyb");
		//
		// currencyApproachMap.put(LOG_GOLD_CHANGE_LI_HUN,
		// "gms.common.lihunyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.kfqrhdyb");
		// currencyApproachMap.put(LOG_GOLD_CHANGE_ON_SHARE,
		// "gms.common.fengxiangyb");
		// currencyApproachMap.put(LOG_RES_CHANGE_ON_SYS_HONGBAO,
		// "gms.common.xthbyb");
		// currencyApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME,
		// "gms.common.mhbyb");
		// currencyApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO,
		// "gms.common.hunbaoyb");
		// currencyApproachMap.put(LOG_RES_CHANGE_HUI_GUI,
		// "gms.common.huiguiyb");
		// currencyApproachMap.put(LOG_RES_CHANGE_ON_BIND_PHONE,
		// "gms.common.bdsjhyb");
		// //add--currencyApproachMap
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhdyp");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_RANK,
		// "gms.common.ltjfpmhq");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_FIGHT,
		// "gms.common.ltjfzdhq");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD,
		// "gms.common.ltjfxtjlhq");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_DUIHUAN,
		// "gms.common.ltjfdhxh");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD,
		// "gms.common.zbspxtjlhq");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE,
		// "gms.common.zbspfjhq");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN,
		// "gms.common.zbspdhxh");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_FIGHT,
		// "gms.common.wjjfzdhq");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN,
		// "gms.common.wjjfshopuse");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH,
		// "gms.common.wjjfdayrank");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_BAG_OPEN,
		// "gms.common.ndklb");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE,
		// "gms.common.ndgptj");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_XIU_LIAN,
		// "gms.common.ndxlxh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS,
		// "gms.common.ndsjboss");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD,
		// "gms.common.ndxqzjl");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD,
		// "gms.common.frdcjjz");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_HS_BUILD,
		// "gms.common.frdhsjz");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD,
		// "gms.common.frdqcjz");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS,
		// "gms.common.frdgphdgs");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS,
		// "gms.common.frdgphdss");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL,
		// "gms.common.frdcjdw");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL,
		// "gms.common.frdshdw");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER,
		// "gms.common.frdsh1jh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER,
		// "gms.common.frdsh2jh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL,
		// "gms.common.frdshks");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH,
		// "gms.common.frdshh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD,
		// "gms.common.frdxqjz");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_RAN_LIAO,
		// "gms.common.frdshrl");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DIAOYU,
		// "gms.common.frddiaoyu");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD,
		// "gms.common.frdjzupgradejs");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL,
		// "gms.common.frdfsdw");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_SH,
		// "gms.common.mlzsh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ,
		// "gms.common.mlzgphdzj");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF,
		// "gms.common.mlzgphdgf");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS,
		// "gms.common.mlzhyf");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ,
		// "gms.common.mlzhxqhd");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN,
		// "gms.common.mlzonlogin");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHEWEI,
		// "gms.common.mlzonbaifang");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_UP_KEJI,
		// "gms.common.jzsjkj");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_DONATE,
		// "gms.common.jzjx");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_TANGYUAN,
		// "gms.common.slzeatty");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG,
		// "gms.common.slzgphd");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT,
		// "gms.common.slzeopenlb");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_ONLOGIN,
		// "gms.common.slzonlogin");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK,
		// "gms.common.slzonbossrank");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO,
		// "gms.common.slfanghuo");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT,
		// "gms.common.slzqzzd");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT,
		// "gms.common.slzpxzrank");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT,
		// "gms.common.slzxqzrank");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT,
		// "gms.common.slzleitairank");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK,
		// "gms.common.slzkejurank");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_SW,
		// "gms.common.pxzsw");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_SW,
		// "gms.common.shopdhsw");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN,
		// "gms.common.zbspdh");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_DUIHUAN,
		// "gms.common.lfbdh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE,
		// "gms.common.lfbhd");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA,
		// "gms.common.eazsh");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN,
		// "gms.common.eazhy");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD,
		// "gms.common.eazfqhd");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY,
		// "gms.common.eaztreegy");
		//
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_KF_RY,
		// "gms.common.ryzhd");
		// currencyApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_RY,
		// "gms.common.ryzdh");
		// //add--expApproachMap
		// currencyApproachMap.put(LOG_EXP_CHANGE_FIGHT_FST,
		// "gms.common.fstzdhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_FIGHT_LADDER,
		// "gms.common.wjzdhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_FIGHT_GK,
		// "gms.common.gkzdhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_GUIDE_KEY_SETP,
		// "gms.common.xsydgjbhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_TAKE_FLOWER,
		// "gms.common.cjxhhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_TAKE_MATERIAL,
		// "gms.common.cjclhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_EXP_ITEM,
		// "gms.common.sydjhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_ANIMAL_REAP,
		// "gms.common.shdwhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_HUA_PENG_FLOWER,
		// "gms.common.shhpxhhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_QING_AN, "gms.common.qahqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_MISSION, "gms.common.rwhdjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_DELETE_BUILD,
		// "gms.common.qczawhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_ANSWER_SECURITY_CODE,
		// "gms.common.huidayzmhqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_KEJU_DATI,
		// "gms.common.kjdthqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_SAO_DANG,
		// "gms.common.saodanghqjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE,
		// "gms.common.shllzjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_DIAOYU,
		// "gms.common.diaoyujy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_HARVEST_XQ,
		// "gms.common.shxqjy");
		//
		// currencyApproachMap.put(LOG_EXP_CHANGE_XQW_RANK_REWARD,
		// "gms.common.xqzjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_CHEWEI,
		// "gms.common.fangwenjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD,
		// "gms.common.kjpmjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_LYT_LVUP, "gms.common.lltjy");
		//
		// currencyApproachMap.put(LOG_EXP_CHANGE_HA_PENG_YI_JIAN,
		// "gms.common.hpyjshjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_CHU_CHONG,
		// "gms.common.chuchongjy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_JIAO_SHUI,
		// "gms.common.jiaoshuijy");
		// currencyApproachMap.put(LOG_EXP_CHANGE_CHU_CAO,
		// "gms.common.chucaojy");
		//
		// currencyApproachMap.put(LOG_EXP_CHANGE_GM, "gms.common.gmmlhqjy");
		// //add--itemApproachMap
		// currencyApproachMap.put(LOG_ITEM_CHANGE_AVATAR_CREATE,
		// "gms.common.item.jscj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SEX, "gms.common.item.gbxb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GZTB_TS,
		// "gms.common.item.gztbts");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GZTB_REWARD,
		// "gms.common.item.gztbjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USEPROP_LIBAO,
		// "gms.common.item.sylb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SCENE_REWARD,
		// "gms.common.item.fbjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_ADD,
		// "gms.common.item.zhzj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT,
		// "gms.common.item.zhkc");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FST_PH,
		// "gms.common.item.fstph");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_LVUP,
		// "gms.common.item.sjjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MIANSHENG,
		// "gms.common.item.msjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GHFUBEN,
		// "gms.common.item.ghfbdl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER,
		// "gms.common.item.hpcjhd");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_STONE_ADD,
		// "gms.common.item.zjbs");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_DRESS_BUY,
		// "gms.common.item.gmzb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_BUY_RMB_ITEM,
		// "gms.common.item.scgmdj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_DUIHUAN,
		// "gms.common.item.dhwp");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FLOWER_SEED,
		// "gms.common.item.zhonghua");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MAKE_EQUIP,
		// "gms.common.item.zzzb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MAKE_METERIAL,
		// "gms.common.item.zzcl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_STONE_REMOVE,
		// "gms.common.item.ycbs");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER,
		// "gms.common.item.cjhd");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_TAKE_MATERIAL,
		// "gms.common.item.cjcl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE,
		// "gms.common.item.bssj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_PROP_ZHENFA,
		// "gms.common.item.syzf");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GET_REWARD_PRESENT,
		// "gms.common.item.ldjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_REWARD,
		// "gms.common.item.yjhqxtjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK,
		// "gms.common.item.zdgkdl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK_ZD,
		// "gms.common.item.zddl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MISSION,
		// "gms.common.item.rwjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_DECOMPOSE_EQUIP,
		// "gms.common.item.fjzb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SALE,
		// "gms.common.item.mczb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_CUT_TREE,
		// "gms.common.item.ks");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_CHAHUA,
		// "gms.common.item.ch");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_CHAHUA_SPEEDUP,
		// "gms.common.item.chjs");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM,
		// "gms.common.item.sywpkc");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.item.wcldjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GRADE_HUDONG,
		// "gms.common.item.gphddjxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIRST_PAY_GIFT,
		// "gms.common.item.scjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_COUPON,
		// "gms.common.item.dhmlb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ZHENFA_UP_LV,
		// "gms.common.item.zhenfasjxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD,
		// "gms.common.item.gphdjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_CREATE_ANIMAL,
		// "gms.common.item.cjdw");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FEED_ANIMAL,
		// "gms.common.item.wydw");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_REAP_ANIMAL,
		// "gms.common.item.shdwjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ZENG_SONG_FLOWER,
		// "gms.common.item.zsxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HORN, "gms.common.item.dlb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_COMPOSE_FLOWER,
		// "gms.common.item.hcxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD,
		// "gms.common.item.shsjjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA,
		// "gms.common.item.sjbossjs");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.item.sjbossph");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.item.kbxhd");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_BUY_VIP_ITEM,
		// "gms.common.item.gmvipdj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD,
		// "gms.common.item.sgqdjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MRRRIAGE_AGREE,
		// "gms.common.item.jhkdj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_YQM,
		// "gms.common.item.yqhylb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.item.dzhcksgm");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_OPEN_BUILD_PROP,
		// "gms.common.item.kjzb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP,
		// "gms.common.item.kdwb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MAKE_CLOTHES,
		// "gms.common.item.fzhc");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAODUIFU,
		// "gms.common.item.syzdf");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAOCUOFU,
		// "gms.common.item.syzcf");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.item.kjdtjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XSTM_ADD_ITEM,
		// "gms.common.item.xstmgm");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SAO_DANG_LING,
		// "gms.common.item.sysdl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT,
		// "gms.common.item.zbkbsc");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_STONE_RONGHE,
		// "gms.common.item.bsrh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE,
		// "gms.common.item.zbsxzh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_RED_TANG_YUAN,
		// "gms.common.item.syhgty");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_LYT_REWARD,
		// "gms.common.item.lytjl");
		//
		// currencyApproachMap.put(LOG_ITEM_CHANGE_MARRIAGE_FANGHUO,
		// "gms.common.item.fanghuo");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XJZB_SHOP,
		// "gms.common.item.pxsd");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS,
		// "gms.common.item.kbbdjxys");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU,
		// "gms.common.item.dyxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU_SH,
		// "gms.common.item.dysh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_HUDONG,
		// "gms.common.item.xqhd");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_VIEW,
		// "gms.common.item.lookxq");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SONGKE,
		// "gms.common.item.songkxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SHANG_CHA,
		// "gms.common.item.scxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS,
		// "gms.common.item.pxzjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XQZ_RANK,
		// "gms.common.item.xqzmjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_CROSS_HORN,
		// "gms.common.item.kflb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ZST_SCORE,
		// "gms.common.item.lftjf");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ZST_SHOP,
		// "gms.common.item.lftwp");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HUAI_YUN,
		// "gms.common.item.huaiyunxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_QIANG_HUA,
		// "gms.common.item.qianghua");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_JING_JIE,
		// "gms.common.item.jinjie");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_PLAYER,
		// "gms.common.item.ltwugive");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_STONE_FENJIE,
		// "gms.common.item.bsfj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XFYL,
		// "gms.common.item.xfyl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_PROP,
		// "gms.common.item.hzjjxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GUAJI_GK,
		// "gms.common.item.jqgj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK,
		// "gms.common.item.zdgj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FQ_HQ,
		// "gms.common.item.fqhdrandom");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_UP,
		// "gms.common.item.hzjlsjxh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO,
		// "gms.common.item.thzbfb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ADD_EQUIP_FABAO,
		// "gms.common.item.zjzbfb");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM,
		// "gms.common.item.xtxz");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GM_ADD,
		// "gms.common.item.gmff");
		//
		// currencyApproachMap.put(LOG_ITEM_CHANGE_NM_MAIL_LOOK,
		// "gms.common.item.nmyjck");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.item.zbjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL,
		// "gms.common.item.kfttsjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_XIU_QI,
		// "gms.common.item.hpxq");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_LV_UP,
		// "gms.common.item.hpsj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XIE_YI_SHU,
		// "gms.common.item.xylh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_XIU_QI,
		// "gms.common.item.lhxq");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE,
		// "gms.common.item.lhqtbsx");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.item.kfqrhd");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_BUILD_CHOU_JIAN,
		// "gms.common.item.jzcj");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_BUILD_DUI_HUAN,
		// "gms.common.item.jzdh");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_CHANGE_NAME,
		// "gms.common.item.gmk");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GH_CHANGE_NAME,
		// "gms.common.item.pxgmk");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI,
		// "gms.common.item.lzzgs");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_GUA_JI_LING,
		// "gms.common.item.sygjl");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_TOU_HUA,
		// "gms.common.item.touhua");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FANG_CAO,
		// "gms.common.item.fanghua");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_FANG_CHONG,
		// "gms.common.item.fangchong");
		// currencyApproachMap.put(LOG_ITEM_CHANGE_HS_TOUHUA,
		// "gms.common.item.hsjth");

	}

	public final static Map<Integer, String> expApproachMap = new HashMap<Integer, String>();
	static {
		expApproachMap.put(LOG_EXP_CHANGE_FIGHT_FST, "gms.common.fstzdhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_FIGHT_LADDER, "gms.common.wjzdhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_FIGHT_GK, "gms.common.gkzdhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_GUIDE_KEY_SETP, "gms.common.xsydgjbhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_TAKE_FLOWER, "gms.common.cjxhhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_TAKE_MATERIAL, "gms.common.cjclhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_EXP_ITEM, "gms.common.sydjhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST, "gms.common.tjldhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_ANIMAL_REAP, "gms.common.shdwhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_HUA_PENG_FLOWER, "gms.common.shhpxhhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_QING_AN, "gms.common.qahqjy");
		expApproachMap.put(LOG_EXP_CHANGE_MISSION, "gms.common.rwhdjy");
		expApproachMap.put(LOG_EXP_CHANGE_DELETE_BUILD, "gms.common.qczawhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_ANSWER_SECURITY_CODE, "gms.common.huidayzmhqjy");
		expApproachMap.put(LOG_EXP_CHANGE_KEJU_DATI, "gms.common.kjdthqjy");
		expApproachMap.put(LOG_EXP_CHANGE_SAO_DANG, "gms.common.saodanghqjy");
		expApproachMap.put(LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE, "gms.common.shllzjy");
		expApproachMap.put(LOG_EXP_CHANGE_DIAOYU, "gms.common.diaoyujy");
		expApproachMap.put(LOG_EXP_CHANGE_HARVEST_XQ, "gms.common.shxqjy");

		expApproachMap.put(LOG_EXP_CHANGE_XQW_RANK_REWARD, "gms.common.xqzjy");
		expApproachMap.put(LOG_EXP_CHANGE_CHEWEI, "gms.common.fangwenjy");
		expApproachMap.put(LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD, "gms.common.kjpmjy");
		expApproachMap.put(LOG_EXP_CHANGE_LYT_LVUP, "gms.common.lltjy");

		expApproachMap.put(LOG_EXP_CHANGE_HA_PENG_YI_JIAN, "gms.common.hpyjshjy");
		expApproachMap.put(LOG_EXP_CHANGE_CHU_CHONG, "gms.common.chuchongjy");
		expApproachMap.put(LOG_EXP_CHANGE_JIAO_SHUI, "gms.common.jiaoshuijy");
		expApproachMap.put(LOG_EXP_CHANGE_CHU_CAO, "gms.common.chucaojy");

		expApproachMap.put(LOG_EXP_CHANGE_GM, "gms.common.gmmlhqjy");
		// 2017年8月25日
		expApproachMap.put(LOG_EXP_CHANGE_LI_XIAN, "gms.exp.lxjy");// 离线经验
		expApproachMap.put(LOG_EXP_CHANGE_GTSW, "gms.exp.gtsw");// 宫廷事务
		expApproachMap.put(LOG_EXP_CHANGE_SW_FB, "gms.exp.slfbjl");// 试炼副本奖励
		// //add--expApproachMap
		// expApproachMap.put(LOG_MONEY_CHANGE_CREATE_BUILD, "gms.common.jzjz");
		// expApproachMap.put(LOG_MONEY_CHANGE_BUY_DRESS, "gms.common.gmyf");
		// expApproachMap.put(LOG_MONEY_CHANGE_FABAO_UPGRADE,
		// "gms.common.jnsj");
		// expApproachMap.put(LOG_MONEY_CHANGE_MAKE_EQUIP, "gms.common.zzzb");
		// expApproachMap.put(LOG_MONEY_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpc");
		// expApproachMap.put(LOG_MONEY_CHANGE_CHAHUA, "gms.common.chahua");
		// expApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS, "gms.common.gztsfh");
		// expApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS_CONSUME,
		// "gms.common.gztsxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzgh");
		// expApproachMap.put(LOG_MONEY_CHANGE_FIGHT_FST, "gms.common.dltdl");
		// expApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LADDER,
		// "gms.common.dwjdl");
		// expApproachMap.put(LOG_MONEY_CHANGE_EQUIP_SALE, "gms.common.cszb");
		// expApproachMap.put(LOG_MONEY_CHANGE_USERPROP_LIBAO,
		// "gms.common.sydjlb");
		// expApproachMap.put(LOG_MONEY_CHANGE_SCENE_REWARD,
		// "gms.common.gktgjl");
		// expApproachMap.put(LOG_MONEY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjld");
		// expApproachMap.put(LOG_MONEY_CHANGE_SYSTEM_REWARD,
		// "gms.common.lqxtjl");
		// expApproachMap.put(LOG_MONEY_CHANGE_FIGHT_GK, "gms.common.dyctg");
		// expApproachMap.put(LOG_MONEY_CHANGE_MISSION, "gms.common.wcrwjl");
		// expApproachMap.put(LOG_MONEY_CHANGE_FST_PH, "gms.common.ltphjl");
		// expApproachMap.put(LOG_MONEY_CHANGE_SHOP_BUY_ITEM,
		// "gms.common.xcgmdjxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjlhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossgwxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_FIGHT,
		// "gms.common.sjbosszdhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_FIRST_CHONGZHI,
		// "gms.common.scjlhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_ITEM_USE_MONEY_CARD,
		// "gms.common.syylkhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE, "gms.common.jhylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_QIANG_DAO, "gms.common.dqdhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_UPGRADE_STONE,
		// "gms.common.sjbs");
		// expApproachMap.put(LOG_MONEY_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.ylgphdfl");
		// expApproachMap.put(LOG_MONEY_CHANGE_MAKE_CLOTHES,
		// "gms.common.fzhcxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAG, "gms.common.kbb");
		// expApproachMap.put(LOG_MONEY_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// expApproachMap.put(LOG_MONEY_CHANGE_MAKE_MATERIAL,
		// "gms.common.zzcl");
		// expApproachMap.put(LOG_MONEY_CHANGE_DSTX, "gms.common.dstx");
		// expApproachMap.put(LOG_MONEY_CHANGE_SAO_DNAG, "gms.common.sd");
		// expApproachMap.put(LOG_MONEY_CHANGE_FENHONG, "gms.common.ghfh");
		// expApproachMap.put(LOG_MONEY_CHANGE_STONE_RONGHE, "gms.common.bsrh");
		// expApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LYT, "gms.common.dlyt");
		// expApproachMap.put(LOG_MONEY_CHANGE_LYT_LVUP, "gms.common.lytuplv");
		// expApproachMap.put(LOG_MONEY_CHANGE_LYT_PH, "gms.common.lytphhd");
		// expApproachMap.put(LOG_MONEY_CHANGE_ZHENGHUN,
		// "gms.common.zhenghunylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_QIUHUN,
		// "gms.common.zhenghunqhylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE_TREE,
		// "gms.common.llzgyylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME,
		// "gms.common.pxzyzylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_FANGWEN,
		// "gms.common.cwfwylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_HARVEST_XQ, "gms.common.shxqyl");
		// expApproachMap.put(LOG_MONEY_CHANGE_QZ, "gms.common.qzzdylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET, "gms.common.pxzyzyl");
		// expApproachMap.put(LOG_MONEY_CHANGE_LLZ_ADD_GY_COUNT,
		// "gms.common.llzgyylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_ZST_SCORE,
		// "gms.common.lftfsylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_ZST_BUY_ITEM,
		// "gms.common.lfbgmylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_QIANG_HUA,
		// "gms.common.pcqhylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_JING_JIE, "gms.common.pcjjylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_STONE_FENJIE,
		// "gms.common.bsfjylxh");
		//
		// expApproachMap.put(LOG_MONEY_CHANGE_LV_CHANGE,
		// "gms.common.sjjlylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_REWARD,
		// "gms.common.cwfwylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_BE_REWARD,
		// "gms.common.cwbfwylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_NI_MING_HD,
		// "gms.common.nmhdylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.zbjlylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME_GLOBAL,
		// "gms.common.kfzxhylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_GLOBAL,
		// "gms.common.kfyzylxh");
		// expApproachMap.put(LOG_MONEY_CHANGE_DA_XIAO_TAI_JIAN,
		// "gms.common.dxtjylxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI, "gms.common.czsyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_GZTB_SUODING,
		// "gms.common.gztbzwsdxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_GZTB_TS, "gms.common.gztbybtsxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_GZTB_REFRESH,
		// "gms.common.gztbczxh");
		// //add--expApproachMap
		// expApproachMap.put(LOG_GOLD_CHANGE_CHANGE_NAME, "gms.common.gmxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_USERPROP_LIBAO,
		// "gms.common.klbhd");
		// expApproachMap.put(LOG_GOLD_CHANGE_SCENE_REWARD,
		// "gms.common.gkjlhd");
		// expApproachMap.put(LOG_GOLD_CHANGE_SYSTEM_REWARD,
		// "gms.common.xitongjiangli");
		// expApproachMap.put(LOG_GOLD_CHANGE_MISSION, "gms.common.wcrwjl");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_HONGBAO, "gms.common.gmhbxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_HONGBAO_GOT, "gms.common.dkhbhd");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUILDING_CREATE,
		// "gms.common.jzjzxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,
		// "gms.common.kzzzclgz");
		// expApproachMap.put(LOG_GOLD_CHANGE_FST_PH, "gms.common.fstphjlhd");
		// expApproachMap.put(LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT,
		// "gms.common.fstgmcsxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_FST_CLEAR_CD,
		// "gms.common.fstqcd");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzghxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_CREATE_GONGHUI,
		// "gms.common.cjghxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPEN_HUAPENG,
		// "gms.common.kqhpxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_DRESS, "gms.common.gmzbxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_ITEM, "gms.common.scmdxxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_FLOWER,
		// "gms.common.jshdxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,
		// "gms.common.jsclxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE,
		// "gms.common.sxdgdlxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_SAODANG, "gms.common.gmsdxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpcxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_BAG_OPEN_GRID,
		// "gms.common.bbkgzxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_CHANGE_JOB, "gms.common.zzxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.gphdfl");
		// expApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT,
		// "gms.common.czzsyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD,
		// "gms.common.syybkhd");
		// expApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,
		// "gms.common.sjbossfuhuo");
		// expApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossguwu");
		// expApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjl");
		// expApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,
		// "gms.common.ghsxrw");
		// expApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION,
		// "gms.common.ghjsrwxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUILDING_UPGRADE,
		// "gms.common.jzxqxh");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_VIP_ITEM,
		// "gms.common.gmvipdj");
		// expApproachMap.put(LOG_GOLD_CHANGE_UPGRADE_BUILD,
		// "gms.common.xiuqi");
		// expApproachMap.put(LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.ksgmcl");
		// expApproachMap.put(LOG_GOLD_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// expApproachMap.put(LOG_GOLD_CHANGE_YUE_KA, "gms.common.yk");
		// expApproachMap.put(LOG_GOLD_CHANGE_JI_KA, "gms.common.jk");
		// expApproachMap.put(LOG_GOLD_CHANGE_XSTM_BUY_ITEM, "gms.common.xstm");
		// expApproachMap.put(LOG_GOLD_CHANGE_CLAIM_BIND_REWARD,
		// "gms.common.bdsl");
		// expApproachMap.put(LOG_GOLD_CHANGE_ADD_LYT_TZ, "gms.common.lyttz");
		// expApproachMap.put(LOG_GOLD_CHANGE_COMPLETE_LYT_SD,
		// "gms.common.lytsd");
		// expApproachMap.put(LOG_GOLD_CHANGE_LYT_YB_CZ, "gms.common.lytcz");
		// expApproachMap.put(LOG_GOLD_CHANGE_LYT_PH, "gms.common.lytph");
		// expApproachMap.put(LOG_GOLD_PRESENT_GIFT, "gms.common.ldrwjjyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPT_BYU_CZJJ,
		// "gms.common.buyczjjyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ,
		// "gms.common.czjjyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_QZ_FIGHT, "gms.common.qzzdyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_CHEWEI_SHANGCHA,
		// "gms.common.cwscyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU,
		// "gms.common.xqwgwyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT,
		// "gms.common.buyxqwcyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH,
		// "gms.common.xqsxcdyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ZST_CLEAR, "gms.common.zstqcdyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ZST_REFRESH,
		// "gms.common.zstsxyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP,
		// "gms.common.zstsxsdyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ZST_BUY_ITEM,
		// "gms.common.zstshopyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED,
		// "gms.common.marriagetreejsyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED,
		// "gms.common.marrigehuaiyunyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_HZ_CHANG_NAME,
		// "gms.common.hzchangenameyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP,
		// "gms.common.ghexitcdyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT,
		// "gms.common.guajibuycountyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_XFFL,
		// "gms.common.xfflyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_FQ_HU_CUT_TIME,
		// "gms.common.fqhdcdyb");
		//
		// expApproachMap.put(LOG_GOLD_CHANGE_LI_HUN, "gms.common.lihunyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.kfqrhdyb");
		// expApproachMap.put(LOG_GOLD_CHANGE_ON_SHARE,
		// "gms.common.fengxiangyb");
		// expApproachMap.put(LOG_RES_CHANGE_ON_SYS_HONGBAO,
		// "gms.common.xthbyb");
		// expApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME,
		// "gms.common.mhbyb");
		// expApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO,
		// "gms.common.hunbaoyb");
		// expApproachMap.put(LOG_RES_CHANGE_HUI_GUI, "gms.common.huiguiyb");
		// expApproachMap.put(LOG_RES_CHANGE_ON_BIND_PHONE,
		// "gms.common.bdsjhyb");
		// //add--expApproachMap
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhdyp");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_RANK,
		// "gms.common.ltjfpmhq");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_FIGHT,
		// "gms.common.ltjfzdhq");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD,
		// "gms.common.ltjfxtjlhq");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_DUIHUAN,
		// "gms.common.ltjfdhxh");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD,
		// "gms.common.zbspxtjlhq");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE,
		// "gms.common.zbspfjhq");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN,
		// "gms.common.zbspdhxh");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_FIGHT,
		// "gms.common.wjjfzdhq");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN,
		// "gms.common.wjjfshopuse");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH,
		// "gms.common.wjjfdayrank");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ND_BAG_OPEN,
		// "gms.common.ndklb");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE,
		// "gms.common.ndgptj");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ND_XIU_LIAN,
		// "gms.common.ndxlxh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS,
		// "gms.common.ndsjboss");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD,
		// "gms.common.ndxqzjl");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD,
		// "gms.common.frdcjjz");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_HS_BUILD,
		// "gms.common.frdhsjz");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD,
		// "gms.common.frdqcjz");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS,
		// "gms.common.frdgphdgs");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS,
		// "gms.common.frdgphdss");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL,
		// "gms.common.frdcjdw");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL,
		// "gms.common.frdshdw");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER,
		// "gms.common.frdsh1jh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER,
		// "gms.common.frdsh2jh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL,
		// "gms.common.frdshks");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH,
		// "gms.common.frdshh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD,
		// "gms.common.frdxqjz");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_RAN_LIAO,
		// "gms.common.frdshrl");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DIAOYU,
		// "gms.common.frddiaoyu");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD,
		// "gms.common.frdjzupgradejs");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL,
		// "gms.common.frdfsdw");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_SH, "gms.common.mlzsh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ,
		// "gms.common.mlzgphdzj");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF,
		// "gms.common.mlzgphdgf");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS,
		// "gms.common.mlzhyf");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ,
		// "gms.common.mlzhxqhd");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN,
		// "gms.common.mlzonlogin");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHEWEI,
		// "gms.common.mlzonbaifang");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_UP_KEJI, "gms.common.jzsjkj");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_DONATE, "gms.common.jzjx");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_TANGYUAN,
		// "gms.common.slzeatty");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG,
		// "gms.common.slzgphd");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT,
		// "gms.common.slzeopenlb");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_ONLOGIN,
		// "gms.common.slzonlogin");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK,
		// "gms.common.slzonbossrank");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO,
		// "gms.common.slfanghuo");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT,
		// "gms.common.slzqzzd");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT,
		// "gms.common.slzpxzrank");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT,
		// "gms.common.slzxqzrank");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT,
		// "gms.common.slzleitairank");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK,
		// "gms.common.slzkejurank");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_SW, "gms.common.pxzsw");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_SW,
		// "gms.common.shopdhsw");
		//
		// expApproachMap.put(LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN,
		// "gms.common.zbspdh");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_DUIHUAN,
		// "gms.common.lfbdh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE,
		// "gms.common.lfbhd");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA,
		// "gms.common.eazsh");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN,
		// "gms.common.eazhy");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD,
		// "gms.common.eazfqhd");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY,
		// "gms.common.eaztreegy");
		//
		// expApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_KF_RY,
		// "gms.common.ryzhd");
		// expApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_RY, "gms.common.ryzdh");
		// //add--expApproachMap
		// expApproachMap.put(LOG_EXP_CHANGE_FIGHT_FST, "gms.common.fstzdhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_FIGHT_LADDER,
		// "gms.common.wjzdhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_FIGHT_GK, "gms.common.gkzdhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_GUIDE_KEY_SETP,
		// "gms.common.xsydgjbhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_TAKE_FLOWER,
		// "gms.common.cjxhhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_TAKE_MATERIAL,
		// "gms.common.cjclhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_EXP_ITEM, "gms.common.sydjhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_ANIMAL_REAP,
		// "gms.common.shdwhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_HUA_PENG_FLOWER,
		// "gms.common.shhpxhhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_QING_AN, "gms.common.qahqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_MISSION, "gms.common.rwhdjy");
		// expApproachMap.put(LOG_EXP_CHANGE_DELETE_BUILD,
		// "gms.common.qczawhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_ANSWER_SECURITY_CODE,
		// "gms.common.huidayzmhqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_KEJU_DATI, "gms.common.kjdthqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_SAO_DANG,
		// "gms.common.saodanghqjy");
		// expApproachMap.put(LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE,
		// "gms.common.shllzjy");
		// expApproachMap.put(LOG_EXP_CHANGE_DIAOYU, "gms.common.diaoyujy");
		// expApproachMap.put(LOG_EXP_CHANGE_HARVEST_XQ, "gms.common.shxqjy");
		//
		// expApproachMap.put(LOG_EXP_CHANGE_XQW_RANK_REWARD,
		// "gms.common.xqzjy");
		// expApproachMap.put(LOG_EXP_CHANGE_CHEWEI, "gms.common.fangwenjy");
		// expApproachMap.put(LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD,
		// "gms.common.kjpmjy");
		// expApproachMap.put(LOG_EXP_CHANGE_LYT_LVUP, "gms.common.lltjy");
		//
		// expApproachMap.put(LOG_EXP_CHANGE_HA_PENG_YI_JIAN,
		// "gms.common.hpyjshjy");
		// expApproachMap.put(LOG_EXP_CHANGE_CHU_CHONG,
		// "gms.common.chuchongjy");
		// expApproachMap.put(LOG_EXP_CHANGE_JIAO_SHUI,
		// "gms.common.jiaoshuijy");
		// expApproachMap.put(LOG_EXP_CHANGE_CHU_CAO, "gms.common.chucaojy");
		//
		// expApproachMap.put(LOG_EXP_CHANGE_GM, "gms.common.gmmlhqjy");
		// //add--itemApproachMap
		// expApproachMap.put(LOG_ITEM_CHANGE_AVATAR_CREATE,
		// "gms.common.item.jscj");
		// expApproachMap.put(LOG_ITEM_CHANGE_SEX, "gms.common.item.gbxb");
		// expApproachMap.put(LOG_ITEM_CHANGE_GZTB_TS,
		// "gms.common.item.gztbts");
		// expApproachMap.put(LOG_ITEM_CHANGE_GZTB_REWARD,
		// "gms.common.item.gztbjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_USEPROP_LIBAO,
		// "gms.common.item.sylb");
		// expApproachMap.put(LOG_ITEM_CHANGE_SCENE_REWARD,
		// "gms.common.item.fbjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_ADD,
		// "gms.common.item.zhzj");
		// expApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT,
		// "gms.common.item.zhkc");
		// expApproachMap.put(LOG_ITEM_CHANGE_FST_PH, "gms.common.item.fstph");
		// expApproachMap.put(LOG_ITEM_CHANGE_LVUP, "gms.common.item.sjjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_MIANSHENG,
		// "gms.common.item.msjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GHFUBEN,
		// "gms.common.item.ghfbdl");
		// expApproachMap.put(LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER,
		// "gms.common.item.hpcjhd");
		// expApproachMap.put(LOG_ITEM_CHANGE_STONE_ADD,
		// "gms.common.item.zjbs");
		// expApproachMap.put(LOG_ITEM_CHANGE_DRESS_BUY,
		// "gms.common.item.gmzb");
		// expApproachMap.put(LOG_ITEM_CHANGE_BUY_RMB_ITEM,
		// "gms.common.item.scgmdj");
		// expApproachMap.put(LOG_ITEM_CHANGE_DUIHUAN, "gms.common.item.dhwp");
		// expApproachMap.put(LOG_ITEM_CHANGE_FLOWER_SEED,
		// "gms.common.item.zhonghua");
		// expApproachMap.put(LOG_ITEM_CHANGE_MAKE_EQUIP,
		// "gms.common.item.zzzb");
		// expApproachMap.put(LOG_ITEM_CHANGE_MAKE_METERIAL,
		// "gms.common.item.zzcl");
		// expApproachMap.put(LOG_ITEM_CHANGE_STONE_REMOVE,
		// "gms.common.item.ycbs");
		// expApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER,
		// "gms.common.item.cjhd");
		// expApproachMap.put(LOG_ITEM_CHANGE_TAKE_MATERIAL,
		// "gms.common.item.cjcl");
		// expApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE,
		// "gms.common.item.bssj");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_PROP_ZHENFA,
		// "gms.common.item.syzf");
		// expApproachMap.put(LOG_ITEM_CHANGE_GET_REWARD_PRESENT,
		// "gms.common.item.ldjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_REWARD,
		// "gms.common.item.yjhqxtjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK,
		// "gms.common.item.zdgkdl");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK_ZD,
		// "gms.common.item.zddl");
		// expApproachMap.put(LOG_ITEM_CHANGE_MISSION, "gms.common.item.rwjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_DECOMPOSE_EQUIP,
		// "gms.common.item.fjzb");
		// expApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SALE,
		// "gms.common.item.mczb");
		// expApproachMap.put(LOG_ITEM_CHANGE_CUT_TREE, "gms.common.item.ks");
		// expApproachMap.put(LOG_ITEM_CHANGE_CHAHUA, "gms.common.item.ch");
		// expApproachMap.put(LOG_ITEM_CHANGE_CHAHUA_SPEEDUP,
		// "gms.common.item.chjs");
		// expApproachMap.put(LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM,
		// "gms.common.item.sywpkc");
		// expApproachMap.put(LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.item.wcldjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_GRADE_HUDONG,
		// "gms.common.item.gphddjxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIRST_PAY_GIFT,
		// "gms.common.item.scjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_COUPON, "gms.common.item.dhmlb");
		// expApproachMap.put(LOG_ITEM_CHANGE_ZHENFA_UP_LV,
		// "gms.common.item.zhenfasjxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD,
		// "gms.common.item.gphdjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_CREATE_ANIMAL,
		// "gms.common.item.cjdw");
		// expApproachMap.put(LOG_ITEM_CHANGE_FEED_ANIMAL,
		// "gms.common.item.wydw");
		// expApproachMap.put(LOG_ITEM_CHANGE_REAP_ANIMAL,
		// "gms.common.item.shdwjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_ZENG_SONG_FLOWER,
		// "gms.common.item.zsxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_HORN, "gms.common.item.dlb");
		// expApproachMap.put(LOG_ITEM_CHANGE_COMPOSE_FLOWER,
		// "gms.common.item.hcxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD,
		// "gms.common.item.shsjjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA,
		// "gms.common.item.sjbossjs");
		// expApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.item.sjbossph");
		// expApproachMap.put(LOG_ITEM_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.item.kbxhd");
		// expApproachMap.put(LOG_ITEM_CHANGE_BUY_VIP_ITEM,
		// "gms.common.item.gmvipdj");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD,
		// "gms.common.item.sgqdjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_MRRRIAGE_AGREE,
		// "gms.common.item.jhkdj");
		// expApproachMap.put(LOG_ITEM_CHANGE_YQM, "gms.common.item.yqhylb");
		// expApproachMap.put(LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.item.dzhcksgm");
		// expApproachMap.put(LOG_ITEM_CHANGE_OPEN_BUILD_PROP,
		// "gms.common.item.kjzb");
		// expApproachMap.put(LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP,
		// "gms.common.item.kdwb");
		// expApproachMap.put(LOG_ITEM_CHANGE_MAKE_CLOTHES,
		// "gms.common.item.fzhc");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAODUIFU,
		// "gms.common.item.syzdf");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAOCUOFU,
		// "gms.common.item.syzcf");
		// expApproachMap.put(LOG_ITEM_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.item.kjdtjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_XSTM_ADD_ITEM,
		// "gms.common.item.xstmgm");
		// expApproachMap.put(LOG_ITEM_CHANGE_SAO_DANG_LING,
		// "gms.common.item.sysdl");
		// expApproachMap.put(LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT,
		// "gms.common.item.zbkbsc");
		// expApproachMap.put(LOG_ITEM_CHANGE_STONE_RONGHE,
		// "gms.common.item.bsrh");
		// expApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE,
		// "gms.common.item.zbsxzh");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_RED_TANG_YUAN,
		// "gms.common.item.syhgty");
		// expApproachMap.put(LOG_ITEM_CHANGE_LYT_REWARD,
		// "gms.common.item.lytjl");
		//
		// expApproachMap.put(LOG_ITEM_CHANGE_MARRIAGE_FANGHUO,
		// "gms.common.item.fanghuo");
		// expApproachMap.put(LOG_ITEM_CHANGE_XJZB_SHOP,
		// "gms.common.item.pxsd");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS,
		// "gms.common.item.kbbdjxys");
		// expApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU, "gms.common.item.dyxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU_SH,
		// "gms.common.item.dysh");
		// expApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_HUDONG,
		// "gms.common.item.xqhd");
		// expApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_VIEW,
		// "gms.common.item.lookxq");
		// expApproachMap.put(LOG_ITEM_CHANGE_SONGKE,
		// "gms.common.item.songkxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_SHANG_CHA,
		// "gms.common.item.scxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS,
		// "gms.common.item.pxzjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_XQZ_RANK,
		// "gms.common.item.xqzmjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_CROSS_HORN,
		// "gms.common.item.kflb");
		// expApproachMap.put(LOG_ITEM_CHANGE_ZST_SCORE,
		// "gms.common.item.lftjf");
		// expApproachMap.put(LOG_ITEM_CHANGE_ZST_SHOP,
		// "gms.common.item.lftwp");
		// expApproachMap.put(LOG_ITEM_CHANGE_HUAI_YUN,
		// "gms.common.item.huaiyunxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_QIANG_HUA,
		// "gms.common.item.qianghua");
		// expApproachMap.put(LOG_ITEM_CHANGE_JING_JIE,
		// "gms.common.item.jinjie");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIGHT_PLAYER,
		// "gms.common.item.ltwugive");
		// expApproachMap.put(LOG_ITEM_CHANGE_STONE_FENJIE,
		// "gms.common.item.bsfj");
		// expApproachMap.put(LOG_ITEM_CHANGE_XFYL, "gms.common.item.xfyl");
		// expApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_PROP,
		// "gms.common.item.hzjjxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GUAJI_GK,
		// "gms.common.item.jqgj");
		// expApproachMap.put(LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK,
		// "gms.common.item.zdgj");
		// expApproachMap.put(LOG_ITEM_CHANGE_FQ_HQ,
		// "gms.common.item.fqhdrandom");
		// expApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_UP,
		// "gms.common.item.hzjlsjxh");
		// expApproachMap.put(LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO,
		// "gms.common.item.thzbfb");
		// expApproachMap.put(LOG_ITEM_CHANGE_ADD_EQUIP_FABAO,
		// "gms.common.item.zjzbfb");
		// expApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM,
		// "gms.common.item.xtxz");
		// expApproachMap.put(LOG_ITEM_CHANGE_GM_ADD, "gms.common.item.gmff");
		//
		// expApproachMap.put(LOG_ITEM_CHANGE_NM_MAIL_LOOK,
		// "gms.common.item.nmyjck");
		// expApproachMap.put(LOG_ITEM_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.item.zbjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL,
		// "gms.common.item.kfttsjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_XIU_QI,
		// "gms.common.item.hpxq");
		// expApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_LV_UP,
		// "gms.common.item.hpsj");
		// expApproachMap.put(LOG_ITEM_CHANGE_XIE_YI_SHU,
		// "gms.common.item.xylh");
		// expApproachMap.put(LOG_ITEM_CHANGE_XIU_QI, "gms.common.item.lhxq");
		// expApproachMap.put(LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE,
		// "gms.common.item.lhqtbsx");
		// expApproachMap.put(LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.item.kfqrhd");
		// expApproachMap.put(LOG_ITEM_CHANGE_BUILD_CHOU_JIAN,
		// "gms.common.item.jzcj");
		// expApproachMap.put(LOG_ITEM_CHANGE_BUILD_DUI_HUAN,
		// "gms.common.item.jzdh");
		// expApproachMap.put(LOG_ITEM_CHANGE_CHANGE_NAME,
		// "gms.common.item.gmk");
		// expApproachMap.put(LOG_ITEM_CHANGE_GH_CHANGE_NAME,
		// "gms.common.item.pxgmk");
		// expApproachMap.put(LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI,
		// "gms.common.item.lzzgs");
		// expApproachMap.put(LOG_ITEM_CHANGE_GUA_JI_LING,
		// "gms.common.item.sygjl");
		// expApproachMap.put(LOG_ITEM_CHANGE_TOU_HUA,
		// "gms.common.item.touhua");
		// expApproachMap.put(LOG_ITEM_CHANGE_FANG_CAO,
		// "gms.common.item.fanghua");
		// expApproachMap.put(LOG_ITEM_CHANGE_FANG_CHONG,
		// "gms.common.item.fangchong");
		// expApproachMap.put(LOG_ITEM_CHANGE_HS_TOUHUA,
		// "gms.common.item.hsjth");

	}

	public final static Map<Integer, String> itemApproachMap = new HashMap<Integer, String>();
	static {
		itemApproachMap.put(LOG_ITEM_CHANGE_AVATAR_CREATE, "gms.common.item.jscj");
		itemApproachMap.put(LOG_ITEM_CHANGE_SEX, "gms.common.item.gbxb");
		itemApproachMap.put(LOG_ITEM_CHANGE_GZTB_TS, "gms.common.item.gztbts");
		itemApproachMap.put(LOG_ITEM_CHANGE_GZTB_REWARD, "gms.common.item.gztbjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_USEPROP_LIBAO, "gms.common.item.sylb");
		itemApproachMap.put(LOG_ITEM_CHANGE_SCENE_REWARD, "gms.common.item.fbjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_ADD, "gms.common.item.zhzj");
		itemApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT, "gms.common.item.zhkc");
		itemApproachMap.put(LOG_ITEM_CHANGE_FST_PH, "gms.common.item.fstph");
		itemApproachMap.put(LOG_ITEM_CHANGE_LVUP, "gms.common.item.sjjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_MIANSHENG, "gms.common.item.msjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GHFUBEN, "gms.common.item.ghfbdl");
		itemApproachMap.put(LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER, "gms.common.item.hpcjhd");
		itemApproachMap.put(LOG_ITEM_CHANGE_STONE_ADD, "gms.common.item.zjbs");
		itemApproachMap.put(LOG_ITEM_CHANGE_DRESS_BUY, "gms.common.item.gmzb");
		itemApproachMap.put(LOG_ITEM_CHANGE_BUY_RMB_ITEM, "gms.common.item.scgmdj");
		itemApproachMap.put(LOG_ITEM_CHANGE_DUIHUAN, "gms.common.item.dhwp");
		itemApproachMap.put(LOG_ITEM_CHANGE_FLOWER_SEED, "gms.common.item.zhonghua");
		itemApproachMap.put(LOG_ITEM_CHANGE_MAKE_EQUIP, "gms.common.item.zzzb");
		itemApproachMap.put(LOG_ITEM_CHANGE_MAKE_METERIAL, "gms.common.item.zzcl");
		itemApproachMap.put(LOG_ITEM_CHANGE_STONE_REMOVE, "gms.common.item.ycbs");
		itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER, "gms.common.item.cjhd");
		itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_MATERIAL, "gms.common.item.cjcl");
		itemApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE, "gms.common.item.bssj");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_PROP_ZHENFA, "gms.common.item.syzf");
		itemApproachMap.put(LOG_ITEM_CHANGE_GET_REWARD_PRESENT, "gms.common.item.ldjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_REWARD, "gms.common.item.yjhqxtjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK, "gms.common.item.zdgkdl");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK_ZD, "gms.common.item.zddl");
		itemApproachMap.put(LOG_ITEM_CHANGE_MISSION, "gms.common.item.rwjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_DECOMPOSE_EQUIP, "gms.common.item.fjzb");
		itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SALE, "gms.common.item.mczb");
		itemApproachMap.put(LOG_ITEM_CHANGE_CUT_TREE, "gms.common.item.ks");
		itemApproachMap.put(LOG_ITEM_CHANGE_CHAHUA, "gms.common.item.ch");
		itemApproachMap.put(LOG_ITEM_CHANGE_CHAHUA_SPEEDUP, "gms.common.item.chjs");
		itemApproachMap.put(LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM, "gms.common.item.sywpkc");
		itemApproachMap.put(LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST, "gms.common.item.wcldjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_GRADE_HUDONG, "gms.common.item.gphddjxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIRST_PAY_GIFT, "gms.common.item.scjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_COUPON, "gms.common.item.dhmlb");
		itemApproachMap.put(LOG_ITEM_CHANGE_ZHENFA_UP_LV, "gms.common.item.zhenfasjxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD, "gms.common.item.gphdjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_CREATE_ANIMAL, "gms.common.item.cjdw");
		itemApproachMap.put(LOG_ITEM_CHANGE_FEED_ANIMAL, "gms.common.item.wydw");
		itemApproachMap.put(LOG_ITEM_CHANGE_REAP_ANIMAL, "gms.common.item.shdwjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_ZENG_SONG_FLOWER, "gms.common.item.zsxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_HORN, "gms.common.item.dlb");
		itemApproachMap.put(LOG_ITEM_CHANGE_COMPOSE_FLOWER, "gms.common.item.hcxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD, "gms.common.item.shsjjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA, "gms.common.item.sjbossjs");
		itemApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_PH, "gms.common.item.sjbossph");
		itemApproachMap.put(LOG_ITEM_CHANGE_OPEN_BAO_XIANG, "gms.common.item.kbxhd");
		itemApproachMap.put(LOG_ITEM_CHANGE_BUY_VIP_ITEM, "gms.common.item.gmvipdj");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD, "gms.common.item.sgqdjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_MRRRIAGE_AGREE, "gms.common.item.jhkdj");
		itemApproachMap.put(LOG_ITEM_CHANGE_YQM, "gms.common.item.yqhylb");
		itemApproachMap.put(LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST, "gms.common.item.dzhcksgm");
		itemApproachMap.put(LOG_ITEM_CHANGE_OPEN_BUILD_PROP, "gms.common.item.kjzb");
		itemApproachMap.put(LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP, "gms.common.item.kdwb");
		itemApproachMap.put(LOG_ITEM_CHANGE_MAKE_CLOTHES, "gms.common.item.fzhc");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAODUIFU, "gms.common.item.syzdf");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAOCUOFU, "gms.common.item.syzcf");
		itemApproachMap.put(LOG_ITEM_CHANGE_KEJU_DATI_REWARD, "gms.common.item.kjdtjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_XSTM_ADD_ITEM, "gms.common.item.xstmgm");
		itemApproachMap.put(LOG_ITEM_CHANGE_SAO_DANG_LING, "gms.common.item.sysdl");
		itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT, "gms.common.item.zbkbsc");
		itemApproachMap.put(LOG_ITEM_CHANGE_STONE_RONGHE, "gms.common.item.bsrh");
		itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE, "gms.common.item.zbsxzh");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_RED_TANG_YUAN, "gms.common.item.syhgty");
		itemApproachMap.put(LOG_ITEM_CHANGE_LYT_REWARD, "gms.common.item.lytjl");

		itemApproachMap.put(LOG_ITEM_CHANGE_MARRIAGE_FANGHUO, "gms.common.item.fanghuo");
		itemApproachMap.put(LOG_ITEM_CHANGE_XJZB_SHOP, "gms.common.item.pxsd");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS, "gms.common.item.kbbdjxys");
		itemApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU, "gms.common.item.dyxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU_SH, "gms.common.item.dysh");
		itemApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_HUDONG, "gms.common.item.xqhd");
		itemApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_VIEW, "gms.common.item.lookxq");
		itemApproachMap.put(LOG_ITEM_CHANGE_SONGKE, "gms.common.item.songkxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_SHANG_CHA, "gms.common.item.scxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS, "gms.common.item.pxzjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_XQZ_RANK, "gms.common.item.xqzmjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_CROSS_HORN, "gms.common.item.kflb");
		itemApproachMap.put(LOG_ITEM_CHANGE_ZST_SCORE, "gms.common.item.lftjf");
		itemApproachMap.put(LOG_ITEM_CHANGE_ZST_SHOP, "gms.common.item.lftwp");
		itemApproachMap.put(LOG_ITEM_CHANGE_HUAI_YUN, "gms.common.item.huaiyunxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_QIANG_HUA, "gms.common.item.qianghua");
		itemApproachMap.put(LOG_ITEM_CHANGE_JING_JIE, "gms.common.item.jinjie");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_PLAYER, "gms.common.item.ltwugive");
		itemApproachMap.put(LOG_ITEM_CHANGE_STONE_FENJIE, "gms.common.item.bsfj");
		itemApproachMap.put(LOG_ITEM_CHANGE_XFYL, "gms.common.item.xfyl");
		itemApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_PROP, "gms.common.item.hzjjxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GUAJI_GK, "gms.common.item.jqgj");
		itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK, "gms.common.item.zdgj");
		itemApproachMap.put(LOG_ITEM_CHANGE_FQ_HQ, "gms.common.item.fqhdrandom");
		itemApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_UP, "gms.common.item.hzjlsjxh");
		itemApproachMap.put(LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO, "gms.common.item.thzbfb");
		itemApproachMap.put(LOG_ITEM_CHANGE_ADD_EQUIP_FABAO, "gms.common.item.zjzbfb");
		itemApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM, "gms.common.item.xtxz");
		itemApproachMap.put(LOG_ITEM_CHANGE_GM_ADD, "gms.common.item.gmff");

		itemApproachMap.put(LOG_ITEM_CHANGE_NM_MAIL_LOOK, "gms.common.item.nmyjck");
		itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_JING_LIAN, "gms.common.item.zbjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL, "gms.common.item.kfttsjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_XIU_QI, "gms.common.item.hpxq");
		itemApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_LV_UP, "gms.common.item.hpsj");
		itemApproachMap.put(LOG_ITEM_CHANGE_XIE_YI_SHU, "gms.common.item.xylh");
		itemApproachMap.put(LOG_ITEM_CHANGE_XIU_QI, "gms.common.item.lhxq");
		itemApproachMap.put(LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE, "gms.common.item.lhqtbsx");
		itemApproachMap.put(LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM, "gms.common.item.kfqrhd");
		itemApproachMap.put(LOG_ITEM_CHANGE_BUILD_CHOU_JIAN, "gms.common.item.jzcj");
		itemApproachMap.put(LOG_ITEM_CHANGE_BUILD_DUI_HUAN, "gms.common.item.jzdh");
		itemApproachMap.put(LOG_ITEM_CHANGE_CHANGE_NAME, "gms.common.item.gmk");
		itemApproachMap.put(LOG_ITEM_CHANGE_GH_CHANGE_NAME, "gms.common.item.pxgmk");
		itemApproachMap.put(LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI, "gms.common.item.lzzgs");
		itemApproachMap.put(LOG_ITEM_CHANGE_GUA_JI_LING, "gms.common.item.sygjl");
		itemApproachMap.put(LOG_ITEM_CHANGE_TOU_HUA, "gms.common.item.touhua");
		itemApproachMap.put(LOG_ITEM_CHANGE_FANG_CAO, "gms.common.item.fanghua");
		itemApproachMap.put(LOG_ITEM_CHANGE_FANG_CHONG, "gms.common.item.fangchong");
		itemApproachMap.put(LOG_ITEM_CHANGE_HS_TOUHUA, "gms.common.item.hsjth");
		//2017-8-25
		itemApproachMap.put(LOG_ITEM_CHANGE_ZLMT_OPEN_BOX, "gms.item.zlmj");// 真灵秘塔
		itemApproachMap.put(LOG_ITEM_CHANGE_XING_SHOU_ZHI_DAO, "gms.item.xszdy");// 新手知道员
		itemApproachMap.put(LOG_ITEM_CHANGE_LAND_BUILDING_UP, "gms.item.tdsj");// 土地升级
		itemApproachMap.put(LOG_ITEM_CHANGE_HEI_SHI, "gms.item.hs");// 黑市
		itemApproachMap.put(LOG_ITEM_CHANGE_DRESS_TU_JIAN, "gms.item.fztj");// 服装图鉴
		itemApproachMap.put(LOG_ITEM_CHANGE_LING_GU_TA_WIN, "gms.item.lgtlp");// 灵谷塔令牌
		itemApproachMap.put(LOG_ITEM_CHANGE_SEND_RED_PACKET, "gms.item.fhb");// 发红包
		itemApproachMap.put(LOG_ITEM_CHANGE_LLZ_FRUIT, "gms.item.llzgs");// 连理枝果实
		itemApproachMap.put(LOG_ITEM_CHANGE_RONG_HE_CUT_LLZ_FRUIT, "gms.item.llzgsjs");// 连理枝果实融合减少
		itemApproachMap.put(LOG_ITEM_CHANGE_RONG_HE_ADD_LLZ_FRUIT, "gms.item.llzgszj");// 连理枝果实融合增加
		itemApproachMap.put(LOG_ITME_CHANGE_LLZ_SHOU_HUO_FRUIT, "gms.item.shllzgs");// 收获连理枝果实
		itemApproachMap.put(LOG_ITEM_ZHUANPAN_RECV, "gms.item.zpcj");// 转盘抽奖
		itemApproachMap.put(LOG_ITEM_CHANGE_BING_ID_CARD, "gms.item.sfyz");// 身份验证
		itemApproachMap.put(LOG_ITEM_CHANGE_GHW_GLOBAL, "gms.item.gfpxzjl");// 跨服派系站奖励
		itemApproachMap.put(LOG_ITEM_CHANGE_ZEYE_LV_UP, "gms.item.zysj");// 阵眼升级
		itemApproachMap.put(LOG_ITEM_CHANGE_PAY_THGM, "gms.item.thgm");// 特惠购买
		itemApproachMap.put(LOG_ITEM_CHANGE_GTSW, "gms.item.gtsw");// 宫廷事务
		itemApproachMap.put(LOG_ITEM_CHANGE_GTSW_PROP, "gms.item.ky");// 口谕
		itemApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE_QUICILY, "gms.item.bskssj");// 宝石快速升级
		itemApproachMap.put(LOG_ITEM_CHANGE_VEGETABLE_SEED, "gms.item.czbg");// 菜种变更
		itemApproachMap.put(LOG_ITEM_CHANGE_INGREDIENTS, "gms.item.sc");// 食材
		itemApproachMap.put(LOG_ITEM_CHANGE_VARIETY_DISHES, "gms.item.cp");// 菜品
		itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_VEGETABLE, "gms.item.scbbbh");// 收菜，背包变化
		itemApproachMap.put(LOG_ITEM_CHANGE_STEAL_VEGETABLE, "gms.item.scbbbh");// 收菜，背包变化
		itemApproachMap.put(LOG_HUOYUEDU_AWARD, "gms.item.hydlj");// 活跃度 领奖
		itemApproachMap.put(LOG_ITEM_CLAIM_REWARD_BY_VIP, "gms.item.viplqjl");// vip 领取奖励
		itemApproachMap.put(LOG_ITEM_CHANGE_ACQIEREMENT, "gms.item.yn");// 艺能
		itemApproachMap.put(LOG_ITEM_CHANGE_MEAT, "gms.item.item.rl");// 肉类 鸡肉 或 猪肉
		// //add--itemApproachMap
		// itemApproachMap.put(LOG_MONEY_CHANGE_CREATE_BUILD,
		// "gms.common.jzjz");
		// itemApproachMap.put(LOG_MONEY_CHANGE_BUY_DRESS, "gms.common.gmyf");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FABAO_UPGRADE,
		// "gms.common.jnsj");
		// itemApproachMap.put(LOG_MONEY_CHANGE_MAKE_EQUIP, "gms.common.zzzb");
		// itemApproachMap.put(LOG_MONEY_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpc");
		// itemApproachMap.put(LOG_MONEY_CHANGE_CHAHUA, "gms.common.chahua");
		// itemApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS, "gms.common.gztsfh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_GZTB_TS_CONSUME,
		// "gms.common.gztsxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzgh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FIGHT_FST, "gms.common.dltdl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LADDER,
		// "gms.common.dwjdl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_EQUIP_SALE, "gms.common.cszb");
		// itemApproachMap.put(LOG_MONEY_CHANGE_USERPROP_LIBAO,
		// "gms.common.sydjlb");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SCENE_REWARD,
		// "gms.common.gktgjl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjld");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SYSTEM_REWARD,
		// "gms.common.lqxtjl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FIGHT_GK, "gms.common.dyctg");
		// itemApproachMap.put(LOG_MONEY_CHANGE_MISSION, "gms.common.wcrwjl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FST_PH, "gms.common.ltphjl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SHOP_BUY_ITEM,
		// "gms.common.xcgmdjxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjlhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossgwxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SHIJIEBOSS_FIGHT,
		// "gms.common.sjbosszdhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FIRST_CHONGZHI,
		// "gms.common.scjlhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_ITEM_USE_MONEY_CARD,
		// "gms.common.syylkhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE, "gms.common.jhylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_QIANG_DAO, "gms.common.dqdhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_UPGRADE_STONE,
		// "gms.common.sjbs");
		// itemApproachMap.put(LOG_MONEY_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.ylgphdfl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_MAKE_CLOTHES,
		// "gms.common.fzhcxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_OPEN_BAG, "gms.common.kbb");
		// itemApproachMap.put(LOG_MONEY_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// itemApproachMap.put(LOG_MONEY_CHANGE_MAKE_MATERIAL,
		// "gms.common.zzcl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_DSTX, "gms.common.dstx");
		// itemApproachMap.put(LOG_MONEY_CHANGE_SAO_DNAG, "gms.common.sd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FENHONG, "gms.common.ghfh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_STONE_RONGHE,
		// "gms.common.bsrh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_FIGHT_LYT, "gms.common.dlyt");
		// itemApproachMap.put(LOG_MONEY_CHANGE_LYT_LVUP, "gms.common.lytuplv");
		// itemApproachMap.put(LOG_MONEY_CHANGE_LYT_PH, "gms.common.lytphhd");
		// itemApproachMap.put(LOG_MONEY_CHANGE_ZHENGHUN,
		// "gms.common.zhenghunylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_QIUHUN,
		// "gms.common.zhenghunqhylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_MARRIAGE_TREE,
		// "gms.common.llzgyylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME,
		// "gms.common.pxzyzylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_FANGWEN,
		// "gms.common.cwfwylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_HARVEST_XQ,
		// "gms.common.shxqyl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_QZ, "gms.common.qzzdylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET, "gms.common.pxzyzyl");
		// itemApproachMap.put(LOG_MONEY_CHANGE_LLZ_ADD_GY_COUNT,
		// "gms.common.llzgyylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_ZST_SCORE,
		// "gms.common.lftfsylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_ZST_BUY_ITEM,
		// "gms.common.lfbgmylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_QIANG_HUA,
		// "gms.common.pcqhylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_JING_JIE,
		// "gms.common.pcjjylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_STONE_FENJIE,
		// "gms.common.bsfjylxh");
		//
		// itemApproachMap.put(LOG_MONEY_CHANGE_LV_CHANGE,
		// "gms.common.sjjlylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_REWARD,
		// "gms.common.cwfwylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_CHEWEI_BE_REWARD,
		// "gms.common.cwbfwylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_NI_MING_HD,
		// "gms.common.nmhdylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.zbjlylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_CONSUME_GLOBAL,
		// "gms.common.kfzxhylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_XJZB_BET_GLOBAL,
		// "gms.common.kfyzylxh");
		// itemApproachMap.put(LOG_MONEY_CHANGE_DA_XIAO_TAI_JIAN,
		// "gms.common.dxtjylxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI, "gms.common.czsyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GZTB_SUODING,
		// "gms.common.gztbzwsdxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GZTB_TS,
		// "gms.common.gztbybtsxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GZTB_REFRESH,
		// "gms.common.gztbczxh");
		// //add--itemApproachMap
		// itemApproachMap.put(LOG_GOLD_CHANGE_CHANGE_NAME, "gms.common.gmxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_USERPROP_LIBAO,
		// "gms.common.klbhd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SCENE_REWARD,
		// "gms.common.gkjlhd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SYSTEM_REWARD,
		// "gms.common.xitongjiangli");
		// itemApproachMap.put(LOG_GOLD_CHANGE_MISSION, "gms.common.wcrwjl");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_HONGBAO,
		// "gms.common.gmhbxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_HONGBAO_GOT,
		// "gms.common.dkhbhd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUILDING_CREATE,
		// "gms.common.jzjzxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPEN_MAKE_MATERIAL_NUMBER,
		// "gms.common.kzzzclgz");
		// itemApproachMap.put(LOG_GOLD_CHANGE_FST_PH, "gms.common.fstphjlhd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_FST_ADD_FIGHT_COUNT,
		// "gms.common.fstgmcsxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_FST_CLEAR_CD,
		// "gms.common.fstqcd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUILD_GONGHUI,
		// "gms.common.jzghxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_CREATE_GONGHUI,
		// "gms.common.cjghxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPEN_HUAPENG,
		// "gms.common.kqhpxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_DRESS, "gms.common.gmzbxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_ITEM, "gms.common.scmdxxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_FLOWER,
		// "gms.common.jshdxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SPEED_UP_MATERIAL,
		// "gms.common.jsclxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_REFRESH_PRESENT_LIST_SINGLE,
		// "gms.common.sxdgdlxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_SAODANG,
		// "gms.common.gmsdxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ZHAOMU_SERVANT,
		// "gms.common.zmpcxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BAG_OPEN_GRID,
		// "gms.common.bbkgzxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_CHANGE_JOB, "gms.common.zzxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GRADE_HUDONG_FENGLU,
		// "gms.common.gphdfl");
		// itemApproachMap.put(LOG_GOLD_CHANGE_CHONGZHI_PRESENT,
		// "gms.common.czzsyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ITEM_USE_GOLD_CARD,
		// "gms.common.syybkhd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_FUHUO,
		// "gms.common.sjbossfuhuo");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_GUWU,
		// "gms.common.sjbossguwu");
		// itemApproachMap.put(LOG_GOLD_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.sjbossphjl");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_REFRESH_MISSION,
		// "gms.common.ghsxrw");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GONGHUI_SPEEDUP_MISSION,
		// "gms.common.ghjsrwxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.kbxxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUILDING_UPGRADE,
		// "gms.common.jzxqxh");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_VIP_ITEM,
		// "gms.common.gmvipdj");
		// itemApproachMap.put(LOG_GOLD_CHANGE_UPGRADE_BUILD,
		// "gms.common.xiuqi");
		// itemApproachMap.put(LOG_GOLD_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.ksgmcl");
		// itemApproachMap.put(LOG_GOLD_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.kjdt");
		// itemApproachMap.put(LOG_GOLD_CHANGE_YUE_KA, "gms.common.yk");
		// itemApproachMap.put(LOG_GOLD_CHANGE_JI_KA, "gms.common.jk");
		// itemApproachMap.put(LOG_GOLD_CHANGE_XSTM_BUY_ITEM,
		// "gms.common.xstm");
		// itemApproachMap.put(LOG_GOLD_CHANGE_CLAIM_BIND_REWARD,
		// "gms.common.bdsl");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ADD_LYT_TZ, "gms.common.lyttz");
		// itemApproachMap.put(LOG_GOLD_CHANGE_COMPLETE_LYT_SD,
		// "gms.common.lytsd");
		// itemApproachMap.put(LOG_GOLD_CHANGE_LYT_YB_CZ, "gms.common.lytcz");
		// itemApproachMap.put(LOG_GOLD_CHANGE_LYT_PH, "gms.common.lytph");
		// itemApproachMap.put(LOG_GOLD_PRESENT_GIFT, "gms.common.ldrwjjyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPT_BYU_CZJJ,
		// "gms.common.buyczjjyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_CZJJ,
		// "gms.common.czjjyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_QZ_FIGHT, "gms.common.qzzdyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPEN_BUILDING_CHEWEI,
		// "gms.common.cwkqyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_CHEWEI_SHANGCHA,
		// "gms.common.cwscyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_XIAO_QIE_WAR_GUWU,
		// "gms.common.xqwgwyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_COUNT,
		// "gms.common.buyxqwcyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_CATCH_XQ_CD_REFRESH,
		// "gms.common.xqsxcdyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ZST_CLEAR,
		// "gms.common.zstqcdyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ZST_REFRESH,
		// "gms.common.zstsxyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ZST_YB_REFRESH_SHOP,
		// "gms.common.zstsxsdyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ZST_BUY_ITEM,
		// "gms.common.zstshopyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_TREE_ADD_SPEED,
		// "gms.common.marriagetreejsyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_MARRIAGE_HUAI_YUN_SPEED,
		// "gms.common.marrigehuaiyunyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_HZ_CHANG_NAME,
		// "gms.common.hzchangenameyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_GH_EXIT_SPEED_UP,
		// "gms.common.ghexitcdyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_BUY_WHOLE_GUAJI_COUNT,
		// "gms.common.guajibuycountyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_OPT_CLAIM_XFFL,
		// "gms.common.xfflyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_FQ_HU_CUT_TIME,
		// "gms.common.fqhdcdyb");
		//
		// itemApproachMap.put(LOG_GOLD_CHANGE_LI_HUN, "gms.common.lihunyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.kfqrhdyb");
		// itemApproachMap.put(LOG_GOLD_CHANGE_ON_SHARE,
		// "gms.common.fengxiangyb");
		// itemApproachMap.put(LOG_RES_CHANGE_ON_SYS_HONGBAO,
		// "gms.common.xthbyb");
		// itemApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO_CONSUME,
		// "gms.common.mhbyb");
		// itemApproachMap.put(LOG_RES_CHANGE_ON_BUY_HONGBAO,
		// "gms.common.hunbaoyb");
		// itemApproachMap.put(LOG_RES_CHANGE_HUI_GUI, "gms.common.huiguiyb");
		// itemApproachMap.put(LOG_RES_CHANGE_ON_BIND_PHONE,
		// "gms.common.bdsjhyb");
		// //add--itemApproachMap
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhdyp");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_RANK,
		// "gms.common.ltjfpmhq");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_FIGHT,
		// "gms.common.ltjfzdhq");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_SYSTEM_REWARD,
		// "gms.common.ltjfxtjlhq");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_LTJF_DUIHUAN,
		// "gms.common.ltjfdhxh");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_SYSTEM_REWARD,
		// "gms.common.zbspxtjlhq");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DECOMPOSE,
		// "gms.common.zbspfjhq");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ZBSP_DUIHUAN,
		// "gms.common.zbspdhxh");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_FIGHT,
		// "gms.common.wjjfzdhq");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_SHOP_DUIHUAN,
		// "gms.common.wjjfshopuse");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_WJJF_MEIRI_PH,
		// "gms.common.wjjfdayrank");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ND_BAG_OPEN,
		// "gms.common.ndklb");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ND_SUBMIT_TRIBUTE,
		// "gms.common.ndgptj");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ND_XIU_LIAN,
		// "gms.common.ndxlxh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ND_SHIJIE_BOSS,
		// "gms.common.ndsjboss");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ND_XQW_RANK_REWARD,
		// "gms.common.ndxqzjl");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_BUILD,
		// "gms.common.frdcjjz");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_HS_BUILD,
		// "gms.common.frdhsjz");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CLEAR_BUILD,
		// "gms.common.frdqcjz");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_GS,
		// "gms.common.frdgphdgs");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_GRADE_HU_DONG_SS,
		// "gms.common.frdgphdss");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_CREATE_ANIMAL,
		// "gms.common.frdcjdw");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_REAP_ANIMAL,
		// "gms.common.frdshdw");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_YIJI_FLOWER,
		// "gms.common.frdsh1jh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_SANJI_FLOWER,
		// "gms.common.frdsh2jh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_MATERIAL,
		// "gms.common.frdshks");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_TAKE_CLOTH,
		// "gms.common.frdshh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_UPGRADE_BUILD,
		// "gms.common.frdxqjz");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_RAN_LIAO,
		// "gms.common.frdshrl");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DIAOYU,
		// "gms.common.frddiaoyu");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_BUIILD_REMOVE_CHILD,
		// "gms.common.frdjzupgradejs");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_FRD_DEL_ANIMAL,
		// "gms.common.frdfsdw");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_SH, "gms.common.mlzsh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_ZJ,
		// "gms.common.mlzgphdzj");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_GRADE_HUDONG_GF,
		// "gms.common.mlzgphdgf");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHANGE_DRESS,
		// "gms.common.mlzhyf");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_XQ_HUDONG_ZJ,
		// "gms.common.mlzhxqhd");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_ON_LOGIN,
		// "gms.common.mlzonlogin");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_MLZ_CHEWEI,
		// "gms.common.mlzonbaifang");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_UP_KEJI,
		// "gms.common.jzsjkj");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_DONATE, "gms.common.jzjx");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_TANGYUAN,
		// "gms.common.slzeatty");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_GRADE_HUDONG,
		// "gms.common.slzgphd");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_OPEN_GIFT,
		// "gms.common.slzeopenlb");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_ONLOGIN,
		// "gms.common.slzonlogin");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_BOSS_RANK,
		// "gms.common.slzonbossrank");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_MARRIAGE_TREE_FANGHUO,
		// "gms.common.slfanghuo");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_QZ_FIGHT,
		// "gms.common.slzqzzd");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_PX_FIGHT,
		// "gms.common.slzpxzrank");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_XQW_FIGHT,
		// "gms.common.slzxqzrank");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_LT_FIGHT,
		// "gms.common.slzleitairank");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SLZ_KJ_WEEK_RANK,
		// "gms.common.slzkejurank");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_SW, "gms.common.pxzsw");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_SW,
		// "gms.common.shopdhsw");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHNAGE_ZHUANGBAN_SUIPIAN_SHOP_DUIHUAN,
		// "gms.common.zbspdh");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_DUIHUAN,
		// "gms.common.lfbdh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_ZSB_ZST_SCORE,
		// "gms.common.lfbhd");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_SONG_HUA,
		// "gms.common.eazsh");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_HUAI_YUN,
		// "gms.common.eazhy");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_FQ_HD,
		// "gms.common.eazfqhd");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_EA_VALUE_TREE_GY,
		// "gms.common.eaztreegy");
		//
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_XJZB_KF_RY,
		// "gms.common.ryzhd");
		// itemApproachMap.put(LOG_CURRENCY_CHANGE_SHOP_RY, "gms.common.ryzdh");
		// //add--itemApproachMap
		// itemApproachMap.put(LOG_EXP_CHANGE_FIGHT_FST,
		// "gms.common.fstzdhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_FIGHT_LADDER,
		// "gms.common.wjzdhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_FIGHT_GK, "gms.common.gkzdhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_GUIDE_KEY_SETP,
		// "gms.common.xsydgjbhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_TAKE_FLOWER,
		// "gms.common.cjxhhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_TAKE_MATERIAL,
		// "gms.common.cjclhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_EXP_ITEM, "gms.common.sydjhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.tjldhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_ANIMAL_REAP,
		// "gms.common.shdwhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_HUA_PENG_FLOWER,
		// "gms.common.shhpxhhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_QING_AN, "gms.common.qahqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_MISSION, "gms.common.rwhdjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_DELETE_BUILD,
		// "gms.common.qczawhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_ANSWER_SECURITY_CODE,
		// "gms.common.huidayzmhqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_KEJU_DATI, "gms.common.kjdthqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_SAO_DANG,
		// "gms.common.saodanghqjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_SHOUHUO_MARRIAGE_TREE,
		// "gms.common.shllzjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_DIAOYU, "gms.common.diaoyujy");
		// itemApproachMap.put(LOG_EXP_CHANGE_HARVEST_XQ, "gms.common.shxqjy");
		//
		// itemApproachMap.put(LOG_EXP_CHANGE_XQW_RANK_REWARD,
		// "gms.common.xqzjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_CHEWEI, "gms.common.fangwenjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_KJ_WEEK_RANK_REWARD,
		// "gms.common.kjpmjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_LYT_LVUP, "gms.common.lltjy");
		//
		// itemApproachMap.put(LOG_EXP_CHANGE_HA_PENG_YI_JIAN,
		// "gms.common.hpyjshjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_CHU_CHONG,
		// "gms.common.chuchongjy");
		// itemApproachMap.put(LOG_EXP_CHANGE_JIAO_SHUI,
		// "gms.common.jiaoshuijy");
		// itemApproachMap.put(LOG_EXP_CHANGE_CHU_CAO, "gms.common.chucaojy");
		//
		// itemApproachMap.put(LOG_EXP_CHANGE_GM, "gms.common.gmmlhqjy");
		// //add--itemApproachMap
		// itemApproachMap.put(LOG_ITEM_CHANGE_AVATAR_CREATE,
		// "gms.common.item.jscj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SEX, "gms.common.item.gbxb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GZTB_TS,
		// "gms.common.item.gztbts");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GZTB_REWARD,
		// "gms.common.item.gztbjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USEPROP_LIBAO,
		// "gms.common.item.sylb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SCENE_REWARD,
		// "gms.common.item.fbjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_ADD,
		// "gms.common.item.zhzj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ITEM_CONVERT_DEDUCT,
		// "gms.common.item.zhkc");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FST_PH, "gms.common.item.fstph");
		// itemApproachMap.put(LOG_ITEM_CHANGE_LVUP, "gms.common.item.sjjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_MIANSHENG,
		// "gms.common.item.msjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GHFUBEN,
		// "gms.common.item.ghfbdl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HUAPENG_TAKEFLOWER,
		// "gms.common.item.hpcjhd");
		// itemApproachMap.put(LOG_ITEM_CHANGE_STONE_ADD,
		// "gms.common.item.zjbs");
		// itemApproachMap.put(LOG_ITEM_CHANGE_DRESS_BUY,
		// "gms.common.item.gmzb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_BUY_RMB_ITEM,
		// "gms.common.item.scgmdj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_DUIHUAN, "gms.common.item.dhwp");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FLOWER_SEED,
		// "gms.common.item.zhonghua");
		// itemApproachMap.put(LOG_ITEM_CHANGE_MAKE_EQUIP,
		// "gms.common.item.zzzb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_MAKE_METERIAL,
		// "gms.common.item.zzcl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_STONE_REMOVE,
		// "gms.common.item.ycbs");
		// itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER,
		// "gms.common.item.cjhd");
		// itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_MATERIAL,
		// "gms.common.item.cjcl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_STONE_UPGRADE,
		// "gms.common.item.bssj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_PROP_ZHENFA,
		// "gms.common.item.syzf");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GET_REWARD_PRESENT,
		// "gms.common.item.ldjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_REWARD,
		// "gms.common.item.yjhqxtjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK,
		// "gms.common.item.zdgkdl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GK_ZD,
		// "gms.common.item.zddl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_MISSION, "gms.common.item.rwjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_DECOMPOSE_EQUIP,
		// "gms.common.item.fjzb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SALE,
		// "gms.common.item.mczb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_CUT_TREE, "gms.common.item.ks");
		// itemApproachMap.put(LOG_ITEM_CHANGE_CHAHUA, "gms.common.item.ch");
		// itemApproachMap.put(LOG_ITEM_CHANGE_CHAHUA_SPEEDUP,
		// "gms.common.item.chjs");
		// itemApproachMap.put(LOG_ITEM_CHANGE_DEDUCT_USEPROP_ITEM,
		// "gms.common.item.sywpkc");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SUBMIT_PRESENTS_LIST,
		// "gms.common.item.wcldjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GRADE_HUDONG,
		// "gms.common.item.gphddjxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIRST_PAY_GIFT,
		// "gms.common.item.scjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_COUPON, "gms.common.item.dhmlb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ZHENFA_UP_LV,
		// "gms.common.item.zhenfasjxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_TRIBUTE_GET_AWARD,
		// "gms.common.item.gphdjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_CREATE_ANIMAL,
		// "gms.common.item.cjdw");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FEED_ANIMAL,
		// "gms.common.item.wydw");
		// itemApproachMap.put(LOG_ITEM_CHANGE_REAP_ANIMAL,
		// "gms.common.item.shdwjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ZENG_SONG_FLOWER,
		// "gms.common.item.zsxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HORN, "gms.common.item.dlb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_COMPOSE_FLOWER,
		// "gms.common.item.hcxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_TAKE_FLOWER_REWRAD,
		// "gms.common.item.shsjjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_JISHA,
		// "gms.common.item.sjbossjs");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SHIJIEBOSS_PH,
		// "gms.common.item.sjbossph");
		// itemApproachMap.put(LOG_ITEM_CHANGE_OPEN_BAO_XIANG,
		// "gms.common.item.kbxhd");
		// itemApproachMap.put(LOG_ITEM_CHANGE_BUY_VIP_ITEM,
		// "gms.common.item.gmvipdj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_QIANG_DA0_ALL_KILL_REWARD,
		// "gms.common.item.sgqdjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_MRRRIAGE_AGREE,
		// "gms.common.item.jhkdj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_YQM, "gms.common.item.yqhylb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_QUICK_BUY_ITEM_LIST,
		// "gms.common.item.dzhcksgm");
		// itemApproachMap.put(LOG_ITEM_CHANGE_OPEN_BUILD_PROP,
		// "gms.common.item.kjzb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_OPEN_ANIMAL_PROP,
		// "gms.common.item.kdwb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_MAKE_CLOTHES,
		// "gms.common.item.fzhc");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAODUIFU,
		// "gms.common.item.syzdf");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_ZHAOCUOFU,
		// "gms.common.item.syzcf");
		// itemApproachMap.put(LOG_ITEM_CHANGE_KEJU_DATI_REWARD,
		// "gms.common.item.kjdtjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XSTM_ADD_ITEM,
		// "gms.common.item.xstmgm");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SAO_DANG_LING,
		// "gms.common.item.sysdl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_ADD_STONE_COUNT,
		// "gms.common.item.zbkbsc");
		// itemApproachMap.put(LOG_ITEM_CHANGE_STONE_RONGHE,
		// "gms.common.item.bsrh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_SUB_PROP_CHANGE,
		// "gms.common.item.zbsxzh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_RED_TANG_YUAN,
		// "gms.common.item.syhgty");
		// itemApproachMap.put(LOG_ITEM_CHANGE_LYT_REWARD,
		// "gms.common.item.lytjl");
		//
		// itemApproachMap.put(LOG_ITEM_CHANGE_MARRIAGE_FANGHUO,
		// "gms.common.item.fanghuo");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XJZB_SHOP,
		// "gms.common.item.pxsd");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_OPEN_BAG_PROP_XYS,
		// "gms.common.item.kbbdjxys");
		// itemApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU, "gms.common.item.dyxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_DIAO_YU_SH,
		// "gms.common.item.dysh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_HUDONG,
		// "gms.common.item.xqhd");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XIAO_QI_VIEW,
		// "gms.common.item.lookxq");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SONGKE,
		// "gms.common.item.songkxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SHANG_CHA,
		// "gms.common.item.scxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS,
		// "gms.common.item.pxzjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XQZ_RANK,
		// "gms.common.item.xqzmjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_CROSS_HORN,
		// "gms.common.item.kflb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ZST_SCORE,
		// "gms.common.item.lftjf");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ZST_SHOP,
		// "gms.common.item.lftwp");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HUAI_YUN,
		// "gms.common.item.huaiyunxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_QIANG_HUA,
		// "gms.common.item.qianghua");
		// itemApproachMap.put(LOG_ITEM_CHANGE_JING_JIE,
		// "gms.common.item.jinjie");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_PLAYER,
		// "gms.common.item.ltwugive");
		// itemApproachMap.put(LOG_ITEM_CHANGE_STONE_FENJIE,
		// "gms.common.item.bsfj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XFYL, "gms.common.item.xfyl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_PROP,
		// "gms.common.item.hzjjxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_GUAJI_GK,
		// "gms.common.item.jqgj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FIGHT_WHOLE_GUAJI_GK,
		// "gms.common.item.zdgj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FQ_HQ,
		// "gms.common.item.fqhdrandom");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HZ_SKILL_UP,
		// "gms.common.item.hzjlsjxh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_REPLACE_EQUIP_FABAO,
		// "gms.common.item.thzbfb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ADD_EQUIP_FABAO,
		// "gms.common.item.zjzbfb");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SYSTEM_FIX_ITEM,
		// "gms.common.item.xtxz");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GM_ADD, "gms.common.item.gmff");
		//
		// itemApproachMap.put(LOG_ITEM_CHANGE_NM_MAIL_LOOK,
		// "gms.common.item.nmyjck");
		// itemApproachMap.put(LOG_ITEM_CHANGE_EQUIP_JING_LIAN,
		// "gms.common.item.zbjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XJZB_TTS_GLOBAL,
		// "gms.common.item.kfttsjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_XIU_QI,
		// "gms.common.item.hpxq");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HUA_PENG_LV_UP,
		// "gms.common.item.hpsj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XIE_YI_SHU,
		// "gms.common.item.xylh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_XIU_QI, "gms.common.item.lhxq");
		// itemApproachMap.put(LOG_ITEM_CHANGE_SEVEN_DAY_ONLINE,
		// "gms.common.item.lhqtbsx");
		// itemApproachMap.put(LOG_ITEM_CHANGE_ON_QTHD_BUY_ITEM,
		// "gms.common.item.kfqrhd");
		// itemApproachMap.put(LOG_ITEM_CHANGE_BUILD_CHOU_JIAN,
		// "gms.common.item.jzcj");
		// itemApproachMap.put(LOG_ITEM_CHANGE_BUILD_DUI_HUAN,
		// "gms.common.item.jzdh");
		// itemApproachMap.put(LOG_ITEM_CHANGE_CHANGE_NAME,
		// "gms.common.item.gmk");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GH_CHANGE_NAME,
		// "gms.common.item.pxgmk");
		// itemApproachMap.put(LOG_ITEM_CHANGE_USE_LLZ_GUO_SHI,
		// "gms.common.item.lzzgs");
		// itemApproachMap.put(LOG_ITEM_CHANGE_GUA_JI_LING,
		// "gms.common.item.sygjl");
		// itemApproachMap.put(LOG_ITEM_CHANGE_TOU_HUA,
		// "gms.common.item.touhua");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FANG_CAO,
		// "gms.common.item.fanghua");
		// itemApproachMap.put(LOG_ITEM_CHANGE_FANG_CHONG,
		// "gms.common.item.fangchong");
		// itemApproachMap.put(LOG_ITEM_CHANGE_HS_TOUHUA,
		// "gms.common.item.hsjth");
	}

	public final static Map<String, String> csmbehvMap;
	static {
		csmbehvMap = buildOtherBehvOptionMap();
	}

	public final static List<Integer> ITEM_ID_LIST = Arrays.asList(new Integer[] { 20300, 20301, 20302, 20501, 20502,
			20503, 20504, 20400, 20401, 20403, 20201, 20202, 20203, 20204, 80009, 80010, 80011, 80012, 21000, 21001,
			22016, 20205, 22022, 20611, 20612, 20613, 22025, 20614, 20206, 20207, 94061, 20615, 20208, 60000, 60100,
			60200, 60300, 60400, 60500, 20209, 20210, 94054, 94055, 94056, 94057, 94058, 94059, 22030, 94060, 20216,
			20215, 90000, 90001, 90002, 90003, 90004, 90005, 90006, 90007, 90008, 90300, 90301, 90302, 90303, 90304,
			90305, 90306, 90307, 90308, 90309, 90310, 90311, 90400, 90401, 90402, 90403, 90404, 90405, 90406, 90407,
			90408, 90409, 90312, 90313, 90314, 90315, 90316, 90317, 90318, 90319, 90320, 90321, 20046, 51000, 51001,
			51002, 51003, 51004, 51005, 51006, 51007 });

	public static String decodeParameter(String v, String... encodings) {
		if (v == null) {
			return null;
		}
		String encoding = ArrayUtils.isEmpty(encodings) ? "UTF-8" : encodings[0];
		return DataUtils.encodeString(v, encoding);
	}

	public static int parseRequestInt(HttpServletRequest request, String paramName, int defaultValue) {
		String sParamValue = request.getParameter(paramName);
		int paramValue = defaultValue;
		if (StringUtils.isNotEmpty(sParamValue)) {
			paramValue = Integer.valueOf(sParamValue);
		}
		return paramValue;
	}

	public static String parseRequestString(HttpServletRequest request, String paramName, String defaultValue) {
		String sParamValue = request.getParameter(paramName);
		if (null != sParamValue) {
			return sParamValue;
		}
		return defaultValue;
	}

	/**
	 * @param request
	 * @param paramName
	 * @param format
	 * @return
	 */
	// {"yyyy-MM","yyyyMM","yyyy/MM", "yyyyMMdd","yyyy-MM-dd","yyyy/MM/dd",
	// "yyyyMMddHHmmss", , "yyyy/MM/dd HH:mm:ss"};
	public static Date parseRequestDate(HttpServletRequest request, String paramName, String format) {
		String sParamValue = request.getParameter(paramName);
		String[] formats = null;
		if (format == null) {
			formats = new String[] { "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH", "yyyy-MM-dd" };
		} else {
			formats = new String[] { format };
		}
		if (StringUtils.isNotEmpty(sParamValue)) {
			try {
				return DateUtils.parseDate(StringUtils.trim(sParamValue), formats);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		Date date = new Date();
		date.setTime(0);
		return date;
	}

	public static Date parseDate(String valus, String format) {
		String[] formats = null;
		if (format == null) {
			formats = new String[] { "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH", "yyyy-MM-dd" };
		} else {
			formats = new String[] { format };
		}
		if (StringUtils.isNotEmpty(valus)) {
			try {
				return DateUtils.parseDate(valus, formats);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		Date date = new Date();
		date.setTime(0);
		return date;
	}

	public static Pair<Date, Date> parseDateRange(String valus, String format) {
		if (StringUtils.isEmpty(valus)) {
			return Pair.newInstance(new Date(), new Date());
		}
		String[] vs = StringUtils.splitByWholeSeparator(valus, "-", 2);
		if (vs.length != 2) {
			return Pair.newInstance(new Date(), new Date());
		}
		return Pair.newInstance(parseDate(vs[0], format), parseDate(vs[1], format));
	}

	public static boolean parseRequestBool(HttpServletRequest request, String paramName, boolean defaultValue) {
		String sParamValue = request.getParameter(paramName);
		boolean paramValue = defaultValue;
		if (StringUtils.isNotEmpty(sParamValue)) {
			paramValue = Boolean.valueOf(sParamValue);
		}
		return paramValue;
	}

	public static long parseRequestLong(HttpServletRequest request, String paramName, long defaultValue) {
		String sParamValue = request.getParameter(paramName);
		long paramValue = defaultValue;
		if (StringUtils.isNotEmpty(sParamValue)) {
			try {
				paramValue = Long.valueOf(sParamValue);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		return paramValue;
	}

	public static void setStaticModel(Class<?> clz, Map<String, Object> map) {
		String name = clz.getSimpleName();
		map.put(name, getStaticModel(clz));
	}

	public static void setStaticModel(Class<?> clz, HttpServletRequest request) {
		String name = clz.getSimpleName();
		request.setAttribute(name, getStaticModel(clz));
	}

	public static Object getStaticModel(Class<?> clz) {
		BeansWrapper wrapper = BeansWrapper.getDefaultInstance();
		try {
			return wrapper.getStaticModels().get(clz.getName());
		} catch (TemplateModelException e) {
			e.printStackTrace();
		}
		return null;
	}

	@JsExportMethod
	public static String formatDate(long pastTime, String formatStr) {
		if (pastTime == 0)
			return "";
		return DataUtils.formatDate(pastTime, formatStr);
	}

	public static int getYear(Date date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return cl.get(Calendar.YEAR);
	}

	public static int getMonth(Date date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return cl.get(Calendar.MONTH) + 1;
	}

	public static int getDay(Date date) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		return cl.get(Calendar.DAY_OF_MONTH);
	}

	public static <V> V parseRequestObject(HttpServletRequest request, final Class<V> templateClass) {
		V obj = null;
		try {
			obj = templateClass.newInstance();
			List<Field> fields = ReflectionUtils.getAllDeclaredFields(obj.getClass(), true);
			String column;
			String value;
			String[] vs1;
			for (Field field : fields) {
				column = field.getName();
				value = parseRequestString(request, column, "");
				if (StringUtils.isBlank(value)) {
					value = parseRequestString(request, "data[" + column + "]", "");
				}
				value = value.trim();
				if (field.getType().isArray()) {
					vs1 = StringUtils.splitByWholeSeparatorPreserveAllTokens(value, "");
					trimStrings(vs1);
					BeanUtils.setProperty(obj, column, vs1);
				} else {
					BeanUtils.setProperty(obj, column, value);
				}

			}
		} catch (Exception e) {
		}
		return obj;
	}

	private static void trimStrings(String[] values) {
		for (int i = 0; i < values.length; ++i) {
			values[i] = values[i].trim();
		}
	}

	public static long addDay(long time, int dayCount) {
		Calendar cl = Calendar.getInstance();
		cl.setTimeInMillis(time);
		cl.add(Calendar.DAY_OF_MONTH, dayCount);
		return cl.getTimeInMillis();
	}

	public static long addMonth(long time, int monthCount) {
		Calendar cl = Calendar.getInstance();
		cl.setTimeInMillis(time);
		cl.add(Calendar.MONTH, monthCount);
		return cl.getTimeInMillis();
	}

	public static Pair<Long, Long> getMonthTime(long time) {
		Calendar cl = Calendar.getInstance();
		cl.setTimeInMillis(time);
		cl = DateUtils.truncate(cl, Calendar.MONTH);
		long startTime = cl.getTimeInMillis();
		cl.setTime(DateUtils.addMonths(new Date(startTime), 1));
		long endTime = cl.getTimeInMillis() - 1000;
		long cur = System.currentTimeMillis();
		endTime = endTime > cur ? cur : endTime;
		return Pair.newInstance(startTime, endTime);
	}

	public static int getCurMonth() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.MONTH) + 1;
	}

	public static long getMonthFirstDay(int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	@SuppressWarnings("unchecked")
	public static <T> T[] convertArray(Object array, Class<T> compType) {
		if (array == null) {
			return null;
		}
		int len = Array.getLength(array);
		Object objs = Array.newInstance(compType, len);
		Object obj;
		if (compType.isArray()) {
			for (int i = 0; i < len; ++i) {
				obj = Array.get(array, i);
				Array.set(objs, i, convertArray(obj, compType.getComponentType()));
			}
		} else if (compType.isPrimitive() || Number.class.isAssignableFrom(compType)) {
			for (int i = 0; i < len; ++i) {
				obj = Array.get(array, i);
				Array.set(objs, i, convertPrimitive(obj, compType));
			}
		} else {
			System.arraycopy(array, 0, objs, 0, len);
		}
		return (T[]) objs;
	}

	public static Object convertPrimitive(Object v, Class<?> clazz) {
		if (Boolean.TYPE.equals(clazz) || Boolean.class.equals(clazz)) {
			return v == null ? false : ((Boolean) v).booleanValue();
		} else if (Character.TYPE.equals(clazz) || Character.class.equals(clazz)) {
			return v == null ? 0 : ((Character) v).charValue();
		} else if (Byte.TYPE.equals(clazz) || Byte.class.equals(clazz)) {
			return v == null ? 0 : ((Number) v).byteValue();
		} else if (Short.TYPE.equals(clazz) || Short.class.equals(clazz)) {
			return v == null ? 0 : ((Number) v).shortValue();
		} else if (Integer.TYPE.equals(clazz) || Integer.class.equals(clazz)) {
			return v == null ? 0 : ((Number) v).intValue();
		} else if (Long.TYPE.equals(clazz) || Long.class.equals(clazz)) {
			return v == null ? 0 : ((Number) v).longValue();
		} else if (Float.TYPE.equals(clazz) || Float.class.equals(clazz)) {
			return v == null ? 0 : ((Number) v).floatValue();
		} else if (Double.TYPE.equals(clazz) || Double.class.equals(clazz)) {
			return v == null ? 0 : ((Number) v).doubleValue();
		}
		return v;
	}

	public static void println(Object o) {
		System.out.println(o);
	}

	public static double halfUpScaleToDouble(double val, int scale) {
		if (scale < 0) {
			return val;
		}

		BigDecimal bd = new BigDecimal(val).setScale(scale, BigDecimal.ROUND_HALF_UP);

		return bd.doubleValue();
	}

	public static long halfUpScaleToLong(double val) {
		return new Double(halfUpScaleToDouble(val, 0)).longValue();
	}

	public static int halfUpScaleToInt(double val) {
		return new Double(halfUpScaleToDouble(val, 0)).intValue();
	}

	public static float halfUpScaleToFloat(double val, int scale) {
		return new Double(halfUpScaleToDouble(val, scale)).floatValue();
	}

	public static String getPathInfoNoHead(String uri, String servletPath) {
		return StringUtils.substring(uri, servletPath.length() + 1);
	}

	public static <T> String[][] toJsonArray(List<T> rawDatas) {
		if (CollectionUtils.isEmpty(rawDatas)) {
			return new String[0][0];
		}
		int modifiers = Modifier.TRANSIENT | Modifier.STATIC;
		String[][] ret = new String[rawDatas.size()][];
		try {
			for (int i = 0; i < rawDatas.size(); i++) {
				T rd = rawDatas.get(i);
				List<Field> fs = ReflectionUtils.getAllDeclaredFields(rd.getClass(), true);
				List<String> fsArr = new ArrayList<String>(fs.size());
				for (int j = 0; j < fs.size(); j++) {
					Field f = fs.get(j);
					f.setAccessible(true);
					if ((modifiers & f.getModifiers()) != 0) {
						continue;
					}
					Object v = f.get(rd);
					fsArr.add(v == null ? (String) v : v.toString());
				}
				ret[i] = fsArr.toArray(new String[0]);
			}
		} catch (Exception e) {
			ret = new String[0][0];
			LoggerUtils.error(e);
		}
		return ret;
	}

	public static Object[] buildCommonSqlData(int serverId, String oprGroup, long startTime, long endTime, int limit,
			long offset, Map<String, Object> extraParams, String... orderStr) {
		StringBuilder qrySb = new StringBuilder("1 = 1");
		List<Object> qryParams = new ArrayList<Object>();
		if (serverId > 0) {
			qrySb.append(" and serverId = ?");
			qryParams.add(serverId);
		}
		if (StringUtils.isNotBlank(oprGroup)) {
			qrySb.append(" and oprGroup = ?");
			qryParams.add(oprGroup);
		}
		if (startTime > 0) {
			qrySb.append(" and createTime >= ?");
			qryParams.add(startTime);
		}
		if (endTime > 0) {
			qrySb.append(" and createTime < ?");
			qryParams.add(endTime);
		}
		if (extraParams != null) {
			for (String key : extraParams.keySet()) {
				qrySb.append(" and " + key + " = ?");
				qryParams.add(extraParams.get(key));
			}
		}

		String countSql = qrySb.toString();
		Object[] countParams = qryParams.toArray();
		if (ArrayUtils.isNotEmpty(orderStr)) {
			qrySb.append(" " + orderStr[0]);
		} else {
			qrySb.append(" order by serverId, createTime desc");
		}

		if (limit > 0) {
			qrySb.append(" limit ? offset ?");
			qryParams.add(limit);
			qryParams.add(offset);
		}
		String dataSql = qrySb.toString();
		Object[] dataParams = qryParams.toArray();
		return new Object[] { countSql, countParams, dataSql, dataParams };
	}

	@JsExportMethod
	public static String getItemName(long itemId) {
		LMap lm = ItemData.data.getMap((int) itemId);
		if (lm == null) {
			return "NA";
		}
		return lm.getString("name", "NA");
	}

	@JsExportMethod
	public static String getMallItemName(int itemId) {

		LMap lm = ItemData.data.getMap((int) itemId);
		if (lm == null) {
			return "NA";
		}
		return lm.getString("name", "NA");
	}

	@JsExportMethod
	public static String getResApproach(int resId, int app) {
		switch (resId) {
		case ITEM_ID_MONEY:
			return DataUtils.getMapString(moneyApproachMap, app, "NA[" + app + "]");
		case ITEM_ID_GOLD:
			return DataUtils.getMapString(goldApproachMap, app, "NA[" + app + "]");
		case ITEM_ID_EXP:
			return DataUtils.getMapString(expApproachMap, app, "NA[" + app + "]");
		default:
			return DataUtils.getMapString(currencyApproachMap, app, "NA[" + app + "]");
		}
	}

	@JsExportMethod
	public static String getResType(int type) {
		switch (type) {
		case RES_OUT:
			return "gms.youxi.chanchu";
		case RES_IN:
			return "gms.youxi.chanru";
		default:
			break;
		}
		return "NA";
	}

	@JsExportMethod
	public static String getResName(int resId) {
		switch (resId) {
		case ITEM_ID_MONEY:
			return "gms.wjgl.yinliang";
		case ITEM_ID_GOLD:
			return "gms.wjgl.yuanbao";
		case ITEM_ID_EXP:
			return "gms.youxi.jinyan";
		case ITEM_ID_LEITAI_POINT:
			return "gms.wjgl.ltjf";
		case ITEM_ID_ZHUANGBEI_SUIPIAN:
			return "gms.wjgl.zbsp";
		case ITEM_ID_LEIJI_GOLD:
			return "gms.wjgl.vipjifeng";
		case ITEM_ID_LADDER_XING:
			return "gms.wjgl.wjjfx";
		case ITEM_ID_YU_PEI_QING_SHUI:
			return "gms.wjgl.qsyp";
		case ITEM_ID_YU_PEI_FEI_CUI:
			return "gms.wjgl.fcyp";
		case ITEM_ID_YU_PEI_YANG_ZHI:
			return "gms.wjgl.yzyp";
		case ITEM_ID_YU_PEI_JIN_XINA_YU:
			return "gms.wjgl.jxyyp";
		case ITEM_ID_NEI_DAN:
			return "gms.wjgl.nd";
		case ITEM_ID_FAN_RONG_DU:
			return "gms.wjgl.frd";
		case ITEM_ID_MEI_LI:
			return "gms.wjgl.ml";
		case ITEM_ID_YOU_HAO_DU:
			return "gms.wjgl.yhd";
		case ITEM_ID_EN_AI_ZHI:
			return "gms.wjgl.eaz";
		case ITEM_ID_JIN_ZHUAN:
			return "gms.wjgl.jinzhuan";
		case ITEM_ID_PAIXI_JINZHUAN:
			return "gms.wjgl.paixijinzhuan";
		case ITEM_ID_SHI_LI_ZHI:
			return "gms.wjgl.shilizhi";
		case ITEM_ID_SW:
			return "gms.wjgl.swvalue";
		case ITEM_ID_ZHUANGBAN_SUIPIAN:
			return "gms.wjgl.zbspvalue";
		case ITEM_ID_ZSB:
			return "gms.wjgl.lfbvalue";
		case ITEM_ID_RYZ:
			return "gms.wjgl.ryzvalue";
		default:
			break;
		}
		return "NA";
	}

	@JsExportMethod
	public static String getGkName(long guankaId) {
		LMap lm = GuankaMonsterData.data.getMap((int) guankaId);
		if (lm == null) {
			return "NA";
		}
		LMap lm2 = GuankaBaseData.data.getMap(lm.getInt("guankaBaseId", 0));
		if (lm2 == null) {
			return "NA";
		}
		return lm2.getString("name", "NA");
	}

	@JsExportMethod
	public static String getExpApproach(int app) {
		return DataUtils.getMapString(expApproachMap, app, "NA");
	}

	@JsExportMethod
	public static String getBehv(String behv) {
		return DataUtils.getMapString(csmbehvMap, behv, "NA");
	}

	@JsExportMethod
	public static String getRealTimeKeyName(String keyValue) {
		int key = Integer.valueOf(keyValue);
		return "key";
	}

	@JsExportMethod
	public static String getRealTimeType(int rtType) {
		return DataUtils.getMapString(realTimeTypeMap, rtType, "NA");
	}

	public static Map<Integer, String> getRealTimeTypeList() {
		return realTimeTypeMap;
	}

	public static boolean isForbidden(int userGroup) {
		return userGroup == USER_GROUP_FORBIDDEN;
	}

	@JsExportMethod
	public static String getXsydDesc(int guideId) {
		LMap lm = XsydData.data.getMap(guideId);
		if (lm == null) {
			return "NA";
		}
		return lm.getString("describe", "NA");
	}

	public static String getSecurityTypeInfo(String type) {
		if (type == null) {
			return "";
		}
		if (type.equals(FsGameGmsConst.SECURITY_TYPE_ADMIN)) {
			return "gms.aqgl.guanliyuan";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_DATA)) {
			return "gms.aqgl.cksj";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_KF)) {
			return "gms.aqgl.kefu";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_YW)) {
			return "gms.aqgl.yunwei";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_CHENGXU)) {
			return "gms.aqgl.chengxu";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_YUNYING)) {
			return "gms.aqgl.yunying";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_ANQUAN)) {
			return "gms.aqgl.anquan";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_SUPER_ADMIN)) {
			return "gms.aqgl.chaojiguanliyuan";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_SUPER_YUNYING)) {
			return "gms.aqgl.chaojiyunying";
		} else if (type.equals(FsGameGmsConst.SECURITY_TYPE_SHICHANG)) {
			return "gms.aqgl.shichang";
		}

		return "";
	}

	public static List<String> getResListFromRole(String role) {
		if (!aclMap.containsKey(role)) {
			return Collections.emptyList();
		}
		return aclMap.get(role);
	}

	@JsExportMethod
	public static String getCouponGiftName(String giftType) {
		CouponCategroyService couponCategroyService = (CouponCategroyService) applicationContext
				.getBean("couponCategroyService");
		CouponCategroy cc = couponCategroyService.getCouponCategroyByType(giftType);
		return cc == null ? "NA" : cc.getGiftName();
	}

	@JsExportMethod
	public static Object round(Object n, int scale) {
		if (n == null) {
			return n;
		}

		// DecimalFormat df = new DecimalFormat("#,##0.00");//保留两位小数且不用科学计数法
		// saleUnilateImport.setPhone(df.format(row.getCell(1).getNumericCellValue()));

		Class<?> t = n.getClass();
		if (t.isPrimitive() || Number.class.isAssignableFrom(t)) {
			String patt = "0.";
			for (int i = 0; i < scale; i++) {
				patt += "0";
			}
			System.out.println("patt=" + patt);
			DecimalFormat df = new DecimalFormat(patt);
			return df.format(n);
		}
		return n;
	}

	@JsExportMethod
	public static Object percent(Object n, int scale) {
		NumberFormat defaultFormat = NumberFormat.getPercentInstance();
		BigDecimal bd = new BigDecimal(n.toString()).setScale(scale + 2, BigDecimal.ROUND_HALF_UP);
		Object r1 = bd.doubleValue();
		defaultFormat.setMinimumFractionDigits(scale);
		return defaultFormat.format(r1);
	}

	public static long getTimeInDay00(Date curDate) {
		return getTimeInDayAtHour(curDate, 0);
	}

	public static long getTimeInDayAtHour(Date curDate, int hour) {
		return getTimeInDayAtHourMinute(curDate, hour, 0);
	}

	public static long getTimeInDayAtHourMinute(Date curDate, int hour, int minute) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(curDate);
		cal.set(Calendar.HOUR_OF_DAY, hour);
		cal.set(Calendar.MINUTE, minute);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTimeInMillis();
	}

	public static boolean startsWithAny(String string, String[] searchStrings) {
		if (StringUtils.isEmpty(string) || ArrayUtils.isEmpty(searchStrings)) {
			return false;
		}
		for (int i = 0; i < searchStrings.length; i++) {
			String searchString = searchStrings[i];
			if (StringUtils.startsWithIgnoreCase(string, searchString)) {
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public static Map<String, Object> getRequestParameterMap(HttpServletRequest request, HttpServletResponse response) {
		Map<String, String[]> pms = request.getParameterMap();
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("request", request);
		result.put("response", response);
		if (MapUtils.isEmpty(pms)) {
			return result;
		}
		for (String key : pms.keySet()) {
			String[] values = pms.get(key);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < values.length; i++) {
				sb.append(",").append(values[i]);
			}
			result.put(key, sb.substring(1));
		}
		return result;
	}

	public static String md5low(String input) {
		return new String(Hex.encodeHex(DigestUtils.md5(input), true));
	}

	/**
	 * 从键值序列的参数列表生成映射表
	 * 
	 * @param args
	 * @return
	 */
	public static Map<String, Object> createHashMap(Object... args) {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < args.length; i += 2) {
			map.put((String) args[i], args[i + 1]);
		}
		return map;
	}

	@JsExportMethod
	public static String getItemApproach(int app) {
		return DataUtils.getMapString(itemApproachMap, app, "NA[" + app + "]");
	}

	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
	}

	public static void main1(String[] args) throws IOException {
		// classpath:application-context.xml
		// classpath:application-context-dao.xml
		// classpath:application-context-web.xml
		// classpath:application-context-schedule.xml
		//
		// @SuppressWarnings("resource")
		// ClassPathXmlApplicationContext ctx = new
		// ClassPathXmlApplicationContext(
		// new String[] { "classpath*:application-context*.xml" });
		// ctx.registerShutdownHook();
		// OptReportMailService optReportMailService = (OptReportMailService)
		// ctx.getBean("optReportMailService");
		// long currTime00 = FsGameGmsUtils.getTimeInDay00(new Date());
		// // 拿上一天0点
		// currTime00 = currTime00 - DateUtils.MILLIS_PER_DAY;
		// optReportMailService.sendAllMail(currTime00);

		//
		Properties props = new Properties();
		props.load(new InputStreamReader(
				Thread.currentThread().getContextClassLoader().getResourceAsStream("i18n_zh_CN.properties"), "UTF-8"));
		Map<String, String> m_props = new HashMap<String, String>();

		List<String> m_keys = new ArrayList<String>();
		for (Map.Entry<Object, Object> e : props.entrySet()) {
			m_props.put(e.getValue().toString(), e.getKey().toString());
			m_keys.add(e.getValue().toString());
		}

		Collections.sort(m_keys, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});

		System.out.println(props.size());
		System.out.println(m_props.size());

		Collection<File> files = FileUtils.listFiles(
				new File("/Users/apple/Documents/workspace_java/fsgame-gms/src/main/webapp/tmpl"),
				new String[] { "ftl" }, true);
		for (File f : files) {
			String str = FileUtils.readFileToString(f, "utf-8");
			for (String e : m_keys) {
				str = str.replaceAll(e, "<@spring.message \"" + m_props.get(e) + "\"/>");
			}
			FileUtils.writeStringToFile(f, str, "utf-8");
			System.out.println(f.getPath());
		}

		for (Map.Entry<Integer, String> s : itemApproachMap.entrySet()) {
			System.out.println(s.getKey() + "=" + props.get(s.getValue()));
		}

	}

	public static String getServerAndOprGroupIdentify(int serverId, String oprGroup) {
		return oprGroup + "_" + serverId;
	}

	private static Map<String, String> buildOtherBehvOptionMap() {
		Map<String, String> ret = new LinkedHashMap<String, String>();
		for (Integer i : LOG_GOLD_LIST) {
			ret.put("gold_" + i, goldApproachMap.get(i));
		}
		return ret;
	}

	public static Map<String, String> getOtherBehvOptionMap() {
		return csmbehvMap;
	}

	public static List<Integer> getItemIdOptionList() {
		return ITEM_ID_LIST;
	}

}
