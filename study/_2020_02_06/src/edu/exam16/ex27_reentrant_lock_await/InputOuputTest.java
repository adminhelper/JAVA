package edu.exam16.ex27_reentrant_lock_await;

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
lock ~ unlock사이에서 호출하는 메서드들이다
await : (wait) 스레드가 잠이 든다 그리고 lock을 해제
signal : (notify) wait를 해제시킨다
signalAll : (notifyAll) 모든 wait를 해제시킨다.
*/
/*
1) 화면 출력 스레드 (데이터가 없으니까 ) 대기
2) 입력 키보드 스레드 (새로운 데이터) 입력
   화면 출력 스레드한테 깨어나라 신호 전송
   화면에서 아직 읽어가지 않아서(새로운 데이터 상태) 대기
3) 화면 출력 스레드 깨어나서 화면 출력
   다 읽어갔으니까 입력 키보드는 입력을 받아라(깨어나라) 신호 전송
  화면 출력 스레드는 다시 대기상태
4) 입력 키보드는 깨어나서 다시 입력
......
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
				System.out.println("InputKey - 아직 새 입력값을 출력하기"+
							"전 이므로 대기에 들어갈께...");
				writeCond.await();
			}
			
			newString = news;
			isNewString = true;
			System.out.println("InputKey - 화면에 출력해~ 신호");
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
				System.out.println("OutputCon - 새 입력값이 없으니까 " +
							" 기다릴께~");
				readCond.await();	
			}	
			
			retStr = newString;
			isNewString = false;
			System.out.println("OutputCon - 다시 새로운 입력 부탁해! 신호");
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






