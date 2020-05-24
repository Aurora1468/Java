package Test;

public class XC extends Thread{
	String name;
	XC(String _name){
		name = _name;
	}
	public void a() {
		System.out.println(name + " " + "a函数在正在运行");
	}
	public void b() {
		System.out.println(name + " " + "b函数在正在运行");
	}
	public void run() {
		a();
	}
	public static void main(String[] args) {
			XC x1 = new XC("x1");
			XC x2 = new XC("x2");
			x1.start();
			x2.start();
	}

}
