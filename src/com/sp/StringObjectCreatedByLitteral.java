package com.sp;

public class StringObjectCreatedByLitteral {
//create object in String constant pool (scp) area
	public static void main(String[] args) {
		String s1 = "Hii";
		String s2 = "Hii";// check before create object
		String s3 = "Hello";
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.hashCode());// 72552
		System.out.println(s2.hashCode());// 72552 same
	}
}
