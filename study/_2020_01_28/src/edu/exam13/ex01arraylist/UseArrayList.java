package edu.exam13.ex01arraylist;

import java.util.ArrayList;

/*
Array List 구조
1) 물리적으로 연속적인 구조를 가진다
2) 순차검색으로는 가장 빠르다
3) 검색 : 운나쁘면 맨뒤까지 찾아야한다
               단, 인덱스를 알면 바로 찾아간다
4) 삽입 : 중간에 데이터를 넣을 때 뒤의 데이터를 1칸씩 전부 밀어야 함
5) 삭제 : 중간값을 삭제할 때 뒤의 데이터를 전부 1칸씩 당겨야 함
6) 확장 : 공간이 부족할 때 새로운 더 큰 공간을 할당하고 전부 복사함
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

public class UseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(11);
		arrList.add(22);
		arrList.add(33);
		arrList.add(44);
		arrList.add(55);
		for(int i=0;i<arrList.size();i++)
			System.out.print(arrList.get(i) + ", ");
		System.out.println();
		arrList.remove(0);
		for(int num : arrList)
			System.out.print(num + ", ");
		System.out.println();
		
		ArrayList<Human> humanList = new ArrayList<Human>();
		humanList.add(new Human("홍길동", 24));
		humanList.add(new Human("임꺽정", 33));
		humanList.add(new Human("장길산", 44));
		for(Human hu : humanList)
			System.out.println(hu); // hu.toString()호출
	}
}







