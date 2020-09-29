/*
ProgressBarDemo

*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JProgressBarEx extends JFrame {
	
	JProgressBar bar = new JProgressBar();
	JButton btStart = new JButton("Start");
	ProgressMonitor monitor;
	
	public JProgressBarEx() {
		
		super("JProgressBar 테스트");
		
		add(bar, BorderLayout.CENTER);
		add(btStart, BorderLayout.EAST);
				
		monitor = new ProgressMonitor(this, "진행중 ", "작업중", 0, 100) ;
        
		pack();
		setVisible(true);

		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task t = new Task();
				t.start();
			}
		};

		btStart.addActionListener(action);
	}
	
	// task inner class
	class Task extends Thread {
		
		public void run() {

			int count = 0;
			bar.setValue(0);
			monitor.setProgress(0);
			
			while(count < bar.getMaximum()) {
				count ++;
				bar.setValue(count);
				monitor.setProgress(count);
				try {
					sleep(300);
				}catch(Exception ex) { ex.printStackTrace(); }
			}
		}
	}
		
	public static void main(String[] args) {
		new JProgressBarEx();		
	}
	
}