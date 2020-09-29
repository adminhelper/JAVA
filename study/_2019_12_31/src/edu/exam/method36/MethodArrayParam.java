package edu.exam.method36;

public class MethodArrayParam {
	public static void viewName(String[] names) {
		for(int i=0;i < names.length;i++)
			System.out.println("이름: " + names[i]);		
	}
	
	public static void main(String[] args) {
		String[] names = {"홍길동", "임꺽정",
						"장길산", "일지매"};
		viewName(names);
	}
}
