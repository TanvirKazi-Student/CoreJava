package interfaces;

public class WhatsApp2 extends WhatsApp1 {

	public WhatsApp2() {

	}

	public WhatsApp2(String user, long phno) {
//		this.user = user;
//		this.phno = phno;

		super(user, phno);
	}

	@Override
	public void message(long phno, String msg) {
		if (msgCount <= messageLimit) {
			System.out.println("Your chat is now in end to end encryption");
			System.out.println(msg);
			System.out.println("sent");
			msgCount++;
		}
	
	}

	@Override
	public void status(String ip) {
		System.out.println(ip);

	}

}
