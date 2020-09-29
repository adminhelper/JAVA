package edu.exam03.method04;

import java.util.Scanner;

//메서드를 어떤식으로 만들어야 좋을까?

//메서드간에 중복코드(동일 논리)가 반복되는 모습이
//많이 보일 때

//숫자를 입력받고
//더해서
//출력하는 메서드

//하나의 메서드가 많을 일을 처리한다
//슈퍼맨
//배트맨

//하나의 메서드에 여러 기능을 부여하면 
//프로그램이 경직된다(유연해지지 않는다)
//=> 유지보수 작업 비용이 많이 발생한다

public class UnsuitableMethod {
	public static Scanner sc = new Scanner(System.in);
	
	public static void inputAddView() {
		System.out.print("숫자를 입력 : ");
		int num0 = sc.nextInt();
		System.out.print("숫자를 입력 : ");
		int num1 = sc.nextInt();
		int result = num0 + num1;
		System.out.println("합은 " + result);
	}	
	
	public static void inputAddView1() {
		System.out.print("숫자를 입력 : ");
		int num0 = sc.nextInt();
		System.out.print("숫자를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력 : ");
		int num2 = sc.nextInt();
		int result = num0 + num1 + num2;
		System.out.println("합은 " + result);
	}
	
	public static void main(String[] args) {
		inputAddView();
		inputAddView1();
	}
}




