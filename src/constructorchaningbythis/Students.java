package constructorchaningbythis;

public class Students {

	int rollno;
	String name;
	String collegeName;
	String degree;
	String streem;
	double collegeFee;
	String hostelWing;
	double hostelFee;

	public Students() {

	}

	// All the Mendotory filds
	public Students(int rollno, String name, String collegeName, String degree, String streem) {
		this.rollno = rollno;
		this.name = name;
		this.collegeName = collegeName;
		this.degree = degree;
		this.streem = streem;
	}

	// All Mandatory with one non Mandatory filds
	public Students(int rollno, String name, String collegeName, String degree, String streem, double collegeFee) {
		this(rollno,name,collegeName,degree,streem);
		this.collegeFee = collegeFee;
	}

	// All Mendetory with All non Mendetory filds
	public Students(int rollno, String name, String collegeName, String degree, String streem, double collegeFee,
			String hostelWing, double hostelFee) {
	    this(rollno,name,collegeName,degree,streem,collegeFee);
		this.hostelWing = hostelWing;
		this.hostelFee = hostelFee;
	}

	public void displayStudentDetails() {
		System.out.println("Rollno :" + rollno);
		System.out.println("Name :" + name);
		System.out.println("CollegeName :" + collegeName);
		System.out.println("Degree :" + degree);
		System.out.println("Streem :" + streem);
		System.out.println("CollegeFee :" + collegeFee);
		System.out.println("HostelWing :" + hostelWing);
		System.out.println("HostelFee :" + hostelFee);
	}

	public static void main(String[] args) {
		// Using constructor whith all mendetory fields
		Students s1 = new Students(03, "Tanvir", "Fabtech", "Bachler of Technology", "Computer Scince And Engineering");
		s1.displayStudentDetails();
		// Using constructor whith all mendetory fields with one non mendatory filds
		Students s2 = new Students(03, "Tanvir", "Fabtech", "Bachler of Technology", "Computer Scince And Engineering",
				45000);
		s2.displayStudentDetails();
		// Using constructor whith all mendetory fields and all non medatory filds
		Students s3 = new Students(03, "Tanvir", "Fabtech", "Bachler of Technology", "Computer Scince And Engineering",
				45000, "B", 20000);
		s3.displayStudentDetails();
	}

}
