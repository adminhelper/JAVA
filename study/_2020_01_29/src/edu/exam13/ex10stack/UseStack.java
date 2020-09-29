package edu.exam13.ex10stack;

import java.util.Stack;

//스택은 최신 저장 데이터부터 추출
//(LIFO: Last Input First Out)

public class UseStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<5;i++) {
			int d = (int)(Math.random()*100);
			s.push(d);
			System.out.print(d + ", ");
		}
		System.out.println();
		
		int len = s.size();
		for(int i=0;i<len;i++)
			System.out.print(s.pop() + ", ");
	}
}









