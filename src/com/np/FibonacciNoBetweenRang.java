package com.np;

import java.util.Scanner;

public class FibonacciNoBetweenRang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number");//100
		int start = sc.nextInt();

		System.out.println("Enter the last number");//500
		int end = sc.nextInt();

		int n1 = 0, n2 = 1, n3;
        int count = 0;
		while (n1 <= end) {//500=500/ n1<500
			n3 = n1 + n2;

			if (n1 >= start) {//100=100/ n1>100
				System.out.println(n1);
			}
				n1 = n2;
				n2 = n3;
				count ++;
			}
		
	
	}

}
