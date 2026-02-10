package com.sp;

public class MyProgram {

	public static void main(String[] args) {
		String s = "Tanvir.";
		System.out.println(reverese(s));
	}

	public static String reverese(String s) {
		String rev = "";
		char last = s.charAt(s.length() - 1);
		int i;
		if (!(last >= 'a' && last <= 'z' || last >= 'A' && last <= 'Z' || last >= 0 && last <= 9)) {
			i = s.length() - 2;
		} else {
			i = s.length() - 1;
		}

		for (; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}

}
