package edu.exam05.string03;

public class StringMethod {
	public static void main(String[] args) {
		String str1 = "Smart";
		String str2 = " and ";
		String str3 = "Simple";
//		String temp = str1.concat(str2);
//		String str4 = temp.concat(str3);
		String str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);
		System.out.println("문자열 길이: " + str4.length());
		
		String str5 = str1+str2+str3;
		System.out.println(str5);
		System.out.println("문자열 길이: " + str5.length());
		
		//str1.equals(str3)  true면 같고
		// 음수/양수는 다른 문자열, 0이면 같은 문자열
		if(str1.compareTo(str3) == 0)
			System.out.println("str1과 str3이 같다");
		else
			System.out.println("str1과 str3이 다르다");
		
	}
}
