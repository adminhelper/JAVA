package edu.exam07.friendinfo01;
/*
시스템 개발시 손에 잡히는 것 먼저 개발한다
손에 잡힌다는 것은 (명사형 / 데이터 객체 or View)
1) 데이터 객체 : Value Object(VO), Data Transfer Object(DTO)
            Model, 데이터베이스의 Table
2) View : 사용자한테 어떤 UI보여줄 것인지?
	   사용자 입력정보, 출력정보
3) Controller : 동작, 제어
*/

public class FriendInfoMain {
	public static void main(String[] args) {
		FriendInfoView fView = new FriendInfoView();
		fView.menuLoop();
	}
}








