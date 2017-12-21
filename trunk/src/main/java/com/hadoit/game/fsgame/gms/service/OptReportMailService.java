package com.hadoit.game.fsgame.gms.service;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.internet.MimeUtility;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hadoit.game.common.framework.mail.SimpleMailServiceImpl;
import com.hadoit.game.common.framework.mail.SimpleMailServiceImpl.SimpleMailMessagePreparator;
import com.hadoit.game.common.framework.property.PropertyLoader;
import com.hadoit.game.common.lang.DataUtils;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayData;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayDataForAll;
import com.hadoit.game.fsgame.gms.meta.opt.OptDayDataForOpr;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalData;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalDataForAll;
import com.hadoit.game.fsgame.gms.meta.opt.OptGlobalDataForOpr;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsConst;
import com.hadoit.game.fsgame.gms.utils.FsGameGmsUtils;
import com.hadoit.game.fsgame.gms.utils.LoggerUtils;

@Transactional
@Component("optReportMailService")
public class OptReportMailService {

	@Autowired
	private OptDataService optDataService;

	@Autowired
	private ExporterService exporterService;

	private void doCreate(HSSFWorkbook workbook, long baseDateTime) {

		// 平台全局统计
		List<OptGlobalDataForAll> r1 = optDataService.queryOptGlobalDataForAll(baseDateTime);

		// 平台单日统计
		List<OptDayDataForAll> r2 = optDataService.queryOptDayDataForAll(baseDateTime);

		// 渠道全局统计
		List<OptGlobalDataForOpr> r3 = optDataService.queryOptGlobalDataForOpr(baseDateTime);

		// 渠道单日统计
		List<OptDayDataForOpr> r4 = optDataService.queryOptDayDataForOpr(baseDateTime);

		// 单服全局统计
		List<OptGlobalData> r5 = optDataService.queryOptGlobalData(baseDateTime);

		// 单服单日统计
		List<OptDayData> r6 = optDataService.queryOptDayData(baseDateTime);

		exporterService.generateXlsWorkbook(workbook, FsGameGmsConst.MAIL_REPORT_NAME_OPT_GLOBAL_FOR_ALL, r1, null);
		exporterService.generateXlsWorkbook(workbook, FsGameGmsConst.MAIL_REPORT_NAME_OPT_DAY_FOR_ALL, r2, null);
		exporterService.generateXlsWorkbook(workbook, FsGameGmsConst.MAIL_REPORT_NAME_OPT_GLOBAL_FOR_OPR, r3, null);
		exporterService.generateXlsWorkbook(workbook, FsGameGmsConst.MAIL_REPORT_NAME_OPT_DAY_FOR_OPR, r4, null);
		exporterService.generateXlsWorkbook(workbook, FsGameGmsConst.MAIL_REPORT_NAME_OPT_GLOBAL, r5, null);
		exporterService.generateXlsWorkbook(workbook, FsGameGmsConst.MAIL_REPORT_NAME_OPT_DAY, r6, null);

		if (workbook.getNumberOfSheets() <= 0) {
			workbook.createSheet("暂无数据");
		}

	}

	private void doSend(long baseDateTime) {
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			doCreate(workbook, baseDateTime);
			final ByteArrayOutputStream baos = new ByteArrayOutputStream();
			workbook.write(baos);

			final String subject = "我的宫廷日常报表" + FsGameGmsUtils.getZone() + "_"
					+ DataUtils.formatDate(baseDateTime, "yyyy-MM-dd");

			Properties p = PropertyLoader.loadProperties("config.properties");
			final String[] cc = StringUtils.split(p.getProperty("config.mail.cc"), ";");
			final String reccv = p.getProperty("config.mail.recv");

			System.setProperty("mail.mime.charset", "UTF-8");// 不加, 可能在某些系统会乱码

			SimpleMailServiceImpl mailService = new SimpleMailServiceImpl();
			mailService.setHost("smtp.163.com");
			mailService.setPort(25);
			mailService.setUsername("gamejelly");
			mailService.setPassword("gamejelly2017");
			mailService.setFromNickname("gamejelly");
			mailService.setFromMail("gamejelly@163.com");
			mailService.setAuth(true);
			mailService.sendMail(reccv, new SimpleMailMessagePreparator() {
				public void prepare(MimeMessageHelper messageHelper) {
					try {
						if (ArrayUtils.isNotEmpty(cc)) {
							messageHelper.setCc(cc);
						}
						messageHelper.setSubject(MimeUtility.encodeWord(subject));
						messageHelper
								.setText(
										"Hi all: <DIV>&nbsp;</DIV> <DIV>&nbsp;&nbsp;&nbsp;&nbsp;请查收~</DIV><DIV>&nbsp;</DIV><DIV>我的宫廷</DIV>",
										true);
						messageHelper.addAttachment(MimeUtility.encodeWord(subject + ".xls"), new ByteArrayResource(
								baos.toByteArray()));
					} catch (Exception e) {
						LoggerUtils.error(e);
					}
				}
			}, true);
		} catch (Exception e) {
			LoggerUtils.error(e);
		}
	}

	public void sendAllMail(long baseDateTime) {
		doSend(baseDateTime);
	}

	public void sendAllMailDaily() {
		long currTime00 = FsGameGmsUtils.getTimeInDay00(new Date());
		// 拿上一天0点
		currTime00 = currTime00 - DateUtils.MILLIS_PER_DAY;
		doSend(currTime00);
	}

	public void createReport(HSSFWorkbook workbook, long baseDateTime) {
		doCreate(workbook, baseDateTime);
	}

}
