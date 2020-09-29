package edu.exam06.linkedlist20;

public class ListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		// 데이터 꼬리에 삽입
		/*
		list.addTail(new Node(1111, "홍길동"));
		list.dump();	// 전체 출력
		list.addTail(new Node(2222, "임꺽정"));
		list.dump();	// 전체 출력
		list.addTail(new Node(3333, "장길산"));
		list.dump();	// 전체 출력
		list.removeHead();
		list.dump();
		list.removeTail();
		list.dump();
		*/
		list.addTail(new Node(1111, "홍길동"));
		list.addTail(new Node(2222, "임꺽정"));
		list.addTail(new Node(3333, "장길산"));
		list.addTail(new Node(4444, "허균"));
		list.addTail(new Node(5555, "광해군"));
		list.addTail(new Node(6666, "일지매"));
		
		Node node = new Node(1111, "홍길동");
		Node ptr = list.search(node);
		list.printCurrentNode();
		list.next();
		list.printCurrentNode();
		list.next();
		list.printCurrentNode();
		list.next();
		
		
	}
}






