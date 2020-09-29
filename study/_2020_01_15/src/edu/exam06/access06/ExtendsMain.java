package edu.exam06.access06;

import edu.exam06.access05.Child;

/*
java의 권한
public     : 외부에서 항상 접근 가능
protected  : 같은 패키지, 자식은 접근 가능
default    : 같은 패키지에서 접근 가능
private    : 나만
*/

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



