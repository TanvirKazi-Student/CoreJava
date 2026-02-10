package multilevelinheritance;

public class Department extends College {
	String type;
	String hod;
	int loc;
	int lec;
	int noOfStudent;
	int seats;

	public Department() {

	}

	Department(String uname, String vc, String uloc, int code, String utype, String collName, int collCode, char grade,
			String address, String principal, int noOfDepartment, String type, String hod, int loc, int lec,
			int noOfStudent, int seats) {

		super(uname,vc,uloc,code,utype,collName,collCode,grade,address,principal,noOfDepartment);
//		this.uname = uname;
//		this.vc = vc;
//		this.uloc = uloc;
//		this.code = code;
//		this.utype = utype;
//
//		this.collName = collName;
//		this.collCode = collCode;
//		this.grade = grade;
//		this.address = address;
//		this.principal = principal;
//		this.noOfDepartment = noOfDepartment;

		this.lec = lec;
		this.noOfStudent = noOfStudent;
		this.seats = seats;
	}

	public void displayDepartment() {
		displayUniversity();
		displayCollege();

		System.out.println("type" + type);
		System.out.println("hod" + hod);
		System.out.println("loc" + lec);
		System.out.println("lec" + lec);
		System.out.println("noOfStudent" + noOfStudent);
		System.out.println("seats" + seats);

	}

}
