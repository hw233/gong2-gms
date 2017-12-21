

import java.util.List;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.util.Assert;

import com.hadoit.game.common.framework.dao.annotation.Table;
import com.hadoit.game.common.framework.dao.dialect.DbMySQLDialect;
import com.hadoit.game.common.framework.dao.domain.TableMeta;
import com.hadoit.game.common.framework.dao.domain.TableMetaHelper;
import com.hadoit.game.fsgame.gms.utils.PackageUtil;

public class SqlGenTest {
	
	public static int randomIntBetweenInclusive(int v1, int v2, int step) {
		Assert.isTrue(step > 0);
		if (v2 > v1) {
			int stepCount = (v2 - v1) / step;
			return v1 + step * getRandomInt(stepCount + 1);
		} else {
			int stepCount = (v1 - v2) / step;
			return v2 + step * getRandomInt(stepCount + 1);
		}
	}
	
	public static int getRandomInt(int max) {
		if (max <= 0) {
			return 0;
		}
		return RandomUtils.nextInt(max);
	}
	public static void main(String[] args) throws ClassNotFoundException {
		DbMySQLDialect dialect = new DbMySQLDialect();

		String packageName = "com.hadoit.game.fsgame.gms.meta.opt";
		List<String> classNames = PackageUtil.getClassName(packageName, true);
		if (classNames != null) {
			for (String className : classNames) {
				Class<?> cl = Class.forName(className);
				if (cl.getAnnotation(Table.class) != null) {
					TableMeta tableMeta = TableMetaHelper.createTableMeta(cl);
					String[] sqls = new String[] { dialect.sqlCreateString(tableMeta) };
					for (String sql : sqls) {
						//System.out.println(className + ", [SQL CREATE] " + sql);
						sql = sql.replaceAll("CREATE TABLE", "CREATE TABLE IF NOT EXISTS");
						System.out.println(sql + ";");
					}
					
				}
			}
		}
		
		for(int i=0;i<100;i++){
			int mid = (int)(System.currentTimeMillis()/1000);
			int st = mid-3600*24*5;
			int et = mid+3600*24*5;
			long time = randomIntBetweenInclusive(st, et, 1) * 1000l;
			String is = "insert into OPT_LOGINDAY (retentionRatio1,retentionRatio2,retentionRatio3,retentionRatio4,"+
			"loginCount,newLoginCount,"+
			"newRegCount,createTime) values ("+RandomUtils.nextFloat()+","+RandomUtils.nextFloat()+","
			+RandomUtils.nextFloat()+","+RandomUtils.nextFloat()+","+RandomUtils.nextInt(10000)+","
			+RandomUtils.nextInt(10000)+","+RandomUtils.nextInt(10000)+","+time+");";
			
			System.out.println(is);
		}

	}
}
