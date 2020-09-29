package edu.exam06.constructor04;

// Child클래스는 Father상속받는다.

public class Child extends Father {
	float day;
	
	Child(){
		super(0, 0L);
		this.day = 0f;
		System.out.println("Child 생성자(0)");
	}
	
	Child(int score, long money, float day){
		super(score, money);	// Father의 생성자
		this.day = day;
		System.out.println("Child 생성자(1)");
	}
	
	void play() {
		System.out.println("인생이 즐겁다");
	}
}
