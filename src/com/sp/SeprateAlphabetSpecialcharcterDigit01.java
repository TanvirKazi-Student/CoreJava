package com.sp;

public class SeprateAlphabetSpecialcharcterDigit01 {

	public static void main(String[] args) {
		String s = "P2345neumo&()#$%@noult";

		String digits = " ";
		String alphabets = " ";
		String specialChar = " ";

		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digits = digits + ch;

			} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alphabets = alphabets + ch;

			} else {
				specialChar = specialChar + ch;

			}

		}
		System.out.println("Digits  are:" + digits);
		System.out.println("Special chr are: " + specialChar);
		System.out.println("Alphabets are: " + alphabets);

	}
}
