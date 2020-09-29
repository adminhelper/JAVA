package edu.exam13.ex11queue;

import java.util.LinkedList;
import java.util.Queue;

// Queue : 시간의 순서를 보장하는 임시 저장 공간
// FIFO(First Input First Out)

public class UseQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			int d = (int)(Math.random()*100);
			queue.add(d);
			System.out.print(d + ", ");
		}
		System.out.println();
		
		// remove와 동시에 데이터를 반환한다
		while(!queue.isEmpty())
			System.out.print(queue.remove() + ", ");
		
//		int len = queue.size();
//		for(int i=0;i<len;i++)
//			System.out.print(queue.poll() + ", ");			
	}
}







