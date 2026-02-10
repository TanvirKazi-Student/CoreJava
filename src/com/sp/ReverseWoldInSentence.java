package com.sp;

public class ReverseWoldInSentence {

	public static void main(String[] args) {

		String s = "Hii Tanvir hii";
		System.out.println(reverseworld(s));
	}

	public static String reverseworld(String s) {
		String ans = "";
		String word = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			} else {
				ans = ans + reverseString(word) + " ";
				word = "";// begning for new world //here presented the last world
			}
		}

		if (!word.isEmpty()) {
			ans = ans + reverseString(word);
		}
		return ans;
	}

	public static String reverseString(String word) {
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		return rev;
	}

}