package edu.exam.operator05;

import java.util.Scanner;

public class InputAddNum {

	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0;
		
		// Ctrl + Shift + o 자동으로 패키지를 찾아줌
		// 입력받으려고 사용해봄
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<더하기 연산을 합니다>");
		System.out.println("첫 번째 숫자 입력: ");
		num0 = sc.nextInt();
		System.out.println("두 번째 숫자 입력: ");
		num1 = sc.nextInt();
		
		result = num0 + num1;
		System.out.println("결과는 " + result);
		
		sc.close();
	}

}
