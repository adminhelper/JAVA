package edu.exam.condition15;

import java.util.Scanner;

public class CalcInputNum {
	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<사칙 연산을 합니다>");
		System.out.print("첫 번째 숫자 입력: ");
		num0 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		num1 = sc.nextInt();
		System.out.print("연산자 입력 (+ - * /) : ");
		String op = sc.next();
		
		if(op.equals("+"))
			result = num0 + num1;
		else if(op.equals("-"))
			result = num0 - num1;		
		else if(op.equals("*"))
			result = num0 * num1;
		else if(op.equals("/"))
			result = num0 / num1;
		else
			System.out.println("잘 못 입력");
		
		System.out.println("결과값은 " + result + "입니다");
		
		sc.close();
	}
}
