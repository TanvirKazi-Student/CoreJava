package com.np;
import java.util.Scanner;
//Number present zero so this number is duck number
public class DuckDigit {
public static void main (String [] args) {
	Scanner esc = new Scanner(System.in);
	
	System.out.println("Enter Number :");
	int nums = esc.nextInt();
	boolean isDuck = false;
	while(nums>0) {
		//int last = nu	ms % 10; for resons we not use 0 % 10 != 0
		if(nums % 10 == 0) {
			isDuck = true;
			break;
		}
		nums /= 10; 

	}
	if(isDuck) {
		System.out.println("Enter Digit is Duck Number");
	}else {
		System.out.println("Enter Digit is not Duck Number");
	}
}
}
