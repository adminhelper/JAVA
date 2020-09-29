package edu.exam00.operator08;

//연산자
//연관지어서 계산하는 약속
//
//1)산술연산자(+ - * / %)계열:
//	증감연산자 num++, ++num, num--, --num
//	부호연산자 +num, -num
//	복합대입연산자 num += 10;
//
//2)비교연산자(== != > < >= <=)계열:
//	논리연산자(&& ||)
//	
//3)비트연산자:
//	비트논리연산자
//	비트이동연산자
//	
//4)조건연산자(3항연산자)
//    A?B:C
//    if(A)
//    	B;
//    else
//    	C;

public class Operator {
	public static void main(String[] args) {
		int x = 33, y = 20;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);	// 몫
		System.out.println(x%y);	// 나머지
	}
}








