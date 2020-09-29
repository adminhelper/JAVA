package edu.exam04.static13;

//static 메서드는 객체가 생성되지 않아도
//해당 코드가 프로젝트에 포함되어 있으면
//메모리에 로딩되게 된다.
//그러므로 객체를 생성하지 않아도 사용가능하다.

public class CalcStatic {
	public static float add(float a, float b) {
		return a+b;
	}
	public static float sub(float a, float b) {
		return a-b;
	}
	public static float mul(float a, float b) {
		return a*b;
	}
	public static float div(float a, float b) {
		return a/b;
	}
}
