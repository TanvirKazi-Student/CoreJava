package com.sp;

public class CountAlphabetSpacialCharDigits {

	public static void main(String[] args) {
		String s = "P2345neumo&()#$%@noult";

		String digits = " ";
		String alphabets = " ";
		String specialChar = " ";

		int alphabetCount = 0;
		int digitCount = 0;
		int specialCount = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digits = digits + ch;
				digitCount++;
			} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alphabets = alphabets + ch;
				alphabetCount++;
			} else {
				specialChar = specialChar + ch;
				specialCount++;
			}

		}

		System.out.println("Special Count are:" + specialCount);
		System.out.println("Alphabet Count  are: " + alphabetCount);
		System.out.println("Digit Count are: " + digitCount);
	}
}
