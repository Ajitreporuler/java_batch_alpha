package com.train.oops;

public class Pen {
String inkColor;
Double price;
public Pen(String inkColor, Double price) {
	System.out.println("create instance of pen......");
	this.inkColor = inkColor;
	this.price = price;
}

void penDetails() {
	
	System.out.println("pen price: "+price);
	System.out.println("pen ink color:  "+inkColor);
	
}


}
