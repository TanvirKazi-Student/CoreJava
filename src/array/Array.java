package array;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// way to create Array object
		int[] ar = new int[5];
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));

		byte[] as = new byte[5];
		System.out.println(Arrays.toString(as));

		short[] at = new short[5];
		System.out.println(Arrays.toString(at));

		long[] ag = new long[5];
		System.out.println(Arrays.toString(ag));

		char[] ch = new char[5];
		System.out.println(Arrays.toString(ch));

		float[] fl = new float[5];
		System.out.println(Arrays.toString(fl));

		double[] lg = new double[5];
		System.out.println(Arrays.toString(lg));

		boolean[] bl = new boolean[5];
		System.out.println(Arrays.toString(bl));

		// How to stor the Element in array
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		arr[5] = 6;//ArrayIndexOutOfBoundsException

		char[] cg = new char[5];
		cg[0] = 'T';
		cg[1] = 'S';
		cg[2] = 'R';
		cg[3] = 'M';
		
		// Reading /Accessing Element from array
		//int arr[] = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// Another way to create arrays
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(a);
		System.out.println(Arrays.toString(a));

		String[] b = { "Tanvir", "Rohan", "Abhi", "Deva", "Soyab" };
		System.out.println(Arrays.toString(b));

		byte[] c = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(c));

		short[] d = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(d));

		char[] e = { 'T', 'R', 'A', 'D', 'S' };
		System.out.println(Arrays.toString(e));

		long[] f = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(f));

		float[] g = { 10.8f, 20.9f, 30.0f, 40, 50 };
		System.out.println(Arrays.toString(g));

		double[] h = { 10.8, 20.9, 30.0, 40, 50 };
		System.out.println(Arrays.toString(h));

		boolean[] i = { true, false };
		System.out.println(Arrays.toString(i));

		// Reading /Accessing Element from array
		int[] re = { 12, 23, 43, 64 };
		System.out.println(re[0]);
		System.out.println(re[1]);
		System.out.println(re[2]);
		System.out.println(re[3]);
//		System.out.println(re[4]);//ArrayIndexOutOfBoundsException

		String[] bs = { "Tanvir", "Rohan", "Abhi", "Deva", "Soyab" };
		System.out.println(bs[0]);
		System.out.println(bs[1]);
		System.out.println(bs[2]);
		System.out.println(bs[3]);
		System.out.println(bs[4]);

	}
}
