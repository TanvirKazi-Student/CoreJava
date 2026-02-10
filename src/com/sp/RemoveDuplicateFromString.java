package com.sp;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
		}
	}
}
