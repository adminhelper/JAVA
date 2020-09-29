package edu.exam12.ex04genericmethod;

// 특정 메서드에서만 Generic을 사용하고 싶을 때

class AAA{
	public String toString() {return "Class AAA";}
}
class BBB{
	public String toString() {return "Class BBB";}
}
class InstanceTypeShow{
	int showCnt=0;
	<T> void showInstType(T inst) {
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
		show.<AAA>showInstType(aaa);
		show.<BBB>showInstType(bbb);
		show.showPrintCnt();
	}
}




