package edu.exam10.ex05customexception;

import java.util.Scanner;

class AgeException extends Exception{
	int age;
	// 예외에 대한 정보 = ex
	AgeException(String ex, int age){
		super(ex);
		this.age = age;
	}	
	void showAge() {
		System.out.println("나이가 " + age + "입니다");
	}
}

public class CustomException {
	static Scanner sc = new Scanner(System.in);
	
	// throw했을 때 처리 방법
	// 1) readAge()메서드 내에 try ~ catch : 직접 처리하기
	// 2) readAge()메서드를 호출한 곳으로 전달
	public static int readAge() throws AgeException {
		int age = sc.nextInt();
		if(age > 35)
			throw new AgeException("당신은 물이 안좋습니다", age);
		return age;
	}
	
	public static void main(String[] args) {
		System.out.println("*** 홍대 클럽 입장 ***");
		try {
			System.out.println("잠깐! 당신의 나이는?");
			int age = readAge();
			System.out.println("^^ 당신은 환영합니다 ^^");
		}catch(AgeException e) {
			System.out.println(e.getMessage());
			e.showAge();
			e.printStackTrace();
		}
		
		System.out.println("The End");
	}
}
