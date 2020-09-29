package edu.exam06.access05;

//java의 모든 클래스는 컴파일되는 순간
//object클래스의 상속을 받는다.

public class GrandFather {
	public int handsomeScore;
	
	public GrandFather(int handsome){
		handsomeScore = handsome;
		System.out.println("GrandFather 생성자");
	}
	
	public void handsome() {
		System.out.println("잘 생겼다~");
	}
}
