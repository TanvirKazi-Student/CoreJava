package com.rp;

public class RecursionSumOfDigits {
	public static void main(String[] args) {
		sumOfDigit(1234, 0);
	}

	private static int sumOfDigit(int num, int sum) {
		if (num != 0) {
			int last = num % 10;
			sum = sum + last;
		} else {
			return sumOfDigit(num / 10, sum);
		}
		return sum;

	}
}
