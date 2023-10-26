package com.oops.abstractionExample;

public class SketechPen implements Pen{
String inkColor;
double price;

	public SketechPen(String inkColor, double price) {
	super();
	this.inkColor = inkColor;
	this.price = price;
}

	@Override
	public void write() {
		System.out.println("SkethPen Writing.......");
		
	}

	@Override
	public void refill() {
		System.out.println("SkethPen refilling.......");
		
	}

}
