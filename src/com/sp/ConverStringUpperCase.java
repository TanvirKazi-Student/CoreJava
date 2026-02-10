package com.sp;

public class ConverStringUpperCase {
	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		String uppercase = " ";

		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			
			if (ch >= 97 && ch <= 122) {
				uppercase = uppercase + (char) (ch - 32);// 97-65=32 convert lower to upper take diffrence uppercase and
															// lowercase
			} else {
				uppercase = uppercase + ch;
			}
		}
		System.out.print(uppercase);
	}
}
