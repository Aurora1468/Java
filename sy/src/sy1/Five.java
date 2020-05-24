package sy1;

import java.util.Scanner;

public class Five {

	private static Scanner sc;

	public static void main(String[] args) {
		final double pi = 3.1415926; 
		sc = new Scanner(System.in);
		System.out.println("1.长方形,2.正方形,3.圆形");
		int temp = sc.nextInt();
		if(temp == 1){
			System.out.println("输入长和宽：");
			int c = sc.nextInt();
			int k = sc.nextInt();
			System.out.println("周长是：" + (c*2+k*2));
		}
		else if(temp == 2){
			System.out.println("输入边长：");
			int b = sc.nextInt();
			System.out.println("周长是：" + (b*4));
		}
		else if(temp == 3){
			System.out.println("输入半径：");
			int r = sc.nextInt();
			System.out.println("周长是：" + (2*pi*r));
		}
	}

}
