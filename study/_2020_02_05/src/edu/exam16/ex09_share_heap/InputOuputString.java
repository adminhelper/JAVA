package edu.exam16.ex09_share_heap;

import java.util.Scanner;

// 메인스레드에서 결과값을 받아서 다른 스레드에 넘겨주기
// 1) 부모스레드를 통한 데이터 공유(간접 공유) X
// 2) 힙 객체를 통한 공유(직접 공유) O

// 공유 클래스 생성
class ShareNews{
	public String strNews = null;	// 공유 필드
}

class ThreadInput extends Thread{
	private Scanner sc = new Scanner(System.in);
	private ShareNews sNews;
	public ThreadInput(ShareNews sn) {
		this.sNews = sn;
	}
	public void run() {
		System.out.print("ThreadInput: 뉴스를 입력하세요 >> ");
		sNews.strNews = sc.nextLine();
	}
}

class ThreadOutput extends Thread{
	private ShareNews sNews;
	public ThreadOutput(ShareNews sn) {
		sNews = sn;
	}
	public void run() {
		while(true) {
			if(sNews.strNews != null) {
				System.out.println("ThreadOutput: 지금 도착한 뉴스는 [" + 
							sNews.strNews + "] 입니다");
				break;
			}
			try {
				//System.out.println("뉴스 확인 대기...");
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InputOuputString {
	public static void main(String[] args) {
		// 2개 스레드가 공유할 객체(필드가 힙에 존재)
		ShareNews sNews = new ShareNews();
		ThreadInput ti = new ThreadInput(sNews);
		ThreadOutput to = new ThreadOutput(sNews);
		ti.start();
		to.start();
	}
}









