package com.sp;

public class SeprateVowelConsotant {

	public static void main(String[] args) {
		String s = "Pneumonoult";

		char ch[] = s.toCharArray();

		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			while (i < j && !isVowel(ch[i])) {
				i++;
			}

			while (i < j && isVowel(ch[j])) {
				j--;
			}
			if (i < j) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(ch);

	}

	public static boolean isVowel(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
		}
		return false;

	}
}
