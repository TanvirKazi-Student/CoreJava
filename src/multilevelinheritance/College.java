package multilevelinheritance;

public class College extends University {
	String collName;
	int collCode;
	char grade;
	String address;
	String principal;
	int noOfDepartment;

	public College() {

	}

	public College(String uname, String vc, String uloc, int code, String utype, String collName, int collCode,
			char grade, String address, String principal, int noOfDepartment) {

		super(uname,vc,uloc,code,utype);
//		this.uname = uname;
//		this.vc = vc;
//		this.uloc = uloc;
//		this.code = code;
//		this.utype = utype;

		this.collName = collName;
		this.collCode = collCode;
		this.grade = grade;
		this.address = address;
		this.principal = principal;
		this.noOfDepartment = noOfDepartment;
	}

	public void displayCollege() {
		displayUniversity();
		System.out.println("collName" + collName);
		System.out.println("collCode" + collCode);
		System.out.println("grade" + grade);
		System.out.println("address" + address);
		System.out.println("principal" + principal);
		System.out.println("noOfDepartment" + noOfDepartment);

	}

}
