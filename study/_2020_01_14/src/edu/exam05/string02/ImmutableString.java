package edu.exam05.string02;

//Primitive Type(기본 자료형 타입)는
//==써도 좋다

//==의 의미는 같은 객체를 가리키고 있느냐?
//equals의 의미는 문자열의 내용이 같으냐?

public class ImmutableString {
	public static void main(String[] args) {
		String str0 = "My String";
		String str1 = "My String";
		String str2 = new String("My String");
		
		if(str0==str1)
			System.out.println("같다");
		else
			System.out.println("다르다");
		if(str0==str2)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		System.out.println("--------------------------");
		
		if(str0.equals(str1))
			System.out.println("같다");
		else
			System.out.println("다르다");
		if(str0.equals(str2))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}
