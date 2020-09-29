package edu.exam13.ex03iterator;

import java.util.ArrayList;
import java.util.Iterator;

/*
iterator(반복자)
; 컬렉션에서 데이터 전체를 1개씩 가져올 때
 자료구조에 따라 서로 다른 메서드 호출을
 1) 일관된 방식으로 통일하여 사용하도록 한 것
 2) 다른 자료구조로 변경할 때 검색부분을 수정할 필요가 없다
*/
public class UseIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		// iterator를 사용해서 접근
		// 처음 위치를 가리킨다
		Iterator<String> itr = list.iterator();
		System.out.println("-------------------------");
		while(itr.hasNext()) {
			// 현재데이터 가져오고, 다음위치로 이동
			String cur = itr.next();
			System.out.print(cur + ", ");
			if(cur.equals("Third"))
				itr.remove();
		}
		System.out.println();
		System.out.println("-------------------------");
		itr = list.iterator();
		while(itr.hasNext())
			System.out.print(itr.next() + ", ");
		System.out.println();
	}
}









