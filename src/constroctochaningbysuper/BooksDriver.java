package constroctochaningbysuper;

import java.util.Arrays;

public class BooksDriver {
	public static void main(String[] args) {
		Books[] b1 = new Books[3];
		b1[0] = new Books("Flay in sky", "Tanvir", 1110);
		b1[1] = new Books("Flay in moon", "Soyab", 1110);
		b1[2] = new Books("Flay in earth", "Tanvir", 110);
		System.out.println(Arrays.toString(b1));
//		Books b1 = new Books("Flay in the Sky", "Tanvir Kazi", 200);
//		b1.displayInfo();

//		Books b2 = new Books();
//		b2.setTitle("Flay in the moon");
//		System.out.println(b2.getTitle());

//		Books b1 = new Books("Flay in the Sky", "Tanvir Kazi", 200);
//		b1.displayInfo();
//
//		b1.setTitle("Flay in the moon");
//		System.out.println(b1.getTitle());

//		RefranceBook r1 = new RefranceBook("Flay in the Sky", "Tanvir Kazi", 200, "Mathemathics", 6);
//        r1.referTopic();

//		RefranceBook r2 = new RefranceBook();
//		r2.setTitle("Fly in the sky");
//		r2.setSubject("Mathematics");
//		System.out.println(r2.getTitle() + " " + r2.getSubject());

//		NoteBook n1 = new NoteBook("Flay in the Sky", "Tanvir Kazi", 200, 1000, false);
//		n1.writeNote();
//		System.out.println(n1.getNumberOfPages());
//		n1.setNumberOfPages(2000);
//		System.out.println(n1.getNumberOfPages());

	}
}
