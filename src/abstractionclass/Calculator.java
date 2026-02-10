package abstractionclass;

public abstract class Calculator {

	public abstract void addition(int a, int b);

	public abstract void substraction(int a, int b);// abstract method,

	public abstract void multipication(int a, int b);

	public void divition(double a, double b) {// concrete method
		int res = (int) (a / b);
		System.out.println(res);
	}

}
