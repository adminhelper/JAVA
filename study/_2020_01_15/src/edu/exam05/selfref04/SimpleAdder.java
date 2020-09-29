package edu.exam05.selfref04;

// str1.concat(str2).concat(str3); 의미

public class SimpleAdder {
	private int num;
	public SimpleAdder() {
		num = 0;
	}
	public SimpleAdder add(int num) {
		this.num += num;
		
		// 메서드를 호출한 자기 자신의 객체 참조
		return this;
	}
	public void showResult() {
		System.out.println("add result: " + num);
	}
}






