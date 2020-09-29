package edu.exam01.continue21;

// 구구단
//2x1=2 2x2=4 ... 2x9=18
//3x1=3 3x2=6 ... 3x9=27
//...
//9x1=9 9x2=18... 9x9=81
public class Continue {
	public static void main(String[] args) {
		// i는 앞의 숫자, j는 뒤의 숫자, i*j 결과값
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%dx%d=%d\t",
						i, j, i*j);
			}
			System.out.printf("\n");
		}
	}
}






