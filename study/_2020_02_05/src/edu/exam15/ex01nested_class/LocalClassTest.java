package edu.exam15.ex01nested_class;

//Local Class : 메서드에 존재하는 클래스

interface Readable{
	public void read();
}
class OuterClass1{
	private String myName;
	OuterClass1(String name){
		myName = name;
	}
	public Readable createLocalClassInst() {
		class LocalClass implements Readable{
			public void read() {
				System.out.println("Outer inst name: "+ myName);
			}
		}
		return new LocalClass();
	}
}

public class LocalClassTest {
	public static void main(String[] args) {
		OuterClass1 out1 = new OuterClass1("First");
		Readable localInst1 = out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass1 out2 = new OuterClass1("Second");
		Readable localInst2 = out2.createLocalClassInst();
		localInst2.read();
	}
}



