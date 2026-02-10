package com.sp;

import java.util.Arrays;
import java.util.Iterator;

//Comparess the given String
public class CompraseString {

	public static void main(String[] args) {
		String s = "aabbccc";
		System.out.println(compresString(s));

	}

	public static String compresString(String s) {
		String ans = "";
		int ct = 1;
		for (int i = 0, j = i + 1; i < s.length();) {
			if (j < s.length() && s.charAt(i) == s.charAt(j)) {
				ct++;
				j++;
			} else {
				ans = ans + s.charAt(i);
				ans = ans + ct;
				i = j;
				j = i + 1;
				ct = 1;
			}
		}
		return ans;

	}
}
