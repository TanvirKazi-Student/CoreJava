package com.np;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");// 7
		int num = sc.nextInt();
		int dev = 2;//3,4,5,6,7

		while (num > dev) {//T,T,T,T,T,F
			if (num % dev == 0) {// 7/2=3.5,7/3=2.33,7/4=1.75,7/5=1.4,7/6=1.17
				break;
			}
			dev++;
		}
		if (num == dev) {// 7==7
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}
}
