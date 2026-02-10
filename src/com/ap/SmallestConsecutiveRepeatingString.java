package com.ap;

public class SmallestConsecutiveRepeatingString {

	public static void main(String[] args) {
		String s = "aaaabbccccddaaaaaabbbccc";
		smallestConsecutiveRepeatingString(s);
	}

	public static void smallestConsecutiveRepeatingString(String s) {
		int min = 2, ct = 0, index = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				ct++;
			} else if (ct > 0) {
				if (ct < min)
					min = ct;
				index = i;
			}
			ct = 1;

		}
		System.out.println("Character: " + s.charAt(index) + " " + "Occurence :" + (min + 1));
	}
}
