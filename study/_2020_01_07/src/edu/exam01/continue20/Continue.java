package edu.exam01.continue20;

/*반복문내에서 사용되면서
제어를 쉽게 해주는 명령
continue, break*/

public class Continue {
	public static void main(String[] args) {
		// 1부터 10까지 2의 배수를 출력
		for(int i=2;i<=10;i+=2)
			System.out.print(i + ",");
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				System.out.print(i + ",");
		}
		System.out.println();
		
		// continue; 돌아가서 계속 진행해
		for(int i=1;i<=10;i++) {
			if(i%2!=0)
				continue;
			System.out.print(i + ",");
		}
		System.out.println();
	}
}





