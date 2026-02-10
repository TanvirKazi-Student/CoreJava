package com.mp;

public class CharCheck {

	public static void main(String[] args) {
		System.out.println(charCheck('9'));
	}

	public static String charCheck(char ch) {
		String res = (ch >= 97 && ch <= 122) ? (ch + " is lowercase ")
				: (ch >= 65 && ch <= 90) ? (ch + " is uppercase ") :
					(ch >= 48 && ch <= 57) ? (ch + " is digit ") :	(ch + " special char ");
		return res;
	}
}
