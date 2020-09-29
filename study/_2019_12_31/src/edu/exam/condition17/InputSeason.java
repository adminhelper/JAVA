package edu.exam.condition17;

import java.util.Scanner;

public class InputSeason {
	public static void main(String[] args) {
		System.out.print("계절을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String season = sc.next();
		
		switch(season)
		{
		case "봄":
			System.out.println("생기가 돈다");
			break;
		case "여름":
			System.out.println("활기차다");
			break;
		case "가을":
			System.out.println("풍성하다");
			break;
		case "겨울":
			System.out.println("잠이 든다");
			break;
		default:
			System.out.println("잘 못 입력");
			break;
		}
	}
}
