package edu.exam08.tostring03;

public class Friend {
	protected String name;
	protected String phoneNum;
	protected String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}

	public String toString() {
		return "이름: " + name + "\n" +
			   "전화: " + phoneNum + "\n" +
			   "주소: " + addr + "\n";
	}
	public boolean equals(Object obj) {
		Friend fr = (Friend)obj;
		return this.name.equals(fr.name) &&
			   this.phoneNum.equals(fr.phoneNum) &&
			   this.addr.equals(fr.addr);
	}
	
	public static void main(String[] args) {
		Friend fr0 = new Friend("홍길동", "111", "지리산");
		Friend fr1 = new Friend("홍길동", "111", "지리산");
		Friend fr2 = new Friend("홍길동", "222", "지리산");
		
		System.out.println(fr0);
		System.out.println(fr1);
		System.out.println(fr2);
		System.out.println(fr0.equals(fr1));
		System.out.println(fr0.equals(fr2));
	}
}



