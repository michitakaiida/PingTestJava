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
	      // IP��z�X�g���Ȃǂ��w��
	      InetAddress inetAddress = InetAddress.getByName("192.168.56.11");

	      // isReachable���\�b�h��ping�������ł��܂��B�����̓^�C���A�E�g(�~���b�w��)�B
	      boolean pingdata = inetAddress.isReachable( 1000 );
	      System.out.println("����:" + pingdata );
	      
	      ServerInfo serverInfo = new ServerInfo();
	      serverInfo.setHostName("loaclhost");
	      serverInfo.setIPadress("192.168.56.11");
	      serverInfo.setParents("nothing");
	      String text = JSON.encode(serverInfo);
	      System.out.println(text);

	}
}
