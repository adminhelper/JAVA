package edu.exam13.ex05treeset;

import java.util.Iterator;
import java.util.TreeSet;

/*
List 자료구조 : 시간의 순서대로 저장, 데이터 중복 가능
               ArrayList : 순차검색최고, 삽입삭제확장 성능X
               LinkedList: 검색그다지..., 삽입삭제확장 유연
Hash 자료구조 : 검색시 도출해낸 key로 검색을 한다
                         내부적으로는 key들이 정렬되어 있어 
                         저장공간을 Direct로 찾아간다
                         평균 검색 최고
                         시간의 순서 보장 X
                         저장시 내부에서 재정렬이 발생하므로 저장속도는 그다지...
               HashSet : 데이터 자체만 저장
               HashMap : key, value(데이터)
Tree 자료구조 : 저장시 내부적으로 이진 트리를 사용한다
                         저장시 정렬이 일어난다
                         정렬의 규칙을 우리가 정해줄 수 있다
                         저장시 데이터의 자동 정렬이 필요할 때
                         검색 속도는 이진 검색 속도처럼 빠른편
               TreeSet : 데이터 만 저장
               TreeMap : key, value
Stack        : 시간순서상 최신 데이터를 가장 빨리 획득
                         수식계산기, 상태머신
Queue        : 시간순서상 최초 데이터를 가장 빨리 획득
                          저장버퍼(택배화물차), 시뮬레이션
*/

//Set은 중복허용을 하지 않는다
public class UseTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		sTree.add(1);
		sTree.add(2);
		sTree.add(5);
		sTree.add(2);
		sTree.add(3);
		
		System.out.println("저장 개수 : " + sTree.size());
		
		Iterator<Integer> itr = sTree.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}









