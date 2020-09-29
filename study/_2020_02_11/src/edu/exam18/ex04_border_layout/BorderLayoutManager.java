package edu.exam18.ex04_border_layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//BorderLayout 관리자
//동/서/남/북/중앙으로 배치

public class BorderLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("BorderLayout Test");
		frm.setBounds(120, 120, 300, 200);
		frm.setLayout(new BorderLayout());
		
		frm.add(new JButton("동"), BorderLayout.EAST);
		frm.add(new JButton("서"), BorderLayout.WEST);
		frm.add(new JButton("남"), BorderLayout.SOUTH);
		frm.add(new JButton("북"), BorderLayout.NORTH);
		frm.add(new JButton("중앙"), BorderLayout.CENTER);
		
		frm.setVisible(true);
	}
}








