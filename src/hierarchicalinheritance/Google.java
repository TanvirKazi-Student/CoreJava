package hierarchicalinheritance;

import java.util.Set;

public class Google {

	private String ceo;
	private String add;
	private double turnover;
	private String email;
	private String pass;
	private String newPass;
	protected boolean isLoogedIn = false;

	public Google() {

	}

	public Google(String ceo, String add, double turnover, String email, String pass) {
		this.ceo = ceo;
		this.add = add;
		this.turnover = turnover;
		this.email = email;
		this.pass = pass;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String SetPass() {
		return newPass;
	}

	public void getPass(String newPass) {
		this.newPass = newPass;
	}

	public boolean login(String email, String pass) {
		if (this.email.equals(email) && this.pass.equals(pass)) {
			isLoogedIn = true;
			System.out.println("Logine Succesfully");
			return true;
		} else {
			System.out.println("Invalid crediatioal");
			return false;
		}
	}

	public void forgetPass(String email, String newPass) {
		if (email.equals(email)) {
			this.pass = newPass;
			System.out.println("Password chenged Succesfully");
		} else {
			System.out.println("Password not chenged Succesfully");
		}
	}

	public void displayGoogle() {
		System.out.println("Google ceo is: " + ceo);
		System.out.println("Google address is: " + add);
		System.out.println("Google turnover is: " + turnover);
		System.out.println("Google email is: " + email);
		System.out.println("Google pass is: " + pass);

	}

	@Override
	public String toString() {
		return "CEO: " + ceo + ", Address: " + add + ", Turnover: " + turnover + ", Email: " + email;
	}
}
