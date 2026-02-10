package com.np;

import java.util.Scanner;

public class ReverseDigitWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");//1234,123,12,1,0
		int num = sc.nextInt();
		int rev = 0;//4,43,432

		while (num != 0) {//t,t,t,t,f
			int last = num % 10;//1234%10=4,123%10=3,12%10=2,1%10=1
			rev = rev * 10 + last;//0*10+4=4,4*10=3=43,43*10+2=432,432*10+1=4321
			num /= 10;//1234/10=123,123/10=12,12/10=1,1/10=0
		}
		System.out.println(rev);
	}
}
