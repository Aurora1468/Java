package stuAndTea;

public class Person {
	String no,name;
	public void in_no(String no){
		this.no = no;
	}
	public void in_name(String name){
		this.name = name;
	}
	public void prt(){
		System.out.println("No is " + this.no);
		System.out.println("Name is "+ this.name);
	}
}
