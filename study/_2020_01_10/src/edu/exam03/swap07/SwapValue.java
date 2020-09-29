package edu.exam03.swap07;

public class SwapValue {
	public static void main(String[] args) {
		int num0 = 10, num1 = 20;
		System.out.printf("num0: %d, num1: %d", num0, num1);
//		이렇게는 안된다
//		num0 = num1;
//		num1 = num0;
		
//		이렇게 해야 한다
		int temp = num0;
		num0 = num1;
		num1 = temp;		
		System.out.printf("\nnum0: %d, num1: %d", num0, num1);
	}
}
