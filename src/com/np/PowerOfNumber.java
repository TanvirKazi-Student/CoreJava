package com.np;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");// 2 rest to 5
		int num = sc.nextInt();

		int product = 1;// 2,4,8,16,32
		int base = 2;

		for (int times = 1; times <= num; times++) {// 1,2,3,4,5,false
			product *= base;// 1*2=2,2*2=4,4*2=8,8*2=16,16*2=32
		}
		System.out.println(product);
	}
}
