package edu.exam06.police08;

// 경찰이 총을 사용할 수 있게 하는 방법 2가지
// is A   : 상속 (is kind of)
// has A  : 포함

//경찰이 총이다, 경찰이 총의 종류이다 (부적합)
//경찰은 총을 가지고 있다.           (적합)
//
//상속은 자연계의 종속관계일 때 고려해볼 수 있다.

public class Police extends Gun {
	int handcuffs;	// 수갑의 개수
	
	Police(int bnum, int cnum){
		super(bnum);
		handcuffs = cnum;
	}
	
	void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
}




