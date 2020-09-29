package edu.exam01.switchCase17;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력 : ");
		int score = sc.nextInt();
		String strScore;
		
		switch(score/10) {
		case 10:
		case 9:
			strScore = "A학점";
			break;
		case 8:
			strScore = "B학점";
			break;
		case 7:
			strScore = "C학점";
			break;
		case 6:
			strScore = "D학점";
			break;
		default:
			strScore = "F학점";
			break;
		}
			
		System.out.println(strScore + "입니다");
		
		sc.close();
	}

}
