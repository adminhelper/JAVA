package edu.exam06.overriding07;

// Father클래스는 GrandFather를 상속받았다.

public class Father extends GrandFather {
	public long money;
	
	// 부모의 생성자가 매개변수변수가 필요하면
	// 자식생성자에서 매개변수를 전달해야 한다
	public Father(int score, long money){
		super(score);	// GrandFather의 생성자 호출
		this.money = money;
		System.out.println("Father 생성자");
	}

	public void wealth() {
		System.out.println("돈을 많이 벌었다");
	}
}
