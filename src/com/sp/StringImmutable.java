package com.sp;

public class StringImmutable {
	public static void main(String[] args) {
		String s1 =  "Pune";//create obeject in scp
		String s2 = s1 + "Deccune";//crate object in heap
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
