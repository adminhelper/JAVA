package edu.exam02.array09;

import java.util.Random;

//int 배열로 10개의 공간을 생성하라
//1 ~ 10까지의 임의의 수를 저장하고
//홀수만 골라서 출력하라

public class SelectArray {
	public static void main(String[] args) {
		int[] nums = new int[10];
		Random rd = new Random();
		for(int i=0;i<nums.length;i++)
			nums[i] = rd.nextInt(10)+1;
		
		System.out.println("전체 출력");
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+",");
		
		System.out.println("\n홀수만 출력");
		for(int i=0;i<nums.length;i++)
			if(nums[i]%2==1)
				System.out.print(nums[i]+",");
	}
}
