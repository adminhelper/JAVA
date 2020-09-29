package edu.exam03.method05;

import java.util.Scanner;

//메서드를 만들때는 하나의 메서드에 하나의 기능만 넣는 것을 원칙으로
//한다.(유연성이 증가된다)
//물론 현실에서는 완벽하게 이루어지지 않는다.

public class SuitableMethod {
	public static Scanner sc = new Scanner(System.in);
	
	public static void greeting() {
		System.out.println("***안녕하세요***\n");
	}
	
	public static int input() {
		System.out.print("숫자를 입력 : ");
		int num = sc.nextInt();
		return num;
	}
	public static int add(int num0, int num1) {
		return num0 + num1;
	}
	public static void viewResult(int result) {
		System.out.println("합은 " + result);
	}

	public static void main(String[] args) {
		greeting();
		int num0 = input();
		int num1 = input();
		int result = add(num0, num1);
		viewResult(result);
		
		greeting();
		int num2 = input();
		int num3 = input();
		int num4 = input();
		int result1 = add(num2, num3+num4);
		viewResult(result1);
	}
}






