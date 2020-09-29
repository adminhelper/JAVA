package edu.exam08.tostring02;

/*
모든 Java의 클래스는 Object클래스의 상속을 받는다
Object클래스가 상속하는 Method중에
가장 많이 사용되고 Overriding되는 Method는
equals와 toString이다
*/
/*
1) toString은 객체의 정보를 나타내는 메서드
  - 객체가 null일 때는 null을 반환한다
  - Object에 구현된 내용은(기본적인 내용)
   [패키지+클래스이름+@+16진수]로 구성된
   hashcode를 반환한다
  - System.out.println(객체): 
	  이 때 보여지는 정보는 원래 참조값이지만,
	 내가 원하는 목적의 정보를 보여지게 하는데 종종 사용된다.
  - 그런데 String클래스는 문자열 내용이 중요하므로
    이미 Overriding되어 객체정보가 아니라
    문자열 내용을 반환하게 되어 있다.
    
2) 기본적으로 equals와 ==는 동일하다.
   즉, 객체의 참조값(hashcode)가 같은 지 다른 지를 판단하여 
   boolean으로 반환한다.(힙의 같은 공간에 할당된 객체냐)
   그러나 우리가 내용이 비교하고 싶은 값을 비교해서 판단하고자 하면
   equals를 Overriding해서 사용한다.
   - String클래스는 이미 문자열을 비교하도록 Overriding되어 있다
     다른 클래스도 String클래스처럼 비교하고 싶은 내용으로 Overrding하면
     된다.
   - ==은 항상 객체의 참조값을 비교한다
     Java의 문자열도 ==을 쓰면 문자열 내용 비교를 할 수 없다.
*/


public class Ball {
	private float rad;
	
	public Ball(float rad) {
		this.rad = rad;
	}
	
	// 객체의 정보를 보여줄 때 Overriding하라고 상속해준 메서드
	public String toString() {
		return "이 공의 반지름은 " + rad;
	}
	
	// 객체내의 정보가 같은 지 여부를 판단 할 때 Overriding하라고 
	// 상속해준 메서드
	public boolean equals(Object obj) {
		return this.rad == ((Ball)obj).rad;
	}
	
	public static void main(String[] args) {
		Ball ball1 = new Ball(30);
		Ball ball2 = new Ball(30);
		
		System.out.println(ball1);	// ball1.toString();
		System.out.println(ball2);	// ball2.toString();
		System.out.println(ball1 == ball2);
		System.out.println(ball1.equals(ball2));
	}
}



