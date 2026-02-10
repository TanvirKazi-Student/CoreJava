package com.rp;

public class RecurtionFebonacci {
	public static void main(String[] args) {
		fibo(10, 0, 1);
	}

	public static void fibo(int n, int n1, int n2) {
		if (n > 0) {
			System.out.println(n1);
			fibo(n - 1, n2, n1 + n2);
		}
		return;
	}
}
