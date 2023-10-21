package com.oops.javaAbstractAndInterface;

public class TestImpl implements Test{

	@Override
	public void display() {
		System.out.println("displaying ........");
		
	}
public static void main(String[] args) {
	
	TestImpl testimpl=new TestImpl();
	testimpl.display();
}
}
