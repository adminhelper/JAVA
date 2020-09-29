package edu.exam05.stringcompare09;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = "Smart";
		String str3 = new String("Smart");
		String str4 = "Start";
		
		// == 로 비교하면 객체 참조로 비교하기 때문에
		if(str1==str2)
			System.out.println("str1과 str2는 같다");
		if(str1==str3)
			System.out.println("str1과 str3는 같다");
		if(str1==str4)
			System.out.println("str1과 str4는 같다");
		
		// 문자열 내용 비교는 아래 2개의 메서드를 사용한다.
		
		if(str1.equals(str2))
			System.out.println("str1과 str2는 equal");
		if(str1.equals(str3))
			System.out.println("str1과 str3는 equal");
		
		if(str1.compareTo(str2)==0)
			System.out.println("str1과 str2는 compare같다");
		if(str1.compareTo(str3)==0)
			System.out.println("str1과 str3는 compare같다");
	}
}
