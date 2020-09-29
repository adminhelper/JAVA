package edu.exam09.ex03employee;

/**
 * @author bitcamp1
 * 일용직 사원 클래스
 */
public class PartTimeEmployee extends Employee {
	private int workDay;	// 일한 일수
	
	public PartTimeEmployee(String empno, String name,
							int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		double mPay = pay * workDay;
		return mPay;
	}

	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("workDay: " + workDay);
	}
}
