package interfaces;

public class SanDriver {

	public static void main(String[] args) {

		Father f1 = new Sun();

		f1.degree();

		Mother m1 = new Sun();

		m1.degree();

		System.out.println(f1.marks);
		System.out.println(Father.marks);

		System.out.println(m1.marks);
		System.out.println(Mother.marks);

		Sun s1 = new Sun();
//		System.out.println(s1.marks);// ambiguty
	}
}
