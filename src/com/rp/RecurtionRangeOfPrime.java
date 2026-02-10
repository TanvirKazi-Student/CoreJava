package com.rp;

public class RecurtionRangeOfPrime {
	public static void main(String[] args) {
		rangOfPrime(100, 200);
	}

	public static void rangOfPrime(int start, int end) {
		if (start <= end) {
			if (prime(start, 2)) {
				System.out.println(start);
			}
			rangOfPrime(start + 1, end);
		}
	}

	public static boolean prime(int start, int den) {
		if (start <= 1) {
			return false;
		} else if (den == start) {
			return true;

		} else if (start % den == 0) {
			return false;
		} else {
			return prime(start, den + 1);
		}
	}
}
