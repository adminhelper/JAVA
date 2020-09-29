package edu.exam00.operator09;

// 임베디드(HW를 다루는 sw제어)
// 2의 배승 단위 계산속도 향상
// 일부 비트 제거

// >> 음수는 왼쪽을 1로 채우고 
//    양수는 왼쪽을 0으로 채운다
// >>>  x >>> 2;
//    왼쪽을 무조건 0으로 채운다

public class BitShiftOp {
	public static void main(String[] args) {
		int x = 10;	// 00001010
		System.out.println(x << 1);
		System.out.println(x << 2);
		System.out.println(x << 3);
		System.out.println();
		System.out.println(x >> 1);// 00000101
		System.out.println(x >> 2);// 00000010
		System.out.println(x >> 3);// 00000001
	}
}
