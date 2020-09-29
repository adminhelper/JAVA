package edu.exam09.ex02linkedlist;

public class Node {
	// 데이터 영역
	int stNum;
	String stName;
	
	// 이전 객체위치를 가리키는 참조변수
	Node prev; // * 이중연결리스트 추가 부분
	// 다음 객체위치를 가리키는 참조변수
	Node next;
	
	public Node() {
		this.stNum = 0;
		this.stName = null;
		this.next = null;
		this.prev = null;// * 이중연결리스트 추가 부분
	}
	
	public Node(int stNum, String stName) {
		this.stNum = stNum;
		this.stName = stName;
		this.next = null;
		this.prev = null;// * 이중연결리스트 추가 부분
	}
	
	public void infoNode() {
		System.out.println("------------------------");
		System.out.println("학번: " + stNum);
		System.out.println("이름: " + stName);
	}
}
