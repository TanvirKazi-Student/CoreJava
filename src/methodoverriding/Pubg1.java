package methodoverriding;
//Polymorphisum
public class Pubg1 {

	int gunamo = 40;
	String username;
	String password;
	String a = "moveforward";
	String b = "moveforwaed";

	public Pubg1() {

	}

	public Pubg1(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void fireamo() {
		if (0 <= gunamo) {// 0 != gunamo
			gunamo--;
			System.out.println(gunamo);
		} else {
			System.out.println("Reload Gun");
		}

	}

	public void reload() {
		gunamo = 40;
		System.out.println("Reload Sucessfully");
	}

	public void moveLeft() {
		System.out.println("MoveRight");

	}

	public void moveRight() {
		System.out.println("Moveleft");

	}

}
