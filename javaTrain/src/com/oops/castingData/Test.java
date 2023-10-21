package com.oops.castingData;

public class Test {
	
void execution(Sample1 sample) {
	
	//sample1-super class
	//sample2-subclass
	//run-subclass
	sample.test();
	System.out.println(sample.i+" i value from sample1");
	//run2 subclass of Sample2 -- upcasting
	if(sample instanceof Sample2) {
		
		Sample2 ref=(Sample2) sample;
		ref.display();
		System.out.println(ref.d+" double value from sample2");
	}
}
}
