package edu.exam13.ex09tree_map;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class UseTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = 
				new TreeMap<Integer, String>();
		tMap.put(1, "data1");
		tMap.put(3, "data3");
		tMap.put(5, "data5");
		tMap.put(2, "data2");
		tMap.put(4, "data4");
		
		System.out.println(tMap.get(3));
		System.out.println(tMap.get(5));
		tMap.remove(5);
		System.out.println(tMap.get(5));
		System.out.println("--------------------------");
		
		NavigableSet<Integer> navi = tMap.navigableKeySet();
		Iterator<Integer> itr = navi.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.print(key + ":" + tMap.get(key) + ", ");
		}
		System.out.println();
		
		itr = navi.descendingIterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.print(key + ":" + tMap.get(key) + ", ");
		}
	}
}








