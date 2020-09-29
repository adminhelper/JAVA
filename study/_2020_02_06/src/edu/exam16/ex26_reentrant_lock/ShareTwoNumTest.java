package edu.exam16.ex26_reentrant_lock;

import java.util.concurrent.locks.ReentrantLock;


// java 1.5 sdk에서 제공하는 동기화 방식
// ReentrantLock 클래스

// 공유 클래스
class ShareTwoNum{
	private int num0 = 0;
	private int num1 = 0;
	
	private final ReentrantLock key0 = new ReentrantLock();
	private final ReentrantLock key1 = new ReentrantLock();
	
	public void addOneNum0() {	
		key0.lock();
		try {
			num0 += 1;
		}finally {
			key0.unlock();
		}
	}
	public void addTwoNum0() {
		key0.lock();
		try {
			num0 += 2;
		}finally {
			key0.unlock();
		}
	}
	public void addOneNum1() {	
		key1.lock();
		try {
			num1 += 1;
		}finally {
			key1.unlock();
		}
	}
	public void addTwoNum1() {
		key1.lock();
		try {
			num1 += 2;
		}finally {
			key1.unlock();
		}
	}
	public void showTwoNum() {
		System.out.println("num0 : " + num0);
		System.out.println("num1 : " + num1);
	}
}
//스레드 클래스
class AccessThread extends Thread{
	ShareTwoNum shareTwoNum;
	
	public AccessThread(ShareTwoNum inst) {
		shareTwoNum = inst;
	}

	public void run() {
		// 동기화가 안되었을 때 오류값을 확인하기 위한 코드
		for(int i=0;i<10000;i++) {
			shareTwoNum.addOneNum0();	// 10000
			shareTwoNum.addTwoNum0();	// 20000
			shareTwoNum.addOneNum1();	// 10000
			shareTwoNum.addTwoNum1();	// 20000
		}
	}
}
public class ShareTwoNumTest {
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



