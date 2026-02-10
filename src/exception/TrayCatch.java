package exception;

import java.util.Scanner;

public class TrayCatch {

	public static void main(String[] args) {
		
//		try {
//			test();
//
//		} catch (Exception e) {
//			System.out.println("Arithmethic Exeption");
//		}

		// worng way to catch exeption
//		try {
//			test();
//		} catch (Exception e) {
//			System.out.println("other Exception");
//		} catch (ArithmeticException e) {
//			System.out.println("Arithmethic Exeption");
//		} catch (NullPointerExeption e) {
//			System.out.println("Null pointer Exeption");
//		}
		
		
		// correct way to catch exeption
		try {
			test();
		} catch (ArithmeticException e) {
			System.out.println("Arithmethic Exception");
		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception");
		} catch (Exception e) {
			System.out.println("other Exception");
		}finally {
			System.out.println("Finally block called");
		}

	}

	public static void test() {
// 	System.out.println(10 / 0);
		Scanner sc = null;
		sc.nextInt();
	}
}
