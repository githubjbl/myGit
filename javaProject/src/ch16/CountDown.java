package ch16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame{
	private JLabel lable;
	class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=10; i>=0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lable.setText(i + "");
			}
			System.exit(0);
		}
	}//내부 클래스
	public CountDown() {
		setTitle("카운트다운");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lable = new JLabel("Start");
		lable.setFont(new Font("Serif", Font.BOLD, 100));
		add(lable);
		(new MyThread()).start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CountDown(); //객체생성
	}
}
