package com.oops.castingData;

public class MainForCasting {
public static void main(String[] args) {
	
	
	//type matching 
	
	Demo1 demo1=new Demo1();
	Demo2 demo2=new Demo2();
	
	//demo1- super class
	//demo2-subclass
	
	
	//mixmatching
	//down casting
	//Demo2 ref=(Demo2) new Demo1();
	//Demo1 should be casted to Demo2
	
	//upcasting
	Demo1 ref2=new Demo2();//default casting by jvm
	//Demo1 ref3=(Demo1)new Demo2();//explicit casting 
	//downcasting
	Demo2 refDowncasting=(Demo2) ref2;
	refDowncasting.display();
	refDowncasting.test();
//	ref2.test();
//	demo2.test();
//	demo2.display();
//demo2 should be casted to demo1
	
	
	
	
}
}
