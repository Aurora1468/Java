package im;

public class ImB {

	public static void main(String[] args) {
		Server A = new Server();
		Server B = new Server();
		while(true) {
			A.start();
			B.start();
		}
	}

}
