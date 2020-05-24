package test2;

public class A extends Thread{
	public void run() {
		while(true) {
			a();
		}
	}
	
	static void a() {
		System.out.println("A");
	}
}
