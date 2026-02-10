package com.np;

import java.util.Scanner;

public class SurechDigit {
	public static void main(String[] args) {
		Scanner sce = new Scanner(System.in);

		System.out.println("Enter the Number :");
		int num = sce.nextInt();

		System.out.println("Enter the Digit which is Surching :");
		int nums = sce.nextInt();
		boolean isFound = false;

		while (num > 0) {
			int last = num % 10;
			if (last == nums) {     
				isFound = true;
				break;
			}
			num /= 10;
		}
		if (isFound) {
			System.out.println("Surching Digit is finded");
		} else {
			System.out.println("Surching Digit is Not finded");
		}
	}
}
