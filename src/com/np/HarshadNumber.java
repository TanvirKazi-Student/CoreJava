package com.np;

import java.util.Iterator;
import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		for (int i = num; i > 0; i = i / 10) {
			int last = i % 10;
			sum = sum + last;
		}
		if (temp % sum == 0) {
			System.out.println("HarshadNumber");
		} else {
			System.out.println("Not harshadNumber");
		}
	}
}
