package com.sp;

public class WildCard {

	public static void main(String[] args) {
		String s = "aaabbcde";// 0 1 2 3 4 5  6 7 
		String p = "*aa*bc*e*a*";// 0 1 2 3 4 5 6 7 
		System.out.println(isMatch(s, p));
	}

	public static boolean isMatch(String s, String p) {
		int i = 0, j = 0;
		int startIndex = -1, match = 0;

		while (i < s.length()) {
			if (j < p.length() && (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))) {
				i++;//0,1,2,3,4,5,6,7
				j++;//1,2,3,4,5,6,7
			}

			else if (j < p.length() && p.charAt(j) == '*') {
				startIndex = j;// 0,3,3+1=4,6
				match = i;// 0,2,4,5,6
				j++;//1,4,5,6,7

			}

			else if (startIndex != -1) {
				j = startIndex + 1;//3+1=4,6+1=7
				match++;//5,6,7
				i = match;//5,7
			}

			else {
				return false;
			}
		}

		while (j < p.length() && p.charAt(j) == '*') {
			j++;
		}
		return j == p.length();
	}
}