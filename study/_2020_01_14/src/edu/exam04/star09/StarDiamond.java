package edu.exam04.star09;

import java.util.Scanner;

//홀수를 입력하면 아래처럼 출력하세요
//7을 입력하면 아래와 같은 모양이 됩니다
//
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
public class StarDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("다이아몬드 숫자 입력");
			int num = sc.nextInt();
			if(num==-1) {
				System.out.println("종료합니다~");
				break;
			}
			int middlePt = num / 2; // 중앙위치

			// 세로 행만큼 아래로 개행
			for (int i = 0; i < num; i++) {
				// 가로 열의 이동
				for (int j = 0; j < num; j++) {
					if (i <= middlePt) { // 세로행이 중앙이하
						if (j >= middlePt - i && j <= middlePt + i)
							System.out.print("*");
						else
							System.out.print(" ");
					} else { // 세로행이 중앙보다 초과
						if (j >= middlePt - (num - i - 1) && j <= middlePt + (num - i - 1))
							System.out.print("*");
						else
							System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
