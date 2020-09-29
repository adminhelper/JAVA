package edu.exam02.array08;

import java.util.Scanner;

//int배열을 10개 생성해라
//사용자로부터 10개의 값을 입력받고
//순서대로 출력하고 
//총합을 구하세요

public class InputArray {
	public static void main(String[] args) {
		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<nums.length;i++) {
			System.out.print("정수를 입력: ");
			nums[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + ",");
			sum += nums[i];
		}
		System.out.println("\n총합 : " + sum);
	}
}





