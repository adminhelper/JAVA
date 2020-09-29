package edu.exam06.police08;

public class Gun {
	int bullet;
	Gun(int bnum){
		bullet = bnum;
	}
	
	void shot() {
		System.out.println("BBANG!");
		bullet--;
	}
}
