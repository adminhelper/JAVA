package edu.exam01.conditionif13;

import java.util.Scanner;

// 숫자 입력받고 짝수인지 홀수인지 출력

public class ConditionIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");
		
		sc.close();
	}
}
