package com.np;

public class ProductOfDigits {
	public static void main(String[] args) {
		int num = 1234, mul = 1;

		int temp = num % 10; // 1234 % 10 = 4
		mul *= temp;// 1 * 4 = 4
		num /= 10;// 1234 / 10 = 123

		temp = num % 10; // 123 % 10 = 3
		mul *= temp;// 4 * 3 = 12
		num /= 10;// 123 / 10 = 12

		temp = num % 10; // 12 % 10 = 2
		mul *= temp;// 12 * 2 = 24
		num /= 10;// 12 / 10 = 1

		temp = num % 10; // 1234 % 10 = 4
		mul *= temp;// 24 * 1 = 24
		num /= 10;// 1 / 10 = 0

		System.out.println(mul);
	}
}
