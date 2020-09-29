package edu.exam02.array17;

public class TwoDim {
	public static void main(String[] args) {
		int[][] nums = new int[4][6];
		//int cnt = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = i*6 + j + 1;
				//nums[i][j] = i*nums[i].length + j + 1; 
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
