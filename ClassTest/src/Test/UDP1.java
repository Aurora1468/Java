package Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP1 {
	
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10001);
		byte b[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		String ret = new String(b,0,dp.getLength());
		System.out.println(ret);
		ds.close();
	}

}
