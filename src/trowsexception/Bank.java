package trowsexception;

public class Bank implements Cloneable { //implements Cloneable is not write here then throws CloneNotSupportedException  

	public static void main(String[] args) throws CloneNotSupportedException  {
		Bank b1 = new Bank();
		Bank b2 =  (Bank) b1.clone();
		
		System.out.println(b1.equals(b2));//f
	
//		b1.getClass();
//		b1.hashCode();
//		b1.toString();
//		b1.finalize();
//		
//		b1.notify();
//		b1.notifyAll();
//		
//		b1.wait();
//		b1.wait(0);
//		b1.wait(0, 0);
//		
//		b1.notify();
//		b1.notifyAll();
	}
}
