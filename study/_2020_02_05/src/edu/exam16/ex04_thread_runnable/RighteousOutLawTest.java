package edu.exam16.ex04_thread_runnable;
/*
java에서 스레드를 담당하는 클래스를 만드는 2가지 방법
1) Thread 클래스를 상속한다
2) Runnable 인터페이스를 상속하고
   객체를 Thread의 인자로 넘겨준다
   
2가지 방법을 제공하는 이유
java는 클래스는 단일 상속이기 때문에
이미 다른 클래스를 상속받은 클래스에
스레드를 제공하려면
Thread를 상속받을 수 없고
대신 Runnable을 상속시켜서 사용하게 한다
*/
class Steal implements Runnable{
	private String name;
	public Steal(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name + ": 물건을 옮기고 있다");
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println(name + ": 물건을 모두 옮겼다");
	}
}

class Fence implements Runnable{
	private String name;
	public Fence(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name + ": 물건을 팔고 있다");
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		System.out.println(name + ": 물건을 모두 팔았다");
	}
}

public class RighteousOutLawTest {
	public static void main(String[] args) {
		System.out.println("마숙 넌 저 집을 털어라");
		Steal steal = new Steal("마숙");
		Fence fence = new Fence("차돌바위");
		Thread thMaSook = new Thread(steal);
		Thread thChaDol = new Thread(fence);
		
		thMaSook.start();
		try {
			thMaSook.join(); // 마숙이 모두 털기를 기다린다
			System.out.println("차돌바위 넌 물건을 모두 팔아라");
			thChaDol.start(); // 차돌바위 모두 팔아라
			thChaDol.join(); // 차돌바위가 모두 털기를 기다린다
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("홍길동이 마숙과 차돌바위와 유유히 떠났다~");
	}
}










