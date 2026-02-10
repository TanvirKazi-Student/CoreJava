package constroctochaningbysuper;

public class RefranceBook extends Books {

	private String subject;
	private int edition;

	RefranceBook() {

	}

	RefranceBook(String title, String author, double price, String subject, int edition) {
		super(title, author, price);
		this.subject = subject;
		this.edition = edition;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public void referTopic() {
		displayInfo();
		System.out.println(subject);
		System.out.println(edition);
	}
}
