package com.np;

import java.util.Scanner;

public class SumOfDigitWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");// 1234,123,12,1,0
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) { // true, true,true,true,false
			int last = num % 10;// 1234%10= 4,123%10=3,12%10=2,1%10=1
			sum += last;// 0+4=4,4+3=7,7+2=9,9+1=10
			num /= 10;// 1234/10=123,123/10=12,12/10=1,1/10=0
		}
		System.out.println("Sum of each digit :" + sum);
	}
}
