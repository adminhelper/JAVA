package edu.exam07.friendinfo01;

import java.util.Scanner;

public class FriendInfoController {
	private Friend[] myFriends;	// 친구 객체 저장 배열
	private int numOfFriends;	// 저장된 친구수
	private final static int FRIEND_NUM = 100;
	
	public FriendInfoController() {
		myFriends = new Friend[FRIEND_NUM];
		numOfFriends = 0;
	}
	public FriendInfoController(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	// 배열에 친구저장하고, 친구수 증가
	void addFriendInfo(Friend fren) {
		if(numOfFriends < myFriends.length)
			myFriends[numOfFriends++] = fren;
		else
			System.out.println("꽉 찼습니다!!!");
	}
	
	// 고등학교/대학교 친구 입력후 저장
	void addFriend(int choice) {
		String name, phone, addr, job, major;
		
		// 고등학교/대학교 모두 입력받아야 하는 부분
		Scanner sc = FriendInfoView.getScanner();
		System.out.print("이름 : "); name = sc.next();
		System.out.print("전화 : "); phone = sc.next();
		System.out.print("주소 : "); addr = sc.next();
		
		if(choice == MENU.HIGH_FRIEND) {
			System.out.print("직업 : "); job = sc.next();
			addFriendInfo(new HighFriend(name, phone, addr, job));
		}else if(choice == MENU.UNIV_FRIEND) {
			System.out.print("학과 : "); major = sc.next();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}
		System.out.println("--- 입력 완료 ---\n");
	}
	
	// 전체 정보 출력
	void showAllData() {
		for(int i=0;i<numOfFriends;i++) {
			myFriends[i].showData();
			System.out.println();
		}
	}
	
	// 기본 정보 출력
	void showAllSimpleData() {
		for(int i=0;i<numOfFriends;i++) {
			myFriends[i].showBasicData();
			System.out.println();
		}
	}
}




