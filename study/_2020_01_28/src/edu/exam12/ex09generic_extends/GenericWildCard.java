package edu.exam12.ex09generic_extends;

class Fruit{
	public void showYou() {
		System.out.println("나는 과일");
	}
}
class Apple extends Fruit{
	public void showYou() {
		super.showYou();
		System.out.println("나는 사과");
	}
}
class FruitBox<T>{
	T item;
	public void store(T item) {this.item = item;}
	public T pullOut() {return item;}
}

public class GenericWildCard {
	public static void showFruitBox(
			FruitBox<? extends Fruit> box) {
		Fruit fruit = box.pullOut();
		fruit.showYou();
	}
	public static void main(String[] args) {
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		box1.store(new Fruit());
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		box2.store(new Apple());
		showFruitBox(box1);
		showFruitBox(box2);
	}
}





