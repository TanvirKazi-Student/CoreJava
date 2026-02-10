package com.np;
import java.util.Scanner;
public class MergeName {
public static void main( String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Name");
	String firstName = sc.next();
	sc.nextLine();
	System.out.println("Enter Second Name");
	String lastName = sc.next();
	
	String res = firstName+" "+lastName;
	
	System.out.println("Your Fullname is : "+ res);
}
}
