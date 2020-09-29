package edu.exam.condition09;

import java.util.Scanner;

public class IfSentense {
	public static void main(String[] args) {
		System.out.println("온도 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 300)
			System.out.println("num은 300이므로 빵굽기 Start!");
		sc.close();
	}

}
