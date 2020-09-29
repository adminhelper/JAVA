package edu.exam06.constructor03;

// Child클래스는 Father상속받는다.

public class Child extends Father {
	float day = 365+1.0f/4;
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	void play() {
		System.out.println("인생이 즐겁다");
	}
}
