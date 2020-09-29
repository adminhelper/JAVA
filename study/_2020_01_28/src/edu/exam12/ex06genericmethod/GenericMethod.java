package edu.exam12.ex06genericmethod;

// 특정 메서드에서만 Generic을 사용하고 싶을 때

class AAA{
	public String toString() {return "Class AAA";}
}
class BBB{
	public String toString() {return "Class BBB";}
}
class InstanceTypeShow{
	int showCnt=0;
	<T, U> void showInstType(T inst0, U inst1) {
		System.out.println(inst0); 
		System.out.println(inst1); 
		showCnt++;
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
		show.<AAA, BBB>showInstType(aaa, bbb);
		show.<BBB, AAA>showInstType(bbb, aaa);
		show.showPrintCnt();
	}
}




