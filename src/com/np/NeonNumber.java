package com.np;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");// 9
		int num = sc.nextInt();

		int sum = 0;// 9
		int sqr = num;
		sqr = num * num;// 81

		for (int i = sqr; i > 0; i = i / 10) {
			int last = i % 10;// 1,8
			sum = sum + last;// 1,8

		}
		if (sum == num) {// 9==9
			System.out.println("Number is neon Number");
		} else {
			System.out.println("Number is not neon Number");
		}

	}
}
