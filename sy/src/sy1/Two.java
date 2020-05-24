package sy1;

public class Two {
	public static boolean ss(int x){
		for(int i = 2;i<=Math.sqrt(x);i++){
			if(x%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2;i<=50;++i){
			if(ss(i)){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
