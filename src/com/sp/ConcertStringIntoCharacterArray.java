package com.sp;

import java.util.Arrays;

public class ConcertStringIntoCharacterArray {
// use toCharArray
	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";

//		char ch[] = s.toCharArray();
//		System.out.print(Arrays.toString(ch));

//		for (char c : ch) {
//			System.out.println(c);
//		}
//		System.out.println(ch.length);//find the length of the string

		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length() - 1; i++) {
			ch[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(ch));
	}
}
