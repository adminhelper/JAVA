package edu.exam00.random10;

import java.util.Random;

/*난수(難數)
카드게임/고스톱시
게임할 때마다 패의 순서가 바뀐다
바뀌는 순서는 정해지지 않고
임의의 순서를 가진다
이렇게 일정한 범위내에 무작위로
순서가 정해지는 것을 난수라 한다*/

public class RandomNum {
	public static void main(String[] args) {
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			int num = rd.nextInt(10);// 0 ~ 9
			System.out.println(num);
		}
	}
}
