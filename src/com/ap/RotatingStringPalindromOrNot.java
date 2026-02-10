package com.ap;

public class RotatingStringPalindromOrNot {

	public static void main(String[] args) {

		String s = "dda";
		System.out.println(isRotationPalindrome(s));
	}

	public static boolean isRotationPalindrome(String s) {
		if (isPalindrome(s)) {
			return true;// false
		}

		String rot = rotate(s);// add//dad
		while (!rot.equals(s)) {// add != dda,dad != dda
			if (isPalindrome(rot)) {
				return true;// false//true
			}
			rot = rotate(rot);// add
		}

		return false;
	}

	public static boolean isPalindrome(String s) {// dda,dad
		for (int i = 0, j = s.length() - 1; i < s.length() - 1; i++,j--) {
			if (s.charAt(i) != s.charAt(j)) {// d == a // d == d
				return false;// false // true
			}
		}
		return true;

	}

	public static String rotate(String s) {// dda,add
		String ans = "";// add,dad
		ans += s.charAt(s.length() - 1);// s.length() = 3 → index = 2 → s.charAt(2) = 'a'
		for (int i = 0; i < s.length() - 1; i++) {// 0<2, 0<2
			ans += s.charAt(i);// d,d // a,d
		}
		return ans;// add
	}
}
