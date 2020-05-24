package sy3;

import java.util.Scanner;

public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tushu ts = new Tushu("123","456","789");
		//ts.sz();
		Birthday bd = new Birthday(2000,12,02);
		System.out.println("输入当前年份");
		sc = new Scanner(System.in);
		int temp = sc.nextInt();
		bd.getAge(temp);
		//System.out.println(bd.getAge());
	}

}
