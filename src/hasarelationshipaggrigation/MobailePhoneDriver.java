package hasarelationshipaggrigation;

public class MobailePhoneDriver {
	public static void main(String[] args) {
		MobilePhone m1 = new MobilePhone("One Pluse", "One Pluse 11R",128, 128, 5000.0, "black");
		m1.diaplayMobilePhone();
		m1.displaySimcard("Jio", 1209430940, "4G", 200);
	}
}
