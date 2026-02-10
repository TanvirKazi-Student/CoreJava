package com.np;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number For Calculate Addition");
		int num = sc.nextInt();
		
	    int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		
		}
		System.out.println("sum is :"+sum);
	}
}
