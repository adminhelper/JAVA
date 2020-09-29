package edu.exam15.ex01nested_class;

/*
클래스의 정의 유형
Nested Class (static Inner)
Inner Class
Local Class
Anonymouse Class
*/
class OuterClassOne{
	OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simple();
	}
	
	// NestedClass == static Inner
	// 클래스 내에 존재하는 클래스
	// 클래스 밖에 선언하지 않으므로 주로 class내에서 사용하는 경우
	static class NestedClass{
		public void simple() {
			System.out.println("Nested Instance Method one");
		}
	}	
}

class OuterClassTwo{
	OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simple();
	}
	private static class NestedClass{
		public void simple() {
			System.out.println("Nested Instance Method two");
		}
	}	
}

public class NestedClassTest {
	public static void main(String[] args) {
		OuterClassOne one = new OuterClassOne();
		
		// 접근권한이 default이기 때문에
		// 아래처럼도 할 수는 있지만
		// 가급적 외부에서는 잘 사용하지는 않는다.
		OuterClassOne.NestedClass nst1 = 
				new OuterClassOne.NestedClass();
		nst1.simple();
		
		// 생성자 내부에서 NestedClass가 호출된다
		OuterClassTwo two = new OuterClassTwo();
		
		// private권한이므로 외부에서는 사용할 수 없다.
//		OuterClassTwo.NestedClass nst2 = 
//				new OuterClassTwo.NestedClass();
//		nst2.simple();
	}
}











