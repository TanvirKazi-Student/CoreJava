package hierarchicalinheritance;

import java.util.Iterator;

public class GoogleDriver {

	public static void main(String[] args) {
		Gmail g1 = new Gmail("Sunder Pichai", "San Franchisco", 301222342, "tanvir@gmail.com", "tanvir@123", 0, 0, 0,
				0);
		g1.login("tanvir@gmail.com", "tanvir@12");
		g1.login("tanvir@gmail.com", "tanvir@123");
		g1.forgetPass("tanvir@gmail.com", "soyab@12");
		g1.login("tanvir@gmail.com", "soyab@12");
		g1.displayGoogle();
		g1.displayGmailDetails();

		for (int i = 0; i <= 9; i++) {
			g1.sendMail("soyab@gmail.com", "Hii bro How are You?");
		}
		g1.displayGmailDetails();
		for (int i = 0; i <= 9; i++) {
			g1.resiveMail("soyab@gmail.com", "Hii bro How are You?");
		}
		g1.displayGmailDetails();
		g1.deletMail();
		g1.displayGmailDetails();

		GoogleDrive g2 = new GoogleDrive("Sunder Pichai", "San Franchisco", 301222342, "tanvir@gmail.com", "tanvir@123",
				0, 0, 0, 0, 0);
		g1.login("tanvir@gmail.com", "tanvir@12");
		g1.login("tanvir@gmail.com", "tanvir@123");
		g2.displayGoogleDriverDetails();

		g2.add("photo");
		g2.add("video");
		g2.add("audio");
		g2.add("docs");
		g2.add("albums");
		g2.displayGoogleDriverDetails();

		g2.add("photo");
		g2.add("video");
		g2.add("audio");
		g2.add("docs");
		g2.add("albums");
		g2.displayGoogleDriverDetails();

		g2.delet("photo");
		g2.delet("video");

	}
}
