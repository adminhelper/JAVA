package edu.exam05.selfref04;

public class SelfReference {
	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		
		adder.add(10).add(20).add(30).showResult();
		
		SimpleAdder adder1 = new SimpleAdder();
		adder1.add(10);
		adder1.add(20);
		adder1.add(30);
		adder1.showResult();
	}
}
