package wrapper;

import com.np.Char;
//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
public class WrapperClasses {

	public static void main(String[] args) {
		
//Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
//where primitive types cannot be used (the list can only store objects):

ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

//creating wrapper object
		
	Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
		
//following methods are used to get the value associated with the corresponding wrapper object

	Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
		
//all the examples of the boxing

		byte b = 10;
		Byte b1 = new Byte(b);
		System.out.println(b1);

		short s = 20;
		Short s1 = new Short(s);
		System.out.println(s1);

		int i = 100;
		Integer i1 = new Integer(i);// boxing
		System.out.println(i1);

		long l = 40000L;
		Long l1 = new Long(l);
		System.out.println(l1);

		float f = 12.34f;
		Float f1 = new Float(l);
		System.out.println(f1);

		double d = 56.79;
		Double d1 = new Double(l);
		System.out.println(d1);

		char c = 'a';
		Character ch = new Character(c);
		System.out.println(ch);

		boolean bs = false;
		Boolean b2 = new Boolean(bs);
		

		// wrapper class unboxing

		Byte byteObj = new Byte((byte) 10);
		byte bu = byteObj.byteValue();
		System.out.println(bu);

		Short shortObj = new Short((short) 20);
		Short su = shortObj.shortValue();
		System.out.println(su);

		Integer intObj = new Integer(40);
		int iu = intObj.intValue();
		System.out.println(iu);

		Long longObj = new Long(400000L);
		long lu = longObj.longValue();
		System.out.println(lu);

		Float floatObj = new Float(22.32f);
		float fu = floatObj.floatValue();
		System.out.println(fu);

		Double doubleObj = new Double(34243.2345);
		double du = doubleObj.doubleValue();
		System.out.println(du);

		Character charObj = new Character('A');
		char cu = charObj.charValue();
		System.out.println(cu);

		Boolean booleanObj = new Boolean(false);
		boolean b = booleanObj.booleanValue();
		System.out.println(b);

		// doing for all primitive types

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2);// compare refarance  F
		System.out.println(i1.equals(i2));// compare data  F
		System.out.println(i1.hashCode());//F
		System.out.println(i2.hashCode());//F

		//Another useful method is the toString() method, which is used to convert wrapper objects to strings.
	Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
	}
}
