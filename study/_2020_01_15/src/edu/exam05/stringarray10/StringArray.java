package edu.exam05.stringarray10;

public class StringArray {
	public static void main(String[] args) {
//		String[] strArr = 
//				new String[] {"홍길동", "임꺽정", "Robin"};
		String[] strArr = {"홍길동", "임꺽정", "Robin"};
		for(String str : strArr)
			System.out.println(str);
		
		String[] strArr1 = new String[3];
		strArr1[0] = "Java";  //new String("Java");
		strArr1[1] = "C#";  //new String("C#");
		strArr1[2] = "Javascript";  //new String("Javascript");
		for(int i=0;i<strArr1.length;i++)
			System.out.println(strArr1[i]);
		
		
	}
}







