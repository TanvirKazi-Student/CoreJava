package exception;

public class NestedExceptionExample2 {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("first catch block" + e);

			try {
				int[] arr = new int[3];
				System.out.println(arr[5]);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("second catch block" + e2);
			}
		} finally {
			System.out.println("inside finally block");
			try {
				String str = null;
				System.out.println(str.length());
			} catch (NullPointerException e3) {
				System.out.println("exeption in finally block" + e3);
			}
		}
	}
}
