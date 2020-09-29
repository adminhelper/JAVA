package edu.exam06.polymorphism17;

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

// 재정의한 메서드가 아니라
// 자식 클래스에서 새롭게 정의한 메서드를 호출하고 싶을 때는
// 명시적으로 클래스 정보를 확인하여 호출해야 한다.
public class MethodParam {
	static void wrapBox(Box box) {
		// 클래스 여부를 명확히 확인하는 방법
		Object classObj = box.getClass();
		if(classObj.equals(Box.class))
			box.simpleWrap();
		else if(classObj.equals(PaperBox.class))
			((PaperBox)box).paperWrap();
		else if(classObj.equals(GoldPaperBox.class))
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














