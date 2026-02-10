package com.mp;

public class WorkofMainMethod {
	public static void main(String[] args) {
		System.out.println("main begning");
		System.out.println(power(2, 5));
		System.out.println("power end");
		prime(50);
		System.out.println("prime end");
		System.out.println("main end");

	}

	public static int power(int base, int raise) {
		System.out.println("power begning");
		int pow = 1;
		for (int i = 1; i < raise; i++) {
			pow = pow * base;
		}
		return pow;
	}

	public static void prime(int num)   {
		System.out.println("prime begning");
		int den = 2;
		while (num > den) {
			if (num % den == 0) {
				break;
			}
			den++;
		}
		if (den == num) {
			System.out.println("it is prime");
		} else {
			System.out.println("it is not prime");
		}
	}
}
