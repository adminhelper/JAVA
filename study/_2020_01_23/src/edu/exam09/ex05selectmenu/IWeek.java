package edu.exam09.ex05selectmenu;

//Literal 상수 : 숫자 1, 2, ...
//Constant 상수 : 변수 -> 상수(final) MON, TUE, ...

//인터페이스에 선언하는 필드는 
//자동으로 public final static이 붙는다.
public interface IWeek{
	int MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
}

//또 같은 용도로 사용하는 것이 enum(열거형)이 있다.

/*
public class IWeek {
	public final static int MON = 1;
	public final static int TUE = 2;
	public final static int WED = 3;
	public final static int THU = 4;
	public final static int FRI = 5;
	public final static int SAT = 6;
	public final static int SUN = 7;
}
*/
