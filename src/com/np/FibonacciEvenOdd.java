package com.np;

import java.util.Scanner;

public class FibonacciEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3;
		int count = 0;

		while (count < num) {
			n3 = n1 + n2;
			if (n3 % 2 == 0) {
				System.out.println("Enven Number.:" + " " + n3);
			} else {
				System.out.println("Odd Number.:" + " " + n3);
			}
			n1 = n2;
			n2 = n3;
			count++;
		}

	}
}
