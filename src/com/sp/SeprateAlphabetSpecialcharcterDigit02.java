package com.sp;

public class SeprateAlphabetSpecialcharcterDigit02 {

	public static void main(String[] args) {
		String s = "P2345neumo&()#$%@noult";

		String digits = " ";
		String alphabets = " ";
		String specialChar = " ";

		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);

			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				alphabets = alphabets + (char) ch;

			} else if (ch >= 48 && ch <= 57) {
				digits = digits + (char) ch;

			} else {
				specialChar = specialChar + (char) ch;

			}

		}
		System.out.println("Digits  are:" + digits);
		System.out.println("Special chr are: " + specialChar);
		System.out.println("Alphabets are: " + alphabets);

	}
}
