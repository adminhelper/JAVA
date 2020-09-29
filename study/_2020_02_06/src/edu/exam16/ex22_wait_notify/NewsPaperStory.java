package edu.exam16.ex22_wait_notify;

/*
동기화 기법중에는 불규칙적인 스레드의 순서를 제어하는 기법도 있다
여기서는 순서를 제어하는 방법을 익힌다
*/

/*
기자와 구독자 스레드를 동시에 실행시킨다.
그러나 구독자는 기자가 신문에 뉴스를 실어야 뉴스를 얻을 수 있다
그러므로 동시에 실행되지만
구독자는 기사가 써질 때까지 대기상태에 들어가고
기자가 뉴스를 쓰면 그 때 구독자는 대기 해제되어 뉴스를 얻게 된다

기자 -> 신문(뉴스 전달) -> 구독(뉴스 얻기)
*/

// 공유 클래스
class NewsPaper{
	private String todayNews;	// 공유 필드

	public String getTodayNews() {
		return todayNews;
	}

	public void setTodayNews(String todayNews) {
		this.todayNews = todayNews;
	}
}

// 스레드 클래스(기자)
class NewsWriter extends Thread{
	NewsPaper paper;
	public NewsWriter(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		// 기자는 뉴스를 신문에 쓴다
		paper.setTodayNews("코로나가 모두 사라졌습니다");
	}
}

// 스레드 클래스(구독자)
class NewsReader extends Thread{
	private NewsPaper paper;
	public NewsReader(NewsPaper paper) {
		this.paper = paper;
	}
	public void run() {
		// 구독자는 신문의 뉴스를 읽는다
		System.out.println("오늘 뉴스 : " + paper.getTodayNews());
	}
}

// 시작 클래스
public class NewsPaperStory {
	public static void main(String[] args) {
		NewsPaper paper = new NewsPaper();		
		NewsWriter writer = new NewsWriter(paper);
		NewsReader reader = new NewsReader(paper);
		
		reader.start();			
		writer.start();
		
		try {
			writer.join();
			reader.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}










