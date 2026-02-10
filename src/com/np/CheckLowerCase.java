package com.np;

public class CheckLowerCase {

	public static void main(String[] args) {
		char ch = 'A';

		String result = (ch >= 97 && ch <= 122) ? (ch + " is lower case") : (ch + " is not lower case");

		System.out.println(result);
	}
}
