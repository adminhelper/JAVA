package edu.exam11.ex05autoboxing;

// jdk 1.5이후부터는 int <-> Integer간에 자동으로 변환해준다
// 이것을 AutoBoxing, AutoUnBoxing이라 부른다

// AutoBoxing, AutoUnBoxing은 스택과 힙간의
// 데이터 이동과 추가정보포함등이 일어나므로
// 빈번하게 사용하면 성능저하가 일어날 수 있다

public class AutoBoxing {
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		Integer iValue = 10;	// auto boxing
		Double dValue = 3.14;	// auto boxing
		showData(iValue);
		showData(dValue);
		
		int num1 = iValue;		// auto unboxing
		double num2 = dValue;	// auto unboxing
		showData(num1);			// auto boxing
		showData(num2);			// auto boxing
	}
}
