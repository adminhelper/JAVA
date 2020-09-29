package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef2 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {		
			int ret = greeting();
			if(ret < 0) break;
		}
		
//		greeting();
//		greeting();
//		greeting();
	}
	
	public static int greeting() {
		int age = 0;
		System.out.println("좋은 아침입니다");
		System.out.print("나이는 어떻게 되세요? ");
		age = sc.nextInt();
		if (age > 40)
			System.out.println("안녕하세요 꾸벅~");
		else if (age > 30)
			System.out.println("반가반가");
		else if (age > 20)
			System.out.println("어이~ 잘지내");
		else if (age > 10)
			System.out.println("야~ 저리가");

		return age;
	}

}
