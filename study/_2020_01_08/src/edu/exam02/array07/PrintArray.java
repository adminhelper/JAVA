package edu.exam02.array07;

//int배열을 10개 생성해라.
//int배열에 3의 배수를 차례대로 저장해라.
//그리고 거꾸로 출력해라.

public class PrintArray {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i=0;i<nums.length;i++)
			nums[i] = 3*(i+1);
		for(int i=nums.length-1;i>=0;i--)
			System.out.print(nums[i] + ",");
	}
}
