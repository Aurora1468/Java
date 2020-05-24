package syArray;

public class Three {

	public static void main(String[] args) {
		char arr[][] = new char[9][15];
		int j = 4;
		for(int i = 0;i<5;++i) {
			for(int temp = 0;temp<j;++temp) {
				arr[i][j] = ' ';
			}
			for(int z = 0;z<(2*i)+1;z++) {
				arr[i][z+j] = '*';
			}
			j--;
		}
		int aaa = 4;
		for(int i = 0;i<5;++i) {
			for(j = 0;j<15;++j) {
				if(j != aaa && j!=(8 - aaa))
					arr[i][j] = ' ';
			}
			aaa--;
			//System.out.println();
		}
		for(int i = 5;i<9;++i) {
			for(j = 0;j<15;++j) {
				arr[i][j] = arr[8-i][j];
			}
			//System.out.println();
		}
		for(int i = 0;i<9;++i) {
			for(j = 0;j<15;++j) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
