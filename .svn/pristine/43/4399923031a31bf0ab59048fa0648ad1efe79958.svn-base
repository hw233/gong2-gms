import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import com.hadoit.game.common.lang.Pair;
import com.hadoit.game.engine.core.protocol.json.GsonFactory;
import com.hadoit.game.fsgame.gms.gfs.FileStorageManager;

public class GmsTest1 {
	final static FileStorageManager fsm = new FileStorageManager();

	private static void doGfs(final String keyName) {
		Thread wt = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (true) {
					try {
						Map<String, Object> m = new HashMap<String, Object>();
						m.put("fromAvatarId", "xxx");
						m.put("msg", "漱口水斯凯斯凯_\nskksks");
						String s = GsonFactory.getDefault().toJson(m);
						fsm.addLineToFile(keyName, s + (++i));
						Thread.sleep(50l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		wt.start();

		Thread rt = new Thread(new Runnable() {
			@Override
			public void run() {
				long offset = 0;
				while (true) {
					try {
						Pair<Long, String> p = fsm.readLines(keyName, offset);
						offset = p.getFirst();
						String[] ss = StringUtils.split(p.getSecond(), "\n");
						if (ss != null) {
							for (int i = ss.length - 1; i >= 0; i--) {
								System.out.println(keyName+"_"+ ss[i]);
							}
						}
						System.out.println(keyName+"_##################");
						Thread.sleep(500l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		rt.start();
	}

	public static void main(String[] args) throws IOException {
//		fsm.registFile("1");
//		fsm.registFile("2");
//		fsm.registFile("3");
		
//		doGfs("1");
//		doGfs("2");
//		doGfs("3");
		
//		String fs = FileUtils.readFileToString(new File("/Users/apple/Documents/workspace_java/gong-gms/chat_data/aa.txt"));
//		System.out.println(fs);
//		Map<String, Object> m = new HashMap<String, Object>();
//		m.put("fromAvatarId", "xxx");
//		m.put("msg", fs);
//		String s = GsonFactory.getDefault().toJson(m);
//		System.out.println(s);
//		String r = s + "######" + "sdfdkf\nss";
//		System.out.println(r);
//		String[] ss = StringUtils.split(r, "\n");
//		for(String s1 : ss){
//			System.out.println("$"+s1);
//		}
//		System.out.println("漱口水斯凯斯凯_\nskksks");
		
		fsm.registFile("test_1");
		Thread wt = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (true) {
					try {
//						Map<String, Object> m = new HashMap<String, Object>();
//						m.put("fromAvatarId", "xxx");
//						m.put("msg", "漱口水斯凯斯凯_\nskksks");
//						String s = GsonFactory.getDefault().toJson(m);
						fsm.addLineToFile("test_1", "{\"time\":1461378590117,\"toName\":null,\"fromAvatarId\":\"1-1-1461115129-1\",\"fromVipLv\":2,\"toAvatarId\":null,\"fromLv\":21,\"fromName\":\"什么鬼"+(++i)+"\",\"type\":1,\"msg\":\"{eLol}\"}");
						Thread.sleep(1000l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		wt.start();
		
	}
}
