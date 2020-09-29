package edu.exam10.ex04finally;

/**
 * @author bitcamp1
 *
 *try{}			// 로직처리 집중
 *catch{}		// 예외처리 집중
 *finally{}		// 정상/비정상 => finally
 *              // 로직/예외 무조건 해야하는 처리
 *              // File, Network, DB
 */
public class FinallyTest {
	
	// 데이터를 외부에서 수신해서 DB에 저장하는 상황을 가정해서 처리
	public static void receiveFile() {
		try {
			int rNum = (int)(Math.random()*10);//0 ~ 10 난수 생성
			System.out.println("DB Open");
			for(int i=0;i<5;i++) {
				System.out.println("Data Receive " + i);
				Thread.sleep(1000);
				// 강제 예외 발생
				if(i==rNum)
					throw new Exception("Data Receive Error");
			}
			System.out.println("***DB 정상 Save***");
		}catch(Exception e) {
			System.out.println("---Data Error 처리---");
		}finally {			
			System.out.println("Finally - DB Close");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			receiveFile();
	}
}








