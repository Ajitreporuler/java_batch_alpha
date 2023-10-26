package com.oops.abstractionExample;

public class Ballpen implements Pen{
String inkColor;
double price;

public Ballpen(String inkColor, double price) {
	super();
	this.inkColor = inkColor;
	this.price = price;
}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("ball pen writing........");
	}

	@Override
	public void refill() {
		System.out.println("ball pen refilling........");
	}

}
