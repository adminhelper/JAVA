package edu.exam18.ex15_textarea;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

class ButtonTextHandler implements ActionListener{
	JTextArea textArea;
	
	public ButtonTextHandler(JTextArea area) {
		textArea = area;
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("----------------------");
		System.out.println(textArea.getText());
		textArea.setText("모두 지웠습니다. \n");	// 새롭게 덮어쓰기
		textArea.append("원하는 내용 입력하세요. \n"); // 추가하기
	}	
}

public class JTextAreaSimpleModel {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JTextArea");
		frm.setBounds(120, 120, 250, 270);
		frm.setLayout(new FlowLayout());
		
		JTextArea textArea = new JTextArea(10, 20);
		textArea.append("원하는 내용 입력하세요. \n");
		// 문자열의 끝에 캐럿을 위치시켜라
		textArea.setCaretPosition(textArea.getText().length());
		
		textArea.setLineWrap(true); // 글자가 범위를 벗어나면 개행
		textArea.setWrapStyleWord(true);// 단어단위로 줄바꿈
		
		JButton btn = new JButton("Clear");
		btn.addActionListener(new ButtonTextHandler(textArea));
		frm.add(textArea); frm.add(btn);
		
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}









