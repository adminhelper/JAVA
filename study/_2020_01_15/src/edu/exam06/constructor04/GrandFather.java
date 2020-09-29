package edu.exam06.constructor04;

//java의 모든 클래스는 컴파일되는 순간
//object클래스의 상속을 받는다.

public class GrandFather {
	int handsomeScore;
	
	GrandFather(int handsome){
		handsomeScore = handsome;
		System.out.println("GrandFather 생성자");
	}
	
	void handsome() {
		System.out.println("잘 생겼다~");
	}
}
