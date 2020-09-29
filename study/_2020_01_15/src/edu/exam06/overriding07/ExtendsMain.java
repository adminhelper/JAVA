package edu.exam06.overriding07;

//-오버라이딩(Overriding)-
//부모클래스 물려준 메서드를 재정의하는 것
//메서드 상속시의 3가지 경우
// 1) 그대로 쓰고 싶다-내버려두면 된다
// 2) 새롭게 하고 싶다-동일한 메서드 써주고 다시 코딩
// 3) 물려받은 것을 확장-super를 사용한다

public class ExtendsMain {
	public static void main(String[] args) {
		Child child = new Child(100, 99999999999L, 365.25f);
		child.handsome();
		child.wealth();
		child.play();
	}
}



