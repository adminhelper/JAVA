package edu.exam00.operator08;

// 조건연산자(삼항연산자)
public class ConditionOp {
	public static void main(String[] args) {
		int num0 = 10, num1 = 20;
		//int result = num0 > num1 ? num0 : num1;
		int result = 0;
		if(num0 > num1)
			result = num0;
		else
			result = num1;
		System.out.println(result);
	}
}
