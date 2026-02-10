package com.sp;

public class CheackGivenStringPalindromOrNot {

	public static void main(String[] args) {

		String s = "Nitin";

		String lowercase = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				lowercase = lowercase + (char) (ch + 32); // 65 - 97 = -32
			} else {
				lowercase = lowercase + ch;
			}
		}
		boolean isPalindrome = true;
		for (int i = 0, j = lowercase.length() - 1; i < lowercase.length() - 1; i++, j--) {
			if (lowercase.charAt(i) != lowercase.charAt(j)) {// working of two pointer approch
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Palindromic String");
		} else {
			System.out.println("Not Palindromic String");
		}
	}
}
