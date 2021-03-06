package edu.exam.whilecalc30;

import java.util.Scanner;

// 연산자에 exit를 입력하기 전까지
// 계속 반복해서 동작하는 프로그램을 만드시오.
// return을 사용해서

public class WhileCalcInputNum {
	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("<사칙 연산을 합니다>");
			System.out.print("연산자 입력 (+ - * /) 종료시 exit: ");
			String op = sc.next();
			if(op.equals("exit")) {
				sc.close();
				System.out.println("---The End---");
				return;
			}
			System.out.print("첫 번째 숫자 입력: ");
			num0 = sc.nextInt();
			System.out.print("두 번째 숫자 입력: ");
			num1 = sc.nextInt();


			switch (op) {
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
			System.out.println("결과값은 " + result + "입니다");
		}

	}

}
