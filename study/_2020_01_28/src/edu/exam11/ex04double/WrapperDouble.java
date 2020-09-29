package edu.exam11.ex04double;

public class WrapperDouble {
	public static void main(String[] args) {
		Integer iValue = new Integer(10);
		Double dValue = new Double(3.14);
		System.out.println(iValue);
		System.out.println(dValue);
		
		// Wrapper클래스는 값의 변경이 불가능하므로
		// 아래처럼 새로운 객체를 생성해서 값을 넣어줘야 한다
		iValue = new Integer(iValue.intValue() + 10);
		dValue = new Double(dValue.doubleValue() + 1.2);
		System.out.println(iValue);
		System.out.println(dValue);		
	}
}
