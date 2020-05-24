package stuAndTea;

public class Test {

	public static void main(String[] args) {
		Student stu = new Student();
		Teacher tea = new Teacher();
		stu.in_name("夏蕾");
		tea.in_name("张老师");
		stu.in_no("10214518201");
		stu.in_score("100");
		stu.in_classno("软件1186");
		stu.prt();
		stu.prt2();
		tea.prt();
	}

}
