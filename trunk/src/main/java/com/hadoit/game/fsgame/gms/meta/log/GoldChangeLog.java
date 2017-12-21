package com.hadoit.game.fsgame.gms.meta.log;

import com.hadoit.game.common.framework.dao.annotation.Table;

@Table(recursion = true)
public class GoldChangeLog extends AvatarBaseLog {
	private static final long serialVersionUID = 1L;

	private long freeGoldDelta;

	private long oldFreeGold;

	private long goldDelta;

	private long oldGold;

	private long historyGold;

	private int sourceType;

	private int sourceId1;

	private int sourceId2;
	private String describe1;
	public long getFreeGoldDelta() {
		return freeGoldDelta;
	}

	public void setFreeGoldDelta(long freeGoldDelta) {
		this.freeGoldDelta = freeGoldDelta;
	}

	public long getOldFreeGold() {
		return oldFreeGold;
	}

	public void setOldFreeGold(long oldFreeGold) {
		this.oldFreeGold = oldFreeGold;
	}

	public long getGoldDelta() {
		return goldDelta;
	}
	
	public void setGoldDelta(long goldDelta) {
		this.goldDelta = goldDelta;
	}

	public long getOldGold() {
		return oldGold;
	}

	public void setOldGold(long oldGold) {
		this.oldGold = oldGold;
	}

	public long getHistoryGold() {
		return historyGold;
	}

	public void setHistoryGold(long historyGold) {
		this.historyGold = historyGold;
	}

	public int getSourceType() {
		return sourceType;
	}

	public void setSourceType(int sourceType) {
		this.sourceType = sourceType;
	}

	public int getSourceId1() {
		return sourceId1;
	}

	public void setSourceId1(int sourceId1) {
		this.sourceId1 = sourceId1;
	}

	public int getSourceId2() {
		return sourceId2;
	}

	public void setSourceId2(int sourceId2) {
		this.sourceId2 = sourceId2;
	}

	public String getDescribe1() {
		return describe1;
	}

	public void setDescribe1(String describe1) {
		this.describe1 = describe1;
	}


}
