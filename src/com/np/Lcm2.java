package com.np;

import java.util.Scanner;

//List Comman Multiple
public class Lcm2 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number first");// 12
		int n1 = sc.nextInt();
		System.out.println("Enter Number second");// 8
		int n2 = sc.nextInt();

		int lcm = n1 > n2 ? n1 : n2;// T
		int i = 1;

		while (true) {
			int largest = lcm * i;// 12*1=12,12*2=24
			if (largest % n1 == 0 && largest % n2 == 0) {// 12*12=0 and 12*8=8.5, 24%12=0 and 24*8=0
				System.out.println(largest);
				break;
			}
			i++;// 2

		}
	}
}
