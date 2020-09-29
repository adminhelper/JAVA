package edu.exam09.ex02linkedlist;

public class LinkedList {
	private Node head;	// 머리 노드
	private Node crnt;	// 현재 위치 노드
	
	public LinkedList() {
		head = new Node(); 
		crnt = head;
	}
	
	// 머리에 노드 삽입
	public void addHead(Node node) {
		// 2) -> 1)
		node.next = head.next;
		head.next = node;
		
		// * 이중연결리스트 추가 부분
		node.next.prev = node;		
		node.prev = head;	
		
		crnt = node;
		
		// 1) -> 2)
//		Node temp = head.next;
//		head.next = node;
//		node.next = temp;
	}
	
	// 꼬리에 노드 삽입
	public void addTail(Node node) {
		Node ptr = head;
		
		// ptr.next가 null일 때 while 탈출
		while(ptr.next!=null)
			ptr = ptr.next;
		
		ptr.next = node;
		node.next = null;
		
		// * 이중연결리스트 추가 부분
		node.prev = ptr;
		
		crnt = node;
	}
	
	public void moveFirst() {
		crnt = head;
	}
	
	// * 이중연결리스트 추가 부분
	public void moveTail() {
		Node ptr = head;
		
		// ptr.next가 null이 되면
		// 마지막 노드이다.
		while(ptr.next!=null) {
			ptr = ptr.next;
		}
		
		crnt = ptr;
	}
	
	// * 이중연결리스트 추가 부분
	// 1) 현재 노드에 삽입
	//  현재 노드 위치에 삽입하고
	//  현재 노드를 한 칸뒤로 이동한다
	public void insert(Node node) {
		// 헤드는 처음 시작이므로 뒤로 이동할 수 없어서
		// addHead로 처리한다.
		if(crnt == head)
			addHead(node);
		else {
			// 삽입노드next와 crnt노드 연결
			node.next = crnt;
			// crnt이전노드next와 삽입노드 연결
			crnt.prev.next = node;
			
			// 삽입노드prev를 crnt의 이전노드로 연결
			node.prev = crnt.prev;
			// crnt의 이전노드를 삽입노드로 연결
			crnt.prev = node;
		}
		crnt = node;
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
			
			// * 이중연결리스트 추가 부분
			crnt.prev = head;
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
		
		while(ptr.next!=null) {
			ptr = ptr.next;
			if(ptr.stNum == stNum) {
				System.out.println("찾았다!");
				crnt = ptr;
				return ptr;
			}
		}	
			
		crnt = ptr;	// 마지막 노드
		return null;
	}	
	
	// 3) 이름이 동일한 노드를  검색
	public Node search(String stName) {
		Node ptr = head;
		
		while(ptr.next!=null) {
			ptr = ptr.next;
			if(ptr.stName.equals(stName)) {
				System.out.println("찾았다!");
				crnt = ptr;
				return ptr;
			}
		}	
			
		crnt = ptr;
		return null;
	}
	
	// 노드내의 학번과 이름이 동일한 노드를  검색
	public Node search(Node node) {
		Node ptr = head;
		
		while(ptr.next!=null) {
			ptr = ptr.next;
			if(ptr.stNum == node.stNum &&
			   ptr.stName.equals(node.stName)) {
				System.out.println("찾았다!");
				crnt = ptr;
				return ptr;
			}
		}	
			
		crnt = ptr;
		return null;
	}
	
	// 노드 p를 삭제
	public void remove(Node p) {
		Node ptr = head;
		while(ptr.next!=null) {
			if(ptr == p) {
				ptr.prev.next = ptr.next;
				ptr.next.prev = ptr.prev;
				crnt = ptr.next;
				break;
			}
			ptr = ptr.next;
		}
	}
	
	// 현재 노드를 삭제
	public void removeCurrentNode() {
		Node ptr = head;
		while(ptr.next!=null) {
			if(ptr == crnt) {
				crnt.prev.next = crnt.next;
				crnt.next.prev = crnt.prev;
				crnt = crnt.next;
				break;
			}
			ptr = ptr.next;
		}
	}
	
	// 모든 노드를 삭제
	public void clear() {
		head.next = null;
		crnt = head;
	}
	
	// * 이중연결리스트 추가 부분
	public boolean prev() {
		boolean isEnable = true;
		
		if(crnt==head)
			return false;
		
		crnt = crnt.prev;
		
		return isEnable;
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
