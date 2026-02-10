package com.mp;

public class ReturnRangeOfPrime {
	public static void main(String[] args) {
		rangeOfPrime(1, 10);
	}

	public static void rangeOfPrime(int start, int end) {

		while (start <= end) {
			if (isprime(start)) {
				System.out.println(start);
			}
			start++;
		}

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
