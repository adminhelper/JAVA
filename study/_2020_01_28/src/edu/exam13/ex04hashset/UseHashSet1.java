package edu.exam13.ex04hashset;

import java.util.HashSet;
import java.util.Iterator;
/*
HashSet의 비교 단계 2단계
1) 저장 공간을 찾는다   hashCode()
2) 저장 공간에서 값을 비교한다 equals()

HashSet은 내부적으로 동일한 데이터인지를 비교하는 메서드를
Object클래스가 물려준 hashCode()를 사용한다
equals
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
	
	// 원래 참조값을 리턴하게 되어있으나
	// 내용으로 비교를 해야 하므로 문자열로 변환
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	// 원래 참조값으로 비교하게 되어 있으나
	// 내용 비교로 오버라이딩 함
	@Override
	public boolean equals(Object obj) {
		Human hu = (Human)obj;
		return name.equals(hu.name) && age == hu.age;
	}

}
public class UseHashSet1 {
	public static void main(String[] args) {
		HashSet<Human> hSet = new HashSet<Human>();
		hSet.add(new Human("홍길동", 24));
		hSet.add(new Human("임꺽정", 33));
		hSet.add(new Human("장길산", 45));
		hSet.add(new Human("홍길동", 24));
		System.out.println("HashSet의 크기 : " + hSet.size());
		Iterator<Human> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}










