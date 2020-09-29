package edu.exam16.ex25_wait_notifyall;

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

	// 구독자한테 뉴스를 전달함
	public String getTodayNews() {
		if(todayNews==null) {
			try {
				// wait()와 notify()가 각각 다른 스레드에 의해
				// 동시에 호출되지 않도록 막아준다
				synchronized(this) {
					System.out.println("구독자가 wait()~");
					// 스레드 제어를 위해 Object가 상속해준 메서드
					wait(); // 신호가 오기전까지 스레드가 잠이든다
					System.out.println("구독자가 깨어남!");
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return todayNews;
	}

	// 기자가 뉴스를 기록함
	public void setTodayNews(String todayNews) {
		this.todayNews = todayNews;
		
		synchronized(this) {
			// wait()로 현재 잠이 들어있는 1명을 깨운다
			System.out.println("기자가 notify()");
			//notify();	// Object의 상속을 받은 메서드
			// wait()로 현재 잠이 들어있는 모든 구독자를 깨운다
			notifyAll();
		}
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
		NewsReader reader0 = new NewsReader(paper);
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		NewsReader reader3 = new NewsReader(paper);
		NewsReader reader4 = new NewsReader(paper);
		
		reader0.start();
		reader1.start();	
		reader2.start();	
		reader3.start();	
		reader4.start();
		
		try {		
			Thread.sleep(1000);
			writer.start();
			writer.join();
			reader0.join();
			reader1.join();
			reader2.join();
			reader3.join();
			reader4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}










