package com.np;

public class SumOfDigit {
	public static void main(String[] args) {
		int num = 1234, sum = 0;

		int arg = num % 10; // 1234 % 10 = 4
		sum += arg; // 0 + 4 = 4
		num /= 10; // 1234/10 = 123

		arg = num % 10; // 123 % 10 = 3
		sum += arg; // 4 + 3 = 7
		num /= 10; // 123/10 = 12

		arg = num % 10; // 12 % 10 = 2
		sum += arg; // 7 + 2 = 9
		num /= 10; // 12/10 = 1

		arg = num % 10; // 1 % 10 = 1
		sum += arg; // 9 + 1 = 10
		num /= 10; // 1/10 = 0

		
		System.out.println(sum);
	}
}
