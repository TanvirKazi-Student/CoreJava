package com.sp;

public class DeCompraseString {

	public static void main(String[] args) {
		String s = "a2b2c3";
		System.out.println(decompressString(s));
	}

	public static String decompressString(String s) {
		String ans = "";
		char temp = '\u0000';
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				temp = ch;
			} else if (ch >= '0' && ch <= '9') {
				num = num * 10 + (ch - '0');// this is used when 2 digit number come
				// 0 * 0 + ( 2-'0') = 2
			}
			if ((i + 1 < s.length() && s.charAt(i + 1) >= 'a' && s.charAt(i + 1) <= 'z')
					|| i + 1 < s.length() && (s.charAt(i + 1) >= 'A' && s.charAt(i + 1) <= 'Z')) {
				ans = ans + repeate(num, temp);// You are not handling the last group because you only append when next
												// char is a letter.
				num = 0;
			}
			ans = ans + repeate(num, temp);// We just need to add one extra append after the loop (to handle last
											// character count).
		}
		return ans;
	}

	public static String repeate(int num, char ch) {
		String s = "";
		for (int j = 0; j < num; j++) {
			s = s + ch;
		}
		return s;
	}
}
