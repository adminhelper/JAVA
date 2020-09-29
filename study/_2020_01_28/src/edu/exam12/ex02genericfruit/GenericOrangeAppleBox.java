package edu.exam12.ex02genericfruit;


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

// T는 다른 문자로 써도 관계없다
// T = Type
// E, K, V, U...
// T를 대체되는 타입
// T의 자료형은 지금 결정안하고 사용할 때 타입을 정해준다
// Generic Programming(일반화 프로그래밍)
// C++ : Template, C# : Generic
/*
내부적으로는
main이 실행될 때
class FruitBoxOrange
class FruitBoxApple
class FruitBoxInteger
게 생성된다
*/
/*
논리와 용법이 동일하지만
사용하는 데이터 자료형이 다를 때
비유 : 슈크림 붕어빵, 단팥 붕어빵
이런 경우에 가장 알맞은 것 : 자료구조=>컬렉션, 알고리즘
*/
class FruitBox<T>{
	T item;
	void store(T item) {
		this.item = item;
	}
	T pullOut() {
		return item;
	}
}

public class GenericOrangeAppleBox {
	public static void main(String[] args) {
		FruitBox<Orange> fbOrange = new FruitBox<Orange>();
		fbOrange.store(new Orange(3));
		Orange orange = fbOrange.pullOut();
		orange.showWeight();
		
		FruitBox<Apple> fbApple = new FruitBox<Apple>();
		fbApple.store(new Apple(10));
		Apple apple = fbApple.pullOut();
		apple.showSugar();
		
		FruitBox<Integer> fbInt = new FruitBox<Integer>();
		fbInt.store(100);
		int num = fbInt.pullOut();
		System.out.println(num);
	}
}








