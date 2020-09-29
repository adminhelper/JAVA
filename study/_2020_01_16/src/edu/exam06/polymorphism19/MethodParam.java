package edu.exam06.polymorphism19;
/*
부모로부터 상속받은 자식클래스들은 
부모클래스 배열에 모두 담을 수 있다.
그런데 재정의된 메서드를 호출하면
각각 고유의 특성이 잘 발휘된다.

이렇게 관리는 편리해지고
기능은 고유기능을 유지하는 이것을
"다형성을 사용한 관리의 편리함"
이렇게 지칭한다
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

public class MethodParam {
	static void wrapBox(Box[] boxs) {
		for(Box box : boxs)
			box.wrap();
	}
	public static void main(String[] args) {
		Box[] boxs = new Box[] {
			new Box(),
			new PaperBox(),
			new GoldPaperBox()
		};
		wrapBox(boxs);
	}
}














