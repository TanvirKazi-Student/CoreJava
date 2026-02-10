package com.sp;

public class StringBuffreObjectmutable {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Pune");// heap

		StringBuffer s2 = new StringBuffer(s1.append("Deccan"));// s1 updated heap
		// StiringBuffer Dose not overrid equals but override toString
		System.out.println(s1.toString().equals(s2.toString()));
	}
}
