package com.sp;

public class PrintVowelsAndConstnantsSeprate {

	public static void main(String[] args) {
		String s = "Pneumonoult";

		String vowels = " ";
		String consonants = " ";
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels = vowels + " " + ch;
				} else {
					consonants = consonants + " " + ch;
				}
			} else {
				System.out.println("Spatial char");
			}

		}
		System.out.println("Vowels are: " + vowels);
		System.out.println("Consonants are: " + consonants);
	}

}
