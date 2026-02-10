package exception;

public class NestedExceptionExample3 {
	public static void main(String[] args) {
		try {
			int[] a = new int[3];
			System.out.println(a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e);
			try {
				String s = null;
				System.out.println(s.toLowerCase());
			} catch (NullPointerException e2) {
				System.out.println("NullPointerException" + e2);
			}
		} finally {
			System.out.println("Inside finally block");
			try {
				int x = 10 / 0;
			} catch (ArithmeticException e3) {
				System.out.println("ArithmeticException of finally block" + e3);
			}
		}
	}
}
