package edu.exam15.ex01nested_class;

/*
NestedClass와 InnerClass는 모두
클래스 내부에 선언된 Class이다
주 용도는 
1) 클래스 내부의 필드나 메서드를 그룹화 하고 싶을 때
2) 캡슐화 증대의 목적

내부에서 주로 사용되는 클래스를 이렇게 만들 수 있다.
외부에서는 상대적으로 적게 사용된다.

내부에서 사용하는 빈도수
NestedClass < InnerClass
*/

class OuterClass{
	private String myName;
	private int num;
	
	OuterClass(String name){
		myName = name;
		num = 0;
	}
	void whoAreYou() {
		num++;
		System.out.println(myName + " OuterClass" + num);
		
		// whoAreYou()메서드는 OuterClass객체가 있을때
		// 호출되므로 InnerClass를 내부에서 
		// 객체화할 수 있다.
		InnerClass in = new InnerClass();
		in.show();
	}
	
	class InnerClass{
		InnerClass(){
			System.out.println("InnerClass 생성");
		}
		void show() {
			System.out.println("InnerClass - show()");
		}
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		// NestedClass(static Inner)는 아래처럼 객체를 생성할 수 있지만
		// InnerClass는 아래처럼 객체를 만들 수 없다.
		// 왜?
		// NestedClass는 클래스 앞에 static을 부여했으므로
		// 객체없이도 선언이 가능하지만
		// InnerClass는 OuterClass의 객체를 생성해야 비로소
		// 객체를 만들 수 있다.
//		OuterClass.InnerClass in = new OuterClass.InnerClass();
//		in.show();
		
		// inner클래스는 inner클래스는 감싸는 외부 클래스의
		// 객체를 통해 생성할 수 있다.
		OuterClass out = new OuterClass("Outer");
		OuterClass.InnerClass in = out.new InnerClass();

		out.whoAreYou();		
	}
}









