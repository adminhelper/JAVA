package edu.exam01.labelbreak23;

//break는 여러 개의 중첩된 반복문속에서 사용되면
//자신을 감싸는 반복문 1개만 빠져나간다
//그러므로 전체 반복문은 종료되지 않는다.
//
//labeld break는 한번에 전체 반복문을 탈출하는 
//효과가 있다.

public class LabeledBreak {
	public static void main(String[] args) {
		outerLoop:
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("[%d , %d]",
						i, j);
				if(i%2==0 && j%2==0) // [2, 2]
					break outerLoop;
			}
			System.out.println();
		}
	}
}
