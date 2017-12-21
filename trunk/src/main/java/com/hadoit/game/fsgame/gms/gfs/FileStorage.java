package com.hadoit.game.fsgame.gms.gfs;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

public class FileStorage {
	private File baseDataDirectory;

	private ExecutorService writeService;

	private RandomAccessFile writeRaf;

	private long fileThreshold;
	
	private String charset;

	public FileStorage(String charset, String savingPath, String name, long fileThreshold) {
		try {
			this.charset = charset;
			baseDataDirectory = new File(savingPath + File.separator + name);
			if (!baseDataDirectory.exists()) {
				baseDataDirectory.mkdirs();
			}
			this.writeService = Executors.newSingleThreadExecutor(); // single
																		// thread
			this.fileThreshold = fileThreshold;
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
	}

	public void write(final byte[] bs) {
		writeService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					File dataFile = new File(baseDataDirectory, "data");
					if (!dataFile.exists()) {
						dataFile.createNewFile();
					}
					if (writeRaf == null) {
						writeRaf = new RandomAccessFile(dataFile, "rw");
						writeRaf.seek(writeRaf.length());
					}

					writeRaf.write(bs);

					if (writeRaf.length() >= fileThreshold) {
						// destory old raf
						writeRaf.close();
						writeRaf = null;

						// move data to bak
						File mvDstFile = new File(baseDataDirectory, "bak_"
								+ FsGameGmsUtils.formatDate(System.currentTimeMillis(), "yyyy-MM-dd_HHmmss"));
						Files.move(dataFile.toPath(), mvDstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

						// create new data file
						new File(baseDataDirectory, "data").createNewFile();
					}
				} catch (IOException e) {
					LoggerUtils.error(e);
				}
			}
		});
	}

	public Pair<Long, String> readSome(long offset, long maxLine) {
		try {
			File dataFile = new File(baseDataDirectory, "data");
			if (!dataFile.exists()) {
				LoggerUtils.warn("File is not exists! path=" + dataFile.toPath());
				return Pair.newInstance(0l, "File is not exists! path=" + dataFile.toPath());
			}

			RandomAccessFile readRaf = new RandomAccessFile(dataFile, "r");
			long fLen = readRaf.length();

			StringBuffer ret = new StringBuffer();
			StringBuffer line = new StringBuffer();
			int currLine = 0;
			for (long n = fLen - 1; n >= offset; n--) {
				readRaf.seek(n);
				int b = readRaf.read();
				if (b == '\n' || b == '\r') {
					ret.append(new String(line.reverse().toString().getBytes("ISO-8859-1"), charset)).append("\n");
					line = new StringBuffer();
					++currLine;
				} else {
					line.append((char) b);
				}

				// 处理第一行
				if (n == offset) {
					ret.append(new String(line.reverse().toString().getBytes("ISO-8859-1"), charset)).append("\n");
				}

				if (currLine >= maxLine) {
					break;
				}
			}
			readRaf.close();
			return Pair.newInstance(fLen, ret.toString());
		} catch (Exception e) {
			LoggerUtils.error(e);
			return Pair.newInstance(0l, e.toString());
		}
	}

	public void dispose() {
		try {
			writeService.awaitTermination(10, TimeUnit.SECONDS);
			if (writeRaf != null) {
				writeRaf.close();
			}
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
	}
}
