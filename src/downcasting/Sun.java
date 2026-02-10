package downcasting;

// solution of upcasting is downcasting
public class Sun extends Father {

	public void ested() {
		System.out.println("Suns ested");
	}

	public static void main(String[] args) {
		Father f1 = new Sun();// up casting
		f1.proparty();
//		f1.ested();

		Sun s1 = (Sun) f1;// down casting
		s1.ested();
		s1.proparty();
	}
}
