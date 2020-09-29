package edu.exam06.polymorphism15;

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
public class MethodParam {
	static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox)
			((GoldPaperBox)box).goldWrap();
		else if(box instanceof PaperBox)
			((PaperBox)box).paperWrap();
		else if(box instanceof Box)
			box.simpleWrap();
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














