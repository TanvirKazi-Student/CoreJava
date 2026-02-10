package com.np;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number then Say How May Even Numbers Are Present:");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("above Present Even numbers");
	}
}
