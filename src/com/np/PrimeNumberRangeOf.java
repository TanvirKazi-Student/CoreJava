package com.np;

import java.util.Scanner;

public class PrimeNumberRangeOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int start = sc.nextInt();
		System.out.println("Enter number");
		int end = sc.nextInt();
		while (start <= end) {
			int dev = 2;
			while (start > dev) {
				if (start % dev == 0) {
					break;
				}
				dev++;
			}
			if (start == dev) {
				System.out.println(start);

			}
			start++;
		}

	}
}
