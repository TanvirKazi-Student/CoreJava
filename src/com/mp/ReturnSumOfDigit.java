package com.mp;

public class ReturnSumOfDigit {
	public static void main(String[] args) {
		int res = sumOfDigit(12334);
		System.out.println(res);
	}

	public static int sumOfDigit(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num /= 10;
		}
		return sum;
	}
}
