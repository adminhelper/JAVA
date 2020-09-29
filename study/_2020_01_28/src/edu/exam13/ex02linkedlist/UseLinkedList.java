package edu.exam13.ex02linkedlist;

import java.util.LinkedList;

/*
링크드 리스트(연결 리스트) : 순서가 있다
1) 논리적으로 연속된 리스트
2) 필요할 때 공간을 할당하면 된다
3) 순차 검색은 ArrayList보다 느리다
4) 추가/삽입/삭제/확장 : 매우 유연하다
                  전후 Element만 서로 연결해주면 끝난다
5) 데이터의 삽입/삭제 변화가 심한 데이터 구조에 유리
*/
class Human{
	String name;
	int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}
public class UseLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + ", ");
		System.out.println();
		list.remove(0);
		for(int i : list)
			System.out.print(i + ", ");
		
		LinkedList<Human> humanList = new LinkedList<Human>();
		humanList.add(new Human("홍길동", 24));
		humanList.add(new Human("임꺽정", 33));
		humanList.add(new Human("장길산", 44));
		for(Human hu : humanList)
			System.out.println(hu); // hu.toString()호출

	}
}














