package edu.exam04.restaurant05;

import java.util.Arrays;
import java.util.Random;

/*
식당 클래스 설계
1) 명사형과 동사형을 구분한다.
2) 명사형은 보통 변수가 된다.
3) 동사형은 보통 메서드가 된다.
4) 필드는 함부로 접근하면 문제의 소지가 매우 많음
   그래서 일반적으로 외부 접근을 금지시킴(private)
   class내에서만 접근 가능
5) 메서드는 일반적으로 외부 호출을 전제로 함
   그래서 일반적으로 접근을 허가함
   public  : 모두 접근 가능 
   default : 같은 패키지에서는 모두 접근 가능 
6) 클래스에는 초기화작업을 하는 메서드가 존재한다
   이 메서드는 객체 생성과 동시에 호출되는 메서드로
  "생성자"라 부른다.
  만약 생성자를 만들지 않으면 컴파일러가 자동으로
  default 생성자를 추가해준다.
*/

// 분식을 파는 일반적인 식당의 예

class Restaurant {
	// 필드(변수): 명사
	private int money = 100000;
	private String[] foods = {"떡볶이", "순대", "라면", "쫄면"};
	private int sel;		// 필드변수는 자동으로 초기화 됨
	
	// 접근 권한을 주지 않으면 default 권한이 적용된다.
	// 메서드(기능): 동사
	
	// 클래스 이름과 동일
	// 자동으로 호출되는 것이지 외부에서 임의로 호출할 수 있는 것은
	// 아니다
	// 객체 생성시 자동으로 호출(초기화 작업을 담당)
	Restaurant(){
		System.out.println("--생성자 호출--");
		cleaning();
		prepareFoods();
	}
	
	// Method중에 외부에서 호출될 필요가 없는 것은
	// private으로 선언한다.
	private void cleaning() {
		System.out.println("식당을 청소한다");
	}
	private void prepareFoods() {
		System.out.println("음식 재료를 손질하다");
	}
	private void calcMoney() {
		System.out.println("오늘 돈은 " + money + "이다");
	}
	
	void welcome() {
		System.out.println("어서 오세요");
	}
	void byeBye() {
		System.out.println("안녕히가세요");
	}
	void getMoney(int m) {
		if(m < 0) {
			System.out.println("음식값을 주세요");
			return;
		}
		money += m;
		System.out.println(m + "을 음식값으로 받음");
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
	void finishWork() {
		calcMoney();
		cleaning();
	}
}

public class RunRestaurant{
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		
		// 본격적으로 손님이 오기전에 할 일
		// 어차피 식당을 열기 전에 해야할 초기화 작업이라면
		// 아래처럼 하지 않고 생성자를 종종 이용한다.
		//rest.cleaning();
		//rest.prepareFoods();
		
		// 손님오면 맞이하기
		for(int i=0;i<10;i++) {
			System.out.println("-------------------");
			rest.welcome();
//			if(i==5)
//				rest.foods = new String[] {"쥐", "바퀴벌레"};
			rest.anyFood();
			rest.cookFood();
			rest.sendFood();
			rest.getMoney(9000);
//			rest.money = -10000000;
			rest.byeBye();
			System.out.println("-------------------");
		}
		
		// 하루를 마치고 해야 할 일
		rest.finishWork();
//		rest.calcMoney();
//		rest.cleaning();
	}	
}







