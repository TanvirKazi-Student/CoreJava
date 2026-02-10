package com.rp;

public class RecursionPrintAllFactor {
	public static void main(String[] args) {
		factor(10, 1);
	}

	public static void factor(int num, int den) {
		if (num <= den) {
			return;
		}
		if (num % den == 0) {
			System.out.println(den);
		}
		factor(num, den + 1);// use den + 1 other wise give error
	}

}
