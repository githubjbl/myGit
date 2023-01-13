package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("출력결과 :");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("이름 :"));
		c.add(new JTextField("hong",15));
		c.add(new JLabel("비밀번호 :"));
		c.add(new JPasswordField("1234",15));
		c.add(new JLabel("이메일 :"));
		c.add(new JTextField("hong@daum.net", 15));
		c.add(new JLabel("hp :"));
		c.add(new JTextField("010-1234-5678", 15));
		
	}
	
	
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
