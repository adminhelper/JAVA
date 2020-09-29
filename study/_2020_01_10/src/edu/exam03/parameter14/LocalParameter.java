package edu.exam03.parameter14;

public class LocalParameter {
	
//	public static int add(int add::num0, int add::num1) {
//		int add::result = 0;
//		add::result = add::num0 + add::num1;
//		return add::result;
//	}
	public static int add(int num0, int num1) {
		int result = 0;
		result = num0 + num1;
		return result;
	}
	public static void main(String[] args) {
//		int main::num0 = 10, main::num1 = 20;
//		int main::result = add(main::num0, main::num1);
//		System.out.println("result : " + main::result);
		int num0 = 10, num1 = 20;
//		add(int add::num0=main::num0, add::num1=main::num);
		int result = add(num0, num1);
		System.out.println("result : " + result);
	}
}
