package edu.exam04.star08;

import java.util.Scanner;

//숫자를 입력하면 숫자만큼 반복하세요
//5를 입력하면 아래처럼 출력하세요
//*
//*#
//**#
//***#
//****#

public class Star {
	public static void printStar(int num) {
		// 세로 행
		for(int i=0;i<num;i++) {
			// 가로 열
			for(int j=0;j<=i;j++) {
				if(i!=0 && j==i)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("별찍기 숫자 입력");
			int num = sc.nextInt();
			if(num == -1)
				break;
			printStar(num);
			System.out.println();
		}
		
		sc.close();
	}
}





