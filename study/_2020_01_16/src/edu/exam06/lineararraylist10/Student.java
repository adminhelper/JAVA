package edu.exam06.lineararraylist10;

// 리스트에서는 이런 그룹을 Node, Element라 부른다

public class Student {
	int stNum;
	String stName;
	
	public Student(int stNum, String stName) {
		this.stNum = stNum;
		this.stName = stName;
	}
	
	public void infoStudent() {
		System.out.println("------------------------");
		System.out.println("학번: " + stNum);
		System.out.println("이름: " + stName);
	}
}
