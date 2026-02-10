package com.np;

import java.util.Scanner;

public class YearPalindromLeepYearorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year Number");
		int year = sc.nextInt();
		int rev = 0;
		int temp = year;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Enter year is Leep Year");

			while (year > 0) {
				int last = year % 10;
				rev = rev * 10 + last;
				year /= 10;
			}
			if (temp == rev) {
				System.out.println("Enter Year is Palindrom");
			} else {
				System.out.println("Enter year is not Palindrom");
			}

		} else {
			System.out.println("Enter Year is not Leep Year");
		}

	}
}
