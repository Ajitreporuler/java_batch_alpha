package com.oops.singletondsp;

public class Calculator {
	private static int count = 0;

	private static Calculator calc = null;

	private Calculator() {

		System.out.println("creating calculator instance......");

		count++;
	}

	public void devide(int i, int i2) {

		int rs = i / i2;
		System.out.println("i devided by i2=  " + rs);
		
		System.out.println(count+" instance creation time");

	}

	public static Calculator getInstance() {

		if (count == 0) {
			calc = new Calculator();
		}
		return calc;
	}
}
