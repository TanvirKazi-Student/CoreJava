package accessmodifire;

public class DefoultAccesModifireAnotherClass {

	public static void main(String[] args) {
		// Accessing defoult members within the diffrent class — valid
		DefoultAccesModifire c1 = new DefoultAccesModifire();
		System.out.println(c1.rollno);
		System.out.println(c1.name);
		System.out.println(c1.collName);
		System.out.println(c1.instName);
		c1.displayName();

	}

}
