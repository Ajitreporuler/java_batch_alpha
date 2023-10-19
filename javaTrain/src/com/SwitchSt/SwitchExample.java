package com.SwitchSt;

public class SwitchExample {

	
	
	public static void result(char grade) {
		
	switch(grade)	{
	
	case 'A' :System.out.println("first class");
	break;
	case 'B' :System.out.println("second class");
	break;
	case 'C' :System.out.println("third class");
	break;
	
	default: System.out.println("invalid grade");
	}
		
		
		
		
	}
	
	public static void main(String[] args) {
	result('B');	
	}
	
	
	
}
