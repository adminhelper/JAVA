package edu.exam16.ex07_thread_priority;

/*
스레드에는 스케줄링(jvm이 스레드에 cpu할당하는 것)의 빈도수를
제어하기 위해 Priority를 가지고 있다.
기본적으로 Normal 우선순위를 가지고 있다
*/
class ThreadPriority extends Thread{
	private String msg;
	public ThreadPriority(String msg, int prio) {
		this.msg = msg;
		setPriority(prio);	// 우선순위를 변경한다
	}
	public void run() {
		for(int i=0;i<100000;i++)
			System.out.println(msg + "(" + getPriority() + ")");
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		ThreadPriority tp0 = 
				new ThreadPriority("First", Thread.MAX_PRIORITY);
		ThreadPriority tp1 = 
				new ThreadPriority("Second", Thread.NORM_PRIORITY);
		ThreadPriority tp2 = 
				new ThreadPriority("Third", Thread.MIN_PRIORITY);
		
		tp0.start();
		tp1.start();
		tp2.start();
	}
}









