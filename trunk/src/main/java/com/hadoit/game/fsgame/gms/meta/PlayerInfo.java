package com.hadoit.game.fsgame.gms.meta;

public class PlayerInfo {
	/**
	 * 表示唯一的id
	 */
	private String id;

	/**
	 * 数据库id
	 */
	private long dbId;

	/**
	 * 账号
	 */
	private String accountName;

	/**
	 * 角色名
	 */
	private String roleName;

	/**
	 * 用户组
	 */
	private int userGroup;

	/**
	 * 全服唯一的id
	 */
	private long gbId;

	private int vipLv;

	private int lv;

	private long exp;

	private long money;

	/**
	 * 充值元宝
	 */
	private long gold;

	/**
	 * 免费元宝
	 */
	private long freeGold;

	/**
	 * 累计元宝数(发奖会发这个字段)
	 */
	private long leijiGold;

	/**
	 * 历史充值数(真正的历史充值)
	 */
	private long historyGold;

	private boolean firstPayed;

	private int[] zwData = new int[10];

	private int playGuideId;

	private long loginTime;

	private long createTime;

	private long logoutTime;

	private String gongHuiName;

	private String gongHuiId;

	private Object zhuanPanCZ;

	private Object zhuanPanXF;
	
	
	private Object zhuanPanCount;
	
	private int accountgroup;//玩家账号的状态

	// 获取上阵门徒数量
	public int getSZMTCount() {
		int count = 0;
		for (int i : zwData) {
			if (i > 0) {
				count++;
			}
		}

		return count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}

	public long getGbId() {
		return gbId;
	}

	public void setGbId(long gbId) {
		this.gbId = gbId;
	}

	public int getVipLv() {
		return vipLv;
	}

	public void setVipLv(int vipLv) {
		this.vipLv = vipLv;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) {
		this.exp = exp;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public long getGold() {
		return gold;
	}

	public void setGold(long gold) {
		this.gold = gold;
	}

	public long getFreeGold() {
		return freeGold;
	}

	public void setFreeGold(long freeGold) {
		this.freeGold = freeGold;
	}

	public long getLeijiGold() {
		return leijiGold;
	}

	public void setLeijiGold(long leijiGold) {
		this.leijiGold = leijiGold;
	}

	public long getHistoryGold() {
		return historyGold;
	}

	public void setHistoryGold(long historyGold) {
		this.historyGold = historyGold;
	}

	public boolean isFirstPayed() {
		return firstPayed;
	}

	public void setFirstPayed(boolean firstPayed) {
		this.firstPayed = firstPayed;
	}

	public long getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(long logoutTime) {
		this.logoutTime = logoutTime;
	}

	public long getDbId() {
		return dbId;
	}

	public void setDbId(long dbId) {
		this.dbId = dbId;
	}

	public int getPlayGuideId() {
		return playGuideId;
	}

	public void setPlayGuideId(int playGuideId) {
		this.playGuideId = playGuideId;
	}

	public boolean isOnline() {
		return this.loginTime > this.logoutTime;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getGongHuiName() {
		return gongHuiName;
	}

	public void setGongHuiName(String gongHuiName) {
		this.gongHuiName = gongHuiName;
	}

	public String getGongHuiId() {
		return gongHuiId;
	}

	public void setGongHuiId(String gongHuiId) {
		this.gongHuiId = gongHuiId;
	}

	public Object getZhuanPanCZ() {
		return zhuanPanCZ;
	}

	public void setZhuanPanCZ(Object zhuanPanCZ) {
		this.zhuanPanCZ = zhuanPanCZ;
	}

	public Object getZhuanPanXF() {
		return zhuanPanXF;
	}

	public void setZhuanPanXF(Object zhuanPanXF) {
		this.zhuanPanXF = zhuanPanXF;
	}

	public Object getZhuanPanCount() {
		return zhuanPanCount;
	}

	public void setZhuanPanCount(Object zhuanPanCount) {
		this.zhuanPanCount = zhuanPanCount;
	}

	public int getAccountgroup() {
		return accountgroup;
	}

	public void setAccountgroup(int accountgroup) {
		this.accountgroup = accountgroup;
	}

}
