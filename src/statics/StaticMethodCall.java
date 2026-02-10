package statics;

import com.mp.ReturnBinaryToDecimal;
import com.mp.ReturnDecimalToBinary;

public class StaticMethodCall {

	public static void main(String[] args) {
		// static method call
		System.out.println(ReturnDecimalToBinary.decimalToBinary(10));
		System.out.println(ReturnBinaryToDecimal.binaryToDecimal(1010));
		StaticWithDefoultValue.test();

	}
}
