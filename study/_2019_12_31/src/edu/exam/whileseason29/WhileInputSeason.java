package edu.exam.whileseason29;

import java.util.Scanner;

public class WhileInputSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		무한 루프
//		do~while(true);
//		for(;;)
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
				System.out.println("---The End---");
				return;	// main 메서드를 중지
			default:
				result = "잘 못 입력";
				break;
			}

			System.out.println(result);
		}
	}

}
