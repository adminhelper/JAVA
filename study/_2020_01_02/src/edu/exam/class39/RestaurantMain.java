package edu.exam.class39;

import java.util.Scanner;

// 식당/식당에서 하는 일
// 명사 : 변수
// 동사 : 메서드
class Restaurant{
	// 메뉴 종류들
	private String[] foods = {"냉면", "칼국수", "쌀국수",
							"떡볶이", "순대", "튀김"};
	private String selFood;	// 선택 메뉴이름
	private int select;		// 선택 메뉴번호
	private Scanner sc = new Scanner(System.in);
	
	public void questionOrder() {
		for(int i=0;i<foods.length;i++)
			System.out.println(i + ". " + foods[i]);
	}
	public void selectFood() {
		System.out.print("어느 음식을 선택하실래요? ");
		select = sc.nextInt();
		selFood = foods[select];
	}
	public void deliveryFood() {
		System.out.println(selFood + "이 나왔습니다");
		System.out.println("맛있게 드세요 ^^");
	}
}

// 식당을 동작
public class RestaurantMain {
	public static void main(String[] args) {
		// 클래스를 설계하고 사용하기 위해서는
		// 클래스도 변수로 만들어야 한다.
		// 마치 정수를 저장하기 위해서 int를 설계하고
		// int num; 처럼 선언하는 것처럼
		
		// 클래스의 변수는 특별히 객체라고 부른다
		Restaurant rest = new Restaurant();
		rest.questionOrder();
		rest.selectFood();
		rest.deliveryFood();
	}
}





