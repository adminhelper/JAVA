package edu.exam09.ex05selectmenu;

import java.util.Scanner;

public class SelectDayWeek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘의 요일을 선택하세요");
		System.out.println("1.월요일, 2.화요일, 3.수요일");
		System.out.println("4.목요일, 5.금요일, 6.토요일");
		System.out.println("7.일요일");
		System.out.print("번호 선택 : ");
		int sel = sc.nextInt();
		switch(sel) {
		case IWeek.MON:System.out.println("주간회의 있습니다");break;
		case IWeek.TUE:System.out.println("플젝회의 있습니다");break;
		case IWeek.WED:System.out.println("진행보고 있습니다");break;
		case IWeek.THU:System.out.println("축구시합 있습니다");break;
		case IWeek.FRI:System.out.println("플젝발표 있습니다");break;
		case IWeek.SAT:System.out.println("가족여행 떠납니다");break;
		case IWeek.SUN:System.out.println("오늘은 휴일입니다");break;			
		}
		
		sc.close();
	}
}






