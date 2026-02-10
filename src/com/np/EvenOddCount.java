package com.np;

import java.util.Scanner;

public class EvenOddCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int countEven = 0, countOdd = 0;
		while (num > 0) {
			int last = num % 10;

			if (last % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
			num /= 10;
		}
		System.out.println(countEven);
		System.out.println(countOdd);
	}
}
