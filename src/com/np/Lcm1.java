package com.np;

import java.util.Scanner;

//List Comman Multiple
public class Lcm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number first");// 13
		int n1 = sc.nextInt();

		System.out.println("Enter Number second");// 2
		int n2 = sc.nextInt();

		int i = 1;
		int large = n1 > n2 ? n1 : n2;// T

		while (true) {
			if (((large * i) % n1 == 0) && ((large * i) % n2 == 0)) {// 13*1%13 = 0 and 13*1%2=6.5,13*2%13=0 and
																		// 13*2%2=0
				System.out.println("LCM is:" + " " + large * i);// T
				break;
			}
			i++;// 2
		}

	}
}
