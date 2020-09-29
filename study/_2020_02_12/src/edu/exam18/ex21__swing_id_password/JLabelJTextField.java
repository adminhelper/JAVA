package edu.exam18.ex21__swing_id_password;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		frm.setBounds(120, 120, 360, 500);
		frm.setLayout(new GridLayout(3, 1));
		frm.setResizable(false);
		
		JLabel idLabel = new JLabel("ID ", SwingConstants.RIGHT);
		JTextField idText = new JTextField(10);	// 10은 가로길이
		
		JLabel pwLabel = new JLabel("Password ", SwingConstants.RIGHT);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');// 문자를 *로 변환해서 보여줘라
		
		JButton btn1 = new JButton("로그인");
		
		JButton btn2 = new JButton("비밀번호");
		
		// pwText에서 Enter를 치면 이벤트 액션이 동작한다
		pwText.addActionListener(new PasswordHandler(idText, pwText));
		

		JPanel panelUp = new JPanel();	// 프레임 창의 위 부분 비어있는 영역 패널
		panelUp.setLayout(null);
		JPanel panelMiddle = new JPanel();	// 프레임 창의 가운데 부분 다른 자식 패널 모음 부모 패널
		panelMiddle.setLayout(new GridLayout(3, 1));
		JPanel panelDown = new JPanel();	// 프레임 창의 아래 부분 비어있는 영역 패널
		panelDown.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(idLabel); 
		panel1.add(idText);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(pwLabel); 
		panel2.add(pwText);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.add(btn1); 
		panel3.add(btn2);

		panelMiddle.add(panel1);
		panelMiddle.add(panel2);
		panelMiddle.add(panel3);
		
		frm.add(panelUp);		// 프레임 위에 비어있는 패널 배치
		frm.add(panelMiddle);	// 프레임 가운데에 패널 모음 배치
		frm.add(panelDown);		// 프레임 아래에 비어있는 패널 배치
	
		
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}








