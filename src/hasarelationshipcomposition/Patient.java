package hasarelationshipcomposition;

public class Patient {
	int patientId;
	String pname;
	int age;
	String gender;
	long mobilno;
	String pemail;
	String addr;
	String admissionDate;

	public Patient() {

	}

	public Patient(int patientId, String pname, int age, String gender, long mobilno, String pemail, String addr,
			String admissionDate) {
		this.patientId = patientId;
		this.pname = pname;
		this.age = age;
		this.gender = gender;
		this.mobilno = mobilno;
		this.pemail = pemail;
		this.addr = addr;
		this.admissionDate = admissionDate;
		System.out.println("call Patient");
	}

	public void displayPatient() {
		System.out.println("patientId" + patientId);
		System.out.println("pname" + pname);
		System.out.println("age" + age);
		System.out.println("gender" + gender);
		System.out.println("mobilno" + mobilno);
		System.out.println("pemail" + pemail);
		System.out.println("addr" + addr);
		System.out.println("admissionDate" + admissionDate);

	}

}
