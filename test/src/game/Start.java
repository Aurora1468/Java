package game;

import java.util.Random;

public class Start {

	public static void main(String[] args) {

		/*
		 * 新建一个猫和老鼠的对象
		 */
		Cat c = new Cat();
		Mouse m = new Mouse();
		c.x = 3;
		c.y = 3;
		c.fp = 30;
		m.x = 5;
		m.y = 5;
		while((c.x!=m.x||c.y!=m.y)&&c.fp>0){
			System.out.println();
			System.out.println("当前猫的位置为" + c.x + " " + c.y + "," + "体力值为" + c.fp);
			System.out.println("当前鼠的位置为" + m.x + " " + m.y);
			Random random = new Random();
			int c_fx = random.nextInt(3);		//生成一个随机的猫的移动方向
			int m_fx = random.nextInt(3);		//生成一个随机的鼠的移动方向
			int c_bs = random.nextInt(2)%2 + 1;
			int m_bs = random.nextInt(2)%2 + 1;
			c.move(c_fx,c_bs);
			m.move(m_fx, m_bs);
		}
		if(c.fp<=0){
			System.out.println("未捕捉到，游戏失败");
			System.out.println("当前猫的位置为" + c.x + " " + c.y + "," + "体力值为" + c.fp);
			System.out.println("当前鼠的位置为" + m.x + " " + m.y);
		}
		else{
			System.out.println("捕捉成功");
			System.out.println("当前猫的位置为" + c.x + " " + c.y + "," + "体力值为" + c.fp);
			System.out.println("当前鼠的位置为" + m.x + " " + m.y);
		}
	}

}
