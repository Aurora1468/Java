package game;

public class Cat {
	int x,y;		//è������
	int fp;			//����Ϊè���ж���
	/*
	 * ����һ���ƶ���������飬����è��������е���
	 */
	int xx[] = {-1,1,0,0};	//�������ҷֱ�Ϊ0123
	int yy[] = {0,0,-1,1};
	
	
	/*
	 * ����һ���ƶ������������ֵ���ƶ��ķ�����ƶ��Ĳ���
	 * ÿ�ƶ�һ���ж����ͻ��һ
	 */
	
	public void move(int fx,int bs){
		int dx = x + xx[fx]*bs;
		int dy = y + yy[fx]*bs;
		if(dx>=0&&dx<=8&&dy>=0&&dy<=8){
			x = dx;
			y = dy;
			fp -= 1;
		}
		else
			System.out.println("è�ƶ�ʧ�ܣ����۳�����ֵ������");
	}
	
}
