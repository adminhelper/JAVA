package edu.exam06.constructor03;

// Father클래스는 GrandFather를 상속받았다.

public class Father extends GrandFather {
	long money = 999999999999999L;
	
	Father(){
		System.out.println("Father 생성자");
	}
	
	void wealth() {
		System.out.println("돈을 많이 벌었다");
	}
}
