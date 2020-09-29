package edu.exam18.ex01_first_swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
Java 2D UI < C# 2D UI(WinForm)

AWT : OS따라 UI가 다르다
Swing : OS가 달라도 UI 균일
SWT
JavaFX
...

사용 빈도는 낮지만 Desktop Programming
프로그래밍 방식 
1.이벤트 프로그래밍
: Java GUI, Android, WinForm 메커니즘 대동소이
2. 한번 만들면 다른 OS에도 돌아간다
3. Project 사용
*/
public class FirstSwing {
	public static void main(String[] args) {
		// 프레임 창 생성
		JFrame frm = new JFrame("First Swing");
		// 프레임 창 위치와 크기 지정
		frm.setBounds(120, 120, 400, 100);
		// 프레임창의 자식 컨트롤의 배치 순서 지정
		frm.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("My Button");
		JButton btn2 = new JButton("Your Button");
		JButton btn3 = new JButton("Our Button");
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		frm.setVisible(true);
	}
}















