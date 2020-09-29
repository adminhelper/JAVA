package edu.exam16.ex19_thread_sync_two;

// 공유 클래스
class ShareTwoNum{
	private int num0 = 0;
	private int num1 = 0;
	/*
	at0.run()을 호출하는 스레드가 num0의 연산을 하고 있다.
	그 때 at1.run()을 호출하는 스레드가 num1의 연산을 하고 있다면
	이 때는 동시에 연산이 이루어져도 아무런 문제가 없다.
	그러므로 아래처럼 num0, num1을 가리지 않고 무조건
	synchronized 해주게 되면 at0.run()스레드가 num0의 연산을
	할 때도 at1.run()스레드는 num1의 연산을 할 수 없게 된다.
	그러므로 속도도 느리고 비효율적인 과한 동기화가 된다.
	*/
	public synchronized void addOneNum0() {num0+=1;}
	public synchronized void addTwoNum0() {num0+=2;}
	public synchronized void addOneNum1() {num1+=1;}
	public synchronized void addTwoNum1() {num1+=2;}
	
	public void showTwoNum() {
		System.out.println("num0: " + num0);
		System.out.println("num1: " + num1);
	}
}

// 스레드 클래스
class AccessThread extends Thread{
	ShareTwoNum shareTwoNum;
	
	public AccessThread(ShareTwoNum inst) {
		shareTwoNum = inst;
	}
	/*
	연산이 매우 적으므로 오류가 잘 나타나지 않는다
	하지만 연산회수가 매우 많거나 공유하는 스레드가 많아지면
	오류의 위험이 존재한다
	
	왜냐하면 여러 스레드에서 동시에 num0이나 num1을 접근해서
	값을 변경하는 과정에 Context Switching이 발생하면
	값이 왜곡되게 된다.
	*/
	public void run() {
		// 동기화가 안되었을 때 오류값을 확인하기 위한 코드
		for(int i=0;i<10000;i++) {
			shareTwoNum.addOneNum0();	// 10000
			shareTwoNum.addTwoNum0();	// 20000
			shareTwoNum.addOneNum1();	// 10000
			shareTwoNum.addTwoNum1();	// 20000
		}
//		shareTwoNum.addOneNum0();	// num0+=1
//		shareTwoNum.addTwoNum0();	// num0+=2
//		shareTwoNum.addOneNum1();	// num1+=1
//		shareTwoNum.addTwoNum1();	// num1+=2
	}
}

public class SyncObjectKey {
	public static void main(String[] args) {
		// 공유 객체 생성
		ShareTwoNum shareTwoNum = new ShareTwoNum();
		
		// 스레드 객체 생성, 공유 객체 공유
		AccessThread at0 = new AccessThread(shareTwoNum);
		AccessThread at1 = new AccessThread(shareTwoNum);
		
		at0.start();
		at1.start();
		
		try {
			at0.join();
			at1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		shareTwoNum.showTwoNum();
	}
}








