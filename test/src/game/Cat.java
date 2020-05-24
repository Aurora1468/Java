package game;

public class Cat {
	int x,y;		//猫的坐标
	int fp;			//定义为猫的行动力
	/*
	 * 定义一个移动方向的数组，来对猫的坐标进行调整
	 */
	int xx[] = {-1,1,0,0};	//上下左右分别为0123
	int yy[] = {0,0,-1,1};
	
	
	/*
	 * 定义一个移动方法，输入的值是移动的方向和移动的步数
	 * 每移动一次行动力就会减一
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
			System.out.println("猫移动失败，不扣除体力值并重试");
	}
	
}
