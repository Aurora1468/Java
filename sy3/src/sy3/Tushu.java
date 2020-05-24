package sy3;

import java.util.Scanner;

public class Tushu {
	String bookName;
	String author;
	String cbs;
	String zt = "在馆内";
	private Scanner sc;
	public Tushu(String bookName,String author,String cbs){
		this.bookName = bookName;
		this.author = author;
		this.cbs = cbs;
	}
	public void sz(){
		sc = new Scanner(System.in);
		System.out.println("输入改变后的状态：");
		this.zt = sc.next();
	}
	public void xs(){
		System.out.println(this.zt);
	}
}
