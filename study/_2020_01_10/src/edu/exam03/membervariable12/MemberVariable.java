package edu.exam03.membervariable12;

import java.util.Random;

//만약 클래스 내에서 모두 공유하고 싶은 변수가 있다면
//필드 선언해야 한다
//필드는 클래스 멤버 변수를 의미한다

public class MemberVariable {
	// 클래스 멤버 변수, 필드(Field)
	public static Random rd = new Random();
	public static int num = 0;		// 필드 
	
	public static void method0() {
		System.out.println("method0 : " + num);
		num = rd.nextInt(100);
		System.out.println("method0 : " + num);		
	}
	public static void method1() {
		System.out.println("method1 : " + num);	
		num = rd.nextInt(100);
		System.out.println("method1 : " + num);	
	}
	public static void main(String[] args) {
		method0();
		System.out.println("num : " + num);
		method1();
		System.out.println("num : " + num);
	}

}
