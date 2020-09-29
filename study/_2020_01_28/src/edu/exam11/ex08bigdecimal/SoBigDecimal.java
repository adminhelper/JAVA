package edu.exam11.ex08bigdecimal;

import java.math.BigDecimal;

public class SoBigDecimal {
	public static void main(String[] args) {
//		BigDecimal d1 = new BigDecimal(1.6);	// 이미 실수에 담는 과정에서 오차가 발생함
//		BigDecimal d2 = new BigDecimal(0.1);	// 이미 실수에 담는 과정에서 오차가 발생함
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println("두 실수 덧셈 " + d1.add(d2));
		System.out.println("두 실수 곱셈 " + d1.multiply(d2));
	}
}
