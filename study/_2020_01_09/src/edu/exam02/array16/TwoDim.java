package edu.exam02.array16;

//4 x 6 배열을 생성하고
//1부터 순차적으로 대입하고
//출력하세요
//[4][6]

public class TwoDim {
	public static void main(String[] args) {
		int[][] nums = new int[4][6];
		int cnt = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = ++cnt; 
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
