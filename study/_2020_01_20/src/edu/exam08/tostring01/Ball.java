package edu.exam08.tostring01;

/*
모든 Java의 클래스는 Object클래스의 상속을 받는다
Object클래스가 상속하는 Method중에
가장 많이 사용되고 Overriding되는 Method는
equals와 toString이다
*/

public class Ball {
	private float rad;
	
	public Ball(float rad) {
		this.rad = rad;
	}
	
	public String showBall() {
		return "이 공의 반지름은 " + rad;
	}
	
	public boolean isEqual(Ball ball) {
		return this.rad == ball.rad;
	}
	
	public static void main(String[] args) {
		Ball ball1 = new Ball(30);
		Ball ball2 = new Ball(30);
		
		System.out.println(ball1.showBall());
		System.out.println(ball2.showBall());
		System.out.println(ball1.isEqual(ball2));
		
//		System.out.println(ball1);	// ball1.toString();
//		System.out.println(ball2);	// ball2.toString();
//		System.out.println(ball1 == ball2);
//		System.out.println(ball1.equals(ball2));
	}
}



