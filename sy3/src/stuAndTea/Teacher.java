package stuAndTea;

public class Teacher extends Person{
	String zc,bm;
	public void in_zc(String zc){
		this.zc = zc;
	}
	public void bm(String bm){
		this.bm = bm;
	}
	public void prt2(){
		System.out.println("职称是  " + this.zc);
		System.out.println("部门是 "+ this.bm);
	}
}
