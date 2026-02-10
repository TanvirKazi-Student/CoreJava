package com.sp;

public class ConverStringLowerCase {

	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		String lowercase = " ";
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			
			if (ch >= 65 && ch <= 90) {
				lowercase = lowercase + (char) (ch + 32);//65 - 97 = -32
			} else {
				lowercase = lowercase + ch;
			}
		}
		System.out.println(lowercase);
	}
}
