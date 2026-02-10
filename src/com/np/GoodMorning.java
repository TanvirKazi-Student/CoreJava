package com.np;

import java.util.Scanner;

public class GoodMorning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number Print Good Mornig");
        int num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
             System.out.println("Good Morning :"+i);
		}
	}
}
