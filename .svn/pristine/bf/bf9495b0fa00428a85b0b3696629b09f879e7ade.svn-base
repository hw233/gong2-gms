package com.hadoit.game.fsgame.gms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.fsgame.gms.dao.ScriptRecordDao;
import com.hadoit.game.fsgame.gms.meta.ScriptRecord;

@Component("scriptRecordService")
@Transactional
public class ScriptRecordService {
	@Autowired
	private ScriptRecordDao scriptRecordDao;

	public List<ScriptRecord> getScriptRecordList() {
		return scriptRecordDao.getAll();
	}

	public ScriptRecord addOrUpdateScriptRecord(long id, String title, String content, String createName) {
		ScriptRecord scriptRecord = new ScriptRecord();
		if (id > 0) {
			scriptRecord.setId(id);
		}
		scriptRecord.setTitle(title);
		scriptRecord.setContent(content);
		scriptRecord.setCreateName(createName);
		scriptRecord.setCreateTime(System.currentTimeMillis());
		scriptRecordDao.addOrUpdateObject(scriptRecord);
		return scriptRecord;
	}

	public void deleteScriptRecord(long id) {
		scriptRecordDao.deleteById(id);
	}
}
