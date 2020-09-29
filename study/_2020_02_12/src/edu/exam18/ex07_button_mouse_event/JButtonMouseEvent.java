package edu.exam18.ex07_button_mouse_event;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MouseEventHandler implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("버튼 마우스 클릭");	
		String input = 
				JOptionPane.showInputDialog("마우스 클릭되었습니다");
		int sel = JOptionPane.showConfirmDialog(null, input);
		switch(sel) {
		case JOptionPane.YES_OPTION:
			System.out.println("yes");
			break;
		case JOptionPane.NO_OPTION:
			System.out.println("no");
			break;
		case JOptionPane.CANCEL_OPTION:
			System.out.println("cancel");
			break;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class JButtonMouseEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JButton Disable");
		frm.setBounds(120, 120, 250, 150);
		frm.setLayout(new FlowLayout());
		
		MouseListener mouseHandler = new MouseEventHandler();
		JButton btn1 = new JButton("Button One");
		btn1.addMouseListener(mouseHandler);
		JButton btn2 = new JButton("Button Two");
		btn2.addMouseListener(mouseHandler);
		
		frm.add(btn1);
		frm.add(btn2);
		btn1.setEnabled(false);
		
		frm.setVisible(true);
	}
}












