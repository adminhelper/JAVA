package edu.exam11.ex12split;

public class UseSplit {
	public static void main(String[] args) {
		String strData = "11:22:33:44:55";
		String[] strArr = strData.split(":");
		for(String str : strArr)
			System.out.println(str);
	}
}
