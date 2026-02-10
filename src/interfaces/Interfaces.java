package interfaces;

public interface Interfaces {

	double PI_VALUE = 3.14;

	void areaOfSquare(int side);

	void perimeterOfSquare(int side);

	void areaOfCircle(int rad);

	public abstract void circumfaranceOfCircle(int rad);

	public static void massage() {
		System.out.println("welcome to shapas calculator");
	}
}
