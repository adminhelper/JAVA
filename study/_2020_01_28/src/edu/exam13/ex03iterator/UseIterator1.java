package edu.exam13.ex03iterator;

import java.util.HashSet;
import java.util.Iterator;

public class UseIterator1 {
	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		//LinkedList<String> list = new LinkedList<String>();
		HashSet<String> set = new HashSet<String>();
		HashSet<String> list = set;
		
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

