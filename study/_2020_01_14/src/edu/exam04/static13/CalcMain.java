package edu.exam04.static13;

/* static은 클래스를 통해 바로 호출이 가능하다
 * 객체를 만들지 않아도 메모리에 올라가게 된다.
 * 
 * 그러므로 static으로 만드는 메서드는 프로그램이
 * 종료될 때까지 계속 존재한다.
 * 반면에 일반 객체 소속 메서드는 객체가 GA(Garbage Collector)
 * 에 의해 소멸되면 사라진다.
 * 
 * static메서드는 일반적으로 사용되는 Utility성 기능들
 * 범용적인 기능들, 항상 계속 여러군데서 사용되는 기능들을
 * 구현한다.
 */

public class CalcMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(10, 20));
		System.out.println(calc.mul(10, 20));
		System.out.println(calc.div(10, 20));
		
		System.out.println(CalcStatic.add(10, 20));
		System.out.println(CalcStatic.sub(10, 20));
		System.out.println(CalcStatic.mul(10, 20));
		System.out.println(CalcStatic.div(10, 20));
	}
}
