package com.np;

import java.util.Scanner;

public class PrimeNumberSecondApproch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 7
		int num = sc.nextInt();
		int dev = 2;// 2,3,4,5
		while (dev < num/2) {// t
			if (num % dev  == 0) {// 3/2,
				break;
			}
			dev++;
		}
		if (num/2 >= dev) {// 3==3
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}
}
