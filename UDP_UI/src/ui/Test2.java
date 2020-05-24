package ui;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Test2 {
	static InetSocketAddress sa = new InetSocketAddress("127.0.0.1",10002);

	public void fs(String s) throws Exception {
		DatagramSocket ds = new DatagramSocket();
		byte[] b = s.getBytes();
		DatagramPacket dp = new DatagramPacket(b, b.length,sa);
		ds.send(dp);
		ds.close();
	}
	public String js() throws Exception {
		DatagramSocket ds = new DatagramSocket(10001);
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		String ret = new String(b,0,dp.getLength());
		ds.close();
		return ret;
	}

}
