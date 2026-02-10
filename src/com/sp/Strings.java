package com.sp;

import java.util.Arrays;
import java.util.Iterator;

public class Strings {
	public static void main(String[] args) {
		String s = "Today is ningth day for ganpathi visarjan" ;

		System.out.println(longestWord(s));
	}

	public static String longestWord(String s) {
		String word = "";
		String ans = "";
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
			}
			if (word.length() > max) {
				max = word.length();
				ans = word;
			}
		}
		return ans;
	}
}