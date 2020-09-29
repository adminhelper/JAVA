package edu.exam12.ex03genericmethod;

// 특정 메서드에서만 Generic을 사용하고 싶을 때

class AAA{
	public String toString() {return "Class AAA";}
}
class BBB{
	public String toString() {return "Class BBB";}
}
class InstanceTypeShow{
	int showCnt=0;
	void showInstType(AAA inst) {
		System.out.println(inst); showCnt++;
	}
	void showInstType(BBB inst) {
		System.out.println(inst); showCnt++;
	}
	void showPrintCnt() {
		System.out.println("Show Count : " + showCnt);
	}
}
public class GenericMethod {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		InstanceTypeShow show = 
				new InstanceTypeShow();
		show.showInstType(aaa);
		show.showInstType(bbb);
		show.showPrintCnt();
	}
}




