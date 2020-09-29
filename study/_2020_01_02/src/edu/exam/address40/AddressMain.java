package edu.exam.address40;

import java.util.ArrayList;
import java.util.Scanner;

// 기능(함수(Function), 메서드)
//(메서드)구조적 프로그래밍 방식
//절차(메서드)지향 프로그래밍 방식

/*<주소록 프로젝트>
기능 정의
0) 메뉴 반복 루프
void mainLoop();
1) 메뉴 출력
void printMenu();
2) 메뉴 선택
int getSelectMenu();
3) 주소 정보 입력(이름, 전화번호, 주소)
void inputAddress();
4) 주소 정보 검색(이름으로 검색)
void searchAddss();
5) 주소 정보 변경(이름으로 검색 후 변경)
void updateAddress();
6) 주소 정보 삭제(이름으로 검색 후 삭제)
void deleteAddress();
7) 주소 정보 전체출력
void printAllAddress();
8) 프로그램 종료 
void programExit();
*/

class Address {
	public String name;
	public String phone;
	public String address;
}

public class AddressMain {
	
	static Scanner sc = new Scanner(System.in);
	
	// java에서는 컬렉션(컴퓨터 과학의 '자료구조'를 바탕으로 제작)
	// Address클래스로 만들어진 객체를 계속 저장할 수 있다.
	static ArrayList<Address> addrList = 
			new ArrayList<Address>();
	
	public static void main(String[] args) {
		mainLoop();
	}
	
	// 계속 반복해서 동작하도록 하는 역할
	static void mainLoop() {
		while(true) {
			printMenu();
			int sel = getSelectMenu();
			
			switch(sel)
			{
			case 0:
				System.out.println("주소 입력 동작~");
				inputAddress();
				break;
			case 1:
				System.out.println("주소 검색 동작~");
				searchAddress();
				break;
			case 2:
				System.out.println("주소 수정 동작~");
				updateAddress();
				break;
			case 3:
				System.out.println("주소 삭제 동작~");
				deleteAddress();
				break;
			case 4:
				System.out.println("주소 모두 출력 동작~");
				printAllAddress();
				break;
			case 5:
				System.out.println("프로그램 종료 동작~");
				programExit();
				break;
			default:
				System.out.println("잘못 입력 !!!");
				break;
			}
		}
	}
	
	// 사용자한테 메뉴를 보여주는 역할
	static void printMenu() {
		System.out.println("===================");
		System.out.println("0. 주소 입력");
		System.out.println("1. 주소 검색");
		System.out.println("2. 주소 수정");
		System.out.println("3. 주소 삭제");
		System.out.println("4. 주소 모두 출력");
		System.out.println("5. 프로그램 종료");
		System.out.println("===================");
	}
	
	// 메뉴 번호를 선택하고 반환하는 역할
	static int getSelectMenu() {
		int sel = -1;
		System.out.print("번호 입력 >> ");
		sel = sc.nextInt();
		return sel;
	}
	
	// 주소 입력
	static void inputAddress() {
		// 사용자로부터 주소 정보 입력
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("전화 입력 : ");
		String phone = sc.next();
		System.out.print("주소 입력 : ");
		String address = sc.next();
		
		// Address의 객체생성후 입력데이터를 객체에 모두 저장
		// 객체에는 주소 정보들이 모아져 있다.
		Address addr = new Address();
		addr.name = name;
		addr.phone = phone;
		addr.address = address;
		
		// 컬렉션에 추가한다
		addrList.add(addr);
	}
	
	// 주소 검색
	static void searchAddress() {
		System.out.print("검색 이름 입력 : ");
		String name = sc.next();
		for(int i=0;i<addrList.size();i++) {
			Address addr = addrList.get(i);
			if(name.equals(addr.name)) {
				System.out.println("--------------");
				System.out.println("이름: " + addr.name);
				System.out.println("전화: " + addr.phone);
				System.out.println("주소: " + addr.address);
				System.out.println("--------------");
				break;
			}
		}
	}
	
	// 주소 수정
	static void updateAddress() {
		System.out.print("수정 이름 입력 : ");
		String name = sc.next();
		for(int i=0;i<addrList.size();i++) {
			Address addr = addrList.get(i);
			if(name.equals(addr.name)) {
				System.out.println("--------------");
				System.out.println("이름: " + addr.name);
				System.out.println("전화: " + addr.phone);
				System.out.println("주소: " + addr.address);
				System.out.println("--------------");
				// 사용자로부터 주소 정보 입력
				System.out.print("수정 이름 입력 : ");
				String uname = sc.next();
				System.out.print("수정 전화 입력 : ");
				String uphone = sc.next();
				System.out.print("수정 주소 입력 : ");
				String uaddress = sc.next();
				
				// 기존 정보 업데이트 하기
				addr.name = uname;
				addr.phone = uphone;
				addr.address = uaddress;
				break;
			}
		}		
	}
	
	// 주소 삭제
	static void deleteAddress() {
		System.out.print("삭제 이름 입력 : ");
		String name = sc.next();
		for(int i=0;i<addrList.size();i++) {
			Address addr = addrList.get(i);
			if(name.equals(addr.name)) {
				addrList.remove(i);
				break;
			}
		}		
	}
	
	// 주소 모두 출력
	static void printAllAddress() {
		for(int i=0;i<addrList.size();i++) {
			System.out.println("-----" + i + "-----");
			Address addr = addrList.get(i);
			System.out.println("이름 : " + addr.name);
			System.out.println("전화 : " + addr.phone);
			System.out.println("주소 : " + addr.address);
			System.out.println("------------");
		}
	}
	
	// 프로그램 종료 
	static void programExit() {
		System.exit(0);
	}
}











