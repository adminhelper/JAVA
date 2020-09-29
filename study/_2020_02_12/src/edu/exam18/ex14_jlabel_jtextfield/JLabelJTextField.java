package edu.exam18.ex14_jlabel_jtextfield;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

class PasswordHandler implements ActionListener{
	JTextField id;
	JPasswordField pw;
	
	public PasswordHandler(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("ID: " + id.getText());
		System.out.println("Password: " + new String(pw.getPassword()));
		id.setText("");
		pw.setText("");
	}

}

public class JLabelJTextField {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(2, 2));
		
		JLabel idLabel = new JLabel("ID ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);	// 10은 가로길이
		
		JLabel pwLabel = new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');// 문자를 *로 변환해서 보여줘라
		
		// pwText에서 Enter를 치면 이벤트 액션이 동작한다
		pwText.addActionListener(new PasswordHandler(idText, pwText));
		
		frm.add(idLabel); frm.add(idText);
		frm.add(pwLabel); frm.add(pwText);
		
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}








