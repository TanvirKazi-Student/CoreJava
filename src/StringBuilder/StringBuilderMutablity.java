package StringBuilder;

public class StringBuilderMutablity {
	//StringBuilder mutability and reference behavior.
	public static void main(String[] args) {
		StringBuilder sp1 = new StringBuilder("Hii");

		StringBuilder sp2 = sp1.append("Hello");// append() does not create a new object. It modifies the existing
												// StringBuilder object and returns a reference to the same object.

		System.out.println(sp1);
		System.out.println(sp2);
		System.out.println(sp1 == sp2);// T
		System.out.println(sp2.equals(sp2));// T
	}
}
