package edu.exam18.ex06_multi_layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiLayoutManager {
	public static void main(String[] args) {
		// 프레임창(Window창)
		JFrame frm = new JFrame("Multi Layout Manager");
		frm.setBounds(120, 120, 250, 150);
		frm.setLayout(new BorderLayout());  // 방향
		
		JButton btn1 = new JButton("B1");
		JButton btn2 = new JButton("B2");
		JButton btn3 = new JButton("B3");
		JButton btn4 = new JButton("B4");
		JButton btn5 = new JButton("B5");
		JButton btn6 = new JButton("B6");
		JButton btn7 = new JButton("B7");
		JButton btn8 = new JButton("B8");
		JButton btn9 = new JButton("B9");
		JButton btn10 = new JButton("B10");
		
		// 위부분의 Layout
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(btn1);		panel1.add(btn2);
		panel1.add(btn3);		panel1.add(btn4);
		
		// 아래 부분의 Layout
		JPanel panel2 = new JPanel();
		// 세로(행)row 2, 가로(열)col 3, 가로간격 2, 세로간격 2
		panel2.setLayout(new GridLayout(2, 3, 2, 2));
		panel2.add(btn5);		panel2.add(btn6);
		panel2.add(btn7);		panel2.add(btn8);
		panel2.add(btn9);		panel2.add(btn10);
		
		// Panel들을 Frame에 배치
		frm.add(panel1, BorderLayout.NORTH);
		frm.add(panel2, BorderLayout.CENTER);
		
		frm.setVisible(true);
	}
}








