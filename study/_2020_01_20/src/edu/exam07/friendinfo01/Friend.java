package edu.exam07.friendinfo01;

// 저장 관리 데이터
// VO, DTO
// Model
/*
Friend클래스의 목적
1) 일부 기능을 물려준다
2) Controller에서 자식 객체들을 관리하는 배열변수로서 동작한다
  (즉, Friend객체는 만들지 않는다)
  
이럴 때는 일반 구현 클래스 => 추상 클래스로 만드는 것이 낫다

추상메서드가 1개이상인 클래스 == 추상 클래스
1) 추상클래스는 객체제작에 목적이 없다
2) 자식객체를 담는 변수로서 동작
3) 일부기능은 사전구현해서 상속하지만
   일부기능은 미리 구현하는 것이 어려울 때
  선언만 해놓고 자식클래스보고 구현하라고
  하는 클래스
*/

public abstract class Friend {
	protected String name;
	protected String phoneNum;
	protected String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	// 전체 정보 출력
	public void showData() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phoneNum);
		System.out.println("주소: " + addr);
	}
	// 추상 메서드
	// 구현부는 존재하지 않고 선언만 존재하는 메서드
	// 자식이 물려받아서 구현해하는 목적으로 선언
	public abstract void showBasicData();
}



