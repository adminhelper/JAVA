package edu.exam04.fruit06;

public class FruitBuyer {
	int myMoney = 5000;	// 보유 금액
	int numOfApple = 0;	// 사과 개수
	
	// 메시지 전송(buyer->seller)
	// 상대방의 객체의 메서드를 호출하는 것을 
	// 객체지향에서는 메시지 전송(상호작용)
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("***과일 구매자의 현재 상황***");
		System.out.println("현재 잔액: " + myMoney);
		System.out.println("사과 개수: " + numOfApple);
	}
}
