package Main;

import java.io.IOException;
import java.net.InetAddress;

import net.arnx.jsonic.JSON;

public class PingTest {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
	      // IPやホスト名などを指定
	      InetAddress inetAddress = InetAddress.getByName("192.168.56.11");

	      // isReachableメソッドでpingが実現できます。引数はタイムアウト(ミリ秒指定)。
	      boolean pingdata = inetAddress.isReachable( 1000 );
	      System.out.println("結果:" + pingdata );
	      
	      ServerInfo serverInfo = new ServerInfo();
	      serverInfo.setHostName("loaclhost");
	      serverInfo.setIPadress("192.168.56.11");
	      serverInfo.setParents("nothing");
	      String text = JSON.encode(serverInfo);
	      System.out.println(text);

	}
}
