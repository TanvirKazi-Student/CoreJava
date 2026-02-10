package methodoverriding;

public class Pubg2 extends Pubg1 {
	int gunamo = 40;
	String userName;
	String password;
	String a = "moveforward";
	String b = "movebackword";

	public Pubg2() {

	}

	public Pubg2(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void fireamo() {
		if (0 <= gunamo && gunamo != 0) {
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

	@Override
	public void moveLeft() {
		System.out.println("Moveleft");
		
	}
	@Override
	public void moveRight() {
		System.out.println("Moveright");
	
	}

}
