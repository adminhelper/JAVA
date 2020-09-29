package edu.exam03.recallalphabet;

public class RecallAlphabet {
	// 재귀 메서드는 반복되는 호출속에서 탈출조건이 매우 중요하다
	// 탈출 조건이 정확하지 않으면 무한 루프가 돌면서
	// 스택 오버 플로우 현상이 나타난다
	public static void recallAlphabet(char[] arr, int len) {
		for(int i=0;i<len;i++)
			System.out.print(arr[i]);
		System.out.println();
		
		if(len == 1)
			return;
		else
			recallAlphabet(arr, --len);
	}
	
	public static void main(String[] args) {
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
//		String strAlpha = "abcdefgh";
//		char[] alpha = strAlpha.toCharArray();
		
		recallAlphabet(alpha, alpha.length);
	}
}



