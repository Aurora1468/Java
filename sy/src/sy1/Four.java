package sy1;

import java.util.Random;

public class Four {

	public static void main(String[] args) {
		Random rd = new Random();
		int max_num = -1;
		int min_num = 999;
		for(int i = 0;i<20;i++){
			int temp = rd.nextInt(50) + 50;
			if(temp > max_num){
				max_num = temp;
			}
			if(temp < min_num){
				min_num = temp;
			}
		}
		System.out.println("最大值是" + max_num);
		System.out.println("最小值是" + min_num);
	}

}
