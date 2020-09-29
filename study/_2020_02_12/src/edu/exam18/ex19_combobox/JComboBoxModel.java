package edu.exam18.ex19_combobox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

class MyFriend{
	String name;
	int age;
	
	public MyFriend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 콤보박스 목록에 표현될 데이터
	public String toString() {return name;}
	
	public void showFriendInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}

class ChoiceHandler implements ItemListener{

	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println("Selected...");
			MyFriend mf = (MyFriend)e.getItem();
			mf.showFriendInfo();
		}else {
			System.out.println("DeSelected...");
			MyFriend mf = (MyFriend)e.getItem();
			mf.showFriendInfo();
		}
	}	
}

class TextChangedHandler implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		if((e.getActionCommand()).compareTo("comboBoxEdited")==0) {
			System.out.println("ComboBox Edited");
		}else {
			System.out.println("ComboBox Changed");
		}
	}	
}

public class JComboBoxModel {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice Component");
		frm.setBounds(120, 120, 250, 120);
		frm.setLayout(new GridLayout(0, 2));
		
		// 콤보박스에 추가할 데이터
		// Vector : 동적 배열
		Vector<MyFriend> friend = new Vector<MyFriend>();
		friend.add(new MyFriend("홍길동", 22));
		friend.add(new MyFriend("임꺽정", 33));
		friend.add(new MyFriend("장길산", 44));
		friend.add(new MyFriend("일지매", 55));
		
		JLabel label1 = new JLabel("  ComboBox");
		JComboBox cmbBox1 = new JComboBox(friend);
		cmbBox1.setMaximumRowCount(3);// 한번에 보여줄 목록 수
		// 이벤트 리스너 객체 연결
		// ICar, IMp3 의존성 주입
		cmbBox1.addItemListener(new ChoiceHandler());
		
		JLabel label2 = new JLabel("  Editable ComboBox");
		JComboBox cmbBox2 = new JComboBox(friend);
		cmbBox2.setEditable(true);// 수정가능한
		cmbBox2.addActionListener(new TextChangedHandler());

		frm.add(label1); frm.add(cmbBox1);
		frm.add(label2); frm.add(cmbBox2);
		
		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}










