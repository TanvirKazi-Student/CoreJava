package methodoverriding;

public class Chaild extends Father {
   
	@Override
	public void proparty() {
		System.out.println("Good Father");
	}
	
	public static void main(String[] args) {
		Father f1 = new Chaild();//upcasting 
		f1.proparty();
	}
}
