package com.oops.castingData;

public class MainForCasting {
public static void main(String[] args) {
	
	
	//type matching 
	
	Demo1 demo1=new Demo1();
	Demo2 demo2=new Demo2();
	
	//demo1- super class
	//demo2-subclass
	
	
	//mixmatching
	
	Demo2 ref=(Demo2) new Demo1();
	//Demo1 should be casted to Demo2
	
	Demo1 ref2=(Demo1)new Demo2();
	
	ref2.test();
	demo2.test();
	demo2.display();
//demo2 should be casted to demo1
	
	
	
	
}
}
