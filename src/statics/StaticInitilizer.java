package statics;

public class StaticInitilizer {

	static double pi = 3.14;

	public static void main(String[] args) {
		System.out.println("Initial pi Values: " + pi);
		areaOfCircle(100);
		perimeterOfCircle(100);
	}

	public static void areaOfCircle(int radius) {
		double areaOfCircle = pi * radius * radius;
		System.out.println("Area of the circle is: " + areaOfCircle);
	}

	public static void perimeterOfCircle(int radius) {
		double perimeterOfCircle = 2 * (pi * radius);
		System.out.println("Perimeter Of the circle is: " + perimeterOfCircle);
	}

}
