package game;

import java.util.Random;

public class Start {

	public static void main(String[] args) {

		/*
		 * �½�һ��è������Ķ���
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
			System.out.println("��ǰè��λ��Ϊ" + c.x + " " + c.y + "," + "����ֵΪ" + c.fp);
			System.out.println("��ǰ���λ��Ϊ" + m.x + " " + m.y);
			Random random = new Random();
			int c_fx = random.nextInt(3);		//����һ�������è���ƶ�����
			int m_fx = random.nextInt(3);		//����һ�����������ƶ�����
			int c_bs = random.nextInt(2)%2 + 1;
			int m_bs = random.nextInt(2)%2 + 1;
			c.move(c_fx,c_bs);
			m.move(m_fx, m_bs);
		}
		if(c.fp<=0){
			System.out.println("δ��׽������Ϸʧ��");
			System.out.println("��ǰè��λ��Ϊ" + c.x + " " + c.y + "," + "����ֵΪ" + c.fp);
			System.out.println("��ǰ���λ��Ϊ" + m.x + " " + m.y);
		}
		else{
			System.out.println("��׽�ɹ�");
			System.out.println("��ǰè��λ��Ϊ" + c.x + " " + c.y + "," + "����ֵΪ" + c.fp);
			System.out.println("��ǰ���λ��Ϊ" + m.x + " " + m.y);
		}
	}

}
