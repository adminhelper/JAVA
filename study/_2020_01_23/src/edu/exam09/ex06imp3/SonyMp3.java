package edu.exam09.ex06imp3;

public class SonyMp3 implements IMp3 {

	@Override
	public void playMusic() {
		System.out.println("음악이 들리다 아베소리가 들린다◐");
	}

	@Override
	public void listenFM() {
		System.out.println("아베가 이상한 랩을 한다◐");
	}

	@Override
	public void viewPhoto() {
		System.out.println("아베사진이 이상하다◐");
	}

	@Override
	public void volumeUp() {
		System.out.println("아베가 Up되었나보다◐");
	}

	@Override
	public void volumeDown() {
		System.out.println("아베가 녹다운◐");
	}

	@Override
	public void onMp3() {
		System.out.println("켜지더니 꺼졌다◐");
	}

	@Override
	public void offMp3() {
		System.out.println("꺼지더니 켜졌다◐");
	}

}
