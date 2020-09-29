package edu.exam12.ex07boundedtype;

//Generic문법에서 T에 넘겨줄 객체를 제한할 때

interface MyInterface{
	void showYourName();
}
class MyClass{
	public void showYourAncestor() {
		System.out.println("MyClass");
	}
}
class ImplClass implements MyInterface{
	public void showYourName() {
		System.out.println("Class implClass");
	}
}
class ChildClass extends MyClass{}

public class BoundedType {
	// T는 MyInterface자식이어야만 한다
	public static <T extends MyInterface> 
						void showInstanceName(T param) {
		param.showYourName();
	}
	// T는 MyClass의 자식이어야만 한다
	public static <T extends MyClass> 
						void showInstanceAncestor(T param) {
		param.showYourAncestor();
	}	
	
	public static void main(String[] args) {
		ImplClass ic = new ImplClass();
		ChildClass cc = new ChildClass();
		showInstanceName(ic);
		showInstanceAncestor(cc);
//		BoundedType.showInstanceName(ic);
//		BoundedType.showInstanceAncestor(cc);
//		BoundedType.<ImplClass>showInstanceName(ic);
//		BoundedType.<ChildClass>showInstanceAncestor(cc);
//		showInstanceName(cc);
//		showInstanceAncestor(ic);
	}
}





