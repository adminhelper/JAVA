package edu.exam04.fruit06;

/*
<클래스와 클래스간의 상호관계>
요구사항 : "나는 과일장수에게 사과 2개를 구매했다."
	      를 객체지향 프로그래밍으로 묘사하라
1) MVC : Model : 데이터, 데이터 제어
         View  : 화면, 사용자와 대화
         Controller : Model, View를 중간 제어, 업무 컨트롤
2) 명사/동사분류법
    명사 : 클래스, 필드
    동사 : 클래스, 메서드
3) 명사 : 나, 과일장수, 사과
4) 동사 : 구매했다.
5) 클래스의 대상 : 나, 과일장수
4) 사과 (2개) : 필드
6) 구매했다 : 메서드
*/

public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
//		객체의 참조값은 스택에 있는 변수에 저장되고
//		참조값을 jvm에 의해서 힙에 있는 객체 실체를 가리키게 된다.
		System.out.println(seller);
		System.out.println(buyer);
		
		// 상호작용(객체간의 메시지 전송/수신)
		// 둘중에 어느 것으로 표현해도 좋다.
		// 구매했다
		// 상대 객체의 기능을 사용하고 싶으면
		// 상대 객체의 참조변수를 매개변수로 해서 가리키게 한다
		// 그리고 메서드 내부에서 상대의 메서드를 호출한다
		buyer.buyApple(seller, 2000);
		//seller.saleApple(buyer, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}
}





