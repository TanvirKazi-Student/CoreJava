package com.mp;

public class ReturnPalindromicPrime {
	public static void main(String[] args) {
		if (ispalindromic(131) && isprime(131)) {
			System.out.println("No. is PalindromicPrime");
		} else {
			System.out.println("No is not PalindromicPrime");
		}
	}

	public static boolean ispalindromic(int num) {
		int rev = 0;
		for (int i = num; i != 0; i++) {
			rev = rev * 10 + (num % 10);
			num /= 10;

		}
		return num == rev;
	}

	public static boolean isprime(int num) {
		int den = 2;
		while (num > den) {
			if (num % den == 0) {
				return false;
			}
			den++;
		}
		return true;
	}
}
