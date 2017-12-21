package com.hadoit.game.fsgame.gms.meta;

public class ItemInfo {
	private String id;
	private String uid;
	private int templateId;
	private int count;
	private Long createTime;
	/**
	 * 是否应该放入背包
	 */
	private boolean inbag;
	/**
	 * 是否在临时背包
	 */
	private boolean intempbag;
	private String equip_mainprops;
	private String equip_mainpropvals;
	private String equip_subprops;
	private String equip_subpropvals;
	private Integer equip_canaddstonecount;
	private boolean dress_on;
	private boolean dress_defalutdress;
	private String flower_ownerbuildingid;
	private Long flower_starttime;
	private boolean flower_speedup;
	private String ownerid;
	private String stoneownerequipid;
	private String fabaoownerequipid;
	private int lv;
	private boolean zfused;
	private Long zfcurexp;
	private Long parentid;
	private boolean hzskilllock;
	private String fengyinjobsort;
	private int equip_starcount;
	private int equip_jinglianfailcount;
	private String itemname;
	private String itemtype;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public boolean isInbag() {
		return inbag;
	}
	public void setInbag(boolean inbag) {
		this.inbag = inbag;
	}
	public boolean isIntempbag() {
		return intempbag;
	}
	public void setIntempbag(boolean intempbag) {
		this.intempbag = intempbag;
	}
	public String getEquip_mainprops() {
		return equip_mainprops;
	}
	public void setEquip_mainprops(String equip_mainprops) {
		this.equip_mainprops = equip_mainprops;
	}
	public String getEquip_mainpropvals() {
		return equip_mainpropvals;
	}
	public void setEquip_mainpropvals(String equip_mainpropvals) {
		this.equip_mainpropvals = equip_mainpropvals;
	}
	public String getEquip_subprops() {
		return equip_subprops;
	}
	public void setEquip_subprops(String equip_subprops) {
		this.equip_subprops = equip_subprops;
	}
	public String getEquip_subpropvals() {
		return equip_subpropvals;
	}
	public void setEquip_subpropvals(String equip_subpropvals) {
		this.equip_subpropvals = equip_subpropvals;
	}
	public Integer getEquip_canaddstonecount() {
		return equip_canaddstonecount;
	}
	public void setEquip_canaddstonecount(Integer equip_canaddstonecount) {
		this.equip_canaddstonecount = equip_canaddstonecount;
	}
	public boolean isDress_on() {
		return dress_on;
	}
	public void setDress_on(boolean dress_on) {
		this.dress_on = dress_on;
	}
	public boolean isDress_defalutdress() {
		return dress_defalutdress;
	}
	public void setDress_defalutdress(boolean dress_defalutdress) {
		this.dress_defalutdress = dress_defalutdress;
	}
	public String getFlower_ownerbuildingid() {
		return flower_ownerbuildingid;
	}
	public void setFlower_ownerbuildingid(String flower_ownerbuildingid) {
		this.flower_ownerbuildingid = flower_ownerbuildingid;
	}
	public Long getFlower_starttime() {
		return flower_starttime;
	}
	public void setFlower_starttime(Long flower_starttime) {
		this.flower_starttime = flower_starttime;
	}
	public boolean isFlower_speedup() {
		return flower_speedup;
	}
	public void setFlower_speedup(boolean flower_speedup) {
		this.flower_speedup = flower_speedup;
	}
	public String getOwnerid() {
		return ownerid;
	}
	public void setOwnerid(String ownerid) {
		this.ownerid = ownerid;
	}
	public String getStoneownerequipid() {
		return stoneownerequipid;
	}
	public void setStoneownerequipid(String stoneownerequipid) {
		this.stoneownerequipid = stoneownerequipid;
	}
	public String getFabaoownerequipid() {
		return fabaoownerequipid;
	}
	public void setFabaoownerequipid(String fabaoownerequipid) {
		this.fabaoownerequipid = fabaoownerequipid;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(Integer lv) {
		this.lv = lv;
	}
	public boolean isZfused() {
		return zfused;
	}
	public void setZfused(boolean zfused) {
		this.zfused = zfused;
	}
	public Long getZfcurexp() {
		return zfcurexp;
	}
	public void setZfcurexp(Long zfcurexp) {
		this.zfcurexp = zfcurexp;
	}
	public Long getParentid() {
		return parentid;
	}
	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}
	public boolean isHzskilllock() {
		return hzskilllock;
	}
	public void setHzskilllock(boolean hzskilllock) {
		this.hzskilllock = hzskilllock;
	}
	public String getFengyinjobsort() {
		return fengyinjobsort;
	}
	public void setFengyinjobsort(String fengyinjobsort) {
		this.fengyinjobsort = fengyinjobsort;
	}
	public int getEquip_starcount() {
		return equip_starcount;
	}
	public void setEquip_starcount(Integer equip_starcount) {
		this.equip_starcount = equip_starcount;
	}
	public int getEquip_jinglianfailcount() {
		return equip_jinglianfailcount;
	}
	public void setEquip_jinglianfailcount(Integer equip_jinglianfailcount) {
		this.equip_jinglianfailcount = equip_jinglianfailcount;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public void setEquip_starcount(int equip_starcount) {
		this.equip_starcount = equip_starcount;
	}
	public void setEquip_jinglianfailcount(int equip_jinglianfailcount) {
		this.equip_jinglianfailcount = equip_jinglianfailcount;
	}
	

}
