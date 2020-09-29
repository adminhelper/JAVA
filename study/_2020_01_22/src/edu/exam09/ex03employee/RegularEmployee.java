package edu.exam09.ex03employee;

/**
 * @author bitcamp1
 *  정규직 사원 클래스
 */
public class RegularEmployee extends Employee {
	
	private int bonus;
	
	public RegularEmployee(String empno, String name,
						int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (pay/(double)12) +
					(bonus/(double)12);
		return mPay;
	}
	
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("bonus: " + bonus);
	}

}
