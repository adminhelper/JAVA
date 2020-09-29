package edu.exam.operator07;

import java.util.Scanner;

/*<연산자>
사칙연산자
대입연산자
비교연산자(대소)*/

public class CompOperator {
	public static void main(String[] args) {
		boolean isLarge;	// true, false
		int num0 = 0, num1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<대소 비교 연산 시작>");
		System.out.print("첫 번째 숫자 입력: ");
		num0 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		num1 = sc.nextInt();
		
		isLarge = num0 > num1;
		System.out.println(num0 + "은 " + num1 +
				"보다 크다는 사실은 " + isLarge +
				"입니다.");
	}
}





