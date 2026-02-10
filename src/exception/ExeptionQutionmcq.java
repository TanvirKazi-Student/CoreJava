package exception;

public class ExeptionQutionmcq {

	public static void main(String[] args) {
//		try {
//			int a = 5 / 0;
//
//		} catch (ArithmeticException e) {
//			System.out.println("catch block");
//		} finally {
//			System.out.println("finally block");
//		}

//		try {
//			System.out.println("Try block");
//		}finally {
//			int a = 10 / 0;
//		}

//		try {
//			int a = 10 / 0;
//		} catch (NullPointerException e) {
//			System.out.println("Null Pointer Exception");
//		} finally {
//			System.out.println("finally Block");
//		}

//		try {
//			System.out.println("Try block");
//			return;
//		} finally {
//			System.out.println("Finally block");
//		}

		try {
			throw new NullPointerException("Try");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} finally {
			System.out.println("Finally block");
		}

	}
}
