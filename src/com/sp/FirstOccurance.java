package com.sp;

public class FirstOccurance {
	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";

		int index = s.indexOf("P", 1);
		System.out.println(index);
	}
}
