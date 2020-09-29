package edu.exam01.while19;
//1 ~ 100까지 합을 while문으로 출력
public class DoWhileLoop {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		}while(num <= 100);
		System.out.println("1~100 합은 " + sum);
	}

}
