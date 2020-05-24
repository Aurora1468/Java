package test2;

public class B extends Thread{
	public void run() {
		while(true) {
			b();
		}
	}
	static void b() {
		System.out.println("B");
	}
}
