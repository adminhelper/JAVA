package edu.exam.while22;

/*반복문의 성립
시작 / 증가 /종료
1) 일정한 규칙에 의해 변화하게 될 변수가 필요하다
   int num = 0;	// 시작값
2) 종료 조건 
    num < 10    // 종료값
3) 증감값
    num++;		// 1씩 증가
*/   


public class WhileLoop {
	public static void main(String[] args) {
		int num = 0;
		while(num < 10){
			//num++;
			num = num + 2;	// 2씩 증가
			System.out.println(num);
		}
	}
}





