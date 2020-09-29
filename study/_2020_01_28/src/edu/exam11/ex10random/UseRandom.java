package edu.exam11.ex10random;

import java.util.Random;

public class UseRandom {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0;i<10;i++)
			System.out.print(rand.nextInt(100) + ", ");// 0 ~ 99
		System.out.println();
		//Math.random();// 0.0이상 ~ 1.0미만 실수
		for(int i=0;i<10;i++)
			System.out.print((int)(Math.random()*100) + ", ");// 0 ~ 99
		System.out.println();
	}
}
