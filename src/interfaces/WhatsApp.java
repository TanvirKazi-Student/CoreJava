package interfaces;

public interface WhatsApp {

	int messageLimit = 10;

	void message(long phno, String msg);

	void voiceNote(long phno, String msg);

	void status(String ip);

	public static void greetings(String name) {
		System.out.println("Hey" + name + "Welcome to WhatsApp");
	}
}
