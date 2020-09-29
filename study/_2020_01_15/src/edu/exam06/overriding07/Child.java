package edu.exam06.overriding07;

// Child클래스는 Father상속받는다.

public class Child extends Father {
	public float day;
	
	public Child(){
		super(0, 0L);
		this.day = 0f;
		System.out.println("Child 생성자(0)");
	}
	
	public Child(int score, long money, float day){
		super(score, money);	// Father의 생성자
		this.day = day;
		System.out.println("Child 생성자(1)");
	}
		
	// 물려받은 것을 감추어 덮어쓰다
	public void handsome() {
		System.out.println("젠틀하다~");
	}
	
	// 물려받은 것을 확장한다(기능을 덧붙이기)
	public void wealth() {
		super.wealth(); // 부모의 wealth()가 먼저 호출
		System.out.println("부티가 난다~");
	}
	
	
	public void play() {
		System.out.println("인생이 즐겁다");
	}
}
