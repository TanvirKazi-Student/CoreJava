package com.mp;

public class NotCallMainEveryMethod {
	public static void main(String[] args) {
		convertCentimiterTomiter(1);
	}

	public static void convertCentimiterTomiter(double cent) {
		double meter = cent / 100;
		System.out.println(meter);
		convertMeterToInch(meter);

	}

	public static void convertMeterToInch(double meter) {
		double inch = meter * 39.37;
		System.out.println(inch);
		convertInchToFoot(inch);
	}

	public static void convertInchToFoot(double inch) {
		double Foot = inch / 12;
		System.out.println(Foot);
	}
}
