package com.np;

public class CharecterCheck {

	public static void main(String[] args) {
		char ch = 'b';
		String res = (ch >= 65 && ch <= 90) ? (ch + "upper case")
				: (ch >= 97 && ch <= 122) ? (ch + " lower case")
						: (ch >= 48 && ch <= 57) ? (ch + "Digits") : (ch + "not Digit");
		System.out.println(res);
	}

}
