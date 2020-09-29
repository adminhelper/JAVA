package edu.exam09.ex04interface;

// 모든 메서드가 추상 메서드인 클래스
/*
public abstract class PersonalNumberStorage {
	public abstract void addPersonalInfo(String name, 
										String perNum);
	public abstract String searchName(String perNum);
}
*/

//모든 메서드가 추상메서드인 추상클래스는
//인터페이스로 바꿀 수 있다.
//그래서 추상클래스보다는 인터페이스로 표현한다.

//클래스의 상속은 extends
//인터페이스의 상속은 implements 를 사용한다

//인터페이스의 메서드는 자동으로 public abstract 속성이 
//부여된다.

// 인터페이스의 특징
// 1) 메서드만 선언되어 있고 구현된 것이 전혀 없다.
// 2) 당연히 객체를 만들 수 없다

// 인터페이스의 목적
// 1) 무조건 상속을 전제로 한다
// 2) 상속받은 자식 클래스의 객체를 인터페이스 매개변수로
//    일원화 할 수 있다
// 3) 인터페이스 배열은 자식 객체들을 모아서 관리할 수 있다.
// 4) 인터페이스를 정의하면 동시에 나눠서 구현이 가능하다
//    (인터페이스를 통해 클래스 간의 관계를 유연하게 할 수있다)

public interface PersonalNumberStorage {
	void addPersonalInfo(String name, String perNum);
	String searchName(String perNum);
}




