package edu.exam06.friendinfo21;

import java.util.Scanner;

// 화면에 보여주는 역할
// 사용자와 입출력 담당 역할

class MENU{
	final static int HIGH_FRIEND = 1;
	final static int UNIV_FRIEND = 2;
	final static int SHOW_ALL = 3;
	final static int SHOW_SIMPLE = 4;
	final static int EXIT_PROGRAM = 5;
}

public class FriendInfoView {
	
	private static Scanner sc = new Scanner(System.in);
	
	FriendInfoController controller;
	
	public FriendInfoView() {
		//controller = new FriendInfoController();
		
		int num = getFriendNum();
		controller = new FriendInfoController(num);
	}
	
	public static Scanner getScanner() {
		return sc;
	}
	
	int getFriendNum() {
		System.out.println("몇 명 친구 저장 ? ");
		int num = sc.nextInt();
		return num;
	}
	
	void viewMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 고교 친구 저장");
		System.out.println("2. 대학 친구 저장");
		System.out.println("3. 전체 정보 출력");
		System.out.println("4. 기본 정보 출력");
		System.out.println("5. 프로그램 종료");
	}
	
	int getUserSelect() {
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	
	boolean runChoice(int choice) {
		switch(choice) {
		case MENU.HIGH_FRIEND:
		case MENU.UNIV_FRIEND:
			controller.addFriend(choice);
			break;
		case MENU.SHOW_ALL:
			controller.showAllData();
			break;
		case MENU.SHOW_SIMPLE:
			controller.showAllSimpleData();
			break;
		case MENU.EXIT_PROGRAM:
			System.out.println("프로그램 종료~");
			return false;
		default:
			System.out.println("잘 못 입력~");
			break;
		}
		
		return true;
	}
	
	void menuLoop() {
		boolean isRun = true;
		while(isRun) {
			viewMenu();
			int choice = getUserSelect();
			isRun = runChoice(choice);
		}
	}
}












