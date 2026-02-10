package com.np;

import java.util.Scanner;

public class SumOfEvenProductOfOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number :");// 1234,123,12,1,0
		int num = sc.nextInt();
		int sumOfEven = 0;
		int productOfOdd = 1;

		while (num != 0) { // true,true,true,true,false
			int last = num % 10;// 1234%10=4,123%10=3,12%10=2,1%10=1
			if (last % 2 == 0) {// true,false,true,false
				sumOfEven = sumOfEven + last;// 0+4=4,4+2=6
				num /= 10;// 1234/10=123,12/10=1
			} else {
				productOfOdd = productOfOdd * last;// 1*3=3,3*1=3
				num /= 10;// 123/10=12,1/10=0
			}

		}
		System.out.println("Sum of Even Digit :" + sumOfEven);
		System.out.println("Product of Odd Digit :" + productOfOdd);
	}
}
