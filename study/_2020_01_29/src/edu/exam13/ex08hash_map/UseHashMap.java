package edu.exam13.ex08hash_map;

import java.util.HashMap;

/*
Hash는 Hash알고리즘으로 정확한 위치에 데이터 저장/검색
Set : value값을 Hash화 해서 저장/검색
Map : key/value가 있고 key를 Hash화 해서 위치를 지정후
      value를 저장한다
      key : 계좌번호, 금고열쇠, 날짜
      value: 돈, 보물, 일기
Map : == 유사어 Dictionary 구조
*/

//key는 중복이 될수 없다
//같은 키로 데이터를 넣으면 덮어쓴다
public class UseHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = 
				new HashMap<Integer, String>();
		hMap.put(3, "금괴 1톤");
		hMap.put(5, "1억 달러");
		hMap.put(7, "다이어몬드 20캐럿");
		hMap.put(9, "은 10킬로그램");
		
		System.out.println(hMap.get(3));
		System.out.println(hMap.get(7));
		hMap.remove(7);
		System.out.println(hMap.get(7));
	}
}











