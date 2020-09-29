package edu.exam03.method06;

//return문 
//; 이 메서드를 호출한 곳으로 돌아가라
//1) return num;
//  num의 값을 가지고 돌아가라
//  이 메서드의 결과값을 num이다
//  
//2) void일 때 return은
//  빈손으로 돌아가라
//  이 메서드는 결과값이 없다.
// 메서드의 실행을 중단해라.

public class DefReturn {
	public static void divide(int num0, int num1) {
		if(num1==0) {
			System.out.println("0으로 나눌 수 없습니다");
			return;
		}
		System.out.println("나눗셈 결과: " + (num0/num1));
	}
	public static void main(String[] args) {
		divide(9, 2);
		divide(4, 0);
	}
}
