package com.mp;

public class MethodPowerAndPrime {
	public static void main(String[] args) {
		System.out.println(power(2, 5));
		prime(7);

	}

	public static int power(int base, int raise) {
		int pow = 1;
		for (int i = 1; i < raise; i++) {
			pow = pow * base;
		}
		return pow;
	}

	public static void prime(int num) {
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
			System.out.println("it is not prime ");
		}
	}
}
