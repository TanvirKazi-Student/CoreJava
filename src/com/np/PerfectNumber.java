package com.np;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 6
		int num = sc.nextInt();
		int sum = 0;// 6

		for (int den = 1; den <= num / 2; den++) {// T,T,T,T,T,F
			if (num % den == 0) {// 6%1==0,6%2==0,6%3==0,6%4!=0,6%5!=0
				sum = sum + den;// 1,2,3,
			}

		}
		if (sum == num) {// 6==6
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}

	}
}
