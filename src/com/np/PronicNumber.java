package com.np;

import java.util.Scanner;

public class PronicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 12
		int num = sc.nextInt();
		boolean isPronics = false;
		for (int i = 1; i <= num; i++) {// T,T,T
			if (i * (i + 1) == num) {// 1*1+1=2,2*2+1=6,3*3+1=12 so 12==12
				isPronics = true;
				break;
			}
		}
		if (isPronics) {
			System.out.println("Pronic Number"+ num);
		} else {
			System.out.println("Not a Pronic Number"+num);
		}

		sc.close();
	}
}