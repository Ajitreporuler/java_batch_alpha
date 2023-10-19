package com.javaMethods;

public class exampleWithoutArgument {

	
	//static
	
	//non-static
	public static void test() {
		
		System.out.println("Hi test............");
	}
	
	
	public void test(int i) {
		System.out.println(".........");
	}
	
	public static void main(String[] args) {
		exampleWithoutArgument.test();
		
		exampleWithoutArgument rv=new exampleWithoutArgument();
		rv.test(10);
	}
	
	
	
	
}
