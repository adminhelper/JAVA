package edu.exam18.ex09_window_event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class WindowEventHandler implements WindowListener{
	
	String frameInfo;
	
	public WindowEventHandler(String info) {
		frameInfo = info;
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println(frameInfo + " windowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JFrame frm = (JFrame)e.getWindow();
		frm.dispose();	// 프레임창의 리소스 메모리 해제
		//System.exit(0);	// 프로세스 자체가 종료
		System.out.println(frameInfo + " windowClosing");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println(frameInfo + " windowClosed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println(frameInfo + " windowIconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println(frameInfo + " windowDeiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println(frameInfo + " windowActivated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println(frameInfo + " windowDeactivated");
	}
}

public class JFrameWindowEvent {
	public static void main(String[] args) {
		JFrame frmOne = new JFrame("Frame One");
		JFrame frmTwo = new JFrame("Frame Two");
		
		frmOne.setBounds(120, 120, 250, 150);
		frmTwo.setBounds(380, 120, 250, 150);
		
		frmOne.addWindowListener(new WindowEventHandler("Frame One"));
		frmTwo.addWindowListener(new WindowEventHandler("Frame Two"));
		
		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
		
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}






