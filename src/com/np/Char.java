package com.np;
import java.util.Scanner;
public class Char {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Charecter");
	char ch = sc.next().charAt(0);
	
	for(int i = 'a'; i <= ch;i++) {
		System.out.println(i);
	}
}
}
