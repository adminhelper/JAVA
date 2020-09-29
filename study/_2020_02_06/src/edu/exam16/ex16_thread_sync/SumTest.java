package edu.exam16.ex16_thread_sync;
/*
	2개의 스레드를 만든다
	1번째 스레드는 1 ~ 50까지의 합을 계산
	2번째 스레드는 51 ~ 100까지의 합을 계산
	main 스레드는 계산이 끝나고 2개의 총합을 화면에 출력
	
	1) join을 해서 main스레드에서 1번째 결과 + 2번째 결과
	2) 공유객체 생성 : 동기화 O
*/

// 총합을 저장할 공유 클래스
class ShareSum{
	private int sum = 0;
	
	public int getSum() {
		return sum;
	}
	public synchronized void setAddSum(int n) {
	//public void setAddSum(int n) {
		sum += n;
	}
}

class ThreadSum extends Thread{
	private int startNum;
	private int endNum;
	private ShareSum sSum;

	public ThreadSum(ShareSum sSum, int startNum, int endNum) {
		this.sSum = sSum;
		this.startNum = startNum;
		this.endNum = endNum;
	}
	public void run() {
		for(int i=startNum;i<=endNum;i++) {
			sSum.setAddSum(i);
		}
	}
}

public class SumTest {
	public static void main(String[] args) {
		ShareSum sSum = new ShareSum();
		ThreadSum ts0 = new ThreadSum(sSum, 1, 3000);
		ThreadSum ts1 = new ThreadSum(sSum, 3001, 6000);
		ThreadSum ts2 = new ThreadSum(sSum, 6001, 10000);
		
		ts0.start();
		ts1.start();
		ts2.start();
		
		try {
			ts0.join();	// ts0.run()이 반환될 때 리턴된다
			ts1.join();	// ts1.run()이 반환될 때 리턴된다
			ts2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000 총합 : " + sSum.getSum());
	}
}











