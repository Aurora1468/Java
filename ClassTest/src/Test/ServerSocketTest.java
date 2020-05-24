package Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10001);
		Socket s = ss.accept();	//没有建立起连接时是阻塞
		System.out.println("客户端已连接");
		while(true) {
			InputStream in = s.getInputStream();
			byte b[] = new byte[1024];
			int len = in.read(b);
			String ret = new String(b,0,len);
			System.out.println("来自客户端的消息：" + ret);
			
		}
	}

}
