package com.np;

public class PrimeNumberthiredApproch {

	public static void main(String[] args) {
		int num = 7;
		int den = 2;
		while (den * den <= num) {
			if (num % den == 0) {
				break;
			}
			den++;
		}
		if (den * den > num) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not Prime number");
		}
	}

}
