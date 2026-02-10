package upcasting;

public class Sun extends Father {
	public void ested() {
		System.out.println("Suns ested");
	}

	public static void main(String[] args) {
		Father f1 = new Sun();
		f1.proparty();// this is the example of upcasting
//		f1.ested();

		Sun s2 = (Sun) f1;//this is the example of downcasting
        s2.ested();
        s2.proparty();
	}

}
