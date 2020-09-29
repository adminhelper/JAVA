package edu.exam06.police11;

public class Gun {
	private int bullet;
	public Gun(){
		bullet = 0;
	}
	public Gun(int bnum){
		bullet = bnum;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bnum) {
		bullet = bnum;
	}
	public void shot() {
		System.out.println("BBANG!");
		bullet--;
	}
}
