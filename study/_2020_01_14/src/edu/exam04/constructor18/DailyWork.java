package edu.exam04.constructor18;

public class DailyWork {
	private String day = "주중";
	private String risingTime = "6시";
	private String breakfastTime = "7시";
	private String sleepTime = "24시";
	
	DailyWork(){
		System.out.println("생성자 호출(0)");
	}
	
	DailyWork(String day,
			String risingTime, 
			String breakfastTime,
			String sleepTime){
		System.out.println("생성자 호출(1)");
		this.day = day;
		this.risingTime = risingTime;
		this.breakfastTime = breakfastTime;
		this.sleepTime = sleepTime;
	}
	
	void dayInfo() {
		System.out.println("***************************");
		System.out.printf("오늘은 %s이다\n", day);
		System.out.printf("아침 %s에 일어나다\n", risingTime);
		System.out.printf("아침을 %s에 먹다\n", breakfastTime);
		System.out.printf("%s에 잠을 자다\n", sleepTime);
	}
}
