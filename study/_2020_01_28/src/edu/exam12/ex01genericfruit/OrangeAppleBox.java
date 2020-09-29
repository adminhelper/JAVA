package edu.exam12.ex01genericfruit;

class Orange{
	int weight;
	Orange(int weight){
		this.weight = weight;
	}
	void showWeight() {
		System.out.println("무게 : " + weight);
	}
}

class Apple{
	int sugar;
	Apple(int sugar){
		this.sugar = sugar;
	}
	void showSugar() {
		System.out.println("당분 : " + sugar);
	}
}

//공통된 부모 클래스인 Object를 필드와 매개변수로 하면
//범용적인 클래스를 만들 수 있다
class FruitBoxObj{
	Object item;
	void store(Object item) {
		this.item = item;
	}
	Object pullOut() {
		return item;
	}
}

public class OrangeAppleBox {
	public static void main(String[] args) {
		FruitBoxObj fbObj = new FruitBoxObj();
		fbObj.store(new Orange(3));
		Orange orange = (Orange)fbObj.pullOut();
		orange.showWeight();
		
		fbObj.store(new Apple(10));
		Apple apple = (Apple)fbObj.pullOut();
		apple.showSugar();
		
		fbObj.store(3.14);
		double dnum = (double) fbObj.pullOut();
		System.out.println(dnum);
	}
}





