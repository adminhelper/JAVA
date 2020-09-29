package edu.exam06.police11;

public class ForcePolice extends Police {
	Gun pistol = new Gun();		// 포함관계
	int handcuff;				// 수갑 개수
	ForcePolice(String hat, String cloth, int bnum, int bcuff){
		super(hat, cloth);
		pistol.setBullet(bnum);
		this.handcuff = bcuff;
	}
	void shot() {
		if(pistol.getBullet() > 0)
			pistol.shot();
		else
			System.out.println("Hut BBANG!");
	}
	void putHandcuff(){
		System.out.println("SNAP!");
		this.handcuff--;
	}
}
