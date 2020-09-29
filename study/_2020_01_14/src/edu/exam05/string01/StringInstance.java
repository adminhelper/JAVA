package edu.exam05.string01;

// java.lang 패키지는 워낙 자바의 일반적이고
// 사용빈도수가 높은 클래스들이 들어있다.
// 그래서 생략가능하다

public class StringInstance {
	public static void main(String[] args) {
		java.lang.String str = "My name is Sunny";
		int len = str.length();
		System.out.println("길이: " + len);
		
		int len1 = "한글길이".length();
		System.out.println("길이: " + len1);
	}
}
