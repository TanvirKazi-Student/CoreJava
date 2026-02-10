package object;

public class GetClass {

	public static void main(String[] args) {
    String name = "Tanvir";
    Integer number = 100;
    GetClass obj = new GetClass();
    
    System.out.println(name.getClass());
    System.out.println(number.getClass());
    System.out.println(obj.getClass());
		
	}
}
