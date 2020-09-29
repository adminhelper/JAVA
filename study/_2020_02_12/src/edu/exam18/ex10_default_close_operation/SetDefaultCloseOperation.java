package edu.exam18.ex10_default_close_operation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SetDefaultCloseOperation {
	public static void main(String[] args) {
		JFrame frmOne = new JFrame("Frame One");
		JFrame frmTwo = new JFrame("Frame Two");
		
		frmOne.setBounds(120, 120, 250, 150);
		frmTwo.setBounds(380, 120, 250, 150);
		
		frmOne.add(new JButton("Button One"));
		frmTwo.add(new JButton("Button Two"));
		
		// 창이 닫힐 때 dispose()를 호출해라
		frmOne.setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
		frmTwo.setDefaultCloseOperation(
				WindowConstants.DISPOSE_ON_CLOSE);
		
		frmOne.setVisible(true);
		frmTwo.setVisible(true);
	}
}










