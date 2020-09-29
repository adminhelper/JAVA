package edu.exam.condition08;

import java.util.Scanner;

/*제어문:
	1) 조건문 : 참이면 실행, 거짓이면 무시
    2) 반복문 : 조건이 참이면 계속 실행
                        거짓이면 종료*/
public class IfSentense {
	public static void main(String[] args) {
		System.out.println("숫자 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isResult = num == 100;
		System.out.println("num이 100인 것은 " + isResult);
		sc.close();
	}
}





