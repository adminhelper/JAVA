package edu.exam09.ex03employee;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author bitcamp1 서비스 시작시 화면에 메뉴를 보여주고 사용자와 입출력을 담당한다. 처리와 사용자간의 중간 인터페이스 역할을
 *         담당한다
 */
public class EmployeeView {

	// controller에 구현된 처리 기능을 사용하기 위해
	// 객체를 생성하였다.
	EmployeeController controller = new EmployeeController();

	/**
	 * 직접 필드 sc를 접근하지 마라
	 */
	private static Scanner sc = new Scanner(System.in);

	/**
	 * sc를 간접 접근하기 위해 만든 메서드
	 * 
	 * @return 키보드 입력 객체
	 */
	static Scanner getScanner() {
		return sc;
	}

	/**
	 * 메뉴를 사용자한테 보여주는 기능
	 */
	void viewMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 정규직 저장");
		System.out.println("2. 임시직 저장");
		System.out.println("3. 일용직 저장");
		System.out.println("4. 직원 정보 출력");
		System.out.println("5. 급여 정보 출력");
		System.out.println("6. 서비스 종료");
	}

	/**
	 * 사용자의 번호선택을 입력받는 기능
	 * 
	 * @return 선택 번호
	 */
	int getUserSelect() {
		System.out.print("번호를 선택하세요 >> ");
		return sc.nextInt();
	}

	/**
	 * 사용자의 선택에 따른 동작을 배정하는 기능 (EmployeeController클래스의 객체와 사용자간의 인터페이스 역할을 담당)
	 * 
	 * @param choice 선택 번호
	 * @return 루프의 반복 여부
	 */
	boolean runChoice(int choice) {
		boolean isRun = true;

		switch (choice) {
		case 1:
			controller.saveRegularEmployee();
			break;
		case 2:
			System.out.println("임시직 저장...");
			break;
		case 3:
			System.out.println("일용직 저장...");
			break;
		case 4:
			System.out.println("직원 정보 출력...");
			break;
		case 5:
			controller.printAllPayInfo();
			break;
		case 6:
			System.out.println("안녕히 계세요 ^^");
			isRun = false;
			break;
		default: // else에 해당하는 구문
			System.out.println("잘 못 입력하셨습니다...");
			break;
		}

		return isRun;
	}

	/**
	 * 서비스의 시작시 화면을 반복해서 보여주는 기능
	 */
	void menuLoop() {
		boolean isRun = true;
		while (isRun) {
			clearScreen();
			viewMenu(); // 메뉴 출력
			int choice = getUserSelect();// 선택값
			isRun = runChoice(choice); // 선택에 따른 동작
		}
	}

	public final static void clearScreen()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}

//		for (int i = 0; i < 80; i++)
//			System.out.println("");
}
