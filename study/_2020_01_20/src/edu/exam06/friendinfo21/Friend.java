package edu.exam06.friendinfo21;

// 저장 관리 데이터
// VO, DTO
// Model

public class Friend {
	protected String name;
	protected String phoneNum;
	protected String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	// 전체 정보 출력
	public void showData() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phoneNum);
		System.out.println("주소: " + addr);
	}
	// 기본 정보 출력
	public void showBasicData() {
	}
}



