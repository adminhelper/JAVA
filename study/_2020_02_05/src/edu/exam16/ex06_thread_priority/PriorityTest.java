package edu.exam16.ex06_thread_priority;

/*
스레드에는 스케줄링(jvm이 스레드에 cpu할당하는 것)의 빈도수를
제어하기 위해 Priority를 가지고 있다.
기본적으로 Normal 우선순위를 가지고 있다
*/
class ThreadPriority extends Thread{
	private String msg;
	public ThreadPriority(String msg) {
		this.msg = msg;
	}
	public void run() {
		for(int i=0;i<10000;i++)
			System.out.println(msg + "(" + getPriority() + ")");
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		ThreadPriority tp0 = new ThreadPriority("First");
		ThreadPriority tp1 = new ThreadPriority("Second");
		ThreadPriority tp2 = new ThreadPriority("Third");
		
		tp0.start();
		tp1.start();
		tp2.start();
	}
}









