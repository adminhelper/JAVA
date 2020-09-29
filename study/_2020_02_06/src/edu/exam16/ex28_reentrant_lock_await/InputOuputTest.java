package edu.exam16.ex28_reentrant_lock_await;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/*
<순서 제어>
공유 데이터 클래스
5회 반복{
	키보드 입력 스레드 : 사용자의 입력
	화면 출력 스레드   : 입력데이터를 출력
}
*/
/*
ReentrantLock의 Condition을 이용한 동기화
lock ~ unlock사이에서 호출하는 메서드들이다(synchronized 블록)
await : (wait) 스레드가 잠이 든다 그리고 lock을 해제
signal : (notify) wait를 해제시킨다
signalAll : (notifyAll) 모든 wait를 해제시킨다.
*/
/*
1) writeCond : 사용자가 데이터를 입력받아 저장하라는 상태
2) readCond : 입력받은 데이터를 화면에 출력하라는 상태
*/
// 공유 클래스
class ShareString{
	private String newString;
	
	// true면 새로 입력 데이터 존재
	// false면 새 입력 데이터 X
	private boolean isNewString = false;
	
	// 순서 제어 동기화 사용 객체
	// entLock : Condition객체를 사용할 범위 지정
	// readCond, writeCond객체는 대기, 신호
	private final ReentrantLock entLock = new ReentrantLock();
	private final Condition readCond = entLock.newCondition();
	private final Condition writeCond = entLock.newCondition();
	
	public void setNewString(String news) {
		entLock.lock();
		
		try {
			if(isNewString == true) {
				writeCond.await();
			}
			
			newString = news;
			isNewString = true;
			readCond.signal();// readCond.await()를 깨운다
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			entLock.unlock();
		}
	}
	
	public String getNewString() {
		String retStr = null;
		entLock.lock();

		try {
			// 읽을 데이터가 없으면 
			if(isNewString == false) {
				// 스레드 대기상태
				// lock()을 해제
				readCond.await();	
			}	
			
			retStr = newString;
			isNewString = false;
			writeCond.signal();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			entLock.unlock();
		}
		
		return retStr;
	}
}

// 키보드 입력 클래스(스레드)
class InputKeyboard extends Thread{
	private ShareString shareString;
	public InputKeyboard(ShareString sStr) {
		shareString = sStr;
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		String readStr;
		for(int i=0;i<5;i++) {
			readStr = sc.nextLine();
			shareString.setNewString(readStr);
		}
		sc.close();
	}
}

// 화면 출력 클래스(스레드)
class OutputConsole extends Thread{
	private ShareString shareString;
	public OutputConsole(ShareString sStr) {
		shareString = sStr;
	}
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(shareString.getNewString());
	}
}

// 시작 클래스
public class InputOuputTest {
	public static void main(String[] args) {
		ShareString shareString = new ShareString();
		InputKeyboard ik = new InputKeyboard(shareString);
		OutputConsole oc = new OutputConsole(shareString);
		
		System.out.println("입출력 스레드 실행");
		ik.start();
		oc.start();
	}
}






