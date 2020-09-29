package edu.exam16.ex12_middle;

class CarMaker extends Thread {
	String car[];
	public CarMaker(String car[]) {
		this.car = car;
	}
	@Override
	public void run() {
		for (int i = 0; i < car.length; i++) {
			int rn = (int)(Math.random()*5)+1;
			if(rn == 1)
				car[i] = "그랜져";
			else if(rn == 2)
				car[i] = "소나타";
			else if(rn == 3)
				car[i] = "SM5";
			else if(rn == 4)
				car[i] = "카렌스";
			else if(rn == 5)
				car[i] = "카니발";
		}
	}
}

class CarSeller extends Thread {
	String car[];
	public CarSeller(String car[]) {
		this.car = car;
	}
	@Override
	public void run() {
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i] + "을(를) 판매했습니다.");
		}
	}

}

public class Middle {
	static String car[] = new String[5];
	public static void main(String[] args) {
		CarMaker cm = new CarMaker(car);
		CarSeller cs = new CarSeller(car);
		
		cm.start();		
		
		try {
			cm.join();	
			cs.start();
			cs.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("모든 차 판매 완료.");
	}
}
