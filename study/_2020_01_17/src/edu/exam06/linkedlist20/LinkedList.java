package edu.exam06.linkedlist20;

public class LinkedList {
	private Node head;	// 머리 노드
	private Node crnt;	// 현재 위치 노드
	
	public LinkedList() {
		// 아무 데이터도 없으므로 null
		head = new Node(); 
		crnt = head;
	}
	
	// 머리에 노드 삽입
	public void addHead(Node node) {
		// 2) -> 1)
		node.next = head.next;
		head.next = node;
		
		crnt = node;
		
		// 1) -> 2)
//		Node temp = head.next;
//		head.next = node;
//		node.next = temp;
	}
	
	// 꼬리에 노드 삽입
	public void addTail(Node node) {
		Node ptr = head;
		while(ptr.next!=null)
			ptr = ptr.next;
		
		ptr.next = node;
		node.next = null;
		
		crnt = node;
	}
	
	public void moveFirst() {
		crnt = head;
	}
	
	// 1) 현재 노드에 삽입
	public void insert(Node node) {
		
	}
	
	// 머리쪽 노드 삭제
	public void removeHead() {
		// 데이터 노드가 없을 때를 처리
		if(head.next == null) {
			crnt = head;
			return;
		}
		
		// 데이터 노드가 1개만 있을 때
		if(head.next.next == null) { 
			head.next = null;
			crnt = head;
		}else{	// 데이터 노드가 여러 개 일때
			head.next = head.next.next;
			crnt = head.next;
		}
	}
	
	// 꼬리쪽 노드 삭제
	public void removeTail() {
		Node ptr = head;
		Node pre = null;
		while(ptr.next!=null) {
			pre = ptr;		// 삭제할 대상 노드의 이전 노드
			ptr = ptr.next;
		}
		
		// 노드가 없을 때는 head의 이전이 없으므로 pre가 null
		if(pre!=null) {
			pre.next = null;
			crnt = pre;
		}
	}
	
	// 2) 학번이 동일한 노드를 검색
	public Node search(int stNum) {
		Node ptr = head;
		
		return ptr;
	}	
	
	// 3) 이름이 동일한 노드를  검색
	public Node search(String stName) {
		Node ptr = head;
		
		return ptr;
	}
	
	// 노드내의 학번과 이름이 동일한 노드를  검색
	public Node search(Node node) {
		Node ptr = head;
		Node pre = null;
		while(ptr.next!=null) {
			pre = ptr;
			ptr = ptr.next;			
			if(ptr.stNum == node.stNum && ptr.stName.equals(node.stName)) {
				crnt = ptr;
				return ptr;
			}
		}
		return ptr;
	}
	
	// 노드 p를 삭제
	public void remove(Node p) {
		Node ptr = head;
		Node pre = null;
		while(ptr.next!=null) {
			if(ptr == p) {
				pre.next = crnt.next;
				crnt = crnt.next;
			}
			pre = ptr;
			ptr = ptr.next;
		}
	}
	
	// 현재 노드를 삭제
	public void removeCurrentNode() {
		Node ptr = head;
		Node pre = null;
		while(ptr.next!=null) {
			if(ptr == crnt) {
				pre.next = crnt.next;
				crnt = crnt.next;
			}
			pre = ptr;
			ptr = ptr.next;
		}
	}
	
	// 모든 노드를 삭제
	public void clear() {
		head.next = null;
		crnt = head;
	}
	
	// 선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		boolean isEnable = true;
		
		if(crnt==null || crnt.next == null)
			return false;		// 이동 불가
		
		crnt = crnt.next;
		
		return isEnable;		
	}
	
	// 현재 노드를 출력
	public void printCurrentNode() {
		if(crnt == null)
			System.out.println("선택 노드 없습니다");
		else
			crnt.infoNode();
	}
	
	
	// 전체 노드 출력
	public void dump() {
		Node ptr = head.next;
		
		System.out.println("#####################");
		while(ptr!=null) {
			ptr.infoNode();
			ptr = ptr.next;
		}
	}
}
