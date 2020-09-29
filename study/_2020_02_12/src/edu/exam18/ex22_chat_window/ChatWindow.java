package edu.exam18.ex22_chat_window;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

class ButtonHandler implements ActionListener{
	JTextArea textArea;
	JTextField textField;
	
	public ButtonHandler(JTextArea area, JTextField field) {
		textArea = area;
		textField = field;
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = textField.getText();
		textArea.append(str + "\n"); // 추가하기
	}	
}

public class ChatWindow {
	public static void main(String[] args) {
		// 전체 창
		JFrame frm = new JFrame("채팅창");
		frm.setBounds(120, 120, 500, 500);	// 전체 창의 좌상단위치, 크기
		frm.setLayout(new BorderLayout(10, 10));	// 자식컴포넌트를 방향으로 배치하겠다
		
		JPanel panel0 = new JPanel();
		panel0.setLayout(new FlowLayout());
		JTextArea textArea = new JTextArea(24, 30);
		panel0.add(textArea);		
		JScrollPane scroll = new JScrollPane(textArea);// 스크롤 추가(textArea 다음에 추가해야 한다)
		panel0.add(scroll);
		JTextArea textArea1 = new JTextArea(24, 10);
		panel0.add(textArea1);		
		JScrollPane scroll1 = new JScrollPane(textArea1);// 스크롤 추가(textArea 다음에 추가해야 한다)
		panel0.add(scroll1);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		
    	JTextField textField = new JTextField(28);
		panel1.add(textField);
		
		JButton button = new JButton("전송");
		button.addActionListener(new ButtonHandler(textArea, textField));
		panel1.add(button);
		
		JButton button1 = new JButton("삭제");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		panel1.add(button1);
		
		frm.add(panel0, BorderLayout.NORTH);
		frm.add(panel1, BorderLayout.CENTER);
		
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}
