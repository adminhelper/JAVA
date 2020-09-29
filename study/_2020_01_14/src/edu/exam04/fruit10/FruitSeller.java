package edu.exam04.fruit10;

//변수의 값을 못 바꾸게 하고 싶으면 final을 붙여줘라
//변수의 상수화
//프로그래밍을 하다 보면 변수에 잘못된 값이 들어가면
//오류가 나게 되므로 처음 값을 고정하는 경우가 종종있다.
//이럴 때 변수를 상수로 만들고 보통 대문자로 쓰게 된다.

public class FruitSeller {
	int numOfApple;	// 사과 개수
	int saleMoney;		// 판매 금액
	int APPLE_PRICE;	// 사과 가격
	
	// 판매하다
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	
	// 판매결과
	public void showSaleResult() {
		System.out.println("***과일 장수의 현재 상황***");
		System.out.println("남은 사과: " + numOfApple);
		System.out.println("판매 수익: " + saleMoney);
	}
	
	public void initMembers(int money, int appleNum, int price) {
		saleMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
}








