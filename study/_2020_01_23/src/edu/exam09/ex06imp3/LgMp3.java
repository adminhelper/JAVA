package edu.exam09.ex06imp3;

public class LgMp3 implements IMp3 {

	@Override
	public void playMusic() {
		System.out.println("음악이 부드럽게 들린다 ♥");
	}

	@Override
	public void listenFM() {
		System.out.println("라디오를 들으니 편안하다 ♥");
	}

	@Override
	public void viewPhoto() {
		System.out.println("사진이 따뜻해 보인다 ♥");
	}

	@Override
	public void volumeUp() {
		System.out.println("소리가 커진다 ♥");
	}

	@Override
	public void volumeDown() {
		System.out.println("소리가 작아진다 ♥");
	}

	@Override
	public void onMp3() {
		System.out.println("잘 켜진다 ♥");
	}

	@Override
	public void offMp3() {
		System.out.println("잘 꺼진다 ♥");
	}
}
