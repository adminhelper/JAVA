package edu.exam01.while19;
//1 ~ 100까지 합을 while문으로 출력
public class ForLoop {
	public static void main(String[] args) {
		int sum = 0;
		for(int num=1;num<=100;num++)
			sum += num;
		
		System.out.println("1~100 합은 " + sum);
	}

}
