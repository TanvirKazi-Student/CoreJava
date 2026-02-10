package exception;

import java.util.Scanner;

public class TryCatchBlock {

	public static void main(String[] args) {
		// Arithmetic exception
// Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int num = sc.nextInt();
//
//		System.out.println("Enter the Denometer");
//		int den = sc.nextInt();
//		try {
//			int ans = num / den;
//			System.out.println(ans);
//		} catch (ArithmeticException e) {
//			System.out.println("Don't devide by zero");
//		}
//		System.out.println("Thank you");

		// null pointer exception
//		try {
//			String str = null;
//			System.out.println(str.length());
//		} catch (NullPointerException e) {
//			System.out.println("You tried to use a null object");
//		}

		// ArrayIndexOutOfBoundsExeption
		System.out.println("Program finished");
		try {
			int[] ar = new int[5];
			ar[0] = 1;
			ar[1] = 2;
			ar[2] = 3;
			ar[3] = 4;
			ar[4] = 3;
			ar[5] = 4;

			System.out.println(ar[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index accessed!");
		}


		// NumberFormateExeption
//		try {
//			String str = "abc";
//			int num = Integer.parseInt(str);
//		} catch (NumberFormatException e) {
//			System.out.println("Invalid Number Formate!");
//		}
//		System.out.println("Program finished.");

		// finally block
//		try {
//			int res = 10 / 0;
//			System.out.println(res);
//		} catch (ArithmeticException e) {
//			System.out.println("Can't divide by zero");
//		} finally {
//			System.out.println("Finally block always execute");
//		}
//
	}

}
