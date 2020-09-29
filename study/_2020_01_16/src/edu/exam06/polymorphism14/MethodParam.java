package edu.exam06.polymorphism14;

class Box{
	void simpleWrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox{
	void paperWrap() {
		System.out.println("paper wrap");
	}
}
class GoldPaperBox{
	void goldWrap() {
		System.out.println("gold wrap");
	}
}

public class MethodParam {
	static void wrapBox(Box box) {
		box.simpleWrap();
	}
	static void wrapBox(PaperBox box) {
		box.paperWrap();
	}
	static void wrapBox(GoldPaperBox box) {
		box.goldWrap();
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














