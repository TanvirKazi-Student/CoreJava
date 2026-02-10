package accessmodifire;

public class DefoultAccesModifire {

	int rollno = 20;
	String name = "Tanvir";
	String collName = "Fabtech";
	String instName = "Qspiders";

	void displayName() {
		System.out.println(name);
	}

	DefoultAccesModifire() {

	}

	public static void main(String[] args) {
		// Accessing defoult members within the same class — valid
		DefoultAccesModifire p = new DefoultAccesModifire();
		System.out.println(p.rollno);
		System.out.println(p.name);
		System.out.println(p.collName);
		System.out.println(p.instName);
		p.displayName();
	}

}
