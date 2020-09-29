package edu.exam.whiletree21;

public class WhileChopTree {
	public static void main(String[] args) {
		int num = 0;
		
		// 반복문 = 반복 + 조건
		// 조건이 true일 동안에는 계속 실행해라
		while(num < 1000000) {
			num++;	
			System.out.println("나무를 " + num +"번 찍었습니다");
		}
	}
	
	
	
}
