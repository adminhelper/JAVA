package edu.exam13.ex06treeset_sort;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet은 정렬이 이루어지는 자료구조이므로
//우리가 정렬규칙을 정해준다

// TreeSet은 Comparable인터페이스 상속을 통해 정렬 규칙을 정해줘야 한다

class Human implements Comparable<Human>{
	String name;
	int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
	// 정렬 규칙을 정해준다
	// 이름 길이
	public int compareTo(Human h) {
		if(name.length() > h.name.length())
			return 1;
		else if(name.length() < h.name.length())
			return -1;
		else 
			return 0;
	}
	// 알파벳 우선순위
//	public int compareTo(Human h) {
//		return name.compareTo(h.name);
//	}
	// 나이 순
//	public int compareTo(Human h) {
//		if(age > h.age)
//			return 1;
//		else if(age < h.age)
//			return -1;
//		else
//			return 0;
//	}
}

public class UseTreeSetSort {
	public static void main(String[] args) {
		TreeSet<Human> sTree = new TreeSet<Human>();
		sTree.add(new Human("Lee", 24));
		sTree.add(new Human("HongK", 33));
		sTree.add(new Human("KimJ", 21));
		
		Iterator<Human> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}











