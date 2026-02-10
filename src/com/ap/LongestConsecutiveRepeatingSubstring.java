package com.ap;

import java.util.Iterator;

public class LongestConsecutiveRepeatingSubstring {
//String
	public static void main(String[] args) {
		String s = "aaabbccccddaaaaabbbccc";
		longesteRepatingSubSequnce01(s);
	}

	public static void longesteRepatingSubSequnce01(String s) {
		int max = 0, ct = 0, index = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				ct++;
			} else if (ct > 0) {
				if (ct > max) {
					max = ct;
					index = i;
				}
				ct = 0;
			}
		}
		System.out.println("Character: " + s.charAt(index) + ",Occurance " + (max + 1));
	}

}
