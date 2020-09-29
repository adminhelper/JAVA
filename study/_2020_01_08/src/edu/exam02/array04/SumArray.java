package edu.exam02.array04;

//int배열 10개 생성하고
//1 ~ 10까지 담아라
//그리고 배열에서 1개씩 꺼내서 총합을 구해라

public class SumArray {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=1;i<=10;i++)
			nums[i-1] = i;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + ",");
			sum += nums[i];
		}
		System.out.println("\n총합은 " + sum);
	}
}






