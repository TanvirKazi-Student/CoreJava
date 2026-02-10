package com.np;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Year to check leep year or not :");
			int year = sc.nextInt();
			
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("Enter year is leap year ");
			}else{
				System.out.println("Enter year is not leap year");
			}
		}
			
	}
}
