package edu.exam11.ex11token;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		String strData = "11:22:33:44:55";
		StringTokenizer st = 
				new StringTokenizer(strData, ":");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}





