package game;

public class Mouse {
	int x,y;		//鼠的坐标
	/*
	 * 定义一个移动方向的数组，来对鼠的坐标进行调整
	 */
	int xx[] = {-1,1,0,0};	//上下左右分别为0123
	int yy[] = {0,0,-1,1};

	/*
	 * 定义一个移动方法，输入的值是移动的方向和移动的步数
	 */
	
	public void move(int fx,int bs){
		int dx = x + xx[fx]*bs;
		int dy = y + yy[fx]*bs;
		if(dx>=0&&dx<=8&&dy>=0&&dy<=8){
			x = dx;
			y = dy;
		}
		else
			System.out.println("鼠移动失败,重试");
	}
}
