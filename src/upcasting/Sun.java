package upcasting;

public class Sun extends Father {
	@override
	public void proparty() {
		System.out.println("Suns ested");
	}

	public static void main(String[] args) {
		Father f1 = new Sun();
		f1.proparty();// this is the example of upcasting
//		f1.proparty();

		Sun s2 = (Sun) f1;//this is the example of downcasting
        s2.proparty();
        s2.proparty();
	}

}
