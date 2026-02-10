package com.np;

import java.util.Scanner;

public class FibonacciOf10thOr100thNoPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 10
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3;
		int count = 1; // count is can not start from the 0 because n1 is 0 and febonachi no.is start
						// from 0

		while (count < num) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			count++;
		}
		System.out.println(n1);// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
       
	}
}
