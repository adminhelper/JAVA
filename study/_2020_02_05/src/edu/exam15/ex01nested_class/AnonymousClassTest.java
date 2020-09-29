package edu.exam15.ex01nested_class;

//Anonymouse Class (익명 클래스) 
//: java 컴파일러가 알아서 이름 지어라
//  나는 이름에 관심없다
interface Readable1{
	public void read();
}
class OuterClass2{
	private String myName;
	OuterClass2(String name){
		myName = name;
	}
	
	/*
	1) Local 클래스의 이름은 어차피 메서드 내부에서만 사용된다
	그러므로 개발자들은 (게을러서) 써주는 것에 불편함을 느꼈다.
	그래서 그냥 바로 인터페이스 형태로 객체를 생성해 리턴하되
	클래스 이름은 컴파일러가 알아서 만들도록 한 것을
	익명 클래스라고 부른다
	*/
	/*
	Field는 객체 소유이므로 별 문제 없다
	그러나 익명클래스 객체에서 메서드의 매개변수를 접근할 때는
	반드시 final을 선언해야 한다.
	final을 선언해야 익명 객체가 리턴될 때 
	익명 객체가 접근할 수 있도록 변경되지 않게 값을 보관하여 접근하게
	된다.
	*/
	public Readable1 createLocalClassInst(final int instID) {
		return new Readable1() {
			public void read() {
				System.out.println("Outer inst name:" + myName);
				System.out.println("Local inst id:" + instID);
			}
		};
	}
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		OuterClass2 out = new OuterClass2("Outer2");
		Readable1 localInst = out.createLocalClassInst(111);
		localInst.read();
		
		Readable1 localInst1 = out.createLocalClassInst(222);
		localInst1.read();
	}
}









