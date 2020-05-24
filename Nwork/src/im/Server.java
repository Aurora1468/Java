package im;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Server {
	static ServerSocket ss = null;
	static Socket s = null;
	private static Scanner sc;
	public static void timee() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("当前时间：" + df.format(new Date()));
	}
	public static void a() throws Exception {
		InputStream in = s.getInputStream();
		byte b[] = new byte[1024];
		int len = in.read(b);
		String ret = new String(b,0,len);
		timee();
		System.out.println("来自客户端的消息：" + ret);
	}
	public static void b() throws IOException {
		OutputStream out = s.getOutputStream();
		sc = new Scanner(System.in);
		String outt = sc.next();
		out.write(outt.getBytes());
	}
	public static void main(String[] args) throws Exception {
		//Server ser = new Server();
		ss = new ServerSocket(10001);
		while(true) {
			s = ss.accept();
			a();
			b();
			//s.close();
		}
	}

}
