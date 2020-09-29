package edu.exam04.methodoverloading19;

// 메서드 오버로딩
// ; 같은 이름의 메서드가 여러 개이다

public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	
	// 시간을 숫자로 입력받고 싶을 때
	WatchTime(int hour, int min, int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	// 시간을 단어로 입력받고 싶을 때
	WatchTime(String strHour, String strMin, String strSec){
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
	}
	
	void viewTime() {
		System.out.printf("[%d:%d:%d]\n", hour, min, sec);
	}
	
	void viewTime(int num) {
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}
	
	void viewTime(String str) {
		System.out.printf("- %s %s %s -\n", strHour, strMin, strSec);
	}
	
	
	public static void main(String[] args) {
		WatchTime wt0 = new WatchTime(1, 3, 7);
		WatchTime wt1 = new WatchTime("한시", "이십분", "십구초");
		
		wt0.viewTime();
		wt0.viewTime(2);
		wt1.viewTime("");
	}
}








