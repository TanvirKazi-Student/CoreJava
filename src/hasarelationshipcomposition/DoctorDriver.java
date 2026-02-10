package hasarelationshipcomposition;

public class DoctorDriver {
	public static void main(String[] args) {

		Doctor d = new Doctor(01, "Shamlala", "Skin", 1243658790, "shamlala@gmail.com", 04, "Criticare",1, "Ramlala", 20, "male", 1232434343,
				 "ramlala@gmail.com", "Pune", "19-06-25");
		
		d.diplayDoctor();
		
		d.p.displayPatient();
	}
}
