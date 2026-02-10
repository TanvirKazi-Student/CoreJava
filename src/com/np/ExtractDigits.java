package com.np;

import java.util.Scanner;

public class ExtractDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Number :");
		int num = sc.nextInt();

		while (num > 0) {
			int last = num % 10;
			System.out.println(last);
			num /= 10;
		}
	}
}
