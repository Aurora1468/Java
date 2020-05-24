package stuAndTea;

public class Student extends Person{
	String score,classno;
	public void in_score(String score){
		this.score = score;
	}
	public void in_classno(String classno){
		this.classno = classno;
	}
	public void prt2(){
		System.out.println("Score is " + this.score);
		System.out.println("Class No is "+ this.classno);
	}
}
