package edu.exam16.ex08_share_heap;

import java.util.Scanner;

// 메인스레드에서 결과값을 받아서 다른 스레드에 넘겨주기
// 1)부모스레드를 통한 데이터 공유(간접 공유) O
// 2)힙 객체를 통한 공유(직접 공유) X

class ThreadInput extends Thread{
	private String strNews;
	private Scanner sc = new Scanner(System.in);
	
	public String getStrNews() {
		return strNews;
	}
	
	public void run() {
		System.out.print("ThreadInput: 뉴스를 입력하세요 >> ");
		strNews = sc.nextLine();
	}
}

class ThreadOutput extends Thread{
	private String strNews;
	public ThreadOutput(String news) {
		strNews = news;
	}
	public void run() {
		System.out.println("ThreadOutput: 지금 도착한 뉴스는 [" + 
							strNews + "] 입니다");
	}
}

public class InputOuputString {
	public static void main(String[] args) {
		ThreadInput ti = new ThreadInput();
		ti.start();
		try {
			ti.join();
			String news = ti.getStrNews();
			System.out.println("main : " + news);
			ThreadOutput to = new ThreadOutput(news);
			to.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
	}
}









