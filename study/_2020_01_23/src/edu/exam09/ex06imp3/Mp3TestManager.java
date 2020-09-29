package edu.exam09.ex06imp3;

/**
 * @author bitcamp1
 * 1) 제작된 mp3를 테스트하는 클래스
 * 2) Bitcamp는 설계된 인터페이스를 토대로
 *   실제 mp3클래스(구현 클래스)가 만들어지는 동안 
 *   동시에 테스트 클래스를 만든다.
 */
public class Mp3TestManager {
	
	final int ONOFF_TEST = 5;
	final int VOLUME_TEST = 3;
	final int MUSIC_TEST = 7;
	
	// IMp3를 상속받은 자식클래스의 객체를
	// 담을 클래스 변수
	// 부모 클래스 변수 = 자식 객체
	private IMp3 mp3;
	
	/*
	UML 의존관계
	mp3필드는 변수일 뿐 실제 객체는
	외부에서 주입되기 때문에
	*/
	/*
	마틴 파울러는 이것을 의존성 주입(Dependency Injection)
	클래스 객체를 내부에서 결정하지 않고,
	외부에서 상속받은 자식 객체들을 전달할 수 있으므로
	동작은 동일하나 실제 내용은 다양하게 구성할 수 있어서
	서비스의 유연성을 가져온다.
	*/
	public Mp3TestManager() {
		this.mp3 = null;
	}
	
	public Mp3TestManager(IMp3 mp3) {
		this.mp3 = mp3;
	}
	
	public void setMp3(IMp3 mp3) {
		this.mp3 = mp3;
	}
	
	public void onOffTest() throws InterruptedException {
		for(int i=0;i<ONOFF_TEST;i++) {
			mp3.onMp3();
			Thread.sleep(500);
			mp3.offMp3();
			Thread.sleep(500);
		}
	}
	
	public void volumeTest() throws InterruptedException {
		for(int i=0;i<VOLUME_TEST;i++) {
			mp3.listenFM();
			Thread.sleep(300);
			mp3.volumeUp();
			Thread.sleep(300);
			mp3.volumeDown();
			Thread.sleep(300);
		}
	}
	
	public void musicTest() throws InterruptedException {
		for(int i=0;i<MUSIC_TEST;i++) {
			mp3.viewPhoto();
			Thread.sleep(100);
			mp3.playMusic();
			Thread.sleep(100);
			mp3.volumeUp();
			Thread.sleep(100);
			mp3.volumeDown();
			Thread.sleep(100);
		}
	}
}








