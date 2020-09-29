package edu.exam18.ex23_chat_window;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ChatWindow {
	public static void main(String[] args) {
		JFrame frm = new JFrame("채팅창");
		frm.setBounds(120, 120, 500, 500);
		GridBagLayout gridBag = new GridBagLayout();
		frm.setLayout(gridBag);
		
		JPanel panel0 = new JPanel();
		panel0.setLayout(new FlowLayout());
		JTextArea textArea0 = new JTextArea(25, 25);
		JScrollPane scroll0 = new JScrollPane(textArea0);// 스크롤 추가(textArea 다음에 추가해야 한다)
		JTextArea textArea1 = new JTextArea(25, 10);
		JScrollPane scroll1 = new JScrollPane(textArea1);// 스크롤 추가(textArea 다음에 추가해야 한다)

		panel0.add(scroll0);
		panel0.add(scroll1);
		JTextField textField = new JTextField(36);
		JButton button = new JButton("전송");
		
		gridInsert(frm, gridBag, panel0, 0, 0, 3, 2);
		gridInsert(frm, gridBag, textField, 0, 2, 2, 1);
		gridInsert(frm, gridBag, button, 2, 2, 1, 1);
		
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
	
	public static void gridInsert(JFrame frm, GridBagLayout gridBag, Component c, int x, int y, int w, int h) {
		GridBagConstraints gridConst = new GridBagConstraints();
		gridConst.fill = GridBagConstraints.BOTH;
		gridConst.gridx = x;
		gridConst.gridy = y;
		gridConst.gridwidth = w;
		gridConst.gridheight = h;
		gridBag.setConstraints(c, gridConst);
		frm.add(c);
	}
}














