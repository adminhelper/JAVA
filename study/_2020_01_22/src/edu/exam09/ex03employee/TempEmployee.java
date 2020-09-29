package edu.exam09.ex03employee;

/**
 * @author bitcamp1
 * 임시직 사원 클래스
 */
public class TempEmployee extends Employee {
	int hireYear;	// 고용한 기간 년도
	
	TempEmployee(String empno, String name,
				int pay, int hireYear){
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double mPay = pay/(double)12;
		return mPay;
	}
	
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("hireYear: " + hireYear);
	}

}
