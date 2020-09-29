package edu.exam01.while18;

//10 ~ 1까지 거꾸로 while문으로 출력
public class WhileLoop {
	public static void main(String[] args) {
		int num = 10;
		while(num > 0) {
			System.out.print(num + ", ");
			num--;
		}
	}
}
