package edu.exam04.defclass01;
/*
변수 + 연산자 + 제어문 => 프로그래밍

프로그래밍의 규모가 커진다 => 절차지향(메서드)
; 메서드의 특징
 1) 동작위주로 기술
 2) 매개변수를 통해 외부로부터 값을 주입
 3) return을 통해 외부에 값을 반환

프로그래밍의 규모가 더 커진다 => 객체지향(객체)
; 동작위주의 메서드 ==> 아예 독립단위의 모듈
; 객체 = 변수 + 메서드
  사람 = 정신 + 육신
  사물 = 이치 + 모양
  문장 = 명사 + 동사
  
더 복잡해지니까 객체보다 더 독립적인 개념을 만들기는 어려우니 
분류 체계로 package를 만들었다.
*/
/*
<클래스의 구성>
클래스는 설계, 객체는 설계를 실제 현실세계에 표현한 것
요크셔믹스 몽실이
클래스는 자료형, 객체는 변수
객체는 실제 메모리에 로딩된 변수 공간(object, instance)
Class = Field(명사) + Method(동사)
*/
public class Puppy {
	// Field(멤버 변수)
	public String name;
	public String leftEye = "왼쪽 눈";
	public String rightEye = "오른쪽 눈";
	public String mouth = "입";
	public String nose = "코";
	public String tail = "꼬리";
	public String[] legs = new String[4];
	
	// Method(멤버 함수)
	public void pretty() {
		System.out.println(name+"가 " + tail + "을 흔든다");
	}
	public void eat() {
		System.out.println(name+"가 " + nose + "을 킁킁 거린다");
		System.out.println(name+"가 " + mouth + "을 벌려서 먹는다");
	}
	public void sleep() {
		System.out.println(name+"가 " + leftEye + "을 감는다");
		System.out.println(name+"가 " + rightEye + "을 감는다");
	}
	
	// main메서드는 사실 Puppy와 큰 관련이 없다.
	// 다만 java원칙을 세울 때 모든 Method는 
	// 무조건 어떤 클래스 아래에라도 들어가야 한다
	// 객체지향의 원칙에 충실하려고
	// main의 역할은 "프로그램의 시작"
	// 다만 Puppy객체가 만들어져 있지 않아도
	// 무조건 메모리에 로딩되어야 하므로
	// static 키워드를 붙여서
	// 실행되면 무조건 메모리로 main메서드를 올리게 된다.
	
	// static이 아닌 일반 메서드는 해당 객체가 생성될 때
	// 메모리에 로딩되게 된다.
	public static void main(String[] args) {
		Puppy mongsil = new Puppy();
		mongsil.name = "몽실이";
		
		Puppy baekgu = new Puppy();
		baekgu.name = "백구";
		
		mongsil.pretty();
		baekgu.pretty();
	}
}






