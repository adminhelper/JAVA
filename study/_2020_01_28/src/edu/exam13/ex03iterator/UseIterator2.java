package edu.exam13.ex03iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

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

public class UseIterator2 {
	
	 public static <T> void showAllData(Iterator<T> itr) {
		 while(itr.hasNext())
			 System.out.print(itr.next() + ", ");
		 System.out.println();
	 }
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("홍길동");
		arrList.add("장길산");
		arrList.add("임꺽정");
		showAllData(arrList.iterator());
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(10);
		llist.add(20);
		llist.add(30);
		llist.add(40);
		llist.add(50);
		showAllData(llist.iterator());
		HashSet<Human> hset = new HashSet<Human>(); 
		hset.add(new Human("아이유", 23));
		hset.add(new Human("마마무", 22));
		hset.add(new Human("오마이걸", 29));
		showAllData(hset.iterator());
	}
}




