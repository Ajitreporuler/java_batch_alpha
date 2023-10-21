package com.oops.javaAbstractAndInterface;

public class Main {
public static void main(String[] args) {
	//Demo demo=new Demo();
	Demo.disp();
	
	DemoImpl demo=new DemoImpl();
	demo.test();
	
	demo.view();
	
	
	demo.testSub();
}
}
