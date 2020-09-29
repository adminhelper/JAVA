package edu.exam00.transtype05;

//자동 형변환
//1) 사이즈 작은 것 -> 사이즈 큰 것에 맞춰진다
//2) 정수(표현범위 적은 것) -> 실수(표현범위 큰 것)

public class AutoTransType {
	public static void main(String[] args) {
		// ch의 값이 i로 변환되어 대입된다
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		// b가 int로 자동 변환되어 연산된다
		byte b = 100;
		int n = 100;
		System.out.println(b*n);	
		
		// long(8) float(4) => long이 float로 변환
		// r이 double로 변환되어 연산된다
		int r = 3;
		double pi = 3.14D;
		System.out.println(r*r*pi);
	}
}
