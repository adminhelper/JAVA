package edu.exam.method34;

import java.util.Scanner;

public class CalcInputNum {
	public static int calc(int num0, int num1, String op) {
		int result = 0;
		switch(op)
		{
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		default:
			System.out.println("잘 못 입력");
			break;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int num0 = 0, num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<사칙 연산을 합니다>");
		System.out.print("첫 번째 숫자 입력: ");
		num0 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		num1 = sc.nextInt();
		System.out.print("연산자 입력 (+ - * /) : ");
		String op = sc.next();
		
		int result = calc(num0, num1, op);
		System.out.println("결과값은 " + result + "입니다");
	
		sc.close();
	}

}
