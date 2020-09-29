package edu.exam06.constructor04;

//상속을 받아서 자식 객체를 생성하면
//내부적으로는 부모 객체가 먼저 생성된다

public class ExtendsMain {
	public static void main(String[] args) {
	//	Child child = new Child();
		Child child = new Child(100, 99999999999L, 365.25f);
		child.handsome();
		child.wealth();
		child.play();
		System.out.println("잘생김 점수: " + child.handsomeScore);
		System.out.println("돈: " + child.money);
		System.out.println("노는 날: " + child.day);
	}
}



