package com.np;

import java.util.Scanner;

public class UnicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");//1234 or 122
		int num = sc.nextInt();
		int count = 0;//4
		while (num > 0) {//T
			int digit1 = num % 10;//4    // 2  
			num /= 10;//123             //12

			while (num > 0) {//T,T,T,T,f
				int digit2 = num % 10;//3,2,1   //2
				num /= 10;//12,1,0    	        //1,0

				if (digit1 == digit2) {//4!=3,4!2,4!=1   //2==2
					count++;//0
				}

			}
			if (num == count) {//0==0  //0==1
				System.out.println("Unic Number");
			} else {
				System.out.println("Not unic Number");
			}
		}
	}
}
