package com.rp;

public class RecurtionFibonacciNumberOrNot {
	public static void main(String[] args) {
		System.out.println(checkFibo(10, 0, 1));

	}

	public static boolean checkFibo(int n, int n1, int n2) {
		if (n1 > n) {
			return false;
		} else if (n1 == n) {
			return true;
		} else {
			return checkFibo(n - 1, n2, n1 + n2);
		}
	}
}
