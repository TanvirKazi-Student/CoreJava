package interfaces;

public class JaduDriver {

	public static void main(String[] args) {

		Kaju k = new Jadu();
		k.degree();

		Raju r = new Jadu();
		r.degree();

		System.out.println(k.MARKS);
		System.out.println(Kaju.MARKS);
		System.out.println(r.MARKS);
		System.out.println(Raju.MARKS);

	}
}
