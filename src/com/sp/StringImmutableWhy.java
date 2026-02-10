package com.sp;

public class StringImmutableWhy {
// Any New Modification Take new Object
	public static void main(String[] args) {

		String s1 = "Hello";// create object scp

		String s2 = "Hello";// check alredy exist object point scp object

		String s3 = s1 + "By";// create new object in scp

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

//		String s3 = s1 + "By";
//		Concatenation creates a new String object ("HelloBy").
//		Because String is immutable, the original "Hello" is unchanged.
//		s3 points to a different object.
	}
}
