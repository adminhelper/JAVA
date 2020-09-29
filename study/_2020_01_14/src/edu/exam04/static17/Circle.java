package edu.exam04.static17;

import java.util.Scanner;

/*
생성자에서 float형 반지름을 초기화한다
PI값은 final static float 필드로 공유한다
public float getCircumference();	// 원둘레(원주)
public float getCircleArea();		// 원의 넓이

객체는 3개를 만들어서
main에서 사용해보세요.
*/

public class Circle {
	private float rad;
	private final static float PI = 3.141592f;
	private static Scanner sc = new Scanner(System.in);
	
	public Circle() {
		System.out.println("반지름 입력");
		rad = sc.nextFloat();
	}
	
	//public Circle(Circle this, float rad)
	public Circle(float rad){
		this.rad = rad;
	}
	//public float getCircumference(Circle this)
	public float getCircumference() {
		return rad*2*PI;
	}
	//public float getCircleArea(Circle this)
	public float getCircleArea() {
		return rad*rad*PI;
	}
}




