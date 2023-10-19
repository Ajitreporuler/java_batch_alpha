package com.train.oops;

public class SampleMain {
public static void main(String[] args) {
	Sample sample=new Sample();
	Sample sample1=new Sample();
	Sample sample2=new Sample();
	Sample sample3=new Sample();
	System.out.println(sample.i+" data member of sample class");
	sample.test();
	sample1.test();
	sample2.test();
	sample3.test();
	SampleCons rf=new SampleCons();
	
}
}
