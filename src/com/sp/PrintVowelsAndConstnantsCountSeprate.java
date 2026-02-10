package com.sp;

public class PrintVowelsAndConstnantsCountSeprate {

	public static void main(String[] args) {
		String s = "Tanvir";

		String vowels = " ";
		int vowelc = 0;
		String consonants = " ";
		int consonantc = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels = vowels + " " + ch;
					vowelc++;
				} else {
					consonants = consonants + " " + ch;
					consonantc++;
				}
			}
		}
		System.out.println("vowels count: " + vowelc);
		System.out.println("consonants count: " + consonantc);
	}

}
