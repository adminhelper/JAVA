package edu.exam18.ex02_event_handler;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
이벤트 프로그래밍
2D GUI는 사용자의 마우스 입력/키보드 입력을 대응해서
프로그래밍을 처리해야 한다

이벤트 핸들러 (함수/메서드)
이벤트 대해서 어떤 처리를 할지 이벤트에 대응해서 처리하는 메서드
*/

// 이벤트 리스너 클래스
class MouseEventHandler implements MouseListener{

	// 이벤트 핸들러 메서드
	@Override
	public void mouseClicked(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();		
		System.out.println(btn.getText() + " 마우스 클릭");
		JOptionPane.showMessageDialog(null, "기본 알림창입니다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();		
		System.out.println(btn.getText() + " 마우스 눌림");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();		
		System.out.println(btn.getText() + " 마우스 풀림");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();		
		System.out.println(btn.getText() + " 마우스 진입");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getComponent();		
		System.out.println(btn.getText() + " 마우스 탈출");
	}
	
}

public class EventHandler {
	public static void main(String[] args) {
		// 프레임 창을 생성
		JFrame frm = new JFrame("First Swing");
		// 위치, 크기
		frm.setBounds(120, 120, 400, 100);
		// 일렬로 배치되어라
		frm.setLayout(new FlowLayout());
		
		// 마우스 이벤트 처리 객체 생성
		// 버튼들과 이벤트 리스너 객체를 연결
		MouseListener listener = new MouseEventHandler();
		
		JButton btn1 = new JButton("My Button");
		btn1.addMouseListener(listener);
		
		JButton btn2 = new JButton("Your Button");
		btn2.addMouseListener(listener);
		
		JButton btn3 = new JButton("Our Button");
		btn3.addMouseListener(listener);
		
		// 프레임 창에 버튼들을 포함시킨다
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		
		frm.setVisible(true);// 눈에 보이게 해줘
	}
}









