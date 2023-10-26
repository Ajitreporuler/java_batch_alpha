package com.oops.singletondsp;

public class SingeltonMain {
public static void main(String[] args) {
	Calculator calc=Calculator.getInstance();
	calc.devide(10, 5);
	
	
	
	Calculator calc2=Calculator.getInstance();
	calc2.devide(15, 5);
	
	Calculator calc3=Calculator.getInstance();
	calc3.devide(15, 5);
	
	
}
}
