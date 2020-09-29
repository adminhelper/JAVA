package edu.exam06.polymorphism13;

//<다형성>
//; 상속에서 부모 클래스 변수를 이용해서
// 자식 객체들을 잘 사용하고 관리하는 문법
// 다양한 성격들을 잘 화합하도록 만드는 것

// 부모 클래스 변수 = 자식 객체
// C++, Java, C# 객체지향언어의 특징
// 자식 객체가 생성될 때 부모 객체가 먼저 만들어진다
// 자식 객체 내에는 부모 객체가 존재하기 때문에

// 부모님은 자식을 감싼다

//부모 참조 변수에 자식 객체를 담을 수 있다

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker base = new BaseEnSpeaker();
		base.setVolume(10);		// 물려받은 것
		// 부모님 세대에서는 접하지 못해서 이해를 못함
		//base.setBaseRate(20);	// 새로 추가한 것
		
		// 부모 클래스가 물려준 메서드를 
		// 자식이 재정의한 메서드를 
		// 부모 클래스 변수를 통해 호출할 경우
		// 참조 변수에 담긴 객체는 자식이므로
		// 자식의 재정의된 메서드가 호출된다.
		base.showCurrentState();// 재정의한 것
	}
}






