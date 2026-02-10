package com.mp;

public class Buzz {

	public static void main(String[] args) {
		if (isBuzzNumber(77)) {
			System.out.println("Buzz Number");
		} else {
			System.out.println("Not Buzz Number");
		}
	}

	public static boolean isBuzzNumber(int num) {
		return num % 10 == 7 && num % 7 == 0;
	}

}
