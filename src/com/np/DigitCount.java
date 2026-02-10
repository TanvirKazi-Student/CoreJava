package com.np;
import java.util.Scanner;
public class DigitCount {
public static void main(String[] args) {
	Scanner sce = new Scanner(System.in);
	
	System.out.println("Enter Number :");
	int num = sce.nextInt();
	int count = 0;
	
	while(num>0) {
    count++;
	num /= 10;
	}
	System.out.println(count);
}
}
