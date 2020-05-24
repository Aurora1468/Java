package sy3;

import java.util.Date;

public class Birthday {

	int year,month,day;

	public Birthday(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void prt(){
		System.out.println("ÉúÈÕÊÇ£º" + this.year + this.month + this.day);
	}
	public void getAge(int now){
		/*
		 * Date da = new Date();
		String s = da.toString();
		int temp = 0;
		for(int i = 25;i<s.length();++i){
			temp += (temp*10 + (s[i]-'0');
		}
		 */
		System.out.println(now - this.year);
	}
}
