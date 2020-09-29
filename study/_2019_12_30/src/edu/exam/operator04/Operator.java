package edu.exam.operator04;

/*
Programming : 사람의 일을 자동화
ex) 초코파이
재료준비 : 변수(자료형)
반죽 : 계산(연산자)
발효/굽기 : ?시간, ?온도 (제어문(조건문))
반복으로 양산 : 제어문(반복문)
포장/배송 : 분류(그룹화)-메서드,클래스,패키지
*/

/*변수는 =(대입 연산자)
왼쪽에 있으면 공간
오른쪽에 있으면 담고 있는 값을 의미한다

=(대입연산자)는 우측의 연산이 모두 완료되고
마지막에 좌측으로 대입된다*/

public class Operator {
	public static void main(String[] args) {
		int result = 0;
		int num0 = 10;
		int num1 = 20;
		result = num0 + num1;
		System.out.println(result);
	}
}
