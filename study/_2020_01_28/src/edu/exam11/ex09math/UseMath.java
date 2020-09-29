package edu.exam11.ex09math;

public class UseMath {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(2));	// 제곱근
		System.out.println(Math.toDegrees(Math.PI)); // 각도
		System.out.println(Math.toDegrees(Math.PI * 2.0));
		double radian45 = Math.toRadians(45);	// 라디안
		System.out.println(Math.sin(radian45));
		System.out.println(Math.cos(radian45));
		System.out.println(Math.tan(radian45));
		System.out.println(Math.log(25));
		System.out.println(Math.pow(2, 4));	// 제곱
	}
}
