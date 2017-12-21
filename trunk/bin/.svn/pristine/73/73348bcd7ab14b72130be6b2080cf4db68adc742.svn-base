package com.hadoit.game.fsgame.gms.gfs;

import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PreDestroy;

import org.apache.commons.collections.CollectionUtils;

import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.meta.ServerInfo;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

public class FileStorageManager {
	private ConcurrentHashMap<String, FileStorage> fsMap = new ConcurrentHashMap<String, FileStorage>();

	public String savingPath = "chat_data";

	public long fileThreshold = 5000000l;

	public long readMaxLine = 50;
	
	public String charset = "UTF-8";

	public FileStorageManager() {
		File f = new File(savingPath);
		if (!f.exists()) {
			f.mkdirs();
		}
	}

	public void registFile(String keyName) {
		boolean exists = false;
		synchronized (fsMap) {
			if (!fsMap.containsKey(keyName)) {
				fsMap.put(keyName, new FileStorage(charset, savingPath, keyName, fileThreshold));
			} else {
				exists = true;
			}
		}
		if (exists) {
			LoggerUtils.warn("File is exists! keyName=" + keyName);
		}
	}

	public void addLineToFile(String keyName, String content) {
		FileStorage fs = fsMap.get(keyName);
		if (fs == null) {
			LoggerUtils.error("FileStorage not regist! keyName=" + keyName);
			return;
		}
		fs.write((content + '\n').getBytes());
	}

	public Pair<Long, String> readLines(String keyName, long offset) {
		FileStorage fs = fsMap.get(keyName);
		if (fs == null) {
			LoggerUtils.error("FileStorage not regist! keyName=" + keyName);
			return null;
		}
		return fs.readSome(offset, readMaxLine);
	}
	

	public void setSavingPath(String savingPath) {
		this.savingPath = savingPath;
	}

	public void setFileThreshold(long fileThreshold) {
		this.fileThreshold = fileThreshold;
	}

	public void setReadMaxLine(long readMaxLine) {
		this.readMaxLine = readMaxLine;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	@PreDestroy
	public void dispose() {
		for (FileStorage fs : fsMap.values()) {
			fs.dispose();
		}
	}
	
	public void onServerStart(List<ServerInfo> allSrv) {
		if (CollectionUtils.isEmpty(allSrv)) {
			return;
		}
		for (ServerInfo si : allSrv) {
			registFile(FsGameGmsUtils.getServerAndOprGroupIdentify(si.getServerId(), si.getOprGroup()));
		}
	}
}
