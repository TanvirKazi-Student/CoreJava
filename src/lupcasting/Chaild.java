package lupcasting;

public class Chaild extends Parent{

	@Override
	public void m1() {
		System.out.println("m1 Chaild");
	}
	
	
	public void m2() {
		System.out.println("m2 Chaild");
	}
	
	
	public static void main(String[] args) {
		Parent p1 = new Chaild();
		p1.m1();
//		p1.m2(); //The method m2() is undefined for the type Parent
		
		
	}
}
