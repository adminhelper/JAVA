package edu.exam03.linearsearch;

import java.util.Scanner;

// 배열을 20개 숫자를 초기화 한다
// 특정 숫자가 index 몇번에 있는 지 반환하는 메서드
// 없으면 -1을 반환한다.
// 메서드를 만들고 사용해보세요

public class LinearSearch {
	 public static int linearSearch(int[] arr, int num) {
		 int idx = -1;
		 for(int i=0;i<arr.length;i++) {
			 if(num == arr[i]) {
				 System.out.println("찾았다");
				 idx = i;
				 break;
			 }			 
		 }
		 return idx;
	 }
	 
	 public static void main(String[] args) {
		 int[] arr = {23, 22, 6, 62, 87, 12, 99, 88, 72, 1,
				 	  21, 5, 26, 73, 38, 46, 29, 56, 52, 2};
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.print("검색 숫자 입력 (-1이면 exit) : ");
			 int num = sc.nextInt();
			 if(num == -1)
				 break;
			 int idx = linearSearch(arr, num);
			 if(idx == -1)
				 System.out.println("찾을 수 없습니다");
			 else {
				 //System.out.printf("index %d에 있습니다\n", idx);
				 System.out.printf("%d번째 있습니다\n", idx+1);
			 }
		 }
		 System.out.println("종료합니다");
		 sc.close();
		 
	}
}





