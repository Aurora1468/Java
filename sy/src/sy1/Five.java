package sy1;

import java.util.Scanner;

public class Five {

	private static Scanner sc;

	public static void main(String[] args) {
		final double pi = 3.1415926; 
		sc = new Scanner(System.in);
		System.out.println("1.������,2.������,3.Բ��");
		int temp = sc.nextInt();
		if(temp == 1){
			System.out.println("���볤�Ϳ�");
			int c = sc.nextInt();
			int k = sc.nextInt();
			System.out.println("�ܳ��ǣ�" + (c*2+k*2));
		}
		else if(temp == 2){
			System.out.println("����߳���");
			int b = sc.nextInt();
			System.out.println("�ܳ��ǣ�" + (b*4));
		}
		else if(temp == 3){
			System.out.println("����뾶��");
			int r = sc.nextInt();
			System.out.println("�ܳ��ǣ�" + (2*pi*r));
		}
	}

}
