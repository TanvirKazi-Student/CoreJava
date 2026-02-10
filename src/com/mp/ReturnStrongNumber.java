package com.mp;

public class ReturnStrongNumber {
	public static void main(String[] args) {
	boolean res = isStrong(145);
	System.out.println(res);
	}

	public static boolean isStrong(int num) {
		int sum = 0;
		while (num != 0) {
			int last = num % 10;
			sum = sum + factorial(last);
			num /= 10;
		}
		return sum == num;
	}

	public static int factorial(int digit) {
		int fact = 1;
		while (digit > 0) {
			fact = fact * digit;
			digit--;
		}
		return fact;
	}

}
