package com.sp;

public class SubString {

	public static void main(String[] args) {
		String s = "HiiIamTanvir";
//		System.out.println(s.substring(0, 3));//inbuld method of string clss
		System.out.println(subString(s, 0, 3));
	}

	public static String subString(String s, int start, int end) {
		String ans = "";

		for (int i = start; i < end; i++) {
			ans += s.charAt(i);
		}
		return ans;

	}
}
