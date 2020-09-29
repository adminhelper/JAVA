package edu.exam.tree32;

/*public class ChopTree {
	public static void main(String[] args) {
		int cnt = 0;
		while(cnt < 10) {
			cnt++;
			System.out.println("나무를 " + cnt + "번 쿵");
		}
		System.out.println("나무가 넘어간다!");
	}
}*/


// 3의 배수로 출력하라
// 변화값을 조정하라
/*public class ChopTree {
	public static void main(String[] args) {
		int cnt = 0;
		while((cnt+3) < 10) {
			cnt+=3;
			System.out.println("나무를 " + cnt + "번 쿵");
		}
		System.out.println("나무가 넘어간다!");
	}
}*/

//3의 배수로 출력하라
//if문을 사용해서 출력
//10/3 = 3(몫)
//10%3 = 1(나머지)
/*public class ChopTree {
	public static void main(String[] args) {
		int cnt = 0;
		while(cnt < 10) {
			cnt++;
			if(cnt%3 == 0)
				System.out.println("나무를 " + cnt + "번 쿵");
		}
		System.out.println("나무가 넘어간다!");
	}
}*/

// "나무가 쿵" 100번 찍고 
// 단 5번에 한번씩 "나무가 쩍~"을 출력하세요
/*public class ChopTree {
	public static void main(String[] args) {
		int cnt = 0;
		while(cnt < 100) {
			cnt++;
			System.out.println("나무를 " + cnt + "번 쿵");
			if(cnt%5 == 0)
				System.out.println("나무가 쩍~");
		}
		System.out.println("나무가 넘어간다!");
	}
}*/

// "나무가 쿵" 100번 찍고 
// 3번에 한번씩 "나무가 쿵쿵"을 출력하고
// 5번에 한번씩 "나무가 쩍~"을 출력하세요
public class ChopTree {
	public static void main(String[] args) {
		int cnt = 0;
		while(cnt < 100) {
			cnt++;
			System.out.println("나무를 " + cnt + "번 쿵");
			if(cnt%3 == 0)
				System.out.println("나무가 쿵쿵");
			if(cnt%5 == 0)
				System.out.println("나무가 쩍~");
		}
		System.out.println("나무가 넘어간다!");
	}
}







