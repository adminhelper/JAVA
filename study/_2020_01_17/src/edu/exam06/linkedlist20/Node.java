package edu.exam06.linkedlist20;

public class Node {
	// 데이터 영역
	int stNum;
	String stName;
	
	// 다음 객체위치를 가리키는 참조변수
	Node next;
	
	public Node() {
		this.stNum = 0;
		this.stName = null;
		this.next = null;
	}
	
	public Node(int stNum, String stName) {
		this.stNum = stNum;
		this.stName = stName;
		this.next = null;
	}
	
	public void infoNode() {
		System.out.println("------------------------");
		System.out.println("학번: " + stNum);
		System.out.println("이름: " + stName);
	}
}
