package exception;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class NestedExceptionExample1 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			FileReader fr = new FileReader("non_existent_file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException" + e);
			try {
				String s = "Hi";
				System.out.println(s.charAt(5));
			} catch (StringIndexOutOfBoundsException e2) {
				System.out.println("StringIndexOutOfBoundsExcepton" + e2);
			}
		}
		 finally {
				System.out.println("Inside finally block");
				try {
					int num = Integer.parseInt("Tanvir");
				} catch (NumberFormatException e3) {
					System.out.println("NumberFormatException " + e3);
				}
			}

	}
}
