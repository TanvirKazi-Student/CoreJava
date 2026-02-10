package com.np;

import java.util.Scanner;

public class FibonacciCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 10
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3;
		int count = 0;// 0,1,1,2,3,5,8
		// 13<=10 false
		while (n1 <= num) {// t,t,t,t,t,t,t,f
			n3 = n1 + n2;// 0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13
			n1 = n2;// 1=1,1=1,2=2,3=3,5=5,8=8
			n2 = n3;// 1=1,2=2,3=3,5=5,8=8
			count++;
		}
		System.out.println(count);

	}
}