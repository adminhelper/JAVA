package edu.exam11.ex07biginteger;

import java.math.BigInteger;

// long보다 큰 숫자를 표현해야 할 경우

public class SoBigInteger {
	public static void main(String[] args) {
		System.out.println("최대 정수 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);
		
		// 값을 생성자에 넣을 때 그냥 숫자로 넣으면 기본타입 범위를 넘어서
		// 왜곡되므로 문자열로 값을 대입한다
		BigInteger bigValue1 = new BigInteger("99999999999999999999");
		BigInteger bigValue2 = new BigInteger("10000000000000000000");
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		System.out.println(addResult);
		System.out.println(mulResult);
	}
}






