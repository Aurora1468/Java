package game_2048;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class fz_nums {
	JLabel Jfz[][] = new JLabel[4][4];
	int nums[][] = new int[4][4];
	Random r = new Random();
	Color fz_back_Color = new Color(214, 205, 196);
	Color font_Color = new Color(121, 115, 104);
	Color nums_Color = new Color(238, 228, 218);
	public void change(int x,int y) {
		this.nums[x][y] = (1+r.nextInt(2))*2;
		//System.out.println(this.nums[x][y]);
	}
	
	//用随机数生成一个空白区域坐标
	public void kb() {
		int x = r.nextInt(4);
		int y = r.nextInt(4);
		if(nums[x][y] != 0) {
			kb();
		}
		else {
			this.change(x,y);
		}
	}
	//刷新方阵
	public void fuzhi() {
		for(int i = 0;i<4;++i) {
			for(int j = 0;j<4;++j) {
				//当数组值不为0的时候改变当前方块的颜色并且赋值
				if(this.nums[i][j] != 0) {
					this.Jfz[i][j].setText(String.valueOf(this.nums[i][j]));
					this.Jfz[i][j].setBackground(nums_Color);
				}
				else {
					this.Jfz[i][j].setText("");
					this.Jfz[i][j].setBackground(fz_back_Color);
				}
			}
		}
	}
	//初始化Jlabel数组
	public void csh() {
		for(int i = 0;i<4;++i) {
			for(int j = 0;j<4;++j) {
				//new并且设置居中
				this.Jfz[i][j] = new JLabel("",JLabel.CENTER);
				//方阵背景
				this.Jfz[i][j].setBackground(fz_back_Color);
				//组件不透明
				this.Jfz[i][j].setOpaque(true);
				this.Jfz[i][j].setFont(new Font("楷体",1,35));
				//设置字体颜色
				this.Jfz[i][j].setForeground(font_Color);

			}
		}
	}
	
}
