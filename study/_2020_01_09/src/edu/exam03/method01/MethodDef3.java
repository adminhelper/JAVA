package edu.exam03.method01;

import java.util.Scanner;

public class MethodDef3 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {		
			int ret = getAge(); 
			greeting(ret);
			if(ret < 0) break;
		}
	}
	
	public static int getAge() {
		int age = 0;
		System.out.println("좋은 아침입니다");
		System.out.print("나이는 어떻게 되세요? ");
		age = sc.nextInt();
		
		return age;
	}
	
	public static void greeting(int _age) {
		if (_age > 40)
			System.out.println("안녕하세요 꾸벅~");
		else if (_age > 30)
			System.out.println("반가반가");
		else if (_age > 20)
			System.out.println("어이~ 잘지내");
		else if (_age > 10)
			System.out.println("야~ 저리가");
	}
}
