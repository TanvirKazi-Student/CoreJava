package hierarchicalinheritance;

public class Gmail extends Google {

	private int mailes;
	private int inbox;
	private int sent;
	private int bin;

	public Gmail() {

	}

	public Gmail(String ceo, String add, double turnover, String email, String pass, int mailes, int inbox, int sent,
			int bin) {
		super(ceo, add, turnover, email, pass);

		this.mailes = mailes;
		this.inbox = inbox;
		this.sent = sent;
		this.bin = bin;
	}

	public void sendMail(String to, String content) {
		if (isLoogedIn) {
			System.out.println("mail send");
			sent++;
		} else {
			System.out.println("Please login to send mail.");
		}

	}

	public void resiveMail(String from, String content) {
		if (isLoogedIn) {
			System.out.println("mail resived from :" + from);
			System.out.println(content);
			inbox++;
			mailes++;
		} else {
			System.out.println("Please login to send mail.");
		}

	}

	public void deletMail() {
		if (mailes > 0) {
			System.out.println("deleted mails");
			bin++;
			mailes--;
		} else {
			System.out.println("no mails deleted");
		}
	}

	public void displayGmailDetails() {
		displayGoogle();
		System.out.println("Gmail mailes :" + mailes);
		System.out.println("Gmail inbox :" + inbox);
		System.out.println("Gmail sent :" + sent);
		System.out.println("Gmail bin :" + bin);
	}

}
