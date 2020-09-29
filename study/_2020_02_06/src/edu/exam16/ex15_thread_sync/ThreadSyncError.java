package edu.exam16.ex15_thread_sync;

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
		for(int i=0;i<1000;i++)
			sc.increment();
	}
}
/*
java의 모든 Object의 내부에는 lock이라고 하는 키가 존재한다
이 키를 사용하면 연산이 일어나는 중에 다른 스레드로
컨텍스트 스위칭(Context Switching)이 일어나는 것을 방지할 수 있다.

스레드들간에 동시에 접근가능한 공유객체/변수들이 동기화 대상
*/

/*
<오류가 많아지는 경우>
1. 동기화 대상이 되는 변수들의 연산회수가 많을 수록
   오류가 발생할 확률이 높아진다
2. 동시에 변수를 공유하는 스레드가 많을 수록 
     오류가 발생할 확률이 높아진다
*/
/*
synchronized 메서드나
synchronized 블럭을 사용하면 
Object 내부의 lock key를 이용해서 잠그게 되므로
다른 스레드는 진입하지 못하고 대기상태에 들어가게 된다
동기화하면 속도가 저하되는 경향이 생긴다

그래서 공유 변수라 할지라도 많은 테스트를 통해
오류가 발생하지 않는다고 판단이 되면
동기화를 일부러 안하기도 한다.
하지만 꼭 해야할 동기화는 반드시 해야한다.
속도 < 정확성
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






