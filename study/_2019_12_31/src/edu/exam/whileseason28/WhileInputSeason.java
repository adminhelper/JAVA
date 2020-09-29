package edu.exam.whileseason28;

import java.util.Scanner;

public class WhileInputSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {		
			System.out.print("계절을 입력하세요: ");
			String season = sc.next();
			String result;

			switch (season) {
			case "봄":
				result = "생기가 돈다";
				break;
			case "여름":
				result = "활기차다";
				break;
			case "가을":
				result = "풍성하다";
				break;
			case "겨울":
				result = "잠이 든다";
				break;
			case "그만":
				result = "그만";
				break;
			default:
				result = "잘 못 입력";
				break;
			}

			if(result.equals("그만"))
				break;	// while문을 빠져나간다
			
			System.out.println(result);
		}
		
		System.out.println("---The End---");
	}

}
