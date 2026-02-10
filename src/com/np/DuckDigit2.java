package com.np;

import java.util.Scanner;

//Number present zero so this number is duck number
public class DuckDigit2 {
	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);

		System.out.println("Enter Number :");
		int nums = esc.nextInt();
		boolean isDuck = false;
		while (nums > 0) {
			int last = nums % 10;
			if (last == 0) {
				isDuck = true;
				break;
			}
			nums /= 10;

		}
		if (isDuck) {
			System.out.println("Enter Digit is Duck Number");
		} else {
			System.out.println("Enter Digit is not Number");
		}
	}
}
