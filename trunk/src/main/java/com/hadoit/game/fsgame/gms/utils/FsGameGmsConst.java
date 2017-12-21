package com.hadoit.game.fsgame.gms.utils;


public class FsGameGmsConst {
	public static final int SERVER_STATE_CLOSE = 0;
	public static final int SERVER_STATE_OPEN = 1;

	public static final int DEFAULT_LIST_SIZE = 10;

	public static final int QRY_DATE_DAY = 1;
	public static final int QRY_DATE_WEEK = 2;
	public static final int QRY_DATE_MONTH = 3;


	public static final int MSG_TYPE_COMMON = 1;
	public static final int MSG_TYPE_REWARD = 2;
	
	public static final int USER_EVENT_TYPE_CHANGE_PW = 1;
	
	public static final String SECURITY_TYPE_SUPER_ADMIN = "superadmin"; // 超级管理员
	public static final String SECURITY_TYPE_SUPER_YUNYING = "superyunying"; // 超级运营
	
	public static final String SECURITY_TYPE_ADMIN = "admin";	// 管理权限 
	public static final String SECURITY_TYPE_DATA = "data";		// 数据权限
	public static final String SECURITY_TYPE_KF = "kf";			// 客服权限
	public static final String SECURITY_TYPE_YW = "yw";			// 运维权限
	public static final String SECURITY_TYPE_CHENGXU = "chengxu";			// 程序员权限
	public static final String SECURITY_TYPE_YUNYING = "yunying";			// 运营权限
	public static final String SECURITY_TYPE_ANQUAN = "anquan";			// 安全权限
	public static final String SECURITY_TYPE_SHICHANG = "shichang";	
	
	public static final String DWR_PUBLIC_ROLE = "dwr_public_role";			// dwr的权限释放给所有登录用户
	
	
	
	public static final int VERIFY_STATE_PENDING = 0; //审核中
	public static final int VERIFY_STATE_ALLOW = 1; //通过
	public static final int VERIFY_STATE_REFUSE = -1; //拒绝
	
	public static final String REPORT_NAME_OPT_DAY = "REPORT_NAME_OPT_DAY";
	public static final String REPORT_NAME_OPT_CHARGE = "REPORT_NAME_OPT_CHARGE";
	public static final String REPORT_NAME_OPT_GLOBAL = "REPORT_NAME_OPT_GLOBAL";
	public static final String REPORT_NAME_OPT_ONLINE = "REPORT_NAME_OPT_ONLINE";
	public static final String REPORT_NAME_OPT_RETENTION = "REPORT_NAME_OPT_RETENTION";
	public static final String REPORT_NAME_OPT_CHURN = "REPORT_NAME_OPT_CHURN";
	
	public static final String REPORT_NAME_GS_REALTIME = "REPORT_NAME_GS_REALTIME";
	public static final String REPORT_NAME_GS_CSMBEHV = "REPORT_NAME_GS_CSMBEHV";
	public static final String REPORT_NAME_GS_GUIDE = "REPORT_NAME_GS_GUIDE";
	public static final String REPORT_NAME_GS_ITEM = "REPORT_NAME_GS_ITEM";
	public static final String REPORT_NAME_GS_RESALL = "REPORT_NAME_GS_RESALL";
	public static final String REPORT_NAME_GS_GUANKA = "REPORT_NAME_GS_GUANKA";
	public static final String REPORT_NAME_GS_EXP = "REPORT_NAME_GS_EXP";
	
	public static final String REPORT_NAME_COUPON = "REPORT_NAME_COUPON";
	
	public static final String MAIL_REPORT_NAME_OPT_GLOBAL = "MAIL_REPORT_NAME_OPT_GLOBAL";
	public static final String MAIL_REPORT_NAME_OPT_GLOBAL_FOR_OPR = "MAIL_REPORT_NAME_OPT_GLOBAL_FOR_OPR";
	public static final String MAIL_REPORT_NAME_OPT_GLOBAL_FOR_ALL = "MAIL_REPORT_NAME_OPT_GLOBAL_FOR_ALL";
	public static final String MAIL_REPORT_NAME_OPT_DAY = "MAIL_REPORT_NAME_OPT_DAY";
	public static final String MAIL_REPORT_NAME_OPT_DAY_FOR_OPR = "MAIL_REPORT_NAME_OPT_DAY_FOR_OPR";
	public static final String MAIL_REPORT_NAME_OPT_DAY_FOR_ALL = "MAIL_REPORT_NAME_OPT_DAY_FOR_ALL";
	
	public static final String SCRIPT_REPORT_TRANSFER_TIME = "utils.formatDate(val, 'yyyy-MM-dd')";
	public static final String SCRIPT_REPORT_TRANSFER_TIME2 = "utils.formatDate(val, 'yyyy-MM-dd HH:mm')";
	public static final String SCRIPT_REPORT_TRANSFER_GUIDE = "utils.getXsydDesc(val)";
	public static final String SCRIPT_REPORT_TRANSFER_GUANKA = "utils.getGkName(val)";
	public static final String SCRIPT_REPORT_TRANSFER_EXP_APPROACH = "utils.getExpApproach(val)";
	public static final String SCRIPT_REPORT_TRANSFER_ITEM = "utils.getItemName(val)";
	public static final String SCRIPT_REPORT_TRANSFER_RES_TYPE = "utils.getResType(val)";
	public static final String SCRIPT_REPORT_TRANSFER_RES_APPROACH = "utils.getResApproach(val)";
	public static final String SCRIPT_REPORT_TRANSFER_RES_NAME = "utils.getResName(val)";
	public static final String SCRIPT_REPORT_TRANSFER_BEHV = "utils.getBehv(val)";
	public static final String SCRIPT_REPORT_TRANSFER_RTTYPE = "utils.getRealTimeType(val)";
	public static final String SCRIPT_REPORT_TRANSFER_COUPONGIFTNAME = "utils.getCouponGiftName(val)";
	public static final String SCRIPT_REPORT_TRANSFER_ROUND2 = "utils.round(val, 2)";
	public static final String SCRIPT_REPORT_TRANSFER_PERCENT2 = "utils.percent(val, 2)";
}
