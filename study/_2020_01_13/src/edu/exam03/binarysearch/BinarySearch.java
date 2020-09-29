package edu.exam03.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] arr, int num) {
		int compIdx = -1;   // 2등분 위치, 찾는 위치
		int first = 0, last = arr.length-1;
		int cnt = 0;	// 몇번만에 검색했니?
		while(true) {
			cnt++;	// 1회씩 검색 증가
			compIdx = first + (last - first)/2;
			
			if(last == first) {
				if(arr[first] == num){
					System.out.printf("%d회 찾았다!", cnt);
					break;
				}else {
					System.out.printf("%d회 못 찾았다!", cnt);
					compIdx = -1;
					break;
				}
			}
			
			if(arr[compIdx] == num) {
				System.out.printf("%d회 찾았다!", cnt);
				break;
			}else if(arr[compIdx] < num) {
				first = compIdx+1;
			}else {
				last = compIdx-1;
			}
		}
		
		return compIdx;
	}

	 public static void main(String[] args) {
		 int[] arr = {23, 22, 6, 62, 87, 12, 99, 88, 72, 1,
				 	  21, 5, 26, 73, 38, 46, 29, 56, 52, 2};
		 Scanner sc = new Scanner(System.in);
		 Arrays.sort(arr);		// 이진 검색에서는 정렬을 해야만 한다
		 System.out.println(Arrays.toString(arr));
		 while(true) {
			 System.out.print("검색 숫자 입력 (-1이면 exit) : ");
			 int num = sc.nextInt();
			 if(num == -1)
				 break;
			 int idx = binarySearch(arr, num);
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
