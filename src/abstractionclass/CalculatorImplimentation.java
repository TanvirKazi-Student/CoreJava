package abstractionclass;

import com.nt.twodap.AdditionOfTwoArray;

public class CalculatorImplimentation extends Calculator {

	@Override
	public void addition(int a, int b) {
		int res = a + b;
		System.out.println(res);

	}
 	
	@Override
	public void substraction(int a, int b) {
		int res = a - b;
		System.out.println(res);
	}

	@Override
	public void multipication(int a, int b) {
		int res = a * b;
		System.out.println(res);

	}

	public static void main(String[] args) {
		Calculator c1 = new CalculatorImplimentation();

		c1.addition(10, 20);
		c1.substraction(10, 10);
		c1.multipication(10, 20);
		c1.divition(20, 10);
	}
}
