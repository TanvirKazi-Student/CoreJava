package com.np;
import java.util.Scanner;
public class Student {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Firstname :");
	String firstName = sc.next();
	System.out.println("Enter Lastname :");
	String lastName = sc.next();
	sc.nextLine(); 
	System.out.println("Enter Fullname :");
	String fullName = sc.next();
	System.out.println("Enter College Roll Number :");
	int collegeRollNo = sc.nextInt();
	System.out.println("Enter PRN Number");
	long prnNumber = sc.nextLong();
	System.out.println("Enter Branch :");
	String branch = sc.next();
	System.out.println("Enter College Marks :");
	float marks = sc.nextFloat();
	System.out.println("Enter Year of Admition");
	int admitionYear = sc.nextInt();
	System.out.println("Enter Year of Passing :");
	int yearPass = sc.nextInt();
	System.out.println("Enter Age :");
	int age = sc.nextInt();
	System.out.println("Enter blood Group :");
	char bloodGroup = sc.next().charAt(0); 
	System.out.println("Enter the Gender :");
	String gender = sc.next();
	System.out.println("Enter Nationality :");
	String nationality = sc.next();
	System.out.println("Enter Addar Number :");
	long addarNumber = sc.nextLong();
	System.out.println("Enter Religen :");
	String religon = sc.next();
	System.out.println("Enter City :");
	String city = sc.next();
	System.out.println("Enter State :");
	String state = sc.next();
	System.out.println("Enter Pincode");
	int pinCode = sc.nextInt();
	System.out.println("Enter Phon Number :");
	int phonNumber = sc.nextInt();
	System.out.println("Enter Alternative Number :");
	int alternativeNumber = sc.nextInt();
	
	System.out.println(firstName);
	System.out.println(lastName);
	System.out.println(fullName);
	System.out.println(collegeRollNo);
	System.out.println(prnNumber);
	System.out.println(branch);
	System.out.println(marks);
	System.out.println(yearPass);
	System.out.println(age);
	System.out.println(bloodGroup);
	System.out.println(gender);
	System.out.println(nationality);
	System.out.println(addarNumber);
	System.out.println(religon);
	System.out.println(city);
	System.out.println(state);
	System.out.println(pinCode);
	System.out.println(phonNumber);
	System.out.println(alternativeNumber);
	System.out.println(admitionYear);
	
	
}
}
