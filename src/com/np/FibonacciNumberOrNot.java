package com.np;

import java.util.Scanner;

public class FibonacciNumberOrNot {

	static int n3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter world");// 8/7/14
		int num = sc.nextInt();

		int n1 = 0, n2 = 1;
		int count = 0;
		while (count < num) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			count++;

		}
		if (n3 == num) {
			System.out.println("Number is Febonnacci");
		} else {
			System.out.println("Number Not  is Feboncci");
		}
	}

}
