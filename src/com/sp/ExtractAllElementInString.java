package com.sp;

public class ExtractAllElementInString {

	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosi";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
