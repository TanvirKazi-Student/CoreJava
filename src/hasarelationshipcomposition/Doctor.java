package hasarelationshipcomposition;

import java.util.Scanner;

public class Doctor {
	int doctorId;
	String name;
	String specialization;
	long phono;
	String email;
	int expriance;
	String hospitalName;
	Patient p;

	// Patient p = new Patient(1, "Ramlala", 20, "male", 1232434343,
	// "ramlala@gmail.com", "Pune", "19-06-25");

//	Patient p;
//	{
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter patientId");
//		int patientId = sc.nextInt();
//
//		System.out.println("Enter pname");
//		String paname = sc.next();
//
//		System.out.println("Enter age");
//		int age = sc.nextInt();
//
//		System.out.println("Enter gender");
//		String gender = sc.next();
//
//		System.out.println("Enter mobilno");
//		long mobilno = sc.nextLong();
//
//		System.out.println("Enter email");
//		String email = sc.next();
//
//		System.out.println("Enter address");
//		String pemail = sc.next();
//
//		System.out.println("Enter admissionDate");
//		String admissionDate = sc.next();
//
//		p = new Patient(patientId, paname, age, gender, mobilno, email, pemail, admissionDate);

//	}

	

	public Doctor(int doctorId, String name, String specialization, long phon, String email, int expriance,
			String hospitalName,int patientId, String pname, int age, String gender, long mobilno, String pemail, String addr,
			String admissionDate) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
		this.phono = phon;
		this.email = email;
		this.expriance = expriance;
		this.hospitalName = hospitalName;
		 p = new Patient(expriance, name, doctorId, specialization, expriance, email, email, hospitalName);

	}

	public void diplayDoctor() {
		System.out.println("doctorId" + doctorId);
		System.out.println("name" + name);
		System.out.println("specialization" + specialization);
		System.out.println("phono" + phono);
		System.out.println("email" + email);
		System.out.println("expriance" + expriance);
		System.out.println("hospitalName" + hospitalName);

	}
}
