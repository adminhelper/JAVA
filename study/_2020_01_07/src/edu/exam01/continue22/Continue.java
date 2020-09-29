package edu.exam01.continue22;

public class Continue {
	public static void main(String[] args) {
		// i는 앞의 숫자, j는 뒤의 숫자, i*j 결과값
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i < 5)
					continue;
				System.out.printf("%dx%d=%d\t",	i, j, i*j);
			}
			System.out.printf("\n");
		}
	}

}
