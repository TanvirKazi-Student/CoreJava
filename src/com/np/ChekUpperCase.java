package com.np;

public class ChekUpperCase {

	public static void main(String[] args) {

		char ch = 'A';

		String result = (ch >= 65 && ch <= 90) ? (ch + " is upper case") : (ch + " is not upper case");

		System.out.println(result);

	}
}
