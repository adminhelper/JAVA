package edu.exam07.friendinfo01;

public class UnivFriend extends Friend {
	private String major;	// 전공학과
	
	public UnivFriend(String name, String phone,
					String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	public void showData() {
		super.showData();
		System.out.println("전공 : " + major);
	}
	public void showBasicData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("전공 : " + major);
	}
}


