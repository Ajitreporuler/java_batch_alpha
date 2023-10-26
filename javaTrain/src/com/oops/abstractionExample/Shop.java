package com.oops.abstractionExample;

public class Shop {
String name;

public Shop(String name) {
	super();
	this.name = name;
}

Pen buypen(String color,double price,Pen pen){
	
	Pen p=null;
	if(pen instanceof MarkerPen) {
	p=new MarkerPen(color, price);
	}else if(pen instanceof SketechPen) {
		
		
		p=new SketechPen(color, price);
	}else {
		p=new Ballpen(color, price);
	}
	return p;
	
}

}
