package edu.exam09.ex03employee;

import java.util.Scanner;

/**
 * @author bitcamp1
 * 화면에서 사용자의 선택에 대한 처리 기능들의 역할
 * 처리를 담당하는 클래스
 * (비즈니스 로직을 담당)
 * DB - Model - Controller - View - User
 * 
 * Controller
 * Service
 * Manager
 * Handler
 */
public class EmployeeController {
	
	private final int EMP_NUM = 100;
	private Employee[] employeeArr = new Employee[EMP_NUM];
	private int numOfEmployee = 0;	// 저장된 사원수
	
	/** Employee배열에 객체를 저장하는 기능
	 * @param emp Employee로부터 상속받은 클래스의 객체
	 * @return 저장되었는지 여부
	 */
	boolean saveEmployee(Employee emp) {
		if(numOfEmployee < employeeArr.length) {
			employeeArr[numOfEmployee++] = emp;
			return true;
		}else {
			return false;
		}
	}

	/** 정규직 저장 처리 기능
	 */
	void saveRegularEmployee() {
		String empno, name;
		int pay, bonus;
		
		// View에서 생성한 Scanner객체를 얻는다
		Scanner sc = EmployeeView.getScanner();
		System.out.print("사번: "); empno = sc.next();
		System.out.print("이름: "); name = sc.next();
		System.out.print("연봉: "); pay = sc.nextInt();
		System.out.print("보너스: "); bonus = sc.nextInt();
		
		// 정규직 클래스 객체를 생성한다
		RegularEmployee re = 
				new RegularEmployee(empno, name, pay, bonus);
		boolean isSave = saveEmployee(re);
		if(isSave)
			System.out.println("잘 저장되었습니다~");
		else
			System.out.println("더 이상 저장되지 않습니다!");
	}	
	/** 임시직 저장 처리 기능
	 */
	void saveTempEmployee() {
	}	
	/** 일용직 저장 처리 기능
	 */
	void savePartTimeEmployee() {
	}
	
	/**
	 * 전체 사원 정보 출력
	 */
	void printAllEmployeeInfo() {
		
	}
	
	/**
	 * 전체 급여 정보 출력
	 */
	void printAllPayInfo() {
		System.out.println("####################");
		for(int i=0;i<numOfEmployee;i++) {
			employeeArr[i].showMonthPayInfo();
		}
	}
	
}




