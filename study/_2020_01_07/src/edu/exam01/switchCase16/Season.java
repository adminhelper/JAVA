package edu.exam01.switchCase16;

import java.util.Scanner;

/*
봄 => Spring
여름 => Summer
가을 => Autumn
겨울 => Winter*/

public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계절을 한글로 입력 : ");
		String season = sc.next();
		switch(season) {
		case "봄":
			System.out.println("Spring");
			break;
		case "여름":
			System.out.println("Summer");
			break;
		case "가을":
			System.out.println("Autumn");
			break;
		case "겨울":
			System.out.println("Winter");
			break;
		default:
			System.out.println("Invalid Value");
			break;
		}
	}
}



