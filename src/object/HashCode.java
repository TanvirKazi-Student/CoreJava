package object;

public class HashCode {

	public static void main(String[] args) {
		String e1 = new String("Hii");
		String e2 = new String("Hii");

		System.out.println(e1.equals(e2));// compare data return true

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());// equals return true So,hash code return same
	}
}
