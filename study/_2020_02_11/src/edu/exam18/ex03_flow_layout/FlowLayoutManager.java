package edu.exam18.ex03_flow_layout;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//FlowLayout 관리자
//1) 왼쪽 -> 오른쪽으로 배치
//2) 중앙으로 정렬해가며 배치
//3) 한줄에 모든 컴포넌트를 배치할 수 없을 때는 다음 줄에 이어서 배치

class LargeButton extends JButton{
	public LargeButton(String str) {
		super(str);
	}
	// 버튼의 기본 크기 조정 Overriding
	public Dimension getPreferredSize() {
		Dimension largeBtmSz = new Dimension(
				super.getPreferredSize().width+30,
				super.getPreferredSize().height+15);
		return largeBtmSz;
	}
}

public class FlowLayoutManager {
	public static void main(String[] args) {
		JFrame frm = new JFrame("FlowLayout Test");
		frm.setBounds(120, 120, 400, 200);
		frm.setLayout(new FlowLayout());
		
		frm.add(new JButton("Hi!"));
		frm.add(new JButton("Swing Swing!"));
		frm.add(new JButton("I am a button!"));
		
		frm.add(new LargeButton("Hi!"));
		frm.add(new LargeButton("Swing Swing!"));
		frm.add(new LargeButton("I am a button!"));
		
		frm.setVisible(true);
	}
}










