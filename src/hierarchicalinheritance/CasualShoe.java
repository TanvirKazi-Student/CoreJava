package hierarchicalinheritance;

public class CasualShoe extends Shoe{
	 String style;
	 
	 public CasualShoe(String brand, int size, double price, String style) {
	        super(brand, size, price);
	        this.style = style;
	    }
	 
	 public void wear() {
	        System.out.println("Wearing casual shoes in " + style + " style");
	    }

	 public void displayCasualShoeInfo() {
	        displayShoeInfo();
	        System.out.println("Style: " + style);
	        wear();
	        
	    }
}
