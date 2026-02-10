package interfaces;

public class Shapes implements Interfaces {

	@Override
	public void areaOfSquare(int side) {
		int area = side * side;
		System.out.println("areaOfSquare :" + area);
	}

	@Override
	public void perimeterOfSquare(int side) {
		int per = 4 * side;
		System.out.println("perimeterOfSquare: " + per);
	}

	@Override
	public void areaOfCircle(int rad) {
		double area = PI_VALUE * (rad * rad);
		System.out.println("areaOfCircle: " + area);

	}

	@Override
	public void circumfaranceOfCircle(int rad) {
		double circ = 2 * PI_VALUE * rad;
		System.out.println("circumfaranceOfCircle: " + circ);
	}

	public static void message() {
		System.out.println("This is the darty calculatore");
	}

}
