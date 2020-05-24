package Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


public class UDP2 {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket ds = new DatagramSocket();
		String s = "1234";
		byte[] b = s.getBytes();
		InetSocketAddress sa = new InetSocketAddress("127.0.0.1",10001);
		DatagramPacket dp = new DatagramPacket(b, b.length,sa);
		ds.send(dp);

	}

}
