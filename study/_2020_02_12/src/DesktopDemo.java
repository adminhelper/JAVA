/*

DesktopDemo


*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DesktopDemo extends JFrame implements ActionListener {

	// components
	JDesktopPane desktop = new JDesktopPane();
	
	// menuitem
	JMenuItem openItem = new JMenuItem("Open");
	JMenuItem closeItem = new JMenuItem("Close");
	JMenuItem exitItem = new JMenuItem("Exit");

	// file chooser
	JFileChooser chooser = new JFileChooser();
	
	// Constructor
	public DesktopDemo() {
		
		super("DesktopDemo");
		
		buildGUI();
		
	}
	
	// build gui
	void buildGUI() {
    	
		getContentPane().add(desktop, BorderLayout.CENTER);
		
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu fileMenu = new JMenu("File");
		menubar.add(fileMenu);
		
		fileMenu.add(openItem);
		fileMenu.add(closeItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		openItem.addActionListener(this);
		closeItem.addActionListener(this);
		exitItem.addActionListener(this);
				
	}

	// open frame
	public void openFrame() {
	
		String path = "";
		String name = "";
		
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
       path = chooser.getSelectedFile().getPath();
       name = chooser.getSelectedFile().getName();
    }
    else {
    		return;
    }
 
		JInternalFrame frame = new JInternalFrame(name, true, true, true, true );
		JLabel imageLabel = new JLabel(new ImageIcon(path));
		frame.getContentPane().setBackground(Color.white);
		frame.getContentPane().add(imageLabel);
		frame.setSize(200, 200);
		
		desktop.add(frame);
		frame.setVisible(true);
		
		
	}
	
	// close frame
	public void closeFrame() {
	
		JInternalFrame frame = desktop.getSelectedFrame();
		if(frame == null) { return; }
		
		frame.setVisible(false);
		frame.dispose();
		
	}
	
	
	// action performed
	public void actionPerformed(ActionEvent e) {
	
		Object obj = e.getSource();
		
		if(obj == openItem) {
			openFrame();
		}
		else if(obj == closeItem) {
			closeFrame();
		}
		else if(obj == exitItem) {
		
			setVisible(false);
			dispose();
			System.exit(0);
			
		}
		
	}
	
	// main
	public static void main(String[] args) {
	
		DesktopDemo demo = new DesktopDemo();
		demo.setSize(400,500);
		demo.setVisible(true);
		
	}

}
