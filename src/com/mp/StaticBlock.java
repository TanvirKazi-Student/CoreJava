package com.mp;

public class StaticBlock {
	static double d;
	static {
		System.out.println("static block start");
		d = test(100);
		System.out.println(d);//10000
		d = test(d) + demo((int) d);
		System.out.println(d);//1.0001EB
		double d = demo((int) test(StaticBlock.d));
		System.out.println("local varible" + d);//65535.0
		System.out.println("end static block");
	}

	public static void main(String[] args) {
		System.out.println("main start");//main start
		System.out.println(d);//1.0001EB

		System.out.println(test(d));//1.00020001e16
		System.out.println((int) demo((int) d));//2064
		System.out.println("main end");//main end
	}

	public static double test(double num) {
		return num * num;

	}

	static char demo(int num){
		return (char) num;
	}
}