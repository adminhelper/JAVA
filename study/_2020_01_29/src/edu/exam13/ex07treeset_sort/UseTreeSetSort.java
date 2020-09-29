package edu.exam13.ex07treeset_sort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//TreeSet은 정렬이 이루어지는 자료구조이므로
//우리가 정렬규칙을 정해준다

// TreeSet은 Comparable인터페이스 상속을 통해 정렬 규칙을 정해줘야 한다
// 정렬시 정렬대상 클래스에 Comparable을 상속받게 하고
// compareTo에는 가장 표준적인 정렬을 둔다.
// 다른 방식의 정렬은 Comparator를 상속받은 클래스를 생성해서
// 부가적인 정렬을 하도록 한다.

// 나이로 정렬
class AgeComparator implements Comparator<Human>{
	public int compare(Human h0, Human h1) {
		return h0.age - h1.age;
	}
}
// 이름의 길이로 정렬
class NameLenComparator implements Comparator<Human>{
	public int compare(Human h0, Human h1) {
		return h0.name.length() - h1.name.length();
	}
}

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
	// 가장 표준적인 정렬 규칙을 정해준다
	// 알파벳 우선순위
	public int compareTo(Human h) {
		return name.compareTo(h.name);
	}
}

public class UseTreeSetSort {
	public static void main(String[] args) {
//		TreeSet<Human> sTree = new TreeSet<Human>();
//		TreeSet<Human> sTree = new TreeSet<Human>(new AgeComparator());
		TreeSet<Human> sTree = new TreeSet<Human>(new NameLenComparator());
		sTree.add(new Human("Lee", 24));
		sTree.add(new Human("HongK", 33));
		sTree.add(new Human("KimJ", 21));
		
		Iterator<Human> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}





