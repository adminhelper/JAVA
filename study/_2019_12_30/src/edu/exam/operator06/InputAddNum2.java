package edu.exam.operator06;

import java.util.Scanner;

// 3개의 숫자를 입력받고
// 1번째와 2번째는 더하고
// 3번째는 뺀 결과값을 출력하라
public class InputAddNum2 {

	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0, num2 = 0;
		
		// Ctrl + Shift + o 자동으로 패키지를 찾아줌
		// 입력받으려고 사용해봄
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<더하기 연산을 합니다>");
		System.out.print("첫 번째 숫자 입력: ");
		num0 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		num1 = sc.nextInt();
		System.out.print("세 번째 숫자 입력: ");
		num2 = sc.nextInt();
		
		result = num0 + num1 - num2;
		System.out.println("결과는 " + result);
		
		sc.close();
	}

}
