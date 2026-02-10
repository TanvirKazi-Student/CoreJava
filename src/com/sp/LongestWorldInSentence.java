package com.sp;

import java.util.Arrays;

public class LongestWorldInSentence {

	public static void main(String[] args) {
		String s = "Today is seventh day for ganpathi visarjana";
		System.out.println(longestWord(s));
		System.out.println(longestword2(s));

	}

	public static String longestWord(String s) {
		String[] words = s.split(" ");
		////		System.out.println(Arrays.toString(words));
		int max = 0;
		String word = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > max) {
				max = words[i].length();
				word = words[i];
			}
		}
		return word;
	}

	public static String longestword2(String s) {
		String ans = "";
		String word = "";
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				word = word + s.charAt(i);
			} else {
				if (word.length() > max) {
					max = word.length();
					ans = word;
				}
				word = "";
			}
			if (word.length() > max) {
				max = word.length();
				ans = word;
			}
		}
		return ans;

	}
}