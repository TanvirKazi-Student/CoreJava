package com.sp;

public class StringObjectCreatedByNew {
//create object in heap area
	public static void main(String[] a) {
		String s1 = new String("Hii");
		String s2 = new String("Hellow");
		String s3 = new String("Hii");
		System.out.println(s1 == s2);// false compare object refarence
		System.out.println(s1.equals(s3));// true compare object data
		System.out.println(s1.hashCode());// 72552
		System.out.println(s3.hashCode());// 72552 same
	}
}
