package edu.exam18.ex17_checkbox_radiobutton;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

class CheckBoxHandler implements ItemListener {
	JRadioButton btn1;
	JRadioButton btn2;
	JRadioButton btn3;

	public CheckBoxHandler(JRadioButton b1, JRadioButton b2, JRadioButton b3) {
		btn1 = b1;
		btn2 = b2;
		btn3 = b3;
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {// 선택상태
			btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
		} else {
			btn1.setEnabled(false);
			btn2.setEnabled(false);
			btn3.setEnabled(false);
		}
	}
}

public class JCheckBoxAndJRadioButton {
	public static void main(String[] args) {
		JFrame frm = new JFrame("Choice a component");
		frm.setBounds(120, 120, 200, 200);
		// 세로는 자유롭게, 가로는 1열
		frm.setLayout(new GridLayout(0, 1));

		JCheckBox checkBox = new JCheckBox("Are you a programmer?");

		JRadioButton rbtn1 = new JRadioButton("I like python");
		JRadioButton rbtn2 = new JRadioButton("I like javascript");
		JRadioButton rbtn3 = new JRadioButton("I like Java", true);// 체크상태
		// 그룹에 속해있는 버튼들간에 1개만 선택가능(논리적 연결)
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rbtn1);
		btnGroup.add(rbtn2);
		btnGroup.add(rbtn3);

		frm.add(checkBox);
		frm.add(rbtn1);
		frm.add(rbtn2);
		frm.add(rbtn3);

		// 라디오 버튼들이 초기 비활성화 상태
		rbtn1.setEnabled(false);
		rbtn2.setEnabled(false);
		rbtn3.setEnabled(false);

		// 체크박스 이벤트 처리
		checkBox.addItemListener(new CheckBoxHandler(rbtn1, rbtn2, rbtn3));
		// 라디오 버튼들의 익명 클래스 객체를 사용한 이벤트 처리
		rbtn1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like Python too.");
			}
		});
		rbtn2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like Javascript too.");
			}
		});
		rbtn3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					System.out.println("I like Java too.");
			}
		});

		frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frm.setVisible(true);
	}
}
