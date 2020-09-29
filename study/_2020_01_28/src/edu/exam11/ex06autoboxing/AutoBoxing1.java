package edu.exam11.ex06autoboxing;

public class AutoBoxing1 {
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 20;		
		num1++;	// num1 = new Integer(num1.intValue() + 1);
		System.out.println(num1);		
		num2 += 3;// num2 = new Integer(num2.intValue() + 3);
		System.out.println(num2);
		int result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
	}
}
