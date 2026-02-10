package stringmethods;

import java.io.CharArrayReader;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s = " Pneumonoultr amicroscopicsilicovo lcanoconiosis ";

		String s1 = "Pneumonoultramicroscopicsilicovolcanoconiosi";
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
//		}

		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(3));// working narrowing soso((int) s);
		System.out.println(s.codePointBefore(4));// Calculate before index when give actual index
		System.out.println(s.codePointCount(0, 4));
		System.out.println(s.compareTo("Pneumonoultramicroscopicsilicovolcanoconiosis"));// comparing by alfabets asccii

//	 value
		System.out.println(s.compareToIgnoreCase("pneumonoultramicroscopicsilicovolcanoconiosis"));// compare string not
																									// check uper
																									// case and lower
																									// case
		System.out.println(s.concat("World"));// concate the string
		System.out.println(s.toUpperCase());// convert the string into uppercase
		System.out.println(s.toLowerCase());// convert the string into lowercase
		System.out.println(s.contains("Pneumonoultr"));// if sting present in give string give true
		System.out.println(s.contains("python"));// if string is not present in given string give false
		char ch[] = s.toCharArray();
		System.out.print(Arrays.toString(ch));
		System.out.println(s.contains("sis"));// check given string is present or not
		System.out.println(s.endsWith("sis"));
		System.out.println(s.startsWith("Pne"));
		System.out.println(s == s1);// compare refrance
		System.out.println(s.equals(s1));// compare data by consedaring upper or lowwer case
		System.out.println(s.equalsIgnoreCase(s));// compare data not consedaring upper or lowwer case
		System.out.println(s.toString());// we override the toString return the actual characters inside the string.
		System.out.println(s.hashCode());// we override the hashcode If two strings are equal (equals()), they must
											// return the same hashCode()
		System.out.println(s.hashCode());
		System.out.println(s.indexOf("P"));// give the index
		System.out.println(s.indexOf("o", 2));// Searches for the first occurrence of a character or substring
		System.out.println(s.lastIndexOf("i"));// Searches for the last occurrence of a character or substring
//System.out.println(s.lastIndexOf(0, 0));
		System.out.println(s.indent(0));// use adding or removing leading spaces from each line of a string.
		System.out.println(s.intern());// Canonical representation (in Strings)
		System.out.println(s.isBlank());// It che cks if a string is empty ("") or contains only whitespace characters
										// (spaces, tabs, newlines, etc.).
		System.out.println(s.isEmpty());

		System.out.println(s.repeat(0));

		System.out.println(s.replace("Pne", "Pbc"));// replace old string to new string
		System.out.println(s.replaceAll(s, s1));// replace all old string to new string
		String[] arr = s.split(" ");// splite/deviding the String by given space
		System.out.println(Arrays.toString(arr));
		System.out.println(s);// before strip
		System.out.println(s.strip());// remove withspace
		System.out.println(s.stripIndent());// remove withspace
		System.out.println(s.stripLeading());// remove whitespace starting only
		System.out.println(s.stripTrailing());// not remove whitespace starting only
		System.out.println(s.trim());// remove withspace
		System.out.println(s.substring(0, 5));// last index is not included
		System.out.println(String.valueOf(s));
//		System.out.println(s.strems);

	}
}
