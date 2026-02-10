package interfaces;

public abstract class WhatsApp1 implements WhatsApp {

	String user;
	long phno;
	int msgCount = 0;

	public WhatsApp1() {
	}

	public WhatsApp1(String user, long phno) {
		this.user = user;
		this.phno = phno;
		System.out.println("Account Created");
	}
	
	@Override
	public void message(long phno, String msg) {
		if (msgCount <= messageLimit) {
			System.out.println(msg);
			System.out.println("msg sent");
			msgCount++;
		} else {
			System.out.println("Dally msg exceeds");
		}

	}

	@Override
	public void voiceNote(long phno, String msg) {
		if (msgCount <= messageLimit) {
			System.out.println(msg);
			System.out.println("voiceNote sent");
			msgCount++;
		} else {
			System.out.println("Daily msg exceeds");

		}

	}
}
