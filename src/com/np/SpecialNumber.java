package com.np;

import java.util.Scanner;

//Special Number is also called as the Stong Number
public class SpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 145
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;

		for (int i = num; i != 0; i = i / 10) {
			int last = i % 10;
			int fact = 1;
			for (; last != 0; last--) {
				fact = fact * last;

			}
			sum = sum + fact;
		}

		if (sum == temp) {
			System.out.println("Special Number");
		} else {
			System.out.println("Not Special Numder");
		}
	}

}