import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTabbedPaneEx extends JFrame{

	ImageIcon icon1, icon2, icon3, tabicon;	
	JButton b1, b2, b3;
	JTabbedPane jp;
	
	public JTabbedPaneEx(){

		super("JTabbedPane 테스트");
			
		icon1=new ImageIcon("../../images/image3.gif");
		icon2=new ImageIcon("../../images/image2.gif");
				
		tabicon=new ImageIcon("../../images/image1.gif");
		
		b1=new JButton("사진1",icon1);
		b2=new JButton("사진2",icon2);
				
		jp=new JTabbedPane();
		
		jp.addTab("탭1",new ImageIcon(""),b1);
		jp.addTab("탭2",new JPanel().add(new JTextArea(7,20)));
		jp.addTab("탭3",tabicon, b2,"탭사진도 추가 했습니다");
		
		add(jp);
		
		setBounds(300,300,300,300);
		setVisible(true);	
	}
	
	public static void main(String[] args){
		new JTabbedPaneEx();
	}
}

