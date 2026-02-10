package accessmodifire;

public class PrivateAccesModifire {

	private int rollno = 20;
	private String name = "Tanvir";
	private String collName = "Fabtech";
	private String instName = "Qspiders";

	private void displayName() {
		System.out.println(name);
	}
    
	private PrivateAccesModifire() {
		
		}

	public static void main(String[] args) {
		//  Accessing private members within the same class — valid
		PrivateAccesModifire p = new PrivateAccesModifire();
		System.out.println(p.rollno);
		System.out.println(p.name);
		System.out.println(p.collName);
		System.out.println(p.instName);
		p.displayName();
	}

}
