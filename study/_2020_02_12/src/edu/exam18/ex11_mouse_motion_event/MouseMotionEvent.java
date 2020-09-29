package edu.exam18.ex11_mouse_motion_event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

class MouseMotionHandler implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.printf("Drag [%d, %d] \n", e.getX(), e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.printf("Move [%d, %d] \n", e.getX(), e.getY());		
	}	
}

public class MouseMotionEvent {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Mouse Motion");
		frm.setBounds(120, 120, 250, 150);
		frm.addMouseMotionListener(new MouseMotionHandler());
		
		frm.setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}




