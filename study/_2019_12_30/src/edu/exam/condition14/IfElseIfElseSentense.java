package edu.exam.condition14;

import java.util.Scanner;

public class IfElseIfElseSentense {
	public static void main(String[] args) {
		System.out.println("온도 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 300) {
			System.out.println("num은 300이므로 빵굽기 Start!");
		}
		else if(num < 300) {
			int result = 300 - num;
			System.out.println("num은 300보다 적으므로 " + result + "을 올려라");
		}
		else if(num > 300) { // 300보다 큰 경우에 해당한다
			int result = num - 300;
			System.out.println("num은 300보다 크므로 " + result + "을 내려라");
		}
		sc.close();
	}

}
