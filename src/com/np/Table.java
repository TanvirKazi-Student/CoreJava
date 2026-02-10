package com.np;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number For Create Table");
		int nums = sc.nextInt();
		int i = 1;
		while (i < 10) {
			i++;
			System.out.println(nums * i);
		}

	}
}
