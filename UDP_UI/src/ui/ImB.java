package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ImB {

	public void UI_start(Test2 T) {
		JFrame frame = new JFrame("ImB");
		frame.setLayout(new FlowLayout());
		JTextArea jt=new JTextArea(14,33);
		JTextField jtf = new JTextField(20);
		jt.setLineWrap(true);
		frame.setSize(400,300);
		//滑动条
		JScrollPane jsp = new JScrollPane(jt);
		JButton b1 = new JButton();
		frame.getRootPane().setDefaultButton(b1);
		//设置滑动条一直存在
				jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
				frame.add(jsp);frame.add(jtf);
				frame.setVisible(true);
		//监听键盘
		jtf.addKeyListener(new KeyListener() {
			
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				;
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				;
			}

			@Override
			//设置只有回车才触发事件
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() == KeyEvent.VK_ENTER)
					b1.doClick();
			}
		});
		while(true) {
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(jtf.getText().equals("") == false) {
						try {
							T.fs("ImB:" + jtf.getText() + "\n");
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//jt.append("ImA:" + jtf.getText() + "\n");
						jtf.setText("");
					}
				}
			});
		
			try {
				jt.append(T.js());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ImB B = new ImB();
		Test2 T = new Test2();
		B.UI_start(T);
		
	}

}
