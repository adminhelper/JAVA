package edu.exam00.operator09;

// 논리 연산자 (And, Or)
// && And 양쪽이 모두 참일 때만 true
// || Or 양쪽중에 하나라도 참이면 true

public class LogicalOp {
	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(true || true);
		System.out.println(true || false);
		
		int salay=300, duty=7;
		if(salay >= 400 || duty <= 8)
			System.out.println("입사할께요");
	}
}





