package edu.exam.address41;

import java.util.ArrayList;
import java.util.Scanner;

//MVC 패턴 설계
//모든 비즈니스 sw는 이 3가지로 구성된다.
//Model : 데이터 관리
//View  : 화면(사용자와의 인터페이스)
//Controller : Model - View사이를 연결
//                     업무 처리
//<주소록 프로젝트>
//클래스 정의
//1) 주소 클래스(Model)
//2) 메뉴 클래스(View)
//3) 주소록 처리(관리) 클래스(Controller)
//4) 시작 클래스

// 절차지향 프로그래밍 : 70/80년대 수직적 조직
// 객체지향 프로그래밍 : 90년대 많이 생긴 팀 조직

// 구현 
// 화면/저장 데이터 부터 구현 후 처리로 들어가는 경우가
// 보다 쉽다

class Address{
	String name;
	String phone;
	String address;
}

class Menu{
	
	static Scanner sc = new Scanner(System.in);
	
	AddressManager addrMgr = new AddressManager();
	
	void mainLoop() {
		while(true) {
			printMenu();
			int sel = getSelectMenu();
			switch(sel) {
			case 0:
				System.out.println("주소 입력 처리~");
				addrMgr.inputAddress();
				break;
			case 1:
				System.out.println("주소 검색 처리~");
				addrMgr.searchAddress();
				break;
			case 2:
				System.out.println("주소 수정 처리~");
				addrMgr.updateAddress();
				break;
			case 3:
				System.out.println("주소 삭제 처리~");
				addrMgr.deleteAddress();
				break;
			case 4:
				System.out.println("주소 모두 출력 처리~");
				addrMgr.printAllAddress();
				break;
			case 5:
				System.out.println("프로그램 종료~");
				programExit();
				break;
			default:
				System.out.println("잘못 입력~");
				break;
			}
		}
	}
	void printMenu() {
		System.out.println("====================");
		System.out.println("0. 주소 입력");
		System.out.println("1. 주소 검색");
		System.out.println("2. 주소 수정");
		System.out.println("3. 주소 삭제");
		System.out.println("4. 주소 전체 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("====================");
	}
	int getSelectMenu() {
		int sel = -1;
		System.out.print("번호 선택하세요 >> ");
		sel = sc.nextInt();
		return sel;
	}
	void programExit() {
		System.exit(0);
	}
}

class AddressManager{
	
	ArrayList<Address> addrList = 
			new ArrayList<Address>();
	
	void inputAddress() {
		System.out.print("이름 입력 : ");
		String name = Menu.sc.next();
		System.out.print("전화 입력 : ");
		String phone = Menu.sc.next();
		System.out.print("주소 입력 : ");
		String address = Menu.sc.next();
		
		Address addr = new Address();
		addr.name = name;
		addr.phone = phone;
		addr.address = address;
		
		addrList.add(addr);
	}
	void searchAddress() {
		
	}
	void updateAddress() {
		
	}
	void deleteAddress() {
		
	}
	void printAllAddress() {
		for(int i=0;i<addrList.size();i++) {
			Address addr = addrList.get(i);
			System.out.println("---------" + i + "-----------");
			System.out.println("이름 : " + addr.name);
			System.out.println("전화 : " + addr.phone);
			System.out.println("주소 : " + addr.address);
			System.out.println("----------------------");
		}
	}
}

public class AddressMain {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.mainLoop();
	}
}
