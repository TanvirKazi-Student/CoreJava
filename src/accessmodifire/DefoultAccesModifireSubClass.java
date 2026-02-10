package accessmodifire;

public class DefoultAccesModifireSubClass extends DefoultAccesModifire {

	public static void main(String[] args) {
		DefoultAccesModifireSubClass p = new DefoultAccesModifireSubClass();
		System.out.println(p.rollno);
		System.out.println(p.name);
		System.out.println(p.collName);
		System.out.println(p.instName);
		p.displayName();
	}
}
