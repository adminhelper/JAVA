package edu.exam09.ex06imp3;

public class SamsungMp3 implements IMp3 {

	@Override
	public void playMusic() {
		System.out.println("음악의 품질이 매우 좋다 ♬");
	}

	@Override
	public void listenFM() {
		System.out.println("라디오 소리가 깨끗하다 ♬");
	}

	@Override
	public void viewPhoto() {
		System.out.println("사진이 선명하다 ♬");
	}

	@Override
	public void volumeUp() {
		System.out.println("소리가 커진다 Well ♬");
	}

	@Override
	public void volumeDown() {
		System.out.println("소리가 작아진다 Well ♬");
	}

	@Override
	public void onMp3() {
		System.out.println("mp3가 켜진다 Well ♬");
	}

	@Override
	public void offMp3() {
		System.out.println("mp3가 꺼진다 Well ♬");
	}
}
