package d;

import com.mp.Buzz;

public class Cass {

	public static void main(String[] args) {

		if (Buzz(77)) {
			System.out.println("buzz");
		} else {
			System.out.println("not buzz");
		}
	}
	
	public static boolean Buzz(int num) {
		return num % 10 == 7 && num % 7 == 0;
	}
}