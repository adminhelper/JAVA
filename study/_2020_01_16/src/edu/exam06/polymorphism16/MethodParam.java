package edu.exam06.polymorphism16;

class Box{
	void simpleWrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox extends Box {
	void paperWrap() {
		System.out.println("paper wrap");
	}
}
class GoldPaperBox extends PaperBox{
	void goldWrap() {
		System.out.println("gold wrap");
	}
}

// instanceof 키워드는 해당 객체가
// 해당 클래스로 변환될 수 있는지 검사해서
// 해당하면 true, 아니면 false

// instanceof를 사용할 때는 순서가 중요하다.
// instanceof는 "해당 클래스니?" 이것을 물어보는 것은 아니다
//             "해당 클래스로 변환될 수 있니?"를 물어보는 것이다

// instanceof를 사용할 때는 자식 클래스를 매개변수로 하는 구문부터
// 위에 위치시켜야 한다.
public class MethodParam {
	static void wrapBox(Box box) {
		if(box instanceof Box)
			box.simpleWrap();		
		else if(box instanceof PaperBox)
			((PaperBox)box).paperWrap();
		else if(box instanceof GoldPaperBox)
			((GoldPaperBox)box).goldWrap();
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














