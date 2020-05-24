package udp_im;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class ImB {
	private static Scanner sc;
	static InetSocketAddress sa = new InetSocketAddress("127.0.0.1",10001);
	public static void fs() throws Exception {
		DatagramSocket ds = new DatagramSocket();
		sc = new Scanner(System.in);
		String s = sc.next();
		byte[] b = s.getBytes();
		DatagramPacket dp = new DatagramPacket(b, b.length,sa);
		ds.send(dp);
		ds.close();
	}
	public static void js() throws Exception {
		DatagramSocket ds = new DatagramSocket(10001);
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		String ret = new String(b,0,dp.getLength());
		System.out.println(ret);
		ds.close();
	}
	public static void main(String[] args) throws Exception {
		while(true) {
			js();
			fs();
		}
	}
}
