package syArray;

public class One {

	public static void main(String[] args) {
		char arr[][] = new char[4][8];
		int j = 3;
		for(int i = 0;i<4;++i) {
			for(int temp = 0;temp<j;++temp) {
				arr[i][j] = ' ';
			}
			for(int z = 0;z<(2*i)+1;z++) {
				//System.out.println(z+j);
				arr[i][z+j] = '*';
			}
			j--;
		}
		for(int i = 0;i<4;++i) {
			for(j = 0;j<8;++j) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
