package com.np;

import java.util.Scanner;

public class EvenDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		boolean found = false;

		while (num > 0) {
			int last = num % 10;
			if (last % 2 == 0) {
				found = true;
				 System.out.println(last + " is even digit");
			}
			num /= 10;
		}
	}
}

