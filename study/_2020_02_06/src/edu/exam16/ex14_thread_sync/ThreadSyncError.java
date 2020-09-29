package edu.exam16.ex14_thread_sync;

// 스레드들간에 공유할 클래스 생성

// 반복문의 호출 회수를 저장할 목적
class ShareCnt{
	private int cnt = 0;
	
	// 메서드 전체를 보호할 필요가 없을 때
	// 일부만 보호하고 싶을 때
	public void increment() { 
		synchronized(this) {
			cnt++;
		}
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
java의 모든 Object의 내부에는 lock이라고 하는 키가 존재한다
이 키를 사용하면 연산이 일어나는 중에 다른 스레드로
컨텍스트 스위칭(Context Switching)이 일어나는 것을 방지할 수 있다.

스레드들간에 동시에 접근가능한 공유객체/변수들이 동기화 대상
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






