package edu.exam06.polymorphism13;

//Overloading - 과적
//메서드이름 동일 여러개
//
//Overriding - 올라탔다
//메서드를 재정의

public class BaseEnSpeaker extends Speaker {
	
	private int baseRate;
	
	// 부모의 기능에 추가함
	void showCurrentState() {		
		super.showCurrentState();
		System.out.println("베이스 크기");
	}

	// 부모 기능을 대신한다
//	void showCurrentState() {
//		System.out.println("베이스 크기;");
//		//super.showCurrentState();
//	}	
	
	void setBaseRate(int base) {
		baseRate = base;
	}
}







