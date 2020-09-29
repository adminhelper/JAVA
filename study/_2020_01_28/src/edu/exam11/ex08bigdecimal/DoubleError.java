package edu.exam11.ex08bigdecimal;

//실수는 원래 범위가 무한대이므로 한정된 공간에 표현하려면
//부득이하게 오차를 발생시킬 수 밖에 없다.

public class DoubleError {
	public static void main(String[] args) {
		double d1 = 1.6;
		double d2 = 0.1;
		System.out.println("두 실수 덧셈 " + (d1+d2));
		System.out.println("두 실수 곱셈 " + (d1*d2));
	}
}
