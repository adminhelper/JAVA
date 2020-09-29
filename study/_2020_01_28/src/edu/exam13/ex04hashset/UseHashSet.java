package edu.exam13.ex04hashset;

import java.util.HashSet;
import java.util.Iterator;

/*
Hash(검색 속도 최강)
; 데이터 => 특정 공식(방정식)으로 변형 y = x%3;
y(0) = 0;
y(1) = 1;
y(2) = 2;
y(3) = 0;
y(4) = 1;
 데이터를 value
 도출된 값을 key
 
 key를 정렬 -> key로 데이터를 저장할 방으로 정함
 0key   1key    2key
 0      1       2
 3      4       5
 6      7       8

Set(집합) : 중복 X
; {1, 2, 3}과 {3, 4, 5}의 합집합 = {1, 2, 3, 4, 5}
*/
public class UseHashSet {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("First");
		hSet.add("Second");
		hSet.add("Third");
		hSet.add("First");
		System.out.println("저장 데이터 수: " + hSet.size());
		Iterator<String> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}









