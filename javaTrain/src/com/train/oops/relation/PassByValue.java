package com.train.oops.relation;

public class PassByValue {
	static int j=10;
//changing value it should not affect another place
	//changing valuye it should affect other place
	public static void test(int j) {
		j=50;
		System.out.println(j);
	}
	
	
	public static void main(String[] args) {
		
		j=0;
		test(j);
	}
	
}
