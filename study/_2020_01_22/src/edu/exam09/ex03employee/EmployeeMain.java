package edu.exam09.ex03employee;

/**
 * @author bitcamp1
 *이 클래스의 역할을 main를 사용하여
 *프로그램의 시작부분을 담당한다
 */
public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeView view = new EmployeeView();
		view.menuLoop();
	}
}
