package interfaces;

public class WhatsAppDriver {

	public static void main(String[] args) {

		WhatsApp w1 = new WhatsApp2("Tanvir", 830829330);

		WhatsApp.greetings(" Tanvir ");
		w1.message(997575219, "Hii");

		w1.voiceNote(997575219, "What are you doing");

		w1.status("Dont msg 997575219");
	}
}
