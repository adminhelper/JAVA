package edu.exam18.ex12_adapter_event_handler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

//MouseListener는 인터페이스이고 모든 마우스의 이벤트 핸들러를
//구현해야만한다
//이것이 부담스럽다
//그래서 원하는 이벤트 핸들러 메서드만 구현할 수 있도록
//제공해주는 MouseAdapter를 사용해보겠다

class MouseEventHandler extends MouseAdapter{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
	}	
}

public class AdapterEventHandling {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120, 120, 250, 150);
		frm.addMouseListener(new MouseEventHandler());
		
		frm.setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}







