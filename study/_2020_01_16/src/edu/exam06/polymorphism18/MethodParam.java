package edu.exam06.polymorphism18;

/*
부모참조변수에 자식 객체를 담아서 전달하면 좋은 점
; 메서드의 매개변수를 최상위 부모 변수로 메서드 1개만 만들면 된다.
 재정의한 메서드는 알아서 호출해주니까
; 비록 부모참조변수에는 담았지만 Overriding되어진 메서드는
객체에 재정의된 메서드가 알아서 호출된다.
*/
/*
스타크래프트
Unit클래스를 상속
자식 클래스 마린, SCV, 탱크
void attack(Unit unit);
업그레이드시 마린2를 Unit을 
상속받고 기능을 재정하도록 한다
그러면 기존 코드인 attack을 그대로
사용할 수 있다.
수정해야 할 코드가 최소화될 수 있다.
*/
class Box{
	void wrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox extends Box {
	void wrap() {
		System.out.println("paper wrap");
	}
}
class GoldPaperBox extends PaperBox{
	void wrap() {
		System.out.println("gold wrap");
	}
}

// 자식 클래스가 재정의(Overriding)한 메서드를 
// 호출하는 방법
public class MethodParam {
	static void wrapBox(Box box) {
		box.wrap();
	}
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox pBox = new PaperBox();
		GoldPaperBox gpBox = new GoldPaperBox();
		wrapBox(box);
		wrapBox(pBox);
		wrapBox(gpBox);
		
	}
}














