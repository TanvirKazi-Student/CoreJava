package com.sp;

public class PrintAllCharecterInReverseOrder {

	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}
}
