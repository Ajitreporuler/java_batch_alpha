package com.oops.abstractionExample;

public class MarkerPen implements Pen{
String inkColor;
double price;
public MarkerPen(String inkColor, double price) {
	super();
	this.inkColor = inkColor;
	this.price = price;
}
@Override
public void write() {
	System.out.println("MarkerPen writing.......");
	
}
@Override
public void refill() {
	System.out.println("MarkerPen rifiling........");
	
}

}
