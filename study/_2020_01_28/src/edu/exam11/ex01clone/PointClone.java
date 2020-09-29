package edu.exam11.ex01clone;

class Point{
	private int x;
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.printf("[%d, %d]\n", x, y);
	}
}

// 객체자체가 복제되지 않고
// 가리키는 참조값만 복사되므로
// 같은 객체를 2개의 변수가 가리키게 된다.
public class PointClone {
	public static void main(String[] args) {
		Point org = new Point(10, 20);
		Point cpy = org;	// 얕은 복사
		System.out.println(org);
		System.out.println(cpy);
		org.showPoint();
		cpy.showPoint();
		cpy.setPoint(100, 200);
		org.showPoint();
	}
}





