package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 *  과제는 아래쪽 주석처리한 내용이고 위의 코드는 dialog를 응용해보았습니다.
 */

public class MyEventColor extends JFrame implements ActionListener {
	private JFrame f;
	private Color c;
	private Container con;
	private JButton[] jb = new JButton[4];
	private String[] jbName = { "빨강", "초록", "노랑", "파랑" };

	public static void main(String[] args) {
		new MyEventColor();
	}

	public MyEventColor() {
		super("01-06 과제 추가");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(jbName[i % 4]);
			switch (i % 4) {
			case 0:
				add(jb[i], "North");
				c = Color.red;
				break;
			case 1:
				add(jb[i], "East");
				c = Color.green;
				break;
			case 2:
				add(jb[i], "West");
				c = Color.yellow;
				break;
			case 3:
				add(jb[i], "South");
				c = Color.blue;
				break;
			}
			jb[i].addActionListener(new MyEventColor(this, c));
		}
	}

	public MyEventColor(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<jb.length; i++) {
			if (e.getActionCommand().equals(jbName[i])) {
				int a = JOptionPane.showConfirmDialog(null, jbName[i] + "색으로 결정하시겠습니까?", "확인",
						JOptionPane.YES_NO_OPTION);
				if (a == JOptionPane.YES_OPTION) {
					con.setBackground(c);
				} else {
					System.out.println("색상을 선택하세요.");
				}
			}
		}

	}

}

//public class MyEventColor extends JFrame implements ActionListener {
//	private JFrame f;
//	private Color c;
//	private Container con;
//	private JButton jb_N, jb_E, jb_W, jb_S;
//	
//	
//	public static void main(String[] args) {
//		new MyEventColor();
//	}
//	
//	public MyEventColor() {
//		super("01-06 과제");
//		setSize(400, 400);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//		jb_N = new JButton("RED");
//		jb_E = new JButton("GREEN");
//		jb_W = new JButton("BLUE");
//		jb_S = new JButton("YELLOW");
//		
//		add(jb_N,"North"); add(jb_E,"East"); add(jb_W,"West"); add(jb_S,"South");
//		
//		jb_N.addActionListener(new MyEventColor(this, Color.red));
//		jb_E.addActionListener(new MyEventColor(this, Color.green));
//		jb_W.addActionListener(new MyEventColor(this, Color.blue));
//		jb_S.addActionListener(new MyEventColor(this, Color.yellow));
//		
//	}
//	
//	
//	public MyEventColor(JFrame f, Color c) {
//		this.f = f;
//		con = f.getContentPane();
//		this.c = c;
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		con.setBackground(c);
//	}
//
//
//}
