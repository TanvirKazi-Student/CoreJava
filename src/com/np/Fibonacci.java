package com.np;
import java.util.Scanner;
public class Fibonacci {
public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");//10
	int num = sc.nextInt();
	
	int n1 = 0,n2 = 1,n3;
	int count = 0;//0,1,2,3,4,5,6,7,8,9
	
	while(count<num) {//t,t,t,t,t,t,t,t,t,t,f
		n3 = n1 + n2;// 0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21,13+21=34,21+34=55,34+55=89
		n1 = n2;//1=1,1=1,2=2,,3=3,5=5,8=8,13=13,21=21,34=34,55=55,89,89
		n2 = n3;//1=1,2=2,3=3,5=5,8=8,13=13,21=21,34=34,55=55,89=89
		System.out.println(n3);
		count++; 
		
	}
	
	
}
}
