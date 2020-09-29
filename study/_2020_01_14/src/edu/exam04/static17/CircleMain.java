package edu.exam04.static17;

public class CircleMain {
	public static void main(String[] args) {
//		Circle circle0 = new Circle(2.1f);
//		Circle circle1 = new Circle(2.5f);
//		Circle circle2 = new Circle(3.3f);
		
		Circle circle0 = new Circle();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		//getCircumference(circle0); // circle0.getCircumference()
		//getCircumference(circle1); //circle1.getCircumference()
		//getCircumference(circle2); //circle2.getCircumference()
		
		System.out.println("ciecle0의 원주 : " + circle0.getCircumference());
		System.out.println("ciecle0의 원넓이 : " + circle0.getCircleArea());
		System.out.println("ciecle1의 원주 : " + circle1.getCircumference());
		System.out.println("ciecle1의 원넓이 : " + circle1.getCircleArea());
		System.out.println("ciecle2의 원주 : " + circle2.getCircumference());
		System.out.println("ciecle2의 원넓이 : " + circle2.getCircleArea());
	}
}
