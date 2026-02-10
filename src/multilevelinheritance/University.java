package multilevelinheritance;

public class University {
	String uname;
	String vc;
	String uloc;
	int code;
	String utype;

	public University() {
		super();
	}

	public University(String uname, String vc, String uloc, int code, String utype) {
		
		this.uname = uname;
		this.vc = vc;
		this.uloc = uloc;
		this.code = code;
		this.utype = utype;
	}

	public void displayUniversity() {
		System.out.println("uname" + uname);
		System.out.println("vc" + vc);
		System.out.println("uloc" + uloc);
		System.out.println("code" + code);
		System.out.println("utype" + utype);
	}

}
