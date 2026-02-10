package com.np;

import java.util.Scanner;

//Stong Number is also called as the Special Number
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 145,14,1,0
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;// 145

		while (num != 0) {// T,T,T
			int last = num % 10;// 5,4,1,
			num /= 10;// 145,14,1,0

			int fact = 1;
			while (last > 0) {
				fact = fact * last;// 125,24,1
				last--;
			}
			sum = sum + fact;// 125,24,1
		}
		if (sum == temp) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not strog Number");
		}

	}
}
