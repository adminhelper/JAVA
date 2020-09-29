package edu.exam01.switchCase15;

import java.util.Scanner;

/*0 => 봄
1 => 여름
2 => 가을
3 => 겨울
4 => 잘못 입력*/

public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 3의 숫자 입력 : ");
		int num = sc.nextInt();
		switch(num) {
		case 0:
			System.out.println("봄");
			break;
		case 1:
			System.out.println("여름");
			break;
		case 2:
			System.out.println("가을");
			break;
		case 3:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력");
			break;
		}
	}
}





