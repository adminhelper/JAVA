package edu.exam04.restaurant02;

import java.util.Arrays;
import java.util.Random;

/*
식당 클래스 설계
1) 명사형과 동사형을 구분한다.
2) 명사형은 보통 변수가 된다.
3) 동사형은 보통 메서드가 된다.
*/

// 분식을 파는 일반적인 식당의 예

public class Restaurant {
	// 필드(변수): 명사
	int money = 100000;
	String[] foods = {"떡볶이", "순대", "라면", "쫄면"};
	int sel;		// 필드변수는 자동으로 초기화 됨
	
	// 메서드(기능): 동사
	void cleaning() {
		System.out.println("식당을 청소한다");
	}
	void prepareFoods() {
		System.out.println("음식 재료를 손질하다");
	}
	void welcome() {
		System.out.println("어서 오세요");
	}
	void byeBye() {
		System.out.println("안녕히가세요");
	}
	void getMoney(int m) {
		money += m;
		System.out.println(m + "을 음식값으로 받음");
	}
	void calcMoney() {
		System.out.println("오늘 돈은 " + money + "이다");
	}
	void anyFood() {
		System.out.println("어떤 음식 드실래요?");
		System.out.println(Arrays.toString(foods));
		Random rd = new Random();
		sel = rd.nextInt(foods.length);
		System.out.println(foods[sel] + "이요");
	}
	void cookFood() {
		System.out.println(foods[sel] + "을 요리하다");
	}
	void sendFood() {
		System.out.println(foods[sel] + "나왔습니다");
		System.out.println("맛있게 드세요");
	}
	
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		
		// 본격적으로 손님이 오기전에 할 일
		rest.cleaning();
		rest.prepareFoods();
		
		// 손님오면 맞이하기
		for(int i=0;i<10;i++) {
			System.out.println("-------------------");
			rest.welcome();
			rest.anyFood();
			rest.cookFood();
			rest.sendFood();
			rest.getMoney(9000);
			rest.byeBye();
			System.out.println("-------------------");
		}
		
		// 하루를 마치고 해야 할 일
		rest.calcMoney();
		rest.cleaning();
	}
}







