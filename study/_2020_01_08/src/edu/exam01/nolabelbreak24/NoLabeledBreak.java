package edu.exam01.nolabelbreak24;

public class NoLabeledBreak {
	public static void main(String[] args) {
		boolean isStop = false;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("[%d, %d]",
						i, j);
				if(i%2==0 && j%2==0) {
					isStop = true;
					break;
				}
			}
			System.out.println();
			if(isStop)
				break;
		}
		System.out.println("The End");
	}
}
