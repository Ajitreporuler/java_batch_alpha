package com.oops.methodOv;

public class Demo {

	void disp() {
		
		System.out.println("display disp method.....");
	}
	
	
public static void disp(int i) {
		
		System.out.println("display disp method arg....."+i);
	}
	
static void disp(double i) {
	
	System.out.println("display disp method arg double....."+i);
}
void disp(int i,int j) {
	
	System.out.println("display disp method arg.....i "+i +" j "+j);
}

public static void main(String[] args) {
	Demo demo=new Demo();
	
	demo.disp(10,10);
}
}
