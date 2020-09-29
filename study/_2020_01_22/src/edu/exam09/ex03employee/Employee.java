package edu.exam09.ex03employee;

/** 추상클래스의 특징
 * 1) 추상메서드를 1개 이상 포함하고 있다
 * 2) 추상메서드는 구현이 되지않은 메서드이다
 * 3) 추상클래스는 객체를 만들 수 없다
 * 4) 추상클래스를 상속받은 자식 클래스가
 *    추상메서드를 구현하지 않으면
 *    자식 클래스도 추상클래스가 된다
 * 
 *  추상클래스의 목적
 * 1) 일부 필드와 메서드는 미리 구현하여서 상속하지만
 *    추상메서드는 미리 정의할 수 없어서 자식클래스로
 *    하여금 구현을 강요하도록 한다
 * 2) 추상클래스를 상속받은 모든 클래스는
 *    부모인 추상클래스 변수를 통해 
 *    메서드의 매개변수로 전달하여 메서드의 양을
 *    줄이는 효과가 있다.
 * 3) 추상클래스를 상속받은 모든 클래스는
 *    부모인 추상클래스 변수의 배열에 
 *    자식 클래스의 객체들을 담아서 각각 다른 클래스
 *    객체를 통일성있게 관리할 수 있다.
 * @author bitcamp1
 *
 * 사원 클래스
 * 상속을 전제로 한 추상 클래스
 * 급여는 사원들의 종류에 따라 다르게 계산되므로
 * 미리 구현하지 않고 사원에 따라 다르게 구현되도록
 * 추상클래스와 추상메서드를 사용하였다.
 * 
 * 명사형 클래스
 * VO(Value Object), DTO(Data Transfer Object)
 * MVC에서는 Model로 지칭될 수 있다
 * DBMS에서는 테이블/뷰와 상응관계가 된다.
 */
public abstract class Employee {
	protected String empno;	// 사번
	protected String name;	// 이름
	protected int pay;		// 연봉/일당
	
	/** 객체가 생성될 때 생성자를 통해 초기화하도록 하는 기능
	 * @param empno	사번
	 * @param name	사원이름
	 * @param pay	사원연봉/일당
	 */
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	/** 추상메서드로서 자식클래스들이 각각 구현해야 하는 메서드
	 * @return 급여
	 */
	public abstract double getMonthPay();
	
	/**
	 * 사원정보를 출력하는 기능
	 */
	public void showEmployeeInfo() {
		System.out.println("empno: " + empno);
		System.out.println("name: " + name);
		System.out.println("pay: " + pay);
		System.out.println();
	}
	
	/**
	 * 사원정보 + 월급정보 출력하는 기능
	 */
	public void showMonthPayInfo() {
		showEmployeeInfo();
		System.out.println("monthPay: " + getMonthPay());
		System.out.println("-----------------------");
	}
}








