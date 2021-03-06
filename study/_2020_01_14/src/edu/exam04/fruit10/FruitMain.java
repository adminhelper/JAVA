package edu.exam04.fruit10;

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

/*
필드는 메서드를 통해 간접접근하는 것이 원칙이다.
왜냐하면 필드는 여러 메서드에서 사용하게 되는데
외부에서 필드를 자유롭게 접근하게 되면
만약 잘못된 값을 입력시 관련 메서드들이 모두
오작동할 위험이 있기 때문에
메서드의 매개변수와 return값을 통해 간접접근한다.
*/
/*
그런데 필드초기화 작업 같은 경우 별도의 초기화 함수를 사용하는 
것은 단점이 있을 수 있다.
1) 초기화 함수가 여러번 호출되면 중간의 값이 사라질 수도 있다.
2) final필드는 초기화 메서드에서는 초기화 할 수 없다.

그래서 초기화 메서드 대신 "생성자"를 사용하도록 한다
"생성자"를 만든 목적은 필드의 초기화와
초기 동작 설정을 위해 만들어졌다
"생성자"는 final필드를 초기화하는 것이 가능하다
*/
public class FruitMain {
	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		seller.initMembers(0, 20, 1000);
		FruitBuyer buyer = new FruitBuyer();
		buyer.initMembers(10000, 0);
		
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





