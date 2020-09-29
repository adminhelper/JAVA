package edu.exam00.operator09;

// bit단위가 Low 레벨 임베디드에서 많이 사용
// C, C++ 하는 경우는 종종 쓰인다.

//비트 (논리) 연산자
//&   And
//|   Or
//^   Xor (Exclusive Or) : 같으면 0, 다르면 1
//~   반전

public class BitOp {
	public static void main(String[] args) {
		int x = 21; // 00010101
		int y = 17; // 00010001
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println(~x); // 11101010
		int r = ~y + 1;	// 2의 보수법
		System.out.println(r);
		r = ~r + 1;
		System.out.println(r);
	}
}



