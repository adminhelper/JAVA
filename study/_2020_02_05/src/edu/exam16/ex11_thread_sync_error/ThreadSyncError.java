package edu.exam16.ex11_thread_sync_error;

// 스레드들간에 공유할 클래스 생성

// 반복문의 호출 회수를 저장할 목적
class ShareCnt{
	private int cnt = 0;
	public void increment() { 
		cnt++;
	}
	public int getCnt() {
		return cnt;
	}
}

class ThreadLoop extends Thread{
	private ShareCnt sc;
	public ThreadLoop(ShareCnt sc) {
		this.sc = sc;
	}
	public void run() {
		for(int i=0;i<1000000;i++)
			sc.increment();
	}
}
/*
우리의 기대치는 각 스레드당 100만번 증가 하므로
3개 스레드 * 100만 = 300만의 결과를 예측했으나
이상하게도 실행할 때 마다 다른 값이 출력된다

=> 스레드가 특정 변수를 공유해서 연산할 때
   동기화 처리를 해야 한다
*/
public class ThreadSyncError {
	public static void main(String[] args) {
		ShareCnt shareCnt = new ShareCnt();
		ThreadLoop tl0 = new ThreadLoop(shareCnt);
		ThreadLoop tl1 = new ThreadLoop(shareCnt);
		ThreadLoop tl2 = new ThreadLoop(shareCnt);
		tl0.start();
		tl1.start();
		tl2.start();
		try {
			tl0.join();
			tl1.join();
			tl2.join();
			System.out.println(shareCnt.getCnt());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}






