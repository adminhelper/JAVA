package edu.exam16.ex18_thread_sync_two;

// 공유 클래스
class ShareTwoNum{
	private int num0 = 0;
	private int num1 = 0;
	
	public void addOneNum0() {num0+=1;}
	public void addTwoNum0() {num0+=2;}
	public void addOneNum1() {num1+=1;}
	public void addTwoNum1() {num1+=2;}
	
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
		shareTwoNum.addOneNum0();	// num0+=1
		shareTwoNum.addTwoNum0();	// num0+=2
		shareTwoNum.addOneNum1();	// num1+=1
		shareTwoNum.addTwoNum1();	// num1+=2
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







