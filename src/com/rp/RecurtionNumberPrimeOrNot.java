package com.rp;

public class RecurtionNumberPrimeOrNot {
	public static void main(String[] arges) {
		if(chekPrime(7, 2)) {
			System.out.println("it's prime number");
		}else {
			System.out.println("it's not prime number");
		}
	}

	public static boolean chekPrime(int num, int den) {
		if (num <= 1) {
			return false;
		} else if (den == num) {
			return true;
		} else if (num % den == 0) {
			return false;
		} else {
			return chekPrime(num, den + 1);
		}
	}
}