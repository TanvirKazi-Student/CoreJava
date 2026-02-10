package com.np;

import java.util.Scanner;

public class FactorCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nmber");// 50
		int num = sc.nextInt();
		
		int count = 0;
		for (int den = 1; den <= num / 2; den++) {
			if (num % den == 0) {// 50/1=0,50/2=0,50/3!=0,50/4!=0,50/5=0,50/6!=0,50/7!=0,50/8!=0,50/9!=0,50/10=0,
				// 50/25=0,50/50=0
				count++;// 1,2,5,10,25,= 5
			}
		}
		System.out.println(count + 1);// 5+1 = 6
	}
}
