package interfaces;

public class ShapesDriver {

	public static void main(String[] args) {
		
		Shapes s1 = new Shapes();
		
		s1.areaOfCircle(100);
		
		s1.areaOfSquare(100);
		
		s1.circumfaranceOfCircle(100);
		
		s1.perimeterOfSquare(100);
		
	    Shapes.message();
	}
}
