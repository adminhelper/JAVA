package edu.exam.condition12;

import java.util.Scanner;

public class IfElseIfElseSentense {
	public static void main(String[] args) {
		System.out.println("온도 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 300)
			System.out.println("num은 300이므로 빵굽기 Start!");
		else if(num < 300)
			System.out.println("num은 300보다 적으므로 온도를 올리자");
		else if(num > 300)  // 300보다 큰 경우에 해당한다
			System.out.println("num은 300보다 크므로 온도를 내리자");
		sc.close();
	}

}
