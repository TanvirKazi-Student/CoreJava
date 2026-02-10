package com.np;

import java.util.Scanner;

public class PalindromNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");// 121
		int num = sc.nextInt();
		int rev = 0;// 121
		int temp = num;// 121

		while (num != 0) {
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;

		}

		if (temp == rev) {// 121==121
			System.out.println("Palindrom Number");
		} else {
			System.out.println("not Palindrom Number");
		}

	}
}
