package com.oops.abstractionExample;

public class MainPen {
	
	
	
	public static void main(String[] args) {
		Shop s=new Shop("Sapna store..");
		Student student=new Student(123445,"bahubali");
		//Pen p=s.buypen("blue", 20.00, new MarkerPen("blue", 23.00));	
		
		//Pen p=s.buypen("blue", 20.00, new SketechPen("blue", 23.00));	
		Pen p=s.buypen("blue", 20.00, new Ballpen("blue", 23.00));	
		
		student.usePen(p);
	
	}


}
