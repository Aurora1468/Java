package sy1;

import java.util.Arrays;
import java.util.Random;

public class Three {

	public static void main(String[] args) {
		Random rd = new Random();
		int num[] = new int[10];
		for(int i = 0;i<10;++i){
			num[i] = rd.nextInt(100);
		}
		Arrays.sort(num);
		int num_len = num.length;
		for(int i = 0;i<num_len;i++){
			System.out.print(num[i] + " ");
		}
	}

}
