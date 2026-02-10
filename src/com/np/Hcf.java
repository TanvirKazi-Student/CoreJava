package com.np;

import java.util.Scanner;

//Hihest Comman Factor
public class Hcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number first");// 5
		int n1 = sc.nextInt();
		System.out.println("Enter Number second");// 15
		int n2 = sc.nextInt();

		int smallest = n1 < n2 ? n1 : n2;// T

		while (true) {
			if (n1 % smallest == 0 && n2 % smallest == 0) {// 5%5=0 and 15%5=0,
				System.out.println("HCF is: " + " " + smallest);
				break;
			}
			smallest--;
		}
	}
}