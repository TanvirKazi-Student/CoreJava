package constroctochaningbysuper;

public class NoteBook extends Books {

	private int numberOfPages;
	private boolean isRuled;

	NoteBook() {

	}

	NoteBook(String title, String author, double price, int numberOfPages, boolean isRuled) {
		super(title, author, price);
		this.numberOfPages = numberOfPages;
		this.isRuled = isRuled;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public void writeNote() {
		displayInfo();
		System.out.println(numberOfPages);
		System.out.println(isRuled);
	}
}
