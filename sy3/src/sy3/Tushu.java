package sy3;

import java.util.Scanner;

public class Tushu {
	String bookName;
	String author;
	String cbs;
	String zt = "�ڹ���";
	private Scanner sc;
	public Tushu(String bookName,String author,String cbs){
		this.bookName = bookName;
		this.author = author;
		this.cbs = cbs;
	}
	public void sz(){
		sc = new Scanner(System.in);
		System.out.println("����ı���״̬��");
		this.zt = sc.next();
	}
	public void xs(){
		System.out.println(this.zt);
	}
}
