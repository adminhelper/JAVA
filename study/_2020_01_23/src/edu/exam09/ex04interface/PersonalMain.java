package edu.exam09.ex04interface;

public class PersonalMain {
	public static void main(String[] args) {
		// 구현 클래스 객체
		PersonalNumberStorageImpl storage = 
				new PersonalNumberStorageImpl(100);
		// 추상 클래스 변수 = 구현 클래스 객체
		// 이 추상 클래스는 구현된 것이 없으므로 상속된 것은 오로지
		// 메서드의 선언밖에 없다.
		
		// 그래도 컴파일러의 다형성지원으로 인해
		// 변수를 제공할 수 있고
		// 해당 변수에 자식 객체를 담으면
		// 자식의 기능을 사용할 수 있다.
		PersonalNumberStorage sto = storage;
		sto.addPersonalInfo("홍길동", "111111-111111");
		sto.addPersonalInfo("임꺽정", "222222-222222");
		System.out.println(sto.searchName("111111-111111"));
		System.out.println(sto.searchName("222222-222222"));
	}
}
