package edu.exam01.while18;
//10 ~ 1까지 거꾸로 while문으로 출력
public class DoWhileLoop {
	public static void main(String[] args) {
		int num = 10;
		do {
			System.out.print(num + ", ");
			num--;
		}while(num > 0);
	}

}
