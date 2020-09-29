package edu.exam05.classarray11;

// Wrapper 클래스
class Number{
	private int num;
	public Number(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}

public class ClassArray {
	public static void main(String[] args) {
		Number[] numArr = new Number[3];
		numArr[0] = new Number(3);
		numArr[1] = new Number(2);
		numArr[2] = new Number(1);
		for(Number num : numArr)
			System.out.println(num.getNum());
		System.out.println();
		
		Number[] numArr1 = new Number[] {
			new Number(2),
			new Number(4),
			new Number(8)
		};
		for(int i=0;i<numArr1.length;i++)
			System.out.println(numArr1[i].getNum());
	}
}







