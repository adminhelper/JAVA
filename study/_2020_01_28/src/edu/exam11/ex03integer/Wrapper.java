package edu.exam11.ex03integer;
/*
랩퍼클래스(Wrapper Class)
int, long, float, double ... primitive Type(기본 자료형) 
기본 자료형로 클래스처럼 사용이 요구될 경우가 있다.
기본 자료형은 클래스가 아니므로 아래 2가지 경우 사용할 수 가 없다.
그러나 기본 자료형도 2가지 경우 종종 사용이 필요하므로
기본 자료형에 대응되는 Wrapper Class를 제공하게 된다.
Integer, Long, Float, Double (클래스)
처음에는 Integer에 int값을 대입해서 전달하도록 했으나
현재는 int를 넣어도 자동으로 Integer로 변환되어서 들어가도록
수정되었다.

1) 메서드의 매개변수가 Object obj
   ; 모든 자바의 클래스 객체를 인자로 받을 수 있다.
   System.out.println(Object obj);
2) 컬렉션(자료구조)
   배열, 연결리스트, 스택, 큐, 트리, 해시...
  객체
*/
public class Wrapper {
	public static void showData(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// 3, 7 int
		Integer intInst = new Integer(3);
		showData(intInst);
		showData(new Integer(7));
	}
}









