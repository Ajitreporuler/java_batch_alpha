package com.oops.abstractionExample;

public class Student {
int id;
String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

void usePen(Pen pen) {
	
	if(pen instanceof Ballpen) {
		System.out.println("writting using  ball pen");
		pen.write();
	}else if(pen instanceof SketechPen) {
		System.out.println("writting using  Sketch pen");
		pen.write();
		
	}else {
		System.out.println("writting using  marker pen");
		pen.write();
	}
	
}

}
