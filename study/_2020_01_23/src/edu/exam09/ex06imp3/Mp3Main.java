package edu.exam09.ex06imp3;

/**
 * @author bitcamp1
 * 테스트 클래스와 mp3클래스가 완성되면
 * 테스트를 진행할 main()가 있는 클래스
 * 
 * 장점 : 
 * 1) IMp3로 매개변수나 배열을 일원화 하므로
 *    IMp3에 대해서만 코드를 작성하면 된다
 *    (코딩 량이 줄어든다)
 * 2) 미리 IMp3로 스펙을 정해놓았기 때문에
 *    동시 작업이 가능하다
 *    (제조가 다 끝나고 나서 테스트 클래스를 만드는 것이 아니다)
 * 3) 새로운 구현 클래스를 만들 때 IMp3를 상속받게 만들면
 *    기존의 소스를 전혀 수정하지 않아도 주입(Injection)만 해도
 *    잘 돌아간다
 *    (유연성)
 */

/*
클래스의 3가지 종류
1) 구현 클래스 : 모든 메서드가 구현되어서 객체 생성 가능
                        현재 선택한 역할로 모두 구현이 가능할 때
                        상속받는 자식 클래스가 사용할 공통 기능 구현
2) 추상 클래스 : 일부 구현, 일부 미구현(추상 메서드)
                        일부 공통 기능을 구현
                        일부는 자식클래스가 결정해야함
3) 인터페이스 : 모두 미구현(모두 추상메서드)
                클래스간의 의존성 주입을 위해 규약(specification)만
                정해놓는다.
*/
/*
기능의 확장의 종류
1) 포함 : has a
2) 상속 : is a
   2-1) 클래스 상속(extends)
       : A is kind of B
              하위분류(A)는 상위분류(B)의 한 종류이다.
   2-2) 인터페이스 상속(implements)
       : A is able to B
        구현 클래스(A)는 인터페이스(B) 할 수 있어야 한다.
     (Framework, java Language)
     AutoCloseable, Appendable, Cloneable, Runnable...
       상속받아 구현(implements)하면 자바의 다른 객체가 이 규약에
       의해 호출하게 된다(기능 제공)
*/
public class Mp3Main {
	public static void main(String[] args) throws InterruptedException {
		Mp3TestManager mp3Tm = new Mp3TestManager();
		
		// 삼성,엘지,소니는 IMp3의 상속을 받은 자식 클래스이므로
		// 부모 인터페이스 변수(부모 클래스 변수)에 담을 수 있다
		IMp3[] mp3Arr = new IMp3[] {
			new SamsungMp3(),
			new LgMp3(),
			new SonyMp3()
		};
		
		for(IMp3 mp3 : mp3Arr) {
			System.out.println("------------------------");
			mp3Tm.setMp3(mp3);
			mp3Tm.onOffTest();			
			mp3Tm.volumeTest();
			mp3Tm.musicTest();
			System.out.println("------------------------");
		}
	}
}





