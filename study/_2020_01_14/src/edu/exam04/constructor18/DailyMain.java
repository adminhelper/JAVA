package edu.exam04.constructor18;

/*
생성자에서 여러 개의 생성자 메서드를 제공하는 이유는
객체를 초기화하거나 초기동작이 다를 수 있는 경우를
적용하도록 유연하게 구성한 것이다
*/

public class DailyMain {
	public static void main(String[] args) {
		DailyWork dw0 = new DailyWork();	// 월
		DailyWork dw1 = new DailyWork();	// 화
		DailyWork dw2 = new DailyWork();	// 수
		DailyWork dw3 = new DailyWork();	// 목
		DailyWork dw4 = new DailyWork();	// 금
		DailyWork dw5 = new DailyWork("토", "오전 11시", "오전 11시 30분", "새벽 3시");	// 토
		DailyWork dw6 = new DailyWork("일", "오후 1시", "No Time", "새벽 4시");	// 일
		
		dw0.dayInfo();
		dw1.dayInfo();
		dw2.dayInfo();
		dw3.dayInfo();
		dw4.dayInfo();
		dw5.dayInfo();
		dw6.dayInfo();
	}
}
